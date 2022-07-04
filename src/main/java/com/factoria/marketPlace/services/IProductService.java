package com.factoria.marketPlace.services;

import com.factoria.marketPlace.dto.ProductReqDto;
import com.factoria.marketPlace.models.Product;
import com.factoria.marketPlace.models.User;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product create(ProductReqDto productDto, User authUser);
}
