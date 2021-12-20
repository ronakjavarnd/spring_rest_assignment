package com.spring.rest.curd.dao;

import java.util.List;

import com.spring.rest.curd.model.Department;

public interface DepartmentDao {
	
	public String addDepartment(Department department);
	
	public List<Department> getDepartment(String depname);

}
