package com.shopwave.shopwavebackendspring.controller;

import com.shopwave.shopwavebackendspring.Dto.Request.ProductRequestDto;
import com.shopwave.shopwavebackendspring.Dto.Response.ProductResponseDto;
import com.shopwave.shopwavebackendspring.service.ProductImageService;
import com.shopwave.shopwavebackendspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductImageService productImageService;
    @PostMapping("/add")
    public String addProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.addProduct(productRequestDto);
    }
    @GetMapping("/get-by/{name}")
    public ProductResponseDto getProductByName(@PathVariable("name") String name){
        return productService.getProductByName(name);
    }
    @GetMapping("/get-all")
    public List<ProductResponseDto> getAllProducts() {
        return productService.getAllProducts();
    }
}
