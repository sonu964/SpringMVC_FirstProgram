package com.jspiders.loginApp.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/")
@Component
public class LoginController {

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(ServletRequest req) {
		System.out.println("Login method started");

		String email = req.getParameter("email");
		String passwordVal = req.getParameter("password");

		if (email.equals("Ramesh") && passwordVal.equals("ramesh123")) {

			System.out.println("Login Success");
			return "/landing.jsp";

		} else {

			System.out.println("Login failure");
			return "/login.jsp";
		}

	}

}
