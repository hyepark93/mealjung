package com.mealjung.review.controller.dto;

import com.mealjung.review.entity.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ReviewResponse {
    private Long restaurantId;
    private Long menuId;
    private Long writer;
    private String content;

    @Builder
    public ReviewResponse(Review entity) {
        this.restaurantId = entity.getRestaurantId();
        this.menuId = entity.getMenuId();
        this.writer = entity.getUserNo();
        this.content = entity.getContent();
    }
}