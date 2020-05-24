package com.asiainfo.group.consumera.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/callPortByRibbon")
public class CallPortController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/callGetPortByRibbon")
    @HystrixCommand(fallbackMethod = "defaultCallHello")
    public String callHello(){
        //此处的第一个service-a等同与  ip:port,第二个service-a是上下文

        String result = restTemplate.getForObject("http://service-a/service-a/port/getPort", String.class);
        return result;
    }

    public String defaultCallHello(Throwable t){
        return t.getMessage();
    }



}
