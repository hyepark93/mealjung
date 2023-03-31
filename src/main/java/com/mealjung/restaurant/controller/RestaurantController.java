package com.mealjung.restaurant.controller;

import com.mealjung.common.page.PageResponse;
import com.mealjung.restaurant.controller.dto.RestaurantResponse;
import com.mealjung.restaurant.controller.dto.RestaurantSearchCondition;
import com.mealjung.restaurant.controller.dto.RestaurantUpdateRequest;
import com.mealjung.restaurant.entity.Restaurant;
import com.mealjung.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/")
    public PageResponse<RestaurantResponse> Restaurants(RestaurantSearchCondition condition) {
        return restaurantService.findByCondition(condition);
    }

    @GetMapping("/{id}") //상세화면
    public RestaurantResponse Restaurant(@PathVariable("id") Long id) {
        return restaurantService.findById(id);
    }

    @PutMapping("/{id}")
    public Long update(@PathVariable("id") Long id, @RequestBody RestaurantUpdateRequest request) {
        return restaurantService.update(id, request);
    }

    @PatchMapping("/{id}")
    public Long softDelete(@PathVariable("id") Long id) {
        return restaurantService.softDelete(id);
    }
}
