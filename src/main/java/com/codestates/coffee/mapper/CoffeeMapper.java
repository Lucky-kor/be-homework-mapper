package com.codestates.coffee.mapper;

import com.codestates.coffee.CoffeePatchDto;
import com.codestates.coffee.CoffeePostDto;
import com.codestates.coffee.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToMember (CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToMember (CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeesToCoffeeResponseDtoList (List<Coffee> coffeeList);

}
