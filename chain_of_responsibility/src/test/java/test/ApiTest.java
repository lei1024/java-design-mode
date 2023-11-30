package test;

import com.lei.solution.AuthLink;
import com.lei.solution.impl.Level1AuthLink;
import com.lei.solution.impl.Level2AuthLink;
import com.lei.solution.impl.Level3AuthLink;
import org.junit.Test;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ApiTest {
    @Test
    public void test_authLink() {
        String userId = "100001";
        String userName = "网三";
        AuthLink authLink = new Level3AuthLink(userId, userName)
                .appendNext(new Level2AuthLink(userId, userName).appendNext(new Level1AuthLink(userId, userName)));
        authLink.doAuth(userId, "10001083", null);
    }
}
