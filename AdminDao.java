package com.example.demo.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao implements AdminService 
{

	@Autowired
	AdminRepo ar;

	@Override
	public void savedataadmin(Admin a1) {
		ar.save(a1);	
	}

	@Override
	public Admin checkdataadmin(String aemail, String apass) {
	
		return ar.findByAemailAndApass(aemail, apass);
	}

	@Override
	public List<Admin> showdata() {
		
		return ar.findAll();
	}
	
	
	
}
