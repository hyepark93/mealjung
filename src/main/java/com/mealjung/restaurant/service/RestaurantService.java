package com.mealjung.restaurant.service;

import com.mealjung.common.page.PageRequest;
import com.mealjung.common.page.PageResponse;
import com.mealjung.restaurant.controller.dto.RestaurantResponse;
import com.mealjung.restaurant.controller.dto.RestaurantSearchCondition;
import com.mealjung.restaurant.controller.dto.RestaurantUpdateRequest;
import com.mealjung.restaurant.entity.Restaurant;
import com.mealjung.restaurant.entity.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Transactional
    public PageResponse<RestaurantResponse> findByCondition(RestaurantSearchCondition condition) {
        return new PageResponse<>(restaurantRepository.search(condition, new PageRequest(condition.getPage()).of()));
    }

    @Transactional
    public RestaurantResponse findById(Long id) {
        return new RestaurantResponse(restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 식당이 없습니다. id = " + id)));
    }

    @Transactional
    public Long update(Long id, @RequestBody RestaurantUpdateRequest request) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 식당이 없습니다. id = " + id));
        restaurant.update(request);
        return restaurant.getId();
    }

    @Transactional
    public Long softDelete(Long id) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 식당이 없습니다. id = " + id));
        restaurantRepository.updateIsDeleted(restaurant.getId());
        return restaurant.getId();
    }
}
