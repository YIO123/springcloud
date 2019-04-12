package com.yio.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author YIO
 * @create 2019-04-1:34
 */
@FeignClient(value = "client",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
