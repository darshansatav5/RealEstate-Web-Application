package com.example.demo.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.User1;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>
{


	Admin findByAemailAndApass(String aemail, String apass);
	
}
