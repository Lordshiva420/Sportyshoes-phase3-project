package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Pid;
	private String Name;
	private String category;
	private long price;
	@OneToOne(mappedBy = "product")
	private user user;
	
	public long getPid() {
		return Pid;
	}
	public void setPid(long pid) {
		Pid = pid;
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
		return "product [Pid=" + Pid + ", Name=" + Name + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
