package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.curd.dto.DepartmentResponse;
import com.spring.rest.curd.dto.TeacherResponse;
import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Teacher;
import com.spring.rest.curd.service.DepartmentService;
import com.spring.rest.curd.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService service;
	
      
	@PostMapping("/AddTeacher")
	public TeacherResponse payInstant(@RequestBody Teacher teacher) {
	      System.out.println("inside class");

		return service.pay(teacher);
	}

	@GetMapping("/getDetailsByTeacherTitle/{title}")
	public TeacherResponse getTransaction(@PathVariable String title) {
		return service.getTx(title);
	}

	
}
