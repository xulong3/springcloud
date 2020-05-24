package com.asiainfo.group.consumerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//扫描所有带feignClient注解的类并进行处理
@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
public class ConsumerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBApplication.class, args);
    }

}
