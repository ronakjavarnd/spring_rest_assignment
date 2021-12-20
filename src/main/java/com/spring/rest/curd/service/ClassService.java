package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.ClassDao;
import com.spring.rest.curd.dto.ClassResponse;
import com.spring.rest.curd.model.Class1;

@Service
@Transactional
public class ClassService {

	@Autowired
	private ClassDao dao;

	
	public ClassResponse pay(Class1 class1) {
		ClassResponse response = new ClassResponse();

		System.out.println("inside service");
		
		
		String classname = (String)class1.getClassname();
		List<Class1> class2 = dao.getClass(classname);
        if(!class2.isEmpty()) {
        	response.setStatus("Failed");
    		response.setMessage("Class already exist");
    		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
            	
        }else {
		class1.setCreatClassDate(new Date());
		String message = dao.addClass(class1);
		response.setStatus("success");
		response.setMessage(message);
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
        }
		return response;
	}

	public ClassResponse getTx(String classname) {
		ClassResponse response = new ClassResponse();
		List<Class1> class1 = dao.getClass(classname);
		response.setStatus("succes");
		response.setClass1(class1);
		return response;
	}


	
}
