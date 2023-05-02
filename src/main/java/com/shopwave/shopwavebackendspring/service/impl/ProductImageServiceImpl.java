package com.shopwave.shopwavebackendspring.service.impl;

import com.shopwave.shopwavebackendspring.entity.ProductImage;
import com.shopwave.shopwavebackendspring.repository.ProductImageRepository;
import com.shopwave.shopwavebackendspring.service.ProductImageService;
import com.shopwave.shopwavebackendspring.utility.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    private ProductImageRepository imageRepo;
    @Override
    public ProductImage uploadImage(MultipartFile file,String productName) throws IOException {
        ProductImage pImage = new ProductImage();
        pImage.setName(file.getOriginalFilename());
        pImage.setType(file.getContentType());
        pImage.setProductName(productName);
        pImage.setImageData(ImageUtil.compressImage(file.getBytes()));
        return imageRepo.save(pImage);
    }

    @Override
    public byte[] downloadImage(String fileName) {
        Optional<ProductImage> imageData = imageRepo.findByName(fileName);
        return ImageUtil.decompressImage(imageData.get().getImageData());
    }

}
