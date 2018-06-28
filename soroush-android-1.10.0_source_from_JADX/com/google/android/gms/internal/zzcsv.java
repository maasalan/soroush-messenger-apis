package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzcsv extends zzbej {
    public static final Creator<zzcsv> CREATOR = new kt();
    private static byte[][] f18557a = new byte[0][];
    private static zzcsv f18558b = new zzcsv("", null, f18557a, f18557a, f18557a, f18557a, null, null);
    private static final ks f18559k = new ko();
    private static final ks f18560l = new kp();
    private static final ks f18561m = new kq();
    private static final ks f18562n = new kr();
    private String f18563c;
    private byte[] f18564d;
    private byte[][] f18565e;
    private byte[][] f18566f;
    private byte[][] f18567g;
    private byte[][] f18568h;
    private int[] f18569i;
    private byte[][] f18570j;

    public zzcsv(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f18563c = str;
        this.f18564d = bArr;
        this.f18565e = bArr2;
        this.f18566f = bArr3;
        this.f18567g = bArr4;
        this.f18568h = bArr5;
        this.f18569i = iArr;
        this.f18570j = bArr6;
    }

    private static List<Integer> m16842a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List<Integer> arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> m16843a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List<String> arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void m16844a(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = iArr.length;
            Object obj = 1;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    private static void m16845a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = bArr.length;
            Object obj = 1;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(Base64.encodeToString(bArr2, 3));
                stringBuilder.append("'");
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcsv) {
            zzcsv com_google_android_gms_internal_zzcsv = (zzcsv) obj;
            if (kx.m4964a(this.f18563c, com_google_android_gms_internal_zzcsv.f18563c) && Arrays.equals(this.f18564d, com_google_android_gms_internal_zzcsv.f18564d) && kx.m4964a(m16843a(this.f18565e), m16843a(com_google_android_gms_internal_zzcsv.f18565e)) && kx.m4964a(m16843a(this.f18566f), m16843a(com_google_android_gms_internal_zzcsv.f18566f)) && kx.m4964a(m16843a(this.f18567g), m16843a(com_google_android_gms_internal_zzcsv.f18567g)) && kx.m4964a(m16843a(this.f18568h), m16843a(com_google_android_gms_internal_zzcsv.f18568h)) && kx.m4964a(m16842a(this.f18569i), m16842a(com_google_android_gms_internal_zzcsv.f18569i)) && kx.m4964a(m16843a(this.f18570j), m16843a(com_google_android_gms_internal_zzcsv.f18570j))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f18563c == null) {
            str = "null";
        } else {
            str = "'";
            String str2 = this.f18563c;
            String str3 = "'";
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length());
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            stringBuilder2.append(str3);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.f18564d;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            str = "'";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        m16845a(stringBuilder, "GAIA", this.f18565e);
        stringBuilder.append(", ");
        m16845a(stringBuilder, "PSEUDO", this.f18566f);
        stringBuilder.append(", ");
        m16845a(stringBuilder, "ALWAYS", this.f18567g);
        stringBuilder.append(", ");
        m16845a(stringBuilder, "OTHER", this.f18568h);
        stringBuilder.append(", ");
        m16844a(stringBuilder, "weak", this.f18569i);
        stringBuilder.append(", ");
        m16845a(stringBuilder, "directs", this.f18570j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 2, this.f18563c);
        dm.m4736a(parcel, 3, this.f18564d);
        dm.m4740a(parcel, 4, this.f18565e);
        dm.m4740a(parcel, 5, this.f18566f);
        dm.m4740a(parcel, 6, this.f18567g);
        dm.m4740a(parcel, 7, this.f18568h);
        dm.m4737a(parcel, 8, this.f18569i);
        dm.m4740a(parcel, 9, this.f18570j);
        dm.m4742b(parcel, i);
    }
}
