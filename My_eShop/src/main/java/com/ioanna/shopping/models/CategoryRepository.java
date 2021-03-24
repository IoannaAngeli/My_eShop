package com.ioanna.shopping.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ioanna.shopping.models.data.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Override
	List<Category> findAll();

	Category findByName(String name);

	List<Category> findAllByOrderBySortingAsc();

	Category findBySlug(String slug);
}
