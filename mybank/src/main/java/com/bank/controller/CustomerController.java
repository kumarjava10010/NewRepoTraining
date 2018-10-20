package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.persistance.model.Customer;
import com.bank.persistance.model.CustomerValidator;
import com.bank.persistance.model.LoginUser;
import com.bank.service.CustomerServiceIfc;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerServiceIfc customerService;
	
	@Autowired
	private Validator validator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(validator);
		//binder.addValidators(new CustomerValidator());

		// You can create your custom validator class and add it here
	}

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
			@ModelAttribute("customerObject") Customer customer, BindingResult result) {
		
		System.out.println("I am in CustomerController ClASS BEFORE CALLING SERVICE  ");

		validator.validate(customer, result);
		
		if (result.hasErrors()) {
			return new ModelAndView("register");
		}
		
		Customer returnObj = customerService.createCustomer(customer);
		
		System.out.println("I am in CustomerController ClASS AFTER CALLING SERVICE  ");
		// I am passing my View Name
		ModelAndView mav = new ModelAndView("login"); // /jsp/login.jsp

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("loginUser", new LoginUser());

		return mav;
	}
}
