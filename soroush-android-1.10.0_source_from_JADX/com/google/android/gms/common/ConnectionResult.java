package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import org.jivesoftware.smack.packet.Message;

public final class ConnectionResult extends zzbej {
    public static final Creator<ConnectionResult> CREATOR = new C1750i();
    public static final int SUCCESS = 0;
    public static final ConnectionResult f17968a = new ConnectionResult(0);
    public final int f17969b;
    public final PendingIntent f17970c;
    public final String f17971d;
    private int f17972e;

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f17972e = i;
        this.f17969b = i2;
        this.f17970c = pendingIntent;
        this.f17971d = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    static String m15868a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("UNKNOWN_ERROR_CODE(");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                }
        }
    }

    public final boolean m15869a() {
        return (this.f17969b == 0 || this.f17970c == null) ? false : true;
    }

    public final boolean m15870b() {
        return this.f17969b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f17969b == connectionResult.f17969b && aa.m4374a(this.f17970c, connectionResult.f17970c) && aa.m4374a(this.f17971d, connectionResult.f17971d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17969b), this.f17970c, this.f17971d});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("statusCode", m15868a(this.f17969b)).m4375a("resolution", this.f17970c).m4375a(Message.ELEMENT, this.f17971d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f17972e);
        dm.m4743b(parcel, 2, this.f17969b);
        dm.m4731a(parcel, 3, this.f17970c, i);
        dm.m4733a(parcel, 4, this.f17971d);
        dm.m4742b(parcel, a);
    }
}
