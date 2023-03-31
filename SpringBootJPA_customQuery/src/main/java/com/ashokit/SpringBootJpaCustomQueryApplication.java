package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.repository.Product_Repository;

@SpringBootApplication
public class SpringBootJpaCustomQueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaCustomQueryApplication.class, args);
		
		Product_Repository repo = context.getBean(Product_Repository.class);
		/*
		Products p1 = new Products();
		p1.setProductId(10101);
		p1.setProductName("Laptop");
		p1.setProductPrice(52000.00);
		
		Products p2 = new Products();
		p2.setProductId(10102);
		p2.setProductName("Keyboard");
		p2.setProductPrice(1500.00);
		
		Products p3 = new Products();
		p3.setProductId(10103);
		p3.setProductName("Charger");
		p3.setProductPrice(550.0);
		
		List<Products> list = Arrays.asList(p1,p2,p3);
		
		repo.saveAll(list);
		
		System.out.println("Record Successfull...");
		*/
		/*
		repo.updateProducts(650.0, 10103);
		System.out.println("Updated Successfull...");
		*/
		/*
		repo.deleteProducts(10103);
		System.out.println("Delete the record successfull...");
		*/
		
		repo.insertProducts(10103, "Charger", 650.0);
		System.out.println("Inserted successfull...");
	}
		
	

	
}
