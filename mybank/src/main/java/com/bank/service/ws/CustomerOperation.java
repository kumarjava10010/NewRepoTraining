package com.bank.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bank.persistance.dao.CustomerDaoIfc;
import com.bank.persistance.model.Customer;
import com.bank.service.CustomerServiceIfc;

@Service
@WebService/*(name = "customer", portName="customerPort", serviceName="customerService", 
targetNamespace ="http://com.bank.service.ws.CustomerOperation", endpointInterface = "com.bank.service.ws.CustomerOperation")*/
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public class CustomerOperation extends SpringBeanAutowiringSupport {

	/*@Autowired
	CustomerServiceIfc customerService;
*/
	@WebMethod
	public Customer getCustomer(int acctNumber ) {
		// TODO Auto-generated method stub
		// DB to check if this is valid user or not 
		// then check his roles --> access to the operations 
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerServiceIfc customerService = (CustomerServiceIfc) context.getBean("customerService");
		
		Customer customer = customerService.getCusttomer(acctNumber);
		 
		return customer;
	}


}
