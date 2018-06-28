package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import java.util.Arrays;

public final class zzbdt extends zzbej {
    public static final Creator<zzbdt> CREATOR = new db();
    public final int f18465a;
    public final String f18466b;
    private String f18467c;
    private int f18468d;
    private String f18469e;
    private String f18470f;
    private boolean f18471g;
    private boolean f18472h;
    private int f18473i;

    public zzbdt(String str, int i, int i2, String str2, String str3, String str4, boolean z) {
        this.f18467c = (String) ac.m4376a((Object) str);
        this.f18468d = i;
        this.f18465a = i2;
        this.f18466b = str2;
        this.f18469e = str3;
        this.f18470f = str4;
        this.f18471g = z ^ 1;
        this.f18472h = z;
        this.f18473i = 0;
    }

    public zzbdt(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f18467c = str;
        this.f18468d = i;
        this.f18465a = i2;
        this.f18469e = str2;
        this.f18470f = str3;
        this.f18471g = z;
        this.f18466b = str4;
        this.f18472h = z2;
        this.f18473i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbdt) {
            zzbdt com_google_android_gms_internal_zzbdt = (zzbdt) obj;
            return aa.m4374a(this.f18467c, com_google_android_gms_internal_zzbdt.f18467c) && this.f18468d == com_google_android_gms_internal_zzbdt.f18468d && this.f18465a == com_google_android_gms_internal_zzbdt.f18465a && aa.m4374a(this.f18466b, com_google_android_gms_internal_zzbdt.f18466b) && aa.m4374a(this.f18469e, com_google_android_gms_internal_zzbdt.f18469e) && aa.m4374a(this.f18470f, com_google_android_gms_internal_zzbdt.f18470f) && this.f18471g == com_google_android_gms_internal_zzbdt.f18471g && this.f18472h == com_google_android_gms_internal_zzbdt.f18472h && this.f18473i == com_google_android_gms_internal_zzbdt.f18473i;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18467c, Integer.valueOf(this.f18468d), Integer.valueOf(this.f18465a), this.f18466b, this.f18469e, this.f18470f, Boolean.valueOf(this.f18471g), Boolean.valueOf(this.f18472h), Integer.valueOf(this.f18473i)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("package=");
        stringBuilder.append(this.f18467c);
        stringBuilder.append(',');
        stringBuilder.append("packageVersionCode=");
        stringBuilder.append(this.f18468d);
        stringBuilder.append(',');
        stringBuilder.append("logSource=");
        stringBuilder.append(this.f18465a);
        stringBuilder.append(',');
        stringBuilder.append("logSourceName=");
        stringBuilder.append(this.f18466b);
        stringBuilder.append(',');
        stringBuilder.append("uploadAccount=");
        stringBuilder.append(this.f18469e);
        stringBuilder.append(',');
        stringBuilder.append("loggingId=");
        stringBuilder.append(this.f18470f);
        stringBuilder.append(',');
        stringBuilder.append("logAndroidId=");
        stringBuilder.append(this.f18471g);
        stringBuilder.append(',');
        stringBuilder.append("isAnonymous=");
        stringBuilder.append(this.f18472h);
        stringBuilder.append(',');
        stringBuilder.append("qosTier=");
        stringBuilder.append(this.f18473i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18467c);
        dm.m4743b(parcel, 3, this.f18468d);
        dm.m4743b(parcel, 4, this.f18465a);
        dm.m4733a(parcel, 5, this.f18469e);
        dm.m4733a(parcel, 6, this.f18470f);
        dm.m4735a(parcel, 7, this.f18471g);
        dm.m4733a(parcel, 8, this.f18466b);
        dm.m4735a(parcel, 9, this.f18472h);
        dm.m4743b(parcel, 10, this.f18473i);
        dm.m4742b(parcel, i);
    }
}
