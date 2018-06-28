package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ac;

public final class C1829z {
    final Context f6299a;
    final Context f6300b;

    public C1829z(Context context) {
        ac.m4376a((Object) context);
        Object applicationContext = context.getApplicationContext();
        ac.m4377a(applicationContext, (Object) "Application context can't be null");
        this.f6299a = applicationContext;
        this.f6300b = applicationContext;
    }
}
