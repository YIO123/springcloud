package com.yio.gateway.handler;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.DefaultErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.cloud.gateway.support.NotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.server.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YIO
 * @create 2019-04-14:34
 */
public class JsonExceptionHandler extends DefaultErrorWebExceptionHandler {
    public JsonExceptionHandler(ErrorAttributes errorAttributes, ResourceProperties resourceProperties, ErrorProperties errorProperties, ApplicationContext applicationContext) {
        super(errorAttributes, resourceProperties, errorProperties, applicationContext);
    }
    @Override
    protected Map<String,Object> getErrorAttributes(ServerRequest request, boolean includeStackTrace){
        int code=500;
        Throwable error=super.getError(request);
        if(error instanceof NotFoundException){
            code=404;
        }
        return response(code,buidMessage(request,error));
    }
    @Override
    protected  RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes){
        return RouterFunctions.route(RequestPredicates.all(),this::renderErrorResponse);
    }
    @Override
    protected HttpStatus getHttpStatus(Map<String,Object> errorAttributes){
        int statusCode=(int) errorAttributes.get("code");
        return HttpStatus.valueOf(statusCode);
    }
    private String buidMessage(ServerRequest request,Throwable ex){
        StringBuffer sb=new StringBuffer("Failed to handler request[");
        sb.append(request.methodName());
        sb.append(" ");
        sb.append("]");
        if(ex!=null){
            sb.append(":");
            sb.append(ex.getMessage());
        }
        return sb.toString();
    }
    public static Map<String,Object> response(int status,String errorMassage){
        Map<String,Object> map=new HashMap<>();
        map.put("code",status);
        map.put("message",errorMassage);
        map.put("data",null);
        return map;
    }
}
