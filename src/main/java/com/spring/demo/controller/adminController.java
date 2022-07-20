package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.demo.model.adminLogin;
import com.spring.demo.model.product;
import com.spring.demo.service.adminService;
import com.spring.demo.service.userService;

@Controller
public class adminController {
	@Autowired
	private adminService service;
	@Autowired
	private  userService uservice;
	
   
	
	@RequestMapping("/login")
	public String login(Model model)
	{
		System.out.println("login page");
		
		return "login";
	}
	
	@RequestMapping("/submitlogin")
	public String submitlogin(@ModelAttribute adminLogin admin, Model model)
	{
		boolean b=service.validateAdmin(admin);
		if(b) {
			return "welcome";
		}else {
			model.addAttribute("invalide", "invalide credentials please try again");
			return "login";
		}
	}
	
	@RequestMapping("/changePassword")
	public String changePassword(@RequestParam("password") String p1,@RequestParam("Cpassword") String p2, Model model)
	{
		boolean b=false;
		if(p1.equals(p2)) {
			 b=service.updatePassword(p1);
			 if(b) {
					model.addAttribute("message","password updated successfully..!!");
					return "welcome";
				}
				else {
					 model.addAttribute("message","updation failed");
				return "welcome";
				}
			}
		else
			 model.addAttribute("message","check the password entered...");
		return "welcome";
			}
	
	}
