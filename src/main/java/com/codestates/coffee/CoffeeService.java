package com.codestates.coffee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee) {
        // TODO should business logic

        // TODO Coffee 객체는 나중에 DB에 저장 후, 되돌려 받는 것으로 변경 필요.
        Coffee createdCoffee = coffee;
        return createdCoffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        // TODO should business logic

        // Coffee 객체는 나중에 DB에 업데이트 후, 되돌려 받는 것으로 변경 필요.
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }

    public Coffee findCoffee(long coffeeId) {
        // TODO should business logic

        // TODO Coffee 객체는 나중에 DB에서 조회 하는 것으로 변경 필요.
        Coffee coffee =
                new Coffee(coffeeId, "녹차 라떼", "Nokcha Latte", 5000);
        return coffee;
    }

    public List<Coffee> findCoffees() {
        // TODO should business logic

        // TODO Coffee 객체는 나중에 DB에서 조회하는 것으로 변경 필요.
        List<Coffee> coffees = List.of(
                new Coffee(1, "바닐라 라떼", "Banila Lattee", 4500),
                new Coffee(2, "아메리카노", "Americano", 3000),
                new Coffee(3, "녹차 라떼", "Nokcha Latte", 5000)

        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId) {
        // TODO should business logic
    }
}
