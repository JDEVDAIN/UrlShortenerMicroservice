package com.website.urlshortenerservice;

import com.website.urlshortenerservice.urlshortener.ShortUrl;
import com.website.urlshortenerservice.urlshortener.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("test") // start nur wenn man profile "test" startet, sonst wird ignorier
public class ShortUrlTestData {

    @Autowired
    ShortUrlService shortUrlService;


    @PostConstruct
    public void createTestData() {
        System.out.println("create testdata");
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl("31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl(1L,"31eds","http://www.google.de"));
        shortUrlService.createShortUrl(new ShortUrl(200L,"31eds","http://www.google.de"));
    }
    }