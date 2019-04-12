package com.yio.client.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YIO
 * @create 2019-04-1:45
 */
@RestController
public class HelloHandler {
    @Value("${server.port}")
    private int port;
    @RequestMapping("index")
    public String index() {
        return "Hello world!!!!!!!!!" + "端口号是:" + port;
    }
}
