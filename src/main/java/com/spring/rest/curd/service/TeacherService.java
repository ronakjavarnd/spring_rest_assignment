package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.DepartmentDao;
import com.spring.rest.curd.dao.TeacherDao;
import com.spring.rest.curd.dto.DepartmentResponse;
import com.spring.rest.curd.dto.TeacherResponse;
import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Teacher;

@Service
@Transactional
public class TeacherService {
	
	@Autowired
	private TeacherDao dao;


	public TeacherResponse pay(Teacher teacher) {
		System.out.println("inside service");
		teacher.setCreatTeacherDate(new Date());
		String message = dao.addTeacher(teacher);
		TeacherResponse response = new TeacherResponse();
		response.setStatus("success");
		response.setMessage(message);
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
		return response;
	}

	public TeacherResponse getTx(String title) {
		TeacherResponse response = new TeacherResponse();
		List<Teacher> teachers = dao.getTeacher(title);
		response.setStatus("succes");
		response.setTeachers(teachers);
		return response;
	}

	
}
