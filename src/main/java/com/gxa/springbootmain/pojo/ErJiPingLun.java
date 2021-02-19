package com.gxa.springbootmain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (ErJiPingLun)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-18 18:12:50
 */
@ApiModel(value = "ErJiPingLun", description = "$tableInfo.comment")
public class ErJiPingLun implements Serializable {
    private static final long serialVersionUID = 204561149072155292L;

    @ApiModelProperty(name = "id", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer id;

    @ApiModelProperty(name = "pingLunId", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer pingLunId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    // 下面是服务器响应返回的内容，如果没有格式化转换，那么返回的内容是长毫秒数，接收mysql数据库中的数据也需要设置东八区+8时
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(name = "chuanJianShiJian", notes = "创建时间", dataType = "Date", required = true)
    private Date pingLunShiJian;

    @ApiModelProperty(name = "pingLunNeiRong", notes = "${column.comment}", dataType = "String", required = true)
    private String pingLunNeiRong;

    @ApiModelProperty(name = "yongHuXinXiId", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer yongHuXinXiId;

    @ApiModelProperty(name = "dianZanShu", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer dianZanShu;

    private YongHuXinXi yongHuXinXi;

    public YongHuXinXi getYongHuXinXi() {
        return yongHuXinXi;
    }

    public void setYongHuXinXi(YongHuXinXi yongHuXinXi) {
        this.yongHuXinXi = yongHuXinXi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPingLunId() {
        return pingLunId;
    }

    public void setPingLunId(Integer pingLunId) {
        this.pingLunId = pingLunId;
    }

    public Date getPingLunShiJian() {
        return pingLunShiJian;
    }

    public void setPingLunShiJian(Date pingLunShiJian) {
        this.pingLunShiJian = pingLunShiJian;
    }

    public String getPingLunNeiRong() {
        return pingLunNeiRong;
    }

    public void setPingLunNeiRong(String pingLunNeiRong) {
        this.pingLunNeiRong = pingLunNeiRong;
    }

    public Integer getYongHuXinXiId() {
        return yongHuXinXiId;
    }

    public void setYongHuXinXiId(Integer yongHuXinXiId) {
        this.yongHuXinXiId = yongHuXinXiId;
    }

    public Integer getDianZanShu() {
        return dianZanShu;
    }

    public void setDianZanShu(Integer dianZanShu) {
        this.dianZanShu = dianZanShu;
    }

}