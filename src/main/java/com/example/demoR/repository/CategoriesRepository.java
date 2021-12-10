package com.example.demoR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoR.model.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{

}
