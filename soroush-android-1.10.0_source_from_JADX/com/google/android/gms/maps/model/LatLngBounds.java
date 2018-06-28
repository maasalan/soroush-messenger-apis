package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public final class LatLngBounds extends zzbej implements ReflectedParcelable {
    public static final Creator<LatLngBounds> CREATOR = new C1883k();
    public final LatLng f18736a;
    public final LatLng f18737b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        ac.m4377a((Object) latLng, (Object) "null southwest");
        ac.m4377a((Object) latLng2, (Object) "null northeast");
        ac.m4383a(latLng2.f18734a >= latLng.f18734a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f18734a), Double.valueOf(latLng2.f18734a));
        this.f18736a = latLng;
        this.f18737b = latLng2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.model.LatLngBounds m16882a(android.content.Context r6, android.util.AttributeSet r7) {
        /*
        r0 = 0;
        if (r6 == 0) goto L_0x008e;
    L_0x0003:
        if (r7 != 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r6 = r6.getResources();
        r1 = com.google.android.gms.C1650a.C1646c.MapAttrs;
        r6 = r6.obtainAttributes(r7, r1);
        r7 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsSouthWestLatitude;
        r7 = r6.hasValue(r7);
        r1 = 0;
        if (r7 == 0) goto L_0x0024;
    L_0x0019:
        r7 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsSouthWestLatitude;
        r7 = r6.getFloat(r7, r1);
        r7 = java.lang.Float.valueOf(r7);
        goto L_0x0025;
    L_0x0024:
        r7 = r0;
    L_0x0025:
        r2 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsSouthWestLongitude;
        r2 = r6.hasValue(r2);
        if (r2 == 0) goto L_0x0038;
    L_0x002d:
        r2 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsSouthWestLongitude;
        r2 = r6.getFloat(r2, r1);
        r2 = java.lang.Float.valueOf(r2);
        goto L_0x0039;
    L_0x0038:
        r2 = r0;
    L_0x0039:
        r3 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsNorthEastLatitude;
        r3 = r6.hasValue(r3);
        if (r3 == 0) goto L_0x004c;
    L_0x0041:
        r3 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsNorthEastLatitude;
        r3 = r6.getFloat(r3, r1);
        r3 = java.lang.Float.valueOf(r3);
        goto L_0x004d;
    L_0x004c:
        r3 = r0;
    L_0x004d:
        r4 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsNorthEastLongitude;
        r4 = r6.hasValue(r4);
        if (r4 == 0) goto L_0x0060;
    L_0x0055:
        r4 = com.google.android.gms.C1650a.C1646c.MapAttrs_latLngBoundsNorthEastLongitude;
        r6 = r6.getFloat(r4, r1);
        r6 = java.lang.Float.valueOf(r6);
        goto L_0x0061;
    L_0x0060:
        r6 = r0;
    L_0x0061:
        if (r7 == 0) goto L_0x008e;
    L_0x0063:
        if (r2 == 0) goto L_0x008e;
    L_0x0065:
        if (r3 == 0) goto L_0x008e;
    L_0x0067:
        if (r6 != 0) goto L_0x006a;
    L_0x0069:
        return r0;
    L_0x006a:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r7 = r7.floatValue();
        r4 = (double) r7;
        r7 = r2.floatValue();
        r1 = (double) r7;
        r0.<init>(r4, r1);
        r7 = new com.google.android.gms.maps.model.LatLng;
        r1 = r3.floatValue();
        r1 = (double) r1;
        r6 = r6.floatValue();
        r3 = (double) r6;
        r7.<init>(r1, r3);
        r6 = new com.google.android.gms.maps.model.LatLngBounds;
        r6.<init>(r0, r7);
        return r6;
    L_0x008e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.LatLngBounds.a(android.content.Context, android.util.AttributeSet):com.google.android.gms.maps.model.LatLngBounds");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f18736a.equals(latLngBounds.f18736a) && this.f18737b.equals(latLngBounds.f18737b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18736a, this.f18737b});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("southwest", this.f18736a).m4375a("northeast", this.f18737b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18736a, i);
        dm.m4731a(parcel, 3, this.f18737b, i);
        dm.m4742b(parcel, a);
    }
}
