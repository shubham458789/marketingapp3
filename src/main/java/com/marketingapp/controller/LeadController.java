package com.marketingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	//Handler Methods
	@RequestMapping("/viewLeadPage")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("email") String email,@RequestParam("mobile") String mobile){
		Lead lead = new Lead();
		lead.setFirstname(firstName);
		lead.setLastname(lastName);
		lead.setEmail(email);
		lead.setMobile(mobile);
		
		leadService.saveOneLead(lead);
		return "create_lead";
	}
}
