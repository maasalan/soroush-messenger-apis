package com.google.android.gms.internal;

import android.content.Context;

public final class dz {
    private static dz f5668b = new dz();
    private dy f5669a = null;

    public static dy m4762a(Context context) {
        return f5668b.m4763b(context);
    }

    private final synchronized dy m4763b(Context context) {
        if (this.f5669a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f5669a = new dy(context);
        }
        return this.f5669a;
    }
}
