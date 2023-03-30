package com.mealjung.restaurant.entity;

import lombok.Getter;

@Getter
public enum UpTaenm {
    RESTAURANT("01", "음식점"),
    CAFE("02", "카페"),
    BAR("03", "주점"),
    ETC("04", "기타");

    private String code;
    private String name;

    UpTaenm(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
