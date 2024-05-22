package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User1,Integer>
{
	
	User1 findByEmail(String email);
	
	User1 findByEmailAndPass(String email, String pass);

}
