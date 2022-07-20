package com.spring.demo.model;

import java.util.Date;

public class purchase {
	private String userName;
	private String Name;
	private String category;
	private long price;
	private Date timestamp;
	
	
	
	public purchase(String userName, String name, String category, long price, Date timestamp) {
		super();
		this.userName = userName;
		Name = name;
		this.category = category;
		this.price = price;
		this.timestamp = timestamp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "purchase [userName=" + userName + ", Name=" + Name + ", category=" + category + ", price=" + price
				+ ", timestamp=" + timestamp + "]";
	}
	
	
}
