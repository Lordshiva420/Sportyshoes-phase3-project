package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.adminLogin;
import com.spring.demo.model.product;
import com.spring.demo.repository.adminRepository;

@Service
public class adminService {
	@Autowired
	private adminRepository shoeRepo;
	
	public adminLogin insertAdmin(adminLogin admin) {
		
	adminLogin	i=shoeRepo.save(admin);
		
		return i;
	}
  
	public boolean validateAdmin(adminLogin admin) {
		adminLogin	repoAdmin=shoeRepo.findById((long) 1).get();
		if((repoAdmin.getUserName()).equalsIgnoreCase(admin.getUserName())&&((repoAdmin.getPassword()).equalsIgnoreCase(admin.getPassword()))){
		return true;
		}
		else{
	    return false;
		}	
	}
	
public boolean updatePassword(String p1) {
	    adminLogin	repoAdmin=shoeRepo.findById((long) 1).get();
		repoAdmin.setPassword(p1);
		boolean b=shoeRepo.save(repoAdmin) != null;
		return b;
				
		}


}
