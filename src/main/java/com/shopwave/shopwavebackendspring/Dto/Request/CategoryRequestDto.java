package com.shopwave.shopwavebackendspring.Dto.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
@Builder
public class CategoryRequestDto {
    String name;
}
