package com.website.urlshortenerservice.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

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

//    @GetMapping("/{shortUrl}")
//    public void getUrl(@PathVariable String shortUrl, HttpServletResponse resp) throws IOException {
//        //TODO make faster with base62 to id conversion and not search for base62 value
//        String url = shortUrlService.getUrl(shortUrl);
//        if (url != null) {
//            resp.addHeader("Location", url);
//            //TODO CHECK url if valid
//            resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//        } else {
//            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
//        }
//
//    }

    @GetMapping(value = "/{shortUrlApi}", produces = "application/json")
    public HashMap getUrlApi(@PathVariable String shortUrlApi) throws IOException {
        //TODO make faster with base62 to id conversion and not search for base62 value
        String url = shortUrlService.getUrl(shortUrlApi);
        HashMap retHashMap = new HashMap();
        retHashMap.put("short_url", shortUrlApi);
        retHashMap.put("url", url);
        return retHashMap;

    }
}

