package com.gxa.springbootmain.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author thinknovo
 * @version 1.0
 * @description LoginInterceptor.java
 * @date 2021/1/8 9:32
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 核心拦截方法,在当前服务中的每一次(被拦截的)请求都会调用此方法执行   ps:当用户访问login.html页面时，不会调用此方法
     * @param httpServletRequest   http请求对象
     * @param httpServletResponse  http响应对象
     * @param o                    spring mvc手动可配置DefaultServletHttpRequestHandler对象
     * @return                     返回true代表放行，false代表拦截
     * @throws Exception           异常状态
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        /*
        preHandle方法如果返回值为true代表放行，如果返回false代表不放行
         */
        Object yongHu = httpServletRequest.getSession().getAttribute("yongHu");
        System.out.println("preHandle getRemoteAddr=" + httpServletRequest.getRemoteAddr());
        System.out.println("preHandle getLocalAddr=" + httpServletRequest.getLocalAddr());
        System.out.println("preHandle getRequestURL=" + httpServletRequest.getRequestURL());
        System.out.println("preHandle getRequestURI=" + httpServletRequest.getRequestURI());
        System.out.println(o);
        System.out.println("yongHu=" + yongHu);
        if(yongHu == null) {
            httpServletResponse.sendRedirect("/login.html");  // 这种演示是保证页面在当前服务器中的情况
            // {code:250, msg:"请登录之后再访问", url:"/login.html"}
            return false;
        }
        else {
            return true;
        }


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
