package com.asiainfo.group.consumerb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//该注解作用在接口上
@FeignClient(value = "service-a")
public interface CallTimeoutServiceByFeign {

    @RequestMapping(value = "/service-a/timeout/timeoutBySleep")
    String callTimeoutBySleepByFeign(@RequestParam int seconds);

}
