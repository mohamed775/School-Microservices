package com.app.dto;

import java.util.List;

import com.app.model.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class fullSchoolResponce {

	private String name;
    private String email;
    List<Student> students;
	
}
