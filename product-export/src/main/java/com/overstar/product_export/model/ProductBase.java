package com.overstar.product_export.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * <li> 表名称: product_base</li>
 * <li> 创建人: mbg.generated </li>
 * <li> 创建时间: 2019-05-23 17:12:54</li>
 */
@Table(name = "`product_base`")
public class ProductBase implements Serializable {
    /**
     * (必填项)
     * 产品ID
     */
    @Id
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * (必填项)
     * 产品中文名称
     */
    @Column(name = "`product_name_zh`")
    private String productNameZh;

    /**
     * (必填项)
     * 产品英文名称
     */
    @Column(name = "`product_name_en`")
    private String productNameEn;

    /**
     * (必填项)
     * 产品类别ID
     */
    @Column(name = "`type_id`")
    private Integer typeId;

    /**
     * (必填项)
     * 产品状态：0上线，1下线
     */
    @Column(name = "`product_status`")
    private Integer productStatus;

    /**
     * (必填项)
     * 所属国家ID列表
     */
    @Column(name = "`country_ids`")
    private String countryIds;

    /**
     * (可选项)
     * 产品对应货币类型ID
     */
    @Column(name = "`currency_id`")
    private Integer currencyId;

    /**
     * (可选项)
     * 点评次数
     */
    @Column(name = "`comment_num`")
    private Integer commentNum;

    /**
     * (可选项)
     * 游玩天数
     */
    @Column(name = "`play_days`")
    private Integer playDays;

    /**
     * (可选项)
     * 住宿几晚
     */
    @Column(name = "`hotel_nights`")
    private Integer hotelNights;

    /**
     * (可选项)
     */
    @Column(name = "`remark`")
    private String remark;

    /**
     * (必填项)
     * 删除标志，默认0未删除，1已删除
     */
    @Column(name = "`deleted`")
    private Boolean deleted;

    /**
     * (必填项)
     */
    @Column(name = "`purchase_num`")
    private Integer purchaseNum;

    /**
     * (可选项)
     * 组合折扣
     */
    @Column(name = "`discount`")
    private Double discount;

    /**
     * (可选项)
     * 立即确认标识
     */
    @Column(name = "`confirmation_flag`")
    private Integer confirmationFlag;

    /**
     * (必填项)
     * 0:不推荐，1：推荐
     */
    @Column(name = "`recommend_flag`")
    private Boolean recommendFlag;

    /**
     * (可选项)
     */
    @Column(name = "`source_channel`")
    private Integer sourceChannel;

    /**
     * (可选项)
     */
    @Column(name = "`source_id`")
    private String sourceId;

    /**
     * (必填项)
     * 英文站前端显示名称
     */
    @Column(name = "`en_show_name`")
    private String enShowName;

    /**
     * (必填项)
     * 所属城市ID列表
     */
    @Column(name = "`city_ids`")
    private String cityIds;

    private static final long serialVersionUID = 1L;

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
     * 获取产品中文名称
     *
     * @return product_name_zh - 产品中文名称
     */
    public String getProductNameZh() {
        return productNameZh;
    }

    /**
     * 设置产品中文名称
     *
     * @param productNameZh 产品中文名称
     */
    public void setProductNameZh(String productNameZh) {
        this.productNameZh = productNameZh == null ? null : productNameZh.trim();
    }

    /**
     * 获取产品英文名称
     *
     * @return product_name_en - 产品英文名称
     */
    public String getProductNameEn() {
        return productNameEn;
    }

    /**
     * 设置产品英文名称
     *
     * @param productNameEn 产品英文名称
     */
    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn == null ? null : productNameEn.trim();
    }

    /**
     * 获取产品类别ID
     *
     * @return type_id - 产品类别ID
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置产品类别ID
     *
     * @param typeId 产品类别ID
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取产品状态：0上线，1下线
     *
     * @return product_status - 产品状态：0上线，1下线
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * 设置产品状态：0上线，1下线
     *
     * @param productStatus 产品状态：0上线，1下线
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * 获取所属国家ID列表
     *
     * @return country_ids - 所属国家ID列表
     */
    public String getCountryIds() {
        return countryIds;
    }

    /**
     * 设置所属国家ID列表
     *
     * @param countryIds 所属国家ID列表
     */
    public void setCountryIds(String countryIds) {
        this.countryIds = countryIds == null ? null : countryIds.trim();
    }

    /**
     * 获取产品对应货币类型ID
     *
     * @return currency_id - 产品对应货币类型ID
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置产品对应货币类型ID
     *
     * @param currencyId 产品对应货币类型ID
     */
    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取点评次数
     *
     * @return comment_num - 点评次数
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * 设置点评次数
     *
     * @param commentNum 点评次数
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * 获取游玩天数
     *
     * @return play_days - 游玩天数
     */
    public Integer getPlayDays() {
        return playDays;
    }

    /**
     * 设置游玩天数
     *
     * @param playDays 游玩天数
     */
    public void setPlayDays(Integer playDays) {
        this.playDays = playDays;
    }

    /**
     * 获取住宿几晚
     *
     * @return hotel_nights - 住宿几晚
     */
    public Integer getHotelNights() {
        return hotelNights;
    }

    /**
     * 设置住宿几晚
     *
     * @param hotelNights 住宿几晚
     */
    public void setHotelNights(Integer hotelNights) {
        this.hotelNights = hotelNights;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
     * @return purchase_num
     */
    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * @param purchaseNum
     */
    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    /**
     * 获取组合折扣
     *
     * @return discount - 组合折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置组合折扣
     *
     * @param discount 组合折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获取立即确认标识
     *
     * @return confirmation_flag - 立即确认标识
     */
    public Integer getConfirmationFlag() {
        return confirmationFlag;
    }

    /**
     * 设置立即确认标识
     *
     * @param confirmationFlag 立即确认标识
     */
    public void setConfirmationFlag(Integer confirmationFlag) {
        this.confirmationFlag = confirmationFlag;
    }

    /**
     * 获取0:不推荐，1：推荐
     *
     * @return recommend_flag - 0:不推荐，1：推荐
     */
    public Boolean getRecommendFlag() {
        return recommendFlag;
    }

    /**
     * 设置0:不推荐，1：推荐
     *
     * @param recommendFlag 0:不推荐，1：推荐
     */
    public void setRecommendFlag(Boolean recommendFlag) {
        this.recommendFlag = recommendFlag;
    }

    /**
     * @return source_channel
     */
    public Integer getSourceChannel() {
        return sourceChannel;
    }

    /**
     * @param sourceChannel
     */
    public void setSourceChannel(Integer sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    /**
     * @return source_id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
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

    /**
     * 获取所属城市ID列表
     *
     * @return city_ids - 所属城市ID列表
     */
    public String getCityIds() {
        return cityIds;
    }

    /**
     * 设置所属城市ID列表
     *
     * @param cityIds 所属城市ID列表
     */
    public void setCityIds(String cityIds) {
        this.cityIds = cityIds == null ? null : cityIds.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", productNameZh=").append(productNameZh);
        sb.append(", productNameEn=").append(productNameEn);
        sb.append(", typeId=").append(typeId);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", countryIds=").append(countryIds);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", playDays=").append(playDays);
        sb.append(", hotelNights=").append(hotelNights);
        sb.append(", remark=").append(remark);
        sb.append(", deleted=").append(deleted);
        sb.append(", purchaseNum=").append(purchaseNum);
        sb.append(", discount=").append(discount);
        sb.append(", confirmationFlag=").append(confirmationFlag);
        sb.append(", recommendFlag=").append(recommendFlag);
        sb.append(", sourceChannel=").append(sourceChannel);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", enShowName=").append(enShowName);
        sb.append(", cityIds=").append(cityIds);
        sb.append("]");
        return sb.toString();
    }
}