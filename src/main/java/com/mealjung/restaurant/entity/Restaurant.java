package com.mealjung.restaurant.entity;

import com.mealjung.common.entity.BaseTimeEntity;
import com.mealjung.restaurant.controller.dto.RestaurantUpdateRequest;
import com.mealjung.review.entity.Review;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "restaurant")
public class Restaurant extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long id;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @Column(columnDefinition = "varchar(50)")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(2)")
    private District district; // 지역

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(2)")
    private TrdState trdstategbn; // 영업상태코드

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(2)")
    private DtlState dtlstategbn; // 상세영업상태코드

    @Column(columnDefinition = "varchar(20)")
    private String sitetel; // 전화번호

    @Column(columnDefinition = "varchar(200)")
    private String sitewhladdr; // 지번주소

    @Column(columnDefinition = "varchar(200)")
    private String rdnwhladdr; // 도로명주소

    @Column(columnDefinition = "varchar(5)")
    private String rdnpostno; // 도로명우편번호

    @Column(columnDefinition = "varchar(100)")
    private String bplcnm; // 사업장명

    @Column(columnDefinition = "datetime")
    private LocalDateTime lastmodts; // 최종 수정일자

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20)")
    private UpTaenm uptaenm; // 업태구분명

    @Column(columnDefinition = "double")
    private double x; // x 좌표

    @Column(columnDefinition = "double")
    private double y; // y 좌표

    @Column(columnDefinition = "varchar(100)")
    private String homepage; // 홈페이지

    public void update(RestaurantUpdateRequest request) {
        this.district=request.getDistrict();
        this.trdstategbn=request.getTrdstategbn();
        this.dtlstategbn=request.getDtlstategbn();
        this.sitetel=request.getSitetel();
        this.sitewhladdr=request.getSitewhladdr();
        this.rdnwhladdr=request.getRdnwhladdr();
        this.rdnpostno=request.getRdnpostno();
        this.bplcnm=request.getBplcnm();
        this.lastmodts=request.getLastmodts();
        this.uptaenm=request.getUptaenm();
        this.x=request.getX();
        this.y=request.getY();
        this.homepage=request.getHomepage(); // 홈페이지
    }
}