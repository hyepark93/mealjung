package com.mealjung.restaurant.entity;

import com.mealjung.common.utils.converter.EnumType;
import lombok.Getter;

@Getter
public enum DtlState implements EnumType {
    NORMAL("01", "정상"),
    BREAK("02", "영업중지"),
    TERMINATION("03", "폐업"),
    STAY("04", "점검중"),
    NOT_OPENED_YET("05", "미개업");

    private String code;
    private String value;

    DtlState(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
