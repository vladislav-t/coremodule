package com.ook.group.android.stickersok.coremodule.models;

import java.util.HashMap;
import java.util.Map;

public class AppConfigModel {

    private final Map<String, String> ads = new HashMap<>();
    private final Map<String, String> mainConfigs = new HashMap<>();

    /**
     * Fetch Ad slot or ad mode from map
     *
     * @param key Map key
     * @return {@link String}
     */
    public String getAdValue(String key) {
        return ads.size() > 0 ? ads.get(key) : null;
    }

    /**
     * Set Ad slot or ad mode into map
     *
     * @param key Map key
     */
    public void setAdValue(String key, String val) {
        if (val != null && !val.equals("")) {
            ads.put(key, val);
        }
    }

    /**
     * Get app config from map
     *
     * @param key Map key
     * @return {@link String}
     */
    public String getMainConfig(String key) {
        return mainConfigs.size() > 0 ? mainConfigs.get(key) : null;
    }

    /**
     * Set app config into map
     *
     * @param key Map key
     */
    public void setMainConfig(String key, String val) {
        if (val != null && !val.equals("")) {
            mainConfigs.put(key, val);
        }
    }

}