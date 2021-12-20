package com.spring.rest.curd.dao;

import java.util.List;

import com.spring.rest.curd.model.Class1;


public interface ClassDao {
	
public String addClass(Class1 class1);
	
	public List<Class1> getClass(String classname);

	
}
