package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.C1650a.C1646c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public final class CameraPosition extends zzbej implements ReflectedParcelable {
    public static final Creator<CameraPosition> CREATOR = new C1879g();
    public final LatLng f18705a;
    public final float f18706b;
    public final float f18707c;
    public final float f18708d;

    public static final class C1867a {
        LatLng f6314a;
        float f6315b;
        float f6316c;
        float f6317d;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        ac.m4377a((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        ac.m4383a(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f18705a = latLng;
        this.f18706b = f;
        this.f18707c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f18708d = f3 % 360.0f;
    }

    public static CameraPosition m16880a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1646c.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(C1646c.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C1646c.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(C1646c.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C1646c.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        C1867a c1867a = new C1867a();
        c1867a.f6314a = latLng;
        if (obtainAttributes.hasValue(C1646c.MapAttrs_cameraZoom)) {
            c1867a.f6315b = obtainAttributes.getFloat(C1646c.MapAttrs_cameraZoom, 0.0f);
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_cameraBearing)) {
            c1867a.f6317d = obtainAttributes.getFloat(C1646c.MapAttrs_cameraBearing, 0.0f);
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_cameraTilt)) {
            c1867a.f6316c = obtainAttributes.getFloat(C1646c.MapAttrs_cameraTilt, 0.0f);
        }
        return new CameraPosition(c1867a.f6314a, c1867a.f6315b, c1867a.f6316c, c1867a.f6317d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f18705a.equals(cameraPosition.f18705a) && Float.floatToIntBits(this.f18706b) == Float.floatToIntBits(cameraPosition.f18706b) && Float.floatToIntBits(this.f18707c) == Float.floatToIntBits(cameraPosition.f18707c) && Float.floatToIntBits(this.f18708d) == Float.floatToIntBits(cameraPosition.f18708d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18705a, Float.valueOf(this.f18706b), Float.valueOf(this.f18707c), Float.valueOf(this.f18708d)});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("target", this.f18705a).m4375a("zoom", Float.valueOf(this.f18706b)).m4375a("tilt", Float.valueOf(this.f18707c)).m4375a("bearing", Float.valueOf(this.f18708d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 2, this.f18705a, i);
        dm.m4726a(parcel, 3, this.f18706b);
        dm.m4726a(parcel, 4, this.f18707c);
        dm.m4726a(parcel, 5, this.f18708d);
        dm.m4742b(parcel, a);
    }
}
