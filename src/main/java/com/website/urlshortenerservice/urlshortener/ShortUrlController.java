package com.website.urlshortenerservice.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/s")
public class ShortUrlController {
    @Autowired
    ShortUrlService shortUrlService;

    @PostMapping(value = "/new", consumes = "application/json", produces = "application/json")
    //example body {"url":"sa"}
    public ShortUrl addShortUrl(@RequestBody ShortUrl shortUrl) {
        return shortUrlService.createShortUrl(shortUrl.getUrl());
    }
    @GetMapping("/{shortUrl}")
    public void getUrl(@PathVariable String shortUrl){
        //TODO implement

    }
}

