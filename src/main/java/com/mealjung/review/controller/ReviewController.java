package com.mealjung.review.controller;


import com.mealjung.common.page.PageResponse;
import com.mealjung.review.controller.dto.ReviewResponse;
import com.mealjung.review.controller.dto.ReviewSearchCondition;
import com.mealjung.review.controller.dto.ReviewUpdateRequest;
import com.mealjung.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/")
    public PageResponse<ReviewResponse> review(ReviewSearchCondition condition) {
        return reviewService.findByCondition(condition);
    }

    @GetMapping("/{id}")
    public Long update(@PathVariable("id") Long id, @RequestBody ReviewUpdateRequest request) {
        return reviewService.update(id, request);
    }
}
