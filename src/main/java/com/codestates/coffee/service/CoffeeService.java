package com.codestates.coffee.service;

import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

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
        Coffee coffee = new Coffee(coffeeId, "카푸치노", "Cappuccino" ,3500);
        return coffee;
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = List.of(
                new Coffee(1, "카푸치노", "Cappuccino", 3500),
                new Coffee(2, "카페모카", "Cafe Mocha", 3000)
        );

        return coffees;
    }

    public void deleteCoffees(long coffeeId) {

    }
}
