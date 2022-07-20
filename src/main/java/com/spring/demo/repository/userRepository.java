package com.spring.demo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.user;


@Repository
public interface userRepository extends JpaRepository<user, Long>  {
	
	@Query("SELECT u FROM user u WHERE u.userName = :name")
	ArrayList<user> findByName(@Param("name") String uN);
	
	@Query("SELECT new com.spring.demo.model.purchase(u.userName, p.Name, p.category, p.price ,u.timestamp) FROM user u JOIN u.product p ")
	public List<com.spring.demo.model.purchase> getCategories();
	
	@Query("SELECT new com.spring.demo.model.purchase(u.userName, p.Name, p.category, p.price ,u.timestamp) FROM user u JOIN u.product p ")
	public List<com.spring.demo.model.purchase> getTimestamps();
	
	@Query("SELECT new com.spring.demo.model.purchase(u.userName, p.Name, p.category, p.price ,u.timestamp) FROM user u JOIN u.product p  WHERE p.category = :cat AND u.timestamp= :time")
	public List<com.spring.demo.model.purchase> searchPurchase(@Param("cat") String cat,@Param("time") Date date);
	
	@Query("SELECT new com.spring.demo.model.purchase(u.userName, p.Name, p.category, p.price ,u.timestamp) FROM user u JOIN u.product p")
	public List<com.spring.demo.model.purchase> purchase();
}
