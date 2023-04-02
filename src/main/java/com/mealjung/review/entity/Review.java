package com.mealjung.review.entity;

import com.mealjung.common.entity.BaseEntity;
import com.mealjung.review.controller.dto.ReviewSaveRequest;
import com.mealjung.review.controller.dto.ReviewUpdateRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "review")
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;
    private Long menuId;
    private Long restaurantId;
    @Column
    private Long userNo;
    @Column(columnDefinition = "varchar(50)")
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    private boolean isDeleted;

    @Builder
    public Review(Long menuId, Long restaurantId, Long userNo, String title, String content) {
        this.menuId = menuId;
        this.restaurantId = restaurantId;
        this.userNo = userNo;
        this.title = title;
        this.content = content;
    }

    public Review create(ReviewSaveRequest request) {
        return Review.builder()
                .menuId(request.getMenuId())
                .restaurantId(request.getRestaurantId())
                .userNo(request.getUserNo())
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }

    public void update(ReviewUpdateRequest request) {
        this.title = request.getTitle();
        this.content = request.getContent();
    }
}