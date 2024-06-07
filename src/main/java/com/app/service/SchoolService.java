package com.app.service;

import java.util.List;

import com.app.model.School;
import com.app.model.Student;

public interface SchoolService {

	void addSchool(School school);
	
	List<School> findAllSchool();
	
	List<Student> getStudentsBySchoolId(Long schoolId);
	
//	fullSchoolResponce findSchoolsWithStudents(Integer schoolId);
	
}
