package com.codestates.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private Integer price;
}
