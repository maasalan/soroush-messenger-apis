package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.p029a.C0360h;

public final class FirebaseInstanceIdReceiver extends C0360h {
    private static boolean f15492a = false;
    private static C2077m f15493b;
    private static C2077m f15494c;

    private static synchronized C2077m m12376a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f15494c == null) {
                    f15494c = new C2077m(context, str);
                }
                C2077m c2077m = f15494c;
                return c2077m;
            }
            if (f15493b == null) {
                f15493b = new C2077m(context, str);
            }
            c2077m = f15493b;
            return c2077m;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12377a(android.content.Context r7, android.content.Intent r8, java.lang.String r9) {
        /*
        r6 = this;
        r0 = 0;
        r8.setComponent(r0);
        r1 = r7.getPackageName();
        r8.setPackage(r1);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 18;
        if (r1 > r2) goto L_0x0018;
    L_0x0011:
        r1 = r7.getPackageName();
        r8.removeCategory(r1);
    L_0x0018:
        r1 = "gcm.rawData64";
        r1 = r8.getStringExtra(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x002f;
    L_0x0021:
        r3 = "rawData";
        r1 = android.util.Base64.decode(r1, r2);
        r8.putExtra(r3, r1);
        r1 = "gcm.rawData64";
        r8.removeExtra(r1);
    L_0x002f:
        r1 = "from";
        r1 = r8.getStringExtra(r1);
        r3 = "google.com/iid";
        r3 = r3.equals(r1);
        if (r3 != 0) goto L_0x006a;
    L_0x003d:
        r3 = "gcm.googleapis.com/refresh";
        r1 = r3.equals(r1);
        if (r1 != 0) goto L_0x006a;
    L_0x0045:
        r1 = "com.google.firebase.INSTANCE_ID_EVENT";
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x006a;
    L_0x004e:
        r1 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r1.equals(r9);
        if (r1 != 0) goto L_0x0067;
    L_0x0056:
        r1 = "com.google.firebase.MESSAGING_EVENT";
        r9 = r1.equals(r9);
        if (r9 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0067;
    L_0x005f:
        r9 = "FirebaseInstanceId";
        r1 = "Unexpected intent";
        android.util.Log.d(r9, r1);
        goto L_0x006c;
    L_0x0067:
        r0 = "com.google.firebase.MESSAGING_EVENT";
        goto L_0x006c;
    L_0x006a:
        r0 = "com.google.firebase.INSTANCE_ID_EVENT";
    L_0x006c:
        r9 = -1;
        if (r0 == 0) goto L_0x00fc;
    L_0x006f:
        r1 = com.google.android.gms.common.util.C1793m.m4535d();
        r3 = 1;
        if (r1 == 0) goto L_0x0082;
    L_0x0076:
        r1 = r7.getApplicationInfo();
        r1 = r1.targetSdkVersion;
        r4 = 25;
        if (r1 <= r4) goto L_0x0082;
    L_0x0080:
        r1 = r3;
        goto L_0x0083;
    L_0x0082:
        r1 = r2;
    L_0x0083:
        if (r1 == 0) goto L_0x009a;
    L_0x0085:
        r1 = r6.isOrderedBroadcast();
        if (r1 == 0) goto L_0x008e;
    L_0x008b:
        r6.setResultCode(r9);
    L_0x008e:
        r7 = m12376a(r7, r0);
        r0 = r6.goAsync();
        r7.m5666a(r8, r0);
        goto L_0x00fc;
    L_0x009a:
        r1 = com.google.firebase.iid.C2066b.m5636a();
        r4 = r0.hashCode();
        r5 = -842411455; // 0xffffffffcdc9d241 float:-4.23249952E8 double:NaN;
        if (r4 == r5) goto L_0x00b7;
    L_0x00a7:
        r2 = 41532704; // 0x279bd20 float:1.8347907E-37 double:2.0519882E-316;
        if (r4 == r2) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00c0;
    L_0x00ad:
        r2 = "com.google.firebase.MESSAGING_EVENT";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00c0;
    L_0x00b5:
        r9 = r3;
        goto L_0x00c0;
    L_0x00b7:
        r3 = "com.google.firebase.INSTANCE_ID_EVENT";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x00c0;
    L_0x00bf:
        r9 = r2;
    L_0x00c0:
        switch(r9) {
            case 0: goto L_0x00d9;
            case 1: goto L_0x00d6;
            default: goto L_0x00c3;
        };
    L_0x00c3:
        r7 = "FirebaseInstanceId";
        r8 = "Unknown service action: ";
        r9 = java.lang.String.valueOf(r0);
        r0 = r9.length();
        if (r0 == 0) goto L_0x00f0;
    L_0x00d1:
        r8 = r8.concat(r9);
        goto L_0x00f6;
    L_0x00d6:
        r9 = r1.f6957b;
        goto L_0x00db;
    L_0x00d9:
        r9 = r1.f6956a;
    L_0x00db:
        r9.offer(r8);
        r8 = new android.content.Intent;
        r8.<init>(r0);
        r9 = r7.getPackageName();
        r8.setPackage(r9);
        r7 = r1.m5637a(r7, r8);
    L_0x00ee:
        r9 = r7;
        goto L_0x00fc;
    L_0x00f0:
        r9 = new java.lang.String;
        r9.<init>(r8);
        r8 = r9;
    L_0x00f6:
        android.util.Log.w(r7, r8);
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        goto L_0x00ee;
    L_0x00fc:
        r7 = r6.isOrderedBroadcast();
        if (r7 == 0) goto L_0x0105;
    L_0x0102:
        r6.setResultCode(r9);
    L_0x0105:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.a(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                m12377a(context, (Intent) parcelableExtra, intent.getAction());
            } else {
                m12377a(context, intent, intent.getAction());
            }
        }
    }
}
