package com.codestates.coffee.service;

import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {


    //postcoffee 받음.
    public Coffee createCoffee(Coffee coffee) {
        Coffee createdCoffee = coffee;
        return createdCoffee;
    }

    //patchCoffee 받음.
    public Coffee updateCoffee (Coffee coffee) {
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }

    //getCoffee 하나
    public Coffee findCoffee (long coffeeId) {
        Coffee coffee =
                new Coffee(coffeeId, "아메리카노", "Americano",  2500);
        return coffee;
    }

    // getCoffees  여럿
    public List<Coffee> findCoffees () {
        List<Coffee> coffeeList = List.of (
                new Coffee(1L, "아메리카노", "Americano",  2500),
               new Coffee(2L, "캐러멜 라떼", "Caramel Latte",  5000)

        );
        return coffeeList;
    }

    //Deletecoffee

    public void deleteCoffee(long memberId) {

    }



}
