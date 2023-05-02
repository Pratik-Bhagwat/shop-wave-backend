package com.shopwave.shopwavebackendspring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
@Table(name = "product_image")
@Builder
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String type;
    String productName;

    @Lob
    @Column(name = "imagedata",columnDefinition="LONGBLOB")
    private byte[] imageData;

    @ManyToOne
    @JoinColumn
    Product product;

}
