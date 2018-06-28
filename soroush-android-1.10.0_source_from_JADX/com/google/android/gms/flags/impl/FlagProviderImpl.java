package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ei;

@DynamiteApi
public class FlagProviderImpl extends ei {
    private boolean f18065a = false;
    private SharedPreferences f18066b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.f18065a ? z : C5487b.m11843a(this.f18066b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return !this.f18065a ? i : C5488d.m11844a(this.f18066b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return !this.f18065a ? j : C5489f.m11845a(this.f18066b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return !this.f18065a ? str2 : C5490h.m11846a(this.f18066b, str, str2);
    }

    public void init(com.google.android.gms.p158a.C1644a r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r4 = com.google.android.gms.p158a.C6566m.m15849a(r4);
        r4 = (android.content.Context) r4;
        r0 = r3.f18065a;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r4 = r4.createPackageContext(r0, r1);	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r4 = com.google.android.gms.flags.impl.C1813j.m4573a(r4);	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r3.f18066b = r4;	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r4 = 1;	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        r3.f18065a = r4;	 Catch:{ NameNotFoundException -> 0x003c, Exception -> 0x001c }
        return;
    L_0x001c:
        r4 = move-exception;
        r0 = "FlagProviderImpl";
        r1 = "Could not retrieve sdk flags, continuing with defaults: ";
        r4 = r4.getMessage();
        r4 = java.lang.String.valueOf(r4);
        r2 = r4.length();
        if (r2 == 0) goto L_0x0034;
    L_0x002f:
        r4 = r1.concat(r4);
        goto L_0x0039;
    L_0x0034:
        r4 = new java.lang.String;
        r4.<init>(r1);
    L_0x0039:
        android.util.Log.w(r0, r4);
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.flags.impl.FlagProviderImpl.init(com.google.android.gms.a.a):void");
    }
}
