package com.example.demo;

import java.util.List;

public interface UserService 
{
	
	
	void savedata(User1 u);

	User1 Checkemail(String Email);
	
	User1 Checkdata(String Email, String Pass);
	
    List<User1> showdata();
	
	void deldata(int id);
	
    User1 editdata(int id);
    
    void updatedata(User1 u);
	
}
