package com.codestates.coffee.service;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee){
        return coffee;
    }

    public Coffee updateCoffee(Coffee coffee){
        return coffee;
    }

    public Coffee findCoffee(long coffeeId){
        Coffee coffee = new Coffee(coffeeId, "아메리카노", "Americano", 2500);
        return coffee;
    }

    public List<Coffee> findCoffees(){
        List<Coffee> coffees = List.of(
         new Coffee (1l, "아메리카노", "Americano", 2500),
         new Coffee(2l, "캐러멜 라떼", "Caramel Latee", 5000)
        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId){

    }
}
