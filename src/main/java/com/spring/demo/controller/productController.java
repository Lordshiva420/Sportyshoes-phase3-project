package com.spring.demo.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.demo.model.product;

import com.spring.demo.service.productService;


@Controller
public class productController {
	
	@Autowired
	private productService pservice;
	
	@RequestMapping("/listOfProducts")
	public  String getallproducts(Model model) {
		 List<product> products=pservice.getAllproducts();
		 model.addAttribute("products", products);
		 return "product";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute product product, Model model,HttpSession session)
	{
		session.setAttribute("product", product);
		pservice.addproduct(product);
		return "product";
	}
	
	
	@RequestMapping("/deleteProduct")
	public  String deleteProduct(@RequestParam("Id") long id, Model model) {
		pservice.deleteProduct(id);
		
		 return "product";
	}
	
	@RequestMapping("/updateProduct")
	public  String updateProduct(@ModelAttribute("product") product pro,@RequestParam("Id") long id, Model model) {
		pservice.updateProduct(pro,id);
		
		 return "product";
	}

	@RequestMapping("/product")
	public  String Product() {
	
		
		 return "product";
	}
	
	
}
