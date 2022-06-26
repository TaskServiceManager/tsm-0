package com.gb.tsm0.controllers;

import com.gb.tsm0.converters.FruitConverter;
import com.gb.tsm0.dto.FruitDto;
import com.gb.tsm0.entities.Fruit;
import com.gb.tsm0.repositories.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/fruit")
@RequiredArgsConstructor
public class FruitController {

    private final FruitRepository fruitRepository;
    private final FruitConverter converter;

    //create+update
    @PostMapping
    public void addFruit(@RequestBody FruitDto fruitDto) {
        fruitRepository.save(converter.dtoToEntity(fruitDto));
    }

    //read
    @GetMapping()
    public List<String> getAllFruit() {
        return fruitRepository.findAll().stream().map(Fruit::getName).collect(Collectors.toList());
    }

    //delete
    @GetMapping("/delete/{id}")
    public void deleteFruit(@PathVariable Long id) {
        fruitRepository.deleteById(id);
    }

}
