package com.shopwave.shopwavebackendspring.repository;

import com.shopwave.shopwavebackendspring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category findByName(String name);
}
