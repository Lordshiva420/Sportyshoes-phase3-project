package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.adminLogin;

@Repository
public interface adminRepository extends JpaRepository<adminLogin, Long>  {

}
