package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.persistance.model.Customer;
import com.bank.persistance.model.LoginUser;
import com.bank.service.CustomerServiceIfc;
import com.bank.service.CustomerServiceImpl;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerServiceIfc customerService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {

		// I am passing my View Name
		ModelAndView mav = new ModelAndView("register"); // /jsp/register.jsp

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("customerObject", new Customer());

		return mav;
	}

	@RequestMapping(value = "/customerSave", method = RequestMethod.POST)
	public ModelAndView saveCustomer(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("customerObject") Customer customer) {
		
		Customer returnObj = customerService.createCustomer(customer);
		
		System.out.println("I am in saveCustomer method");
		// I am passing my View Name
		ModelAndView mav = new ModelAndView("login"); // /jsp/login.jsp

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("loginUser", new LoginUser());

		return mav;
	}
}
