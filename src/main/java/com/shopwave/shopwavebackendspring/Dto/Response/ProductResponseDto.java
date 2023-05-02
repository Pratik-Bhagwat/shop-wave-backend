package com.shopwave.shopwavebackendspring.Dto.Response;

import com.shopwave.shopwavebackendspring.entity.ProductImage;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
@Builder
public class ProductResponseDto {
    String name;
    String price;
    String description;
    String subtitle;
    String prodCategory;
    List<ProductImage> images;
}
