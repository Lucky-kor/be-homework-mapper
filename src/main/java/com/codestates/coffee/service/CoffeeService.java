package com.codestates.coffee.service;

import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    //postCoffee
    public Coffee createCoffee(Coffee coffee){
        return coffee;
    }
    //patchCoffee
    public Coffee updateCoffee(Coffee coffee){
        return coffee;
    }

    //getCoffee
    public Coffee findCoffee(long coffeeId){
        //더미데이터

        Coffee coffee = new Coffee(coffeeId, "아메리카노", "Americano" , 2500);
        return coffee;
    }

    //getCoffees
    public List<Coffee> findCoffees(){
        List<Coffee> coffees = List.of(
                new Coffee(1L, "아메리카노", "Americano", 2500),
                new Coffee(2L, "캐러멜 라떼", "Caramel Latte", 5000)
        );
        return coffees;
    }


    //deleteCoffee
    public void deleteCoffee(long coffeeId){

    }

}
