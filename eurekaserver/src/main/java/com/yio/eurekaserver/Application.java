package com.yio.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YIO
 * @create 2019-04-11:33
 */
@SpringCloudApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
