package com.codestates.coffee.mapper;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.dto.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToMember(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoMember(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToMemberResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeeToMemberResponseDtos(List<Coffee> coffees);
}
