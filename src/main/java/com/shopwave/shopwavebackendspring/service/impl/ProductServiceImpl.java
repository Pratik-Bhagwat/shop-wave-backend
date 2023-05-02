package com.shopwave.shopwavebackendspring.service.impl;

import com.shopwave.shopwavebackendspring.Dto.Request.ProductRequestDto;
import com.shopwave.shopwavebackendspring.Dto.Response.ProductResponseDto;
import com.shopwave.shopwavebackendspring.entity.Category;
import com.shopwave.shopwavebackendspring.entity.Product;
import com.shopwave.shopwavebackendspring.entity.ProductImage;
import com.shopwave.shopwavebackendspring.exception.ResourceNotFoundException;
import com.shopwave.shopwavebackendspring.repository.CategoryRepository;
import com.shopwave.shopwavebackendspring.repository.ProductImageRepository;
import com.shopwave.shopwavebackendspring.repository.ProductRepository;
import com.shopwave.shopwavebackendspring.service.ProductService;
import com.shopwave.shopwavebackendspring.transformer.ProductTransformer;
import com.shopwave.shopwavebackendspring.utility.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductImageRepository productImageRepository;

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public String addProduct(ProductRequestDto productRequestDto) {
        Product product = ProductTransformer.productRequestDtoToProduct(productRequestDto);

        Category category = categoryRepository.findByName(product.getProdCategory());
        category.setProduct(product);

        product.setCategory(category);
        List<ProductImage> images = productImageRepository.getAllImagesOfProduct(product.getName());

        for (ProductImage pi: images) {
            pi.setProduct(product);
        }

        productRepository.save(product);
        return "product added successfully";
    }

    @Override
    public ProductResponseDto getProductByName(String name){
        Product product = productRepository.findByName(name);
       return ProductTransformer.productToProductResponseDto(product);
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> productResponseDtoList = new ArrayList<>();

        for (Product p: products) {
            ProductResponseDto productResponseDto = ProductTransformer.productToProductResponseDto(p);
            productResponseDtoList.add(productResponseDto);
        }
        return productResponseDtoList;
    }
}
