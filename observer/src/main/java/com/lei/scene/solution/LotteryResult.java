package com.lei.scene.solution;

import java.util.Date;

/**
 * result
 *
 * @author leijiahao
 * @date 2023-12-19
 */

public class LotteryResult {
    private String uId;
    private String msg;
    private Date date;

    public LotteryResult(String uId, String lottery, Date date) {
        this.uId = uId;
        this.msg = lottery;
        this.date = date;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
