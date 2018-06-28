package com.google.android.gms.internal;

public abstract class ea<T> {
    final int f5670a;
    final String f5671b;
    final T f5672c;

    private ea(String str, T t) {
        this.f5670a = 0;
        this.f5671b = str;
        this.f5672c = t;
        ek.m4768a().f5673a.add(this);
    }

    public static ec m4764a(String str, int i) {
        return new ec(str, Integer.valueOf(i));
    }

    public static ed m4765a(String str, long j) {
        return new ed(str, Long.valueOf(j));
    }

    protected abstract T mo1598a(eh ehVar);
}
