package com.shopwave.shopwavebackendspring.repository;

import com.shopwave.shopwavebackendspring.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage,Integer> {
    Optional<ProductImage> findByName(String fileName);

    @Query(value = "select * from product_image i where i.product_name = :name",nativeQuery = true)
    List<ProductImage> getAllImagesOfProduct(String name);
}
