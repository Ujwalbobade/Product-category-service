package com.example.ProductCatlogService.Controller;

import com.example.ProductCatlogService.DTOs.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
    @GetMapping("/All")
    public String getAllproduct(){
        return "all products ";
    }

    @GetMapping("{id}")
    public ProductDTO setProduct(@PathVariable("id") Long productId){
        ProductDTO newproduct = ProductDTO.builder().id(productId).Name("Ujwal").price(1000000D).Description("Iphone 15").build();
        return newproduct;


    }
    @PostMapping()
    public ProductDTO createdproduct(@RequestBody ProductDTO p){
        return p;
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteProductwithID(@PathVariable("id") Long productId){
        return "product with ID "+productId+"is deleted";
    }

    @PatchMapping("/update/{id}")
    public String updateDetails(@PathVariable("id") Long productId){
        return "product has been updated with id "+productId+".";
    }
}
