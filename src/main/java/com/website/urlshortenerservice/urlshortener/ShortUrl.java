package com.website.urlshortenerservice.urlshortener;


import javax.persistence.*;

@Entity
public class ShortUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(nullable = false)
    private String shortUrl;

    @Column(nullable = false)
    private String url;


    public ShortUrl(){

    }

    public ShortUrl(long id, String shortUrl, String url) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
