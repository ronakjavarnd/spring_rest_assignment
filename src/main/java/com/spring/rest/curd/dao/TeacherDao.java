package com.spring.rest.curd.dao;

import java.util.List;

import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Teacher;

public interface TeacherDao {
public String addTeacher(Teacher teacher);
	
	public List<Teacher> getTeacher(String tilte);

}
