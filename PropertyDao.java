package com.example.demo.property;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyDao implements PropertyService 
{
	
	@Autowired
	PropertyRepo pr;

	@Override
	public List<Property> getAllProperties() 
	{
		
		return pr.findAll();
	
	}

	@Override
	public Property getPropertyById(Long id) 
	{	
		
		return pr.findById(id).orElse(null);
	
	}

	@Override
	public List<Property> showdata() {
		
		return pr.findAll();
	}
	

}
