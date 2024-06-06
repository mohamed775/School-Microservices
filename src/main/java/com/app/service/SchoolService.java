package com.app.service;

import java.util.List;

import com.app.model.School;

public interface SchoolService {

	void addSchool(School school);
	
	List<School> findAllSchool();
	
}
