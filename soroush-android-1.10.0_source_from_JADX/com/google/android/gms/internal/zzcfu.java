package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;

public final class zzcfu extends zzbej implements Iterable<String> {
    public static final Creator<zzcfu> CREATOR = new fh();
    final Bundle f18544a;

    zzcfu(Bundle bundle) {
        this.f18544a = bundle;
    }

    public final Bundle m16838a() {
        return new Bundle(this.f18544a);
    }

    final Object m16839a(String str) {
        return this.f18544a.get(str);
    }

    final Long m16840b(String str) {
        return Long.valueOf(this.f18544a.getLong(str));
    }

    public final Iterator<String> iterator() {
        return new fg(this);
    }

    public final String toString() {
        return this.f18544a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4729a(parcel, 2, m16838a());
        dm.m4742b(parcel, i);
    }
}
