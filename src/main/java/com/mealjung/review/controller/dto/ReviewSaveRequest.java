package com.mealjung.review.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class ReviewSaveRequest {
    private Long menuId;
    private Long restaurantId;
    @NotNull
    private Long userNo;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
