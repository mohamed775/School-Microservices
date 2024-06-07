package com.app.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.model.Student;

@FeignClient(name = "student-service")
public interface StudentClient {

	  @GetMapping("/api/v1/students/school/{schoolId}")
	  List<Student> getStudentsBySchoolId(@PathVariable("schoolId") Long schoolId);
}
