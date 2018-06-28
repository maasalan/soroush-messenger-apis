package com.google.android.gms.internal;

public abstract class zzbfn extends dq implements zzben {
    public Object mo1671b() {
        return null;
    }

    public boolean mo1672c() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        dq dqVar = (dq) obj;
        for (zzbfl com_google_android_gms_internal_zzbfl : mo3042a().values()) {
            if (m4750a(com_google_android_gms_internal_zzbfl)) {
                if (!dqVar.m4750a(com_google_android_gms_internal_zzbfl) || !m4752b(com_google_android_gms_internal_zzbfl).equals(dqVar.m4752b(com_google_android_gms_internal_zzbfl))) {
                    return false;
                }
            } else if (dqVar.m4750a(com_google_android_gms_internal_zzbfl)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (zzbfl com_google_android_gms_internal_zzbfl : mo3042a().values()) {
            if (m4750a(com_google_android_gms_internal_zzbfl)) {
                i = (i * 31) + m4752b(com_google_android_gms_internal_zzbfl).hashCode();
            }
        }
        return i;
    }
}
