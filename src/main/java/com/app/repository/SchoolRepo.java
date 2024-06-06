package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {

	
	
}
