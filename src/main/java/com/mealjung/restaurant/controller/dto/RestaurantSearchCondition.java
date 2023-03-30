package com.mealjung.restaurant.controller.dto;

import lombok.Getter;

@Getter
public class RestaurantSearchCondition {
    private String name;
    private Integer page;

    public RestaurantSearchCondition(String name, Integer page) {
        this.name = name;
        this.page = page;
    }
}