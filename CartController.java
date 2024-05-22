package com.example.demo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CartController 
{
	@Autowired
	CartService cs;

	    @RequestMapping("/Cart")
	    public String Cart() {
	     	return "Cart";
	    }

	
	   
	}

