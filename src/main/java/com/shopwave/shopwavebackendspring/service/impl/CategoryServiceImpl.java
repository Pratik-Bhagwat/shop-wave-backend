package com.shopwave.shopwavebackendspring.service.impl;

import com.shopwave.shopwavebackendspring.Dto.Request.CategoryRequestDto;
import com.shopwave.shopwavebackendspring.entity.Category;
import com.shopwave.shopwavebackendspring.repository.CategoryRepository;
import com.shopwave.shopwavebackendspring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public String addCategory(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        category.setName(categoryRequestDto.getName());
        categoryRepository.save(category);

        return "category added successfully";
    }
}
