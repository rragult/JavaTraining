DROP TABLE country;
CREATE TABLE country (
countrycode     VARCHAR2(2)   NOT NULL, 
countryname     VARCHAR2(20)   NOT NULL, 
activeind     CHAR(1)   NOT NULL,
CONSTRAINT PHLT_pk_country PRIMARY KEY( countrycode)); 


-- countrycode -- 'IN', 'AU'
TRUNCATE TABLE country;
INSERT INTO country VALUES ('IN','India', 'Y');
INSERT INTO country VALUES ('AU','Australia', 'N');

DROP TABLE states;
CREATE TABLE states ( 
statecode     VARCHAR2(2)   NOT NULL, 
statename     VARCHAR2(20)   NOT NULL, 
countrycode     VARCHAR2(2)   NOT NULL,
activeind     CHAR(1)   NOT NULL,
CONSTRAINT PHLT_pk_states PRIMARY KEY( statecode));


-- countrycode -- 'IN', 'AU'
-- statecodeode -- 'TN','DL'
TRUNCATE TABLE states;
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','AN','Andaman and Nicobar Islands', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','AP','Andhra Pradesh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','AR','Arunachal Pradesh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','AS','Assam', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','BR','Bihar', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','CH','Chandigarh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','CT','Chhattisgarh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','DN','Dadra and Nagar Haveli', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','DD','Daman and Diu', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','DL','Delhi', 'Y');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','GA','Goa', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','GJ','Gujarat', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','HR','Haryana', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','HP','Himachal Pradesh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','JK','Jammu and Kashmir', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','JH','Jharkhand', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','KA','Karnataka', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','KL','Kerala', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','LD','Lakshadweep', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','MP','Madhya Pradesh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','MH','Maharashtra', 'Y');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','MN','Manipur', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','ML','Meghalaya', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','MZ','Mizoram', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','NL','Nagaland', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','OR','Odisha', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','PY','Puducherry', 'Y');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','PB','Punjab', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','RJ','Rajasthan', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','SK','Sikkim', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','TN','Tamil Nadu', 'Y');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','TG','Telangana', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','TR','Tripura', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','UP','Uttar Pradesh', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','UT','Uttarakhand', 'N');
INSERT INTO States(countrycode, statecode,statename,activeind) VALUES ('IN','WB','West Bengal', 'Y');



DROP TABLE healthcare ;

CREATE TABLE healthcare (
hccode     VARCHAR2(3)   NOT NULL, 
hcname     VARCHAR2(100)   NOT NULL, 
statecode     VARCHAR2(2)   NOT NULL, 
activeind     CHAR(1)   NOT NULL,
CONSTRAINT PHLT_pk_healthcare PRIMARY KEY( hccode,statecode ));

truncate TABLE healthcare;
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('PHC','Primary Health Centres', 'Y','DL');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('CHC','Community Health Centres', 'Y','MH');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('SDH','Sub-District Hospitals/Taluk Hospitals', 'Y','PY');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('DIH','District Hospitals', 'Y','TN');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('MCR','Medical Colleges and Research Institutions', 'Y','WB');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('PHC','Primary Health Centres', 'Y','MH');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('CHC','Community Health Centres', 'Y','PY');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('SDH','Sub-District Hospitals/Taluk Hospitals', 'Y','TN');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('DIH','District Hospitals', 'Y','WB');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('MCR','Medical Colleges and Research Institutions', 'Y','DL');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('PHC','Primary Health Centres', 'Y','PY');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('CHC','Community Health Centres', 'Y','TN');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('SDH','Sub-District Hospitals/Taluk Hospitals', 'Y','WB');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('DIH','District Hospitals', 'Y','DL');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('MCR','Medical Colleges and Research Institutions', 'Y','MH');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('PHC','Primary Health Centres', 'Y','TN');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('CHC','Community Health Centres', 'Y','WB');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('SDH','Sub-District Hospitals/Taluk Hospitals', 'Y','DL');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('DIH','District Hospitals', 'Y','MH');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('MCR','Medical Colleges and Research Institutions', 'Y','PY');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('PHC','Primary Health Centres', 'Y','WB');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('CHC','Community Health Centres', 'Y','DL');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('SDH','Sub-District Hospitals/Taluk Hospitals', 'Y','MH');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('DIH','District Hospitals', 'Y','PY');
INSERT INTO healthcare (hccode,hcname,activeind,statecode) VALUES ('MCR','Medical Colleges and Research Institutions', 'Y','TN');


DROP TABLE labmaster;

CREATE TABLE labmaster (
labmasterid     NUMBER(5)   NOT NULL, 
labmastercode   VARCHAR2(10)   NOT NULL, 
labmastername   VARCHAR2(100)   NOT NULL,
activeind    CHAR(1) NOT NULL,
CONSTRAINT PHLT_pk_labmaster PRIMARY KEY( labmasterid));

TRUNCATE TABLE labmaster;
INSERT INTO labmaster (labmasterid, labmastercode, labmastername, activeind) VALUES (1,'RT-PCR','Reverse Transcription-Polymerase Chain Reaction','Y');
INSERT INTO labmaster (labmasterid, labmastercode, labmastername, activeind) VALUES (2,'RTA','Rapid test antigen','Y');


DROP TABLE patient;
CREATE TABLE patient (
patientid     NUMBER(5)   NOT NULL,
patientfirstname     VARCHAR2(20)   NOT NULL,
patientlastname     VARCHAR2(20)   NOT NULL,
patientdob     DATE   NOT NULL,
patientgender     VARCHAR2(1)   NOT NULL,
patientcontactno     VARCHAR2(20)   NOT NULL,
patientemailid     VARCHAR2(20)   NOT NULL,
aadhaarno	varchar(20)	NOT NULL,
patientstatuscode     VARCHAR2(10)   NOT NULL,
patientaddr1     VARCHAR2(20)   NOT NULL,
patientaddr2     VARCHAR2(20)   NOT NULL,
statecode     VARCHAR2(2)   NOT NULL,
postalcode     NUMBER(10)   NOT NULL,
activeind  char(1)  NOT NULL,
CONSTRAINT PHLT_pk_patient PRIMARY KEY( patientid));


-- PatientStatus  -- 'ACTIVE', 'DECEASED'
-- PatientGender  -- 'M','F'
-- StatCode -- 'TN','DL'
TRUNCATE TABLE patient;
INSERT INTO patient (patientid, patientfirstname , patientlastname ,patientdob,patientgender,patientcontactno ,patientemailid,aadhaarno,patientstatuscode,patientaddr1 ,patientaddr2 ,statecode ,postalcode,activeind) values (1,'Rama','Prabha',TO_DATE('1979-12-09','YYYY-MM-DD'),'F','9999999999','x@dedalus.com','312345678987','ACTIVE','10 Subranagar','Kodambakkam','TN','600024','A');
INSERT INTO patient (patientid, patientfirstname , patientlastname ,patientdob,patientgender,patientcontactno ,patientemailid,aadhaarno,patientstatuscode,patientaddr1 ,patientaddr2 ,statecode ,postalcode,activeind) values (2,'Viswa','Suraj',TO_DATE('1989-8-19','YYYY-MM-DD'),'M','9888888888','y@dedalus.com','222345633987','ACTIVE','22 Indiranagar','Anna Main Road','TN','600002','A');
INSERT INTO patient (patientid, patientfirstname , patientlastname ,patientdob,patientgender,patientcontactno ,patientemailid,aadhaarno,patientstatuscode,patientaddr1 ,patientaddr2 ,statecode ,postalcode,activeind) values (3,'Sankari','Kannan',TO_DATE('1999-5-29','YYYY-MM-DD'),'F','9777777777','s@dedalus.com','654345678987','ACTIVE','1/2 srinagar','saidapet','TN','600015','A');
INSERT INTO patient (patientid, patientfirstname , patientlastname ,patientdob,patientgender,patientcontactno ,patientemailid,aadhaarno,patientstatuscode,patientaddr1 ,patientaddr2 ,statecode ,postalcode,activeind) values (4,'Gautham','Raman',TO_DATE('2009-6-22','YYYY-MM-DD'),'M','9999999999','adc@dedalus.com','123456744446','ACTIVE','10 Subranagar','Kodambakkam','TN','600024','A');


DROP TABLE patienthcmapping;

CREATE TABLE patienthcmapping (
patienthcid     NUMBER(5)   NOT NULL, 
patientid     NUMBER(5)   NOT NULL, 
hccode     VARCHAR2(3)   NOT NULL, 
encounterdt     DATE   NOT NULL,
CONSTRAINT PHLT_pk_patienthcmapping PRIMARY KEY( patienthcid));

TRUNCATE TABLE patienthcmapping;
INSERT INTO patienthcmapping (patienthcid, patientid,hccode, encounterdt) VALUES (1,1,'PHC',TO_DATE('2023-5-1','YYYY-MM-DD'));
INSERT INTO patienthcmapping (patienthcid, patientid,hccode, encounterdt) VALUES (2,2,'CHC',TO_DATE('2023-5-2','YYYY-MM-DD'));
INSERT INTO patienthcmapping (patienthcid, patientid,hccode, encounterdt) VALUES (3,3,'MCR',TO_DATE('2023-5-3','YYYY-MM-DD'));



DROP TABLE patienthclablist;

CREATE TABLE patienthclablist(
pathclabid NUMBER(5) NOT NULL,
patienthcid NUMBER(5) NOT NULL,
labmasterid NUMBER(5) NOT NULL,
dateoftestgiven DATE NOT NULL,
labtestoutcome CHAR(1) NULL,
dateoftestresult  DATE NULL,
dateofadmission     DATE   NULL, 
dateofdischarge     DATE   NULL, 
dateofdeceased     DATE   NULL,
CONSTRAINT PHLT_pk_patienthclablist PRIMARY KEY( pathclabid ));

TRUNCATE TABLE patienthclablist;
INSERT INTO patienthclablist (pathclabid,patienthcid,labmasterid,dateoftestgiven) values (1,1,1,TO_DATE('2023-5-1','YYYY-MM-DD'));
INSERT INTO patienthclablist (pathclabid,patienthcid,labmasterid,dateoftestgiven) values (2,2,1,TO_DATE('2023-5-2','YYYY-MM-DD'));
INSERT INTO patienthclablist (pathclabid,patienthcid,labmasterid,dateoftestgiven) values (3,3,1,TO_DATE('2023-5-3','YYYY-MM-DD'));


DROP TABLE user_pwd

CREATE TABLE  user_pwd 
(
userid varchar(10),
pass varchar(10),
role varchar(10),
username varchar(10)
)
truncate table user_pwd;
INSERT INTO   user_pwd (userid, pass, role, username) values (1,'pass','admin','nandini');

