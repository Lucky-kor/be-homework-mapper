package com.codestates.coffee.MapStruct;

import com.codestates.coffee.Coffee;
import com.codestates.coffee.CoffeePatchDto;
import com.codestates.coffee.CoffeePostDto;
import com.codestates.coffee.CoffeeResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeeResponseDtos(List<Coffee> coffees);
}
