package com.codestates.coffee.mapper;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.dto.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {

    Coffee coffeePostToCoffeeDto(CoffeePostDto coffeePostDto);
    Coffee coffeePatchToCoffeeDto(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeResponseDto(Coffee coffee);
}
