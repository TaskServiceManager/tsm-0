package com.gb.tsm0.converters;

import com.gb.tsm0.dto.CarDto;
import com.gb.tsm0.entities.Car;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {
    public Car dtoToEntity(CarDto dto){
        Car  car = new Car();
        car.setId(dto.getId());
        car.setName(dto.getName());
        car.setBody(dto.getBody());
        car.setColor(dto.getColor());
        return car;
    }

    public CarDto entityToDto(Car car){
        return new CarDto(car.getId(), car.getName(), car.getBody(),car.getColor());
    }

}
