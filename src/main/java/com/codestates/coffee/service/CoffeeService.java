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
        // member 객체는 나중에 DB에 업데이트 후, 되돌려 받는 것으로 변경 필요.
        return updatedCoffee;
    }

    public Coffee findCoffee(long coffeeID){
        Coffee coffee = new Coffee(coffeeID, " Americano","아메리카노",2500);
        return coffee;
    }

    public List<Coffee> findCoffees(){
        List<Coffee> coffees = List.of(
                new Coffee(1L,"아메리카노","Americano",2500),
                new Coffee(2L,"캐러멜 라떼","Caramel Latte",5000)
        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId){

    }
}
