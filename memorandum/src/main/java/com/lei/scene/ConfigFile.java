package com.lei.scene;

import lombok.Data;

import java.util.Date;

/**
 * configfile
 *
 * @author leijiahao
 * @date 2023-12-06
 */
@Data
public class ConfigFile {
    private String versionNo;
    private String content;
    private Date dateTime;

    private String operator; //操作人

    public ConfigFile(String number, String configuration, Date date, String info) {
        this.versionNo = number;
        this.content = configuration;
        this.dateTime = date;
        this.operator = info;
    }

}
