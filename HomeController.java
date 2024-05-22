package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@Autowired
	UserService us;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	
	@PostMapping("/savedata")
	public String savedata(@ModelAttribute("u1") User1 u1, @RequestParam("email") String email) 
	{
		User1 u = us.Checkemail(email);
		
		if(u==null) 
		{
		if(u1.getPass().equals(u1.getCpass())) 
		{
		us.savedata(u1);
		return "redirect:/login";
		}
		}
		else 
		{
		   return "register";
		}	
		return "register";
	}
	
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@PostMapping("/checkdata")
	public String checkdata(@RequestParam("email") String email, @RequestParam("pass") String pass, HttpSession h1) 
	{
		User1 u = us.Checkdata(email, pass);
		
		if(u!=null) 
		{
			h1.setAttribute("m", u.getEmail());
			return "redirect:/properties";
		}
		return "redirect:/login";
	}
	
	
	@RequestMapping("/properties")
	public String dash(HttpSession h1) 
	{
		String s = (String) h1.getAttribute("m");
		if(s==null) 
		{
			return "redirect:/login";
		}
		return "properties";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession h1)
	{
		h1.invalidate();
		return "redirect:/login";
	}
	
	
	@RequestMapping("/forgot")
	public String forgot()
	{
		return "forgot";
	}
	
	
	
	@RequestMapping("/services")
	public String services()
	{
		return "services";
	}
	
	
	@RequestMapping("/buy")
	public String buy()
	{
		return "buy";
	}
	
	@RequestMapping("/rent")
	public String rent()
	{
		return "rent";
	}
	
	
	@RequestMapping("/sell")
	public String sell()
	{
		return "sell";
	}
	
	
	
	@RequestMapping("/account")
	public String account()
	{
		return "account";
	}
	
	
	@RequestMapping("/list")
	public String list()
	{
		return "list";
	}
	
	@RequestMapping("/track")
	public String track()
	{
		return "track";
	}
	
	
	@RequestMapping("/t&c")
	public String tc()
	{
		return "t&c";
	}
	
	@RequestMapping("/offer")
	public String offer()
	{
		return "offer";
	}
	
	
	@RequestMapping("/dashboard")
	public String dashboard(ModelMap m)
	{
		List<User1> x = us.showdata();
		m.addAttribute("x", x);
		return "dashboard";
	}
	
	@GetMapping("/delete/{id}")
	public String deldata(@PathVariable int id) 
	{
		us.deldata(id);		
		return "redirect:/dashboard";
	}
	
	@GetMapping("/edit/{id}")
	public String editdata(@PathVariable int id, ModelMap m) 
	{
		User1 u = us.editdata(id);
		m.addAttribute("c", u);
		
		return "edit";
	}
	

	@RequestMapping("/update")
	public String updatedata(@ModelAttribute("u2") User1 u2) 
	{
		if(u2.getPass().equals(u2.getCpass()))
		{	
		us.updatedata(u2);
		return "redirect:/dashboard";
		}
		else 
		{
		   return "edit";
		}	
		
	}
	
	@RequestMapping("/mycart")
	public String MyCartk()
	{
		return "mycart";
	}
	
	@RequestMapping("/notification")
	public String Notifications()
	{
		return "notification";
	}
	
	@RequestMapping("/like")
	public String like()
	{
		return "like";
	}
	
	@RequestMapping("/wallet")
	public String Wallet()
	{
		return "wallet";
	}
	
	@RequestMapping("/GodrejPropertY")
	public String GodrejPropertY()
	{
		return "GodrejPropertY";
	}
	
	@RequestMapping("/CheckOut")
	public String CheckOut(Model model )
	{
		return "CheckOut";
	}
	
	
}
