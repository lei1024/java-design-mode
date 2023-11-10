package com.lei.scene;

import lombok.Data;

/**
 * 抽奖请求
 *
 * @author leijiahao
 * @date 2023-11-10
 */
@Data
public class AwardReq {
    private String uid;
    private Integer awardType;

}
