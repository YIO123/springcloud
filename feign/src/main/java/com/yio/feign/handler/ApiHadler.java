package com.yio.feign.handler;

import com.yio.feign.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author YIO
 * @create 2019-04-13:47
 */
@RestController
public class ApiHadler {
    @Resource
    private ApiService apiService;
    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
