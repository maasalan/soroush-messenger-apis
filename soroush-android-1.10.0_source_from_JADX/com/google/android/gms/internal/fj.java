package com.google.android.gms.internal;

import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class fj {
    public static fk<Long> f5745A = fk.m4826a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);
    public static fk<Long> f5746B = fk.m4826a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);
    public static fk<Long> f5747C = fk.m4826a("measurement.upload.initial_upload_delay_time", 15000, 15000);
    public static fk<Long> f5748D = fk.m4826a("measurement.upload.retry_time", 1800000, 1800000);
    public static fk<Integer> f5749E = fk.m4825a("measurement.upload.retry_count", 6, 6);
    public static fk<Long> f5750F = fk.m4826a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
    public static fk<Integer> f5751G = fk.m4825a("measurement.lifetimevalue.max_currency_tracked", 4, 4);
    public static fk<Integer> f5752H = fk.m4825a("measurement.audience.filter_result_max_count", 200, 200);
    public static fk<Long> f5753I = fk.m4826a("measurement.service_client.idle_disconnect_millis", 5000, 5000);
    private static fk<Boolean> f5754J = fk.m4828a("measurement.service_enabled", true, true);
    private static fk<Boolean> f5755K = fk.m4828a("measurement.service_client_enabled", true, true);
    private static fk<Boolean> f5756L = fk.m4828a("measurement.log_third_party_store_events_enabled", false, false);
    private static fk<Boolean> f5757M = fk.m4828a("measurement.log_installs_enabled", false, false);
    private static fk<Boolean> f5758N = fk.m4828a("measurement.log_upgrades_enabled", false, false);
    private static fk<Boolean> f5759O = fk.m4828a("measurement.log_androidId_enabled", false, false);
    public static fk<Boolean> f5760a = fk.m4828a("measurement.upload_dsid_enabled", false, false);
    public static fk<Boolean> f5761b = fk.m4828a("measurement.event_sampling_enabled", false, false);
    public static fk<String> f5762c = fk.m4827a("measurement.log_tag", "FA", "FA-SVC");
    public static fk<Long> f5763d = fk.m4826a("measurement.ad_id_cache_time", 10000, 10000);
    public static fk<Long> f5764e = fk.m4826a("measurement.monitoring.sample_period_millis", 86400000, 86400000);
    public static fk<Long> f5765f = fk.m4826a("measurement.config.cache_time", 86400000, 3600000);
    public static fk<String> f5766g;
    public static fk<String> f5767h;
    public static fk<Integer> f5768i = fk.m4825a("measurement.upload.max_bundles", 100, 100);
    public static fk<Integer> f5769j = fk.m4825a("measurement.upload.max_batch_size", 65536, 65536);
    public static fk<Integer> f5770k = fk.m4825a("measurement.upload.max_bundle_size", 65536, 65536);
    public static fk<Integer> f5771l = fk.m4825a("measurement.upload.max_events_per_bundle", (int) IjkMediaCodecInfo.RANK_MAX, (int) IjkMediaCodecInfo.RANK_MAX);
    public static fk<Integer> f5772m = fk.m4825a("measurement.upload.max_events_per_day", 100000, 100000);
    public static fk<Integer> f5773n = fk.m4825a("measurement.upload.max_error_events_per_day", (int) IjkMediaCodecInfo.RANK_MAX, (int) IjkMediaCodecInfo.RANK_MAX);
    public static fk<Integer> f5774o = fk.m4825a("measurement.upload.max_public_events_per_day", 50000, 50000);
    public static fk<Integer> f5775p = fk.m4825a("measurement.upload.max_conversions_per_day", (int) PacketWriter.QUEUE_SIZE, (int) PacketWriter.QUEUE_SIZE);
    public static fk<Integer> f5776q = fk.m4825a("measurement.upload.max_realtime_events_per_day", 10, 10);
    public static fk<Integer> f5777r = fk.m4825a("measurement.store.max_stored_events_per_app", 100000, 100000);
    public static fk<String> f5778s;
    public static fk<Long> f5779t = fk.m4826a("measurement.upload.backoff_period", 43200000, 43200000);
    public static fk<Long> f5780u = fk.m4826a("measurement.upload.window_interval", 3600000, 3600000);
    public static fk<Long> f5781v = fk.m4826a("measurement.upload.interval", 3600000, 3600000);
    public static fk<Long> f5782w = fk.m4826a("measurement.upload.realtime_upload_interval", 10000, 10000);
    public static fk<Long> f5783x = fk.m4826a("measurement.upload.debug_upload_interval", 1000, 1000);
    public static fk<Long> f5784y = fk.m4826a("measurement.upload.minimum_delay", 500, 500);
    public static fk<Long> f5785z = fk.m4826a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    static {
        String str = "https";
        f5766g = fk.m4827a("measurement.config.url_scheme", str, str);
        str = "app-measurement.com";
        f5767h = fk.m4827a("measurement.config.url_authority", str, str);
        str = "https://app-measurement.com/a";
        f5778s = fk.m4827a("measurement.upload.url", str, str);
    }
}
