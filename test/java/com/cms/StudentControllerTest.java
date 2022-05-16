package com.cms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.cms.controller.StudentController;
import com.cms.model.Student;
import com.cms.service.StudentLoginService;

public class StudentControllerTest {
	
	@InjectMocks
	private StudentController studentController;
	
	@Mock
	private StudentLoginService repo;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void studentLoginTest() {
		Student student = new Student(
				"tulasi",
				"123",
				"Tulasi",
				"12345",
				"ECE",
				"2021",
				"123");
		
		when(repo.getStudentByStudent(student.getSusername())).thenReturn(student);
		assertThat(studentController.studentLogin(student)).isEqualTo(ResponseEntity.ok(student));
	}
}
