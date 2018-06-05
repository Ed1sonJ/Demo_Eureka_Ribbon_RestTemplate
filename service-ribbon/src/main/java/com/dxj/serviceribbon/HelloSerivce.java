package com.dxj.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Create by duxiji on 2018/6/5
 */
@Service
public class HelloSerivce {

    @Autowired
    RestTemplate restTemplate;


    public String hiService(String name) {
        return restTemplate.getForObject("http://EURAKE-CLIENT/hi?name=" + name, String.class);
    }

//    public String hiGetService(String name) {
//        return restTemplate.getForObject("http://EURAKE-CLIENT/getHi?name=" + name, String.class);
//    }
//
//    public String hiPostService(String name) {
//        return restTemplate.getForObject("http://EURAKE-CLIENT/postHi?name=" + name, String.class);
//    }
}
