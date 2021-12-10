package com.example.demoR.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoR.ProductsService;
import com.example.demoR.model.Products;

@RestController
@RequestMapping("/api/productos/")
public class ProductosController {
	
	private final ProductsService productsService;
	
	@Autowired
	public ProductosController(ProductsService productsService) {
		this.productsService = productsService;
	} //constructor


	@GetMapping
	public List<Products> getAllProductos() {
		return productsService.getProducts();
	} //getAllProductos
	
	
} //class
