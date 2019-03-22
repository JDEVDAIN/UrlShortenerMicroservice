package com.website.urlshortenerservice.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortUrlService {

    @Autowired
    ShortUrlRepository shortUrlRepository;

    public void createShortUrl(ShortUrl shortUrl){
        shortUrlRepository.save(shortUrl);
    }
}
