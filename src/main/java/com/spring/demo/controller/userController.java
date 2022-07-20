package com.spring.demo.controller;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.spring.demo.model.adminLogin;
import com.spring.demo.model.product;
import com.spring.demo.model.purchase;
import com.spring.demo.model.user;
import com.spring.demo.repository.userRepository;
import com.spring.demo.service.userService;
@Controller
public class userController {
	
	@Autowired
	private  userService uservice;

	
	
	
	@RequestMapping("/getAllusers")
	public String getAllusers(Model model)
	{   
		 
		 List<user> users=uservice.getallusers();
	
		 model.addAttribute("users", users);
		 return "user";
			
	}
	
	@RequestMapping("/searchUser")
	public String searchUser(@RequestParam("userName") String uN, Model model)
	{   
		
		ArrayList<user> u=uservice.searchUser(uN);
		 model.addAttribute("user", u);
		 return "user";
			
	}
	@RequestMapping("/purchase")
	public String purchase(Model model)
	{   
		 List<purchase> purchases=uservice.purchase();
		 model.addAttribute("purchases", purchases);
		 return "user";
				
	}
	
	@RequestMapping("/searchPurchase")
	public String searchPurchase(@RequestParam("category") String cat,@RequestParam("timestamp") String time, Model model)
	{  
		Timestamp  timestamp = null;
		 timestamp=timestamp.valueOf(time);
		System.out.println("++++++date"+timestamp);
		 List<purchase> purchase=uservice.searchpurchase(cat,timestamp);
		 model.addAttribute("purchase", purchase);
		return "user";
		 
	}
	
	
	@RequestMapping("/user")
	public  String user(Model model) {
		List<String> catlist = uservice.listcat();
		 model.addAttribute("catlist", catlist);
		 System.out.println(catlist);
		 ArrayList<Date> timelist=uservice.listtime();
		 model.addAttribute("timelist", timelist);
		 System.out.println(timelist);
		 return "user";
	}
	

	
}
