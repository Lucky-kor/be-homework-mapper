package com.codestates.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {
    //- coffeeId(커피 식별자): long
    //- korName(한글 커피명): String
    //- engName(영문 커피명): String
    //- price(가격): int
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;
}
