package com.spring.rest.curd.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.rest.curd.model.Department;
import com.spring.rest.curd.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private SessionFactory factory;


	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		
		getSession().save(student);
		return "Student added successfull with reg number  : " + student.getRegno();
		
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
	public List<Student> getStudent(long Regno) {
		// TODO Auto-generated method stub
		
		return getSession().createCriteria(Student.class).add(Restrictions.eq("regno", Regno)).list();
}

}
