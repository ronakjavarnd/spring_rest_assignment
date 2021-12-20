package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.curd.dto.ClassResponse;
import com.spring.rest.curd.dto.DepartmentResponse;
import com.spring.rest.curd.dto.TeacherResponse;
import com.spring.rest.curd.model.Class1;
import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Teacher;
import com.spring.rest.curd.service.ClassService;
import com.spring.rest.curd.service.DepartmentService;
import com.spring.rest.curd.service.TeacherService;

@RestController
public class ClassController {

	@Autowired
	private ClassService service;
	
      
	@PostMapping("/AddClass")
	public ClassResponse addClass(@RequestBody Class1 class1) {

		return service.pay(class1);
	}

	@GetMapping("/getclassByName/{classname}")
	public ClassResponse getClass(@PathVariable String classname) {
		return service.getTx(classname);
	}

	
}
