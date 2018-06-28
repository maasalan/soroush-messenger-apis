package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;
import org.jivesoftware.smack.util.StringUtils;

public final class C6581n extends C5506v {
    private static boolean f18342a;
    private Info f18343b;
    private final ca f18344c;
    private String f18345d;
    private boolean f18346e = false;
    private final Object f18347g = new Object();

    C6581n(C1827x c1827x) {
        super(c1827x);
        this.f18344c = new ca(c1827x.f6285c);
    }

    private static String m16720a(String str) {
        if (ce.m4656d(StringUtils.MD5) == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, ce.m4656d(StringUtils.MD5).digest(str.getBytes()))});
    }

    private final boolean m16721a(Info info, Info info2) {
        Object obj = null;
        CharSequence id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        Object b = this.f6279f.m5166g().m15980b();
        synchronized (this.f18347g) {
            String valueOf;
            String valueOf2;
            if (!this.f18346e) {
                this.f18345d = m16724f();
                this.f18346e = true;
            } else if (TextUtils.isEmpty(this.f18345d)) {
                if (info != null) {
                    obj = info.getId();
                }
                if (obj == null) {
                    valueOf = String.valueOf(id);
                    String valueOf3 = String.valueOf(b);
                    boolean g = m16725g(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
                    return g;
                }
                valueOf = String.valueOf(obj);
                valueOf2 = String.valueOf(b);
                this.f18345d = C6581n.m16720a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            valueOf = String.valueOf(id);
            valueOf2 = String.valueOf(b);
            Object a = C6581n.m16720a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            if (TextUtils.isEmpty(a)) {
                return false;
            } else if (a.equals(this.f18345d)) {
                return true;
            } else {
                if (!TextUtils.isEmpty(this.f18345d)) {
                    m5143b("Resetting the client id because Advertising Id changed.");
                    b = this.f6279f.m5166g().m15981c();
                    m5140a("New client Id", b);
                }
                valueOf = String.valueOf(id);
                valueOf3 = String.valueOf(b);
                g = m16725g(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
                return g;
            }
        }
    }

    private final synchronized Info m16722d() {
        if (this.f18344c.m4642a(1000)) {
            this.f18344c.m4641a();
            Info e = m16723e();
            if (!m16721a(this.f18343b, e)) {
                m5155f("Failed to reset client id on adid change. Not using adid");
                e = new Info("", false);
            }
            this.f18343b = e;
        }
        return this.f18343b;
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info m16723e() {
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
        r2 = this;
        r0 = r2.f6279f;	 Catch:{ IllegalStateException -> 0x0017, Throwable -> 0x0009 }
        r0 = r0.f6283a;	 Catch:{ IllegalStateException -> 0x0017, Throwable -> 0x0009 }
        r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0);	 Catch:{ IllegalStateException -> 0x0017, Throwable -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = move-exception;
        r1 = f18342a;
        if (r1 != 0) goto L_0x001c;
    L_0x000e:
        r1 = 1;
        f18342a = r1;
        r1 = "Error getting advertiser id";
        r2.m5151d(r1, r0);
        goto L_0x001c;
    L_0x0017:
        r0 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.";
        r2.m5153e(r0);
    L_0x001c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.n.e():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private final java.lang.String m16724f() {
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
        r0 = 0;
        r1 = r6.f6279f;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1 = r1.f6283a;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r2 = "gaClientIdData";	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1 = r1.openFileInput(r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r3 = new byte[r2];	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r4 = 0;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r2 = r1.read(r3, r4, r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r5 = r1.available();	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        if (r5 <= 0) goto L_0x002c;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
    L_0x001a:
        r2 = "Hash file seems corrupted, deleting it.";	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r6.m5153e(r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1.close();	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1 = r6.f6279f;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1 = r1.f6283a;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r2 = "gaClientIdData";	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1.deleteFile(r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        return r0;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
    L_0x002c:
        if (r2 > 0) goto L_0x0037;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
    L_0x002e:
        r2 = "Hash file is empty.";	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r6.m5143b(r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1.close();	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        return r0;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
    L_0x0037:
        r5 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r5.<init>(r3, r4, r2);	 Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0044 }
        r1.close();	 Catch:{ FileNotFoundException -> 0x003f, IOException -> 0x0041 }
    L_0x003f:
        r0 = r5;
        return r0;
    L_0x0041:
        r1 = move-exception;
        r0 = r5;
        goto L_0x0045;
    L_0x0044:
        r1 = move-exception;
    L_0x0045:
        r2 = "Error reading Hash file, deleting it";
        r6.m5151d(r2, r1);
        r1 = r6.f6279f;
        r1 = r1.f6283a;
        r2 = "gaClientIdData";
        r1.deleteFile(r2);
    L_0x0053:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.n.f():java.lang.String");
    }

    private final boolean m16725g(String str) {
        try {
            str = C6581n.m16720a(str);
            m5143b("Storing hashed adid.");
            FileOutputStream openFileOutput = this.f6279f.f6283a.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
            this.f18345d = str;
            return true;
        } catch (IOException e) {
            m5154e("Error creating hash file", e);
            return false;
        }
    }

    public final boolean m16726b() {
        m12037k();
        Info d = m16722d();
        return (d == null || d.isLimitAdTrackingEnabled()) ? false : true;
    }

    public final String m16727c() {
        m12037k();
        Info d = m16722d();
        Object id = d != null ? d.getId() : null;
        return TextUtils.isEmpty(id) ? null : id;
    }

    protected final void c_() {
    }
}
