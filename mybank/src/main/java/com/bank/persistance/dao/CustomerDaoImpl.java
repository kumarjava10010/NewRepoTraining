package com.bank.persistance.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.persistance.model.Customer;

@Repository("customerDao")
@Transactional
public class CustomerDaoImpl implements CustomerDaoIfc{
	
	@Autowired
	SessionFactory sessionFactory;
	

	public int save(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer findByAcctNumber(int acctNumer) {
		Session session = sessionFactory.getCurrentSession();
		
		Customer cust = (Customer) session.get(Customer.class, acctNumer);
		return cust;
		
	}

}
