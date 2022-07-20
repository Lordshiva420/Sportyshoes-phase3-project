package com.spring.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uId;
	private String userName;
	
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	private Date timestamp;
	@OneToOne(cascade = CascadeType.ALL)
	private product product;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "user [uId=" + uId + ", userName=" + userName + ", timestamp=" + timestamp + ", product=" + product
				+ "]";
	}
	
	
	
	

}
