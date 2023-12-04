package test;

import com.lei.solution.group.Employee;
import com.lei.solution.group.GroupStructure;
import com.lei.solution.group.Link;
import com.lei.solution.lang.Iterator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-12-04
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        GroupStructure groupStructure = new GroupStructure("1", "小福哥");
        // 雇员信息
        // 雇员信息
        groupStructure.add(new Employee("2", "花花", "⼆级部⻔"));
        groupStructure.add(new Employee("3", "⾖包", "⼆级部⻔"));
        groupStructure.add(new Employee("4", "蹦蹦", "三级部⻔"));
        groupStructure.add(new Employee("5", "⼤烧", "三级部⻔"));
        groupStructure.add(new Employee("6", "⻁哥", "四级部⻔"));
        groupStructure.add(new Employee("7", "玲姐", "四级部⻔"));
        groupStructure.add(new Employee("8", "秋雅", "四级部⻔"));
        // 节点关系
        groupStructure.addLink("1", new Link("1", "2"));
        groupStructure.addLink("1", new Link("1", "3"));
        groupStructure.addLink("2", new Link("2", "4"));
        groupStructure.addLink("2", new Link("2", "5"));
        groupStructure.addLink("5", new Link("5", "6"));
        groupStructure.addLink("5", new Link("5", "7"));
        groupStructure.addLink("5", new Link("5", "8"));

        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hashNext()) {
            Employee next = iterator.next();
            logger.info("{},雇员 id:{},name:{}", next.getDescribe(), next.getuId(), next.getName());
        }

    }
}
