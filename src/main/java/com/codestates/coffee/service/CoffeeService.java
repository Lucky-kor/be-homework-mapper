package com.codestates.coffee.service;

import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee){
        Coffee createdCoffee = coffee;
        return createdCoffee;
    }
    public Coffee updateCoffee(Coffee coffee){
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }
    public Coffee findCoffee(long coffeeId){
        Coffee coffee=
                new Coffee(coffeeId, "바닐라 라떼", "Vanila Latte", 2700);
        return coffee;
    }
    public List<Coffee> findCoffees(){
        List<Coffee> coffees =List.of(
                new Coffee(1, "바닐라 라떼", "Vanila Latte", 2700),
                new Coffee(2, "아이스 아메리카노", "Ice Americano", 2000),
                new Coffee(3, "아이스 라떼", "Ice Latte", 2500)
        );
        return coffees;
    }
    public void deleteCoffee(long coffeeId){

    }
}
