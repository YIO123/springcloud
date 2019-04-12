package com.yio.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YIO
 * @create 2019-04-1:22
 */
@SpringCloudApplication
@EnableFeignClients
@enablehy
public class Application4 {
    public static void main(String[] args) {
        SpringApplication.run(Application4.class,args);
    }
}
