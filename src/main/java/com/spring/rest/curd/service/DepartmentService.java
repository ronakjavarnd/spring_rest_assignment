package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.DepartmentDao;
import com.spring.rest.curd.dto.DepartmentResponse;
import com.spring.rest.curd.model.Department;

@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentDao dao;

	public DepartmentResponse pay(Department department) {
		DepartmentResponse response = new DepartmentResponse();

		String depname = (String)department.getDepname();
		List<Department> departments = dao.getDepartment(depname);
        if(!departments.isEmpty()) {
        	response.setStatus("Failed");
    		response.setMessage("Deaprtment already exist");
    		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
            	
        }else {
		department.setCreatDepartmentDate(new Date());
		String message = dao.addDepartment(department);
		response.setStatus("success");
		response.setMessage(message);
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
        }
		return response;
	}

	public DepartmentResponse getTx(String depname) {
		DepartmentResponse response = new DepartmentResponse();
		List<Department> departments = dao.getDepartment(depname);
		response.setStatus("succes");
		response.setDepartments(departments);
		return response;
	}

}
