package com.spring.rest.curd.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.curd.model.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public String addDepartment(Department department) {
		getSession().save(department);
		return "Department added successfull with id  : " + department.getDepartid();
	}

	private Session getSession() {
		Session session = null;
		try {
			session = factory.getCurrentSession();
		} catch (HibernateException ex) {
			session = factory.openSession();
		}
		return session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getDepartment(String depname) {
		return getSession().createCriteria(Department.class).add(Restrictions.eq("depname", depname)).list();

	}



	

	}
