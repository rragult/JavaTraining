//package com.dedalus.covidtracker.dto;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import org.springframework.jdbc.core.RowMapper;
//
//import com.dedalus.covidtracker.dto.StateStats;
//
//public class StateStatsRowMapper implements RowMapper<StateStats>{
//
//	@Override
//	public StateStats mapRow(ResultSet rs, int rowNum) throws SQLException {
//		StateStats stateStats = new StateStats();
//		stateStats.setStatecode(rs.getString(rowNum));
//		return null;
//	}
//	
//}
