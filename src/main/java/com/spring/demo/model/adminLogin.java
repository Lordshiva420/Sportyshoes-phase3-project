package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class adminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Aid;
	private String userName;
	private String password;
	
	
	
	public long getAid() {
		return Aid;
	}
	public void setAid(long aid) {
		Aid = aid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "adminLogin [Aid=" + Aid + ", userName=" + userName + ", password=" + password + "]";
	}
	

}
