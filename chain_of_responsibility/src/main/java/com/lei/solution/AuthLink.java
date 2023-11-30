package com.lei.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 审批链抽象类
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public abstract class AuthLink {
    protected final Logger logger = LoggerFactory.getLogger(AuthLink.class);
    protected SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String levelUserId;
    protected String levelUserName;
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
