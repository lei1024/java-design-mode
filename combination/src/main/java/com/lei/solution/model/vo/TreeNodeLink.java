package com.lei.solution.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 树节点链接链路
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值

}
