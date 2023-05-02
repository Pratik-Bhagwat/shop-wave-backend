package com.shopwave.shopwavebackendspring.transformer;

import com.shopwave.shopwavebackendspring.Dto.Request.ProductRequestDto;
import com.shopwave.shopwavebackendspring.Dto.Response.ProductResponseDto;
import com.shopwave.shopwavebackendspring.entity.Product;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductTransformer {
    public static ProductResponseDto productToProductResponseDto(Product product) {
        return ProductResponseDto.builder()
                .price(product.getPrice())
                .name(product.getName())
                .description(product.getDescription())
                .subtitle(product.getSubtitle())
                .prodCategory(product.getProdCategory())
                .images(product.getImages())
                .build();
    }

    public static Product productRequestDtoToProduct(ProductRequestDto productRequestDto) {
        return Product.builder()
                .name(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .description(productRequestDto.getDescription())
                .subtitle(productRequestDto.getSubtitle())
                .prodCategory(productRequestDto.getProdCategory())
                .build();
    }
}
