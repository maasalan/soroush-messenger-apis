package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.p158a.C6566m;
import java.util.concurrent.TimeUnit;
import org.linphone.core.Privacy;

public final class mm {
    public static final ea<Boolean> f6139a = new eb("crash:enabled", Boolean.valueOf(true));
    private static ea<String> f6140b = new ee("crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
    private static ea<Integer> f6141c = ea.m4764a("crash:log_buffer_capacity", 100);
    private static ea<Integer> f6142d = ea.m4764a("crash:log_buffer_max_total_size", (int) Privacy.DEFAULT);
    private static ea<Integer> f6143e = ea.m4764a("crash:crash_backlog_capacity", 5);
    private static ea<Long> f6144f = ea.m4765a("crash:crash_backlog_max_age", 604800000);
    private static ea<Long> f6145g = ea.m4765a("crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
    private static ea<Long> f6146h = ea.m4765a("crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
    private static ea<Integer> f6147i = ea.m4764a("crash:retry_num_attempts", 12);
    private static ea<Integer> f6148j = ea.m4764a("crash:batch_size", 5);
    private static ea<Long> f6149k = ea.m4765a("crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
    private static ea<Integer> f6150l = ea.m4764a("crash:frame_depth", 60);
    private static ea<Integer> f6151m = ea.m4764a("crash:receiver_delay", 100);
    private static ea<Integer> f6152n = ea.m4764a("crash:thread_idle_timeout", 10);

    public static final void m4999a(Context context) {
        ek.m4768a();
        eg b = ek.m4769b();
        synchronized (b) {
            if (b.f5676a) {
                return;
            }
            try {
                b.f5677b = ei.asInterface(DynamiteModule.m4558a(context, DynamiteModule.f5480e, ModuleDescriptor.MODULE_ID).m4567a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                b.f5677b.init(C6566m.m15848a((Object) context));
                b.f5676a = true;
            } catch (Throwable e) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }
}
