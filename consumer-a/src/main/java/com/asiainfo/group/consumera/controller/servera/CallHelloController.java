package com.asiainfo.group.consumera.controller.servera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/callServiceA/hello")
public class CallHelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String callHello(){
        String result = restTemplate.getForObject("http://service-a/hello", String.class);
        return result;
    }
}
