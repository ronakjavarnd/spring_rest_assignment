package com.spring.rest.curd.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao{

	@Autowired
	private SessionFactory factory;

	
	@Override
	public String addTeacher(Teacher teacher) {
		 getSession().save(teacher);
			return "Teacher added successfull with title  : " + teacher.getTitle();
			
		 
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
	public List<Teacher> getTeacher(String title) {
		return getSession().createCriteria(Teacher.class).add(Restrictions.eq("title", title)).list();

	}

	

}
