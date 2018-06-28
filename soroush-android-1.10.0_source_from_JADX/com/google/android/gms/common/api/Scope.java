package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public final class Scope extends zzbej implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C1739l();
    public final String f17973a;
    private int f17974b;

    Scope(int i, String str) {
        ac.m4379a(str, (Object) "scopeUri must not be null or empty");
        this.f17974b = i;
        this.f17973a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f17973a.equals(((Scope) obj).f17973a);
    }

    public final int hashCode() {
        return this.f17973a.hashCode();
    }

    public final String toString() {
        return this.f17973a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f17974b);
        dm.m4733a(parcel, 2, this.f17973a);
        dm.m4742b(parcel, i);
    }
}
