package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Table")


public class Student  implements Serializable{
	
	private static final long serialVersionUID = 4501753715497967062L;

	@Id
	private long regno;
	private String classname;
	private String studentname;
	private Date CreatStudentDate;
	public long getRegno() {
		return regno;
	}
	public void setRegno(long regno) {
		this.regno = regno;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Date getCreatStudentDate() {
		return CreatStudentDate;
	}
	public void setCreatStudentDate(Date creatStudentDate) {
		CreatStudentDate = creatStudentDate;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", classname=" + classname + ", studentname=" + studentname
				+ ", CreatStudentDate=" + CreatStudentDate + "]";
	}
	public Student(long regno, String classname, String studentname, Date creatStudentDate) {
		super();
		this.regno = regno;
		this.classname = classname;
		this.studentname = studentname;
		CreatStudentDate = creatStudentDate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	

}
