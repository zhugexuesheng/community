package com.gxa.springbootmain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * (PingLun)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-18 13:17:26
 */
@ApiModel(value = "PingLun", description = "$tableInfo.comment")
public class PingLun implements Serializable {
    private static final long serialVersionUID = 701690257163004641L;

    @ApiModelProperty(name = "id", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer id;
    /**
     * 帖子id
     */
    @ApiModelProperty(name = "tieZhiId", notes = "帖子id", dataType = "Integer", required = true)
    private Integer tieZhiId;
    /**
     * 类型
     */
    @ApiModelProperty(name = "leiXing", notes = "类型", dataType = "Integer", required = true)
    private Integer leiXing;
    /**
     * 用户id
     */
    @ApiModelProperty(name = "yongHuXinXiId", notes = "用户id", dataType = "Integer", required = true)
    private Integer yongHuXinXiId;

    @ApiModelProperty(name = "chuangJianShiJian", notes = "${column.comment}", dataType = "Date", required = true)
    private Date chuangJianShiJian;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "gengXinShiJian", notes = "创建时间", dataType = "Date", required = true)
    private Date gengXinShiJian;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "dianZanShu", notes = "更新时间", dataType = "Integer", required = true)
    private Integer dianZanShu;
    /**
     * 回复
     */
    @ApiModelProperty(name = "huiFu", notes = "回复", dataType = "String", required = true)
    private String huiFu;

    @ApiModelProperty(name = "pingLunShu", notes = "回复的数量", dataType = "String", required = true)
    private int pingLunShu;

    public int getPingLunShu() {
        return pingLunShu;
    }

    public void setPingLunShu(int pingLunShu) {
        this.pingLunShu = pingLunShu;
    }

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

    public Integer getTieZhiId() {
        return tieZhiId;
    }

    public void setTieZhiId(Integer tieZhiId) {
        this.tieZhiId = tieZhiId;
    }

    public Integer getLeiXing() {
        return leiXing;
    }

    public void setLeiXing(Integer leiXing) {
        this.leiXing = leiXing;
    }

    public Integer getYongHuXinXiId() {
        return yongHuXinXiId;
    }

    public void setYongHuXinXiId(Integer yongHuXinXiId) {
        this.yongHuXinXiId = yongHuXinXiId;
    }

    public Date getChuangJianShiJian() {
        return chuangJianShiJian;
    }

    public void setChuangJianShiJian(Date chuangJianShiJian) {
        this.chuangJianShiJian = chuangJianShiJian;
    }

    public Date getGengXinShiJian() {
        return gengXinShiJian;
    }

    public void setGengXinShiJian(Date gengXinShiJian) {
        this.gengXinShiJian = gengXinShiJian;
    }

    public Integer getDianZanShu() {
        return dianZanShu;
    }

    public void setDianZanShu(Integer dianZanShu) {
        this.dianZanShu = dianZanShu;
    }

    public String getHuiFu() {
        return huiFu;
    }

    public void setHuiFu(String huiFu) {
        this.huiFu = huiFu;
    }

}