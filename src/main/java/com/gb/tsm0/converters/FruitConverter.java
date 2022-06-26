package com.gb.tsm0.converters;

import com.gb.tsm0.dto.FruitDto;
import com.gb.tsm0.entities.Fruit;
import org.springframework.stereotype.Component;

@Component
public class FruitConverter {

    public Fruit dtoToEntity(FruitDto fruitDto) {
        Fruit fruit = new Fruit();
        fruit.setId(fruitDto.getId());
        fruit.setName(fruitDto.getName());
        return fruit;
    }
}
