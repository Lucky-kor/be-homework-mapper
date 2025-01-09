package com.codestates.coffee.service;

import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    public Coffee createCoffee(Coffee coffee) {
        return coffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        return coffee;
    }

    public Coffee findCoffee(long coffeeId) {
        Coffee coffee = new Coffee(
               coffeeId, "아메리카노", "Americano", 2500
        );

        return coffee;
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(1L,"아메리카노", "Americano", 2500));
        Coffee coffee = new Coffee(
                2L, "캐러멜 라떼", "Caramel Latte", 5000
        );
        coffees.add(coffee);
        return coffees;
    }

    public void deleteCoffee(long coffeeId){

    }
}
