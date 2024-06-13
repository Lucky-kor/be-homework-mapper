package com.codestates.coffee;

import com.codestates.member.controller.MemberController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
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
        Coffee coffee = coffeeMapper.coffeePostDtoToCoffee(coffeePostDto);
//        coffeePostDto를 받아서 Coffee Entity로 매핑해서 Coffee 엔티티에 할당해줌
        Coffee PostResponse = coffeeService.createCoffee(coffee);
//        위 단계에서 할당된 Dto를 Service계층에서 createCoffee() 메서드를 실행하여
//        Entity로 response에 할당
        return new ResponseEntity<>(coffeeMapper.coffeeToCoffeeResponseDto(PostResponse), HttpStatus.CREATED);
//    할당된 response는 Entity이기때문에 Mapper를 이용하여 CoffeeResponseDto로 변환해줌
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") @Positive long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);

        // TODO CoffeeService 클래스와 연동하세요.
        Coffee updateResponse = coffeeService.updateCoffee(coffeeMapper.coffeePatchDtoToCoffee(coffeePatchDto));
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        return new ResponseEntity<>(coffeeMapper.coffeeToCoffeeResponseDto(updateResponse), HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        Coffee findResponse = coffeeService.findCoffee(coffeeId);
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.

        return new ResponseEntity<>(coffeeMapper.coffeeToCoffeeResponseDto(findResponse),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        // TODO CoffeeService 클래스와 연동하세요.
        List<Coffee> coffeeList = coffeeService.findCoffees();
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
        return new ResponseEntity<>(coffeeMapper.coffeeToCoffeeResponseDtos(coffeeList),HttpStatus.OK);
    }

    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        // TODO CoffeeService 클래스와 연동하세요.
        // TODO DTO <-> Entity 변환 Mapper를 적용하세요.
        coffeeService.deleteCoffee(coffeeId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
