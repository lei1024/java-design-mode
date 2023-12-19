package com.lei.scene;

/**
 * 记录者
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class ConfigOriginator {
    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemeto saveMemento() {
        return new ConfigMemeto(configFile);
    }

    public void getMemeto(ConfigMemeto configMemeto) {
        this.configFile = configMemeto.getConfigFile();
    }

}
