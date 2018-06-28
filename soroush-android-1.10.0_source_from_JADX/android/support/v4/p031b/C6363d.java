package android.support.v4.p031b;

class C6363d extends C4804g {
    C6363d() {
    }

    private static java.io.File m14980a(android.os.ParcelFileDescriptor r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ ErrnoException -> 0x0029 }
        r2 = "/proc/self/fd/";	 Catch:{ ErrnoException -> 0x0029 }
        r1.<init>(r2);	 Catch:{ ErrnoException -> 0x0029 }
        r3 = r3.getFd();	 Catch:{ ErrnoException -> 0x0029 }
        r1.append(r3);	 Catch:{ ErrnoException -> 0x0029 }
        r3 = r1.toString();	 Catch:{ ErrnoException -> 0x0029 }
        r3 = android.system.Os.readlink(r3);	 Catch:{ ErrnoException -> 0x0029 }
        r1 = android.system.Os.stat(r3);	 Catch:{ ErrnoException -> 0x0029 }
        r1 = r1.st_mode;	 Catch:{ ErrnoException -> 0x0029 }
        r1 = android.system.OsConstants.S_ISREG(r1);	 Catch:{ ErrnoException -> 0x0029 }
        if (r1 == 0) goto L_0x0029;	 Catch:{ ErrnoException -> 0x0029 }
    L_0x0023:
        r1 = new java.io.File;	 Catch:{ ErrnoException -> 0x0029 }
        r1.<init>(r3);	 Catch:{ ErrnoException -> 0x0029 }
        return r1;
    L_0x0029:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.d.a(android.os.ParcelFileDescriptor):java.io.File");
    }

    public android.graphics.Typeface mo293a(android.content.Context r4, android.support.v4.p036e.C0449b.C0448b[] r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = r5.length;
        if (r1 > 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r5 = r3.m9172a(r5, r6);
        r6 = r4.getContentResolver();
        r5 = r5.f1560a;	 Catch:{ IOException -> 0x0074 }
        r1 = "r";	 Catch:{ IOException -> 0x0074 }
        r5 = r6.openFileDescriptor(r5, r1, r0);	 Catch:{ IOException -> 0x0074 }
        r6 = android.support.v4.p031b.C6363d.m14980a(r5);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r6 == 0) goto L_0x002c;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x001b:
        r1 = r6.canRead();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r1 != 0) goto L_0x0022;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x0021:
        goto L_0x002c;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x0022:
        r4 = android.graphics.Typeface.createFromFile(r6);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r5 == 0) goto L_0x002b;
    L_0x0028:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x002b:
        return r4;
    L_0x002c:
        r6 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r1 = r5.getFileDescriptor();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r6.<init>(r1);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        r4 = android.support.v4.p031b.C4804g.m9167a(r4, r6);	 Catch:{ Throwable -> 0x0045, all -> 0x0042 }
        r6.close();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        if (r5 == 0) goto L_0x0041;
    L_0x003e:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0041:
        return r4;
    L_0x0042:
        r4 = move-exception;
        r1 = r0;
        goto L_0x004b;
    L_0x0045:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0047 }
    L_0x0047:
        r1 = move-exception;
        r2 = r1;
        r1 = r4;
        r4 = r2;
    L_0x004b:
        if (r1 == 0) goto L_0x0056;
    L_0x004d:
        r6.close();	 Catch:{ Throwable -> 0x0051, all -> 0x005a }
        goto L_0x0059;
    L_0x0051:
        r6 = move-exception;
        r1.addSuppressed(r6);	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
        goto L_0x0059;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x0056:
        r6.close();	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x0059:
        throw r4;	 Catch:{ Throwable -> 0x005d, all -> 0x005a }
    L_0x005a:
        r4 = move-exception;
        r6 = r0;
        goto L_0x0063;
    L_0x005d:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r6 = move-exception;
        r2 = r6;
        r6 = r4;
        r4 = r2;
    L_0x0063:
        if (r5 == 0) goto L_0x0073;
    L_0x0065:
        if (r6 == 0) goto L_0x0070;
    L_0x0067:
        r5.close();	 Catch:{ Throwable -> 0x006b }
        goto L_0x0073;
    L_0x006b:
        r5 = move-exception;
        r6.addSuppressed(r5);	 Catch:{ IOException -> 0x0074 }
        goto L_0x0073;	 Catch:{ IOException -> 0x0074 }
    L_0x0070:
        r5.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0073:
        throw r4;	 Catch:{ IOException -> 0x0074 }
    L_0x0074:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.d.a(android.content.Context, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }
}
