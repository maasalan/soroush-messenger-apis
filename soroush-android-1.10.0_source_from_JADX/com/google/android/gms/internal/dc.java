package com.google.android.gms.internal;

public class dc<T> {
    private static final Object f5658a = new Object();
    private static di f5659b = null;
    private static int f5660c = 0;
    private static String f5661d = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private String f5662e;
    private T f5663f;
    private T f5664g = null;

    protected dc(String str, T t) {
        this.f5662e = str;
        this.f5663f = t;
    }

    public static dc<Float> m4688a(String str, Float f) {
        return new dg(str, f);
    }

    public static dc<Integer> m4689a(String str, Integer num) {
        return new df(str, num);
    }

    public static dc<Long> m4690a(String str, Long l) {
        return new de(str, l);
    }

    public static dc<String> m4691a(String str, String str2) {
        return new dh(str, str2);
    }

    public static dc<Boolean> m4692a(String str, boolean z) {
        return new dd(str, Boolean.valueOf(z));
    }
}
