package com.asiainfo.group.servicea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeout")
public class TimeoutController {

    private static final Logger logger = LoggerFactory.getLogger(TimeoutController.class);


    @RequestMapping("/timeoutBySleep")
    public String timeoutBySleep(int seconds){
        logger.info("参数seconds:"+seconds);

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            logger.error("线程sleep异常！",e);
        }
        return "sleep success";
    }


}
