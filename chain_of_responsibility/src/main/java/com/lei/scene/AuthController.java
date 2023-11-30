package com.lei.scene;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 控制器
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class AuthController {
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {
        //三级审批
        Date date = AuthService.queryAuthInfo("100013", orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, "状态：待三级审批负责人", "王工");
        }
        //二级审批
        if (authDate.after(sf.parse("2023-11-30 00:00:00")) && authDate.before(sf.parse("2023-12-01 23:59:59"))) {
            date = AuthService.queryAuthInfo("100012", orderId);
            if (null == date) {
                return new AuthInfo("0001", "单号：", orderId, " 状态：待⼆级审批负责⼈ ", "张经理");
            }
        }
        //一级审批
        if (authDate.after(sf.parse("2023-12-02 00:00:00")) && authDate.before(sf.parse("2023-12-03 23:59:59"))) {
            date = AuthService.queryAuthInfo("100011", orderId);
            if (null == date) {
                return new AuthInfo("0001", "单号：", orderId, " 状态：待⼀级审批负责⼈ ", "段总");
            }
        }
        return new AuthInfo("0001", "单号：", orderId, " 状态：审批完成", "审批完成");
    }
}
