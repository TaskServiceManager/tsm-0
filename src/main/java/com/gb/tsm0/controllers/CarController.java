package com.gb.tsm0.controllers;

import com.gb.tsm0.converters.CarConverter;
import com.gb.tsm0.dto.CarDto;
import com.gb.tsm0.entities.Car;
import com.gb.tsm0.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("car")
@RequiredArgsConstructor
public class CarController {

    private final CarRepository carRepository;
    private final CarConverter carConverter;

    @PostMapping
    public void createCar(@RequestBody CarDto carDto) {
        carRepository.save(carConverter.dtoToEntity(carDto));
    }


    @GetMapping
    public List<String> getAllCars(){
        return carRepository.findAll().stream().map(Car::getName).collect(Collectors.toList());
    }
    @GetMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id){
        carRepository.deleteById(id);
    }


    @GetMapping("/{id}")
    public CarDto getProductById(@PathVariable(name = "id") Long id){
        return carConverter.entityToDto(carRepository.findById(id).get());
    }
}
