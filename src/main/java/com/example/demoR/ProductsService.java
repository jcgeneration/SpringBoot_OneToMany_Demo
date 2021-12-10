package com.example.demoR;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoR.model.Products;
import com.example.demoR.repository.ProductsRepository;

@Service
public class ProductsService {
	
	private final ProductsRepository productsRepository;
	
	@Autowired
	public ProductsService(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	} // constructor
	
	public List<Products> getProducts(){
		return productsRepository.findAll();
	}// getProducts
	
	
	
}// class ProductsService
