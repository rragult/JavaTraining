package com.dedalus.covidtracker.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StateStats implements Serializable{
	private String statecode;
	private String statename;
	private String counttype;
	private Long count;
	
	@SuppressWarnings("unchecked")
	public static List<StateStats> map(Map<String,Object> out,int resultSetPosition)
	{
		List<StateStats> _stats = new ArrayList<StateStats>();
		List<Map<String, Object>> results = (List<Map<String, Object>>) out.get("#result-set-" + resultSetPosition);
		
		results.forEach(u -> {
			StateStats _stat = new StateStats();
			_stat.setStatecode((String)u.get("statecode"));
			_stat.setStatename((String)u.get("statename"));
			_stat.setCounttype((String)u.get("counttype"));
			_stat.setCount((Long)u.get("count"));
			_stats.add(_stat);
		    });
		
		return _stats;
	}
}
