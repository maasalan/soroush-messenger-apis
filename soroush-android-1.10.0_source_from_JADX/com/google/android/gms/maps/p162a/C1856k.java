package com.google.android.gms.maps.p162a;

import android.os.Bundle;
import android.os.Parcelable;

public final class C1856k {
    private C1856k() {
    }

    private static <T extends Parcelable> T m5195a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(C1856k.class.getClassLoader());
        bundle = bundle.getBundle("map_state");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(C1856k.class.getClassLoader());
        return bundle.getParcelable(str);
    }

    public static void m5196a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = C1856k.m5195a(bundle, "MapOptions");
            if (a != null) {
                C1856k.m5197a(bundle2, "MapOptions", a);
            }
            a = C1856k.m5195a(bundle, "StreetViewPanoramaOptions");
            if (a != null) {
                C1856k.m5197a(bundle2, "StreetViewPanoramaOptions", a);
            }
            a = C1856k.m5195a(bundle, "camera");
            if (a != null) {
                C1856k.m5197a(bundle2, "camera", a);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void m5197a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C1856k.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C1856k.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
