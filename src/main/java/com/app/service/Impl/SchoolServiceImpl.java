package com.app.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.fullSchoolResponce;
import com.app.model.School;
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
	
	@Override
    public fullSchoolResponce findSchoolsWithStudents(Integer schoolId) {
	        var school = schoolRepo.findById(schoolId)
	                .orElse(
	                        School.builder()
	                                .name("NOT_FOUND")
	                                .email("NOT_FOUND")
	                                .build()
	                );
	        var students = client.findAllStudentsBySchool(schoolId);
	        return fullSchoolResponce.builder()
	                .name(school.getName())
	                .email(school.getEmail())
	                .students(students)
	                .build();
	    }

}
