package com.lei.scene;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * admin 管理员
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class Admin {

    private int cursorIdx = 0;
    private List<ConfigMemeto> mementoList = new ArrayList<>();

    private Map<String, ConfigMemeto> memetoMap = new ConcurrentHashMap<>();

    public void append(ConfigMemeto memeto) {
        mementoList.add(memeto);
        memetoMap.put(memeto.getConfigFile()
                            .getVersionNo(), memeto);
        cursorIdx++;
    }

    public ConfigMemeto undo() {
        if (--cursorIdx <= 0) {
            return mementoList.get(0);
        }
        return mementoList.get(cursorIdx);
    }

    public ConfigMemeto redo() {
        if (++cursorIdx > mementoList.size()) {
            return
                    mementoList.get(mementoList.size() - 1);
        }
        return mementoList.get(cursorIdx);
    }

    public ConfigMemeto get(String versionNo) {
        return memetoMap.get(versionNo);
    }

}
