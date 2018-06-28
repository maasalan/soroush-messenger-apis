package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ac;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class ap extends C5506v {
    private volatile String f18088a;
    private Future<String> f18089b;

    protected ap(C1827x c1827x) {
        super(c1827x);
    }

    private final boolean m15978a(Context context, String str) {
        Object e;
        Throwable th;
        ac.m4378a(str);
        ac.m4387c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            m5140a("Storing clientId", str);
            FileOutputStream openFileOutput = context.openFileOutput("gaClientId", 0);
            try {
                openFileOutput.write(str.getBytes());
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e2) {
                        m5154e("Failed to close clientId writing stream", e2);
                    }
                }
                return true;
            } catch (FileNotFoundException e3) {
                e = e3;
                fileOutputStream = openFileOutput;
                m5154e("Error creating clientId file", e);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e22) {
                        m5154e("Failed to close clientId writing stream", e22);
                        return false;
                    }
                }
                return false;
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = openFileOutput;
                try {
                    m5154e("Error writing to clientId file", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException e222) {
                            m5154e("Failed to close clientId writing stream", e222);
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2222) {
                            m5154e("Failed to close clientId writing stream", e2222);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = openFileOutput;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            m5154e("Error creating clientId file", e);
            if (fileOutputStream != null) {
                fileOutputStream.close();
                return false;
            }
            return false;
        } catch (IOException e6) {
            e = e6;
            m5154e("Error writing to clientId file", e);
            if (fileOutputStream != null) {
                fileOutputStream.close();
                return false;
            }
            return false;
        }
    }

    final java.lang.String m15979a(android.content.Context r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = "ClientId should be loaded from worker thread";
        com.google.android.gms.common.internal.ac.m4387c(r0);
        r0 = 0;
        r1 = "gaClientId";	 Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0072, all -> 0x006f }
        r1 = r7.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0072, all -> 0x006f }
        r2 = 36;
        r3 = new byte[r2];	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r4 = 0;	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r2 = r1.read(r3, r4, r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r5 = r1.available();	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        if (r5 <= 0) goto L_0x0035;	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
    L_0x001b:
        r2 = "clientId file seems corrupted, deleting it.";	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r6.m5153e(r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r1.close();	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r2 = "gaClientId";	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r7.deleteFile(r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        if (r1 == 0) goto L_0x0034;
    L_0x002a:
        r1.close();	 Catch:{ IOException -> 0x002e }
        return r0;
    L_0x002e:
        r7 = move-exception;
        r1 = "Failed to close client id reading stream";
        r6.m5154e(r1, r7);
    L_0x0034:
        return r0;
    L_0x0035:
        r5 = 14;
        if (r2 >= r5) goto L_0x0053;
    L_0x0039:
        r2 = "clientId file is empty, deleting it.";	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r6.m5153e(r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r1.close();	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r2 = "gaClientId";	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r7.deleteFile(r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        if (r1 == 0) goto L_0x0052;
    L_0x0048:
        r1.close();	 Catch:{ IOException -> 0x004c }
        return r0;
    L_0x004c:
        r7 = move-exception;
        r1 = "Failed to close client id reading stream";
        r6.m5154e(r1, r7);
    L_0x0052:
        return r0;
    L_0x0053:
        r1.close();	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r5 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r5.<init>(r3, r4, r2);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r2 = "Read client id from disk";	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        r6.m5140a(r2, r5);	 Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
        if (r1 == 0) goto L_0x006c;
    L_0x0062:
        r1.close();	 Catch:{ IOException -> 0x0066 }
        return r5;
    L_0x0066:
        r7 = move-exception;
        r0 = "Failed to close client id reading stream";
        r6.m5154e(r0, r7);
    L_0x006c:
        return r5;
    L_0x006d:
        r2 = move-exception;
        goto L_0x0074;
    L_0x006f:
        r7 = move-exception;
        r1 = r0;
        goto L_0x008c;
    L_0x0072:
        r2 = move-exception;
        r1 = r0;
    L_0x0074:
        r3 = "Error reading client id file, deleting it";	 Catch:{ all -> 0x008b }
        r6.m5154e(r3, r2);	 Catch:{ all -> 0x008b }
        r2 = "gaClientId";	 Catch:{ all -> 0x008b }
        r7.deleteFile(r2);	 Catch:{ all -> 0x008b }
        if (r1 == 0) goto L_0x008a;
    L_0x0080:
        r1.close();	 Catch:{ IOException -> 0x0084 }
        return r0;
    L_0x0084:
        r7 = move-exception;
        r1 = "Failed to close client id reading stream";
        r6.m5154e(r1, r7);
    L_0x008a:
        return r0;
    L_0x008b:
        r7 = move-exception;
    L_0x008c:
        if (r1 == 0) goto L_0x0098;
    L_0x008e:
        r1.close();	 Catch:{ IOException -> 0x0092 }
        goto L_0x0098;
    L_0x0092:
        r0 = move-exception;
        r1 = "Failed to close client id reading stream";
        r6.m5154e(r1, r0);
    L_0x0098:
        throw r7;
    L_0x0099:
        r1 = r0;
    L_0x009a:
        if (r1 == 0) goto L_0x00a6;
    L_0x009c:
        r1.close();	 Catch:{ IOException -> 0x00a0 }
        return r0;
    L_0x00a0:
        r7 = move-exception;
        r1 = "Failed to close client id reading stream";
        r6.m5154e(r1, r7);
    L_0x00a6:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ap.a(android.content.Context):java.lang.String");
    }

    public final String m15980b() {
        String str;
        m12037k();
        synchronized (this) {
            if (this.f18088a == null) {
                this.f18089b = this.f6279f.m5161b().m4277a(new aq(this));
            }
            if (this.f18089b != null) {
                try {
                    this.f18088a = (String) this.f18089b.get();
                } catch (InterruptedException e) {
                    m5151d("ClientId loading or generation was interrupted", e);
                    str = "0";
                    this.f18088a = str;
                    if (this.f18088a == null) {
                        this.f18088a = "0";
                    }
                    m5140a("Loaded clientId", this.f18088a);
                    this.f18089b = null;
                    str = this.f18088a;
                    return str;
                } catch (ExecutionException e2) {
                    m5154e("Failed to load or generate client id", e2);
                    str = "0";
                    this.f18088a = str;
                    if (this.f18088a == null) {
                        this.f18088a = "0";
                    }
                    m5140a("Loaded clientId", this.f18088a);
                    this.f18089b = null;
                    str = this.f18088a;
                    return str;
                }
                if (this.f18088a == null) {
                    this.f18088a = "0";
                }
                m5140a("Loaded clientId", this.f18088a);
                this.f18089b = null;
            }
            str = this.f18088a;
        }
        return str;
    }

    final String m15981c() {
        synchronized (this) {
            this.f18088a = null;
            this.f18089b = this.f6279f.m5161b().m4277a(new ar(this));
        }
        return m15980b();
    }

    protected final void c_() {
    }

    final String m15982d() {
        String toLowerCase = UUID.randomUUID().toString().toLowerCase();
        try {
            if (!m15978a(this.f6279f.m5161b().f5164a, toLowerCase)) {
                toLowerCase = "0";
            }
            return toLowerCase;
        } catch (Exception e) {
            m5154e("Error saving clientId file", e);
            return "0";
        }
    }
}
