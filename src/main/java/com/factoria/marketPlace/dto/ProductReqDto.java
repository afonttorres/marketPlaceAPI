package com.factoria.marketPlace.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductReqDto {
    private String name;
    private String img;
    private Double price;
}
