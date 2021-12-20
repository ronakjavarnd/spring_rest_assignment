package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department_Table")
public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4501753715497967062L;
	@Id
	@GeneratedValue
	private long departid;
	private String depname;
	private String depHod;
	private String location;
	private Date CreatDepartmentDate;
	
	public Department(String depname,String depHod,String location,Date CreatDepartmentDate ) {
		super();
		this.departid = departid;
		this.depname = depname;
		this.depHod=depHod;
		this.location=location;
		this.CreatDepartmentDate=CreatDepartmentDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepHod() {
		return depHod;
	}
	public void setDepHod(String depHod) {
		this.depHod = depHod;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	
	public long getDepartid() {
		return departid;
	}
	public void setDepartid(long departid) {
		this.departid = departid;
	}
	public Date getCreatDepartmentDate() {
		return CreatDepartmentDate;
	}
	public void setCreatDepartmentDate(Date creatDepartmentDate) {
		CreatDepartmentDate = creatDepartmentDate;
	}
	@Override
	public String toString() {
		return "Department [departid=" + departid + ", depname=" + depname + ", depHod=" + depHod + ", location=" + location + "]";
	}
	
}
