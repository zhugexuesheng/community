package com.gxa.springbootmain.service.impl;

import com.gxa.springbootmain.mapper.YongHuXinXiMapper;
import com.gxa.springbootmain.pojo.YongHuXinXi;
import com.gxa.springbootmain.service.DengluService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyujin
 * @version 1.0
 * @description DengluServiceImpl.java
 * @date 2021/2/14 19:04
 */
@Service("DengluService")
public class DengluServiceImpl implements DengluService {

    @Resource
    private YongHuXinXiMapper yongHuXinXiMapper;
    @Override
    public Map<String, Object> dengLu(HttpServletRequest request, String yongHuMing, String Mima) {
        YongHuXinXi yongHuXinXi=yongHuXinXiMapper.chaXunByYongHuMingAndMima(yongHuMing,Mima);
        Map<String, Object> map=new HashMap<>();
        if(yongHuMing==null||yongHuMing==""||Mima==null||Mima==""){
            map.put("code",500);
            map.put("msg","用户名或密码不能为空");
            return map;
        }
        if(yongHuXinXi.getYongHuMing()!=null){

            request.getSession().setAttribute("user",yongHuXinXi);
            map.put("code",200);
            map.put("msg","登录成功");
            map.put("data",yongHuXinXi);
            return map;
        }
        map.put("code",500);
        map.put("msg","用户名或密码错误");
        return map;
    }
}
