package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao implements UserService 
{
	@Autowired
	UserRepository ur;

	@Override
	public void savedata(User1 u) {
		ur.save(u);
	}

	@Override
	public User1 Checkemail(String email) {
		
		return ur.findByEmail(email);
		
	}

	@Override
	public User1 Checkdata(String email, String pass) {
	
		return ur.findByEmailAndPass(email, pass);
		
	}

	@Override
	public List<User1> showdata() {
		
		return ur.findAll();
	}

	@Override
	public void deldata(int id) {
	
		ur.deleteById(id);
	}

	@Override
	public User1 editdata(int id) {
		
		return ur.getById(id);
	}

	@Override
	public void updatedata(User1 u) {
	
		ur.save(u);
	}

	
	
	
}
