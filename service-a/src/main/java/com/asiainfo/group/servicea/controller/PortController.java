package com.asiainfo.group.servicea.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/port")
public class PortController {


    @Value("${server.port}")
    private String port;

    @RequestMapping("/getPort")
    public String getPort(){
        return "The port for this instance is:"+port;
    }


}
