package com.ashokit.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.entity.Products;

public interface Product_Repository extends CrudRepository<Products, Integer>{
	/*
	@Transactional
	@Modifying
	@Query(value = "UPDATE tbl_product SET product_price=?1 WHERE product_id=?2", nativeQuery = true)
	int updateProducts(Double product_price, Integer product_id);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE from tbl_product WHERE product_id=?1", nativeQuery = true)
	int deleteProducts(Integer product_id);
	*/
	@Transactional
	@Modifying
	@Query(value="INSERT into tbl_product (product_id, product_name, product_price) VALUES (?1,?2,?3)", nativeQuery = true)
	void insertProducts(Integer product_id, String product_name, Double product_price);
}
