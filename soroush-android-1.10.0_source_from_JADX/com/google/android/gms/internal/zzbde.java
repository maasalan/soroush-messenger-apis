package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import java.util.Arrays;

public final class zzbde extends zzbej {
    public static final Creator<zzbde> CREATOR = new co();
    public zzbdt f18454a;
    public byte[] f18455b;
    public final op f18456c;
    public final ck f18457d;
    public final ck f18458e;
    private int[] f18459f;
    private String[] f18460g;
    private int[] f18461h;
    private byte[][] f18462i;
    private zzcsv[] f18463j;
    private boolean f18464k;

    public zzbde(zzbdt com_google_android_gms_internal_zzbdt, op opVar, int[] iArr, int[] iArr2, boolean z) {
        this.f18454a = com_google_android_gms_internal_zzbdt;
        this.f18456c = opVar;
        this.f18457d = null;
        this.f18458e = null;
        this.f18459f = iArr;
        this.f18460g = null;
        this.f18461h = iArr2;
        this.f18462i = null;
        this.f18463j = null;
        this.f18464k = z;
    }

    zzbde(zzbdt com_google_android_gms_internal_zzbdt, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, zzcsv[] com_google_android_gms_internal_zzcsvArr) {
        this.f18454a = com_google_android_gms_internal_zzbdt;
        this.f18455b = bArr;
        this.f18459f = iArr;
        this.f18460g = strArr;
        this.f18456c = null;
        this.f18457d = null;
        this.f18458e = null;
        this.f18461h = iArr2;
        this.f18462i = bArr2;
        this.f18463j = com_google_android_gms_internal_zzcsvArr;
        this.f18464k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbde) {
            zzbde com_google_android_gms_internal_zzbde = (zzbde) obj;
            return aa.m4374a(this.f18454a, com_google_android_gms_internal_zzbde.f18454a) && Arrays.equals(this.f18455b, com_google_android_gms_internal_zzbde.f18455b) && Arrays.equals(this.f18459f, com_google_android_gms_internal_zzbde.f18459f) && Arrays.equals(this.f18460g, com_google_android_gms_internal_zzbde.f18460g) && aa.m4374a(this.f18456c, com_google_android_gms_internal_zzbde.f18456c) && aa.m4374a(this.f18457d, com_google_android_gms_internal_zzbde.f18457d) && aa.m4374a(this.f18458e, com_google_android_gms_internal_zzbde.f18458e) && Arrays.equals(this.f18461h, com_google_android_gms_internal_zzbde.f18461h) && Arrays.deepEquals(this.f18462i, com_google_android_gms_internal_zzbde.f18462i) && Arrays.equals(this.f18463j, com_google_android_gms_internal_zzbde.f18463j) && this.f18464k == com_google_android_gms_internal_zzbde.f18464k;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18454a, this.f18455b, this.f18459f, this.f18460g, this.f18456c, this.f18457d, this.f18458e, this.f18461h, this.f18462i, this.f18463j, Boolean.valueOf(this.f18464k)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.f18454a);
        stringBuilder.append(", LogEventBytes: ");
        stringBuilder.append(this.f18455b == null ? null : new String(this.f18455b));
        stringBuilder.append(", TestCodes: ");
        stringBuilder.append(Arrays.toString(this.f18459f));
        stringBuilder.append(", MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.f18460g));
        stringBuilder.append(", LogEvent: ");
        stringBuilder.append(this.f18456c);
        stringBuilder.append(", ExtensionProducer: ");
        stringBuilder.append(this.f18457d);
        stringBuilder.append(", VeProducer: ");
        stringBuilder.append(this.f18458e);
        stringBuilder.append(", ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.f18461h));
        stringBuilder.append(", ExperimentTokens: ");
        stringBuilder.append(Arrays.toString(this.f18462i));
        stringBuilder.append(", ExperimentTokensParcelables: ");
        stringBuilder.append(Arrays.toString(this.f18463j));
        stringBuilder.append(", AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.f18464k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18454a, i);
        dm.m4736a(parcel, 3, this.f18455b);
        dm.m4737a(parcel, 4, this.f18459f);
        dm.m4739a(parcel, 5, this.f18460g);
        dm.m4737a(parcel, 6, this.f18461h);
        dm.m4740a(parcel, 7, this.f18462i);
        dm.m4735a(parcel, 8, this.f18464k);
        dm.m4738a(parcel, 9, this.f18463j, i);
        dm.m4742b(parcel, a);
    }
}
