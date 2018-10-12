package com.bank.persistance.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.persistance.model.Customer;

@Repository("customerDao")
@Transactional
public class CustomerDaoImpl implements CustomerDaoIfc {

	@Autowired
	SessionFactory sessionFactory;

	public int save(Customer customer) {
		int acctNumber = 0;
		try {

			String hql = "select max(customer.acctNo) from Customer customer";

			Session session = sessionFactory.getCurrentSession();

			Query query = session.createQuery(hql);
			List list = query.list();
			acctNumber = (Integer) list.get(0);
			acctNumber = acctNumber + 1;
			customer.setAcctNo(acctNumber);
			session.save(customer);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return acctNumber;
	}

	public void update(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);

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
