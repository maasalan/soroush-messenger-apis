package com.p085c.p086a.p089c.p097c;

import com.p085c.p086a.p089c.C1203d;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import java.io.File;
import java.io.InputStream;

public final class C5204s implements C1203d<InputStream> {
    private final C1104b f14532a;

    public C5204s(C1104b c1104b) {
        this.f14532a = c1104b;
    }

    private boolean m10746a(java.io.InputStream r5, java.io.File r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f14532a;
        r1 = byte[].class;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.mo1130a(r2, r1);
        r0 = (byte[]) r0;
        r1 = 0;
        r2 = 0;
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x002e }
        r3.<init>(r6);	 Catch:{ IOException -> 0x002e }
    L_0x0013:
        r6 = r5.read(r0);	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        r2 = -1;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        if (r6 == r2) goto L_0x001e;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
    L_0x001a:
        r3.write(r0, r1, r6);	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        goto L_0x0013;	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
    L_0x001e:
        r3.close();	 Catch:{ IOException -> 0x0029, all -> 0x0026 }
        r1 = 1;
        r3.close();	 Catch:{ IOException -> 0x0044 }
        goto L_0x0044;
    L_0x0026:
        r5 = move-exception;
        r2 = r3;
        goto L_0x004c;
    L_0x0029:
        r5 = move-exception;
        r2 = r3;
        goto L_0x002f;
    L_0x002c:
        r5 = move-exception;
        goto L_0x004c;
    L_0x002e:
        r5 = move-exception;
    L_0x002f:
        r6 = "StreamEncoder";	 Catch:{ all -> 0x002c }
        r3 = 3;	 Catch:{ all -> 0x002c }
        r6 = android.util.Log.isLoggable(r6, r3);	 Catch:{ all -> 0x002c }
        if (r6 == 0) goto L_0x003f;	 Catch:{ all -> 0x002c }
    L_0x0038:
        r6 = "StreamEncoder";	 Catch:{ all -> 0x002c }
        r3 = "Failed to encode data onto the OutputStream";	 Catch:{ all -> 0x002c }
        android.util.Log.d(r6, r3, r5);	 Catch:{ all -> 0x002c }
    L_0x003f:
        if (r2 == 0) goto L_0x0044;
    L_0x0041:
        r2.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        r5 = r4.f14532a;
        r6 = byte[].class;
        r5.mo1133a(r0, r6);
        return r1;
    L_0x004c:
        if (r2 == 0) goto L_0x0051;
    L_0x004e:
        r2.close();	 Catch:{ IOException -> 0x0051 }
    L_0x0051:
        r6 = r4.f14532a;
        r1 = byte[].class;
        r6.mo1133a(r0, r1);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.c.s.a(java.io.InputStream, java.io.File):boolean");
    }

    public final /* bridge */ /* synthetic */ boolean mo1189a(Object obj, File file, C5253j c5253j) {
        return m10746a((InputStream) obj, file);
    }
}
