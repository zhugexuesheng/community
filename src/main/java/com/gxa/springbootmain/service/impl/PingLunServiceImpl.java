package com.gxa.springbootmain.service.impl;

import com.gxa.springbootmain.mapper.PingLunMapper;
import com.gxa.springbootmain.mapper.TieZhiMapper;
import com.gxa.springbootmain.pojo.PingLun;
import com.gxa.springbootmain.pojo.TieZhi;
import com.gxa.springbootmain.service.PingLunService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * (PingLun)表服务实现类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-18 13:17:22
 */
@Service("pingLunService")
public class PingLunServiceImpl implements PingLunService {
    @Resource
    private PingLunMapper pingLunMapper;

    @Resource
    private TieZhiMapper tieZhiMapper;
    /**
     * 根据模糊条件查询总个数
     *
     * @return 返回查询到的总个数
     */
    @Override
    public Map<String, Object> chaXunCount(String mingCheng) {
        Map<String, Object> map = new HashMap<>();
        // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("code", 200);
        map.put("msg", "查询成功");
        map.put("list", this.pingLunMapper.chaXunCount(mingCheng));
        return map;
    }

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    @Override
    public Map<String, Object> chaXunAll() {
        Map<String, Object> map = new HashMap<>();
        // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("code", 200);
        map.put("msg", "查询成功");
        map.put("list", this.pingLunMapper.chaXunAll());
        return map;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Map<String, Object> chaXunById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("code", 200);
        map.put("msg", "查询成功");
        map.put("obj", this.pingLunMapper.chaXunById(id));
        return map;
    }

    public int chaXunCountById(int id) {
        return pingLunMapper.chaXunCountById(id);
    }
    /**
     * 查询分页数据
     *
     * @param page      查询起始位置
     * @param mingCheng 查询条数
     * @return 对象列表
     */
    @Override
    public Map<String, Object> chaXunFenYe(int page, String mingCheng) {
        // 获取当前表中的总记录
        int tableCount = this.pingLunMapper.chaXunCount(mingCheng);
        // 总页码计算   (总条数 - 1) / 每页显示条数  + 1
        // (100 - 1) / 10 + 1 = 10        (101 - 1) / 10 + 1 = 11      (99 - 1) / 10 + 1 = 10
        int pageCount = (tableCount - 1) / 10 + 1;
        // 计算每页开始的下标值
        int xiaBiao = (page - 1) * 10;
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "查询成功");
        map.put("pageCount", pageCount);  // 查询的记录总页码
        map.put("count", tableCount);     // 当前表中的总条数
        map.put("data", this.pingLunMapper.chaXunFenYe(xiaBiao, mingCheng));
        return map;
    }

    /**
     * 新增数据
     *
     * @param pingLun 实例对象
     * @return 实例对象
     */
    @Override
    public Map<String, Object> xinZeng(PingLun pingLun) {
        // UUID.randomUUID()  返回内容：asd21321-ewrewrew213213-123213zsad-123asdasd这样的形态
        this.pingLunMapper.xinZeng(pingLun);
        tieZhiMapper.gengXinplsById(chaXunCountById(pingLun.getTieZhiId()),pingLun.getTieZhiId());//更新评论数
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "新增成功");
        return map;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param pingLun 实例对象
     * @return 实例对象
     */
    @Override
    public Map<String, Object> gengXinById(PingLun pingLun) {
        this.pingLunMapper.gengXinById(pingLun);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "更新成功");
        return map;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Map<String, Object> shanChuById(String id) {
        this.pingLunMapper.shanChuById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "删除成功");
        return map;
    }
}