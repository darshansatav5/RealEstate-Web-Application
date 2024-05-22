package com.example.demo.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin 

{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int aid;
	private String aname;
	private String aemail;
	private String apass;
	private String acpass;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	public String getAcpass() {
		return acpass;
	}
	public void setAcpass(String acpass) {
		this.acpass = acpass;
	}
	
	
	

}
