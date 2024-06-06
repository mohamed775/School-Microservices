package com.app.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.School;
import com.app.repository.SchoolRepo;
import com.app.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {

	private SchoolRepo schoolRepo;
	
	@Override
	public void addSchool(School school) {
		schoolRepo.save(school);
	}

	@Override
	public List<School> findAllSchool() {
		return schoolRepo.findAll();
	}

}
