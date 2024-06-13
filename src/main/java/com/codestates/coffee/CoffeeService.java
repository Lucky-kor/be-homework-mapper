package com.codestates.coffee;

import com.codestates.member.entity.Member;
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
        return new Coffee(coffeeId, "아메리카노", "Americano", 2500);
    }

    public List<Coffee> findCoffees() {
        return new ArrayList<>(List.of(
                new Coffee(1, "아메리카노", "Americano", 2500),
                new Coffee(2, "캐러멜 라떼", "Caramel Latte", 5000)
        ));
    }

    public void deleteCoffee(long coffeeId) {

    }
}
