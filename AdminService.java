package com.example.demo.admin;

import java.util.List;

import com.example.demo.User1;

public interface AdminService
{

	void savedataadmin(Admin a1);
	
	Admin checkdataadmin(String aemail, String apass);
	
	List<Admin> showdata();
	
    
}
