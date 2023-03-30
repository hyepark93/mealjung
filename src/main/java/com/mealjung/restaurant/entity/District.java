package com.mealjung.restaurant.entity;

import lombok.Getter;

@Getter
public enum District {
    GANGNAM("GN", "강남구"),
    GANGDONG("GD", "강동구"),
    GANGBUK("GB", "강북구"),
    GANGSEO("GS", "강서구"),
    GWANAK("GNK", "관악구"),
    GWANGJIN("GJ", "광진구"),
    GURO("GR", "구로구"),
    GEUMCHEON("GCH", "금천구"),
    NOWON("NW", "노원구"),
    DOBONG("DB", "도봉구"),
    DONGDAEMUN("DDM", "동대문구"),
    DONGJAK("DJK", "동작구"),
    MAPO("MP", "마포구"),
    SEODAEMUN("SDM", "서대문구"),
    SEOCHO("SCO", "서초구"),
    SEONGDONG("SD", "성동구"),
    SEONGBUK("SB", "성북구"),
    SONGPA("SP", "송파구"),
    YANGCHEON("YCH", "양천구"),
    YEONGDEUNGPO("YDP", "영등포구"),
    YONGSAN("YS", "용산구"),
    EUNPYEONG("EP", "은평구"),
    JONGNO("JN", "종로구"),
    JUNG("JU", "중구"),
    JUNGNANG("JNGN", "중랑구");
    private String code;
    private String name;

    District(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
