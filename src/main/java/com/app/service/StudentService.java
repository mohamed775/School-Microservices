package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {

	void addStudent(Student student );
	
	List<Student> findAllStudent();
	
	List<Student> findAllStudentsBySchool(Integer schoolId );
}
