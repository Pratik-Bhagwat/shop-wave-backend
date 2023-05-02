package com.shopwave.shopwavebackendspring.Dto.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
@Builder
public class ProductRequestDto {
    String name;
    String price;
    String description;
    String subtitle;
    String prodCategory;
}
