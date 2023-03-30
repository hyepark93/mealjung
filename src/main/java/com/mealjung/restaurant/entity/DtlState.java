package com.mealjung.restaurant.entity;

import lombok.Getter;

@Getter
public enum DtlState {
    NORMAL("01", "정상"),
    BREAK("02", "영업중지"),
    TERMINATION("03", "폐업"),
    STAY("04", "점검중"),
    NOT_OPENED_YET("05", "미개업");

    private String code;
    private String name;

    DtlState(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
