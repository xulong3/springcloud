package com.asiainfo.group.consumerb.controller;

import com.asiainfo.group.consumerb.entity.User;
import com.asiainfo.group.consumerb.service.CallParamServiceByFeign;
import com.asiainfo.group.consumerb.service.CallPortServiceByFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callParamByFeign")
public class CallParamControllerByFeign {
    @Autowired
    private CallParamServiceByFeign callParamServiceByFeign;

    @RequestMapping("/callBaseParamByFeign")
    public String callBaseParamByFeign(String name,int age){
        return callParamServiceByFeign.callBaseParamByFeign(name,age);
    }

    @RequestMapping("/callObjectParamByFeign")
    public String callObjectParamByFeign(User user,String desc){
        return callParamServiceByFeign.callObjectParamByFeign(user,desc);
    }
}
