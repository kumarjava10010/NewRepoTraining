package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.Customer;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginAcgtion(HttpServletRequest request, HttpServletResponse response) {

		// I am passing my View Name
		ModelAndView mav = new ModelAndView("login"); // /jsp/register.jsp

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("customerObject", new Customer());

		return mav;
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticateUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("customerObject") Customer customer) {

		System.out.println("I am in LoginController | " + customer.toString());

		// Service call --> Authentication
		// Account Service --> Account Summary -- Account Model

		ModelAndView mav = null;
		
		if (customer.getUsername().equals(customer.getPassword())) {
			// I am passing my View Name
			mav = new ModelAndView("welcome"); // /jsp/register.jse
		} else {
			mav = new ModelAndView("login"); // /jsp/register.jse

		}

		// Passing new LoginUser Pojo class to map with view
		 mav.addObject("customerObject", customer);
		 //mav.addObject("accountObj", account);

		return mav;
	}

}
