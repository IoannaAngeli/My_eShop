package com.ioanna.shopping.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ioanna.shopping.models.data.Page;


public interface PageRepository extends JpaRepository<Page, Integer>{
	
	@Override
	List<Page> findAll();
	
	Page findBySlug(String slug);
	
//	@Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
//	Page findBySlug(int id, String slug);
	
	Page findBySlugAndIdNot(String slug, int id);
	
	void deleteById(int id);
	
	List<Page> findAllByOrderBySortingAsc();

}
