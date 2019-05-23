package com.overstar.product_export.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * <li> 表名称: product_spec_travellertype</li>
 * <li> 创建人: mbg.generated </li>
 * <li> 创建时间: 2019-05-23 17:12:54</li>
 */
@Table(name = "`product_spec_travellertype`")
public class ProductSpecTravellertype implements Serializable {
    /**
     * (必填项)
     * 规格ID
     */
    @Id
    @Column(name = "`spec_id`")
    private String specId;

    /**
     * (必填项)
     * 旅客类型ID
     */
    @Id
    @Column(name = "`traveller_type_id`")
    private Integer travellerTypeId;

    /**
     * (必填项)
     * 规格英文名称
     */
    @Column(name = "`spec_name_en`")
    private String specNameEn;

    /**
     * (可选项)
     * 备注
     */
    @Column(name = "`remark`")
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取规格ID
     *
     * @return spec_id - 规格ID
     */
    public String getSpecId() {
        return specId;
    }

    /**
     * 设置规格ID
     *
     * @param specId 规格ID
     */
    public void setSpecId(String specId) {
        this.specId = specId == null ? null : specId.trim();
    }

    /**
     * 获取旅客类型ID
     *
     * @return traveller_type_id - 旅客类型ID
     */
    public Integer getTravellerTypeId() {
        return travellerTypeId;
    }

    /**
     * 设置旅客类型ID
     *
     * @param travellerTypeId 旅客类型ID
     */
    public void setTravellerTypeId(Integer travellerTypeId) {
        this.travellerTypeId = travellerTypeId;
    }

    /**
     * 获取规格英文名称
     *
     * @return spec_name_en - 规格英文名称
     */
    public String getSpecNameEn() {
        return specNameEn;
    }

    /**
     * 设置规格英文名称
     *
     * @param specNameEn 规格英文名称
     */
    public void setSpecNameEn(String specNameEn) {
        this.specNameEn = specNameEn == null ? null : specNameEn.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specId=").append(specId);
        sb.append(", travellerTypeId=").append(travellerTypeId);
        sb.append(", specNameEn=").append(specNameEn);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}