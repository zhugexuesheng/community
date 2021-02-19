package com.gxa.springbootmain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (KeFang)实体类
 *
 * @author zhangyujin
 * @version 1.0
 * @since 2021-02-19 09:16:08
 */
@ApiModel(value = "KeFang", description = "$tableInfo.comment")
public class KeFang implements Serializable {
    private static final long serialVersionUID = -13928573111408609L;

    @ApiModelProperty(name = "id", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer id;

    @ApiModelProperty(name = "jiuDianId", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer jiuDianId;

    @ApiModelProperty(name = "keFangHao", notes = "${column.comment}", dataType = "Integer", required = true)
    private Integer keFangHao;

    @ApiModelProperty(name = "keFangLeiXing", notes = "${column.comment}", dataType = "String", required = true)
    private String keFangLeiXing;

    @ApiModelProperty(name = "quanRiFangJia", notes = "${column.comment}", dataType = "String", required = true)
    private String quanRiFangJia;

    @ApiModelProperty(name = "keFangXinXi", notes = "${column.comment}", dataType = "String", required = true)
    private String keFangXinXi;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJiuDianId() {
        return jiuDianId;
    }

    public void setJiuDianId(Integer jiuDianId) {
        this.jiuDianId = jiuDianId;
    }

    public Integer getKeFangHao() {
        return keFangHao;
    }

    public void setKeFangHao(Integer keFangHao) {
        this.keFangHao = keFangHao;
    }

    public String getKeFangLeiXing() {
        return keFangLeiXing;
    }

    public void setKeFangLeiXing(String keFangLeiXing) {
        this.keFangLeiXing = keFangLeiXing;
    }

    public String getQuanRiFangJia() {
        return quanRiFangJia;
    }

    public void setQuanRiFangJia(String quanRiFangJia) {
        this.quanRiFangJia = quanRiFangJia;
    }

    public String getKeFangXinXi() {
        return keFangXinXi;
    }

    public void setKeFangXinXi(String keFangXinXi) {
        this.keFangXinXi = keFangXinXi;
    }

}