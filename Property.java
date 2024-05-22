package com.example.demo.property;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Property 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long pid;

	private String pname;
    private String padd;
    private String pprice;
    private String ptype;
    private Blob pimage;
    private String pdesc;
    private String pbed;
    private String pbath;
    private String psqft;
    private String pagent;
    
    
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPbed() {
		return pbed;
	}
	public void setPbed(String pbed) {
		this.pbed = pbed;
	}
	public String getPbath() {
		return pbath;
	}
	public void setPbath(String pbath) {
		this.pbath = pbath;
	}
	public String getPsqft() {
		return psqft;
	}
	public void setPsqft(String psqft) {
		this.psqft = psqft;
	}
	public String getPagent() {
		return pagent;
	}
	public void setPagent(String pagent) {
		this.pagent = pagent;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
    
    
    

	
	
}
