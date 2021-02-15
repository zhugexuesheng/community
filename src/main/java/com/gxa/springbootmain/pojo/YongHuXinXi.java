package com.gxa.springbootmain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * (YongHuXinXi)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-15 19:21:37
 */
@ApiModel(value = "YongHuXinXi", description = "$tableInfo.comment")
public class YongHuXinXi implements Serializable {
    private static final long serialVersionUID = 251643438985476456L;

    @ApiModelProperty(name = "id", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer id;

    @ApiModelProperty(name = "yongHuMing", notes = "${column.comment}", dataType = "String", required = true)
    private String yongHuMing;

    @ApiModelProperty(name = "yongHuTouXiang", notes = "${column.comment}", dataType = "String", required = true)
    private String yongHuTouXiang;

    @ApiModelProperty(name = "dengLuMing", notes = "${column.comment}", dataType = "String", required = true)
    private String dengLuMing;

    @ApiModelProperty(name = "dengLuMiMa", notes = "${column.comment}", dataType = "String", required = true)
    private String dengLuMiMa;

    @ApiModelProperty(name = "jiFen", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer jiFen;

    @ApiModelProperty(name = "shouJi", notes = "${column.comment}", dataType = "String", required = true)
    private String shouJi;

    @ApiModelProperty(name = "shengFenZhengHao", notes = "${column.comment}", dataType = "String", required = true)
    private String shengFenZhengHao;

    @ApiModelProperty(name = "youXiang", notes = "${column.comment}", dataType = "String", required = true)
    private String youXiang;

    @ApiModelProperty(name = "token", notes = "${column.comment}", dataType = "String", required = true)
    private String token;

    @ApiModelProperty(name = "chuangJianShiJian", notes = "${column.comment}", dataType = "Date", required = true)
    private Date chuangJianShiJian;

    @ApiModelProperty(name = "xiuGaiShiJian", notes = "${column.comment}", dataType = "Date", required = true)
    private Date xiuGaiShiJian;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYongHuMing() {
        return yongHuMing;
    }

    public void setYongHuMing(String yongHuMing) {
        this.yongHuMing = yongHuMing;
    }

    public String getYongHuTouXiang() {
        return yongHuTouXiang;
    }

    public void setYongHuTouXiang(String yongHuTouXiang) {
        this.yongHuTouXiang = yongHuTouXiang;
    }

    public String getDengLuMing() {
        return dengLuMing;
    }

    public void setDengLuMing(String dengLuMing) {
        this.dengLuMing = dengLuMing;
    }

    public String getDengLuMiMa() {
        return dengLuMiMa;
    }

    public void setDengLuMiMa(String dengLuMiMa) {
        this.dengLuMiMa = dengLuMiMa;
    }

    public Integer getJiFen() {
        return jiFen;
    }

    public void setJiFen(Integer jiFen) {
        this.jiFen = jiFen;
    }

    public String getShouJi() {
        return shouJi;
    }

    public void setShouJi(String shouJi) {
        this.shouJi = shouJi;
    }

    public String getShengFenZhengHao() {
        return shengFenZhengHao;
    }

    public void setShengFenZhengHao(String shengFenZhengHao) {
        this.shengFenZhengHao = shengFenZhengHao;
    }

    public String getYouXiang() {
        return youXiang;
    }

    public void setYouXiang(String youXiang) {
        this.youXiang = youXiang;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getChuangJianShiJian() {
        return chuangJianShiJian;
    }

    public void setChuangJianShiJian(Date chuangJianShiJian) {
        this.chuangJianShiJian = chuangJianShiJian;
    }

    public Date getXiuGaiShiJian() {
        return xiuGaiShiJian;
    }

    public void setXiuGaiShiJian(Date xiuGaiShiJian) {
        this.xiuGaiShiJian = xiuGaiShiJian;
    }

}