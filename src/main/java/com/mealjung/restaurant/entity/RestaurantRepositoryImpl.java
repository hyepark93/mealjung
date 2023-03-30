package com.mealjung.restaurant.entity;

import com.mealjung.config.querydsl.QuerydslRepositorySupport;
import com.mealjung.restaurant.controller.dto.QRestaurantResponse;
import com.mealjung.restaurant.controller.dto.RestaurantResponse;
import com.mealjung.restaurant.controller.dto.RestaurantSearchCondition;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import static com.mealjung.restaurant.entity.QRestaurant.restaurant;
import static org.springframework.util.StringUtils.hasText;

@Repository
public class RestaurantRepositoryImpl extends QuerydslRepositorySupport implements RestaurantRepositoryCustom {
    public RestaurantRepositoryImpl() {
        super(Restaurant.class);
    }

    @Override
    public Page<RestaurantResponse> search(RestaurantSearchCondition condition, Pageable pageable) {
        return applyPagination(pageable,
                contentQuery -> contentQuery
                        .select(new QRestaurantResponse(restaurant))
                        .from(restaurant)
                        .where(
                                nameContains(condition.getName())
                        ),
                countQuery -> countQuery
                        .select(restaurant.count())
                        .from(restaurant)
                        .where(
                                nameContains(condition.getName())
                        ));

    }
    private BooleanExpression nameContains(String name) {
        return hasText(name) ? restaurant.name.contains(name) : null;
    }
}
