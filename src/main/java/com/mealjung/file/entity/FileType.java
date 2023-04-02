package com.mealjung.file.entity;

import com.mealjung.common.utils.converter.EnumType;
import lombok.Getter;

@Getter
public enum FileType implements EnumType {
    RESTAURANT("restaurant", "식당"),
    REVIEW("review", "리뷰");

    String code;
    String value;

    FileType(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
