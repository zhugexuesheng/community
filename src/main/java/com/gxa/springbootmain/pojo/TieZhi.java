package com.gxa.springbootmain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * (TieZhi)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-16 00:03:14
 */
@ApiModel(value = "TieZhi", description = "$tableInfo.comment")
public class TieZhi implements Serializable {
    private static final long serialVersionUID = -76298773416262799L;
    /**
     * id
     */
    @ApiModelProperty(name = "id", notes = "id", dataType = "Integer", required = true)
    private Integer id;
    /**
     * 标题
     */
    @ApiModelProperty(name = "biaoTi", notes = "标题", dataType = "String", required = true)
    private String biaoTi;
    /**
     * 描述
     */
    @ApiModelProperty(name = "miaoShu", notes = "描述", dataType = "String", required = true)
    private String miaoShu;
    /**
     * 标签
     */
    @ApiModelProperty(name = "biaoQian", notes = "标签", dataType = "String", required = true)
    private String biaoQian;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "chuanJianShiJian", notes = "创建时间", dataType = "Date", required = true)
    private Date chuanJianShiJian;
    /**
     * 创建人
     */
    @ApiModelProperty(name = "chuanJianRen", notes = "创建人", dataType = "String", required = true)
    private String chuanJianRen;
    /**
     * 阅读数
     */
    @ApiModelProperty(name = "yueDuShu", notes = "阅读数", dataType = "String", required = true)
    private String yueDuShu;
    /**
     * 评论数
     */
    @ApiModelProperty(name = "pingLunShu", notes = "评论数", dataType = "String", required = true)
    private String pingLunShu;
    /**
     * 点赞数
     */
    @ApiModelProperty(name = "dianZhanShu", notes = "点赞数", dataType = "String", required = true)
    private String dianZhanShu;
    /**
     * 类型
     */
    @ApiModelProperty(name = "leiXing", notes = "类型", dataType = "String", required = true)
    private String leiXing;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaoTi() {
        return biaoTi;
    }

    public void setBiaoTi(String biaoTi) {
        this.biaoTi = biaoTi;
    }

    public String getMiaoShu() {
        return miaoShu;
    }

    public void setMiaoShu(String miaoShu) {
        this.miaoShu = miaoShu;
    }

    public String getBiaoQian() {
        return biaoQian;
    }

    public void setBiaoQian(String biaoQian) {
        this.biaoQian = biaoQian;
    }

    public Date getChuanJianShiJian() {
        return chuanJianShiJian;
    }

    public void setChuanJianShiJian(Date chuanJianShiJian) {
        this.chuanJianShiJian = chuanJianShiJian;
    }

    public String getChuanJianRen() {
        return chuanJianRen;
    }

    public void setChuanJianRen(String chuanJianRen) {
        this.chuanJianRen = chuanJianRen;
    }

    public String getYueDuShu() {
        return yueDuShu;
    }

    public void setYueDuShu(String yueDuShu) {
        this.yueDuShu = yueDuShu;
    }

    public String getPingLunShu() {
        return pingLunShu;
    }

    public void setPingLunShu(String pingLunShu) {
        this.pingLunShu = pingLunShu;
    }

    public String getDianZhanShu() {
        return dianZhanShu;
    }

    public void setDianZhanShu(String dianZhanShu) {
        this.dianZhanShu = dianZhanShu;
    }

    public String getLeiXing() {
        return leiXing;
    }

    public void setLeiXing(String leiXing) {
        this.leiXing = leiXing;
    }

}