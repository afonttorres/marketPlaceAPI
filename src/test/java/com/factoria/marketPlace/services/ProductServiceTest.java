package com.factoria.marketPlace.services;

import com.factoria.marketPlace.dto.ProductReqDto;
import com.factoria.marketPlace.models.Product;
import com.factoria.marketPlace.models.User;
import com.factoria.marketPlace.repositories.IProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Mock
    IProductRepository productRepository;


    @Test
    void getAllReturnsListOfProducts() {
        var productService = new ProductService(productRepository);
        var productList = List.of(new Product(), new Product());
        Mockito.when(productRepository.findAll()).thenReturn(productList);

        var sut = productService.getAll().size();
        assertThat(sut, equalTo(2));
    }

    @Test
    void createSaveNewProductMappedFromDTO() {
        var productService = new ProductService(productRepository);
        var productReq = new ProductReqDto("pructe 1", "img.png", 5D);
        var seller = new User();
        seller.setId(1L);
        var product = new Product();
        product.setImg("Prod");
        product.setName("nom");
        product.setPrice(5D);
        product.setSeller(seller);
        product.setId(1L);
        Mockito.when(productRepository.save(any(Product.class))).thenReturn(product);

        var sut = productService.create(productReq, seller);

        assertThat(sut.getSeller(), equalTo(seller));
    }

    @Test
    void delete() {
    }
}