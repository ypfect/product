package com.overstar.product_export.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * <li> 表名称: product_spec</li>
 * <li> 创建人: mbg.generated </li>
 * <li> 创建时间: 2019-05-23 17:12:54</li>
 */
@Table(name = "`product_spec`")
public class ProductSpec implements Serializable {
    /**
     * (必填项)
     * 规格ID
     */
    @Id
    @Column(name = "`spec_id`")
    private String specId;

    /**
     * (必填项)
     * 产品ID
     */
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * (必填项)
     * 规格中文名称
     */
    @Column(name = "`spec_name_zh`")
    private String specNameZh;

    /**
     * (必填项)
     * 是否自费可选，默认0不是自费可选，1为自费可选
     */
    @Column(name = "`self_optional`")
    private Boolean selfOptional;

    /**
     * (可选项)
     * 人数，酒店产品需要配置
     */
    @Column(name = "`persons`")
    private Integer persons;

    /**
     * (必填项)
     * 删除标志，默认0未删除，1已删除
     */
    @Column(name = "`deleted`")
    private Boolean deleted;

    /**
     * (可选项)
     * 不占床儿童年龄上限，酒店配置
     */
    @Column(name = "`child_age_limit`")
    private Integer childAgeLimit;

    /**
     * (可选项)
     * 不占床儿童人数上限，酒店配置
     */
    @Column(name = "`child_num_limit`")
    private Integer childNumLimit;

    /**
     * (可选项)
     * Ԥ
     */
    @Column(name = "`min_booking_amount`")
    private Integer minBookingAmount;

    /**
     * (可选项)
     */
    @Column(name = "`max_booking_amount`")
    private Integer maxBookingAmount;

    /**
     * (可选项)
     */
    @Column(name = "`min_booking_amount_times`")
    private Integer minBookingAmountTimes;

    /**
     * (可选项)
     * desc
     */
    @Column(name = "`description`")
    private String description;

    /**
     * (可选项)
     * 面积
     */
    @Column(name = "`area`")
    private Integer area;

    /**
     * (可选项)
     * 免费早餐份数
     */
    @Column(name = "`free_breakfirst`")
    private Integer freeBreakfirst;

    /**
     * (可选项)
     * 是否有免费wifi
     */
    @Column(name = "`free_wifi`")
    private Byte freeWifi;

    /**
     * (可选项)
     * 床型
     */
    @Column(name = "`bed_style`")
    private String bedStyle;

    /**
     * (可选项)
     * 房型图片
     */
    @Column(name = "`house_style_pic`")
    private String houseStylePic;

    /**
     * (可选项)
     * 是否默认规格(1：是，2：否)
     */
    @Column(name = "`is_default`")
    private Boolean isDefault;

    /**
     * (可选项)
     */
    @Column(name = "`show_order`")
    private Integer showOrder;

    /**
     * (可选项)
     * 规格英文名称
     */
    @Column(name = "`spec_name_en`")
    private String specNameEn;

    /**
     * (必填项)
     * 区分中、英文站点，0中文站，1000英文站
     */
    @Column(name = "`language_site`")
    private Integer languageSite;

    /**
     * (必填项)
     * 英文站是否在售  0:停售 1:开售
     */
    @Column(name = "`en_sale`")
    private Boolean enSale;

    /**
     * (可选项)
     * 英文站前端显示名称
     */
    @Column(name = "`en_show_name`")
    private String enShowName;

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
     * 获取产品ID
     *
     * @return product_id - 产品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置产品ID
     *
     * @param productId 产品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取规格中文名称
     *
     * @return spec_name_zh - 规格中文名称
     */
    public String getSpecNameZh() {
        return specNameZh;
    }

    /**
     * 设置规格中文名称
     *
     * @param specNameZh 规格中文名称
     */
    public void setSpecNameZh(String specNameZh) {
        this.specNameZh = specNameZh == null ? null : specNameZh.trim();
    }

    /**
     * 获取是否自费可选，默认0不是自费可选，1为自费可选
     *
     * @return self_optional - 是否自费可选，默认0不是自费可选，1为自费可选
     */
    public Boolean getSelfOptional() {
        return selfOptional;
    }

    /**
     * 设置是否自费可选，默认0不是自费可选，1为自费可选
     *
     * @param selfOptional 是否自费可选，默认0不是自费可选，1为自费可选
     */
    public void setSelfOptional(Boolean selfOptional) {
        this.selfOptional = selfOptional;
    }

    /**
     * 获取人数，酒店产品需要配置
     *
     * @return persons - 人数，酒店产品需要配置
     */
    public Integer getPersons() {
        return persons;
    }

    /**
     * 设置人数，酒店产品需要配置
     *
     * @param persons 人数，酒店产品需要配置
     */
    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    /**
     * 获取删除标志，默认0未删除，1已删除
     *
     * @return deleted - 删除标志，默认0未删除，1已删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标志，默认0未删除，1已删除
     *
     * @param deleted 删除标志，默认0未删除，1已删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取不占床儿童年龄上限，酒店配置
     *
     * @return child_age_limit - 不占床儿童年龄上限，酒店配置
     */
    public Integer getChildAgeLimit() {
        return childAgeLimit;
    }

    /**
     * 设置不占床儿童年龄上限，酒店配置
     *
     * @param childAgeLimit 不占床儿童年龄上限，酒店配置
     */
    public void setChildAgeLimit(Integer childAgeLimit) {
        this.childAgeLimit = childAgeLimit;
    }

    /**
     * 获取不占床儿童人数上限，酒店配置
     *
     * @return child_num_limit - 不占床儿童人数上限，酒店配置
     */
    public Integer getChildNumLimit() {
        return childNumLimit;
    }

    /**
     * 设置不占床儿童人数上限，酒店配置
     *
     * @param childNumLimit 不占床儿童人数上限，酒店配置
     */
    public void setChildNumLimit(Integer childNumLimit) {
        this.childNumLimit = childNumLimit;
    }

    /**
     * 获取Ԥ
     *
     * @return min_booking_amount - Ԥ
     */
    public Integer getMinBookingAmount() {
        return minBookingAmount;
    }

    /**
     * 设置Ԥ
     *
     * @param minBookingAmount Ԥ
     */
    public void setMinBookingAmount(Integer minBookingAmount) {
        this.minBookingAmount = minBookingAmount;
    }

    /**
     * @return max_booking_amount
     */
    public Integer getMaxBookingAmount() {
        return maxBookingAmount;
    }

    /**
     * @param maxBookingAmount
     */
    public void setMaxBookingAmount(Integer maxBookingAmount) {
        this.maxBookingAmount = maxBookingAmount;
    }

    /**
     * @return min_booking_amount_times
     */
    public Integer getMinBookingAmountTimes() {
        return minBookingAmountTimes;
    }

    /**
     * @param minBookingAmountTimes
     */
    public void setMinBookingAmountTimes(Integer minBookingAmountTimes) {
        this.minBookingAmountTimes = minBookingAmountTimes;
    }

    /**
     * 获取desc
     *
     * @return description - desc
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置desc
     *
     * @param description desc
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取面积
     *
     * @return area - 面积
     */
    public Integer getArea() {
        return area;
    }

    /**
     * 设置面积
     *
     * @param area 面积
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * 获取免费早餐份数
     *
     * @return free_breakfirst - 免费早餐份数
     */
    public Integer getFreeBreakfirst() {
        return freeBreakfirst;
    }

    /**
     * 设置免费早餐份数
     *
     * @param freeBreakfirst 免费早餐份数
     */
    public void setFreeBreakfirst(Integer freeBreakfirst) {
        this.freeBreakfirst = freeBreakfirst;
    }

    /**
     * 获取是否有免费wifi
     *
     * @return free_wifi - 是否有免费wifi
     */
    public Byte getFreeWifi() {
        return freeWifi;
    }

    /**
     * 设置是否有免费wifi
     *
     * @param freeWifi 是否有免费wifi
     */
    public void setFreeWifi(Byte freeWifi) {
        this.freeWifi = freeWifi;
    }

    /**
     * 获取床型
     *
     * @return bed_style - 床型
     */
    public String getBedStyle() {
        return bedStyle;
    }

    /**
     * 设置床型
     *
     * @param bedStyle 床型
     */
    public void setBedStyle(String bedStyle) {
        this.bedStyle = bedStyle == null ? null : bedStyle.trim();
    }

    /**
     * 获取房型图片
     *
     * @return house_style_pic - 房型图片
     */
    public String getHouseStylePic() {
        return houseStylePic;
    }

    /**
     * 设置房型图片
     *
     * @param houseStylePic 房型图片
     */
    public void setHouseStylePic(String houseStylePic) {
        this.houseStylePic = houseStylePic == null ? null : houseStylePic.trim();
    }

    /**
     * 获取是否默认规格(1：是，2：否)
     *
     * @return is_default - 是否默认规格(1：是，2：否)
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认规格(1：是，2：否)
     *
     * @param isDefault 是否默认规格(1：是，2：否)
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return show_order
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * @param showOrder
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
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
     * 获取区分中、英文站点，0中文站，1000英文站
     *
     * @return language_site - 区分中、英文站点，0中文站，1000英文站
     */
    public Integer getLanguageSite() {
        return languageSite;
    }

    /**
     * 设置区分中、英文站点，0中文站，1000英文站
     *
     * @param languageSite 区分中、英文站点，0中文站，1000英文站
     */
    public void setLanguageSite(Integer languageSite) {
        this.languageSite = languageSite;
    }

    /**
     * 获取英文站是否在售  0:停售 1:开售
     *
     * @return en_sale - 英文站是否在售  0:停售 1:开售
     */
    public Boolean getEnSale() {
        return enSale;
    }

    /**
     * 设置英文站是否在售  0:停售 1:开售
     *
     * @param enSale 英文站是否在售  0:停售 1:开售
     */
    public void setEnSale(Boolean enSale) {
        this.enSale = enSale;
    }

    /**
     * 获取英文站前端显示名称
     *
     * @return en_show_name - 英文站前端显示名称
     */
    public String getEnShowName() {
        return enShowName;
    }

    /**
     * 设置英文站前端显示名称
     *
     * @param enShowName 英文站前端显示名称
     */
    public void setEnShowName(String enShowName) {
        this.enShowName = enShowName == null ? null : enShowName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specId=").append(specId);
        sb.append(", productId=").append(productId);
        sb.append(", specNameZh=").append(specNameZh);
        sb.append(", selfOptional=").append(selfOptional);
        sb.append(", persons=").append(persons);
        sb.append(", deleted=").append(deleted);
        sb.append(", childAgeLimit=").append(childAgeLimit);
        sb.append(", childNumLimit=").append(childNumLimit);
        sb.append(", minBookingAmount=").append(minBookingAmount);
        sb.append(", maxBookingAmount=").append(maxBookingAmount);
        sb.append(", minBookingAmountTimes=").append(minBookingAmountTimes);
        sb.append(", description=").append(description);
        sb.append(", area=").append(area);
        sb.append(", freeBreakfirst=").append(freeBreakfirst);
        sb.append(", freeWifi=").append(freeWifi);
        sb.append(", bedStyle=").append(bedStyle);
        sb.append(", houseStylePic=").append(houseStylePic);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", specNameEn=").append(specNameEn);
        sb.append(", languageSite=").append(languageSite);
        sb.append(", enSale=").append(enSale);
        sb.append(", enShowName=").append(enShowName);
        sb.append("]");
        return sb.toString();
    }
}