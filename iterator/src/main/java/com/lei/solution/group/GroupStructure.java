package com.lei.solution.group;

import com.lei.solution.lang.Collection;
import com.lei.solution.lang.Iterator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 核心实现
 *
 * @author leijiahao
 * @date 2023-12-04
 */
public class GroupStructure implements Collection<Employee, Link> {
    private String groupId;
    private String groupName;
    private Map<String, Employee> employeeMap = new ConcurrentHashMap<>();
    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<>();
    private Map<String, String> invertMap = new ConcurrentHashMap<>();

    public GroupStructure(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getuId(), employee);
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getuId());
    }

    /**
     * @param key
     * @param link
     * @return
     */
    @Override
    public boolean addLink(String key, Link link) {
        invertMap.put(link.getToId(), link.getFromId());
        if (linkMap.containsKey(key)) {
            return linkMap.get(key)
                          .add(link);
        } else {
            List<Link> links = new LinkedList<>();
            links.add(link);
            linkMap.put(key, links);
            return true;
        }
    }

    /**
     * @param key
     * @return
     */
    @Override
    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            HashMap<String, Integer> keyMap = new HashMap<>();
            int totalIdx = 0;
            private String fromId = groupId;
            private String toId = groupId;

            /**
             * @return
             */
            @Override
            public boolean hashNext() {
                return totalIdx < employeeMap.size();
            }

            /**
             * @return
             */
            @Override
            public Employee next() {
                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);
                // 同级节点扫描
                if (null == links) {
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                // 上级节点扫描
                while (cursorIdx > links.size() - 1) {
                    fromId = invertMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                // 获取节点
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFromId();
                totalIdx++;

                // 返回结果
                return employeeMap.get(link.getToId());

            }

            private int getCursorIdx(String fromId) {
                int idx = 0;
                if (keyMap.containsKey(fromId)) {
                    idx = keyMap.get(fromId);
                    keyMap.put(fromId, ++idx);
                } else {
                    keyMap.put(fromId, idx);
                }
                return idx;
            }
        };
    }
}
