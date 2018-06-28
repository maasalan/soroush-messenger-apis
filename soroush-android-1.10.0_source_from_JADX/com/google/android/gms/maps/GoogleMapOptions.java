package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.C1650a.C1646c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p162a.C1853e;

public final class GoogleMapOptions extends zzbej implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new C1865f();
    private Boolean f18675a;
    private Boolean f18676b;
    private int f18677c = -1;
    private CameraPosition f18678d;
    private Boolean f18679e;
    private Boolean f18680f;
    private Boolean f18681g;
    private Boolean f18682h;
    private Boolean f18683i;
    private Boolean f18684j;
    private Boolean f18685k;
    private Boolean f18686l;
    private Boolean f18687m;
    private Float f18688n = null;
    private Float f18689o = null;
    private LatLngBounds f18690p = null;

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f18675a = C1853e.m5192a(b);
        this.f18676b = C1853e.m5192a(b2);
        this.f18677c = i;
        this.f18678d = cameraPosition;
        this.f18679e = C1853e.m5192a(b3);
        this.f18680f = C1853e.m5192a(b4);
        this.f18681g = C1853e.m5192a(b5);
        this.f18682h = C1853e.m5192a(b6);
        this.f18683i = C1853e.m5192a(b7);
        this.f18684j = C1853e.m5192a(b8);
        this.f18685k = C1853e.m5192a(b9);
        this.f18686l = C1853e.m5192a(b10);
        this.f18687m = C1853e.m5192a(b11);
        this.f18688n = f;
        this.f18689o = f2;
        this.f18690p = latLngBounds;
    }

    public static GoogleMapOptions m16852a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1646c.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C1646c.MapAttrs_mapType)) {
            googleMapOptions.f18677c = obtainAttributes.getInt(C1646c.MapAttrs_mapType, -1);
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_zOrderOnTop)) {
            googleMapOptions.f18675a = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_useViewLifecycle)) {
            googleMapOptions.f18676b = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiCompass)) {
            googleMapOptions.f18680f = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiRotateGestures)) {
            googleMapOptions.f18684j = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiScrollGestures)) {
            googleMapOptions.f18681g = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiTiltGestures)) {
            googleMapOptions.f18683i = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiZoomGestures)) {
            googleMapOptions.f18682h = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiZoomControls)) {
            googleMapOptions.f18679e = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_liteMode)) {
            googleMapOptions.f18685k = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_uiMapToolbar)) {
            googleMapOptions.f18686l = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_ambientEnabled)) {
            googleMapOptions.f18687m = Boolean.valueOf(obtainAttributes.getBoolean(C1646c.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.f18688n = Float.valueOf(obtainAttributes.getFloat(C1646c.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C1646c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.f18689o = Float.valueOf(obtainAttributes.getFloat(C1646c.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.f18690p = LatLngBounds.m16882a(context, attributeSet);
        googleMapOptions.f18678d = CameraPosition.m16880a(context, attributeSet);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("MapType", Integer.valueOf(this.f18677c)).m4375a("LiteMode", this.f18685k).m4375a("Camera", this.f18678d).m4375a("CompassEnabled", this.f18680f).m4375a("ZoomControlsEnabled", this.f18679e).m4375a("ScrollGesturesEnabled", this.f18681g).m4375a("ZoomGesturesEnabled", this.f18682h).m4375a("TiltGesturesEnabled", this.f18683i).m4375a("RotateGesturesEnabled", this.f18684j).m4375a("MapToolbarEnabled", this.f18686l).m4375a("AmbientEnabled", this.f18687m).m4375a("MinZoomPreference", this.f18688n).m4375a("MaxZoomPreference", this.f18689o).m4375a("LatLngBoundsForCameraTarget", this.f18690p).m4375a("ZOrderOnTop", this.f18675a).m4375a("UseViewLifecycleInFragment", this.f18676b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4724a(parcel, 2, C1853e.m5191a(this.f18675a));
        dm.m4724a(parcel, 3, C1853e.m5191a(this.f18676b));
        dm.m4743b(parcel, 4, this.f18677c);
        dm.m4731a(parcel, 5, this.f18678d, i);
        dm.m4724a(parcel, 6, C1853e.m5191a(this.f18679e));
        dm.m4724a(parcel, 7, C1853e.m5191a(this.f18680f));
        dm.m4724a(parcel, 8, C1853e.m5191a(this.f18681g));
        dm.m4724a(parcel, 9, C1853e.m5191a(this.f18682h));
        dm.m4724a(parcel, 10, C1853e.m5191a(this.f18683i));
        dm.m4724a(parcel, 11, C1853e.m5191a(this.f18684j));
        dm.m4724a(parcel, 12, C1853e.m5191a(this.f18685k));
        dm.m4724a(parcel, 14, C1853e.m5191a(this.f18686l));
        dm.m4724a(parcel, 15, C1853e.m5191a(this.f18687m));
        dm.m4732a(parcel, 16, this.f18688n);
        dm.m4732a(parcel, 17, this.f18689o);
        dm.m4731a(parcel, 18, this.f18690p, i);
        dm.m4742b(parcel, a);
    }
}
