package com.example.ProductCatlogService.DTOs;

import lombok.Builder;

@Builder
public record ProductDTO(Long id,String Name,String Description,Double price) {
}
