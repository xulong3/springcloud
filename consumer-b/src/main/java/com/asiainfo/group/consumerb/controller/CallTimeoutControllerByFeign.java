package com.asiainfo.group.consumerb.controller;

import com.asiainfo.group.consumerb.service.CallPortServiceByFeign;
import com.asiainfo.group.consumerb.service.CallTimeoutServiceByFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callTimeoutByFeign")
public class CallTimeoutControllerByFeign {
    @Autowired
    private CallTimeoutServiceByFeign callTimeoutServiceByFeign;

    @RequestMapping("/callTimeoutBySleepByFeign")
    public String callTimeoutBySleepByFeign(int seconds){
        return  callTimeoutServiceByFeign.callTimeoutBySleepByFeign(seconds);
    }
}
