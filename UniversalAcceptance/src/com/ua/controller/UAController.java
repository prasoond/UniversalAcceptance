package com.ua.controller;

import java.net.IDN;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.mail.SendMail;
import com.ua.services.UAService;

@Controller
public class UAController {
@Autowired
UAService as;
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping(value="addUser")
	public String add(HttpServletRequest req)
	{   String fn=req.getParameter("first_name");
	    String ln=req.getParameter("last_name"); 
	    String email=req.getParameter("email");
	    as.addUser(IDN.toASCII(fn),IDN.toASCII(ln),IDN.toASCII(email));
	    SendMail sm = new SendMail();
	    sm.sendMail("Registration Succesfull","parveengodara25@gmail.com","sdjfh");
		return "thanks";
	}
	
}
