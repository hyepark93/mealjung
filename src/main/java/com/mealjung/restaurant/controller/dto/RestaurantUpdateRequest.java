package com.mealjung.restaurant.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class RestaurantUpdateRequest {
    private String district;
    private String trdstategbn;
    private String dtlstategbn;
    private String sitetel;
    private String sitewhladdr;
    private String rdnwhladdr;
    private String rdnpostno;
    private String bplcnm;
    private LocalDateTime lastmodts;
    private String uptaenm;
    private Double x;
    private Double y;
    private String homepage;
}
