package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepo;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public void addStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public List<Student> findAllStudentsBySchool(Integer schoolId) {
		return studentRepo.findAllBySchoolId(schoolId) ;
	}
 
	
	
}
