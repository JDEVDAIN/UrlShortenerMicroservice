package com.website.urlshortenerservice.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortUrlService {

    @Autowired
    ShortUrlRepository shortUrlRepository;

    public void createShortUrl(ShortUrl shortUrl) {
        shortUrlRepository.save(shortUrl);

    }

    public void createShortUrl(String Url) {
        //TODO add url check
        //gets currentId in db, adds +1, converts id(long) into base62 String
        String base62valFromDbId = ShortUrlServiceHelper.base62(
                shortUrlRepository.getSequenceCurrValLong("Short_url_seq") + 1);

        ShortUrl shortUrl = new ShortUrl(base62valFromDbId, Url);
        System.out.println("base62valFromDbId = " + base62valFromDbId);
        System.out.println("shortUrlRepository.getSequenceCurrValLong = " + (
                shortUrlRepository.getSequenceCurrValLong("Short_url_seq")+1));

        shortUrlRepository.save(shortUrl);


    }
}

