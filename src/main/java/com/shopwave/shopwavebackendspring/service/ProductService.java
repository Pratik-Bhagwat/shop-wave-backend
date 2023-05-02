package com.shopwave.shopwavebackendspring.service;

import com.shopwave.shopwavebackendspring.Dto.Request.ProductRequestDto;
import com.shopwave.shopwavebackendspring.Dto.Response.ProductResponseDto;

import java.util.List;

public interface ProductService {

    String addProduct(ProductRequestDto productRequestDto);

    ProductResponseDto getProductByName(String name);

    List<ProductResponseDto> getAllProducts();
}
