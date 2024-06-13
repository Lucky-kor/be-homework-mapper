package com.codestates.coffee;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee CoffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee CoffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeeToCoffeeList(List<Coffee> coffees);
}
