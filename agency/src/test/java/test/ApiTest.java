package test;

import com.lei.scene.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_IUserDao() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");

        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String info = userDao.queryUserInfo("100001");
        logger.info("测试结果：{}", info);
    }
}
