1、eureka-server工程
    服务名(工程上下文)：eureka-server
    单机版端口号：8000
    单机版实例ID：eureka-server-standalone
    集群端口号：8001、8002、8003
    集群版实例ID：eureka-server-1,eureka-server-2,eureka-server-3
   
2、service-a工程
    服务名(工程上下文)：service-a
    单机版端口号：8010
    单机版实例ID：service-a-standalone
    
3、consumer-a工程
    服务名(工程上下文)：consumer-a
    单机版端口号：8020
    单机版实例ID：consumer-a-standalone
    
3、consumer-b工程
    服务名(工程上下文)：consumer-b
    单机版端口号：8030
    单机版实例ID：consumer-b-standalone
    
4、生产者命名
    controller层：
        类名：如PortController
        类上下文：port
        方法命名：如getPort
        方法url：getPort

5、消费者命名
    controller层：
        类名：CallPortControllerByFeign
        类上下文：callPortByFeign
        方法命名：callGetPortByFeign
        方法url：callGetPortByFeign
    service层：
        类名：CallPortServiceByFeign
        方法名：callGetPortByFeign
        方法url：/service-a/port/getPort
        
6、zuul-server工程
    服务名(工程上下文)：zuul-server
    单机版端口号：8040
    单机版实例ID：zuul-server-standalone


