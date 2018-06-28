package com.google.android.gms.internal;

public final class bf {
    public static bg<Long> f5542A = bg.m4608a("analytics.service_client.idle_disconnect_millis", 10000, 10000);
    public static bg<Long> f5543B = bg.m4608a("analytics.service_client.connect_timeout_millis", 5000, 5000);
    public static bg<Long> f5544C = bg.m4608a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);
    public static bg<Long> f5545D = bg.m4608a("analytics.monitoring.sample_period_millis", 86400000, 86400000);
    public static bg<Long> f5546E = bg.m4608a("analytics.initialization_warning_threshold", 5000, 5000);
    private static bg<Boolean> f5547F = bg.m4610a("analytics.service_enabled", false, false);
    private static bg<Long> f5548G = bg.m4608a("analytics.max_tokens", 60, 60);
    private static bg<Float> f5549H = new bg(dc.m4688a("analytics.tokens_per_sec", Float.valueOf(0.5f)), Float.valueOf(0.5f));
    private static bg<Integer> f5550I = bg.m4607a("analytics.max_stored_hits_per_app", 2000, 2000);
    private static bg<Long> f5551J = bg.m4608a("analytics.min_local_dispatch_millis", 120000, 120000);
    private static bg<Long> f5552K = bg.m4608a("analytics.max_local_dispatch_millis", 7200000, 7200000);
    private static bg<Integer> f5553L = bg.m4607a("analytics.max_hits_per_request.k", 20, 20);
    private static bg<Long> f5554M = bg.m4608a("analytics.service_monitor_interval", 86400000, 86400000);
    private static bg<String> f5555N;
    private static bg<Integer> f5556O = bg.m4607a("analytics.first_party_experiment_variant", 0, 0);
    private static bg<Long> f5557P = bg.m4608a("analytics.service_client.second_connect_delay_millis", 5000, 5000);
    private static bg<Long> f5558Q = bg.m4608a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);
    public static bg<Boolean> f5559a = bg.m4610a("analytics.service_client_enabled", true, true);
    public static bg<String> f5560b = bg.m4609a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static bg<Integer> f5561c = bg.m4607a("analytics.max_stored_hits", 2000, 20000);
    public static bg<Integer> f5562d = bg.m4607a("analytics.max_stored_properties_per_app", 100, 100);
    public static bg<Long> f5563e = bg.m4608a("analytics.local_dispatch_millis", 1800000, 120000);
    public static bg<Long> f5564f = bg.m4608a("analytics.initial_local_dispatch_millis", 5000, 5000);
    public static bg<Long> f5565g = bg.m4608a("analytics.dispatch_alarm_millis", 7200000, 7200000);
    public static bg<Long> f5566h = bg.m4608a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);
    public static bg<Integer> f5567i = bg.m4607a("analytics.max_hits_per_dispatch", 20, 20);
    public static bg<Integer> f5568j = bg.m4607a("analytics.max_hits_per_batch", 20, 20);
    public static bg<String> f5569k;
    public static bg<String> f5570l;
    public static bg<String> f5571m;
    public static bg<String> f5572n;
    public static bg<Integer> f5573o = bg.m4607a("analytics.max_get_length", 2036, 2036);
    public static bg<String> f5574p = bg.m4609a("analytics.batching_strategy.k", ao.BATCH_BY_COUNT.name(), ao.BATCH_BY_COUNT.name());
    public static bg<String> f5575q;
    public static bg<Integer> f5576r = bg.m4607a("analytics.max_hit_length.k", 8192, 8192);
    public static bg<Integer> f5577s = bg.m4607a("analytics.max_post_length.k", 8192, 8192);
    public static bg<Integer> f5578t = bg.m4607a("analytics.max_batch_post_length", 8192, 8192);
    public static bg<String> f5579u;
    public static bg<Integer> f5580v = bg.m4607a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
    public static bg<Integer> f5581w = bg.m4607a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    public static bg<Integer> f5582x = bg.m4607a("analytics.http_connection.read_timeout_millis", 61000, 61000);
    public static bg<Long> f5583y = bg.m4608a("analytics.campaigns.time_limit", 86400000, 86400000);
    public static bg<Boolean> f5584z = bg.m4610a("analytics.test.disable_receiver", false, false);

    static {
        String str = "http://www.google-analytics.com";
        f5569k = bg.m4609a("analytics.insecure_host", str, str);
        str = "https://ssl.google-analytics.com";
        f5570l = bg.m4609a("analytics.secure_host", str, str);
        str = "/collect";
        f5571m = bg.m4609a("analytics.simple_endpoint", str, str);
        str = "/batch";
        f5572n = bg.m4609a("analytics.batching_endpoint", str, str);
        str = at.GZIP.name();
        f5575q = bg.m4609a("analytics.compression_strategy.k", str, str);
        String str2 = "404,502";
        f5579u = bg.m4609a("analytics.fallback_responses.k", str2, str2);
        String str3 = "";
        f5555N = bg.m4609a("analytics.first_party_experiment_id", str3, str3);
    }
}
