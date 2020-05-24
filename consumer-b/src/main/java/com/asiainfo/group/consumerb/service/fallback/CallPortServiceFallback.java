package com.asiainfo.group.consumerb.service.fallback;

import com.asiainfo.group.consumerb.service.CallPortServiceByFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class CallPortServiceFallback implements CallPortServiceByFeign {


    @Override
    public String callGetPortByFeign() {
        return "远程调用callPortService异常！";
    }
}
