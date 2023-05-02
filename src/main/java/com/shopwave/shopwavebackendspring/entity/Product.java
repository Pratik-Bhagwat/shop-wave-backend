package com.shopwave.shopwavebackendspring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
@Table(name = "product")
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String price;
    String description;
    String subtitle;
    String prodCategory;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<ProductImage> images = new ArrayList<>();

    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    Category category;

    @ManyToOne
    @JoinColumn
    Orders orders;
}
