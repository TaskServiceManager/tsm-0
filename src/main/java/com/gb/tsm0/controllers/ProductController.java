package com.gb.tsm0.controllers;

import com.gb.tsm0.converters.ProductConverter;
import com.gb.tsm0.dto.ProductDto;
import com.gb.tsm0.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    @GetMapping
    public List<ProductDto> getAllProducts(){
        return productRepository.findAll().stream().map(productConverter::entityToDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable(name = "id") Long id){
        return productConverter.entityToDto(productRepository.findById(id).get());
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto){
        productRepository.save(productConverter.dtoToEntity(productDto));
    }

    @GetMapping("/delete/{id}")
    public void deleteProduct(@PathVariable(name = "id") Long id){
        productRepository.deleteById(id);
    }
}

