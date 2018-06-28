package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.util.List;
import java.util.Map;

final class fz implements Runnable {
    private final fy f5797a;
    private final int f5798b;
    private final Throwable f5799c;
    private final byte[] f5800d;
    private final String f5801e;
    private final Map<String, List<String>> f5802f;

    private fz(String str, fy fyVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        ac.m4376a((Object) fyVar);
        this.f5797a = fyVar;
        this.f5798b = i;
        this.f5799c = th;
        this.f5800d = bArr;
        this.f5801e = str;
        this.f5802f = map;
    }

    public final void run() {
        this.f5797a.mo1647a(this.f5801e, this.f5798b, this.f5799c, this.f5800d, this.f5802f);
    }
}
