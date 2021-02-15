package com.gxa.springbootmain.controller;

import com.gxa.springbootmain.service.DengluService;
import com.gxa.springbootmain.service.impl.DengluServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author zhangyujin
 * @version 1.0
 * @description DengluController.java
 * @date 2021/2/14 18:57
 */
@RestController
@ApiResponses({
        @ApiResponse(code = 400, message = "请求参数不完整或者错误"),
        @ApiResponse(code = 404, message = "找不到页面"),
        @ApiResponse(code = 405, message = "请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code = 406, message = "页面地址和接口名冲突"),
        @ApiResponse(code = 415, message = "请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code = 500, message = "后台服务逻辑错误")
})
public class DengluController {
    @Resource
    private DengluServiceImpl dengluServiceImpl;

    @RequestMapping(value = "logon_in", method = RequestMethod.POST)
    @ApiOperation(value = "查询所有数据接口", notes = "查询所有数据接口", httpMethod = "GET")
    public Map<String, Object> dengLu(HttpServletRequest request,String yongHuMingCheng,String miMa) {
        return dengluServiceImpl.dengLu(request,yongHuMingCheng,miMa);
    }
}
