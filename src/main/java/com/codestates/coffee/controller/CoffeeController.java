package com.codestates.coffee.controller;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.dto.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import com.codestates.coffee.mapper.CoffeeMapper;
import com.codestates.coffee.mapper.CoffeeMapper2;
import com.codestates.coffee.service.CoffeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v5/coffees")
@Validated
public class CoffeeController {
    private final CoffeeService coffeeService;
    private final CoffeeMapper coffeeMapper;

    public CoffeeController(CoffeeService coffeeService, CoffeeMapper coffeeMapper){
        this.coffeeService = coffeeService;
        this.coffeeMapper = coffeeMapper;
    }

    @PostMapping
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
//        Coffee coffee = coffeeMapper.coffeePostDtoToCoffee(coffeePostDto);
//        Coffee response = coffeeService.createCoffee(coffee);
//        CoffeeResponseDto coffeeResponseDto = coffeeMapper.coffeeToCoffeeResponseDto(response);

        CoffeeResponseDto coffeeResponseDto = coffeeMapper.coffeeToCoffeeResponseDto(coffeeService.createCoffee(coffeeMapper.coffeePostDtoToCoffee(coffeePostDto)));

        return new ResponseEntity<>(coffeeResponseDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") @Positive long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);

        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
//        Coffee coffee = coffeeMapper.coffeePatchDtoToCoffee(coffeePatchDto);
//        Coffee response = coffeeService.updateCoffee(coffee);
//        CoffeeResponseDto coffeeResponseDto = coffeeMapper.coffeeToCoffeeResponseDto(response);
//
        CoffeeResponseDto coffeeResponseDto = coffeeMapper.coffeeToCoffeeResponseDto(coffeeService.updateCoffee(coffeeMapper.coffeePatchDtoToCoffee(coffeePatchDto)));

        return new ResponseEntity<>(coffeeResponseDto, HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.


//        coffeeService.findCoffee(coffeeId);

        CoffeeResponseDto coffeeResponseDto = coffeeMapper.coffeeToCoffeeResponseDto(coffeeService.findCoffee(coffeeId));
        return new ResponseEntity<>(coffeeResponseDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        coffeeService.findCoffees();
        List<Coffee> coffees = coffeeService.findCoffees();
        List<CoffeeResponseDto> coffeeResponseDtoList = coffees.stream().map(coffee -> coffeeMapper.coffeeToCoffeeResponseDto(coffee))
                        .collect(Collectors.toList());
        List<CoffeeResponseDto> list = new ArrayList<>();
        coffees.stream().forEach(coffee ->
                list.add(coffeeMapper.coffeeToCoffeeResponseDto(coffee))
                );
//        for(Coffee coffee : coffees){
//            CoffeeResponseDto dto = coffeeMapper.coffeeToCoffeeResponseDto(coffee);
//            list.add(dto);
//
//            for(int i = 0; i < coffees.size(); i++){
//                CoffeeResponseDto dto2 = coffeeMapper.coffeeToCoffeeResponseDto(coffees.get(i));
//                list.add(dto2);
//            }
//        }
//        coffeeMapper.coffeeToCoffeeResponseDto();
        return new ResponseEntity<>(coffeeResponseDtoList, HttpStatus.OK);
    }

    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        coffeeService.deleteCoffee(coffeeId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
