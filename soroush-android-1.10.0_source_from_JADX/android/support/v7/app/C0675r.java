package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

final class C0675r {
    static C0675r f2250a;
    private final Context f2251b;
    private final LocationManager f2252c;
    private final C0674a f2253d = new C0674a();

    private static class C0674a {
        boolean f2244a;
        long f2245b;
        long f2246c;
        long f2247d;
        long f2248e;
        long f2249f;

        C0674a() {
        }
    }

    C0675r(Context context, LocationManager locationManager) {
        this.f2251b = context;
        this.f2252c = locationManager;
    }

    private Location m1651a(String str) {
        if (this.f2252c != null) {
            try {
                if (this.f2252c.isProviderEnabled(str)) {
                    return this.f2252c.getLastKnownLocation(str);
                }
            } catch (Throwable e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m1652a() {
        /*
        r26 = this;
        r0 = r26;
        r1 = r0.f2253d;
        r2 = r0.f2253d;
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x0018;
    L_0x000a:
        r2 = r0.f2253d;
        r5 = r2.f2249f;
        r7 = java.lang.System.currentTimeMillis();
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r2 <= 0) goto L_0x0018;
    L_0x0016:
        r2 = r4;
        goto L_0x0019;
    L_0x0018:
        r2 = r3;
    L_0x0019:
        if (r2 == 0) goto L_0x001e;
    L_0x001b:
        r1 = r1.f2244a;
        return r1;
    L_0x001e:
        r2 = r0.f2251b;
        r5 = "android.permission.ACCESS_COARSE_LOCATION";
        r2 = android.support.v4.p029a.C0359g.m717a(r2, r5);
        r5 = 0;
        if (r2 != 0) goto L_0x0030;
    L_0x0029:
        r2 = "network";
        r2 = r0.m1651a(r2);
        goto L_0x0031;
    L_0x0030:
        r2 = r5;
    L_0x0031:
        r6 = r0.f2251b;
        r7 = "android.permission.ACCESS_FINE_LOCATION";
        r6 = android.support.v4.p029a.C0359g.m717a(r6, r7);
        if (r6 != 0) goto L_0x0041;
    L_0x003b:
        r5 = "gps";
        r5 = r0.m1651a(r5);
    L_0x0041:
        if (r5 == 0) goto L_0x0052;
    L_0x0043:
        if (r2 == 0) goto L_0x0052;
    L_0x0045:
        r6 = r5.getTime();
        r8 = r2.getTime();
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0055;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        if (r5 == 0) goto L_0x0055;
    L_0x0054:
        r2 = r5;
    L_0x0055:
        if (r2 == 0) goto L_0x00e6;
    L_0x0057:
        r5 = r0.f2253d;
        r13 = java.lang.System.currentTimeMillis();
        r6 = android.support.v7.app.C0673q.f2240a;
        if (r6 != 0) goto L_0x0068;
    L_0x0061:
        r6 = new android.support.v7.app.q;
        r6.<init>();
        android.support.v7.app.C0673q.f2240a = r6;
    L_0x0068:
        r11 = android.support.v7.app.C0673q.f2240a;
        r22 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r16 = r13 - r22;
        r18 = r2.getLatitude();
        r20 = r2.getLongitude();
        r15 = r11;
        r15.m1650a(r16, r18, r20);
        r9 = r11.f2241b;
        r15 = r2.getLatitude();
        r17 = r2.getLongitude();
        r6 = r11;
        r7 = r13;
        r24 = r9;
        r9 = r15;
        r15 = r11;
        r11 = r17;
        r6.m1650a(r7, r9, r11);
        r6 = r15.f2243d;
        if (r6 != r4) goto L_0x0095;
    L_0x0094:
        r3 = r4;
    L_0x0095:
        r6 = r15.f2242c;
        r8 = r15.f2241b;
        r16 = r13 + r22;
        r18 = r2.getLatitude();
        r20 = r2.getLongitude();
        r2 = r15;
        r15.m1650a(r16, r18, r20);
        r10 = r2.f2242c;
        r15 = -1;
        r2 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1));
        if (r2 == 0) goto L_0x00ce;
    L_0x00af:
        r2 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1));
        if (r2 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00ce;
    L_0x00b4:
        r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        r15 = 0;
        if (r2 <= 0) goto L_0x00bd;
    L_0x00ba:
        r12 = r15 + r10;
        goto L_0x00c6;
    L_0x00bd:
        r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x00c4;
    L_0x00c1:
        r12 = r15 + r8;
        goto L_0x00c6;
    L_0x00c4:
        r12 = r15 + r6;
    L_0x00c6:
        r14 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r16 = r12 + r14;
        r12 = r16;
        goto L_0x00d5;
    L_0x00ce:
        r15 = 43200000; // 0x2932e00 float:2.1626111E-37 double:2.1343636E-316;
        r17 = r13 + r15;
        r12 = r17;
    L_0x00d5:
        r5.f2244a = r3;
        r2 = r24;
        r5.f2245b = r2;
        r5.f2246c = r6;
        r5.f2247d = r8;
        r5.f2248e = r10;
        r5.f2249f = r12;
        r1 = r1.f2244a;
        return r1;
    L_0x00e6:
        r1 = "TwilightManager";
        r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.";
        android.util.Log.i(r1, r2);
        r1 = java.util.Calendar.getInstance();
        r2 = 11;
        r1 = r1.get(r2);
        r2 = 6;
        if (r1 < r2) goto L_0x0100;
    L_0x00fa:
        r2 = 22;
        if (r1 < r2) goto L_0x00ff;
    L_0x00fe:
        return r4;
    L_0x00ff:
        return r3;
    L_0x0100:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.r.a():boolean");
    }
}
