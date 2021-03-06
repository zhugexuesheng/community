package com.gxa.springbootmain.mapper;

import com.gxa.springbootmain.pojo.KeFang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (KeFang)表数据库访问层
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-19 09:16:07
 */
public interface KeFangMapper {

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    List<KeFang> chaXunAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KeFang chaXunById(@Param("id") Integer id);

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
    List<KeFang> chaXunFenYe(@Param("xiaBiao") int xiaBiao, @Param("mingCheng") String mingCheng);

    /**
     * 新增数据
     *
     * @param keFang 实例对象
     */
    void xinZeng(KeFang keFang);

    /**
     * 修改数据
     *
     * @param keFang 实例对象
     * @return 影响行数
     */
    int gengXinById(KeFang keFang);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int shanChuById(@Param("id") String id);

}