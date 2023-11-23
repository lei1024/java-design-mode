package com.lei.scene.mq;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 地三方订单
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class POPOrderService {
    private String uId;
    private String orderId;
    private Date orderTime;
    private Date sku;
    private Date skuName;

    private BigDecimal decimal;

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

}
