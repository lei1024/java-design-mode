package com.lei.solution;

import java.util.Date;

/**
 * 活动
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class Activity {
    private Long id;
    private String name;
    private String desc;
    private Date startTime;
    private Date stopTime;
    /**
     * 库存
     */
    private Stock stock;

    public Activity(Long id, String name, String desc, Date startTime, Date stopTime, Stock stock) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.stock = stock;
    }

    public Activity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
