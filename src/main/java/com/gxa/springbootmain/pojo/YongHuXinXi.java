package com.gxa.springbootmain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (YongHuXinXi)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-14 18:04:03
 */
@ApiModel(value = "YongHuXinXi", description = "$tableInfo.comment")
public class YongHuXinXi implements Serializable {
    private static final long serialVersionUID = 127405187241375925L;

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

    @Override
    public String toString() {
        return "YongHuXinXi{" +
                "id=" + id +
                ", yongHuMing='" + yongHuMing + '\'' +
                ", yongHuTouXiang='" + yongHuTouXiang + '\'' +
                ", dengLuMing='" + dengLuMing + '\'' +
                ", dengLuMiMa='" + dengLuMiMa + '\'' +
                ", jiFen=" + jiFen +
                ", shouJi='" + shouJi + '\'' +
                ", shengFenZhengHao='" + shengFenZhengHao + '\'' +
                ", youXiang='" + youXiang + '\'' +
                '}';
    }
}