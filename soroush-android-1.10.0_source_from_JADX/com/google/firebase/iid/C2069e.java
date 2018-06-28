package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2069e implements Runnable {
    private final long f6966a;
    private final WakeLock f6967b = ((PowerManager) m5656a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private FirebaseInstanceId f6968c;

    C2069e(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f6968c = firebaseInstanceId;
        this.f6966a = j;
        this.f6967b.setReferenceCounted(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m5653a(java.lang.String r10) {
        /*
        r9 = this;
        r0 = "!";
        r10 = r10.split(r0);
        r0 = 1;
        r1 = 2;
        r2 = r10.length;
        if (r2 != r1) goto L_0x0151;
    L_0x000b:
        r1 = 0;
        r2 = r10[r1];
        r10 = r10[r0];
        r3 = -1;
        r4 = r2.hashCode();	 Catch:{ IOException -> 0x0130 }
        r5 = 83;
        if (r4 == r5) goto L_0x0028;
    L_0x0019:
        r5 = 85;
        if (r4 == r5) goto L_0x001e;
    L_0x001d:
        goto L_0x0031;
    L_0x001e:
        r4 = "U";
        r2 = r2.equals(r4);	 Catch:{ IOException -> 0x0130 }
        if (r2 == 0) goto L_0x0031;
    L_0x0026:
        r3 = r0;
        goto L_0x0031;
    L_0x0028:
        r4 = "S";
        r2 = r2.equals(r4);	 Catch:{ IOException -> 0x0130 }
        if (r2 == 0) goto L_0x0031;
    L_0x0030:
        r3 = r1;
    L_0x0031:
        switch(r3) {
            case 0: goto L_0x00c3;
            case 1: goto L_0x0035;
            default: goto L_0x0034;
        };	 Catch:{ IOException -> 0x0130 }
    L_0x0034:
        return r0;
    L_0x0035:
        r2 = r9.f6968c;	 Catch:{ IOException -> 0x0130 }
        r3 = r2.m5622e();	 Catch:{ IOException -> 0x0130 }
        if (r3 == 0) goto L_0x00bb;
    L_0x003d:
        r4 = com.google.firebase.iid.C2078n.f6994c;	 Catch:{ IOException -> 0x0130 }
        r4 = r3.m5652b(r4);	 Catch:{ IOException -> 0x0130 }
        if (r4 == 0) goto L_0x0047;
    L_0x0045:
        goto L_0x00bb;
    L_0x0047:
        r4 = new android.os.Bundle;	 Catch:{ IOException -> 0x0130 }
        r4.<init>();	 Catch:{ IOException -> 0x0130 }
        r5 = "gcm.topic";
        r6 = "/topics/";
        r6 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x0130 }
        r7 = java.lang.String.valueOf(r10);	 Catch:{ IOException -> 0x0130 }
        r8 = r7.length();	 Catch:{ IOException -> 0x0130 }
        if (r8 == 0) goto L_0x0063;
    L_0x005e:
        r6 = r6.concat(r7);	 Catch:{ IOException -> 0x0130 }
        goto L_0x0069;
    L_0x0063:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0130 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x0130 }
        r6 = r7;
    L_0x0069:
        r4.putString(r5, r6);	 Catch:{ IOException -> 0x0130 }
        r2 = r2.f6941b;	 Catch:{ IOException -> 0x0130 }
        r3 = r3.f6963a;	 Catch:{ IOException -> 0x0130 }
        r5 = "/topics/";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x0130 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ IOException -> 0x0130 }
        r6 = r10.length();	 Catch:{ IOException -> 0x0130 }
        if (r6 == 0) goto L_0x0085;
    L_0x0080:
        r10 = r5.concat(r10);	 Catch:{ IOException -> 0x0130 }
        goto L_0x008a;
    L_0x0085:
        r10 = new java.lang.String;	 Catch:{ IOException -> 0x0130 }
        r10.<init>(r5);	 Catch:{ IOException -> 0x0130 }
    L_0x008a:
        r5 = android.os.Looper.getMainLooper();	 Catch:{ IOException -> 0x0130 }
        r6 = android.os.Looper.myLooper();	 Catch:{ IOException -> 0x0130 }
        if (r5 != r6) goto L_0x009c;
    L_0x0094:
        r10 = new java.io.IOException;	 Catch:{ IOException -> 0x0130 }
        r0 = "MAIN_THREAD";
        r10.<init>(r0);	 Catch:{ IOException -> 0x0130 }
        throw r10;	 Catch:{ IOException -> 0x0130 }
    L_0x009c:
        r5 = com.google.firebase.iid.C2078n.f6993a;	 Catch:{ IOException -> 0x0130 }
        r6 = r2.f6997b;	 Catch:{ IOException -> 0x0130 }
        r5.m5647b(r6, r3, r10);	 Catch:{ IOException -> 0x0130 }
        r5 = "delete";
        r6 = "1";
        r4.putString(r5, r6);	 Catch:{ IOException -> 0x0130 }
        r2.m5671a(r3, r10, r4);	 Catch:{ IOException -> 0x0130 }
        r10 = com.google.firebase.iid.FirebaseInstanceId.m5615g();	 Catch:{ IOException -> 0x0130 }
        if (r10 == 0) goto L_0x0151;
    L_0x00b3:
        r10 = "FirebaseInstanceId";
        r2 = "unsubscribe operation succeeded";
    L_0x00b7:
        android.util.Log.d(r10, r2);	 Catch:{ IOException -> 0x0130 }
        return r0;
    L_0x00bb:
        r10 = new java.io.IOException;	 Catch:{ IOException -> 0x0130 }
        r0 = "token not available";
        r10.<init>(r0);	 Catch:{ IOException -> 0x0130 }
        throw r10;	 Catch:{ IOException -> 0x0130 }
    L_0x00c3:
        r2 = r9.f6968c;	 Catch:{ IOException -> 0x0130 }
        r3 = r2.m5622e();	 Catch:{ IOException -> 0x0130 }
        if (r3 == 0) goto L_0x0128;
    L_0x00cb:
        r4 = com.google.firebase.iid.C2078n.f6994c;	 Catch:{ IOException -> 0x0130 }
        r4 = r3.m5652b(r4);	 Catch:{ IOException -> 0x0130 }
        if (r4 == 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x0128;
    L_0x00d4:
        r4 = new android.os.Bundle;	 Catch:{ IOException -> 0x0130 }
        r4.<init>();	 Catch:{ IOException -> 0x0130 }
        r5 = "gcm.topic";
        r6 = "/topics/";
        r6 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x0130 }
        r7 = java.lang.String.valueOf(r10);	 Catch:{ IOException -> 0x0130 }
        r8 = r7.length();	 Catch:{ IOException -> 0x0130 }
        if (r8 == 0) goto L_0x00f0;
    L_0x00eb:
        r6 = r6.concat(r7);	 Catch:{ IOException -> 0x0130 }
        goto L_0x00f6;
    L_0x00f0:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0130 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x0130 }
        r6 = r7;
    L_0x00f6:
        r4.putString(r5, r6);	 Catch:{ IOException -> 0x0130 }
        r3 = r3.f6963a;	 Catch:{ IOException -> 0x0130 }
        r5 = "/topics/";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x0130 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ IOException -> 0x0130 }
        r6 = r10.length();	 Catch:{ IOException -> 0x0130 }
        if (r6 == 0) goto L_0x0110;
    L_0x010b:
        r10 = r5.concat(r10);	 Catch:{ IOException -> 0x0130 }
        goto L_0x0115;
    L_0x0110:
        r10 = new java.lang.String;	 Catch:{ IOException -> 0x0130 }
        r10.<init>(r5);	 Catch:{ IOException -> 0x0130 }
    L_0x0115:
        r2.m5617a(r4);	 Catch:{ IOException -> 0x0130 }
        r2 = r2.f6941b;	 Catch:{ IOException -> 0x0130 }
        r2.m5671a(r3, r10, r4);	 Catch:{ IOException -> 0x0130 }
        r10 = com.google.firebase.iid.FirebaseInstanceId.m5615g();	 Catch:{ IOException -> 0x0130 }
        if (r10 == 0) goto L_0x0151;
    L_0x0123:
        r10 = "FirebaseInstanceId";
        r2 = "subscribe operation succeeded";
        goto L_0x00b7;
    L_0x0128:
        r10 = new java.io.IOException;	 Catch:{ IOException -> 0x0130 }
        r0 = "token not available";
        r10.<init>(r0);	 Catch:{ IOException -> 0x0130 }
        throw r10;	 Catch:{ IOException -> 0x0130 }
    L_0x0130:
        r10 = move-exception;
        r0 = "FirebaseInstanceId";
        r2 = "Topic sync failed: ";
        r10 = r10.getMessage();
        r10 = java.lang.String.valueOf(r10);
        r3 = r10.length();
        if (r3 == 0) goto L_0x0148;
    L_0x0143:
        r10 = r2.concat(r10);
        goto L_0x014d;
    L_0x0148:
        r10 = new java.lang.String;
        r10.<init>(r2);
    L_0x014d:
        android.util.Log.e(r0, r10);
        return r1;
    L_0x0151:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.e.a(java.lang.String):boolean");
    }

    private final boolean m5654c() {
        C2068d e = this.f6968c.m5622e();
        if (e != null && !e.m5652b(C2078n.f6994c)) {
            return true;
        }
        String str;
        try {
            FirebaseInstanceId firebaseInstanceId = this.f6968c;
            String str2 = firebaseInstanceId.f6942c;
            String str3 = "*";
            Bundle bundle = new Bundle();
            firebaseInstanceId.m5617a(bundle);
            C2078n c2078n = firebaseInstanceId.f6941b;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            boolean z;
            String a;
            Context a2;
            Parcelable intent;
            Intent intent2;
            if (bundle.getString("ttl") == null) {
                if (!"jwt".equals(bundle.getString(IjkMediaMeta.IJKM_KEY_TYPE))) {
                    C2068d a3 = C2078n.f6993a.m5641a(c2078n.f6997b, str2, str3);
                    if (a3 == null || a3.m5652b(C2078n.f6994c)) {
                        z = true;
                        a = c2078n.m5671a(str2, str3, bundle);
                        if (a != null && r5) {
                            C2078n.f6993a.m5643a(c2078n.f6997b, str2, str3, a, C2078n.f6994c);
                        }
                        str = a;
                        if (str == null) {
                            Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                            return false;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "Token successfully retrieved");
                        }
                        if (e == null || !(e == null || str.equals(e.f6963a))) {
                            a2 = m5656a();
                            intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                            intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
                            intent2.setClass(a2, FirebaseInstanceIdReceiver.class);
                            intent2.putExtra("wrapped_intent", intent);
                            a2.sendBroadcast(intent2);
                        }
                        return true;
                    }
                    str = a3.f6963a;
                    if (str == null) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "Token successfully retrieved");
                        }
                        a2 = m5656a();
                        intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                        intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
                        intent2.setClass(a2, FirebaseInstanceIdReceiver.class);
                        intent2.putExtra("wrapped_intent", intent);
                        a2.sendBroadcast(intent2);
                        return true;
                    }
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
            }
            z = false;
            a = c2078n.m5671a(str2, str3, bundle);
            C2078n.f6993a.m5643a(c2078n.f6997b, str2, str3, a, C2078n.f6994c);
            str = a;
            if (str == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            a2 = m5656a();
            intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
            intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
            intent2.setClass(a2, FirebaseInstanceIdReceiver.class);
            intent2.putExtra("wrapped_intent", intent);
            a2.sendBroadcast(intent2);
            return true;
        } catch (Exception e2) {
            String str4 = "FirebaseInstanceId";
            str = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e(str4, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m5655d() {
        /*
        r3 = this;
        r0 = com.google.firebase.iid.FirebaseInstanceId.m5614f();
    L_0x0004:
        r1 = r3.f6968c;
        monitor-enter(r1);
        r2 = r0.m5676a();	 Catch:{ all -> 0x0024 }
        if (r2 != 0) goto L_0x0017;
    L_0x000d:
        r0 = "FirebaseInstanceId";
        r2 = "topic sync succeeded";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x0024 }
        r0 = 1;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        return r0;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        r1 = r3.m5653a(r2);
        if (r1 != 0) goto L_0x0020;
    L_0x001e:
        r0 = 0;
        return r0;
    L_0x0020:
        r0.m5677a(r2);
        goto L_0x0004;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.e.d():boolean");
    }

    final Context m5656a() {
        return this.f6968c.f6940a.m5597a();
    }

    final boolean m5657b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m5656a().getSystemService("connectivity");
        return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) ? false : true;
    }

    public final void run() {
        this.f6967b.acquire();
        try {
            FirebaseInstanceId firebaseInstanceId;
            this.f6968c.m5618a(true);
            if (aa.m5628a(m5656a())) {
                if (!m5657b()) {
                    BroadcastReceiver c2070f = new C2070f(this);
                    if (FirebaseInstanceId.m5615g()) {
                        Log.d("FirebaseInstanceId", "Connectivity change received registered");
                    }
                    c2070f.f6969a.m5656a().registerReceiver(c2070f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } else if (m5654c() && m5655d()) {
                    firebaseInstanceId = this.f6968c;
                } else {
                    this.f6968c.m5616a(this.f6966a);
                }
                this.f6967b.release();
            }
            firebaseInstanceId = this.f6968c;
            firebaseInstanceId.m5618a(false);
            this.f6967b.release();
        } catch (Throwable th) {
            this.f6967b.release();
        }
    }
}
