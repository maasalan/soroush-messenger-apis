package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ac;
import java.util.Map;

public final class zzbfl<I, O> extends zzbej {
    public static final ds CREATOR = new ds();
    protected final int f18483a;
    protected final boolean f18484b;
    protected final int f18485c;
    protected final boolean f18486d;
    protected final String f18487e;
    protected final int f18488f;
    protected final Class<? extends dq> f18489g;
    zzbfq f18490h;
    dr<I, O> f18491i;
    private final int f18492j;
    private String f18493k;

    zzbfl(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zzbfe com_google_android_gms_internal_zzbfe) {
        this.f18492j = i;
        this.f18483a = i2;
        this.f18484b = z;
        this.f18485c = i3;
        this.f18486d = z2;
        this.f18487e = str;
        this.f18488f = i4;
        if (str2 == null) {
            this.f18489g = null;
            this.f18493k = null;
        } else {
            this.f18489g = zzbfv.class;
            this.f18493k = str2;
        }
        if (com_google_android_gms_internal_zzbfe == null) {
            this.f18491i = null;
        } else if (com_google_android_gms_internal_zzbfe.f18474a != null) {
            this.f18491i = com_google_android_gms_internal_zzbfe.f18474a;
        } else {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    private String m16823b() {
        return this.f18493k == null ? null : this.f18493k;
    }

    public final Map<String, zzbfl<?, ?>> m16824a() {
        ac.m4376a(this.f18493k);
        ac.m4376a(this.f18490h);
        return this.f18490h.m16826a(this.f18493k);
    }

    public final String toString() {
        ab a = aa.m4373a(this).m4375a("versionCode", Integer.valueOf(this.f18492j)).m4375a("typeIn", Integer.valueOf(this.f18483a)).m4375a("typeInArray", Boolean.valueOf(this.f18484b)).m4375a("typeOut", Integer.valueOf(this.f18485c)).m4375a("typeOutArray", Boolean.valueOf(this.f18486d)).m4375a("outputFieldName", this.f18487e).m4375a("safeParcelFieldId", Integer.valueOf(this.f18488f)).m4375a("concreteTypeName", m16823b());
        Class cls = this.f18489g;
        if (cls != null) {
            a.m4375a("concreteType.class", cls.getCanonicalName());
        }
        if (this.f18491i != null) {
            a.m4375a("converterName", this.f18491i.getClass().getCanonicalName());
        }
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18492j);
        dm.m4743b(parcel, 2, this.f18483a);
        dm.m4735a(parcel, 3, this.f18484b);
        dm.m4743b(parcel, 4, this.f18485c);
        dm.m4735a(parcel, 5, this.f18486d);
        dm.m4733a(parcel, 6, this.f18487e);
        dm.m4743b(parcel, 7, this.f18488f);
        dm.m4733a(parcel, 8, m16823b());
        dm.m4731a(parcel, 9, this.f18491i == null ? null : zzbfe.m16819a(this.f18491i), i);
        dm.m4742b(parcel, a);
    }
}
