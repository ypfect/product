package com.overstar.product_export.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * <li> 表名称: traveller_types</li>
 * <li> 创建人: mbg.generated </li>
 * <li> 创建时间: 2019-05-23 17:12:54</li>
 */
@Table(name = "`traveller_types`")
public class TravellerTypes implements Serializable {
    /**
     * (必填项)
     * 自增ID
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * (必填项)
     * 类别中文名称
     */
    @Column(name = "`type_name_zh`")
    private String typeNameZh;

    /**
     * (必填项)
     * 类别英文名称
     */
    @Column(name = "`type_name_en`")
    private String typeNameEn;

    /**
     * (必填项)
     * 起始年龄
     */
    @Column(name = "`start_age`")
    private Integer startAge;

    /**
     * (可选项)
     * 截止年龄
     */
    @Column(name = "`end_age`")
    private Integer endAge;

    /**
     * (必填项)
     * 类型备注或者别名，用于管理员根据名字区分
     */
    @Column(name = "`remark`")
    private String remark;

    /**
     * (必填项)
     */
    @Column(name = "`normal_price`")
    private Boolean normalPrice;

    /**
     * (必填项)
     * 旅客类型分类
     */
    @Column(name = "`type_code`")
    private Integer typeCode;

    /**
     * (可选项)
     * 扣除库存数量
     */
    @Column(name = "`stock_num`")
    private Integer stockNum;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增ID
     *
     * @return id - 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类别中文名称
     *
     * @return type_name_zh - 类别中文名称
     */
    public String getTypeNameZh() {
        return typeNameZh;
    }

    /**
     * 设置类别中文名称
     *
     * @param typeNameZh 类别中文名称
     */
    public void setTypeNameZh(String typeNameZh) {
        this.typeNameZh = typeNameZh == null ? null : typeNameZh.trim();
    }

    /**
     * 获取类别英文名称
     *
     * @return type_name_en - 类别英文名称
     */
    public String getTypeNameEn() {
        return typeNameEn;
    }

    /**
     * 设置类别英文名称
     *
     * @param typeNameEn 类别英文名称
     */
    public void setTypeNameEn(String typeNameEn) {
        this.typeNameEn = typeNameEn == null ? null : typeNameEn.trim();
    }

    /**
     * 获取起始年龄
     *
     * @return start_age - 起始年龄
     */
    public Integer getStartAge() {
        return startAge;
    }

    /**
     * 设置起始年龄
     *
     * @param startAge 起始年龄
     */
    public void setStartAge(Integer startAge) {
        this.startAge = startAge;
    }

    /**
     * 获取截止年龄
     *
     * @return end_age - 截止年龄
     */
    public Integer getEndAge() {
        return endAge;
    }

    /**
     * 设置截止年龄
     *
     * @param endAge 截止年龄
     */
    public void setEndAge(Integer endAge) {
        this.endAge = endAge;
    }

    /**
     * 获取类型备注或者别名，用于管理员根据名字区分
     *
     * @return remark - 类型备注或者别名，用于管理员根据名字区分
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置类型备注或者别名，用于管理员根据名字区分
     *
     * @param remark 类型备注或者别名，用于管理员根据名字区分
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return normal_price
     */
    public Boolean getNormalPrice() {
        return normalPrice;
    }

    /**
     * @param normalPrice
     */
    public void setNormalPrice(Boolean normalPrice) {
        this.normalPrice = normalPrice;
    }

    /**
     * 获取旅客类型分类
     *
     * @return type_code - 旅客类型分类
     */
    public Integer getTypeCode() {
        return typeCode;
    }

    /**
     * 设置旅客类型分类
     *
     * @param typeCode 旅客类型分类
     */
    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * 获取扣除库存数量
     *
     * @return stock_num - 扣除库存数量
     */
    public Integer getStockNum() {
        return stockNum;
    }

    /**
     * 设置扣除库存数量
     *
     * @param stockNum 扣除库存数量
     */
    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeNameZh=").append(typeNameZh);
        sb.append(", typeNameEn=").append(typeNameEn);
        sb.append(", startAge=").append(startAge);
        sb.append(", endAge=").append(endAge);
        sb.append(", remark=").append(remark);
        sb.append(", normalPrice=").append(normalPrice);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", stockNum=").append(stockNum);
        sb.append("]");
        return sb.toString();
    }
}