package com.dedalus.covidtracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.covidtracker.entity.UserPwd;


@Repository
public interface UserPwdRepository extends CrudRepository<UserPwd, Long> {
	public UserPwd findByusername(String username);
}
