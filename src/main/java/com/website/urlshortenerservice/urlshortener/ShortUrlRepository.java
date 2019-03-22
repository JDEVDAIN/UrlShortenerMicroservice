package com.website.urlshortenerservice.urlshortener;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    List<ShortUrl> findAll();
    @Query(value = "SELECT currval(:sequenceName)", nativeQuery = true)
    long getSequenceCurrValLong(@Param("sequenceName") String sequenceName);
    }
