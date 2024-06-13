package com.codestates.coffee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    public  Coffee createCoffee(Coffee coffee){
        Coffee createCoffee = coffee;
        return createCoffee;
    }
    public  Coffee updateCoffee(Coffee coffee){
        Coffee updateCoffee = coffee;
        return updateCoffee;
    }

    public Coffee findCoffee(long coffeeId){
        //- coffeeId(커피 식별자): long
        //- korName(한글 커피명): String
        //- engName(영문 커피명): String
        //- price(가격): int
        Coffee coffee =
                new Coffee(coffeeId,"아메리카노", "Americano", 2500 );
        return coffee;
    }

    public List<Coffee>  findCoffees(){
        List<Coffee> coffees = List.of(
                new Coffee(1L, "아메리카노", "Americano", 2500),
                new Coffee(2L,"캐러멜 라떼", "Caramel Latte",  5000)
        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId){}

}
