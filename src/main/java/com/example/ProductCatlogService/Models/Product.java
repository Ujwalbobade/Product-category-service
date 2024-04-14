package com.example.ProductCatlogService.Models;

import lombok.Data;

import java.util.List;

@Data
public class Product extends BaseModel
{
    private String Name;
    private String Description;
    private Double Price;

    private List<Product> Products;

}
