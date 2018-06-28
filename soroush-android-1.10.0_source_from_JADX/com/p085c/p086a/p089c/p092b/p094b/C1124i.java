package com.p085c.p086a.p089c.p092b.p094b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import org.jivesoftware.smack.roster.Roster;

public final class C1124i {
    public final int f3625a;
    public final int f3626b;
    public final int f3627c;
    private final Context f3628d;

    public static final class C1122a {
        public final Context f3617a;
        public ActivityManager f3618b;
        public C1123c f3619c;
        public float f3620d = 2.0f;
        public float f3621e = 4.0f;
        public float f3622f = 0.4f;
        public float f3623g = 0.33f;
        public int f3624h = 4194304;

        public C1122a(Context context) {
            this.f3617a = context;
            this.f3618b = (ActivityManager) context.getSystemService("activity");
            this.f3619c = new C5132b(context.getResources().getDisplayMetrics());
        }
    }

    interface C1123c {
        int mo1154a();

        int mo1155b();
    }

    private static final class C5132b implements C1123c {
        private final DisplayMetrics f14351a;

        public C5132b(DisplayMetrics displayMetrics) {
            this.f14351a = displayMetrics;
        }

        public final int mo1154a() {
            return this.f14351a.widthPixels;
        }

        public final int mo1155b() {
            return this.f14351a.heightPixels;
        }
    }

    public C1124i(Context context, ActivityManager activityManager, C1123c c1123c, float f, float f2, int i, float f3, float f4) {
        this.f3628d = context;
        if (C1124i.m2723a(activityManager)) {
            i /= 2;
        }
        this.f3627c = i;
        float memoryClass = (float) ((activityManager.getMemoryClass() * Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) * Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        if (C1124i.m2723a(activityManager)) {
            f3 = f4;
        }
        int round = Math.round(memoryClass * f3);
        float a = (float) ((c1123c.mo1154a() * c1123c.mo1155b()) * 4);
        i = Math.round(a * f2);
        int round2 = Math.round(a * f);
        int i2 = round - this.f3627c;
        int i3 = round2 + i;
        if (i3 <= i2) {
            this.f3626b = round2;
            this.f3625a = i;
        } else {
            a = ((float) i2) / (f2 + f);
            this.f3626b = Math.round(f * a);
            this.f3625a = Math.round(a * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String str = "MemorySizeCalculator";
            StringBuilder stringBuilder = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            stringBuilder.append(m2722a(this.f3626b));
            stringBuilder.append(", pool size: ");
            stringBuilder.append(m2722a(this.f3625a));
            stringBuilder.append(", byte array size: ");
            stringBuilder.append(m2722a(this.f3627c));
            stringBuilder.append(", memory class limited? ");
            stringBuilder.append(i3 > round);
            stringBuilder.append(", max size: ");
            stringBuilder.append(m2722a(round));
            stringBuilder.append(", memoryClass: ");
            stringBuilder.append(activityManager.getMemoryClass());
            stringBuilder.append(", isLowMemoryDevice: ");
            stringBuilder.append(C1124i.m2723a(activityManager));
            Log.d(str, stringBuilder.toString());
        }
    }

    private String m2722a(int i) {
        return Formatter.formatFileSize(this.f3628d, (long) i);
    }

    private static boolean m2723a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : false;
    }
}
