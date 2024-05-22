package com.example.demo.property;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.User1;

@Controller
public class PropertyController 
{
	
	
	@Autowired
	PropertyService ps;

	

	    @GetMapping
	    public List<Property> getAllProperties() {
	        return ps.getAllProperties();
	    }
	    

	    @GetMapping("/{id}")
	    public Property getPropertyById(@PathVariable Long id) {
	        return ps.getPropertyById(id);
	    
	    }
	    
	    @GetMapping("/property/{id}")
	    public String viewProperty(@PathVariable Long id, Model model) {
	        Property property = ps.getPropertyById(id);
	        model.addAttribute("property", property);
	        return "property"; // Returns the property.jsp view
	    }
	    
	    
	    @RequestMapping("/a1")
		public String dashboard(ModelMap m)
		{
			List<Property> p = ps.showdata();
			m.addAttribute("p", p);
			return "a1";
		}
		
	
}

