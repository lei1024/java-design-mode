package com.lei.scene.normal;

import java.util.Date;

/**
 * 抽奖结果
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class LotteryResult {
    private String uId;
    private Date date;
    private String lottery;

    public LotteryResult(String uId, String lottery, Date date) {
        this.uId = uId;
        this.lottery = lottery;
        this.date = date;
    }
}
