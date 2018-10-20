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
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView customerRegestration(HttpServletRequest request, HttpServletResponse response) {

		// I am passing my View Name
		ModelAndView mav = new ModelAndView("registration"); // /jsp/register.jsp

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("customerObject", new Customer());

		return mav;
	}

	@RequestMapping(value = "/registerSave", method = RequestMethod.POST)
	public ModelAndView customerRegestrationSave(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("customerObject") Customer customer) {

		System.out.println("I am in RegistrationController | " + customer.toString());

		// Service call --> Saving into DAta Base

		ModelAndView mav = null;
		if (true) {
			// I am passing my View Name
			mav = new ModelAndView("welcome"); // /jsp/register.jse
		} else {
			mav = new ModelAndView("error"); // /jsp/register.jse

		}

		// Passing new LoginUser Pojo class to map with view
		 mav.addObject("customerObject", customer);

		return mav;
	}

}
