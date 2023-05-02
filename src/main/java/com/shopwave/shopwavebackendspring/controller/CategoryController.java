package com.shopwave.shopwavebackendspring.controller;

import com.shopwave.shopwavebackendspring.Dto.Request.CategoryRequestDto;
import com.shopwave.shopwavebackendspring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/add")
    public String addCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
        return categoryService.addCategory(categoryRequestDto);
    }
}
