package com.konfigthis.client;

import com.konfigthis.client.api.BouncersApi;
import com.konfigthis.client.api.WatchersApi;

public class CrowdSec {
    private ApiClient apiClient;
    public final BouncersApi bouncers;
    public final WatchersApi watchers;

    public CrowdSec() {
        this(null);
    }

    public CrowdSec(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bouncers = new BouncersApi(this.apiClient);
        this.watchers = new WatchersApi(this.apiClient);
    }

}
