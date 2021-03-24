package com.ioanna.shopping.models;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ioanna.shopping.models.data.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findBySlug(String slug);

	Product findBySlugAndIdNot(String slug, int id);

	long countByCategoryId(String categoryId);

	Page<Product> findAll(Pageable pageable);

	List<Product> findAllByCategoryId(String string, Pageable pageable);
}
