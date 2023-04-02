package com.mealjung.review.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {

    @Modifying
    @Query("update Review r set r.isDeleted = true where r.id = :id")
    void updateIsDeleted(@Param("id") Long id);
}