package com.example.demoR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoR.model.Categories;
import com.example.demoR.model.Products;
import com.example.demoR.repository.CategoriesRepository;

@SpringBootApplication
public class DemoRApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoRApplication.class, args);
	} //main

	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Products product1 = new Products("Pila D","Pila D 1.5V","pilaD.jpg", 25.5);
		Products product2 = new Products("Pila AA","Pila AA 1.5V","pilaAA.jpg", 20.0);
		Products product3 = new Products("Pila AAA","Pila AAA 1.5V","pilaAAA.jpg", 20.5);
		
		Categories cat1 = new Categories("Accesorios", "Accesorios");
		Categories cat2 = new Categories("Electrónicos", "Electrónicos");
		cat1.getProducts().add(product1);
		cat1.getProducts().add(product2);
		cat2.getProducts().add(product3);
		this.categoriesRepository.save(cat1);
		this.categoriesRepository.save(cat2);
	}//run

}//class
