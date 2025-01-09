package com.codestates.coffee.service;

import com.codestates.coffee.Mapper.CoffeeMapper;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.entity.Coffee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee) {
        Coffee createCoffee = coffee;

        return createCoffee;
    }

    public Coffee updateCoffee(Coffee coffee) {

        Coffee updateCoffee = coffee;

        return updateCoffee;
    }

    public Coffee findCoffee(long coffeeId) {

        Coffee coffee = new Coffee(1L, "아메리카노", "Americano", 2500);
        return coffee;
    }
    public List<Coffee> findCoffees() {

        List<Coffee> coffees = List.of(
                new Coffee(1L, "아메리카노", "Americano", 2500),
                new Coffee(2L, "캐러맬 라떼", "Caramel Latte", 5000)
        );
        return coffees;
    }
    public void deleteCoffee(long coffeeId) {

    }
}
