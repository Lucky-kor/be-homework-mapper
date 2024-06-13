package com.codestates.coffee;

import com.codestates.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v5/coffees")
@Validated
public class CoffeeController {
    private final CoffeeService coffeeService;
    private final CoffeeMapper mapper;
    private final MemberService memberService;

    public CoffeeController(CoffeeService coffeeService, CoffeeMapper mapper, MemberService memberService) {
        this.coffeeService = coffeeService;
        this.mapper = mapper;
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        Coffee coffee = mapper.coffeePostDtoToCoffee(coffeePostDto);
        Coffee coffeeResponse = coffeeService.createCoffee(coffee);
        CoffeeResponseDto coffeeResponseDto = mapper.coffeeToCoffeeResponseDto(coffeeResponse);

        return new ResponseEntity<>(coffeeResponseDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") @Positive long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);

        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
        Coffee coffee = mapper.coffeePatchDtoToCoffee(coffeePatchDto);
        Coffee coffeeResponse = coffeeService.updateCoffee(coffee);
        CoffeeResponseDto coffeeResponseDto = mapper.coffeeToCoffeeResponseDto(coffeeResponse);

        return new ResponseEntity<>(coffeeResponse, HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
        Coffee coffee = coffeeService.findCoffee(coffeeId);
        CoffeeResponseDto coffeeResponseDto = mapper.coffeeToCoffeeResponseDto(coffee);

        return new ResponseEntity<>(coffeeResponseDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
        List<Coffee> coffees = coffeeService.findCoffees();

        List<CoffeeResponseDto> coffeeResponseDtos = mapper.coffeeToCoffeeResponseDtos(coffees);
        return new ResponseEntity<>(coffeeResponseDtos, HttpStatus.OK);
    }

    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
