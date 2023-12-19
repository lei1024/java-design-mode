package com.lei.scene;

/**
 * 备忘录
 * configmemeto
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class ConfigMemeto {
    private ConfigFile configFile;

    public ConfigMemeto(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
