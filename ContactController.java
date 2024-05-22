package com.example.demo.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController 
{
	@Autowired
	ContactService cs;
	
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@PostMapping("/savedatacontact")
	public String savedatacontact(@ModelAttribute("c1") Contact c1, @RequestParam("email") String email) 
	{
		Contact c = cs.checkemail(email);
		if(c==null) 
		{
		cs.savedatacontact(c1);
		return "index";
		}
		   return "contact";
	}

}
