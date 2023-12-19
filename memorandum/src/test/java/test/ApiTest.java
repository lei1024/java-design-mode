package test;

import com.alibaba.fastjson2.JSON;
import com.lei.scene.Admin;
import com.lei.scene.ConfigFile;
import com.lei.scene.ConfigOriginator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        Admin admin = new Admin();
        ConfigOriginator configOriginator = new ConfigOriginator();
        configOriginator.setConfigFile(new ConfigFile("10001", "配置内容A", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); //保存配置
        configOriginator.setConfigFile(new ConfigFile("10002", "配置内容B", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); //保存配置
        configOriginator.setConfigFile(new ConfigFile("10003", "配置内容C", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); //保存配置
        configOriginator.setConfigFile(new ConfigFile("10004", "配置内容D", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); //保存配置
        //历史配置(回滚)
        configOriginator.getMemeto(admin.undo());
        logger.info("历史配置(回滚) undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));
        //历史配置(回滚)
        configOriginator.getMemeto(admin.undo());
        logger.info("历史配置(回滚) undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));
        //历史配置(回滚)
        configOriginator.getMemeto(admin.undo());
        logger.info("历史配置(回滚) undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        //历史配置(回滚)
        configOriginator.getMemeto(admin.undo());
        logger.info("历史配置(回滚) undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));

    }
}
