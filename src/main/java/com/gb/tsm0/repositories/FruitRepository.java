package com.gb.tsm0.repositories;

import com.gb.tsm0.entities.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
}
