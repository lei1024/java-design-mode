package com.lei.scene.mq;

import java.util.Date;

/**
 * 内部订单MQ
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class OrderMq {
    private String uid;
    private String sku;
    private String orderId;
    private Date createOrderTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

}
