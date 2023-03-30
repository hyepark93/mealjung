package com.mealjung.restaurant.entity;

import lombok.Getter;

@Getter
public enum TrdState {
    NORMAL("01", "정상"),
    SUSPEND("02", "휴업"),
    CLOSE("03", "폐업");

    private String code;
    private String name;

    TrdState(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
