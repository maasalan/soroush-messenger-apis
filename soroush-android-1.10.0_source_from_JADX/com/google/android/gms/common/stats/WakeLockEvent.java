package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.internal.dm;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C1778d();
    private int f20374a;
    private final long f20375b;
    private int f20376c;
    private final String f20377d;
    private final String f20378e;
    private final String f20379f;
    private final int f20380g;
    private final List<String> f20381h;
    private final String f20382i;
    private final long f20383j;
    private int f20384k;
    private final String f20385l;
    private final float f20386m;
    private final long f20387n;
    private long f20388o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f20374a = i;
        this.f20375b = j;
        this.f20376c = i2;
        this.f20377d = str;
        this.f20378e = str3;
        this.f20379f = str5;
        this.f20380g = i3;
        this.f20388o = -1;
        this.f20381h = list;
        this.f20382i = str2;
        this.f20383j = j2;
        this.f20384k = i4;
        this.f20385l = str4;
        this.f20386m = f;
        this.f20387n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, null);
    }

    public final long mo3407a() {
        return this.f20375b;
    }

    public final int mo3408b() {
        return this.f20376c;
    }

    public final long mo3409c() {
        return this.f20388o;
    }

    public final String mo3410d() {
        String str = "\t";
        String str2 = this.f20377d;
        String str3 = "\t";
        int i = this.f20380g;
        String str4 = "\t";
        String join = this.f20381h == null ? "" : TextUtils.join(",", r0.f20381h);
        String str5 = "\t";
        int i2 = r0.f20384k;
        String str6 = "\t";
        String str7 = r0.f20378e == null ? "" : r0.f20378e;
        String str8 = "\t";
        String str9 = r0.f20385l == null ? "" : r0.f20385l;
        String str10 = "\t";
        String str11 = "\t";
        float f = r0.f20386m;
        String str12 = r0.f20379f == null ? "" : r0.f20379f;
        String str13 = str12;
        StringBuilder stringBuilder = new StringBuilder(((((((((((((37 + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(join).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()) + String.valueOf(str8).length()) + String.valueOf(str9).length()) + String.valueOf(str10).length()) + String.valueOf(str11).length()) + String.valueOf(str12).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        stringBuilder.append(i);
        stringBuilder.append(str4);
        stringBuilder.append(join);
        stringBuilder.append(str5);
        stringBuilder.append(i2);
        stringBuilder.append(str6);
        stringBuilder.append(str7);
        stringBuilder.append(str8);
        stringBuilder.append(str9);
        stringBuilder.append(str10);
        stringBuilder.append(f);
        stringBuilder.append(str11);
        stringBuilder.append(str13);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f20374a);
        dm.m4728a(parcel, 2, mo3407a());
        dm.m4733a(parcel, 4, this.f20377d);
        dm.m4743b(parcel, 5, this.f20380g);
        dm.m4744b(parcel, 6, this.f20381h);
        dm.m4728a(parcel, 8, this.f20383j);
        dm.m4733a(parcel, 10, this.f20378e);
        dm.m4743b(parcel, 11, mo3408b());
        dm.m4733a(parcel, 12, this.f20382i);
        dm.m4733a(parcel, 13, this.f20385l);
        dm.m4743b(parcel, 14, this.f20384k);
        dm.m4726a(parcel, 15, this.f20386m);
        dm.m4728a(parcel, 16, this.f20387n);
        dm.m4733a(parcel, 17, this.f20379f);
        dm.m4742b(parcel, i);
    }
}
