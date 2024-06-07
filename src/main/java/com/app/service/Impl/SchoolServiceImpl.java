package com.app.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.School;
import com.app.model.Student;
import com.app.repository.SchoolRepo;
import com.app.service.SchoolService;
import com.app.service.StudentClient;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SchoolServiceImpl implements SchoolService {

	private final SchoolRepo schoolRepo;
	
    private final StudentClient client;
 
	
	
	@Override
	public void addSchool(School school) {
		schoolRepo.save(school);
	}

	@Override
	public List<School> findAllSchool() {
		return schoolRepo.findAll();
	}
	
	public List<Student> getStudentsBySchoolId(Long schoolId) {
        return client.getStudentsBySchoolId(schoolId);
    }

}
