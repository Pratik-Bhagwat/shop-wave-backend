package com.shopwave.shopwavebackendspring.service;

import com.shopwave.shopwavebackendspring.Dto.Request.CategoryRequestDto;

public interface CategoryService {
    String addCategory(CategoryRequestDto categoryRequestDto);
}
