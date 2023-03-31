package com.mealjung.review.entity;

import com.mealjung.review.controller.dto.ReviewResponse;
import com.mealjung.review.controller.dto.ReviewSearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReviewRepositoryCustom {
    Page<ReviewResponse> search(ReviewSearchCondition condition, Pageable pageable);
}
