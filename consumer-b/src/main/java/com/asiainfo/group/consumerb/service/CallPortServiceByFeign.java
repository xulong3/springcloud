package com.asiainfo.group.consumerb.service;

import com.asiainfo.group.consumerb.service.fallback.CallPortServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//该注解作用在接口上
@FeignClient(value = "service-a",fallback = CallPortServiceFallback.class)
public interface CallPortServiceByFeign {

    @RequestMapping(value = "/service-a/port/getPort")
    String callGetPortByFeign();

}
