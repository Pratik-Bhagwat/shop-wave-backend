package com.shopwave.shopwavebackendspring.service;

import com.shopwave.shopwavebackendspring.entity.ProductImage;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductImageService {

    ProductImage uploadImage(MultipartFile file,String productName) throws IOException;

    byte[] downloadImage(String fileName);

}
