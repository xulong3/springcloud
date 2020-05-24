package com.asiainfo.group.servicea.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulong3
 * @Title: file_name
 * @Package package_name
 * @Description: todo
 * @date 2020/5/24 10:20
 */
@RestController
@RequestMapping("/hystrixDemo")
public class HystrixDemoController {

    private static final Logger logger = LoggerFactory.getLogger(HystrixDemoController.class);

    @RequestMapping("/divide")
    @HystrixCommand(fallbackMethod = "defaultDivide")
    public int divide(@RequestParam(value = "a",required = true) Integer a,
                       @RequestParam(value = "b",required = true)Integer b){
        int i = a / b;
        return i;
    }

    public int defaultDivide(Integer a,Integer b,Throwable throwable){
        String message = throwable.getMessage();
        logger.info(message);
        return 0;
    }

}
