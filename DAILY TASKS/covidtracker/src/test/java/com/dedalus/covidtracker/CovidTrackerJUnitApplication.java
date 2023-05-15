package com.dedalus.covidtracker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dedalus.covidtracker.repository.UserPwdRepository;
import com.dedalus.covidtracker.entity.UserPwd;


@SpringBootTest
public class CovidTrackerJUnitApplication {

	@Autowired
	UserPwdRepository userPwdRepository;

	@Test
	public void testCreateUser() {
		long userid = 2;

		UserPwd setUP = new UserPwd();

		setUP.setUserid(userid);
		setUP.setUsername("venkat");
		setUP.setPass("pass");
		setUP.setRole("admin");
		
		System.out.println(setUP);
	
		assertEquals(userPwdRepository.save(setUP), userPwdRepository.findByusername("venkat"));
		
	}

}
