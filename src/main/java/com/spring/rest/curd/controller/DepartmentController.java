package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.curd.dto.DepartmentResponse;
import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.service.DepartmentService;

@RestController

public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
      
	@PostMapping("/AddDepartment")
	public DepartmentResponse payInstant(@RequestBody Department department) {
	      System.out.println("inside class");

		return service.pay(department);
	}

	@GetMapping("/getDetailsByDepartmentName/{depname}")
	public DepartmentResponse getTransaction(@PathVariable String depname) {
		return service.getTx(depname);
	}

}
