package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

public final class C1788h {
    private static IntentFilter f5459a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long f5460b = 0;
    private static float f5461c = Float.NaN;

    @TargetApi(20)
    public static int m4525a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f5459a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C1793m.m4533b() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 1;
        }
        return (i << 1) | i2;
    }

    public static synchronized float m4526b(Context context) {
        synchronized (C1788h.class) {
            if (SystemClock.elapsedRealtime() - f5460b >= 60000 || Float.isNaN(f5461c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f5459a);
                if (registerReceiver != null) {
                    f5461c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f5460b = SystemClock.elapsedRealtime();
                float f = f5461c;
                return f;
            }
            f = f5461c;
            return f;
        }
    }
}
