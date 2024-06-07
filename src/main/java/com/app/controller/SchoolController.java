package com.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.app.model.School;
import com.app.model.Student;
import com.app.service.SchoolService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

	
	
	private final SchoolService schoolService ;
	
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school) {
		schoolService.addSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(schoolService.findAllSchool());
    }
    
    @GetMapping("/school/{schoolId}/students")
    public List<Student> getStudents(@PathVariable Long schoolId) {
        return schoolService.getStudentsBySchoolId(schoolId);
    }
//    @GetMapping("/with-students/{school-id}")
//    public ResponseEntity<fullSchoolResponce> findAllStudentsBySchoolId(@PathVariable("school-id") Integer schoolId) {
//        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
//    }
}
