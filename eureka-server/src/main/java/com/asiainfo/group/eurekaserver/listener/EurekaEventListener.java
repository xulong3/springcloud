package com.asiainfo.group.eurekaserver.listener;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 13121
 */

@Component
public class EurekaEventListener {

    @EventListener
    public void instanceRegistered(EurekaInstanceRegisteredEvent event){
        System.out.println("实例注册");
    }
    @EventListener
    public void instanceRenewed(EurekaInstanceRenewedEvent event){
        System.out.println("实例续租");
    }
    @EventListener
    public void registryAvailable(EurekaRegistryAvailableEvent event){
        System.out.println("注册中心启动");
    }
    @EventListener
    public void serverStarted(EurekaServerStartedEvent event){
        System.out.println("eureka server启动");
    }
    @EventListener
    public void instanceCanceled(EurekaInstanceCanceledEvent event){
        System.out.println("实例下线");
    }



}
