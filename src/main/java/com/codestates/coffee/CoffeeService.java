package com.codestates.coffee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
        Coffee coffee = new Coffee(coffeeId,"아메리카노","Americano",2500);
        return coffee;
    }

    public List<Coffee> findCoffees(){
        List<Coffee> Coffees = List.of(
                new Coffee(1,"아메리카노","Americano",2500),
                new Coffee(2,"카라멜라떼","Caramel Latte",5000)
        );
        return Coffees;
    }

    public void deleteCoffee(long coffeeId){

    }

}
