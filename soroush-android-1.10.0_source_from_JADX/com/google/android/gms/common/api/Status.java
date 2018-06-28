package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class Status extends zzbej implements C1720i, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C1740m();
    public static final Status f17975a = new Status(0);
    public static final Status f17976b = new Status(14);
    public static final Status f17977c = new Status(8);
    public static final Status f17978d = new Status(15);
    public static final Status f17979e = new Status(16);
    public static final Status f17980f = new Status(17);
    private static Status f17981i = new Status(18);
    public final int f17982g;
    public final String f17983h;
    private int f17984j;
    private final PendingIntent f17985k;

    private Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f17984j = i;
        this.f17982g = i2;
        this.f17983h = str;
        this.f17985k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(String str) {
        this(1, 8, str, null);
    }

    public final Status mo3007a() {
        return this;
    }

    public final boolean m15872b() {
        return this.f17982g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f17984j == status.f17984j && this.f17982g == status.f17982g && aa.m4374a(this.f17983h, status.f17983h) && aa.m4374a(this.f17985k, status.f17985k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17984j), Integer.valueOf(this.f17982g), this.f17983h, this.f17985k});
    }

    public final String toString() {
        Object obj;
        ab a = aa.m4373a(this);
        String str = "statusCode";
        if (this.f17983h == null) {
            int i = this.f17982g;
            switch (i) {
                case -1:
                    obj = "SUCCESS_CACHE";
                    break;
                case 0:
                    obj = "SUCCESS";
                    break;
                case 2:
                    obj = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    obj = "SERVICE_DISABLED";
                    break;
                case 4:
                    obj = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    obj = "INVALID_ACCOUNT";
                    break;
                case 6:
                    obj = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    obj = "NETWORK_ERROR";
                    break;
                case 8:
                    obj = "INTERNAL_ERROR";
                    break;
                case 10:
                    obj = "DEVELOPER_ERROR";
                    break;
                case 13:
                    obj = "ERROR";
                    break;
                case 14:
                    obj = "INTERRUPTED";
                    break;
                case 15:
                    obj = "TIMEOUT";
                    break;
                case 16:
                    obj = "CANCELED";
                    break;
                case 17:
                    obj = "API_NOT_CONNECTED";
                    break;
                case 18:
                    obj = "DEAD_CLIENT";
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("unknown status code: ");
                    stringBuilder.append(i);
                    obj = stringBuilder.toString();
                    break;
            }
        }
        obj = this.f17983h;
        return a.m4375a(str, obj).m4375a("resolution", this.f17985k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f17982g);
        dm.m4733a(parcel, 2, this.f17983h);
        dm.m4731a(parcel, 3, this.f17985k, i);
        dm.m4743b(parcel, (int) IjkMediaCodecInfo.RANK_MAX, this.f17984j);
        dm.m4742b(parcel, a);
    }
}
