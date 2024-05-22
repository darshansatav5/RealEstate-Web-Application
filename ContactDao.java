package com.example.demo.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactDao implements ContactService 
{

	@Autowired
	ContactRepo cr;

	@Override
	public void savedatacontact(Contact c1) 
	{
	    cr.save(c1);	
	}

	@Override
	public Contact checkemail(String Email) 
	{
		return cr.findByEmail(Email);
	}

	
	
}
