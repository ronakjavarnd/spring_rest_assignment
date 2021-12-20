package com.spring.rest.curd.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.curd.model.Class1;
import com.spring.rest.curd.model.Department;

@Repository
public class ClassDaoImpl implements ClassDao {
	
	@Autowired
	private SessionFactory factory;
	@Override

	public String addClass(Class1 class1) {
		getSession().save(class1);
		return "Class added successfull with id  : " + class1.getClassid();
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
	public List<Class1> getClass(String classname) {
		return getSession().createCriteria(Class1.class).add(Restrictions.eq("classname", classname)).list();
		}

	

}
