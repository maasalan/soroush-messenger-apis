package com.google.android.gms.common.util;

public final class C1796p {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File m4539a(java.io.File r4) {
        /*
        r0 = com.google.android.gms.common.util.C1796p.class;
        monitor-enter(r0);
        r1 = r4.exists();	 Catch:{ all -> 0x003b }
        if (r1 != 0) goto L_0x0039;
    L_0x0009:
        r1 = r4.mkdirs();	 Catch:{ all -> 0x003b }
        if (r1 != 0) goto L_0x0039;
    L_0x000f:
        r1 = r4.exists();	 Catch:{ all -> 0x003b }
        if (r1 == 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r0);
        return r4;
    L_0x0017:
        r1 = "SupportV4Utils";
        r2 = "Unable to create no-backup dir ";
        r4 = r4.getPath();	 Catch:{ all -> 0x003b }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x003b }
        r3 = r4.length();	 Catch:{ all -> 0x003b }
        if (r3 == 0) goto L_0x002e;
    L_0x0029:
        r4 = r2.concat(r4);	 Catch:{ all -> 0x003b }
        goto L_0x0033;
    L_0x002e:
        r4 = new java.lang.String;	 Catch:{ all -> 0x003b }
        r4.<init>(r2);	 Catch:{ all -> 0x003b }
    L_0x0033:
        android.util.Log.w(r1, r4);	 Catch:{ all -> 0x003b }
        r4 = 0;
        monitor-exit(r0);
        return r4;
    L_0x0039:
        monitor-exit(r0);
        return r4;
    L_0x003b:
        r4 = move-exception;
        monitor-exit(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.p.a(java.io.File):java.io.File");
    }
}