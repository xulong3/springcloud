package com.asiainfo.group.consumerb.controller;

import com.asiainfo.group.consumerb.service.CallPortServiceByFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callPortByFeign")
public class CallPortControllerByFeign {
    @Autowired
    private CallPortServiceByFeign callPortServiceByFeign;

    @RequestMapping("/callGetPortByFeign")
    public String callGetPortByFeign(){
        return  callPortServiceByFeign.callGetPortByFeign();
    }
}
