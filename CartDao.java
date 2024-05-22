package com.example.demo.Cart;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartDao implements CartService 
{
	@Autowired
    CartRepo cr;


 }
