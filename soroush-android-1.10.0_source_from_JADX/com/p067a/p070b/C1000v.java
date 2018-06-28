package com.p067a.p070b;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.msgpack.util.TemplatePrecompiler;

public class C1000v {
    public static String f3206a = "Volley";
    public static boolean f3207b = Log.isLoggable("Volley", 2);

    static class C0999a {
        public static final boolean f3203a = C1000v.f3207b;
        private final List<C0998a> f3204b = new ArrayList();
        private boolean f3205c = false;

        private static class C0998a {
            public final String f3200a;
            public final long f3201b;
            public final long f3202c;

            public C0998a(String str, long j, long j2) {
                this.f3200a = str;
                this.f3201b = j;
                this.f3202c = j2;
            }
        }

        C0999a() {
        }

        public final synchronized void m2452a(String str) {
            long j;
            this.f3205c = true;
            if (this.f3204b.size() == 0) {
                j = 0;
            } else {
                j = ((C0998a) this.f3204b.get(this.f3204b.size() - 1)).f3202c - ((C0998a) this.f3204b.get(0)).f3202c;
            }
            if (j > 0) {
                long j2 = ((C0998a) this.f3204b.get(0)).f3202c;
                C1000v.m2456b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C0998a c0998a : this.f3204b) {
                    C1000v.m2456b("(+%-4d) [%2d] %s", Long.valueOf(c0998a.f3202c - j2), Long.valueOf(c0998a.f3201b), c0998a.f3200a);
                    j2 = c0998a.f3202c;
                }
            }
        }

        public final synchronized void m2453a(String str, long j) {
            if (this.f3205c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f3204b.add(new C0998a(str, j, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() {
            if (!this.f3205c) {
                m2452a("Request on the loose");
                C1000v.m2457c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void m2454a(String str, Object... objArr) {
        if (f3207b) {
            Log.v(f3206a, C1000v.m2459e(str, objArr));
        }
    }

    public static void m2455a(Throwable th, String str, Object... objArr) {
        Log.e(f3206a, C1000v.m2459e(str, objArr), th);
    }

    public static void m2456b(String str, Object... objArr) {
        Log.d(f3206a, C1000v.m2459e(str, objArr));
    }

    public static void m2457c(String str, Object... objArr) {
        Log.e(f3206a, C1000v.m2459e(str, objArr));
    }

    public static void m2458d(String str, Object... objArr) {
        Log.wtf(f3206a, C1000v.m2459e(str, objArr));
    }

    private static String m2459e(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(C1000v.class)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                stringBuilder.append(stackTrace[i].getMethodName());
                str2 = stringBuilder.toString();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
