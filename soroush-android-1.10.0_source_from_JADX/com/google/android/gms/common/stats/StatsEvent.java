package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbej;

public abstract class StatsEvent extends zzbej implements ReflectedParcelable {
    public abstract long mo3407a();

    public abstract int mo3408b();

    public abstract long mo3409c();

    public abstract String mo3410d();

    public String toString() {
        long a = mo3407a();
        String str = "\t";
        int b = mo3408b();
        String str2 = "\t";
        long c = mo3409c();
        String d = mo3410d();
        StringBuilder stringBuilder = new StringBuilder(((51 + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(d).length());
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(b);
        stringBuilder.append(str2);
        stringBuilder.append(c);
        stringBuilder.append(d);
        return stringBuilder.toString();
    }
}
