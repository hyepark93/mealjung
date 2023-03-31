package com.mealjung.review.controller.dto;

import lombok.Getter;

@Getter
public class ReviewSearchCondition {
    private String restaurantId;
    private String menuId;
    private Integer page;

    public ReviewSearchCondition(String restaurantId,String menuId, Integer page) {
        this.restaurantId = restaurantId;
        this.page = page;
    }
}
