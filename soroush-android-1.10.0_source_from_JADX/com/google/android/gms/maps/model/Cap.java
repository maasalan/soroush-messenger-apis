package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.p158a.C1644a.C5425a;
import java.util.Arrays;

public class Cap extends zzbej {
    public static final Creator<Cap> CREATOR = new C1880h();
    private static final String f18709a = "Cap";
    private final int f18710b;
    private final C1873a f18711c;
    private final Float f18712d;

    protected Cap(int i) {
        this(i, null, null);
    }

    Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new C1873a(C5425a.m11702a(iBinder)), f);
    }

    private Cap(int i, C1873a c1873a, Float f) {
        boolean z;
        int i2 = (f == null || f.floatValue() <= 0.0f) ? 0 : 1;
        if (i == 3) {
            if (c1873a == null || i2 == 0) {
                z = false;
                ac.m4386b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), c1873a, f}));
                this.f18710b = i;
                this.f18711c = c1873a;
                this.f18712d = f;
            }
        }
        z = true;
        ac.m4386b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), c1873a, f}));
        this.f18710b = i;
        this.f18711c = c1873a;
        this.f18712d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f18710b == cap.f18710b && aa.m4374a(this.f18711c, cap.f18711c) && aa.m4374a(this.f18712d, cap.f18712d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18710b), this.f18711c, this.f18712d});
    }

    public String toString() {
        int i = this.f18710b;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("[Cap: type=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 2, this.f18710b);
        dm.m4730a(parcel, 3, this.f18711c == null ? null : this.f18711c.f6320a.asBinder());
        dm.m4732a(parcel, 4, this.f18712d);
        dm.m4742b(parcel, i);
    }
}
