package com.asiainfo.group.servicea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    //LogController.class可有可无，因为随便写个其他类也不会报错，但准确编写class信息能够提供快速定位日志的效率
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/printLog")
    public String printLog(String log){
        //日志级别TRACE < DEBUG < INFO < WARN < ERROR < FATAL
        logger.trace("trace:"+log);
        logger.debug("debug:"+log);
        logger.info("info:"+log);
        logger.warn("warn:"+log);
        logger.error("error:"+log);

        return "日志打印成功！";
    }


}
