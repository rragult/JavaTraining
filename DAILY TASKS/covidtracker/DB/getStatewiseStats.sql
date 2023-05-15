-- Temporary table for storing Covid statistics data
create table covidstats(
    statecode varchar2(64),
    statename varchar2(128),
    counttype varchar2(32),
    count number
)

drop table covidstats;

desc PATIENTHCLABLIST
desc HEALTHCARE

--SP starts here
drop PROCEDURE getStatewiseStats;
CREATE OR REPLACE PROCEDURE getStatewiseStats(p_countrycode IN VARCHAR2,statscur out SYS_REFCURSOR) 
AS
    currentdate DATE:=SYSDATE;
    
BEGIN	
    execute immediate 'TRUNCATE TABLE covidstats';
    
    insert into covidstats
    SELECT 
        S.StateCode AS "statecode", S.StateName AS "statename",'Active' As counttype, count(*) AS "count"
    FROM
        PATIENTHCLABLIST T
        INNER JOIN PatientHCMapping M
            ON T.PATIENTHCID=M.PATIENTHCID
        INNER JOIN HealthCare HC
            ON HC.HCCODE=M.HCCode
        INNER JOIN States S
            ON S.StateCode=HC.StateCode
    WHERE
        --T.ActiveInd='Y' AND M.ActiveInd='Y' AND 
		HC.ActiveInd='Y' AND S.ActiveInd='Y' AND T.LabTestOutcome='P' AND S.CountryCode=p_countrycode
        AND T.DateOfDeceased is null and ((T.DateOfDischarge is null) or (T.DateOfDischarge is not null and T.DateOfDischarge>=currentdate))
    GROUP BY
        S.StateCode,S.StateName, 'Active';
    
    insert into covidstats
    SELECT 
        S.StateCode AS "statecode", S.StateName AS "statename", 'Recovered' As counttype, count(*) AS "count"
    FROM
        PATIENTHCLABLIST T
        INNER JOIN PatientHCMapping M
            ON T.PATIENTHCID=M.PATIENTHCID
        INNER JOIN HealthCare HC
            ON HC.HCCODE=M.HCCode
        INNER JOIN States S
            ON S.StateCode=HC.StateCode
    WHERE
        --T.ActiveInd='Y' AND M.ActiveInd='Y' AND 
		HC.ActiveInd='Y' AND S.ActiveInd='Y' AND T.LabTestOutcome='P' AND S.CountryCode=p_countrycode
        AND T.DateOfDeceased is null and ((T.DateOfDischarge is not null and T.DateOfDischarge<currentdate))
    GROUP BY
        S.StateCode,S.StateName, 'Recovered';
    
    insert into covidstats    
    SELECT 
        S.StateCode AS "statecode", S.StateName AS "statename", 'Deceased' As counttype, count(*) AS "count"
    FROM
        PATIENTHCLABLIST T
        INNER JOIN PatientHCMapping M
            ON T.PATIENTHCID=M.PATIENTHCID
        INNER JOIN HealthCare HC
            ON HC.HCCODE=M.HCCode
        INNER JOIN States S
            ON S.StateCode=HC.StateCode
    WHERE
        --T.ActiveInd='Y' AND M.ActiveInd='Y' AND 
		HC.ActiveInd='Y' AND S.ActiveInd='Y' AND T.LabTestOutcome='P' AND S.CountryCode=p_countrycode
        AND T.DateOfDeceased is not null
    GROUP BY
        S.StateCode,S.StateName, 'Deceased';
   commit;
   OPEN statscur FOR SELECT * FROM covidstats order by statecode;
   /*
   
    loop
    fetch data into data1;
    exit when data%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE(data1.statecode);
    end loop;
    */
END getStatewiseStats;
/
--SP ends here

--SP testing - starts here
set serveroutput on size 30000;
SET SERVEROUTPUT ON;
 
  DECLARE
    cur SYS_REFCURSOR;
    stcode varchar2(128);
    stname varchar2(128);
    counttype  varchar2(32);
    count1 number;
  BEGIN
    -- Get employees list
    getStatewiseStats(p_countrycode => 'IN', statscur => cur);
 
    -- Output the records  
    LOOP 
      FETCH cur INTO stcode, stname, counttype, count1;
      EXIT WHEN cur%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE(count1 || ', ' || stname || ', ' || count1);
    END LOOP;
    CLOSE cur;
  END;
  /
 --SP testing - ends here 
select * from covidstats order by 1,3 



COMMIT