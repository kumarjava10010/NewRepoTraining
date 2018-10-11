package com.bank.persistance.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.persistance.model.Customer;

/*@ContextConfiguration(locations = "classpath:/src/main/resources/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)*/
public class CustomerDaoTest {
	
	
	public static void main(String[] a) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerDaoIfc customerDao = (CustomerDaoIfc) context.getBean("customerDao");
		
		Customer customer = customerDao.findByAcctNumber(1234);
		
		System.out.println(customer.toString());
	}

}
