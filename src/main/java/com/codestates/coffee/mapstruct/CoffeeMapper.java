package com.codestates.coffee.mapstruct;


import com.codestates.coffee.Coffee;
import com.codestates.coffee.CoffeePatchDto;
import com.codestates.coffee.CoffeePostDto;
import com.codestates.coffee.CoffeeResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

//맵퍼 구현
@Mapper (componentModel = "spring")
public interface CoffeeMapper {
        Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
        Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
        CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
        List<CoffeeResponseDto> coffeesToCoffeeResponseToDtos(List<Coffee> coffees);
}

