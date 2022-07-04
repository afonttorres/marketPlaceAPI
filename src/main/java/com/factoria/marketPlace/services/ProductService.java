package com.factoria.marketPlace.services;

import com.factoria.marketPlace.dto.ProductReqDto;
import com.factoria.marketPlace.models.Product;
import com.factoria.marketPlace.models.User;
import com.factoria.marketPlace.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    IProductRepository productRepository;
    public ProductService(IProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @Override
    public Product create(ProductReqDto productDto, User authUser) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setImg(productDto.getImg());
        product.setPrice(productDto.getPrice());
        product.setSeller(authUser);
        return productRepository.save(product);
    }
}
