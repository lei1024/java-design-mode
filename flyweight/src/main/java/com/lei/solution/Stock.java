package com.lei.solution;

/**
 * Stock
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class Stock {
    private int total; //库存总量
    private int used; //已用库存


    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
