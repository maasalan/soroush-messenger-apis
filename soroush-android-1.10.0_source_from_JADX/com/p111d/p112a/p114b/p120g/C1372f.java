package com.p111d.p112a.p114b.p120g;

import java.util.concurrent.ConcurrentHashMap;

public final class C1372f extends ConcurrentHashMap<String, String> {
    public static final C1372f f4330a = new C1372f();
    private final Object f4331b = new Object();

    private C1372f() {
        super(180, 0.8f, 4);
    }

    public final String m3329a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f4331b) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        str = str.intern();
        put(str, str);
        return str;
    }
}
