package com.mealjung.review.controller.dto;

import com.mealjung.review.entity.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ReviewResponse {
    private Long id;
    private Long restaurantId;
    private String writer;
    private String content;
    private LocalDateTime regDate;
    private double rating;

    @Builder
    public ReviewResponse(Review entity) {
        this.id = entity.getId();
        this.restaurantId = entity.getRestaurant().getId();
        this.writer = entity.getWriter();
        this.content = entity.getContent();
        this.regDate = entity.getRegDate();
        this.rating = entity.getRating();
    }
}