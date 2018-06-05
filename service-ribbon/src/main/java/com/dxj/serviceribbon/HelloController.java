package com.dxj.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create by duxiji on 2018/6/5
 */
@RestController
public class HelloController {
    @Autowired
    HelloSerivce helloSerivce;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloSerivce.hiService(name);
    }

//    @GetMapping("/getHi")
//    public String getHi(@RequestParam String name) {
//        return helloSerivce.hiService(name);
//    }
//    @PostMapping("/postHi")
//    public String postHi(@RequestParam String name) {
//        return helloSerivce.hiService(name);
//    }
}
