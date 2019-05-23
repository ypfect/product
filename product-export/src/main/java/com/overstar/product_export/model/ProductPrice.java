package com.overstar.product_export.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * <li> 表名称: product_price</li>
 * <li> 创建人: mbg.generated </li>
 * <li> 创建时间: 2019-05-23 17:12:54</li>
 */
@Table(name = "`product_price`")
public class ProductPrice implements Serializable {
    /**
     * (必填项)
     * 自增ID
     */
    @Id
    @Column(name = "`id`")
    private Long id;

    /**
     * (必填项)
     * 产品ID
     */
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * (必填项)
     * 规格ID
     */
    @Column(name = "`spec_id`")
    private String specId;

    /**
     * (必填项)
     * 旅客类型ID
     */
    @Column(name = "`traveller_type_id`")
    private Integer travellerTypeId;

    /**
     * (必填项)
     * 出行时间
     */
    @Column(name = "`booking_date`")
    private Date bookingDate;

    /**
     * (必填项)
     * 状态
     */
    @Column(name = "`status`")
    private Byte status;

    /**
     * (必填项)
     * 提前预定天数
     */
    @Column(name = "`booking_advance`")
    private Byte bookingAdvance;

    /**
     * (必填项)
     * 货币ID
     */
    @Column(name = "`currency_id`")
    private Byte currencyId;

    /**
     * (必填项)
     * decimal精度更好
     */
    @Column(name = "`market_price`")
    private Double marketPrice;

    /**
     * (必填项)
     * 成本
     */
    @Column(name = "`cost`")
    private Double cost;

    /**
     * (必填项)
     * 售价
     */
    @Column(name = "`sale_price`")
    private Double salePrice;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增ID
     *
     * @return id - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取出行时间
     *
     * @return booking_date - 出行时间
     */
    public Date getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置出行时间
     *
     * @param bookingDate 出行时间
     */
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取提前预定天数
     *
     * @return booking_advance - 提前预定天数
     */
    public Byte getBookingAdvance() {
        return bookingAdvance;
    }

    /**
     * 设置提前预定天数
     *
     * @param bookingAdvance 提前预定天数
     */
    public void setBookingAdvance(Byte bookingAdvance) {
        this.bookingAdvance = bookingAdvance;
    }

    /**
     * 获取货币ID
     *
     * @return currency_id - 货币ID
     */
    public Byte getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置货币ID
     *
     * @param currencyId 货币ID
     */
    public void setCurrencyId(Byte currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取decimal精度更好
     *
     * @return market_price - decimal精度更好
     */
    public Double getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置decimal精度更好
     *
     * @param marketPrice decimal精度更好
     */
    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取成本
     *
     * @return cost - 成本
     */
    public Double getCost() {
        return cost;
    }

    /**
     * 设置成本
     *
     * @param cost 成本
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * 获取售价
     *
     * @return sale_price - 售价
     */
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * 设置售价
     *
     * @param salePrice 售价
     */
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", specId=").append(specId);
        sb.append(", travellerTypeId=").append(travellerTypeId);
        sb.append(", bookingDate=").append(bookingDate);
        sb.append(", status=").append(status);
        sb.append(", bookingAdvance=").append(bookingAdvance);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", cost=").append(cost);
        sb.append(", salePrice=").append(salePrice);
        sb.append("]");
        return sb.toString();
    }
}