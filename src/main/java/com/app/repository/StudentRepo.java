package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findAllBySchoolId(Integer schoolId);
	
}
