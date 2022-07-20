package com.spring.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.demo.model.product;
import com.spring.demo.repository.adminRepository;
import com.spring.demo.repository.productRepository;

@Service
public class productService {
	
	
	@Autowired
	private productRepository proRepo;
	
	
	
	 public List<product> getAllproducts() {
	        List<product> products
	                = proRepo.findAll();
	        System.out.println(products);
	        return products;

	    }

	public void addproduct(product product) {
		
		product	p=proRepo.save(product);
		System.out.println(p);
		}


	public void deleteProduct(long id) {
		proRepo.deleteById(id);
		
		 }
	
	public void updateProduct(product pro, long id) {
		 product repoPro=proRepo.getById(id);
		 repoPro.setName(pro.getName());
		 repoPro.setCategory(pro.getCategory());
		 repoPro.setPrice(pro.getPrice());
		 product p=proRepo.save(repoPro);
		 System.out.println(p);
		}
	
	
}
