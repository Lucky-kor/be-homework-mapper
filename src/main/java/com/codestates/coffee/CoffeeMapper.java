package com.codestates.coffee;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToResponseDto(Coffee coffee);
    List<CoffeeResponseDto>coffeesToCoffeeResponseDtos(List<Coffee>coffees);
}
