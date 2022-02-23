package com.ook.group.android.stickersok.coremodule.models;

import static com.ook.group.android.stickersok.coremodule.constants.ApiConfigs.PROD_ADMIN_API;

public class EnvConfigModel {

    private final String postcardAPI;
    private final String adminAPI;
    private final String activityAPI;
    private final Boolean ookLogs;
    private final Boolean testingAd;
    private final Boolean failedAds;
    private final Boolean testingYandexMetrica;
    private final Boolean enableRemoteConfig;
    private final Boolean remoteConfigDebug;

    public EnvConfigModel(
            String postcardAPI,
            String activityAPI,
            Boolean ookLogs,
            Boolean enableRemoteConfig,
            Boolean remoteConfigDebug,
            Boolean testingAd,
            Boolean failedAds,
            Boolean testingYandexMetrica) {
        this.postcardAPI = postcardAPI;
        this.adminAPI = PROD_ADMIN_API;
        this.activityAPI = activityAPI;
        this.ookLogs = ookLogs;
        this.enableRemoteConfig = enableRemoteConfig;
        this.remoteConfigDebug = remoteConfigDebug;
        this.testingAd = testingAd;
        this.failedAds = failedAds;
        this.testingYandexMetrica = testingYandexMetrica;
    }

    public boolean isFailedAdsEnabled() {
        return failedAds;
    }

    public boolean isOokLogsEnabled() {
        return ookLogs;
    }

    public boolean isRemoteConfigEnabled() {
        return enableRemoteConfig != null && enableRemoteConfig;
    }

    /**
     * Enable possibility to check firebase keys by using _debug suffix for avoiding using prod keys
     *
     * @return boolean
     */
    public boolean isRemoteConfigDebugEnabled() {
        return remoteConfigDebug;
    }

    public boolean isTestingAdEnabled() {
        return testingAd;
    }

    public boolean isTestingYandexMetricaEnabled() {
        return testingYandexMetrica;
    }

    public String getPostcardAPI() {
        return postcardAPI;
    }

    public String getAdminAPI() {
        return adminAPI;
    }

    public String getActivityAPI() {
        return activityAPI;
    }

    public enum EnvironmentType {
        RELEASE,
        DEBUG,
        INTERNAL
    }

}