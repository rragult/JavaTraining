package com.dedalus.covidtracker.service;

import java.util.List;

import com.dedalus.covidtracker.dto.StateStats;

public interface CovidStatsService {
	List<StateStats> getStatewiseStats(String countryCode);
}
