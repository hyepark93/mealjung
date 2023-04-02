package com.mealjung.review.entity;

import com.mealjung.config.querydsl.QuerydslRepositorySupport;
import com.mealjung.review.controller.dto.ReviewResponse;
import com.mealjung.review.controller.dto.ReviewSearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepositoryImpl extends QuerydslRepositorySupport implements ReviewRepositoryCustom {
    public ReviewRepositoryImpl() {
        super(Review.class);
    }

    @Override
    public Page<ReviewResponse> search(ReviewSearchCondition condition, Pageable pageable) {
        return null;
    }
}
