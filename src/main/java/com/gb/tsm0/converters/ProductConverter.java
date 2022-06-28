package com.gb.tsm0.converters;

import com.gb.tsm0.dto.ProductDto;
import com.gb.tsm0.entities.Product;

public class ProductConverter {

    public ProductDto entityToDto(Product product){
        return new ProductDto(product.getId(), product.getTitle(), product.getCost());
    }

    public Product dtoToEntity(ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setCost(productDto.getCost());
        return product;
    }
}
