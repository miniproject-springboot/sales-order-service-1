package com.otj.salesorderservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerSOS {
	
	@Id
	@GeneratedValue
	private long cust_id;
	private String cust_first_name;
	private String cust_last_name;
	private String cust_email;
	
	public CustomerSOS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerSOS(long cust_id, String cust_first_name, String cust_last_name, String cust_email) {
		super();
		this.cust_id = cust_id;
		this.cust_first_name = cust_first_name;
		this.cust_last_name = cust_last_name;
		this.cust_email = cust_email;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_first_name() {
		return cust_first_name;
	}
	public void setCust_first_name(String cust_first_name) {
		this.cust_first_name = cust_first_name;
	}
	public String getCust_last_name() {
		return cust_last_name;
	}
	public void setCust_last_name(String cust_last_name) {
		this.cust_last_name = cust_last_name;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	
	

}
