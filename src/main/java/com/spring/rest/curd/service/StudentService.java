package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.StudentDao;
import com.spring.rest.curd.dto.ClassResponse;
import com.spring.rest.curd.dto.StudentResponse;
import com.spring.rest.curd.model.Class1;
import com.spring.rest.curd.model.Student;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	
	public StudentResponse pay(Student student) {
		StudentResponse response = new StudentResponse();

		System.out.println("inside service");
		
		
		long regno = (long)student.getRegno();
		List<Student> student2 = dao.getStudent(regno);
        if(!student2.isEmpty()) {
        	response.setStatus("Failed");
    		response.setMessage("student already exist wiht this registration number");
    		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
            	
        }else {
		student.setCreatStudentDate(new Date());
		String message = dao.addStudent(student);
		response.setStatus("success");
		response.setMessage(message);
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
        }
		return response;
	}

	public StudentResponse getTx(long regno) {
		StudentResponse response = new StudentResponse();
		List<Student> student = dao.getStudent(regno);
		response.setStatus("succes");
		response.setStudent(student);
		return response;
	}




}
