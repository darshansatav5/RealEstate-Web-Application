package com.example.demo.admin;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.User1;

@Controller
public class AdminController {

	@Autowired
	AdminService as;
	
	
	
	@RequestMapping("/adminregister")
	public String adminregister()
	{
		return "adminregister";
	}
	
	
	@PostMapping("/savedataadmin")
	public String savedataadmin(@ModelAttribute("a1") Admin a1) 
	{
		
	  if(a1.getApass().equals(a1.getAcpass())) 
	  {
	    as.savedataadmin(a1);
		return "redirect:/adminlogin";
	  }
	  return "adminregister";
	  
	}
	
	
	@RequestMapping("/adminlogin")
	public String adminlogin()
	{
		return "adminlogin";
	}
	
	
	@PostMapping("/checkdataadmin")
	public String checkdataadmin(@RequestParam("aemail") String aemail, @RequestParam("apass") String apass, HttpSession h1) 
	{
		
		Admin a = as.checkdataadmin(aemail, apass);
		
		if(a!=null)
		{
			h1.setAttribute("m", a.getAemail());
		    return "redirect:/admin";
		}	
		  return "redirect:/adminlogin";		
	}
	
	
	@RequestMapping("/admin")
	public String admin(HttpSession h1)
	{
		
		String s = (String) h1.getAttribute("m");
		if(s==null) 
		{
			return "redirect:/adminlogin";
		}
		return "admin";		
	}
	
	@RequestMapping("/adminlogout")
	public String adminlogout(HttpSession h1)
	{
		h1.invalidate();
		return "redirect:/";
	}
	
	
	@RequestMapping("/showdata")
	public String showdata(ModelMap m)
	{
		List<Admin> x = as.showdata();
		m.addAttribute("x", x);
		return "showdata";
	}
	
}
