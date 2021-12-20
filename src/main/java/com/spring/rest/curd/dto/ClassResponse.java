package com.spring.rest.curd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.spring.rest.curd.model.Class1;
import com.spring.rest.curd.model.Teacher;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ClassResponse {
	private String status;
	private String message;
	private String txDate;
	private List<Class1> class1;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}
	public List<Class1> getClass1() {
		return class1;
	}
	public void setClass1(List<Class1> class1) {
		this.class1 = class1;
	}
	
    
	

}
