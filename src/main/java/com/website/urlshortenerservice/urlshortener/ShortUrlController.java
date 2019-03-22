package com.website.urlshortenerservice.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s")
public class ShortUrlController {
    @Autowired
    ShortUrlService shortUrlService;

    @PostMapping("/new")
    //todo change requestbody to not use string
    public void addShortUrl(@RequestBody String url) {
        shortUrlService.createShortUrl(url);

    }
}

