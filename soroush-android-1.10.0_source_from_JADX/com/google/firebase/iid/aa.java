package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.p038g.C0482m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1793m;
import com.google.android.gms.iid.MessengerCompat;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.List;
import org.jivesoftware.smack.util.StringUtils;

public final class aa {
    static int f6944a;
    static long f6945b;
    private static int f6946g;
    private static int f6947h;
    private static PendingIntent f6948i;
    final C0482m<String, ad> f6949c = new C0482m();
    Context f6950d;
    Messenger f6951e;
    MessengerCompat f6952f;
    private Messenger f6953j;

    public aa(Context context) {
        this.f6950d = context.getApplicationContext();
        this.f6953j = new Messenger(new ab(this, Looper.getMainLooper()));
    }

    private final Bundle m5624a(Bundle bundle) {
        Bundle b = m5630b(bundle);
        if (b == null || !b.containsKey("google.messenger")) {
            return b;
        }
        b = m5630b(bundle);
        return (b == null || !b.containsKey("google.messenger")) ? b : null;
    }

    private static synchronized String m5625a() {
        String num;
        synchronized (aa.class) {
            int i = f6947h;
            f6947h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static String m5626a(KeyPair keyPair, String... strArr) {
        Throwable e;
        String str;
        String str2;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes(StringUtils.UTF8);
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                return FirebaseInstanceId.m5611a(instance.sign());
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "FirebaseInstanceId";
                str2 = "Unable to sign registration request";
                Log.e(str, str2, e);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            str = "FirebaseInstanceId";
            str2 = "Unable to encode string";
            Log.e(str, str2, e);
            return null;
        }
    }

    private static synchronized void m5627a(Context context, Intent intent) {
        synchronized (aa.class) {
            if (f6948i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6948i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f6948i);
        }
    }

    public static boolean m5628a(Context context) {
        return m5629b(context) != 0;
    }

    private static synchronized int m5629b(Context context) {
        synchronized (aa.class) {
            if (f6946g != 0) {
                int i = f6946g;
                return i;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                return 0;
            }
            Intent intent;
            if (!C1793m.m4535d()) {
                intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    f6946g = 1;
                    return 1;
                }
            }
            intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                if (C1793m.m4535d()) {
                    f6946g = 2;
                } else {
                    f6946g = 1;
                }
                i = f6946g;
                return i;
            }
            f6946g = 2;
            return 2;
        }
    }

    private final android.os.Bundle m5630b(android.os.Bundle r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = m5625a();
        r1 = new com.google.firebase.iid.ac;
        r2 = 0;
        r1.<init>(r2);
        r2 = r9.f6949c;
        monitor-enter(r2);
        r3 = r9.f6949c;	 Catch:{ all -> 0x018b }
        r3.put(r0, r1);	 Catch:{ all -> 0x018b }
        monitor-exit(r2);	 Catch:{ all -> 0x018b }
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = f6945b;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0053;
    L_0x001f:
        r4 = f6945b;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0053;
    L_0x0025:
        r10 = "FirebaseInstanceId";
        r0 = f6945b;
        r4 = r0 - r2;
        r0 = f6944a;
        r1 = 78;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Backoff mode, next request attempt: ";
        r2.append(r1);
        r2.append(r4);
        r1 = " interval: ";
        r2.append(r1);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.w(r10, r0);
        r10 = new java.io.IOException;
        r0 = "RETRY_LATER";
        r10.<init>(r0);
        throw r10;
    L_0x0053:
        r2 = r9.f6950d;
        r2 = m5629b(r2);
        if (r2 != 0) goto L_0x0063;
    L_0x005b:
        r10 = new java.io.IOException;
        r0 = "MISSING_INSTANCEID_SERVICE";
        r10.<init>(r0);
        throw r10;
    L_0x0063:
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = r9.f6950d;
        r3 = m5629b(r3);
        r4 = 2;
        if (r3 != r4) goto L_0x007c;
    L_0x0076:
        r3 = "com.google.iid.TOKEN_REQUEST";
    L_0x0078:
        r2.setAction(r3);
        goto L_0x007f;
    L_0x007c:
        r3 = "com.google.android.c2dm.intent.REGISTER";
        goto L_0x0078;
    L_0x007f:
        r2.putExtras(r10);
        r10 = r9.f6950d;
        m5627a(r10, r2);
        r10 = "kid";
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r5 = 5;
        r3 = r3 + r5;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r3);
        r3 = "|ID|";
        r6.append(r3);
        r6.append(r0);
        r3 = "|";
        r6.append(r3);
        r3 = r6.toString();
        r2.putExtra(r10, r3);
        r10 = "X-kid";
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r5 = r5 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r5);
        r5 = "|ID|";
        r3.append(r5);
        r3.append(r0);
        r5 = "|";
        r3.append(r5);
        r3 = r3.toString();
        r2.putExtra(r10, r3);
        r10 = "FirebaseInstanceId";
        r3 = 3;
        r10 = android.util.Log.isLoggable(r10, r3);
        if (r10 == 0) goto L_0x0102;
    L_0x00d9:
        r10 = "FirebaseInstanceId";
        r5 = r2.getExtras();
        r5 = java.lang.String.valueOf(r5);
        r6 = 8;
        r7 = java.lang.String.valueOf(r5);
        r7 = r7.length();
        r6 = r6 + r7;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r6 = "Sending ";
        r7.append(r6);
        r7.append(r5);
        r5 = r7.toString();
        android.util.Log.d(r10, r5);
    L_0x0102:
        r10 = "google.messenger";
        r5 = r9.f6953j;
        r2.putExtra(r10, r5);
        r10 = r9.f6951e;
        if (r10 != 0) goto L_0x0111;
    L_0x010d:
        r10 = r9.f6952f;
        if (r10 == 0) goto L_0x0136;
    L_0x0111:
        r10 = android.os.Message.obtain();
        r10.obj = r2;
        r5 = r9.f6951e;	 Catch:{ RemoteException -> 0x0127 }
        if (r5 == 0) goto L_0x0121;	 Catch:{ RemoteException -> 0x0127 }
    L_0x011b:
        r5 = r9.f6951e;	 Catch:{ RemoteException -> 0x0127 }
        r5.send(r10);	 Catch:{ RemoteException -> 0x0127 }
        goto L_0x0149;	 Catch:{ RemoteException -> 0x0127 }
    L_0x0121:
        r5 = r9.f6952f;	 Catch:{ RemoteException -> 0x0127 }
        r5.m11848a(r10);	 Catch:{ RemoteException -> 0x0127 }
        goto L_0x0149;
    L_0x0127:
        r10 = "FirebaseInstanceId";
        r10 = android.util.Log.isLoggable(r10, r3);
        if (r10 == 0) goto L_0x0136;
    L_0x012f:
        r10 = "FirebaseInstanceId";
        r3 = "Messenger failed, fallback to startService";
        android.util.Log.d(r10, r3);
    L_0x0136:
        r10 = r9.f6950d;
        r10 = m5629b(r10);
        if (r10 != r4) goto L_0x0144;
    L_0x013e:
        r10 = r9.f6950d;
        r10.sendBroadcast(r2);
        goto L_0x0149;
    L_0x0144:
        r10 = r9.f6950d;
        r10.startService(r2);
    L_0x0149:
        r10 = r1.f15495a;	 Catch:{ all -> 0x017d }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;	 Catch:{ all -> 0x017d }
        r10 = r10.block(r2);	 Catch:{ all -> 0x017d }
        if (r10 != 0) goto L_0x0162;	 Catch:{ all -> 0x017d }
    L_0x0153:
        r10 = "FirebaseInstanceId";	 Catch:{ all -> 0x017d }
        r1 = "No response";	 Catch:{ all -> 0x017d }
        android.util.Log.w(r10, r1);	 Catch:{ all -> 0x017d }
        r10 = new java.io.IOException;	 Catch:{ all -> 0x017d }
        r1 = "TIMEOUT";	 Catch:{ all -> 0x017d }
        r10.<init>(r1);	 Catch:{ all -> 0x017d }
        throw r10;	 Catch:{ all -> 0x017d }
    L_0x0162:
        r10 = r1.f15497c;	 Catch:{ all -> 0x017d }
        if (r10 == 0) goto L_0x016e;	 Catch:{ all -> 0x017d }
    L_0x0166:
        r10 = new java.io.IOException;	 Catch:{ all -> 0x017d }
        r1 = r1.f15497c;	 Catch:{ all -> 0x017d }
        r10.<init>(r1);	 Catch:{ all -> 0x017d }
        throw r10;	 Catch:{ all -> 0x017d }
    L_0x016e:
        r10 = r1.f15496b;	 Catch:{ all -> 0x017d }
        r1 = r9.f6949c;
        monitor-enter(r1);
        r2 = r9.f6949c;	 Catch:{ all -> 0x017a }
        r2.remove(r0);	 Catch:{ all -> 0x017a }
        monitor-exit(r1);	 Catch:{ all -> 0x017a }
        return r10;	 Catch:{ all -> 0x017a }
    L_0x017a:
        r10 = move-exception;	 Catch:{ all -> 0x017a }
        monitor-exit(r1);	 Catch:{ all -> 0x017a }
        throw r10;
    L_0x017d:
        r10 = move-exception;
        r1 = r9.f6949c;
        monitor-enter(r1);
        r2 = r9.f6949c;	 Catch:{ all -> 0x0188 }
        r2.remove(r0);	 Catch:{ all -> 0x0188 }
        monitor-exit(r1);	 Catch:{ all -> 0x0188 }
        throw r10;
    L_0x0188:
        r10 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0188 }
        throw r10;
    L_0x018b:
        r10 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x018b }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aa.b(android.os.Bundle):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final android.os.Bundle m5631a(android.os.Bundle r7, java.security.KeyPair r8) {
        /*
        r6 = this;
        r0 = r6.f6950d;
        r1 = "com.google.android.gms";
        r0 = com.google.firebase.iid.FirebaseInstanceId.m5608a(r0, r1);
        r1 = "gmsv";
        r2 = java.lang.Integer.toString(r0);
        r7.putString(r1, r2);
        r1 = "osv";
        r2 = android.os.Build.VERSION.SDK_INT;
        r2 = java.lang.Integer.toString(r2);
        r7.putString(r1, r2);
        r1 = "app_ver";
        r2 = r6.f6950d;
        r2 = com.google.firebase.iid.FirebaseInstanceId.m5607a(r2);
        r2 = java.lang.Integer.toString(r2);
        r7.putString(r1, r2);
        r1 = "app_ver_name";
        r2 = r6.f6950d;
        r2 = com.google.firebase.iid.FirebaseInstanceId.m5613b(r2);
        r7.putString(r1, r2);
        r1 = "cliv";
        r2 = "fiid-11720000";
        r7.putString(r1, r2);
        r1 = "appid";
        r2 = com.google.firebase.iid.FirebaseInstanceId.m5610a(r8);
        r7.putString(r1, r2);
        r1 = r8.getPublic();
        r1 = r1.getEncoded();
        r1 = com.google.firebase.iid.FirebaseInstanceId.m5611a(r1);
        r2 = "pub2";
        r7.putString(r2, r1);
        r2 = "sig";
        r3 = 2;
        r3 = new java.lang.String[r3];
        r4 = r6.f6950d;
        r4 = r4.getPackageName();
        r5 = 0;
        r3[r5] = r4;
        r4 = 1;
        r3[r4] = r1;
        r8 = m5626a(r8, r3);
        r7.putString(r2, r8);
        r8 = 12000000; // 0xb71b00 float:1.6815582E-38 double:5.9287878E-317;
        if (r0 < r8) goto L_0x00fd;
    L_0x0074:
        r8 = r6.f6950d;
        r8 = com.google.firebase.iid.C2080p.m5678a(r8);
        r0 = new com.google.firebase.iid.z;
        r1 = r8.m5679a();
        r0.<init>(r1, r7);
        r8 = r8.m5680a(r0);
        r0 = "Must not be called on the main application thread";
        com.google.android.gms.common.internal.ac.m4387c(r0);	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r0 = "Task must not be null";
        com.google.android.gms.common.internal.ac.m4377a(r8, r0);	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r0 = r8.mo1542a();	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        if (r0 == 0) goto L_0x009c;
    L_0x0097:
        r8 = com.google.android.gms.p160b.C1696g.m4299a(r8);	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        goto L_0x00b1;
    L_0x009c:
        r0 = new com.google.android.gms.b.g$a;	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r1 = com.google.android.gms.p160b.C1695f.f5198b;	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r8.mo1541a(r1, r0);	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r1 = com.google.android.gms.p160b.C1695f.f5198b;	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r8.mo1540a(r1, r0);	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r0 = r0.f17967a;	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        r0.await();	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        goto L_0x0097;
    L_0x00b1:
        r8 = (android.os.Bundle) r8;	 Catch:{ InterruptedException -> 0x00b4, InterruptedException -> 0x00b4 }
        return r8;
    L_0x00b4:
        r8 = move-exception;
        r0 = "FirebaseInstanceId";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x00e3;
    L_0x00be:
        r0 = "FirebaseInstanceId";
        r1 = java.lang.String.valueOf(r8);
        r2 = 22;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Error making request: ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        android.util.Log.d(r0, r1);
    L_0x00e3:
        r0 = r8.getCause();
        r0 = r0 instanceof com.google.firebase.iid.C2088y;
        if (r0 == 0) goto L_0x00fb;
    L_0x00eb:
        r8 = r8.getCause();
        r8 = (com.google.firebase.iid.C2088y) r8;
        r8 = r8.f7025a;
        r0 = 4;
        if (r8 != r0) goto L_0x00fb;
    L_0x00f6:
        r7 = r6.m5624a(r7);
        return r7;
    L_0x00fb:
        r7 = 0;
        return r7;
    L_0x00fd:
        r7 = r6.m5624a(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aa.a(android.os.Bundle, java.security.KeyPair):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5632a(java.lang.String r4, java.lang.String r5) {
        /*
        r3 = this;
        r0 = r3.f6949c;
        monitor-enter(r0);
        if (r4 != 0) goto L_0x0022;
    L_0x0005:
        r4 = 0;
    L_0x0006:
        r1 = r3.f6949c;	 Catch:{ all -> 0x004e }
        r1 = r1.size();	 Catch:{ all -> 0x004e }
        if (r4 >= r1) goto L_0x001c;
    L_0x000e:
        r1 = r3.f6949c;	 Catch:{ all -> 0x004e }
        r1 = r1.m1020c(r4);	 Catch:{ all -> 0x004e }
        r1 = (com.google.firebase.iid.ad) r1;	 Catch:{ all -> 0x004e }
        r1.mo1778a(r5);	 Catch:{ all -> 0x004e }
        r4 = r4 + 1;
        goto L_0x0006;
    L_0x001c:
        r4 = r3.f6949c;	 Catch:{ all -> 0x004e }
        r4.clear();	 Catch:{ all -> 0x004e }
        goto L_0x004c;
    L_0x0022:
        r1 = r3.f6949c;	 Catch:{ all -> 0x004e }
        r1 = r1.remove(r4);	 Catch:{ all -> 0x004e }
        r1 = (com.google.firebase.iid.ad) r1;	 Catch:{ all -> 0x004e }
        if (r1 != 0) goto L_0x0049;
    L_0x002c:
        r5 = "FirebaseInstanceId";
        r1 = "Missing callback for ";
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x004e }
        r2 = r4.length();	 Catch:{ all -> 0x004e }
        if (r2 == 0) goto L_0x003f;
    L_0x003a:
        r4 = r1.concat(r4);	 Catch:{ all -> 0x004e }
        goto L_0x0044;
    L_0x003f:
        r4 = new java.lang.String;	 Catch:{ all -> 0x004e }
        r4.<init>(r1);	 Catch:{ all -> 0x004e }
    L_0x0044:
        android.util.Log.w(r5, r4);	 Catch:{ all -> 0x004e }
        monitor-exit(r0);	 Catch:{ all -> 0x004e }
        return;
    L_0x0049:
        r1.mo1778a(r5);	 Catch:{ all -> 0x004e }
    L_0x004c:
        monitor-exit(r0);	 Catch:{ all -> 0x004e }
        return;
    L_0x004e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aa.a(java.lang.String, java.lang.String):void");
    }
}
