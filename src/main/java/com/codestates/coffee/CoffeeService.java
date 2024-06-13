package com.codestates.coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee){
        Coffee createCoffee = coffee;
        return createCoffee;
    }
    public Coffee updateCoffee(Coffee coffee){
        Coffee updateCoffee = coffee;
        return coffee;
    }
    public Coffee findCoffee(long coffeeId){
        return new Coffee(coffeeId,"아메리카노","Americano",2500);
    }

    public List<Coffee> findCoffees(){
      List<Coffee>coffees = List.of(
              new Coffee(1,"아메리카노","Americano",2500),
              new Coffee(2,"캐러멜라떼","Caramel Latte",5000));

      return coffees;
    }
    public void deleteCoffee(long coffeeId){

    }
}
