package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.gms.common.util.C1793m;
import com.google.android.gms.common.util.C1796p;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;

final class C2067c {
    final SharedPreferences f6960a;
    private Context f6961b;

    public C2067c(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private C2067c(Context context, String str) {
        this.f6961b = context;
        this.f6960a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        str = String.valueOf("-no-backup");
        valueOf = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        Context context2 = this.f6961b;
        File file = new File(C1793m.m4534c() ? context2.getNoBackupFilesDir() : C1796p.m4539a(new File(context2.getApplicationInfo().dataDir, "no_backup")), valueOf);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m5644a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    m5645b();
                    C2078n.m5667a(this.f6961b).m5674d();
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    str = "InstanceID/Store";
                    String str2 = "Error creating file in no backup dir: ";
                    valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    private static String m5638a(String str, String str2) {
        String str3 = "|S|";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(str3).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static String m5639c(String str, String str2, String str3) {
        String str4 = "|T|";
        StringBuilder stringBuilder = new StringBuilder((((1 + String.valueOf(str).length()) + String.valueOf(str4).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    private final void m5640e(String str) {
        Editor edit = this.f6960a.edit();
        for (String str2 : this.f6960a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized C2068d m5641a(String str, String str2, String str3) {
        return C2068d.m5650a(this.f6960a.getString(C2067c.m5639c(str, str2, str3), null));
    }

    final synchronized KeyPair m5642a(String str) {
        KeyPair a;
        a = C2065a.m5623a();
        long currentTimeMillis = System.currentTimeMillis();
        Editor edit = this.f6960a.edit();
        edit.putString(C2067c.m5638a(str, "|P|"), FirebaseInstanceId.m5611a(a.getPublic().getEncoded()));
        edit.putString(C2067c.m5638a(str, "|K|"), FirebaseInstanceId.m5611a(a.getPrivate().getEncoded()));
        edit.putString(C2067c.m5638a(str, "cre"), Long.toString(currentTimeMillis));
        edit.commit();
        return a;
    }

    public final synchronized void m5643a(String str, String str2, String str3, String str4, String str5) {
        str4 = C2068d.m5651a(str4, str5, System.currentTimeMillis());
        if (str4 != null) {
            Editor edit = this.f6960a.edit();
            edit.putString(C2067c.m5639c(str, str2, str3), str4);
            edit.commit();
        }
    }

    public final synchronized boolean m5644a() {
        return this.f6960a.getAll().isEmpty();
    }

    public final synchronized void m5645b() {
        this.f6960a.edit().clear().commit();
    }

    final synchronized void m5646b(String str) {
        m5640e(String.valueOf(str).concat("|"));
    }

    public final synchronized void m5647b(String str, String str2, String str3) {
        str = C2067c.m5639c(str, str2, str3);
        Editor edit = this.f6960a.edit();
        edit.remove(str);
        edit.commit();
    }

    public final synchronized void m5648c(String str) {
        m5640e(String.valueOf(str).concat("|T|"));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.security.KeyPair m5649d(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f6960a;	 Catch:{ all -> 0x007b }
        r1 = "|P|";
        r1 = com.google.firebase.iid.C2067c.m5638a(r5, r1);	 Catch:{ all -> 0x007b }
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x007b }
        r1 = r4.f6960a;	 Catch:{ all -> 0x007b }
        r3 = "|K|";
        r5 = com.google.firebase.iid.C2067c.m5638a(r5, r3);	 Catch:{ all -> 0x007b }
        r5 = r1.getString(r5, r2);	 Catch:{ all -> 0x007b }
        if (r0 == 0) goto L_0x0079;
    L_0x001c:
        if (r5 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0079;
    L_0x001f:
        r1 = 8;
        r0 = android.util.Base64.decode(r0, r1);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r5 = android.util.Base64.decode(r5, r1);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r1 = "RSA";
        r1 = java.security.KeyFactory.getInstance(r1);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r3 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r3.<init>(r0);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r0 = r1.generatePublic(r3);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r3 = new java.security.spec.PKCS8EncodedKeySpec;	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r3.<init>(r5);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r5 = r1.generatePrivate(r3);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r1 = new java.security.KeyPair;	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        r1.<init>(r0, r5);	 Catch:{ InvalidKeySpecException -> 0x0048, InvalidKeySpecException -> 0x0048 }
        monitor-exit(r4);
        return r1;
    L_0x0048:
        r5 = move-exception;
        r0 = "InstanceID/Store";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007b }
        r1 = 19;
        r3 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007b }
        r3 = r3.length();	 Catch:{ all -> 0x007b }
        r1 = r1 + r3;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007b }
        r3.<init>(r1);	 Catch:{ all -> 0x007b }
        r1 = "Invalid key stored ";
        r3.append(r1);	 Catch:{ all -> 0x007b }
        r3.append(r5);	 Catch:{ all -> 0x007b }
        r5 = r3.toString();	 Catch:{ all -> 0x007b }
        android.util.Log.w(r0, r5);	 Catch:{ all -> 0x007b }
        r5 = r4.f6961b;	 Catch:{ all -> 0x007b }
        r5 = com.google.firebase.iid.C2078n.m5667a(r5);	 Catch:{ all -> 0x007b }
        r5.m5674d();	 Catch:{ all -> 0x007b }
        monitor-exit(r4);
        return r2;
    L_0x0079:
        monitor-exit(r4);
        return r2;
    L_0x007b:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.c.d(java.lang.String):java.security.KeyPair");
    }
}
