package com.app.service;

import java.util.List;

import com.app.dto.fullSchoolResponce;
import com.app.model.School;

public interface SchoolService {

	void addSchool(School school);
	
	List<School> findAllSchool();
	
	fullSchoolResponce findSchoolsWithStudents(Integer schoolId);
	
}
