package com.codestates.coffee;

import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "Spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeeToCoffeeResponseDto(List<Coffee> coffees);
}
