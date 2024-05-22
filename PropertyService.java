package com.example.demo.property;

import java.util.List;


public interface PropertyService 
{
	
	    public List<Property> getAllProperties(); 

	    public Property getPropertyById(Long id);
	    
	    List<Property> showdata();

}
