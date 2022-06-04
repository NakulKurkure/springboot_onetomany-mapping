package com.springonetomany.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pname;
	public product(int pId, String pname) {
		super();
		this.pId = pId;
		this.pname = pname;
	}
	public int getpId() {
		return pId;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
}
