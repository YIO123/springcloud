package com.yio.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author YIO
 * @create 2019-04-13:42
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务器故障";
    }
}
