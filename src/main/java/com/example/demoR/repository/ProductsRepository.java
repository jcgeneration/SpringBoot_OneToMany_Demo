package com.example.demoR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoR.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
