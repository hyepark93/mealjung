package com.mealjung.restaurant.entity;

import com.mealjung.common.utils.converter.EnumType;
import lombok.Getter;

@Getter
public enum UpTaenm implements EnumType {
    RESTAURANT("01", "음식점"),
    CAFE("02", "카페"),
    BAR("03", "주점"),
    ETC("04", "기타");

    private String code;
    private String value;

    UpTaenm(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
