package com.mealjung.review.service;

import com.mealjung.common.page.PageRequest;
import com.mealjung.common.page.PageResponse;
import com.mealjung.review.controller.dto.ReviewResponse;
import com.mealjung.review.controller.dto.ReviewSearchCondition;
import com.mealjung.review.controller.dto.ReviewUpdateRequest;
import com.mealjung.review.entity.Review;
import com.mealjung.review.entity.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Transactional(readOnly = true)
    public PageResponse<ReviewResponse> findByCondition(ReviewSearchCondition condition) {
        return new PageResponse<>(reviewRepository.search(condition, new PageRequest(condition.getPage()).of()));
    }

    @Transactional
    public Long update(Long id, ReviewUpdateRequest request) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id = " + id));
        review.update(request);
        return review.getId();
    }

    @Transactional
    public Long sofeDelete(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id = " + id));
        reviewRepository.updateIsDeleted(review.getId());
        return review.getId();
    }
}
