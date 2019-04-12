package com.yio.client.Handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YIO
 * @create 2019-04-11:39
 */
@RestController
public class Handler {
    @RequestMapping("hello")
    public String Hello(){
        return "hello word!!!!!!!!!1";
    }
}
