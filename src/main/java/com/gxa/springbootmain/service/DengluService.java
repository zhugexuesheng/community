package com.gxa.springbootmain.service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author zhangyujin
 * @version 1.0
 * @description DengluService.java
 * @date 2021/2/14 19:05
 */
public interface DengluService {

    Map<String, Object> dengLu(HttpServletRequest request,String yongHuMing,String Mima);
}
