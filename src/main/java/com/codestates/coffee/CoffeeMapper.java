package com.codestates.coffee;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
}
