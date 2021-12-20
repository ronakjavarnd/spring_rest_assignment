package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Class_Table")
public class Class1 implements Serializable {
	
	private static final long serialVersionUID = 4501753715497967062L;
	@Id
	@GeneratedValue
	private long classid;
	private String classname;
	private Date CreatClassDate;

	public long getClassid() {
		return classid;
	}
	public void setClassid(long classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	public Date getCreatClassDate() {
		return CreatClassDate;
	}
	public void setCreatClassDate(Date creatClassDate) {
		CreatClassDate = creatClassDate;
	}
	
	
	@Override
	public String toString() {
		return "Class1 [classid=" + classid + ", classname=" + classname + ", CreatClassDate=" + CreatClassDate + "]";
	}
	
	public Class1(long classid, String classname, Date creatClassDate) {
		super();
		this.classid = classid;
		this.classname = classname;
		CreatClassDate = creatClassDate;
	}
	
	
	

	
	
}
