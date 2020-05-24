package com.asiainfo.group.consumerb.service;

import com.asiainfo.group.consumerb.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//该注解作用在接口上
@FeignClient(value = "service-a")
public interface CallParamServiceByFeign {

    @RequestMapping(value = "/service-a/param/baseParam",method = RequestMethod.GET)
    String callBaseParamByFeign(@RequestParam("name") String name,@RequestParam("age") int age);


    @RequestMapping(value = "/service-a/param/objectParam",method = RequestMethod.POST)
    String callObjectParamByFeign(@RequestBody User user, @RequestParam("desc") String desc);

}
