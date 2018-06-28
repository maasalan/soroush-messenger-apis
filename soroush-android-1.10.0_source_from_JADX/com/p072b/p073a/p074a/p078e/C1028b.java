package com.p072b.p073a.p074a.p078e;

import android.util.Log;

public final class C1028b {
    private static C1027a f3317a = new C50721();

    static class C50721 implements C1027a {
        C50721() {
        }

        public final void mo1076a(String str, Object... objArr) {
        }

        public final void mo1077a(Throwable th, String str, Object... objArr) {
        }

        public final boolean mo1078a() {
            return false;
        }
    }

    public static class C5073a implements C1027a {
        public final void mo1076a(String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr));
        }

        public final void mo1077a(Throwable th, String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr), th);
        }

        public final boolean mo1078a() {
            return false;
        }
    }

    public static void m2503a(C1027a c1027a) {
        f3317a = c1027a;
    }

    public static void m2504a(String str, Object... objArr) {
        f3317a.mo1076a(str, objArr);
    }

    public static void m2505a(Throwable th, String str, Object... objArr) {
        f3317a.mo1077a(th, str, objArr);
    }

    public static boolean m2506a() {
        return f3317a.mo1078a();
    }

    public static void m2507b() {
    }

    public static void m2508c() {
    }
}
