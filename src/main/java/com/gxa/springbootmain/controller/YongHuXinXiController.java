package com.gxa.springbootmain.controller;

import com.gxa.springbootmain.pojo.YongHuXinXi;
import com.gxa.springbootmain.service.impl.YongHuXinXiServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * (YongHuXinXi)表控制层
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-14 18:04:02
 */
@RestController
@RequestMapping("yongHuXinXi")
@Api(value = "(YongHuXinXi)管理", tags = "(YongHuXinXi)管理接口API")
@ApiResponses({
        @ApiResponse(code = 400, message = "请求参数不完整或者错误"),
        @ApiResponse(code = 404, message = "找不到页面"),
        @ApiResponse(code = 405, message = "请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code = 406, message = "页面地址和接口名冲突"),
        @ApiResponse(code = 415, message = "请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code = 500, message = "后台服务逻辑错误")
})
public class YongHuXinXiController {
    /**
     * 服务对象
     */
    @Resource
    private YongHuXinXiServiceImpl yongHuXinXiServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param page      需要查询的页码
     * @param mingCheng 模糊查询的内容
     * @return 单条数据
     */
    @RequestMapping(value = "chaXunFenYe", method = RequestMethod.GET)
    @ApiOperation(value = "列表查询分页接口", notes = "列表查询分页接口", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "mingCheng", value = "**名称", paramType = "query", dataType = "String", required = false)
    })
    public Map<String, Object> chaXunFenYe(@RequestParam(name = "page") int page, String mingCheng) {
        return this.yongHuXinXiServiceImpl.chaXunFenYe(page, mingCheng);
    }

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    @RequestMapping(value = "chaXunAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有数据接口", notes = "查询所有数据接口", httpMethod = "GET")
    public Map<String, Object> chaXunAll() {
        return this.yongHuXinXiServiceImpl.chaXunAll();
    }

    @RequestMapping(value = "chaXun", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有数据接口", notes = "查询所有数据接口", httpMethod = "GET")
    public Map<String, Object> chaXun(HttpServletRequest request) {
        Object object=request.getSession().getAttribute("user");
        Map<String, Object> map=new HashMap<>();
        if(object!=null){
            map.put("code",200);
            map.put("msg","查询成功");
            map.put("data",object);
            return map;
        }else{
            map.put("code",405);
            map.put("msg","没有登录");
            return map;
        }

    }
    /**
     * 通过主键删除单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @RequestMapping(value = "shanChuById", method = RequestMethod.POST)
//    @ApiOperation(value = "根据一个主键删除一条**记录的接口",notes = "根据一个主键删除一条**记录的接口",httpMethod = "POST")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id",value = "主键",paramType = "query",dataType = "String",required = true),
//    })
    public Map<String, Object> shanChuById(@RequestParam("id") String id) {
        return this.yongHuXinXiServiceImpl.shanChuById(id);
    }

    /**
     * 通过主键更新单条数据
     *
     * @param yongHuXinXi 一个数据库对应的POJO数据对象
     * @return 单条数据
     */
    @RequestMapping(value = "gengXinById", method = RequestMethod.POST)
    @ApiOperation(value = "通过主键更新一个**的接口", notes = "通过主键更新一个**的接口", httpMethod = "POST")
    public Map<String, Object> gengXinById(@RequestBody @ApiParam(name = "yongHuXinXi", value = "pojo模型", required = true) YongHuXinXi yongHuXinXi) {
        return this.yongHuXinXiServiceImpl.gengXinById(yongHuXinXi);
    }

    /**
     * 通过一个pojo对象新增单条数据
     *
     * @param yongHuXinXi 一个数据库对应的POJO数据对象
     * @return 返回插入的主键id
     */
    @RequestMapping(value = "xinZeng", method = RequestMethod.POST)
    @ApiOperation(value = "根据完整记录新增一个**的接口", notes = "根据完整记录新增一个**的接口", httpMethod = "POST")
    public Map<String, Object> xinZeng(@RequestBody @ApiParam(name = "yongHuXinXi", value = "pojo模型", required = true) YongHuXinXi yongHuXinXi) {
        return this.yongHuXinXiServiceImpl.xinZeng(yongHuXinXi);
    }

}