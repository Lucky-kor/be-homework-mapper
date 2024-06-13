package com.codestates.coffee;

import lombok.Getter;

@Getter
public class Coffee {
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;
    public Coffee(long coffeeID, String korName, String engName, int price){
        this.coffeeId = coffeeID;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
    }
}
