package com.dedalus.covidtracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.covidtracker.dto.StateStats;
import com.dedalus.covidtracker.service.CovidStatsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/covidstats")
public class CovidStatsController {
	private CovidStatsService covidStatsService;
	@GetMapping("{id}")
	public ResponseEntity<?> getStatewiseStatsByCountryCode(@PathVariable("id") String countrycode)
	{
		List<StateStats> _stats = covidStatsService.getStatewiseStats(countrycode);
		return new ResponseEntity<>(_stats,HttpStatus.OK);
	}
}
