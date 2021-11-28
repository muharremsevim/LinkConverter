package com.hmb.LinkConverter.controller;

import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/links")
public class LinkConverterController {

    private static final String PRODUCT_URL_REGEX = "^https://www.hmb.gov.tr/[\\wdğüşöçıİĞÜŞÖÇ]+-p-[\\wdğüşöçıİĞÜŞÖÇ]+(\\?[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşöçıİĞÜŞÖÇ]+(\\&[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşıöçİĞÜŞÖÇ]+)?)?$";
    private static final String SEARCH_URL_REGEX = "^https://www.hmb.gov.tr/sr\\?q=[\\wdğüşöçıİĞÜŞÖÇ]+$";
    private static final String DEFAULT_DL = "ty://?Page=Home";

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping("/urlToDeeplink")
    public String fromUrl(@RequestParam String url) {
        /*
         * if cache[url] return
         * else var dl = calculate deepLink
         *  cache[url] = dl
         * call an async method that logs request and response (cache[url])
         * */

        return convertUrlToDeepLink(url);
    }

    private String convertUrlToDeepLink(String url) {
        if (urlMatchesRegex(url, PRODUCT_URL_REGEX)) {
            return calculateProductDeepLink(url);
        } else if (urlMatchesRegex(url, SEARCH_URL_REGEX)) {
            return calculateSearchDeepLink(url);
        }
        return DEFAULT_DL;
    }

    private String calculateSearchDeepLink(String url) {
        return null;
    }

    private String calculateProductDeepLink(String url) {
        return null;
    }

    private boolean urlMatchesRegex(String url, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
