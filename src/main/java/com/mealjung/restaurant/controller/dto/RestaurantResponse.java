package com.mealjung.restaurant.controller.dto;

import com.mealjung.restaurant.entity.DtlState;
import com.mealjung.restaurant.entity.Restaurant;
import com.mealjung.review.entity.Review;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class RestaurantResponse {

    private List<Review> reviews;
    private String name;
    private String trdstategbn;
    private String dtlstategbn;
    private String sitetel;
    private String sitewhladdr;
    private String rdnwhladdr;
    private String rdnpostno;
    private String bplcnm;
    private LocalDateTime lastmodts;
    private String uptaenm;
    private double x;
    private double y;
    private String homepage;

    @Builder
    @QueryProjection
    public RestaurantResponse(Restaurant entity) {
        this.reviews = entity.getReviews();
        this.name = entity.getName();
        this.trdstategbn = entity.getTrdstategbn().getName();
        this.dtlstategbn = entity.getDtlstategbn().getName();
        this.sitetel = entity.getSitetel();
        this.sitewhladdr = entity.getSitewhladdr();
        this.rdnwhladdr = entity.getRdnwhladdr();
        this.rdnpostno = entity.getRdnpostno();
        this.bplcnm = entity.getBplcnm();
        this.lastmodts = entity.getLastmodts();
        this.uptaenm = entity.getUptaenm().getName();
        this.x = entity.getX();
        this.y = entity.getY();
        this.homepage = entity.getHomepage();
    }
}
