package com.asiainfo.group.servicea.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private EurekaClient eurekaClient;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "hello,service-a;"+port;
    }


}
