package com.mealjung.restaurant.entity;

import com.mealjung.restaurant.controller.dto.RestaurantResponse;
import com.mealjung.restaurant.controller.dto.RestaurantSearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestaurantRepositoryCustom {
    Page<RestaurantResponse> search(RestaurantSearchCondition condition, Pageable pageable);
}
