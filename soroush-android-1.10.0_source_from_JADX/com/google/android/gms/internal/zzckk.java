package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ac;

public final class zzckk extends zzbej {
    public static final Creator<zzckk> CREATOR = new js();
    public final String f18549a;
    public final long f18550b;
    public final String f18551c;
    private int f18552d;
    private Long f18553e;
    private Float f18554f;
    private String f18555g;
    private Double f18556h;

    zzckk(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f18552d = i;
        this.f18549a = str;
        this.f18550b = j;
        this.f18553e = l;
        Double d2 = null;
        this.f18554f = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.f18556h = d2;
        } else {
            this.f18556h = d;
        }
        this.f18555g = str2;
        this.f18551c = str3;
    }

    zzckk(jt jtVar) {
        this(jtVar.f6070c, jtVar.f6071d, jtVar.f6072e, jtVar.f6069b);
    }

    zzckk(String str, long j, Object obj, String str2) {
        ac.m4378a(str);
        this.f18552d = 2;
        this.f18549a = str;
        this.f18550b = j;
        this.f18551c = str2;
        if (obj == null) {
            this.f18553e = null;
            this.f18554f = null;
            this.f18556h = null;
            this.f18555g = null;
        } else if (obj instanceof Long) {
            this.f18553e = (Long) obj;
            this.f18554f = null;
            this.f18556h = null;
            this.f18555g = null;
        } else if (obj instanceof String) {
            this.f18553e = null;
            this.f18554f = null;
            this.f18556h = null;
            this.f18555g = (String) obj;
        } else if (obj instanceof Double) {
            this.f18553e = null;
            this.f18554f = null;
            this.f18556h = (Double) obj;
            this.f18555g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object m16841a() {
        return this.f18553e != null ? this.f18553e : this.f18556h != null ? this.f18556h : this.f18555g != null ? this.f18555g : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18552d);
        dm.m4733a(parcel, 2, this.f18549a);
        dm.m4728a(parcel, 3, this.f18550b);
        Long l = this.f18553e;
        if (l != null) {
            dm.m4727a(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        dm.m4732a(parcel, 5, null);
        dm.m4733a(parcel, 6, this.f18555g);
        dm.m4733a(parcel, 7, this.f18551c);
        Double d = this.f18556h;
        if (d != null) {
            dm.m4727a(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        dm.m4742b(parcel, i);
    }
}
