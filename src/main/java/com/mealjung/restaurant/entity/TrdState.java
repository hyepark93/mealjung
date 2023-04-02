package com.mealjung.restaurant.entity;

import com.mealjung.common.utils.converter.EnumType;
import lombok.Getter;

@Getter
public enum TrdState implements EnumType {
    NORMAL("01", "정상"),
    SUSPEND("02", "휴업"),
    CLOSE("03", "폐업");

    private String code;
    private String value;

    TrdState(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
