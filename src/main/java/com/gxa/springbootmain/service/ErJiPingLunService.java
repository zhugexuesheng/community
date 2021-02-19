package com.gxa.springbootmain.service;

import com.gxa.springbootmain.pojo.ErJiPingLun;

import java.util.Map;

/**
 * (ErJiPingLun)表服务接口类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-18 18:12:49
 */
public interface ErJiPingLunService {
    /**
     * 根据模糊条件查询总个数
     *
     * @return 返回查询到的总个数
     */
    Map<String, Object> chaXunCount(String mingCheng);

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    Map<String, Object> chaXunAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Map<String, Object> chaXunById(Integer id);

    /**
     * 查询分页数据
     *
     * @param page      查询起始位置
     * @param mingCheng 查询条数
     * @return 对象列表
     */
    Map<String, Object> chaXunFenYe(int page, String mingCheng);

    /**
     * 新增数据
     *
     * @param erJiPingLun 实例对象
     * @return 实例对象
     */
    Map<String, Object> xinZeng(ErJiPingLun erJiPingLun);

    /**
     * 通过ID查询单条数据
     *
     * @param erJiPingLun 实例对象
     * @return 实例对象
     */
    Map<String, Object> gengXinById(ErJiPingLun erJiPingLun);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Map<String, Object> shanChuById(String id);

    Map<String, Object> chaXunByPunLunId(int parseInt);
}