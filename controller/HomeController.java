package com.shubhamTraining.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping("/addStudentForm")
	public String getInfoPage() {
		
		
		return "addStudent";
	}
	
	@RequestMapping("/processNewStudent")
	public String processNewStudent( HttpServletRequest req, HttpServletResponse res ) {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		System.out.println("\n\nProcessing New Student Data : ->>" + fname +" "+ lname +"<<-\n\n");
		
		req.setAttribute("stuFname", fname);
		req.setAttribute("stuLname", lname);
		
		return "confirmation";
	}
}
