package com.dedalus.covidtracker.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import com.dedalus.covidtracker.dto.StateStats;
import com.dedalus.covidtracker.helper.DBHelper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CovidStatsServiceImpl implements CovidStatsService {	
	@Override
	public List<StateStats> getStatewiseStats(String countryCode) {
		SimpleJdbcCall actor = new SimpleJdbcCall(DBHelper.getDataSource()).withProcedureName("getStatewiseStats");		
		SqlParameterSource params = new MapSqlParameterSource().addValue("p_countrycode", countryCode);		    
		Map<String, Object> out = actor.execute(params);
		
		return StateStats.map(out, 1);
	}

}
