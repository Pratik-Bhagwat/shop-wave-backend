package com.shopwave.shopwavebackendspring.repository;

import com.shopwave.shopwavebackendspring.entity.Product;
import com.shopwave.shopwavebackendspring.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    @Query("SELECT pi FROM Product p JOIN p.images pi WHERE p.name = :productName")
    List<ProductImage> findProductImagesByName(@Param("productName") String productName);
}
