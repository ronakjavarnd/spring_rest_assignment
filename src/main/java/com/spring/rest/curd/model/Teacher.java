package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher_Table")
public class Teacher implements Serializable{
	
	private static final long serialVersionUID = 4501753715497967062L;

	@Id
	private String title;
    private long classid;
	private String name;
	private String gender;
	private String age;
	private String address;
	private String salary;
	private String department;
	private Date CreatTeacherDate;
	
	public Teacher( ) {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getClassid() {
		return classid;
	}

	public void setClassid(long classid) {
		this.classid = classid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getCreatTeacherDate() {
		return CreatTeacherDate;
	}

	public void setCreatTeacherDate(Date creatTeacherDate) {
		CreatTeacherDate = creatTeacherDate;
	}

	@Override
	public String toString() {
		return "Teacher [title=" + title + ", classid=" + classid + ", name=" + name + ", gender=" + gender + ", age="
				+ age + ", address=" + address + ", salary=" + salary + ", department=" + department
				+ ", CreatTeacherDate=" + CreatTeacherDate + "]";
	}

	public Teacher(String title, long classid, String name, String gender, String age, String address, String salary,
			String department, Date creatTeacherDate) {
		super();
		this.title = title;
		this.classid = classid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.department = department;
		CreatTeacherDate = creatTeacherDate;
	}
	
	

}
