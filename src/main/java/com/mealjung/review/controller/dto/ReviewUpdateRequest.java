package com.mealjung.review.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class ReviewUpdateRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
