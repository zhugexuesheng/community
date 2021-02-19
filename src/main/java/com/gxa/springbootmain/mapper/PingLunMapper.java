package com.gxa.springbootmain.mapper;

import com.gxa.springbootmain.pojo.PingLun;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PingLun)表数据库访问层
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-18 13:17:25
 */
public interface PingLunMapper {

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    List<PingLun> chaXunAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PingLun chaXunById(@Param("id") Integer id);

    /**
     * 根据模糊条件查询总个数
     *
     * @return 返回查询到的总个数
     */
    int chaXunCount(String mingCheng);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param xiaBiao   当前查询开始页中的第一个下标值
     * @param mingCheng 需要模糊查询的内容
     * @return 对象列表
     */
    List<PingLun> chaXunFenYe(@Param("xiaBiao") int xiaBiao, @Param("mingCheng") String mingCheng);

    /**
     * 新增数据
     *
     * @param pingLun 实例对象
     */
    void xinZeng(PingLun pingLun);

    /**
     * 修改数据
     *
     * @param pingLun 实例对象
     * @return 影响行数
     */
    int gengXinById(PingLun pingLun);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int shanChuById(@Param("id") String id);

    void gengXinPingLunShuById(@Param("count")int count,@Param("pingLunId") int pingLunId);

    int chaXunCountById(@Param("id") int id);
}