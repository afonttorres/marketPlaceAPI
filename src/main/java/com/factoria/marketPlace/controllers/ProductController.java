package com.factoria.marketPlace.controllers;

import com.factoria.marketPlace.dto.ProductReqDto;
import com.factoria.marketPlace.models.Product;
import com.factoria.marketPlace.models.User;
import com.factoria.marketPlace.services.IProductService;
import com.factoria.marketPlace.services.IUserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

     IProductService productService;
     IUserService userService;

     public ProductController(IProductService productService, IUserService userService){
         this.productService = productService;
         this.userService = userService;
     }


    @GetMapping("/products")
    List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/products")
    Product create(@RequestBody ProductReqDto productDto){
         User authUser = this.getAuth();
         return productService.create(productDto, authUser);
    }

    @DeleteMapping("/product/{id}")
    Product delete(@PathVariable Long id){
         return productService.delete(id);
    }

    private User getAuth(){
         return userService.getById(1L);
    }
}
