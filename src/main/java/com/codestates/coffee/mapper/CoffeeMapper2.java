package com.codestates.coffee.mapper;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.dto.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMapper2 {
    public Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto) {
        Coffee coffee = new Coffee(
                0, coffeePostDto.getKorName(), coffeePostDto.getEngName(), coffeePostDto.getPrice()
        );
        return coffee;
    }
    public Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto) {
        // DTO에서 받는 데이터만 바꿔줘야함
        //id 있어야함
        Coffee coffee = new Coffee();
        coffee.setCoffeeId(coffeePatchDto.getCoffeeId());
        coffee.setPrice(coffeePatchDto.getPrice());
        coffee.setKorName(coffeePatchDto.getKorName());
        coffee.setEngName(coffeePatchDto.getEngName());
        return coffee;
    }

    public CoffeeResponseDto coffeeToCoffeeResponseDto (Coffee coffee){
        CoffeeResponseDto coffeeResponseDto = new CoffeeResponseDto(
                coffee.getCoffeeId(), coffee.getKorName(), coffee.getEngName(), coffee.getPrice()
        );
        return coffeeResponseDto;
    }
}
