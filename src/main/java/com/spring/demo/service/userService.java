package com.spring.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.spring.demo.model.product;
import com.spring.demo.model.purchase;
import com.spring.demo.model.user;
import com.spring.demo.repository.productRepository;
import com.spring.demo.repository.userRepository;
@Service
public class userService {
	@Autowired
	private  userRepository userRepo;
	

	public void insertUser(user u) {
		
		userRepo.save(u);
	}
	
	public List<user> getallusers() {
		List<user> users=userRepo.findAll();
		System.out.println(users);
	   return users;
    }

	public ArrayList<user> searchUser(String uN) {
		ArrayList<user> u=userRepo.findByName(uN);
		System.out.println(u);
		return u;
		
	}
	
	public List<purchase> purchase() {
		
		List<purchase> purchases=userRepo.purchase();
		for(purchase p:purchases) {
			System.out.println(p);
		}
		
		return purchases;
	}
	
	public List<String> listcat() {
		
		List<purchase> cats=userRepo.getCategories();
		ArrayList<String> catlist= new ArrayList<>();
		for(purchase c:cats) {
			String cat=c.getCategory();
			System.out.println(cat);
			catlist.add(cat);
		}
		return catlist;
	}

	public ArrayList<Date> listtime() {
		List<purchase> times=userRepo.getTimestamps();
		ArrayList<Date> timelist= new ArrayList<>();
		for(purchase t:times) {
			Date time=t.getTimestamp();
			System.out.println(time);
			timelist.add(time);
		}
		return timelist;
	}
	
	public List<purchase> searchpurchase(String cat, Date date) {
		
		List<purchase> purchase=userRepo.searchPurchase(cat,date);
		for(purchase p:purchase) {
			System.out.println(p);
		}
		
		return purchase;
		}
	

	
	
	
	
	}


