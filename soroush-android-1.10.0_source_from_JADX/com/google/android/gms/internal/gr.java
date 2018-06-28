package com.google.android.gms.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C1730t;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.common.util.C5476f;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public class gr {
    private static volatile gr f5851m;
    private final eu f5852A;
    private final eo f5853B;
    private boolean f5854C = false;
    private boolean f5855D;
    private Boolean f5856E;
    private long f5857F;
    private FileLock f5858G;
    private FileChannel f5859H;
    private List<Long> f5860I;
    private int f5861J;
    private long f5862K;
    private long f5863L;
    private boolean f5864M;
    private boolean f5865N;
    private boolean f5866O;
    final Context f5867a;
    final ew f5868b;
    final ft f5869c;
    final gm f5870d;
    final jk f5871e;
    public final AppMeasurement f5872f;
    public final FirebaseAnalytics f5873g;
    final fp f5874h;
    final C1785d f5875i;
    List<Runnable> f5876j;
    int f5877k;
    final long f5878l;
    private final gd f5879n;
    private final gl f5880o;
    private final ju f5881p;
    private final fr f5882q;
    private final ex f5883r;
    private final fx f5884s;
    private final ih f5885t;
    private final il f5886u;
    private final fd f5887v;
    private final hs f5888w;
    private final fo f5889x;
    private final gb f5890y;
    private final jq f5891z;

    class C5499a implements ez {
        ki f15235a;
        List<Long> f15236b;
        List<kf> f15237c;
        private long f15238d;
        private /* synthetic */ gr f15239e;

        private C5499a(gr grVar) {
            this.f15239e = grVar;
        }

        private static long m11968a(kf kfVar) {
            return ((kfVar.f18272c.longValue() / 1000) / 60) / 60;
        }

        public final void mo1645a(ki kiVar) {
            ac.m4376a((Object) kiVar);
            this.f15235a = kiVar;
        }

        public final boolean mo1646a(long j, kf kfVar) {
            ac.m4376a((Object) kfVar);
            if (this.f15237c == null) {
                this.f15237c = new ArrayList();
            }
            if (this.f15236b == null) {
                this.f15236b = new ArrayList();
            }
            if (this.f15237c.size() > 0 && C5499a.m11968a((kf) this.f15237c.get(0)) != C5499a.m11968a(kfVar)) {
                return false;
            }
            long f = this.f15238d + ((long) kfVar.m5129f());
            if (f >= ((long) Math.max(0, ((Integer) fj.f5770k.f5786a).intValue()))) {
                return false;
            }
            this.f15238d = f;
            this.f15237c.add(kfVar);
            this.f15236b.add(Long.valueOf(j));
            return this.f15237c.size() < Math.max(1, ((Integer) fj.f5771l.f5786a).intValue());
        }
    }

    private gr(hr hrVar) {
        fv fvVar;
        String str;
        ac.m4376a((Object) hrVar);
        this.f5867a = hrVar.f5950a;
        this.f5862K = -1;
        this.f5875i = C5476f.m11826d();
        this.f5878l = this.f5875i.mo1575a();
        this.f5868b = new ew(this);
        hq gdVar = new gd(this);
        gdVar.m11976M();
        this.f5879n = gdVar;
        gdVar = new ft(this);
        gdVar.m11976M();
        this.f5869c = gdVar;
        gdVar = new ju(this);
        gdVar.m11976M();
        this.f5881p = gdVar;
        gdVar = new fr(this);
        gdVar.m11976M();
        this.f5882q = gdVar;
        gdVar = new fd(this);
        gdVar.m11976M();
        this.f5887v = gdVar;
        gdVar = new fo(this);
        gdVar.m11976M();
        this.f5889x = gdVar;
        gdVar = new ex(this);
        gdVar.m11976M();
        this.f5883r = gdVar;
        gdVar = new fp(this);
        gdVar.m11976M();
        this.f5874h = gdVar;
        gdVar = new eu(this);
        gdVar.m11976M();
        this.f5852A = gdVar;
        this.f5853B = new eo(this);
        gdVar = new fx(this);
        gdVar.m11976M();
        this.f5884s = gdVar;
        gdVar = new ih(this);
        gdVar.m11976M();
        this.f5885t = gdVar;
        gdVar = new il(this);
        gdVar.m11976M();
        this.f5886u = gdVar;
        gdVar = new hs(this);
        gdVar.m11976M();
        this.f5888w = gdVar;
        gdVar = new jq(this);
        gdVar.m11976M();
        this.f5891z = gdVar;
        this.f5890y = new gb(this);
        this.f5872f = new AppMeasurement(this);
        this.f5873g = new FirebaseAnalytics(this);
        gdVar = new jk(this);
        gdVar.m11976M();
        this.f5871e = gdVar;
        gdVar = new gl(this);
        gdVar.m11976M();
        this.f5880o = gdVar;
        gdVar = new gm(this);
        gdVar.m11976M();
        this.f5870d = gdVar;
        if (this.f5867a.getApplicationContext() instanceof Application) {
            hp h = m4909h();
            if (h.mo1615l().getApplicationContext() instanceof Application) {
                Application application = (Application) h.mo1615l().getApplicationContext();
                if (h.f18190a == null) {
                    h.f18190a = new ig(h);
                }
                application.unregisterActivityLifecycleCallbacks(h.f18190a);
                application.registerActivityLifecycleCallbacks(h.f18190a);
                fvVar = h.mo1623t().f18140g;
                str = "Registered activity lifecycle callback";
            }
            this.f5870d.m16336a(new gs(this));
        }
        fvVar = m4906e().f18136c;
        str = "Application context is not an Application";
        fvVar.m4846a(str);
        this.f5870d.m16336a(new gs(this));
    }

    private final boolean m4865A() {
        Object e;
        fv fvVar;
        String str;
        m4907f().mo1606c();
        try {
            this.f5859H = new RandomAccessFile(new File(this.f5867a.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f5858G = this.f5859H.tryLock();
            if (this.f5858G != null) {
                m4906e().f18140g.m4846a("Storage concurrent access okay");
                return true;
            }
            m4906e().f18134a.m4846a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            e = e2;
            fvVar = m4906e().f18134a;
            str = "Failed to acquire storage lock";
            fvVar.m4847a(str, e);
            return false;
        } catch (IOException e3) {
            e = e3;
            fvVar = m4906e().f18134a;
            str = "Failed to access storage lock file";
            fvVar.m4847a(str, e);
            return false;
        }
    }

    private final long m4866B() {
        long a = this.f5875i.mo1575a();
        hp d = m4905d();
        d.m11975L();
        d.mo1606c();
        long a2 = d.f18152g.m4854a();
        if (a2 == 0) {
            long nextInt = 1 + ((long) d.mo1619p().m16641z().nextInt(86400000));
            d.f18152g.m4855a(nextInt);
            a2 = nextInt;
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    private final boolean m4867C() {
        m4907f().mo1606c();
        m4888a();
        return ((m4912k().m16062a("select count(1) > 0 from raw_events", null) > 0 ? 1 : (m4912k().m16062a("select count(1) > 0 from raw_events", null) == 0 ? 0 : -1)) != 0) || !TextUtils.isEmpty(m4912k().m16058B());
    }

    private final boolean m4868D() {
        m4907f().mo1606c();
        m4888a();
        return this.f5855D;
    }

    private final void m4869E() {
        m4907f().mo1606c();
        if (!(this.f5864M || this.f5865N)) {
            if (!this.f5866O) {
                m4906e().f18140g.m4846a("Stopping uploading service(s)");
                if (this.f5876j != null) {
                    for (Runnable run : this.f5876j) {
                        run.run();
                    }
                    this.f5876j.clear();
                    return;
                }
                return;
            }
        }
        m4906e().f18140g.m4849a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f5864M), Boolean.valueOf(this.f5865N), Boolean.valueOf(this.f5866O));
    }

    private final int m4870a(FileChannel fileChannel) {
        m4907f().mo1606c();
        if (fileChannel != null) {
            if (fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0);
                    int read = fileChannel.read(allocate);
                    if (read != 4) {
                        if (read != -1) {
                            m4906e().f18136c.m4847a("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                        return 0;
                    }
                    allocate.flip();
                    return allocate.getInt();
                } catch (IOException e) {
                    m4906e().f18134a.m4847a("Failed to read from channel", e);
                    return 0;
                }
            }
        }
        m4906e().f18134a.m4846a("Bad chanel to read from");
        return 0;
    }

    public static gr m4871a(Context context) {
        ac.m4376a((Object) context);
        ac.m4376a(context.getApplicationContext());
        if (f5851m == null) {
            synchronized (gr.class) {
                if (f5851m == null) {
                    f5851m = new gr(new hr(context));
                }
            }
        }
        return f5851m;
    }

    private final com.google.android.gms.internal.zzcff m4872a(android.content.Context r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27) {
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
        r22 = this;
        r1 = r24;
        r0 = "Unknown";
        r2 = "Unknown";
        r3 = "Unknown";
        r4 = r23.getPackageManager();
        r5 = 0;
        if (r4 != 0) goto L_0x001b;
    L_0x000f:
        r0 = r22.m4906e();
        r0 = r0.f18134a;
        r1 = "PackageManager is null, can not log app install information";
        r0.m4846a(r1);
        return r5;
    L_0x001b:
        r4 = r4.getInstallerPackageName(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
        r0 = r4;
        goto L_0x0030;
    L_0x0021:
        r4 = r22.m4906e();
        r4 = r4.f18134a;
        r6 = "Error retrieving installer package name. appId";
        r7 = com.google.android.gms.internal.ft.m16220a(r24);
        r4.m4847a(r6, r7);
    L_0x0030:
        if (r0 != 0) goto L_0x0036;
    L_0x0032:
        r0 = "manual_install";
    L_0x0034:
        r6 = r0;
        goto L_0x0041;
    L_0x0036:
        r4 = "com.android.vending";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0034;
    L_0x003e:
        r0 = "";
        goto L_0x0034;
    L_0x0041:
        r0 = com.google.android.gms.internal.dz.m4762a(r23);	 Catch:{ NameNotFoundException -> 0x008c }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x008c }
        r0 = r0.m4760b(r1, r4);	 Catch:{ NameNotFoundException -> 0x008c }
        if (r0 == 0) goto L_0x0064;	 Catch:{ NameNotFoundException -> 0x008c }
    L_0x004c:
        r2 = com.google.android.gms.internal.dz.m4762a(r23);	 Catch:{ NameNotFoundException -> 0x008c }
        r2 = r2.m4761b(r1);	 Catch:{ NameNotFoundException -> 0x008c }
        r4 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NameNotFoundException -> 0x008c }
        if (r4 != 0) goto L_0x005f;	 Catch:{ NameNotFoundException -> 0x008c }
    L_0x005a:
        r2 = r2.toString();	 Catch:{ NameNotFoundException -> 0x008c }
        r3 = r2;	 Catch:{ NameNotFoundException -> 0x008c }
    L_0x005f:
        r2 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x008c }
        r0 = r0.versionCode;	 Catch:{ NameNotFoundException -> 0x008c }
        goto L_0x0066;
    L_0x0064:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0066:
        r3 = r2;
        r21 = new com.google.android.gms.internal.zzcff;
        r4 = (long) r0;
        r7 = 11720; // 0x2dc8 float:1.6423E-41 double:5.7904E-320;
        r0 = r22.m4910i();
        r2 = r23;
        r9 = r0.m16608b(r2, r1);
        r11 = 0;
        r13 = 0;
        r14 = "";
        r15 = 0;
        r17 = 0;
        r19 = 0;
        r0 = r21;
        r2 = r25;
        r12 = r26;
        r20 = r27;
        r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14, r15, r17, r19, r20);
        return r21;
    L_0x008c:
        r0 = r22.m4906e();
        r0 = r0.f18134a;
        r2 = "Error retrieving newly installed package info. appId, appName";
        r1 = com.google.android.gms.internal.ft.m16220a(r24);
        r0.m4848a(r2, r1, r3);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.a(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):com.google.android.gms.internal.zzcff");
    }

    private final void m4873a(com.google.android.gms.internal.es r11) {
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
        r10 = this;
        r0 = r10.m4907f();
        r0.mo1606c();
        r0 = r11.m4780c();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0011:
        r2 = r11.m4772a();
        r3 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r1 = r10;
        r1.m4896a(r2, r3, r4, r5, r6);
        return;
    L_0x001f:
        r0 = r11.m4780c();
        r1 = r11.m4776b();
        r2 = new android.net.Uri$Builder;
        r2.<init>();
        r3 = com.google.android.gms.internal.fj.f5766g;
        r3 = r3.f5786a;
        r3 = (java.lang.String) r3;
        r3 = r2.scheme(r3);
        r4 = com.google.android.gms.internal.fj.f5767h;
        r4 = r4.f5786a;
        r4 = (java.lang.String) r4;
        r3 = r3.encodedAuthority(r4);
        r4 = "config/app/";
        r0 = java.lang.String.valueOf(r0);
        r5 = r0.length();
        if (r5 == 0) goto L_0x0051;
    L_0x004c:
        r0 = r4.concat(r0);
        goto L_0x0056;
    L_0x0051:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0056:
        r0 = r3.path(r0);
        r3 = "app_instance_id";
        r0 = r0.appendQueryParameter(r3, r1);
        r1 = "platform";
        r3 = "android";
        r0 = r0.appendQueryParameter(r1, r3);
        r1 = "gmp_version";
        r3 = "11720";
        r0.appendQueryParameter(r1, r3);
        r0 = r2.build();
        r0 = r0.toString();
        r4 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x00eb }
        r4.<init>(r0);	 Catch:{ MalformedURLException -> 0x00eb }
        r1 = r10.m4906e();	 Catch:{ MalformedURLException -> 0x00eb }
        r1 = r1.f18140g;	 Catch:{ MalformedURLException -> 0x00eb }
        r2 = "Fetching remote configuration";	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = r11.m4772a();	 Catch:{ MalformedURLException -> 0x00eb }
        r1.m4847a(r2, r3);	 Catch:{ MalformedURLException -> 0x00eb }
        r1 = r10.m4908g();	 Catch:{ MalformedURLException -> 0x00eb }
        r2 = r11.m4772a();	 Catch:{ MalformedURLException -> 0x00eb }
        r1 = r1.m16294a(r2);	 Catch:{ MalformedURLException -> 0x00eb }
        r2 = 0;	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = r10.m4908g();	 Catch:{ MalformedURLException -> 0x00eb }
        r5 = r11.m4772a();	 Catch:{ MalformedURLException -> 0x00eb }
        r3.mo1606c();	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = r3.f18171b;	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = r3.get(r5);	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = (java.lang.String) r3;	 Catch:{ MalformedURLException -> 0x00eb }
        if (r1 == 0) goto L_0x00bf;	 Catch:{ MalformedURLException -> 0x00eb }
    L_0x00ad:
        r1 = android.text.TextUtils.isEmpty(r3);	 Catch:{ MalformedURLException -> 0x00eb }
        if (r1 != 0) goto L_0x00bf;	 Catch:{ MalformedURLException -> 0x00eb }
    L_0x00b3:
        r1 = new android.support.v4.g.a;	 Catch:{ MalformedURLException -> 0x00eb }
        r1.<init>();	 Catch:{ MalformedURLException -> 0x00eb }
        r2 = "If-Modified-Since";	 Catch:{ MalformedURLException -> 0x00eb }
        r1.put(r2, r3);	 Catch:{ MalformedURLException -> 0x00eb }
        r6 = r1;	 Catch:{ MalformedURLException -> 0x00eb }
        goto L_0x00c0;	 Catch:{ MalformedURLException -> 0x00eb }
    L_0x00bf:
        r6 = r2;	 Catch:{ MalformedURLException -> 0x00eb }
    L_0x00c0:
        r1 = 1;	 Catch:{ MalformedURLException -> 0x00eb }
        r10.f5864M = r1;	 Catch:{ MalformedURLException -> 0x00eb }
        r2 = r10.m4913l();	 Catch:{ MalformedURLException -> 0x00eb }
        r3 = r11.m4772a();	 Catch:{ MalformedURLException -> 0x00eb }
        r7 = new com.google.android.gms.internal.gv;	 Catch:{ MalformedURLException -> 0x00eb }
        r7.<init>(r10);	 Catch:{ MalformedURLException -> 0x00eb }
        r2.mo1606c();	 Catch:{ MalformedURLException -> 0x00eb }
        r2.m11975L();	 Catch:{ MalformedURLException -> 0x00eb }
        com.google.android.gms.common.internal.ac.m4376a(r4);	 Catch:{ MalformedURLException -> 0x00eb }
        com.google.android.gms.common.internal.ac.m4376a(r7);	 Catch:{ MalformedURLException -> 0x00eb }
        r8 = r2.mo1622s();	 Catch:{ MalformedURLException -> 0x00eb }
        r9 = new com.google.android.gms.internal.ga;	 Catch:{ MalformedURLException -> 0x00eb }
        r5 = 0;	 Catch:{ MalformedURLException -> 0x00eb }
        r1 = r9;	 Catch:{ MalformedURLException -> 0x00eb }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ MalformedURLException -> 0x00eb }
        r8.m16339b(r9);	 Catch:{ MalformedURLException -> 0x00eb }
        return;
    L_0x00eb:
        r1 = r10.m4906e();
        r1 = r1.f18134a;
        r2 = "Failed to parse config URL. Not fetching. appId";
        r11 = r11.m4772a();
        r11 = com.google.android.gms.internal.ft.m16220a(r11);
        r1.m4848a(r2, r11, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.a(com.google.android.gms.internal.es):void");
    }

    static /* synthetic */ void m4874a(gr grVar) {
        fv fvVar;
        grVar.m4907f().mo1606c();
        grVar.f5881p.m11977N();
        grVar.f5879n.m11977N();
        grVar.f5889x.m11977N();
        grVar.m4906e().f18138e.m4847a("App measurement is starting up, version", Long.valueOf(11720));
        grVar.m4906e().f18138e.m4846a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String z = grVar.f5889x.m16150z();
        if (grVar.m4910i().m16623i(z)) {
            fvVar = grVar.m4906e().f18138e;
            z = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            fvVar = grVar.m4906e().f18138e;
            String str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
            z = String.valueOf(z);
            z = z.length() != 0 ? str.concat(z) : new String(str);
        }
        fvVar.m4846a(z);
        grVar.m4906e().f18139f.m4846a("Debug-level message logging enabled");
        if (grVar.f5877k != grVar.f5861J) {
            grVar.m4906e().f18134a.m4848a("Not all components initialized", Integer.valueOf(grVar.f5877k), Integer.valueOf(grVar.f5861J));
        }
        grVar.f5854C = true;
    }

    private static void m4875a(hp hpVar) {
        if (hpVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    static void m4876a(hq hqVar) {
        if (hqVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!hqVar.m11974K()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private final boolean m4877a(int i, FileChannel fileChannel) {
        m4907f().mo1606c();
        if (fileChannel != null) {
            if (fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.putInt(i);
                allocate.flip();
                try {
                    fileChannel.truncate(0);
                    fileChannel.write(allocate);
                    fileChannel.force(true);
                    if (fileChannel.size() != 4) {
                        m4906e().f18134a.m4847a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
                    }
                    return true;
                } catch (IOException e) {
                    m4906e().f18134a.m4847a("Failed to write to channel", e);
                    return false;
                }
            }
        }
        m4906e().f18134a.m4846a("Bad chanel to read from");
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4878a(long r47) {
        /*
        r46 = this;
        r1 = r46;
        r2 = r46.m4912k();
        r2.m16092x();
        r2 = new com.google.android.gms.internal.gr$a;	 Catch:{ all -> 0x09c1 }
        r3 = 0;
        r2.<init>();	 Catch:{ all -> 0x09c1 }
        r4 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r5 = r1.f5862K;	 Catch:{ all -> 0x09c1 }
        com.google.android.gms.common.internal.ac.m4376a(r2);	 Catch:{ all -> 0x09c1 }
        r4.mo1606c();	 Catch:{ all -> 0x09c1 }
        r4.m11975L();	 Catch:{ all -> 0x09c1 }
        r7 = -1;
        r9 = 2;
        r10 = 0;
        r11 = 1;
        r15 = r4.m16057A();	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = android.text.TextUtils.isEmpty(r10);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        if (r12 == 0) goto L_0x00a4;
    L_0x002d:
        r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r12 == 0) goto L_0x004a;
    L_0x0031:
        r12 = new java.lang.String[r9];	 Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
        r13 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
        r12[r3] = r13;	 Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
        r13 = java.lang.String.valueOf(r47);	 Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
        r12[r11] = r13;	 Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
        goto L_0x0052;
    L_0x0040:
        r0 = move-exception;
        r2 = r0;
        r6 = r10;
        goto L_0x09bb;
    L_0x0045:
        r0 = move-exception;
        r5 = r0;
        r6 = r10;
        goto L_0x0266;
    L_0x004a:
        r12 = new java.lang.String[r11];	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r13 = java.lang.String.valueOf(r47);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12[r3] = r13;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
    L_0x0052:
        r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r13 == 0) goto L_0x0059;
    L_0x0056:
        r13 = "rowid <= ? and ";
        goto L_0x005b;
    L_0x0059:
        r13 = "";
    L_0x005b:
        r14 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r10 = java.lang.String.valueOf(r13);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10 = r10.length();	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r14 = r14 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10.<init>(r14);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r14 = "select app_id, metadata_fingerprint from raw_events where ";
        r10.append(r14);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10.append(r13);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r13 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;";
        r10.append(r13);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10 = r10.toString();	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10 = r15.rawQuery(r10, r12);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = r10.moveToFirst();	 Catch:{ SQLiteException -> 0x0259, all -> 0x0040 }
        if (r12 != 0) goto L_0x008d;
    L_0x0086:
        if (r10 == 0) goto L_0x0278;
    L_0x0088:
        r10.close();	 Catch:{ all -> 0x09c1 }
        goto L_0x0278;
    L_0x008d:
        r12 = r10.getString(r3);	 Catch:{ SQLiteException -> 0x0259, all -> 0x0040 }
        r13 = r10.getString(r11);	 Catch:{ SQLiteException -> 0x009e, all -> 0x0040 }
        r10.close();	 Catch:{ SQLiteException -> 0x009e, all -> 0x0040 }
        r22 = r10;
        r10 = r12;
        r21 = r13;
        goto L_0x00fc;
    L_0x009e:
        r0 = move-exception;
        r5 = r0;
        r6 = r10;
        r10 = r12;
        goto L_0x0266;
    L_0x00a4:
        r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r10 == 0) goto L_0x00b4;
    L_0x00a8:
        r10 = new java.lang.String[r9];	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = 0;
        r10[r3] = r12;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10[r11] = r12;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        goto L_0x00b9;
    L_0x00b4:
        r10 = new java.lang.String[r11];	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = 0;
        r10[r3] = r12;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
    L_0x00b9:
        r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r12 == 0) goto L_0x00c0;
    L_0x00bd:
        r12 = " and rowid <= ?";
        goto L_0x00c2;
    L_0x00c0:
        r12 = "";
    L_0x00c2:
        r13 = 84;
        r14 = java.lang.String.valueOf(r12);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r14 = r14.length();	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r13 = r13 + r14;
        r14 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r14.<init>(r13);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r13 = "select metadata_fingerprint from raw_events where app_id = ?";
        r14.append(r13);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r14.append(r12);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = " order by rowid limit 1;";
        r14.append(r12);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = r14.toString();	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r10 = r15.rawQuery(r12, r10);	 Catch:{ SQLiteException -> 0x0262, all -> 0x025d }
        r12 = r10.moveToFirst();	 Catch:{ SQLiteException -> 0x0259, all -> 0x0040 }
        if (r12 != 0) goto L_0x00f0;
    L_0x00ed:
        if (r10 == 0) goto L_0x0278;
    L_0x00ef:
        goto L_0x0088;
    L_0x00f0:
        r13 = r10.getString(r3);	 Catch:{ SQLiteException -> 0x0259, all -> 0x0040 }
        r10.close();	 Catch:{ SQLiteException -> 0x0259, all -> 0x0040 }
        r22 = r10;
        r21 = r13;
        r10 = 0;
    L_0x00fc:
        r13 = "raw_events_metadata";
        r14 = new java.lang.String[r11];	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r12 = "metadata";
        r14[r3] = r12;	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r16 = "app_id = ? and metadata_fingerprint = ?";
        r12 = new java.lang.String[r9];	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r12[r3] = r10;	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r12[r11] = r21;	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r17 = 0;
        r18 = 0;
        r19 = "rowid";
        r20 = "2";
        r23 = r12;
        r12 = r15;
        r24 = r15;
        r15 = r16;
        r16 = r23;
        r15 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ SQLiteException -> 0x0254, all -> 0x024e }
        r12 = r15.moveToFirst();	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        if (r12 != 0) goto L_0x0147;
    L_0x0127:
        r5 = r4.mo1623t();	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r5 = r5.f18134a;	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r6 = "Raw event metadata record is missing. appId";
        r12 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r5.m4847a(r6, r12);	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        if (r15 == 0) goto L_0x0278;
    L_0x0138:
        r15.close();	 Catch:{ all -> 0x09c1 }
        goto L_0x0278;
    L_0x013d:
        r0 = move-exception;
        r2 = r0;
        r6 = r15;
        goto L_0x09bb;
    L_0x0142:
        r0 = move-exception;
        r5 = r0;
        r6 = r15;
        goto L_0x0266;
    L_0x0147:
        r12 = r15.getBlob(r3);	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r13 = r12.length;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r12 = com.google.android.gms.internal.nz.m5045a(r12, r13);	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r13 = new com.google.android.gms.internal.ki;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r13.<init>();	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r13.mo3038a(r12);	 Catch:{ IOException -> 0x022d }
        r12 = r15.moveToNext();	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        if (r12 == 0) goto L_0x016d;
    L_0x015e:
        r12 = r4.mo1623t();	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r12 = r12.f18136c;	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r14 = "Get multiple raw event metadata records, expected one. appId";
        r9 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r12.m4847a(r14, r9);	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
    L_0x016d:
        r15.close();	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r2.mo1645a(r13);	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        r14 = 3;
        if (r9 == 0) goto L_0x018b;
    L_0x0178:
        r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
        r12 = new java.lang.String[r14];	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r12[r3] = r10;	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r12[r11] = r21;	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r6 = 2;
        r12[r6] = r5;	 Catch:{ SQLiteException -> 0x0142, all -> 0x013d }
        r5 = r9;
        r16 = r12;
        goto L_0x0196;
    L_0x018b:
        r5 = "app_id = ? and metadata_fingerprint = ?";
        r6 = 2;
        r9 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9[r3] = r10;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9[r11] = r21;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r16 = r9;
    L_0x0196:
        r13 = "raw_events";
        r6 = 4;
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9 = "rowid";
        r6[r3] = r9;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9 = "name";
        r6[r11] = r9;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9 = "timestamp";
        r12 = 2;
        r6[r12] = r9;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r9 = "data";
        r6[r14] = r9;	 Catch:{ SQLiteException -> 0x024a, all -> 0x0246 }
        r17 = 0;
        r18 = 0;
        r19 = "rowid";
        r20 = 0;
        r12 = r24;
        r9 = r14;
        r14 = r6;
        r6 = r15;
        r15 = r5;
        r5 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ SQLiteException -> 0x0244 }
        r6 = r5.moveToFirst();	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        if (r6 != 0) goto L_0x01da;
    L_0x01c4:
        r6 = r4.mo1623t();	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = r6.f18136c;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r9 = "Raw event data disappeared while in transaction. appId";
        r12 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6.m4847a(r9, r12);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        if (r5 == 0) goto L_0x0278;
    L_0x01d5:
        r5.close();	 Catch:{ all -> 0x09c1 }
        goto L_0x0278;
    L_0x01da:
        r12 = r5.getLong(r3);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = r5.getBlob(r9);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14 = r6.length;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = com.google.android.gms.internal.nz.m5045a(r6, r14);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14 = new com.google.android.gms.internal.kf;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14.<init>();	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14.mo3038a(r6);	 Catch:{ IOException -> 0x0209 }
        r6 = r5.getString(r11);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14.f18271b = r6;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = 2;
        r7 = r5.getLong(r6);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = java.lang.Long.valueOf(r7);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r14.f18272c = r6;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = r2.mo1646a(r12, r14);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        if (r6 != 0) goto L_0x0219;
    L_0x0206:
        if (r5 == 0) goto L_0x0278;
    L_0x0208:
        goto L_0x01d5;
    L_0x0209:
        r0 = move-exception;
        r6 = r4.mo1623t();	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6 = r6.f18134a;	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r7 = "Data loss. Failed to merge raw event. appId";
        r8 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        r6.m4848a(r7, r8, r0);	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
    L_0x0219:
        r6 = r5.moveToNext();	 Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        if (r6 != 0) goto L_0x0222;
    L_0x021f:
        if (r5 == 0) goto L_0x0278;
    L_0x0221:
        goto L_0x01d5;
    L_0x0222:
        r7 = -1;
        goto L_0x01da;
    L_0x0225:
        r0 = move-exception;
        r2 = r0;
        r6 = r5;
        goto L_0x09bb;
    L_0x022a:
        r0 = move-exception;
        r6 = r5;
        goto L_0x024c;
    L_0x022d:
        r0 = move-exception;
        r6 = r15;
        r5 = r4.mo1623t();	 Catch:{ SQLiteException -> 0x0244 }
        r5 = r5.f18134a;	 Catch:{ SQLiteException -> 0x0244 }
        r7 = "Data loss. Failed to merge raw event metadata. appId";
        r8 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ SQLiteException -> 0x0244 }
        r5.m4848a(r7, r8, r0);	 Catch:{ SQLiteException -> 0x0244 }
        if (r6 == 0) goto L_0x0278;
    L_0x0240:
        r6.close();	 Catch:{ all -> 0x09c1 }
        goto L_0x0278;
    L_0x0244:
        r0 = move-exception;
        goto L_0x024c;
    L_0x0246:
        r0 = move-exception;
        r6 = r15;
        goto L_0x09ba;
    L_0x024a:
        r0 = move-exception;
        r6 = r15;
    L_0x024c:
        r5 = r0;
        goto L_0x0266;
    L_0x024e:
        r0 = move-exception;
        r2 = r0;
        r6 = r22;
        goto L_0x09bb;
    L_0x0254:
        r0 = move-exception;
        r5 = r0;
        r6 = r22;
        goto L_0x0266;
    L_0x0259:
        r0 = move-exception;
        r5 = r0;
        r6 = r10;
        goto L_0x0265;
    L_0x025d:
        r0 = move-exception;
        r2 = r0;
        r6 = 0;
        goto L_0x09bb;
    L_0x0262:
        r0 = move-exception;
        r5 = r0;
        r6 = 0;
    L_0x0265:
        r10 = 0;
    L_0x0266:
        r4 = r4.mo1623t();	 Catch:{ all -> 0x09b9 }
        r4 = r4.f18134a;	 Catch:{ all -> 0x09b9 }
        r7 = "Data loss. Error selecting raw event. appId";
        r8 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ all -> 0x09b9 }
        r4.m4848a(r7, r8, r5);	 Catch:{ all -> 0x09b9 }
        if (r6 == 0) goto L_0x0278;
    L_0x0277:
        goto L_0x0240;
    L_0x0278:
        r4 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        if (r4 == 0) goto L_0x0287;
    L_0x027c:
        r4 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x09c1 }
        if (r4 == 0) goto L_0x0285;
    L_0x0284:
        goto L_0x0287;
    L_0x0285:
        r4 = r3;
        goto L_0x0288;
    L_0x0287:
        r4 = r11;
    L_0x0288:
        if (r4 != 0) goto L_0x09a9;
    L_0x028a:
        r4 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r5 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r5 = r5.size();	 Catch:{ all -> 0x09c1 }
        r5 = new com.google.android.gms.internal.kf[r5];	 Catch:{ all -> 0x09c1 }
        r4.f18293b = r5;	 Catch:{ all -> 0x09c1 }
        r5 = r3;
        r6 = r5;
        r7 = r6;
    L_0x0299:
        r8 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r8 = r8.size();	 Catch:{ all -> 0x09c1 }
        if (r5 >= r8) goto L_0x0594;
    L_0x02a1:
        r8 = r46.m4908g();	 Catch:{ all -> 0x09c1 }
        r12 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18306o;	 Catch:{ all -> 0x09c1 }
        r13 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r13 = r13.get(r5);	 Catch:{ all -> 0x09c1 }
        r13 = (com.google.android.gms.internal.kf) r13;	 Catch:{ all -> 0x09c1 }
        r13 = r13.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = r8.m16299b(r12, r13);	 Catch:{ all -> 0x09c1 }
        if (r8 == 0) goto L_0x0329;
    L_0x02b9:
        r8 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r8 = r8.f18136c;	 Catch:{ all -> 0x09c1 }
        r9 = "Dropping blacklisted raw event. appId";
        r10 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r10 = r10.f18306o;	 Catch:{ all -> 0x09c1 }
        r10 = com.google.android.gms.internal.ft.m16220a(r10);	 Catch:{ all -> 0x09c1 }
        r12 = r46.m4911j();	 Catch:{ all -> 0x09c1 }
        r13 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r13 = r13.get(r5);	 Catch:{ all -> 0x09c1 }
        r13 = (com.google.android.gms.internal.kf) r13;	 Catch:{ all -> 0x09c1 }
        r13 = r13.f18271b;	 Catch:{ all -> 0x09c1 }
        r12 = r12.m16194a(r13);	 Catch:{ all -> 0x09c1 }
        r8.m4848a(r9, r10, r12);	 Catch:{ all -> 0x09c1 }
        r8 = r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18306o;	 Catch:{ all -> 0x09c1 }
        r8 = r8.m16626k(r9);	 Catch:{ all -> 0x09c1 }
        if (r8 != 0) goto L_0x02fd;
    L_0x02ec:
        r8 = r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18306o;	 Catch:{ all -> 0x09c1 }
        r8 = r8.m16628l(r9);	 Catch:{ all -> 0x09c1 }
        if (r8 == 0) goto L_0x02fb;
    L_0x02fa:
        goto L_0x02fd;
    L_0x02fb:
        r8 = r3;
        goto L_0x02fe;
    L_0x02fd:
        r8 = r11;
    L_0x02fe:
        if (r8 != 0) goto L_0x058e;
    L_0x0300:
        r8 = "_err";
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = r8.equals(r9);	 Catch:{ all -> 0x09c1 }
        if (r8 != 0) goto L_0x058e;
    L_0x0312:
        r8 = r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r9 = 11;
        r10 = "_ev";
        r12 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r12 = r12.get(r5);	 Catch:{ all -> 0x09c1 }
        r12 = (com.google.android.gms.internal.kf) r12;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r8.m16610b(r9, r10, r12, r3);	 Catch:{ all -> 0x09c1 }
        goto L_0x058e;
    L_0x0329:
        r8 = r46.m4908g();	 Catch:{ all -> 0x09c1 }
        r12 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18306o;	 Catch:{ all -> 0x09c1 }
        r13 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r13 = r13.get(r5);	 Catch:{ all -> 0x09c1 }
        r13 = (com.google.android.gms.internal.kf) r13;	 Catch:{ all -> 0x09c1 }
        r13 = r13.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = r8.m16301c(r12, r13);	 Catch:{ all -> 0x09c1 }
        if (r8 != 0) goto L_0x0354;
    L_0x0341:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r12 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r12 = r12.get(r5);	 Catch:{ all -> 0x09c1 }
        r12 = (com.google.android.gms.internal.kf) r12;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r12 = com.google.android.gms.internal.ju.m16586m(r12);	 Catch:{ all -> 0x09c1 }
        if (r12 == 0) goto L_0x057f;
    L_0x0354:
        r12 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r12 = r12.get(r5);	 Catch:{ all -> 0x09c1 }
        r12 = (com.google.android.gms.internal.kf) r12;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        if (r12 != 0) goto L_0x036c;
    L_0x0360:
        r12 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r12 = r12.get(r5);	 Catch:{ all -> 0x09c1 }
        r12 = (com.google.android.gms.internal.kf) r12;	 Catch:{ all -> 0x09c1 }
        r13 = new com.google.android.gms.internal.kg[r3];	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r13;	 Catch:{ all -> 0x09c1 }
    L_0x036c:
        r12 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r12 = r12.get(r5);	 Catch:{ all -> 0x09c1 }
        r12 = (com.google.android.gms.internal.kf) r12;	 Catch:{ all -> 0x09c1 }
        r12 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r13 = r12.length;	 Catch:{ all -> 0x09c1 }
        r14 = r3;
        r15 = r14;
        r16 = r15;
    L_0x037b:
        if (r14 >= r13) goto L_0x03ac;
    L_0x037d:
        r3 = r12[r14];	 Catch:{ all -> 0x09c1 }
        r11 = "_c";
        r9 = r3.f18276a;	 Catch:{ all -> 0x09c1 }
        r9 = r11.equals(r9);	 Catch:{ all -> 0x09c1 }
        if (r9 == 0) goto L_0x0393;
    L_0x0389:
        r9 = 1;
        r11 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x09c1 }
        r3.f18278c = r11;	 Catch:{ all -> 0x09c1 }
        r15 = 1;
        goto L_0x03a7;
    L_0x0393:
        r9 = "_r";
        r10 = r3.f18276a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.equals(r10);	 Catch:{ all -> 0x09c1 }
        if (r9 == 0) goto L_0x03a7;
    L_0x039d:
        r9 = 1;
        r11 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x09c1 }
        r3.f18278c = r11;	 Catch:{ all -> 0x09c1 }
        r16 = 1;
    L_0x03a7:
        r14 = r14 + 1;
        r3 = 0;
        r11 = 1;
        goto L_0x037b;
    L_0x03ac:
        if (r15 != 0) goto L_0x040a;
    L_0x03ae:
        if (r8 == 0) goto L_0x040a;
    L_0x03b0:
        r3 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18140g;	 Catch:{ all -> 0x09c1 }
        r9 = "Marking event as conversion";
        r10 = r46.m4911j();	 Catch:{ all -> 0x09c1 }
        r11 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r11 = r11.get(r5);	 Catch:{ all -> 0x09c1 }
        r11 = (com.google.android.gms.internal.kf) r11;	 Catch:{ all -> 0x09c1 }
        r11 = r11.f18271b;	 Catch:{ all -> 0x09c1 }
        r10 = r10.m16194a(r11);	 Catch:{ all -> 0x09c1 }
        r3.m4847a(r9, r10);	 Catch:{ all -> 0x09c1 }
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.get(r5);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf) r3;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.length;	 Catch:{ all -> 0x09c1 }
        r10 = 1;
        r9 = r9 + r10;
        r3 = java.util.Arrays.copyOf(r3, r9);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kg[]) r3;	 Catch:{ all -> 0x09c1 }
        r9 = new com.google.android.gms.internal.kg;	 Catch:{ all -> 0x09c1 }
        r9.<init>();	 Catch:{ all -> 0x09c1 }
        r10 = "_c";
        r9.f18276a = r10;	 Catch:{ all -> 0x09c1 }
        r10 = 1;
        r12 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x09c1 }
        r9.f18278c = r12;	 Catch:{ all -> 0x09c1 }
        r10 = r3.length;	 Catch:{ all -> 0x09c1 }
        r11 = 1;
        r10 = r10 - r11;
        r3[r10] = r9;	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r9.f18270a = r3;	 Catch:{ all -> 0x09c1 }
    L_0x040a:
        if (r16 != 0) goto L_0x0466;
    L_0x040c:
        r3 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18140g;	 Catch:{ all -> 0x09c1 }
        r9 = "Marking event as real-time";
        r10 = r46.m4911j();	 Catch:{ all -> 0x09c1 }
        r11 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r11 = r11.get(r5);	 Catch:{ all -> 0x09c1 }
        r11 = (com.google.android.gms.internal.kf) r11;	 Catch:{ all -> 0x09c1 }
        r11 = r11.f18271b;	 Catch:{ all -> 0x09c1 }
        r10 = r10.m16194a(r11);	 Catch:{ all -> 0x09c1 }
        r3.m4847a(r9, r10);	 Catch:{ all -> 0x09c1 }
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.get(r5);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf) r3;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.length;	 Catch:{ all -> 0x09c1 }
        r10 = 1;
        r9 = r9 + r10;
        r3 = java.util.Arrays.copyOf(r3, r9);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kg[]) r3;	 Catch:{ all -> 0x09c1 }
        r9 = new com.google.android.gms.internal.kg;	 Catch:{ all -> 0x09c1 }
        r9.<init>();	 Catch:{ all -> 0x09c1 }
        r10 = "_r";
        r9.f18276a = r10;	 Catch:{ all -> 0x09c1 }
        r10 = 1;
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x09c1 }
        r9.f18278c = r10;	 Catch:{ all -> 0x09c1 }
        r10 = r3.length;	 Catch:{ all -> 0x09c1 }
        r11 = 1;
        r10 = r10 - r11;
        r3[r10] = r9;	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r9.f18270a = r3;	 Catch:{ all -> 0x09c1 }
    L_0x0466:
        r10 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r11 = r46.m4866B();	 Catch:{ all -> 0x09c1 }
        r3 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r13 = r3.f18306o;	 Catch:{ all -> 0x09c1 }
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 1;
        r3 = r10.m16064a(r11, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x09c1 }
        r9 = r3.f5720e;	 Catch:{ all -> 0x09c1 }
        r3 = r1.f5868b;	 Catch:{ all -> 0x09c1 }
        r11 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r11 = r11.f18306o;	 Catch:{ all -> 0x09c1 }
        r3 = r3.m11918a(r11);	 Catch:{ all -> 0x09c1 }
        r11 = (long) r3;	 Catch:{ all -> 0x09c1 }
        r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r3 <= 0) goto L_0x04cc;
    L_0x048f:
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.get(r5);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf) r3;	 Catch:{ all -> 0x09c1 }
        r9 = 0;
    L_0x0498:
        r10 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r10 = r10.length;	 Catch:{ all -> 0x09c1 }
        if (r9 >= r10) goto L_0x04cd;
    L_0x049d:
        r10 = "_r";
        r11 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r11 = r11[r9];	 Catch:{ all -> 0x09c1 }
        r11 = r11.f18276a;	 Catch:{ all -> 0x09c1 }
        r10 = r10.equals(r11);	 Catch:{ all -> 0x09c1 }
        if (r10 == 0) goto L_0x04c9;
    L_0x04ab:
        r10 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r10 = r10.length;	 Catch:{ all -> 0x09c1 }
        r11 = 1;
        r10 = r10 - r11;
        r10 = new com.google.android.gms.internal.kg[r10];	 Catch:{ all -> 0x09c1 }
        if (r9 <= 0) goto L_0x04ba;
    L_0x04b4:
        r11 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r12 = 0;
        java.lang.System.arraycopy(r11, r12, r10, r12, r9);	 Catch:{ all -> 0x09c1 }
    L_0x04ba:
        r11 = r10.length;	 Catch:{ all -> 0x09c1 }
        if (r9 >= r11) goto L_0x04c6;
    L_0x04bd:
        r11 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r12 = r9 + 1;
        r13 = r10.length;	 Catch:{ all -> 0x09c1 }
        r13 = r13 - r9;
        java.lang.System.arraycopy(r11, r12, r10, r9, r13);	 Catch:{ all -> 0x09c1 }
    L_0x04c6:
        r3.f18270a = r10;	 Catch:{ all -> 0x09c1 }
        goto L_0x04cd;
    L_0x04c9:
        r9 = r9 + 1;
        goto L_0x0498;
    L_0x04cc:
        r6 = 1;
    L_0x04cd:
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.get(r5);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf) r3;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18271b;	 Catch:{ all -> 0x09c1 }
        r3 = com.google.android.gms.internal.ju.m16570a(r3);	 Catch:{ all -> 0x09c1 }
        if (r3 == 0) goto L_0x057f;
    L_0x04dd:
        if (r8 == 0) goto L_0x057f;
    L_0x04df:
        r9 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r10 = r46.m4866B();	 Catch:{ all -> 0x09c1 }
        r3 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r12 = r3.f18306o;	 Catch:{ all -> 0x09c1 }
        r13 = 0;
        r14 = 0;
        r15 = 1;
        r16 = 0;
        r17 = 0;
        r3 = r9.m16064a(r10, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x09c1 }
        r8 = r3.f5718c;	 Catch:{ all -> 0x09c1 }
        r3 = r1.f5868b;	 Catch:{ all -> 0x09c1 }
        r10 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r10 = r10.f18306o;	 Catch:{ all -> 0x09c1 }
        r11 = com.google.android.gms.internal.fj.f5775p;	 Catch:{ all -> 0x09c1 }
        r3 = r3.m11921b(r10, r11);	 Catch:{ all -> 0x09c1 }
        r10 = (long) r3;	 Catch:{ all -> 0x09c1 }
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x057f;
    L_0x0509:
        r3 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18136c;	 Catch:{ all -> 0x09c1 }
        r8 = "Too many conversions. Not logging as conversion. appId";
        r9 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18306o;	 Catch:{ all -> 0x09c1 }
        r9 = com.google.android.gms.internal.ft.m16220a(r9);	 Catch:{ all -> 0x09c1 }
        r3.m4847a(r8, r9);	 Catch:{ all -> 0x09c1 }
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.get(r5);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf) r3;	 Catch:{ all -> 0x09c1 }
        r8 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = r8.length;	 Catch:{ all -> 0x09c1 }
        r10 = 0;
        r11 = 0;
        r12 = 0;
    L_0x052a:
        if (r10 >= r9) goto L_0x0548;
    L_0x052c:
        r13 = r8[r10];	 Catch:{ all -> 0x09c1 }
        r14 = "_c";
        r15 = r13.f18276a;	 Catch:{ all -> 0x09c1 }
        r14 = r14.equals(r15);	 Catch:{ all -> 0x09c1 }
        if (r14 == 0) goto L_0x053a;
    L_0x0538:
        r12 = r13;
        goto L_0x0545;
    L_0x053a:
        r14 = "_err";
        r13 = r13.f18276a;	 Catch:{ all -> 0x09c1 }
        r13 = r14.equals(r13);	 Catch:{ all -> 0x09c1 }
        if (r13 == 0) goto L_0x0545;
    L_0x0544:
        r11 = 1;
    L_0x0545:
        r10 = r10 + 1;
        goto L_0x052a;
    L_0x0548:
        if (r11 == 0) goto L_0x055d;
    L_0x054a:
        if (r12 == 0) goto L_0x055d;
    L_0x054c:
        r8 = r3.f18270a;	 Catch:{ all -> 0x09c1 }
        r9 = 1;
        r10 = new com.google.android.gms.internal.kg[r9];	 Catch:{ all -> 0x09c1 }
        r9 = 0;
        r10[r9] = r12;	 Catch:{ all -> 0x09c1 }
        r8 = com.google.android.gms.common.util.C1782a.m4515a(r8, r10);	 Catch:{ all -> 0x09c1 }
        r8 = (com.google.android.gms.internal.kg[]) r8;	 Catch:{ all -> 0x09c1 }
        r3.f18270a = r8;	 Catch:{ all -> 0x09c1 }
        goto L_0x057f;
    L_0x055d:
        if (r12 == 0) goto L_0x056c;
    L_0x055f:
        r3 = "_err";
        r12.f18276a = r3;	 Catch:{ all -> 0x09c1 }
        r8 = 10;
        r3 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x09c1 }
        r12.f18278c = r3;	 Catch:{ all -> 0x09c1 }
        goto L_0x057f;
    L_0x056c:
        r3 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18134a;	 Catch:{ all -> 0x09c1 }
        r8 = "Did not find conversion parameter. appId";
        r9 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18306o;	 Catch:{ all -> 0x09c1 }
        r9 = com.google.android.gms.internal.ft.m16220a(r9);	 Catch:{ all -> 0x09c1 }
        r3.m4847a(r8, r9);	 Catch:{ all -> 0x09c1 }
    L_0x057f:
        r3 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r8 = r7 + 1;
        r9 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r9 = r9.get(r5);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.kf) r9;	 Catch:{ all -> 0x09c1 }
        r3[r7] = r9;	 Catch:{ all -> 0x09c1 }
        r7 = r8;
    L_0x058e:
        r5 = r5 + 1;
        r3 = 0;
        r11 = 1;
        goto L_0x0299;
    L_0x0594:
        r3 = r2.f15237c;	 Catch:{ all -> 0x09c1 }
        r3 = r3.size();	 Catch:{ all -> 0x09c1 }
        if (r7 >= r3) goto L_0x05a6;
    L_0x059c:
        r3 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r3 = java.util.Arrays.copyOf(r3, r7);	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.kf[]) r3;	 Catch:{ all -> 0x09c1 }
        r4.f18293b = r3;	 Catch:{ all -> 0x09c1 }
    L_0x05a6:
        r3 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18306o;	 Catch:{ all -> 0x09c1 }
        r5 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r5 = r5.f18294c;	 Catch:{ all -> 0x09c1 }
        r7 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r3 = r1.m4881a(r3, r5, r7);	 Catch:{ all -> 0x09c1 }
        r4.f18283A = r3;	 Catch:{ all -> 0x09c1 }
        r3 = com.google.android.gms.internal.fj.f5761b;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f5786a;	 Catch:{ all -> 0x09c1 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x09c1 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r3 == 0) goto L_0x0849;
    L_0x05c2:
        r3 = r1.f5868b;	 Catch:{ all -> 0x09c1 }
        r5 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r5 = r5.f18306o;	 Catch:{ all -> 0x09c1 }
        r7 = "1";
        r3 = r3.mo1620q();	 Catch:{ all -> 0x09c1 }
        r8 = "measurement.event_sampling_enabled";
        r3 = r3.m16295a(r5, r8);	 Catch:{ all -> 0x09c1 }
        r3 = r7.equals(r3);	 Catch:{ all -> 0x09c1 }
        if (r3 == 0) goto L_0x0849;
    L_0x05da:
        r3 = new java.util.HashMap;	 Catch:{ all -> 0x09c1 }
        r3.<init>();	 Catch:{ all -> 0x09c1 }
        r5 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r5 = r5.length;	 Catch:{ all -> 0x09c1 }
        r5 = new com.google.android.gms.internal.kf[r5];	 Catch:{ all -> 0x09c1 }
        r7 = r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r7 = r7.m16641z();	 Catch:{ all -> 0x09c1 }
        r8 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r9 = r8.length;	 Catch:{ all -> 0x09c1 }
        r10 = 0;
        r11 = 0;
    L_0x05f1:
        if (r10 >= r9) goto L_0x0815;
    L_0x05f3:
        r12 = r8[r10];	 Catch:{ all -> 0x09c1 }
        r13 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r14 = "_ep";
        r13 = r13.equals(r14);	 Catch:{ all -> 0x09c1 }
        if (r13 == 0) goto L_0x0679;
    L_0x05ff:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r13 = "_en";
        r13 = com.google.android.gms.internal.ju.m16561a(r12, r13);	 Catch:{ all -> 0x09c1 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x09c1 }
        r14 = r3.get(r13);	 Catch:{ all -> 0x09c1 }
        r14 = (com.google.android.gms.internal.ff) r14;	 Catch:{ all -> 0x09c1 }
        if (r14 != 0) goto L_0x0621;
    L_0x0612:
        r14 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r15 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r15 = r15.f18306o;	 Catch:{ all -> 0x09c1 }
        r14 = r14.m16065a(r15, r13);	 Catch:{ all -> 0x09c1 }
        r3.put(r13, r14);	 Catch:{ all -> 0x09c1 }
    L_0x0621:
        r13 = r14.f5740g;	 Catch:{ all -> 0x09c1 }
        if (r13 != 0) goto L_0x066e;
    L_0x0625:
        r13 = r14.f5741h;	 Catch:{ all -> 0x09c1 }
        r15 = r13.longValue();	 Catch:{ all -> 0x09c1 }
        r17 = 1;
        r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1));
        if (r13 <= 0) goto L_0x0643;
    L_0x0631:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r13 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r15 = "_sr";
        r25 = r8;
        r8 = r14.f5741h;	 Catch:{ all -> 0x09c1 }
        r8 = com.google.android.gms.internal.ju.m16576a(r13, r15, r8);	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r8;	 Catch:{ all -> 0x09c1 }
        goto L_0x0645;
    L_0x0643:
        r25 = r8;
    L_0x0645:
        r8 = r14.f5742i;	 Catch:{ all -> 0x09c1 }
        if (r8 == 0) goto L_0x0667;
    L_0x0649:
        r8 = r14.f5742i;	 Catch:{ all -> 0x09c1 }
        r8 = r8.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r8 == 0) goto L_0x0667;
    L_0x0651:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r8 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r13 = "_efs";
        r26 = r9;
        r14 = 1;
        r9 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x09c1 }
        r8 = com.google.android.gms.internal.ju.m16576a(r8, r13, r9);	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r8;	 Catch:{ all -> 0x09c1 }
        goto L_0x0669;
    L_0x0667:
        r26 = r9;
    L_0x0669:
        r8 = r11 + 1;
        r5[r11] = r12;	 Catch:{ all -> 0x09c1 }
        goto L_0x06b2;
    L_0x066e:
        r25 = r8;
        r26 = r9;
        r43 = r2;
        r42 = r6;
        r41 = r7;
        goto L_0x06b9;
    L_0x0679:
        r25 = r8;
        r26 = r9;
        r8 = "_dbg";
        r13 = 1;
        r9 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x09c1 }
        r8 = m4879a(r12, r8, r9);	 Catch:{ all -> 0x09c1 }
        if (r8 != 0) goto L_0x069a;
    L_0x068b:
        r8 = r46.m4908g();	 Catch:{ all -> 0x09c1 }
        r9 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18306o;	 Catch:{ all -> 0x09c1 }
        r13 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = r8.m16302d(r9, r13);	 Catch:{ all -> 0x09c1 }
        goto L_0x069b;
    L_0x069a:
        r8 = 1;
    L_0x069b:
        if (r8 > 0) goto L_0x06bc;
    L_0x069d:
        r9 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18136c;	 Catch:{ all -> 0x09c1 }
        r13 = "Sample rate must be positive. event, rate";
        r14 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x09c1 }
        r9.m4848a(r13, r14, r8);	 Catch:{ all -> 0x09c1 }
        r8 = r11 + 1;
        r5[r11] = r12;	 Catch:{ all -> 0x09c1 }
    L_0x06b2:
        r43 = r2;
        r42 = r6;
        r41 = r7;
        r11 = r8;
    L_0x06b9:
        r7 = r3;
        goto L_0x0806;
    L_0x06bc:
        r9 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r9 = r3.get(r9);	 Catch:{ all -> 0x09c1 }
        r9 = (com.google.android.gms.internal.ff) r9;	 Catch:{ all -> 0x09c1 }
        if (r9 != 0) goto L_0x070a;
    L_0x06c6:
        r9 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r13 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r13 = r13.f18306o;	 Catch:{ all -> 0x09c1 }
        r14 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r9 = r9.m16065a(r13, r14);	 Catch:{ all -> 0x09c1 }
        if (r9 != 0) goto L_0x070a;
    L_0x06d6:
        r9 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r9 = r9.f18136c;	 Catch:{ all -> 0x09c1 }
        r13 = "Event being bundled has no eventAggregate. appId, eventName";
        r14 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r14 = r14.f18306o;	 Catch:{ all -> 0x09c1 }
        r15 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r9.m4848a(r13, r14, r15);	 Catch:{ all -> 0x09c1 }
        r9 = new com.google.android.gms.internal.ff;	 Catch:{ all -> 0x09c1 }
        r13 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r13 = r13.f18306o;	 Catch:{ all -> 0x09c1 }
        r14 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r30 = 1;
        r32 = 1;
        r15 = r12.f18272c;	 Catch:{ all -> 0x09c1 }
        r34 = r15.longValue();	 Catch:{ all -> 0x09c1 }
        r36 = 0;
        r38 = 0;
        r39 = 0;
        r40 = 0;
        r27 = r9;
        r28 = r13;
        r29 = r14;
        r27.<init>(r28, r29, r30, r32, r34, r36, r38, r39, r40);	 Catch:{ all -> 0x09c1 }
    L_0x070a:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r13 = "_eid";
        r13 = com.google.android.gms.internal.ju.m16561a(r12, r13);	 Catch:{ all -> 0x09c1 }
        r13 = (java.lang.Long) r13;	 Catch:{ all -> 0x09c1 }
        if (r13 == 0) goto L_0x0719;
    L_0x0717:
        r14 = 1;
        goto L_0x071a;
    L_0x0719:
        r14 = 0;
    L_0x071a:
        r14 = java.lang.Boolean.valueOf(r14);	 Catch:{ all -> 0x09c1 }
        r15 = 1;
        if (r8 != r15) goto L_0x0743;
    L_0x0721:
        r8 = r11 + 1;
        r5[r11] = r12;	 Catch:{ all -> 0x09c1 }
        r11 = r14.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r11 == 0) goto L_0x06b2;
    L_0x072b:
        r11 = r9.f5740g;	 Catch:{ all -> 0x09c1 }
        if (r11 != 0) goto L_0x0737;
    L_0x072f:
        r11 = r9.f5741h;	 Catch:{ all -> 0x09c1 }
        if (r11 != 0) goto L_0x0737;
    L_0x0733:
        r11 = r9.f5742i;	 Catch:{ all -> 0x09c1 }
        if (r11 == 0) goto L_0x06b2;
    L_0x0737:
        r11 = 0;
        r9 = r9.m4823a(r11, r11, r11);	 Catch:{ all -> 0x09c1 }
        r11 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r3.put(r11, r9);	 Catch:{ all -> 0x09c1 }
        goto L_0x06b2;
    L_0x0743:
        r15 = r7.nextInt(r8);	 Catch:{ all -> 0x09c1 }
        if (r15 != 0) goto L_0x0787;
    L_0x0749:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r13 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r15 = "_sr";
        r41 = r7;
        r7 = (long) r8;	 Catch:{ all -> 0x09c1 }
        r42 = r6;
        r6 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x09c1 }
        r6 = com.google.android.gms.internal.ju.m16576a(r13, r15, r6);	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r6;	 Catch:{ all -> 0x09c1 }
        r6 = r11 + 1;
        r5[r11] = r12;	 Catch:{ all -> 0x09c1 }
        r11 = r14.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r11 == 0) goto L_0x0772;
    L_0x0769:
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x09c1 }
        r8 = 0;
        r9 = r9.m4823a(r8, r7, r8);	 Catch:{ all -> 0x09c1 }
    L_0x0772:
        r7 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r8 = r12.f18272c;	 Catch:{ all -> 0x09c1 }
        r11 = r8.longValue();	 Catch:{ all -> 0x09c1 }
        r8 = r9.m4824b(r11);	 Catch:{ all -> 0x09c1 }
        r3.put(r7, r8);	 Catch:{ all -> 0x09c1 }
        r43 = r2;
        r7 = r3;
        r11 = r6;
        goto L_0x0806;
    L_0x0787:
        r42 = r6;
        r41 = r7;
        r6 = r9.f5739f;	 Catch:{ all -> 0x09c1 }
        r15 = r12.f18272c;	 Catch:{ all -> 0x09c1 }
        r15 = r15.longValue();	 Catch:{ all -> 0x09c1 }
        r43 = r2;
        r44 = r3;
        r2 = r15 - r6;
        r2 = java.lang.Math.abs(r2);	 Catch:{ all -> 0x09c1 }
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x07f4;
    L_0x07a4:
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r2 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r3 = "_efs";
        r6 = 1;
        r13 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        r2 = com.google.android.gms.internal.ju.m16576a(r2, r3, r13);	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r2;	 Catch:{ all -> 0x09c1 }
        r46.m4910i();	 Catch:{ all -> 0x09c1 }
        r2 = r12.f18270a;	 Catch:{ all -> 0x09c1 }
        r3 = "_sr";
        r6 = (long) r8;	 Catch:{ all -> 0x09c1 }
        r8 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        r2 = com.google.android.gms.internal.ju.m16576a(r2, r3, r8);	 Catch:{ all -> 0x09c1 }
        r12.f18270a = r2;	 Catch:{ all -> 0x09c1 }
        r2 = r11 + 1;
        r5[r11] = r12;	 Catch:{ all -> 0x09c1 }
        r3 = r14.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r3 == 0) goto L_0x07e1;
    L_0x07d3:
        r3 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        r6 = 1;
        r7 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        r6 = 0;
        r9 = r9.m4823a(r6, r3, r7);	 Catch:{ all -> 0x09c1 }
    L_0x07e1:
        r3 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r6 = r12.f18272c;	 Catch:{ all -> 0x09c1 }
        r6 = r6.longValue();	 Catch:{ all -> 0x09c1 }
        r6 = r9.m4824b(r6);	 Catch:{ all -> 0x09c1 }
        r7 = r44;
        r7.put(r3, r6);	 Catch:{ all -> 0x09c1 }
        r11 = r2;
        goto L_0x0806;
    L_0x07f4:
        r7 = r44;
        r2 = r14.booleanValue();	 Catch:{ all -> 0x09c1 }
        if (r2 == 0) goto L_0x0806;
    L_0x07fc:
        r2 = r12.f18271b;	 Catch:{ all -> 0x09c1 }
        r3 = 0;
        r6 = r9.m4823a(r13, r3, r3);	 Catch:{ all -> 0x09c1 }
        r7.put(r2, r6);	 Catch:{ all -> 0x09c1 }
    L_0x0806:
        r10 = r10 + 1;
        r3 = r7;
        r8 = r25;
        r9 = r26;
        r7 = r41;
        r6 = r42;
        r2 = r43;
        goto L_0x05f1;
    L_0x0815:
        r43 = r2;
        r7 = r3;
        r42 = r6;
        r2 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r2 = r2.length;	 Catch:{ all -> 0x09c1 }
        if (r11 >= r2) goto L_0x0827;
    L_0x081f:
        r2 = java.util.Arrays.copyOf(r5, r11);	 Catch:{ all -> 0x09c1 }
        r2 = (com.google.android.gms.internal.kf[]) r2;	 Catch:{ all -> 0x09c1 }
        r4.f18293b = r2;	 Catch:{ all -> 0x09c1 }
    L_0x0827:
        r2 = r7.entrySet();	 Catch:{ all -> 0x09c1 }
        r2 = r2.iterator();	 Catch:{ all -> 0x09c1 }
    L_0x082f:
        r3 = r2.hasNext();	 Catch:{ all -> 0x09c1 }
        if (r3 == 0) goto L_0x084d;
    L_0x0835:
        r3 = r2.next();	 Catch:{ all -> 0x09c1 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x09c1 }
        r5 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r3 = r3.getValue();	 Catch:{ all -> 0x09c1 }
        r3 = (com.google.android.gms.internal.ff) r3;	 Catch:{ all -> 0x09c1 }
        r5.m16071a(r3);	 Catch:{ all -> 0x09c1 }
        goto L_0x082f;
    L_0x0849:
        r43 = r2;
        r42 = r6;
    L_0x084d:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x09c1 }
        r4.f18296e = r2;	 Catch:{ all -> 0x09c1 }
        r2 = -9223372036854775808;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x09c1 }
        r4.f18297f = r2;	 Catch:{ all -> 0x09c1 }
        r2 = 0;
    L_0x0861:
        r3 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r3 = r3.length;	 Catch:{ all -> 0x09c1 }
        if (r2 >= r3) goto L_0x0895;
    L_0x0866:
        r3 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r3 = r3[r2];	 Catch:{ all -> 0x09c1 }
        r5 = r3.f18272c;	 Catch:{ all -> 0x09c1 }
        r5 = r5.longValue();	 Catch:{ all -> 0x09c1 }
        r7 = r4.f18296e;	 Catch:{ all -> 0x09c1 }
        r7 = r7.longValue();	 Catch:{ all -> 0x09c1 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x087e;
    L_0x087a:
        r5 = r3.f18272c;	 Catch:{ all -> 0x09c1 }
        r4.f18296e = r5;	 Catch:{ all -> 0x09c1 }
    L_0x087e:
        r5 = r3.f18272c;	 Catch:{ all -> 0x09c1 }
        r5 = r5.longValue();	 Catch:{ all -> 0x09c1 }
        r7 = r4.f18297f;	 Catch:{ all -> 0x09c1 }
        r7 = r7.longValue();	 Catch:{ all -> 0x09c1 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x0892;
    L_0x088e:
        r3 = r3.f18272c;	 Catch:{ all -> 0x09c1 }
        r4.f18297f = r3;	 Catch:{ all -> 0x09c1 }
    L_0x0892:
        r2 = r2 + 1;
        goto L_0x0861;
    L_0x0895:
        r2 = r43;
        r3 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r3 = r3.f18306o;	 Catch:{ all -> 0x09c1 }
        r5 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r5 = r5.m16078b(r3);	 Catch:{ all -> 0x09c1 }
        if (r5 != 0) goto L_0x08b9;
    L_0x08a5:
        r5 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r5 = r5.f18134a;	 Catch:{ all -> 0x09c1 }
        r6 = "Bundling raw events w/o app info. appId";
        r7 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r7 = r7.f18306o;	 Catch:{ all -> 0x09c1 }
        r7 = com.google.android.gms.internal.ft.m16220a(r7);	 Catch:{ all -> 0x09c1 }
        r5.m4847a(r6, r7);	 Catch:{ all -> 0x09c1 }
        goto L_0x091e;
    L_0x08b9:
        r6 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r6 = r6.length;	 Catch:{ all -> 0x09c1 }
        if (r6 <= 0) goto L_0x091e;
    L_0x08be:
        r6 = r5.m4792g();	 Catch:{ all -> 0x09c1 }
        r8 = 0;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x08cd;
    L_0x08c8:
        r10 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        goto L_0x08ce;
    L_0x08cd:
        r10 = 0;
    L_0x08ce:
        r4.f18299h = r10;	 Catch:{ all -> 0x09c1 }
        r10 = r5.m4789f();	 Catch:{ all -> 0x09c1 }
        r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r12 != 0) goto L_0x08d9;
    L_0x08d8:
        goto L_0x08da;
    L_0x08d9:
        r6 = r10;
    L_0x08da:
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x08e3;
    L_0x08de:
        r10 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        goto L_0x08e4;
    L_0x08e3:
        r10 = 0;
    L_0x08e4:
        r4.f18298g = r10;	 Catch:{ all -> 0x09c1 }
        r5.m4806q();	 Catch:{ all -> 0x09c1 }
        r6 = r5.m4803n();	 Catch:{ all -> 0x09c1 }
        r6 = (int) r6;	 Catch:{ all -> 0x09c1 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x09c1 }
        r4.f18314w = r6;	 Catch:{ all -> 0x09c1 }
        r6 = r4.f18296e;	 Catch:{ all -> 0x09c1 }
        r6 = r6.longValue();	 Catch:{ all -> 0x09c1 }
        r5.m4773a(r6);	 Catch:{ all -> 0x09c1 }
        r6 = r4.f18297f;	 Catch:{ all -> 0x09c1 }
        r6 = r6.longValue();	 Catch:{ all -> 0x09c1 }
        r5.m4777b(r6);	 Catch:{ all -> 0x09c1 }
        r6 = r5.f5690a;	 Catch:{ all -> 0x09c1 }
        r6 = r6.m4907f();	 Catch:{ all -> 0x09c1 }
        r6.mo1606c();	 Catch:{ all -> 0x09c1 }
        r6 = r5.f5697h;	 Catch:{ all -> 0x09c1 }
        r7 = 0;
        r5.m4794g(r7);	 Catch:{ all -> 0x09c1 }
        r4.f18315x = r6;	 Catch:{ all -> 0x09c1 }
        r6 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r6.m16070a(r5);	 Catch:{ all -> 0x09c1 }
    L_0x091e:
        r5 = r4.f18293b;	 Catch:{ all -> 0x09c1 }
        r5 = r5.length;	 Catch:{ all -> 0x09c1 }
        if (r5 <= 0) goto L_0x0968;
    L_0x0923:
        r5 = r46.m4908g();	 Catch:{ all -> 0x09c1 }
        r6 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r6 = r6.f18306o;	 Catch:{ all -> 0x09c1 }
        r5 = r5.m16294a(r6);	 Catch:{ all -> 0x09c1 }
        if (r5 == 0) goto L_0x093b;
    L_0x0931:
        r6 = r5.f18255a;	 Catch:{ all -> 0x09c1 }
        if (r6 != 0) goto L_0x0936;
    L_0x0935:
        goto L_0x093b;
    L_0x0936:
        r5 = r5.f18255a;	 Catch:{ all -> 0x09c1 }
    L_0x0938:
        r4.f18287E = r5;	 Catch:{ all -> 0x09c1 }
        goto L_0x095f;
    L_0x093b:
        r5 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r5 = r5.f18316y;	 Catch:{ all -> 0x09c1 }
        r5 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x09c1 }
        if (r5 == 0) goto L_0x094c;
    L_0x0945:
        r5 = -1;
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x09c1 }
        goto L_0x0938;
    L_0x094c:
        r5 = r46.m4906e();	 Catch:{ all -> 0x09c1 }
        r5 = r5.f18136c;	 Catch:{ all -> 0x09c1 }
        r6 = "Did not find measurement config or missing version info. appId";
        r7 = r2.f15235a;	 Catch:{ all -> 0x09c1 }
        r7 = r7.f18306o;	 Catch:{ all -> 0x09c1 }
        r7 = com.google.android.gms.internal.ft.m16220a(r7);	 Catch:{ all -> 0x09c1 }
        r5.m4847a(r6, r7);	 Catch:{ all -> 0x09c1 }
    L_0x095f:
        r5 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r6 = r42;
        r5.m16076a(r4, r6);	 Catch:{ all -> 0x09c1 }
    L_0x0968:
        r4 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r2 = r2.f15236b;	 Catch:{ all -> 0x09c1 }
        r4.m16073a(r2);	 Catch:{ all -> 0x09c1 }
        r2 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r4 = r2.m16057A();	 Catch:{ all -> 0x09c1 }
        r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)";
        r6 = 2;
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x0988 }
        r7 = 0;
        r6[r7] = r3;	 Catch:{ SQLiteException -> 0x0988 }
        r7 = 1;
        r6[r7] = r3;	 Catch:{ SQLiteException -> 0x0988 }
        r4.execSQL(r5, r6);	 Catch:{ SQLiteException -> 0x0988 }
        goto L_0x0999;
    L_0x0988:
        r0 = move-exception;
        r4 = r0;
        r2 = r2.mo1623t();	 Catch:{ all -> 0x09c1 }
        r2 = r2.f18134a;	 Catch:{ all -> 0x09c1 }
        r5 = "Failed to remove unused event metadata. appId";
        r3 = com.google.android.gms.internal.ft.m16220a(r3);	 Catch:{ all -> 0x09c1 }
        r2.m4848a(r5, r3, r4);	 Catch:{ all -> 0x09c1 }
    L_0x0999:
        r2 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r2.m16093y();	 Catch:{ all -> 0x09c1 }
        r2 = r46.m4912k();
        r2.m16094z();
        r2 = 1;
        return r2;
    L_0x09a9:
        r2 = r46.m4912k();	 Catch:{ all -> 0x09c1 }
        r2.m16093y();	 Catch:{ all -> 0x09c1 }
        r2 = r46.m4912k();
        r2.m16094z();
        r2 = 0;
        return r2;
    L_0x09b9:
        r0 = move-exception;
    L_0x09ba:
        r2 = r0;
    L_0x09bb:
        if (r6 == 0) goto L_0x09c0;
    L_0x09bd:
        r6.close();	 Catch:{ all -> 0x09c1 }
    L_0x09c0:
        throw r2;	 Catch:{ all -> 0x09c1 }
    L_0x09c1:
        r0 = move-exception;
        r2 = r0;
        r3 = r46.m4912k();
        r3.m16094z();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.a(long):boolean");
    }

    private static boolean m4879a(kf kfVar, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return false;
        }
        kg[] kgVarArr = kfVar.f18270a;
        int length = kgVarArr.length;
        int i = 0;
        while (i < length) {
            kg kgVar = kgVarArr[i];
            if (str.equals(kgVar.f18276a)) {
                return ((obj instanceof Long) && obj.equals(kgVar.f18278c)) || (((obj instanceof String) && obj.equals(kgVar.f18277b)) || ((obj instanceof Double) && obj.equals(kgVar.f18279d)));
            } else {
                i++;
            }
        }
        return false;
    }

    private final boolean m4880a(String str, zzcfx com_google_android_gms_internal_zzcfx) {
        long round;
        gr grVar = this;
        String str2 = str;
        zzcfx com_google_android_gms_internal_zzcfx2 = com_google_android_gms_internal_zzcfx;
        Object string = com_google_android_gms_internal_zzcfx2.f18546b.f18544a.getString("currency");
        if ("ecommerce_purchase".equals(com_google_android_gms_internal_zzcfx2.f18545a)) {
            double doubleValue = Double.valueOf(com_google_android_gms_internal_zzcfx2.f18546b.f18544a.getDouble("value")).doubleValue() * 1000000.0d;
            if (doubleValue == 0.0d) {
                doubleValue = ((double) com_google_android_gms_internal_zzcfx2.f18546b.m16840b("value").longValue()) * 1000000.0d;
            }
            if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                m4906e().f18136c.m4848a("Data lost. Currency value is too big. appId", ft.m16220a(str), Double.valueOf(doubleValue));
                return false;
            }
            round = Math.round(doubleValue);
        } else {
            round = com_google_android_gms_internal_zzcfx2.f18546b.m16840b("value").longValue();
        }
        if (!TextUtils.isEmpty(string)) {
            String toUpperCase = string.toUpperCase(Locale.US);
            if (toUpperCase.matches("[A-Z]{3}")) {
                jt jtVar;
                String valueOf = String.valueOf("_ltv_");
                toUpperCase = String.valueOf(toUpperCase);
                valueOf = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                jt c = m4912k().m16083c(str2, valueOf);
                if (c != null) {
                    if (c.f6072e instanceof Long) {
                        long longValue = ((Long) c.f6072e).longValue();
                        jtVar = new jt(str2, com_google_android_gms_internal_zzcfx2.f18547c, valueOf, grVar.f5875i.mo1575a(), Long.valueOf(longValue + round));
                        if (!m4912k().m16075a(r12)) {
                            m4906e().f18134a.m4849a("Too many unique user properties are set. Ignoring user property. appId", ft.m16220a(str), m4911j().m16198c(r12.f6070c), r12.f6072e);
                            m4910i().m16610b(9, null, null, 0);
                        }
                    }
                }
                hp k = m4912k();
                int b = grVar.f5868b.m11921b(str2, fj.f5751G) - 1;
                ac.m4378a(str);
                k.mo1606c();
                k.m11975L();
                try {
                    k.m16057A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(b)});
                } catch (SQLiteException e) {
                    k.mo1623t().f18134a.m4848a("Error pruning currencies. appId", ft.m16220a(str), e);
                }
                jtVar = new jt(str2, com_google_android_gms_internal_zzcfx2.f18547c, valueOf, grVar.f5875i.mo1575a(), Long.valueOf(round));
                if (m4912k().m16075a(r12)) {
                    m4906e().f18134a.m4849a("Too many unique user properties are set. Ignoring user property. appId", ft.m16220a(str), m4911j().m16198c(r12.f6070c), r12.f6072e);
                    m4910i().m16610b(9, null, null, 0);
                }
            }
        }
        return true;
    }

    private final ke[] m4881a(String str, kk[] kkVarArr, kf[] kfVarArr) {
        ac.m4378a(str);
        return m4918q().m16037a(str, kfVarArr, kkVarArr);
    }

    private final com.google.android.gms.internal.zzcff m4882b(java.lang.String r24) {
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
        r23 = this;
        r1 = r24;
        r0 = r23.m4912k();
        r0 = r0.m16078b(r1);
        r2 = 0;
        if (r0 == 0) goto L_0x0085;
    L_0x000d:
        r3 = r0.m4795h();
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0085;
    L_0x0018:
        r15 = r23;
        r3 = r15.f5867a;	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = com.google.android.gms.internal.dz.m4762a(r3);	 Catch:{ NameNotFoundException -> 0x0047 }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = r3.m4760b(r1, r4);	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = r3.versionName;	 Catch:{ NameNotFoundException -> 0x0047 }
        r4 = r0.m4795h();	 Catch:{ NameNotFoundException -> 0x0047 }
        if (r4 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0047 }
    L_0x002d:
        r4 = r0.m4795h();	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = r4.equals(r3);	 Catch:{ NameNotFoundException -> 0x0047 }
        if (r3 != 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0047 }
    L_0x0037:
        r3 = r23.m4906e();	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = r3.f18136c;	 Catch:{ NameNotFoundException -> 0x0047 }
        r4 = "App version does not match; dropping. appId";	 Catch:{ NameNotFoundException -> 0x0047 }
        r5 = com.google.android.gms.internal.ft.m16220a(r24);	 Catch:{ NameNotFoundException -> 0x0047 }
        r3.m4847a(r4, r5);	 Catch:{ NameNotFoundException -> 0x0047 }
        return r2;
    L_0x0047:
        r21 = new com.google.android.gms.internal.zzcff;
        r2 = r0.m4780c();
        r3 = r0.m4795h();
        r4 = r0.m4797i();
        r6 = r0.m4799j();
        r7 = r0.m4800k();
        r9 = r0.m4801l();
        r11 = 0;
        r12 = r0.m4802m();
        r13 = 0;
        r14 = r0.m4786e();
        r16 = r0.m4808s();
        r18 = 0;
        r20 = 0;
        r22 = r0.m4809t();
        r0 = r21;
        r15 = r16;
        r17 = r18;
        r19 = r20;
        r20 = r22;
        r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14, r15, r17, r19, r20);
        return r21;
    L_0x0085:
        r0 = r23.m4906e();
        r0 = r0.f18139f;
        r3 = "No app data available; dropping";
        r0.m4847a(r3, r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.b(java.lang.String):com.google.android.gms.internal.zzcff");
    }

    private final void m4883b(zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff) {
        gr grVar = this;
        zzcfx com_google_android_gms_internal_zzcfx2 = com_google_android_gms_internal_zzcfx;
        zzcff com_google_android_gms_internal_zzcff2 = com_google_android_gms_internal_zzcff;
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        ac.m4378a(com_google_android_gms_internal_zzcff2.f18517a);
        long nanoTime = System.nanoTime();
        m4907f().mo1606c();
        m4888a();
        String str = com_google_android_gms_internal_zzcff2.f18517a;
        m4910i();
        if (!ju.m16569a(com_google_android_gms_internal_zzcfx, com_google_android_gms_internal_zzcff)) {
            return;
        }
        if (!com_google_android_gms_internal_zzcff2.f18524h) {
            m4904c(com_google_android_gms_internal_zzcff2);
        } else if (m4908g().m16299b(str, com_google_android_gms_internal_zzcfx2.f18545a)) {
            int i;
            es b;
            m4906e().f18136c.m4848a("Dropping blacklisted event. appId", ft.m16220a(str), m4911j().m16194a(com_google_android_gms_internal_zzcfx2.f18545a));
            if (!m4910i().m16626k(str)) {
                if (!m4910i().m16628l(str)) {
                    i = 0;
                    if (i == 0 && !"_err".equals(com_google_android_gms_internal_zzcfx2.f18545a)) {
                        m4910i().m16610b(11, "_ev", com_google_android_gms_internal_zzcfx2.f18545a, 0);
                    }
                    if (i != 0) {
                        b = m4912k().m16078b(str);
                        if (b != null) {
                            if (Math.abs(grVar.f5875i.mo1575a() - Math.max(b.m4805p(), b.m4804o())) > ((Long) fj.f5746B.f5786a).longValue()) {
                                m4906e().f18139f.m4846a("Fetching config for blacklisted app");
                                m4873a(b);
                            }
                        }
                    }
                }
            }
            i = 1;
            m4910i().m16610b(11, "_ev", com_google_android_gms_internal_zzcfx2.f18545a, 0);
            if (i != 0) {
                b = m4912k().m16078b(str);
                if (b != null) {
                    if (Math.abs(grVar.f5875i.mo1575a() - Math.max(b.m4805p(), b.m4804o())) > ((Long) fj.f5746B.f5786a).longValue()) {
                        m4906e().f18139f.m4846a("Fetching config for blacklisted app");
                        m4873a(b);
                    }
                }
            }
        } else {
            if (m4906e().m16227a(2)) {
                m4906e().f18140g.m4847a("Logging event", m4911j().m16193a(com_google_android_gms_internal_zzcfx2));
            }
            m4912k().m16092x();
            m4904c(com_google_android_gms_internal_zzcff2);
            if (("_iap".equals(com_google_android_gms_internal_zzcfx2.f18545a) || "ecommerce_purchase".equals(com_google_android_gms_internal_zzcfx2.f18545a)) && !m4880a(str, com_google_android_gms_internal_zzcfx2)) {
                m4912k().m16093y();
                m4912k().m16094z();
                return;
            }
            ki kiVar;
            try {
                boolean a = ju.m16570a(com_google_android_gms_internal_zzcfx2.f18545a);
                boolean equals = "_err".equals(com_google_android_gms_internal_zzcfx2.f18545a);
                ey a2 = m4912k().m16064a(m4866B(), str, true, a, false, equals, false);
                long intValue = a2.f5717b - ((long) ((Integer) fj.f5772m.f5786a).intValue());
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        m4906e().f18134a.m4848a("Data loss. Too many events logged. appId, count", ft.m16220a(str), Long.valueOf(a2.f5717b));
                    }
                    m4912k().m16093y();
                    m4912k().m16094z();
                    return;
                }
                ex k;
                boolean z;
                ff a3;
                if (a) {
                    intValue = a2.f5716a - ((long) ((Integer) fj.f5774o.f5786a).intValue());
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            m4906e().f18134a.m4848a("Data loss. Too many public events logged. appId, count", ft.m16220a(str), Long.valueOf(a2.f5716a));
                        }
                        m4910i().m16610b(16, "_ev", com_google_android_gms_internal_zzcfx2.f18545a, 0);
                        m4912k().m16093y();
                        m4912k().m16094z();
                        return;
                    }
                }
                if (equals) {
                    intValue = a2.f5719d - ((long) Math.max(0, Math.min(1000000, grVar.f5868b.m11921b(com_google_android_gms_internal_zzcff2.f18517a, fj.f5773n))));
                    if (intValue > 0) {
                        if (intValue == 1) {
                            m4906e().f18134a.m4848a("Too many error events logged. appId, count", ft.m16220a(str), Long.valueOf(a2.f5719d));
                        }
                        m4912k().m16093y();
                        m4912k().m16094z();
                        return;
                    }
                }
                Bundle a4 = com_google_android_gms_internal_zzcfx2.f18546b.m16838a();
                m4910i().m16597a(a4, "_o", com_google_android_gms_internal_zzcfx2.f18547c);
                if (m4910i().m16623i(str)) {
                    m4910i().m16597a(a4, "_dbg", Long.valueOf(1));
                    m4910i().m16597a(a4, "_r", Long.valueOf(1));
                }
                long c = m4912k().m16082c(str);
                if (c > 0) {
                    m4906e().f18136c.m4848a("Data lost. Too many events stored on disk, deleted. appId", ft.m16220a(str), Long.valueOf(c));
                }
                long j = nanoTime;
                nanoTime = 0;
                fe feVar = r1;
                String str2 = str;
                fe feVar2 = new fe(grVar, com_google_android_gms_internal_zzcfx2.f18547c, str, com_google_android_gms_internal_zzcfx2.f18545a, com_google_android_gms_internal_zzcfx2.f18548d, 0, a4);
                ff a5 = m4912k().m16065a(str2, feVar.f5729b);
                if (a5 == null) {
                    k = m4912k();
                    ac.m4378a(str2);
                    if (k.m16063a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str2}, 0) < 500 || !a) {
                        a5 = new ff(str2, feVar.f5729b, 0, 0, feVar.f5731d, 0, null, null, null);
                        z = false;
                    } else {
                        m4906e().f18134a.m4849a("Too many event names used, ignoring event. appId, name, supported count", ft.m16220a(str2), m4911j().m16194a(feVar.f5729b), Integer.valueOf(PacketWriter.QUEUE_SIZE));
                        m4910i().m16610b(8, null, null, 0);
                        m4912k().m16094z();
                        return;
                    }
                }
                z = false;
                feVar2 = new fe(grVar, feVar.f5730c, feVar.f5728a, feVar.f5729b, feVar.f5731d, a5.f5738e, feVar.f5733f);
                a3 = a5.m4822a(feVar2.f5731d);
                feVar = feVar2;
                m4912k().m16071a(a3);
                m4907f().mo1606c();
                m4888a();
                ac.m4376a((Object) feVar);
                ac.m4376a((Object) com_google_android_gms_internal_zzcff);
                ac.m4378a(feVar.f5728a);
                ac.m4385b(feVar.f5728a.equals(com_google_android_gms_internal_zzcff2.f18517a));
                kiVar = new ki();
                boolean z2 = true;
                kiVar.f18292a = Integer.valueOf(1);
                kiVar.f18300i = "android";
                kiVar.f18306o = com_google_android_gms_internal_zzcff2.f18517a;
                kiVar.f18305n = com_google_android_gms_internal_zzcff2.f18520d;
                kiVar.f18307p = com_google_android_gms_internal_zzcff2.f18519c;
                kiVar.f18285C = com_google_android_gms_internal_zzcff2.f18526j == -2147483648L ? null : Integer.valueOf((int) com_google_android_gms_internal_zzcff2.f18526j);
                kiVar.f18308q = Long.valueOf(com_google_android_gms_internal_zzcff2.f18521e);
                kiVar.f18316y = com_google_android_gms_internal_zzcff2.f18518b;
                kiVar.f18313v = com_google_android_gms_internal_zzcff2.f18522f == 0 ? null : Long.valueOf(com_google_android_gms_internal_zzcff2.f18522f);
                Pair a6 = m4905d().m16281a(com_google_android_gms_internal_zzcff2.f18517a);
                if (TextUtils.isEmpty((CharSequence) a6.first)) {
                    if (!m4916o().m16096a(grVar.f5867a)) {
                        String string = Secure.getString(grVar.f5867a.getContentResolver(), "android_id");
                        if (string == null) {
                            m4906e().f18136c.m4847a("null secure ID. appId", ft.m16220a(kiVar.f18306o));
                            string = "null";
                        } else if (string.isEmpty()) {
                            m4906e().f18136c.m4847a("empty secure ID. appId", ft.m16220a(kiVar.f18306o));
                        }
                        kiVar.f18286D = string;
                    }
                } else if (com_google_android_gms_internal_zzcff2.f18531o) {
                    kiVar.f18310s = (String) a6.first;
                    kiVar.f18311t = (Boolean) a6.second;
                }
                m4916o().m11975L();
                kiVar.f18302k = Build.MODEL;
                m4916o().m11975L();
                kiVar.f18301j = VERSION.RELEASE;
                kiVar.f18304m = Integer.valueOf((int) m4916o().m16119x());
                kiVar.f18303l = m4916o().m16120y();
                kiVar.f18309r = null;
                kiVar.f18295d = null;
                kiVar.f18296e = null;
                kiVar.f18297f = null;
                kiVar.f18288F = Long.valueOf(com_google_android_gms_internal_zzcff2.f18528l);
                if (m4920s() && ew.m11914B()) {
                    m4917p();
                    kiVar.f18289G = null;
                }
                es b2 = m4912k().m16078b(com_google_android_gms_internal_zzcff2.f18517a);
                if (b2 == null) {
                    b2 = new es(grVar, com_google_android_gms_internal_zzcff2.f18517a);
                    b2.m4774a(m4917p().m16149y());
                    b2.m4785d(com_google_android_gms_internal_zzcff2.f18527k);
                    b2.m4778b(com_google_android_gms_internal_zzcff2.f18518b);
                    b2.m4782c(m4905d().m16283b(com_google_android_gms_internal_zzcff2.f18517a));
                    b2.m4790f(0);
                    b2.m4773a(0);
                    b2.m4777b(0);
                    b2.m4788e(com_google_android_gms_internal_zzcff2.f18519c);
                    b2.m4781c(com_google_android_gms_internal_zzcff2.f18526j);
                    b2.m4791f(com_google_android_gms_internal_zzcff2.f18520d);
                    b2.m4784d(com_google_android_gms_internal_zzcff2.f18521e);
                    b2.m4787e(com_google_android_gms_internal_zzcff2.f18522f);
                    b2.m4775a(com_google_android_gms_internal_zzcff2.f18524h);
                    b2.m4798i(com_google_android_gms_internal_zzcff2.f18528l);
                    m4912k().m16070a(b2);
                }
                kiVar.f18312u = b2.m4776b();
                kiVar.f18284B = b2.m4786e();
                List a7 = m4912k().m16067a(com_google_android_gms_internal_zzcff2.f18517a);
                kiVar.f18294c = new kk[a7.size()];
                for (int i2 = z; i2 < a7.size(); i2++) {
                    kk kkVar = new kk();
                    kiVar.f18294c[i2] = kkVar;
                    kkVar.f18322b = ((jt) a7.get(i2)).f6070c;
                    kkVar.f18321a = Long.valueOf(((jt) a7.get(i2)).f6071d);
                    m4910i().m16599a(kkVar, ((jt) a7.get(i2)).f6072e);
                }
                long a8 = m4912k().m16061a(kiVar);
                k = m4912k();
                if (feVar.f5733f != null) {
                    Iterator it = feVar.f5733f.iterator();
                    while (it.hasNext()) {
                        if ("_r".equals((String) it.next())) {
                            break;
                        }
                    }
                    equals = m4908g().m16301c(feVar.f5728a, feVar.f5729b);
                    ey a9 = m4912k().m16064a(m4866B(), feVar.f5728a, false, false, false, false, false);
                    if (equals && a9.f5720e < ((long) grVar.f5868b.m11918a(feVar.f5728a))) {
                        if (k.m16074a(feVar, a8, z2)) {
                            grVar.f5863L = 0;
                        }
                        m4912k().m16093y();
                        if (m4906e().m16227a(2)) {
                            m4906e().f18140g.m4847a("Event recorded", m4911j().m16189a(feVar));
                        }
                        m4912k().m16094z();
                        m4922v();
                        m4906e().f18140g.m4847a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j) + 500000) / 1000000));
                    }
                }
                z2 = z;
                if (k.m16074a(feVar, a8, z2)) {
                    grVar.f5863L = 0;
                }
                m4912k().m16093y();
                if (m4906e().m16227a(2)) {
                    m4906e().f18140g.m4847a("Event recorded", m4911j().m16189a(feVar));
                }
                m4912k().m16094z();
                m4922v();
                m4906e().f18140g.m4847a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j) + 500000) / 1000000));
            } catch (IOException e) {
                m4906e().f18134a.m4848a("Data loss. Failed to insert raw event metadata. appId", ft.m16220a(kiVar.f18306o), e);
            } catch (Throwable th) {
                Throwable th2 = th;
                m4912k().m16094z();
            }
        }
    }

    static void m4884t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private final gb m4885y() {
        if (this.f5890y != null) {
            return this.f5890y;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final jq m4886z() {
        m4876a(this.f5891z);
        return this.f5891z;
    }

    public final String m4887a(String str) {
        try {
            return (String) m4907f().m16334a(new gt(this, str)).get(30000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            m4906e().f18134a.m4848a("Failed to get app instance id. appId", ft.m16220a(str), e);
            return null;
        }
    }

    final void m4888a() {
        if (!this.f5854C) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    protected final void m4889a(int i, Throwable th, byte[] bArr) {
        m4907f().mo1606c();
        m4888a();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f5865N = false;
                m4869E();
            }
        }
        List<Long> list = this.f5860I;
        this.f5860I = null;
        int i2 = 1;
        if ((i == 200 || i == 204) && th == null) {
            try {
                m4905d().f18148c.m4855a(this.f5875i.mo1575a());
                m4905d().f18149d.m4855a(0);
                m4922v();
                m4906e().f18140g.m4848a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                m4912k().m16092x();
                hp k;
                try {
                    for (Long l : list) {
                        k = m4912k();
                        long longValue = l.longValue();
                        k.mo1606c();
                        k.m11975L();
                        if (k.m16057A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    m4912k().m16093y();
                    m4912k().m16094z();
                    if (m4913l().m16275y() && m4867C()) {
                        m4921u();
                    } else {
                        this.f5862K = -1;
                        m4922v();
                    }
                    this.f5863L = 0;
                } catch (SQLiteException e) {
                    k.mo1623t().f18134a.m4847a("Failed to delete a bundle in a queue table", e);
                    throw e;
                } catch (Throwable th3) {
                    m4912k().m16094z();
                }
            } catch (SQLiteException e2) {
                m4906e().f18134a.m4847a("Database error while trying to delete uploaded bundles", e2);
                this.f5863L = this.f5875i.mo1576b();
                m4906e().f18140g.m4847a("Disable upload, time", Long.valueOf(this.f5863L));
            }
        } else {
            m4906e().f18140g.m4848a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            m4905d().f18149d.m4855a(this.f5875i.mo1575a());
            if (i != 503) {
                if (i != 429) {
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                m4905d().f18150e.m4855a(this.f5875i.mo1575a());
            }
            m4922v();
        }
        this.f5865N = false;
        m4869E();
    }

    final void m4890a(zzcff com_google_android_gms_internal_zzcff) {
        m4912k().m16078b(com_google_android_gms_internal_zzcff.f18517a);
        hp k = m4912k();
        String str = com_google_android_gms_internal_zzcff.f18517a;
        ac.m4378a(str);
        k.mo1606c();
        k.m11975L();
        try {
            SQLiteDatabase A = k.m16057A();
            String[] strArr = new String[]{str};
            int delete = (((((((0 + A.delete("apps", "app_id=?", strArr)) + A.delete("events", "app_id=?", strArr)) + A.delete("user_attributes", "app_id=?", strArr)) + A.delete("conditional_properties", "app_id=?", strArr)) + A.delete("raw_events", "app_id=?", strArr)) + A.delete("raw_events_metadata", "app_id=?", strArr)) + A.delete("queue", "app_id=?", strArr)) + A.delete("audience_filter_values", "app_id=?", strArr);
            if (delete > 0) {
                k.mo1623t().f18140g.m4848a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            k.mo1623t().f18134a.m4848a("Error resetting analytics data. appId, error", ft.m16220a(str), e);
        }
        m4897b(m4872a(this.f5867a, com_google_android_gms_internal_zzcff.f18517a, com_google_android_gms_internal_zzcff.f18518b, com_google_android_gms_internal_zzcff.f18524h, com_google_android_gms_internal_zzcff.f18531o));
    }

    final void m4891a(zzcfi com_google_android_gms_internal_zzcfi) {
        zzcff b = m4882b(com_google_android_gms_internal_zzcfi.f18532a);
        if (b != null) {
            m4892a(com_google_android_gms_internal_zzcfi, b);
        }
    }

    final void m4892a(zzcfi com_google_android_gms_internal_zzcfi, zzcff com_google_android_gms_internal_zzcff) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        ac.m4378a(com_google_android_gms_internal_zzcfi.f18532a);
        ac.m4376a(com_google_android_gms_internal_zzcfi.f18533b);
        ac.m4376a(com_google_android_gms_internal_zzcfi.f18534c);
        ac.m4378a(com_google_android_gms_internal_zzcfi.f18534c.f18549a);
        m4907f().mo1606c();
        m4888a();
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b)) {
            if (com_google_android_gms_internal_zzcff.f18524h) {
                zzcfi com_google_android_gms_internal_zzcfi2 = new zzcfi(com_google_android_gms_internal_zzcfi);
                boolean z = false;
                com_google_android_gms_internal_zzcfi2.f18536e = false;
                m4912k().m16092x();
                try {
                    fv fvVar;
                    String str;
                    Object obj;
                    Object c;
                    Object a;
                    zzcfi d = m4912k().m16084d(com_google_android_gms_internal_zzcfi2.f18532a, com_google_android_gms_internal_zzcfi2.f18534c.f18549a);
                    if (!(d == null || d.f18533b.equals(com_google_android_gms_internal_zzcfi2.f18533b))) {
                        m4906e().f18136c.m4849a("Updating a conditional user property with different origin. name, origin, origin (from DB)", m4911j().m16198c(com_google_android_gms_internal_zzcfi2.f18534c.f18549a), com_google_android_gms_internal_zzcfi2.f18533b, d.f18533b);
                    }
                    if (d != null && d.f18536e) {
                        com_google_android_gms_internal_zzcfi2.f18533b = d.f18533b;
                        com_google_android_gms_internal_zzcfi2.f18535d = d.f18535d;
                        com_google_android_gms_internal_zzcfi2.f18539h = d.f18539h;
                        com_google_android_gms_internal_zzcfi2.f18537f = d.f18537f;
                        com_google_android_gms_internal_zzcfi2.f18540i = d.f18540i;
                        com_google_android_gms_internal_zzcfi2.f18536e = d.f18536e;
                        com_google_android_gms_internal_zzcfi2.f18534c = new zzckk(com_google_android_gms_internal_zzcfi2.f18534c.f18549a, d.f18534c.f18550b, com_google_android_gms_internal_zzcfi2.f18534c.m16841a(), d.f18534c.f18551c);
                    } else if (TextUtils.isEmpty(com_google_android_gms_internal_zzcfi2.f18537f)) {
                        com_google_android_gms_internal_zzcfi2.f18534c = new zzckk(com_google_android_gms_internal_zzcfi2.f18534c.f18549a, com_google_android_gms_internal_zzcfi2.f18535d, com_google_android_gms_internal_zzcfi2.f18534c.m16841a(), com_google_android_gms_internal_zzcfi2.f18534c.f18551c);
                        com_google_android_gms_internal_zzcfi2.f18536e = true;
                        z = true;
                    }
                    if (com_google_android_gms_internal_zzcfi2.f18536e) {
                        fv fvVar2;
                        String str2;
                        Object obj2;
                        Object c2;
                        Object obj3;
                        zzckk com_google_android_gms_internal_zzckk = com_google_android_gms_internal_zzcfi2.f18534c;
                        jt jtVar = new jt(com_google_android_gms_internal_zzcfi2.f18532a, com_google_android_gms_internal_zzcfi2.f18533b, com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.f18550b, com_google_android_gms_internal_zzckk.m16841a());
                        if (m4912k().m16075a(jtVar)) {
                            fvVar2 = m4906e().f18139f;
                            str2 = "User property updated immediately";
                            obj2 = com_google_android_gms_internal_zzcfi2.f18532a;
                            c2 = m4911j().m16198c(jtVar.f6070c);
                            obj3 = jtVar.f6072e;
                        } else {
                            fvVar2 = m4906e().f18134a;
                            str2 = "(2)Too many active user properties, ignoring";
                            obj2 = ft.m16220a(com_google_android_gms_internal_zzcfi2.f18532a);
                            c2 = m4911j().m16198c(jtVar.f6070c);
                            obj3 = jtVar.f6072e;
                        }
                        fvVar2.m4849a(str2, obj2, c2, obj3);
                        if (z && com_google_android_gms_internal_zzcfi2.f18540i != null) {
                            m4883b(new zzcfx(com_google_android_gms_internal_zzcfi2.f18540i, com_google_android_gms_internal_zzcfi2.f18535d), com_google_android_gms_internal_zzcff);
                        }
                    }
                    if (m4912k().m16077a(com_google_android_gms_internal_zzcfi2)) {
                        fvVar = m4906e().f18139f;
                        str = "Conditional property added";
                        obj = com_google_android_gms_internal_zzcfi2.f18532a;
                        c = m4911j().m16198c(com_google_android_gms_internal_zzcfi2.f18534c.f18549a);
                        a = com_google_android_gms_internal_zzcfi2.f18534c.m16841a();
                    } else {
                        fvVar = m4906e().f18134a;
                        str = "Too many conditional properties, ignoring";
                        obj = ft.m16220a(com_google_android_gms_internal_zzcfi2.f18532a);
                        c = m4911j().m16198c(com_google_android_gms_internal_zzcfi2.f18534c.f18549a);
                        a = com_google_android_gms_internal_zzcfi2.f18534c.m16841a();
                    }
                    fvVar.m4849a(str, obj, c, a);
                    m4912k().m16093y();
                } finally {
                    m4912k().m16094z();
                }
            } else {
                m4904c(com_google_android_gms_internal_zzcff);
            }
        }
    }

    final void m4893a(zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff) {
        gr grVar = this;
        zzcfx com_google_android_gms_internal_zzcfx2 = com_google_android_gms_internal_zzcfx;
        zzcff com_google_android_gms_internal_zzcff2 = com_google_android_gms_internal_zzcff;
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        ac.m4378a(com_google_android_gms_internal_zzcff2.f18517a);
        m4907f().mo1606c();
        m4888a();
        String str = com_google_android_gms_internal_zzcff2.f18517a;
        long j = com_google_android_gms_internal_zzcfx2.f18548d;
        m4910i();
        if (!ju.m16569a(com_google_android_gms_internal_zzcfx, com_google_android_gms_internal_zzcff)) {
            return;
        }
        if (com_google_android_gms_internal_zzcff2.f18524h) {
            m4912k().m16092x();
            try {
                List emptyList;
                Object obj;
                List emptyList2;
                hp k = m4912k();
                ac.m4378a(str);
                k.mo1606c();
                k.m11975L();
                if (j < 0) {
                    k.mo1623t().f18136c.m4848a("Invalid time querying timed out conditional properties", ft.m16220a(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = k.m16080b("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzcfi com_google_android_gms_internal_zzcfi : r5) {
                    if (com_google_android_gms_internal_zzcfi != null) {
                        m4906e().f18139f.m4849a("User property timed out", com_google_android_gms_internal_zzcfi.f18532a, m4911j().m16198c(com_google_android_gms_internal_zzcfi.f18534c.f18549a), com_google_android_gms_internal_zzcfi.f18534c.m16841a());
                        if (com_google_android_gms_internal_zzcfi.f18538g != null) {
                            m4883b(new zzcfx(com_google_android_gms_internal_zzcfi.f18538g, j), com_google_android_gms_internal_zzcff2);
                        }
                        m4912k().m16086e(str, com_google_android_gms_internal_zzcfi.f18534c.f18549a);
                    }
                }
                k = m4912k();
                ac.m4378a(str);
                k.mo1606c();
                k.m11975L();
                if (j < 0) {
                    k.mo1623t().f18136c.m4848a("Invalid time querying expired conditional properties", ft.m16220a(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = k.m16080b("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                List arrayList = new ArrayList(r5.size());
                for (zzcfi com_google_android_gms_internal_zzcfi2 : r5) {
                    if (com_google_android_gms_internal_zzcfi2 != null) {
                        m4906e().f18139f.m4849a("User property expired", com_google_android_gms_internal_zzcfi2.f18532a, m4911j().m16198c(com_google_android_gms_internal_zzcfi2.f18534c.f18549a), com_google_android_gms_internal_zzcfi2.f18534c.m16841a());
                        m4912k().m16081b(str, com_google_android_gms_internal_zzcfi2.f18534c.f18549a);
                        if (com_google_android_gms_internal_zzcfi2.f18542k != null) {
                            arrayList.add(com_google_android_gms_internal_zzcfi2.f18542k);
                        }
                        m4912k().m16086e(str, com_google_android_gms_internal_zzcfi2.f18534c.f18549a);
                    }
                }
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    obj = arrayList2.get(i);
                    i++;
                    m4883b(new zzcfx((zzcfx) obj, j), com_google_android_gms_internal_zzcff2);
                }
                k = m4912k();
                String str2 = com_google_android_gms_internal_zzcfx2.f18545a;
                ac.m4378a(str);
                ac.m4378a(str2);
                k.mo1606c();
                k.m11975L();
                if (j < 0) {
                    k.mo1623t().f18136c.m4849a("Invalid time querying triggered conditional properties", ft.m16220a(str), k.mo1618o().m16194a(str2), Long.valueOf(j));
                    emptyList2 = Collections.emptyList();
                } else {
                    emptyList2 = k.m16080b("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                List arrayList3 = new ArrayList(emptyList2.size());
                Iterator it = emptyList2.iterator();
                while (it.hasNext()) {
                    zzcfi com_google_android_gms_internal_zzcfi3 = (zzcfi) it.next();
                    if (com_google_android_gms_internal_zzcfi3 != null) {
                        fv fvVar;
                        Object c;
                        Object obj2;
                        zzckk com_google_android_gms_internal_zzckk = com_google_android_gms_internal_zzcfi3.f18534c;
                        jt jtVar = r5;
                        Iterator it2 = it;
                        zzcfi com_google_android_gms_internal_zzcfi4 = com_google_android_gms_internal_zzcfi3;
                        jt jtVar2 = new jt(com_google_android_gms_internal_zzcfi3.f18532a, com_google_android_gms_internal_zzcfi3.f18533b, com_google_android_gms_internal_zzckk.f18549a, j, com_google_android_gms_internal_zzckk.m16841a());
                        if (m4912k().m16075a(jtVar)) {
                            fvVar = m4906e().f18139f;
                            str2 = "User property triggered";
                            obj = com_google_android_gms_internal_zzcfi4.f18532a;
                            c = m4911j().m16198c(jtVar.f6070c);
                            obj2 = jtVar.f6072e;
                        } else {
                            fvVar = m4906e().f18134a;
                            str2 = "Too many active user properties, ignoring";
                            obj = ft.m16220a(com_google_android_gms_internal_zzcfi4.f18532a);
                            c = m4911j().m16198c(jtVar.f6070c);
                            obj2 = jtVar.f6072e;
                        }
                        fvVar.m4849a(str2, obj, c, obj2);
                        if (com_google_android_gms_internal_zzcfi4.f18540i != null) {
                            arrayList3.add(com_google_android_gms_internal_zzcfi4.f18540i);
                        }
                        com_google_android_gms_internal_zzcfi4.f18534c = new zzckk(jtVar);
                        com_google_android_gms_internal_zzcfi4.f18536e = true;
                        m4912k().m16077a(com_google_android_gms_internal_zzcfi4);
                        it = it2;
                    }
                }
                m4883b(com_google_android_gms_internal_zzcfx, com_google_android_gms_internal_zzcff);
                ArrayList arrayList4 = (ArrayList) arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList4.get(i2);
                    i2++;
                    m4883b(new zzcfx((zzcfx) obj3, j), com_google_android_gms_internal_zzcff2);
                }
                m4912k().m16093y();
                m4912k().m16094z();
            } catch (Throwable th) {
                Throwable th2 = th;
                m4912k().m16094z();
            }
        } else {
            m4904c(com_google_android_gms_internal_zzcff2);
        }
    }

    final void m4894a(com.google.android.gms.internal.zzcfx r26, java.lang.String r27) {
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
        r25 = this;
        r0 = r25;
        r1 = r26;
        r3 = r27;
        r2 = r25.m4912k();
        r2 = r2.m16078b(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0010:
        r4 = r2.m4795h();
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 == 0) goto L_0x001c;
    L_0x001a:
        goto L_0x00ab;
    L_0x001c:
        r4 = r0.f5867a;	 Catch:{ NameNotFoundException -> 0x0049 }
        r4 = com.google.android.gms.internal.dz.m4762a(r4);	 Catch:{ NameNotFoundException -> 0x0049 }
        r5 = 0;	 Catch:{ NameNotFoundException -> 0x0049 }
        r4 = r4.m4760b(r3, r5);	 Catch:{ NameNotFoundException -> 0x0049 }
        r4 = r4.versionName;	 Catch:{ NameNotFoundException -> 0x0049 }
        r5 = r2.m4795h();	 Catch:{ NameNotFoundException -> 0x0049 }
        if (r5 == 0) goto L_0x0062;	 Catch:{ NameNotFoundException -> 0x0049 }
    L_0x002f:
        r5 = r2.m4795h();	 Catch:{ NameNotFoundException -> 0x0049 }
        r4 = r5.equals(r4);	 Catch:{ NameNotFoundException -> 0x0049 }
        if (r4 != 0) goto L_0x0062;	 Catch:{ NameNotFoundException -> 0x0049 }
    L_0x0039:
        r4 = r25.m4906e();	 Catch:{ NameNotFoundException -> 0x0049 }
        r4 = r4.f18136c;	 Catch:{ NameNotFoundException -> 0x0049 }
        r5 = "App version does not match; dropping event. appId";	 Catch:{ NameNotFoundException -> 0x0049 }
        r6 = com.google.android.gms.internal.ft.m16220a(r27);	 Catch:{ NameNotFoundException -> 0x0049 }
        r4.m4847a(r5, r6);	 Catch:{ NameNotFoundException -> 0x0049 }
        return;
    L_0x0049:
        r4 = "_ui";
        r5 = r1.f18545a;
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x0062;
    L_0x0053:
        r4 = r25.m4906e();
        r4 = r4.f18136c;
        r5 = "Could not find package. appId";
        r6 = com.google.android.gms.internal.ft.m16220a(r27);
        r4.m4847a(r5, r6);
    L_0x0062:
        r15 = new com.google.android.gms.internal.zzcff;
        r4 = r2.m4780c();
        r5 = r2.m4795h();
        r6 = r2.m4797i();
        r8 = r2.m4799j();
        r9 = r2.m4800k();
        r11 = r2.m4801l();
        r13 = 0;
        r14 = r2.m4802m();
        r16 = 0;
        r17 = r2.m4786e();
        r18 = r2.m4808s();
        r20 = 0;
        r22 = 0;
        r23 = r2.m4809t();
        r2 = r15;
        r24 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r18;
        r19 = r20;
        r21 = r22;
        r22 = r23;
        r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r21, r22);
        r2 = r24;
        r0.m4893a(r1, r2);
        return;
    L_0x00ab:
        r1 = r25.m4906e();
        r1 = r1.f18139f;
        r2 = "No app data available; dropping event";
        r1.m4847a(r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.a(com.google.android.gms.internal.zzcfx, java.lang.String):void");
    }

    final void m4895a(zzckk com_google_android_gms_internal_zzckk, zzcff com_google_android_gms_internal_zzcff) {
        m4907f().mo1606c();
        m4888a();
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b)) {
            if (com_google_android_gms_internal_zzcff.f18524h) {
                int d = m4910i().m16614d(com_google_android_gms_internal_zzckk.f18549a);
                int i = 0;
                String a;
                ju i2;
                String str;
                if (d != 0) {
                    m4910i();
                    a = ju.m16563a(com_google_android_gms_internal_zzckk.f18549a, 24, true);
                    if (com_google_android_gms_internal_zzckk.f18549a != null) {
                        i = com_google_android_gms_internal_zzckk.f18549a.length();
                    }
                    i2 = m4910i();
                    str = com_google_android_gms_internal_zzcff.f18517a;
                    i2.m16610b(d, "_ev", a, i);
                    return;
                }
                d = m4910i().m16607b(com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.m16841a());
                if (d != 0) {
                    m4910i();
                    a = ju.m16563a(com_google_android_gms_internal_zzckk.f18549a, 24, true);
                    Object a2 = com_google_android_gms_internal_zzckk.m16841a();
                    if (a2 != null && ((a2 instanceof String) || (a2 instanceof CharSequence))) {
                        i = String.valueOf(a2).length();
                    }
                    i2 = m4910i();
                    str = com_google_android_gms_internal_zzcff.f18517a;
                    i2.m16610b(d, "_ev", a, i);
                    return;
                }
                m4910i();
                Object c = ju.m16580c(com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.m16841a());
                if (c != null) {
                    jt jtVar = new jt(com_google_android_gms_internal_zzcff.f18517a, com_google_android_gms_internal_zzckk.f18551c, com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.f18550b, c);
                    m4906e().f18139f.m4848a("Setting user property", m4911j().m16198c(jtVar.f6070c), c);
                    m4912k().m16092x();
                    try {
                        m4904c(com_google_android_gms_internal_zzcff);
                        boolean a3 = m4912k().m16075a(jtVar);
                        m4912k().m16093y();
                        if (a3) {
                            m4906e().f18139f.m4848a("User property set", m4911j().m16198c(jtVar.f6070c), jtVar.f6072e);
                        } else {
                            m4906e().f18134a.m4848a("Too many unique user properties are set. Ignoring user property", m4911j().m16198c(jtVar.f6070c), jtVar.f6072e);
                            i2 = m4910i();
                            str = com_google_android_gms_internal_zzcff.f18517a;
                            i2.m16610b(9, null, null, 0);
                        }
                        m4912k().m16094z();
                        return;
                    } catch (Throwable th) {
                        m4912k().m16094z();
                    }
                } else {
                    return;
                }
            }
            m4904c(com_google_android_gms_internal_zzcff);
        }
    }

    final void m4896a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        m4907f().mo1606c();
        m4888a();
        ac.m4378a(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f5864M = false;
                m4869E();
            }
        }
        m4906e().f18140g.m4847a("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        m4912k().m16092x();
        es b = m4912k().m16078b(str);
        boolean z = true;
        boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
        if (b == null) {
            m4906e().f18136c.m4847a("App does not exist in onConfigFetched. appId", ft.m16220a(str));
        } else {
            if (!z2) {
                if (i != 404) {
                    b.m4796h(this.f5875i.mo1575a());
                    m4912k().m16070a(b);
                    m4906e().f18140g.m4848a("Fetching config failed. code, error", Integer.valueOf(i), th);
                    hp g = m4908g();
                    g.mo1606c();
                    g.f18171b.put(str, null);
                    m4905d().f18149d.m4855a(this.f5875i.mo1575a());
                    if (i != 503) {
                        if (i != 429) {
                            z = false;
                        }
                    }
                    if (z) {
                        m4905d().f18150e.m4855a(this.f5875i.mo1575a());
                    }
                    m4922v();
                }
            }
            List list = map != null ? (List) map.get("Last-Modified") : null;
            String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
            if (i != 404) {
                if (i != 304) {
                    m4908g().m16297a(str, bArr, str2);
                    b.m4793g(this.f5875i.mo1575a());
                    m4912k().m16070a(b);
                    if (i != 404) {
                        m4906e().f18137d.m4847a("Config not found. Using empty config. appId", str);
                    } else {
                        m4906e().f18140g.m4848a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    }
                    if (m4913l().m16275y() && m4867C()) {
                        m4921u();
                    }
                    m4922v();
                }
            }
            if (m4908g().m16294a(str) == null) {
                m4908g().m16297a(str, null, null);
            }
            b.m4793g(this.f5875i.mo1575a());
            m4912k().m16070a(b);
            if (i != 404) {
                m4906e().f18140g.m4848a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
            } else {
                m4906e().f18137d.m4847a("Config not found. Using empty config. appId", str);
            }
            m4921u();
        }
        m4912k().m16093y();
        m4912k().m16094z();
        this.f5864M = false;
        m4869E();
    }

    public final void m4897b(zzcff com_google_android_gms_internal_zzcff) {
        gr grVar = this;
        zzcff com_google_android_gms_internal_zzcff2 = com_google_android_gms_internal_zzcff;
        m4907f().mo1606c();
        m4888a();
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        ac.m4378a(com_google_android_gms_internal_zzcff2.f18517a);
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcff2.f18518b)) {
            es b = m4912k().m16078b(com_google_android_gms_internal_zzcff2.f18517a);
            if (!(b == null || !TextUtils.isEmpty(b.m4780c()) || TextUtils.isEmpty(com_google_android_gms_internal_zzcff2.f18518b))) {
                b.m4793g(0);
                m4912k().m16070a(b);
                hp g = m4908g();
                String str = com_google_android_gms_internal_zzcff2.f18517a;
                g.mo1606c();
                g.f18170a.remove(str);
            }
            if (com_google_android_gms_internal_zzcff2.f18524h) {
                es b2;
                ex k;
                String str2;
                String str3;
                ff ffVar;
                long j;
                long j2;
                Bundle bundle;
                PackageInfo b3;
                int i;
                ApplicationInfo a;
                hp k2;
                zzcfx com_google_android_gms_internal_zzcfx;
                long j3 = com_google_android_gms_internal_zzcff2.f18529m;
                if (j3 == 0) {
                    j3 = grVar.f5875i.mo1575a();
                }
                int i2 = com_google_android_gms_internal_zzcff2.f18530n;
                if (!(i2 == 0 || i2 == 1)) {
                    m4906e().f18136c.m4848a("Incorrect app type, assuming installed app. appId, appType", ft.m16220a(com_google_android_gms_internal_zzcff2.f18517a), Integer.valueOf(i2));
                    i2 = 0;
                }
                m4912k().m16092x();
                hp k3;
                String a2;
                try {
                    b2 = m4912k().m16078b(com_google_android_gms_internal_zzcff2.f18517a);
                    if (!(b2 == null || b2.m4780c() == null || b2.m4780c().equals(com_google_android_gms_internal_zzcff2.f18518b))) {
                        m4906e().f18136c.m4847a("New GMP App Id passed in. Removing cached database data. appId", ft.m16220a(b2.m4772a()));
                        k3 = m4912k();
                        a2 = b2.m4772a();
                        k3.m11975L();
                        k3.mo1606c();
                        ac.m4378a(a2);
                        SQLiteDatabase A = k3.m16057A();
                        String[] strArr = new String[]{a2};
                        int delete = ((((((((A.delete("events", "app_id=?", strArr) + 0) + A.delete("user_attributes", "app_id=?", strArr)) + A.delete("conditional_properties", "app_id=?", strArr)) + A.delete("apps", "app_id=?", strArr)) + A.delete("raw_events", "app_id=?", strArr)) + A.delete("raw_events_metadata", "app_id=?", strArr)) + A.delete("event_filters", "app_id=?", strArr)) + A.delete("property_filters", "app_id=?", strArr)) + A.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            k3.mo1623t().f18140g.m4848a("Deleted application data. app, records", a2, Integer.valueOf(delete));
                        }
                        b2 = null;
                    }
                } catch (SQLiteException e) {
                    k3.mo1623t().f18134a.m4848a("Error deleting application data. appId, error", ft.m16220a(a2), e);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    m4912k().m16094z();
                }
                if (!(b2 == null || b2.m4795h() == null || b2.m4795h().equals(com_google_android_gms_internal_zzcff2.f18519c))) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", b2.m4795h());
                    m4893a(new zzcfx("_au", new zzcfu(bundle2), "auto", j3), com_google_android_gms_internal_zzcff2);
                }
                m4904c(com_google_android_gms_internal_zzcff);
                if (i2 == 0) {
                    k = m4912k();
                    str2 = com_google_android_gms_internal_zzcff2.f18517a;
                    str3 = "_f";
                } else if (i2 == 1) {
                    k = m4912k();
                    str2 = com_google_android_gms_internal_zzcff2.f18517a;
                    str3 = "_v";
                } else {
                    ffVar = null;
                    if (ffVar != null) {
                        j = 3600000 * (1 + (j3 / 3600000));
                        if (i2 != 0) {
                            j2 = 1;
                            m4895a(new zzckk("_fot", j3, Long.valueOf(j), "auto"), com_google_android_gms_internal_zzcff2);
                            m4907f().mo1606c();
                            m4888a();
                            bundle = new Bundle();
                            bundle.putLong("_c", j2);
                            bundle.putLong("_r", j2);
                            bundle.putLong("_uwa", 0);
                            bundle.putLong("_pfo", 0);
                            bundle.putLong("_sys", 0);
                            bundle.putLong("_sysu", 0);
                            if (grVar.f5867a.getPackageManager() != null) {
                                m4906e().f18134a.m4847a("PackageManager is null, first open report might be inaccurate. appId", ft.m16220a(com_google_android_gms_internal_zzcff2.f18517a));
                            } else {
                                try {
                                    b3 = dz.m4762a(grVar.f5867a).m4760b(com_google_android_gms_internal_zzcff2.f18517a, 0);
                                } catch (NameNotFoundException e2) {
                                    m4906e().f18134a.m4848a("Package info is null, first open report might be inaccurate. appId", ft.m16220a(com_google_android_gms_internal_zzcff2.f18517a), e2);
                                    b3 = null;
                                }
                                if (!(b3 == null || b3.firstInstallTime == 0)) {
                                    if (b3.firstInstallTime == b3.lastUpdateTime) {
                                        bundle.putLong("_uwa", j2);
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    m4895a(new zzckk("_fi", j3, Long.valueOf(i == 0 ? j2 : 0), "auto"), com_google_android_gms_internal_zzcff2);
                                }
                                try {
                                    a = dz.m4762a(grVar.f5867a).m4757a(com_google_android_gms_internal_zzcff2.f18517a, 0);
                                } catch (NameNotFoundException e22) {
                                    m4906e().f18134a.m4848a("Application info is null, first open report might be inaccurate. appId", ft.m16220a(com_google_android_gms_internal_zzcff2.f18517a), e22);
                                    a = null;
                                }
                                if (a != null) {
                                    if ((a.flags & 1) != 0) {
                                        bundle.putLong("_sys", j2);
                                    }
                                    if ((a.flags & 128) != 0) {
                                        bundle.putLong("_sysu", j2);
                                    }
                                }
                            }
                            k2 = m4912k();
                            str2 = com_google_android_gms_internal_zzcff2.f18517a;
                            ac.m4378a(str2);
                            k2.mo1606c();
                            k2.m11975L();
                            j = k2.m16090h(str2, "first_open_count");
                            if (j >= 0) {
                                bundle.putLong("_pfo", j);
                            }
                            com_google_android_gms_internal_zzcfx = new zzcfx("_f", new zzcfu(bundle), "auto", j3);
                        } else {
                            j2 = 1;
                            if (i2 == 1) {
                                m4895a(new zzckk("_fvt", j3, Long.valueOf(j), "auto"), com_google_android_gms_internal_zzcff2);
                                m4907f().mo1606c();
                                m4888a();
                                bundle = new Bundle();
                                bundle.putLong("_c", j2);
                                bundle.putLong("_r", j2);
                                com_google_android_gms_internal_zzcfx = new zzcfx("_v", new zzcfu(bundle), "auto", j3);
                            }
                            bundle = new Bundle();
                            bundle.putLong("_et", j2);
                            com_google_android_gms_internal_zzcfx = new zzcfx("_e", new zzcfu(bundle), "auto", j3);
                        }
                        m4893a(r14, com_google_android_gms_internal_zzcff2);
                        bundle = new Bundle();
                        bundle.putLong("_et", j2);
                        com_google_android_gms_internal_zzcfx = new zzcfx("_e", new zzcfu(bundle), "auto", j3);
                    } else {
                        if (com_google_android_gms_internal_zzcff2.f18525i) {
                            com_google_android_gms_internal_zzcfx = new zzcfx("_cd", new zzcfu(new Bundle()), "auto", j3);
                        }
                        m4912k().m16093y();
                        m4912k().m16094z();
                        return;
                    }
                    m4893a(r4, com_google_android_gms_internal_zzcff2);
                    m4912k().m16093y();
                    m4912k().m16094z();
                    return;
                }
                ffVar = k.m16065a(str2, str3);
                if (ffVar != null) {
                    if (com_google_android_gms_internal_zzcff2.f18525i) {
                        com_google_android_gms_internal_zzcfx = new zzcfx("_cd", new zzcfu(new Bundle()), "auto", j3);
                    }
                    m4912k().m16093y();
                    m4912k().m16094z();
                    return;
                }
                j = 3600000 * (1 + (j3 / 3600000));
                if (i2 != 0) {
                    j2 = 1;
                    if (i2 == 1) {
                        m4895a(new zzckk("_fvt", j3, Long.valueOf(j), "auto"), com_google_android_gms_internal_zzcff2);
                        m4907f().mo1606c();
                        m4888a();
                        bundle = new Bundle();
                        bundle.putLong("_c", j2);
                        bundle.putLong("_r", j2);
                        com_google_android_gms_internal_zzcfx = new zzcfx("_v", new zzcfu(bundle), "auto", j3);
                    }
                    bundle = new Bundle();
                    bundle.putLong("_et", j2);
                    com_google_android_gms_internal_zzcfx = new zzcfx("_e", new zzcfu(bundle), "auto", j3);
                } else {
                    j2 = 1;
                    m4895a(new zzckk("_fot", j3, Long.valueOf(j), "auto"), com_google_android_gms_internal_zzcff2);
                    m4907f().mo1606c();
                    m4888a();
                    bundle = new Bundle();
                    bundle.putLong("_c", j2);
                    bundle.putLong("_r", j2);
                    bundle.putLong("_uwa", 0);
                    bundle.putLong("_pfo", 0);
                    bundle.putLong("_sys", 0);
                    bundle.putLong("_sysu", 0);
                    if (grVar.f5867a.getPackageManager() != null) {
                        b3 = dz.m4762a(grVar.f5867a).m4760b(com_google_android_gms_internal_zzcff2.f18517a, 0);
                        if (b3.firstInstallTime == b3.lastUpdateTime) {
                            i = 1;
                        } else {
                            bundle.putLong("_uwa", j2);
                            i = 0;
                        }
                        if (i == 0) {
                        }
                        m4895a(new zzckk("_fi", j3, Long.valueOf(i == 0 ? j2 : 0), "auto"), com_google_android_gms_internal_zzcff2);
                        a = dz.m4762a(grVar.f5867a).m4757a(com_google_android_gms_internal_zzcff2.f18517a, 0);
                        if (a != null) {
                            if ((a.flags & 1) != 0) {
                                bundle.putLong("_sys", j2);
                            }
                            if ((a.flags & 128) != 0) {
                                bundle.putLong("_sysu", j2);
                            }
                        }
                    } else {
                        m4906e().f18134a.m4847a("PackageManager is null, first open report might be inaccurate. appId", ft.m16220a(com_google_android_gms_internal_zzcff2.f18517a));
                    }
                    k2 = m4912k();
                    str2 = com_google_android_gms_internal_zzcff2.f18517a;
                    ac.m4378a(str2);
                    k2.mo1606c();
                    k2.m11975L();
                    j = k2.m16090h(str2, "first_open_count");
                    if (j >= 0) {
                        bundle.putLong("_pfo", j);
                    }
                    com_google_android_gms_internal_zzcfx = new zzcfx("_f", new zzcfu(bundle), "auto", j3);
                }
                m4893a(r14, com_google_android_gms_internal_zzcff2);
                bundle = new Bundle();
                bundle.putLong("_et", j2);
                com_google_android_gms_internal_zzcfx = new zzcfx("_e", new zzcfu(bundle), "auto", j3);
                m4893a(r4, com_google_android_gms_internal_zzcff2);
                m4912k().m16093y();
                m4912k().m16094z();
                return;
            }
            m4904c(com_google_android_gms_internal_zzcff);
        }
    }

    final void m4898b(zzcfi com_google_android_gms_internal_zzcfi) {
        zzcff b = m4882b(com_google_android_gms_internal_zzcfi.f18532a);
        if (b != null) {
            m4899b(com_google_android_gms_internal_zzcfi, b);
        }
    }

    final void m4899b(zzcfi com_google_android_gms_internal_zzcfi, zzcff com_google_android_gms_internal_zzcff) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        ac.m4378a(com_google_android_gms_internal_zzcfi.f18532a);
        ac.m4376a(com_google_android_gms_internal_zzcfi.f18534c);
        ac.m4378a(com_google_android_gms_internal_zzcfi.f18534c.f18549a);
        m4907f().mo1606c();
        m4888a();
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b)) {
            if (com_google_android_gms_internal_zzcff.f18524h) {
                m4912k().m16092x();
                try {
                    m4904c(com_google_android_gms_internal_zzcff);
                    zzcfi d = m4912k().m16084d(com_google_android_gms_internal_zzcfi.f18532a, com_google_android_gms_internal_zzcfi.f18534c.f18549a);
                    if (d != null) {
                        m4906e().f18139f.m4848a("Removing conditional user property", com_google_android_gms_internal_zzcfi.f18532a, m4911j().m16198c(com_google_android_gms_internal_zzcfi.f18534c.f18549a));
                        m4912k().m16086e(com_google_android_gms_internal_zzcfi.f18532a, com_google_android_gms_internal_zzcfi.f18534c.f18549a);
                        if (d.f18536e) {
                            m4912k().m16081b(com_google_android_gms_internal_zzcfi.f18532a, com_google_android_gms_internal_zzcfi.f18534c.f18549a);
                        }
                        if (com_google_android_gms_internal_zzcfi.f18542k != null) {
                            Bundle bundle = null;
                            if (com_google_android_gms_internal_zzcfi.f18542k.f18546b != null) {
                                bundle = com_google_android_gms_internal_zzcfi.f18542k.f18546b.m16838a();
                            }
                            Bundle bundle2 = bundle;
                            m4883b(m4910i().m16594a(com_google_android_gms_internal_zzcfi.f18542k.f18545a, bundle2, d.f18533b, com_google_android_gms_internal_zzcfi.f18542k.f18548d), com_google_android_gms_internal_zzcff);
                        }
                    } else {
                        m4906e().f18136c.m4848a("Conditional user property doesn't exist", ft.m16220a(com_google_android_gms_internal_zzcfi.f18532a), m4911j().m16198c(com_google_android_gms_internal_zzcfi.f18534c.f18549a));
                    }
                    m4912k().m16093y();
                } finally {
                    m4912k().m16094z();
                }
            } else {
                m4904c(com_google_android_gms_internal_zzcff);
            }
        }
    }

    final void m4900b(zzckk com_google_android_gms_internal_zzckk, zzcff com_google_android_gms_internal_zzcff) {
        m4907f().mo1606c();
        m4888a();
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b)) {
            if (com_google_android_gms_internal_zzcff.f18524h) {
                m4906e().f18139f.m4847a("Removing user property", m4911j().m16198c(com_google_android_gms_internal_zzckk.f18549a));
                m4912k().m16092x();
                try {
                    m4904c(com_google_android_gms_internal_zzcff);
                    m4912k().m16081b(com_google_android_gms_internal_zzcff.f18517a, com_google_android_gms_internal_zzckk.f18549a);
                    m4912k().m16093y();
                    m4906e().f18139f.m4847a("User property removed", m4911j().m16198c(com_google_android_gms_internal_zzckk.f18549a));
                } finally {
                    m4912k().m16094z();
                }
            } else {
                m4904c(com_google_android_gms_internal_zzcff);
            }
        }
    }

    protected final boolean m4901b() {
        m4888a();
        m4907f().mo1606c();
        if (this.f5856E == null || this.f5857F == 0 || !(this.f5856E == null || this.f5856E.booleanValue() || Math.abs(this.f5875i.mo1576b() - this.f5857F) <= 1000)) {
            this.f5857F = this.f5875i.mo1576b();
            boolean z = m4910i().m16620g("android.permission.INTERNET") && m4910i().m16620g("android.permission.ACCESS_NETWORK_STATE") && (dz.m4762a(this.f5867a).m4758a() || (gi.m4859a(this.f5867a) && jf.m4947a(this.f5867a)));
            this.f5856E = Boolean.valueOf(z);
            if (this.f5856E.booleanValue()) {
                this.f5856E = Boolean.valueOf(m4910i().m16617e(m4917p().m16122A()));
            }
        }
        return this.f5856E.booleanValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] m4902b(com.google.android.gms.internal.zzcfx r34, java.lang.String r35) {
        /*
        r33 = this;
        r11 = r33;
        r1 = r34;
        r10 = r35;
        r33.m4888a();
        r2 = r33.m4907f();
        r2.mo1606c();
        m4884t();
        com.google.android.gms.common.internal.ac.m4376a(r34);
        com.google.android.gms.common.internal.ac.m4378a(r35);
        r8 = new com.google.android.gms.internal.kh;
        r8.<init>();
        r2 = r33.m4912k();
        r2.m16092x();
        r2 = r33.m4912k();	 Catch:{ all -> 0x0389 }
        r9 = r2.m16078b(r10);	 Catch:{ all -> 0x0389 }
        r6 = 0;
        if (r9 != 0) goto L_0x004a;
    L_0x0030:
        r1 = r33.m4906e();	 Catch:{ all -> 0x0045 }
        r1 = r1.f18139f;	 Catch:{ all -> 0x0045 }
        r2 = "Log and bundle not available. package_name";
        r1.m4847a(r2, r10);	 Catch:{ all -> 0x0045 }
    L_0x003b:
        r1 = new byte[r6];	 Catch:{ all -> 0x0045 }
        r2 = r33.m4912k();
        r2.m16094z();
        return r1;
    L_0x0045:
        r0 = move-exception;
        r1 = r0;
        r5 = r11;
        goto L_0x038c;
    L_0x004a:
        r2 = r9.m4802m();	 Catch:{ all -> 0x0389 }
        if (r2 != 0) goto L_0x005c;
    L_0x0050:
        r1 = r33.m4906e();	 Catch:{ all -> 0x0045 }
        r1 = r1.f18139f;	 Catch:{ all -> 0x0045 }
        r2 = "Log and bundle disabled. package_name";
        r1.m4847a(r2, r10);	 Catch:{ all -> 0x0045 }
        goto L_0x003b;
    L_0x005c:
        r2 = "_iap";
        r3 = r1.f18545a;	 Catch:{ all -> 0x0389 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0389 }
        if (r2 != 0) goto L_0x0070;
    L_0x0066:
        r2 = "ecommerce_purchase";
        r3 = r1.f18545a;	 Catch:{ all -> 0x0045 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x0085;
    L_0x0070:
        r2 = r11.m4880a(r10, r1);	 Catch:{ all -> 0x0389 }
        if (r2 != 0) goto L_0x0085;
    L_0x0076:
        r2 = r33.m4906e();	 Catch:{ all -> 0x0045 }
        r2 = r2.f18136c;	 Catch:{ all -> 0x0045 }
        r3 = "Failed to handle purchase event at single event bundle creation. appId";
        r4 = com.google.android.gms.internal.ft.m16220a(r35);	 Catch:{ all -> 0x0045 }
        r2.m4847a(r3, r4);	 Catch:{ all -> 0x0045 }
    L_0x0085:
        r7 = new com.google.android.gms.internal.ki;	 Catch:{ all -> 0x0389 }
        r7.<init>();	 Catch:{ all -> 0x0389 }
        r5 = 1;
        r2 = new com.google.android.gms.internal.ki[r5];	 Catch:{ all -> 0x0389 }
        r2[r6] = r7;	 Catch:{ all -> 0x0389 }
        r8.f18281a = r2;	 Catch:{ all -> 0x0389 }
        r2 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0389 }
        r7.f18292a = r2;	 Catch:{ all -> 0x0389 }
        r2 = "android";
        r7.f18300i = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4772a();	 Catch:{ all -> 0x0389 }
        r7.f18306o = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4799j();	 Catch:{ all -> 0x0389 }
        r7.f18305n = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4795h();	 Catch:{ all -> 0x0389 }
        r7.f18307p = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4797i();	 Catch:{ all -> 0x0389 }
        r12 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        r15 = 0;
        if (r4 != 0) goto L_0x00bb;
    L_0x00b9:
        r2 = r15;
        goto L_0x00c0;
    L_0x00bb:
        r2 = (int) r2;	 Catch:{ all -> 0x0389 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0389 }
    L_0x00c0:
        r7.f18285C = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4800k();	 Catch:{ all -> 0x0389 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0389 }
        r7.f18308q = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4780c();	 Catch:{ all -> 0x0389 }
        r7.f18316y = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4801l();	 Catch:{ all -> 0x0389 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0389 }
        r7.f18313v = r2;	 Catch:{ all -> 0x0389 }
        r2 = r33.m4920s();	 Catch:{ all -> 0x0389 }
        if (r2 == 0) goto L_0x00f7;
    L_0x00e2:
        r2 = com.google.android.gms.internal.ew.m11914B();	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x00f7;
    L_0x00e8:
        r2 = r11.f5868b;	 Catch:{ all -> 0x0045 }
        r3 = r7.f18306o;	 Catch:{ all -> 0x0045 }
        r2 = r2.m11925c(r3);	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x00f7;
    L_0x00f2:
        r33.m4917p();	 Catch:{ all -> 0x0045 }
        r7.f18289G = r15;	 Catch:{ all -> 0x0045 }
    L_0x00f7:
        r2 = r33.m4905d();	 Catch:{ all -> 0x0389 }
        r3 = r9.m4772a();	 Catch:{ all -> 0x0389 }
        r2 = r2.m16281a(r3);	 Catch:{ all -> 0x0389 }
        r3 = r9.m4809t();	 Catch:{ all -> 0x0389 }
        if (r3 == 0) goto L_0x011f;
    L_0x0109:
        r3 = r2.first;	 Catch:{ all -> 0x0045 }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x0045 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x011f;
    L_0x0113:
        r3 = r2.first;	 Catch:{ all -> 0x0045 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0045 }
        r7.f18310s = r3;	 Catch:{ all -> 0x0045 }
        r2 = r2.second;	 Catch:{ all -> 0x0045 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0045 }
        r7.f18311t = r2;	 Catch:{ all -> 0x0045 }
    L_0x011f:
        r2 = r33.m4916o();	 Catch:{ all -> 0x0389 }
        r2.m11975L();	 Catch:{ all -> 0x0389 }
        r2 = android.os.Build.MODEL;	 Catch:{ all -> 0x0389 }
        r7.f18302k = r2;	 Catch:{ all -> 0x0389 }
        r2 = r33.m4916o();	 Catch:{ all -> 0x0389 }
        r2.m11975L();	 Catch:{ all -> 0x0389 }
        r2 = android.os.Build.VERSION.RELEASE;	 Catch:{ all -> 0x0389 }
        r7.f18301j = r2;	 Catch:{ all -> 0x0389 }
        r2 = r33.m4916o();	 Catch:{ all -> 0x0389 }
        r2 = r2.m16119x();	 Catch:{ all -> 0x0389 }
        r2 = (int) r2;	 Catch:{ all -> 0x0389 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0389 }
        r7.f18304m = r2;	 Catch:{ all -> 0x0389 }
        r2 = r33.m4916o();	 Catch:{ all -> 0x0389 }
        r2 = r2.m16120y();	 Catch:{ all -> 0x0389 }
        r7.f18303l = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4776b();	 Catch:{ all -> 0x0389 }
        r7.f18312u = r2;	 Catch:{ all -> 0x0389 }
        r2 = r9.m4786e();	 Catch:{ all -> 0x0389 }
        r7.f18284B = r2;	 Catch:{ all -> 0x0389 }
        r2 = r33.m4912k();	 Catch:{ all -> 0x0389 }
        r3 = r9.m4772a();	 Catch:{ all -> 0x0389 }
        r2 = r2.m16067a(r3);	 Catch:{ all -> 0x0389 }
        r3 = r2.size();	 Catch:{ all -> 0x0389 }
        r3 = new com.google.android.gms.internal.kk[r3];	 Catch:{ all -> 0x0389 }
        r7.f18294c = r3;	 Catch:{ all -> 0x0389 }
        r3 = r6;
    L_0x016f:
        r4 = r2.size();	 Catch:{ all -> 0x0389 }
        if (r3 >= r4) goto L_0x01a8;
    L_0x0175:
        r4 = new com.google.android.gms.internal.kk;	 Catch:{ all -> 0x0045 }
        r4.<init>();	 Catch:{ all -> 0x0045 }
        r12 = r7.f18294c;	 Catch:{ all -> 0x0045 }
        r12[r3] = r4;	 Catch:{ all -> 0x0045 }
        r12 = r2.get(r3);	 Catch:{ all -> 0x0045 }
        r12 = (com.google.android.gms.internal.jt) r12;	 Catch:{ all -> 0x0045 }
        r12 = r12.f6070c;	 Catch:{ all -> 0x0045 }
        r4.f18322b = r12;	 Catch:{ all -> 0x0045 }
        r12 = r2.get(r3);	 Catch:{ all -> 0x0045 }
        r12 = (com.google.android.gms.internal.jt) r12;	 Catch:{ all -> 0x0045 }
        r12 = r12.f6071d;	 Catch:{ all -> 0x0045 }
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0045 }
        r4.f18321a = r12;	 Catch:{ all -> 0x0045 }
        r12 = r33.m4910i();	 Catch:{ all -> 0x0045 }
        r13 = r2.get(r3);	 Catch:{ all -> 0x0045 }
        r13 = (com.google.android.gms.internal.jt) r13;	 Catch:{ all -> 0x0045 }
        r13 = r13.f6072e;	 Catch:{ all -> 0x0045 }
        r12.m16599a(r4, r13);	 Catch:{ all -> 0x0045 }
        r3 = r3 + 1;
        goto L_0x016f;
    L_0x01a8:
        r2 = r1.f18546b;	 Catch:{ all -> 0x0389 }
        r4 = r2.m16838a();	 Catch:{ all -> 0x0389 }
        r2 = "_iap";
        r3 = r1.f18545a;	 Catch:{ all -> 0x0389 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0389 }
        r12 = 1;
        if (r2 == 0) goto L_0x01cf;
    L_0x01ba:
        r2 = "_c";
        r4.putLong(r2, r12);	 Catch:{ all -> 0x0045 }
        r2 = r33.m4906e();	 Catch:{ all -> 0x0045 }
        r2 = r2.f18139f;	 Catch:{ all -> 0x0045 }
        r3 = "Marking in-app purchase as real-time";
        r2.m4846a(r3);	 Catch:{ all -> 0x0045 }
        r2 = "_r";
        r4.putLong(r2, r12);	 Catch:{ all -> 0x0045 }
    L_0x01cf:
        r2 = "_o";
        r3 = r1.f18547c;	 Catch:{ all -> 0x0389 }
        r4.putString(r2, r3);	 Catch:{ all -> 0x0389 }
        r2 = r33.m4910i();	 Catch:{ all -> 0x0389 }
        r3 = r7.f18306o;	 Catch:{ all -> 0x0389 }
        r2 = r2.m16623i(r3);	 Catch:{ all -> 0x0389 }
        if (r2 == 0) goto L_0x01fc;
    L_0x01e2:
        r2 = r33.m4910i();	 Catch:{ all -> 0x0045 }
        r3 = "_dbg";
        r14 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0045 }
        r2.m16597a(r4, r3, r14);	 Catch:{ all -> 0x0045 }
        r2 = r33.m4910i();	 Catch:{ all -> 0x0045 }
        r3 = "_r";
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0045 }
        r2.m16597a(r4, r3, r12);	 Catch:{ all -> 0x0045 }
    L_0x01fc:
        r2 = r33.m4912k();	 Catch:{ all -> 0x0389 }
        r3 = r1.f18545a;	 Catch:{ all -> 0x0389 }
        r2 = r2.m16065a(r10, r3);	 Catch:{ all -> 0x0389 }
        r26 = 0;
        if (r2 != 0) goto L_0x0235;
    L_0x020a:
        r2 = new com.google.android.gms.internal.ff;	 Catch:{ all -> 0x0045 }
        r14 = r1.f18545a;	 Catch:{ all -> 0x0045 }
        r16 = 1;
        r18 = 0;
        r12 = r1.f18548d;	 Catch:{ all -> 0x0045 }
        r21 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r28 = r12;
        r12 = r2;
        r13 = r10;
        r30 = r15;
        r15 = r16;
        r17 = r18;
        r19 = r28;
        r12.<init>(r13, r14, r15, r17, r19, r21, r23, r24, r25);	 Catch:{ all -> 0x0045 }
        r3 = r33.m4912k();	 Catch:{ all -> 0x0045 }
        r3.m16071a(r2);	 Catch:{ all -> 0x0045 }
        r12 = r26;
        goto L_0x024a;
    L_0x0235:
        r30 = r15;
        r12 = r2.f5738e;	 Catch:{ all -> 0x0389 }
        r14 = r1.f18548d;	 Catch:{ all -> 0x0389 }
        r2 = r2.m4822a(r14);	 Catch:{ all -> 0x0389 }
        r2 = r2.m4821a();	 Catch:{ all -> 0x0389 }
        r3 = r33.m4912k();	 Catch:{ all -> 0x0389 }
        r3.m16071a(r2);	 Catch:{ all -> 0x0389 }
    L_0x024a:
        r14 = new com.google.android.gms.internal.fe;	 Catch:{ all -> 0x0389 }
        r3 = r1.f18547c;	 Catch:{ all -> 0x0389 }
        r15 = r1.f18545a;	 Catch:{ all -> 0x0389 }
        r1 = r1.f18548d;	 Catch:{ all -> 0x0389 }
        r16 = r1;
        r1 = r14;
        r2 = r11;
        r18 = r4;
        r4 = r10;
        r11 = r5;
        r5 = r15;
        r19 = r6;
        r15 = r7;
        r6 = r16;
        r31 = r8;
        r32 = r9;
        r8 = r12;
        r10 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r8, r10);	 Catch:{ all -> 0x0385 }
        r1 = new com.google.android.gms.internal.kf;	 Catch:{ all -> 0x0385 }
        r1.<init>();	 Catch:{ all -> 0x0385 }
        r2 = new com.google.android.gms.internal.kf[r11];	 Catch:{ all -> 0x0385 }
        r2[r19] = r1;	 Catch:{ all -> 0x0385 }
        r15.f18293b = r2;	 Catch:{ all -> 0x0385 }
        r2 = r14.f5731d;	 Catch:{ all -> 0x0385 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0385 }
        r1.f18272c = r2;	 Catch:{ all -> 0x0385 }
        r2 = r14.f5729b;	 Catch:{ all -> 0x0385 }
        r1.f18271b = r2;	 Catch:{ all -> 0x0385 }
        r2 = r14.f5732e;	 Catch:{ all -> 0x0385 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0385 }
        r1.f18273d = r2;	 Catch:{ all -> 0x0385 }
        r2 = r14.f5733f;	 Catch:{ all -> 0x0385 }
        r2 = r2.f18544a;	 Catch:{ all -> 0x0385 }
        r2 = r2.size();	 Catch:{ all -> 0x0385 }
        r2 = new com.google.android.gms.internal.kg[r2];	 Catch:{ all -> 0x0385 }
        r1.f18270a = r2;	 Catch:{ all -> 0x0385 }
        r2 = r14.f5733f;	 Catch:{ all -> 0x0385 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0385 }
    L_0x029b:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0385 }
        if (r3 == 0) goto L_0x02c6;
    L_0x02a1:
        r3 = r2.next();	 Catch:{ all -> 0x0385 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0385 }
        r4 = new com.google.android.gms.internal.kg;	 Catch:{ all -> 0x0385 }
        r4.<init>();	 Catch:{ all -> 0x0385 }
        r5 = r1.f18270a;	 Catch:{ all -> 0x0385 }
        r6 = r19 + 1;
        r5[r19] = r4;	 Catch:{ all -> 0x0385 }
        r4.f18276a = r3;	 Catch:{ all -> 0x0385 }
        r5 = r14.f5733f;	 Catch:{ all -> 0x0385 }
        r3 = r5.m16839a(r3);	 Catch:{ all -> 0x0385 }
        r5 = r33;
        r7 = r33.m4910i();	 Catch:{ all -> 0x0383 }
        r7.m16598a(r4, r3);	 Catch:{ all -> 0x0383 }
        r19 = r6;
        goto L_0x029b;
    L_0x02c6:
        r2 = r32;
        r5 = r33;
        r3 = r2.m4772a();	 Catch:{ all -> 0x0383 }
        r4 = r15.f18294c;	 Catch:{ all -> 0x0383 }
        r6 = r15.f18293b;	 Catch:{ all -> 0x0383 }
        r3 = r5.m4881a(r3, r4, r6);	 Catch:{ all -> 0x0383 }
        r15.f18283A = r3;	 Catch:{ all -> 0x0383 }
        r3 = r1.f18272c;	 Catch:{ all -> 0x0383 }
        r15.f18296e = r3;	 Catch:{ all -> 0x0383 }
        r1 = r1.f18272c;	 Catch:{ all -> 0x0383 }
        r15.f18297f = r1;	 Catch:{ all -> 0x0383 }
        r3 = r2.m4792g();	 Catch:{ all -> 0x0383 }
        r1 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1));
        if (r1 == 0) goto L_0x02ed;
    L_0x02e8:
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0383 }
        goto L_0x02ef;
    L_0x02ed:
        r1 = r30;
    L_0x02ef:
        r15.f18299h = r1;	 Catch:{ all -> 0x0383 }
        r6 = r2.m4789f();	 Catch:{ all -> 0x0383 }
        r1 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1));
        if (r1 != 0) goto L_0x02fa;
    L_0x02f9:
        goto L_0x02fb;
    L_0x02fa:
        r3 = r6;
    L_0x02fb:
        r1 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1));
        if (r1 == 0) goto L_0x0304;
    L_0x02ff:
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0383 }
        goto L_0x0306;
    L_0x0304:
        r1 = r30;
    L_0x0306:
        r15.f18298g = r1;	 Catch:{ all -> 0x0383 }
        r2.m4806q();	 Catch:{ all -> 0x0383 }
        r3 = r2.m4803n();	 Catch:{ all -> 0x0383 }
        r1 = (int) r3;	 Catch:{ all -> 0x0383 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0383 }
        r15.f18314w = r1;	 Catch:{ all -> 0x0383 }
        r3 = 11720; // 0x2dc8 float:1.6423E-41 double:5.7904E-320;
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0383 }
        r15.f18309r = r1;	 Catch:{ all -> 0x0383 }
        r1 = r5.f5875i;	 Catch:{ all -> 0x0383 }
        r3 = r1.mo1575a();	 Catch:{ all -> 0x0383 }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0383 }
        r15.f18295d = r1;	 Catch:{ all -> 0x0383 }
        r1 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0383 }
        r15.f18317z = r1;	 Catch:{ all -> 0x0383 }
        r1 = r15.f18296e;	 Catch:{ all -> 0x0383 }
        r3 = r1.longValue();	 Catch:{ all -> 0x0383 }
        r2.m4773a(r3);	 Catch:{ all -> 0x0383 }
        r1 = r15.f18297f;	 Catch:{ all -> 0x0383 }
        r3 = r1.longValue();	 Catch:{ all -> 0x0383 }
        r2.m4777b(r3);	 Catch:{ all -> 0x0383 }
        r1 = r33.m4912k();	 Catch:{ all -> 0x0383 }
        r1.m16070a(r2);	 Catch:{ all -> 0x0383 }
        r1 = r33.m4912k();	 Catch:{ all -> 0x0383 }
        r1.m16093y();	 Catch:{ all -> 0x0383 }
        r1 = r33.m4912k();
        r1.m16094z();
        r1 = r31;
        r2 = r1.m5129f();	 Catch:{ IOException -> 0x0371 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x0371 }
        r3 = r2.length;	 Catch:{ IOException -> 0x0371 }
        r3 = com.google.android.gms.internal.oa.m5073a(r2, r3);	 Catch:{ IOException -> 0x0371 }
        r1.mo1667a(r3);	 Catch:{ IOException -> 0x0371 }
        r3.m5085a();	 Catch:{ IOException -> 0x0371 }
        r1 = r33.m4910i();	 Catch:{ IOException -> 0x0371 }
        r1 = r1.m16605a(r2);	 Catch:{ IOException -> 0x0371 }
        return r1;
    L_0x0371:
        r0 = move-exception;
        r1 = r0;
        r2 = r33.m4906e();
        r2 = r2.f18134a;
        r3 = "Data loss. Failed to bundle and serialize. appId";
        r4 = com.google.android.gms.internal.ft.m16220a(r35);
        r2.m4848a(r3, r4, r1);
        return r30;
    L_0x0383:
        r0 = move-exception;
        goto L_0x038b;
    L_0x0385:
        r0 = move-exception;
        r5 = r33;
        goto L_0x038b;
    L_0x0389:
        r0 = move-exception;
        r5 = r11;
    L_0x038b:
        r1 = r0;
    L_0x038c:
        r2 = r33.m4912k();
        r2.m16094z();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.b(com.google.android.gms.internal.zzcfx, java.lang.String):byte[]");
    }

    protected final void m4903c() {
        m4907f().mo1606c();
        m4912k().m16059C();
        if (m4905d().f18148c.m4854a() == 0) {
            m4905d().f18148c.m4855a(this.f5875i.mo1575a());
        }
        if (Long.valueOf(m4905d().f18153h.m4854a()).longValue() == 0) {
            m4906e().f18140g.m4847a("Persisting first open", Long.valueOf(this.f5878l));
            m4905d().f18153h.m4855a(this.f5878l);
        }
        if (m4901b()) {
            if (!TextUtils.isEmpty(m4917p().m16122A())) {
                String y = m4905d().m16288y();
                if (y == null) {
                    m4905d().m16285c(m4917p().m16122A());
                } else if (!y.equals(m4917p().m16122A())) {
                    m4906e().f18138e.m4846a("Rechecking which service to use due to a GMP App Id change");
                    m4905d().m16279B();
                    this.f5886u.m16468E();
                    this.f5886u.m16467D();
                    m4905d().m16285c(m4917p().m16122A());
                    m4905d().f18153h.m4855a(this.f5878l);
                    m4905d().f18154i.m4858a(null);
                }
            }
            hs h = m4909h();
            gh ghVar = m4905d().f18154i;
            if (!ghVar.f5831b) {
                ghVar.f5831b = true;
                ghVar.f5832c = ghVar.f5833d.m16276D().getString(ghVar.f5830a, null);
            }
            h.m16396a(ghVar.f5832c);
            if (!TextUtils.isEmpty(m4917p().m16122A())) {
                hp h2 = m4909h();
                h2.mo1606c();
                h2.m11975L();
                if (h2.s.m4901b()) {
                    h2.mo1612i().m16465B();
                    String C = h2.mo1624u().m16280C();
                    if (!TextUtils.isEmpty(C)) {
                        h2.mo1611h().m11975L();
                        if (!C.equals(VERSION.RELEASE)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_po", C);
                            h2.m16397a("auto", "_ou", bundle);
                        }
                    }
                }
                m4915n().m16477a(new AtomicReference());
            }
        } else if (m4920s()) {
            if (!m4910i().m16620g("android.permission.INTERNET")) {
                m4906e().f18134a.m4846a("App is missing INTERNET permission");
            }
            if (!m4910i().m16620g("android.permission.ACCESS_NETWORK_STATE")) {
                m4906e().f18134a.m4846a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!dz.m4762a(this.f5867a).m4758a()) {
                if (!gi.m4859a(this.f5867a)) {
                    m4906e().f18134a.m4846a("AppMeasurementReceiver not registered/enabled");
                }
                if (!jf.m4947a(this.f5867a)) {
                    m4906e().f18134a.m4846a("AppMeasurementService not registered/enabled");
                }
            }
            m4906e().f18134a.m4846a("Uploading is not possible. App measurement disabled");
        }
        m4922v();
    }

    final void m4904c(zzcff com_google_android_gms_internal_zzcff) {
        Object obj;
        m4907f().mo1606c();
        m4888a();
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        ac.m4378a(com_google_android_gms_internal_zzcff.f18517a);
        es b = m4912k().m16078b(com_google_android_gms_internal_zzcff.f18517a);
        String b2 = m4905d().m16283b(com_google_android_gms_internal_zzcff.f18517a);
        if (b == null) {
            b = new es(this, com_google_android_gms_internal_zzcff.f18517a);
            b.m4774a(m4917p().m16149y());
            b.m4782c(b2);
        } else if (b2.equals(b.m4783d())) {
            obj = null;
            if (!(TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b) || com_google_android_gms_internal_zzcff.f18518b.equals(b.m4780c()))) {
                b.m4778b(com_google_android_gms_internal_zzcff.f18518b);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18527k) || com_google_android_gms_internal_zzcff.f18527k.equals(b.m4786e()))) {
                b.m4785d(com_google_android_gms_internal_zzcff.f18527k);
                obj = 1;
            }
            if (!(com_google_android_gms_internal_zzcff.f18521e == 0 || com_google_android_gms_internal_zzcff.f18521e == b.m4800k())) {
                b.m4784d(com_google_android_gms_internal_zzcff.f18521e);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18519c) || com_google_android_gms_internal_zzcff.f18519c.equals(b.m4795h()))) {
                b.m4788e(com_google_android_gms_internal_zzcff.f18519c);
                obj = 1;
            }
            if (com_google_android_gms_internal_zzcff.f18526j != b.m4797i()) {
                b.m4781c(com_google_android_gms_internal_zzcff.f18526j);
                obj = 1;
            }
            if (!(com_google_android_gms_internal_zzcff.f18520d == null || com_google_android_gms_internal_zzcff.f18520d.equals(b.m4799j()))) {
                b.m4791f(com_google_android_gms_internal_zzcff.f18520d);
                obj = 1;
            }
            if (com_google_android_gms_internal_zzcff.f18522f != b.m4801l()) {
                b.m4787e(com_google_android_gms_internal_zzcff.f18522f);
                obj = 1;
            }
            if (com_google_android_gms_internal_zzcff.f18524h != b.m4802m()) {
                b.m4775a(com_google_android_gms_internal_zzcff.f18524h);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18523g) || com_google_android_gms_internal_zzcff.f18523g.equals(b.m4807r()))) {
                b.m4794g(com_google_android_gms_internal_zzcff.f18523g);
                obj = 1;
            }
            if (com_google_android_gms_internal_zzcff.f18528l != b.m4808s()) {
                b.m4798i(com_google_android_gms_internal_zzcff.f18528l);
                obj = 1;
            }
            if (com_google_android_gms_internal_zzcff.f18531o != b.m4809t()) {
                b.m4779b(com_google_android_gms_internal_zzcff.f18531o);
                obj = 1;
            }
            if (obj != null) {
                m4912k().m16070a(b);
            }
        } else {
            b.m4782c(b2);
            b.m4774a(m4917p().m16149y());
        }
        obj = 1;
        b.m4778b(com_google_android_gms_internal_zzcff.f18518b);
        obj = 1;
        b.m4785d(com_google_android_gms_internal_zzcff.f18527k);
        obj = 1;
        b.m4784d(com_google_android_gms_internal_zzcff.f18521e);
        obj = 1;
        b.m4788e(com_google_android_gms_internal_zzcff.f18519c);
        obj = 1;
        if (com_google_android_gms_internal_zzcff.f18526j != b.m4797i()) {
            b.m4781c(com_google_android_gms_internal_zzcff.f18526j);
            obj = 1;
        }
        b.m4791f(com_google_android_gms_internal_zzcff.f18520d);
        obj = 1;
        if (com_google_android_gms_internal_zzcff.f18522f != b.m4801l()) {
            b.m4787e(com_google_android_gms_internal_zzcff.f18522f);
            obj = 1;
        }
        if (com_google_android_gms_internal_zzcff.f18524h != b.m4802m()) {
            b.m4775a(com_google_android_gms_internal_zzcff.f18524h);
            obj = 1;
        }
        b.m4794g(com_google_android_gms_internal_zzcff.f18523g);
        obj = 1;
        if (com_google_android_gms_internal_zzcff.f18528l != b.m4808s()) {
            b.m4798i(com_google_android_gms_internal_zzcff.f18528l);
            obj = 1;
        }
        if (com_google_android_gms_internal_zzcff.f18531o != b.m4809t()) {
            b.m4779b(com_google_android_gms_internal_zzcff.f18531o);
            obj = 1;
        }
        if (obj != null) {
            m4912k().m16070a(b);
        }
    }

    public final gd m4905d() {
        m4875a(this.f5879n);
        return this.f5879n;
    }

    public final ft m4906e() {
        m4876a(this.f5869c);
        return this.f5869c;
    }

    public final gm m4907f() {
        m4876a(this.f5870d);
        return this.f5870d;
    }

    public final gl m4908g() {
        m4876a(this.f5880o);
        return this.f5880o;
    }

    public final hs m4909h() {
        m4876a(this.f5888w);
        return this.f5888w;
    }

    public final ju m4910i() {
        m4875a(this.f5881p);
        return this.f5881p;
    }

    public final fr m4911j() {
        m4875a(this.f5882q);
        return this.f5882q;
    }

    public final ex m4912k() {
        m4876a(this.f5883r);
        return this.f5883r;
    }

    public final fx m4913l() {
        m4876a(this.f5884s);
        return this.f5884s;
    }

    public final ih m4914m() {
        m4876a(this.f5885t);
        return this.f5885t;
    }

    public final il m4915n() {
        m4876a(this.f5886u);
        return this.f5886u;
    }

    public final fd m4916o() {
        m4876a(this.f5887v);
        return this.f5887v;
    }

    public final fo m4917p() {
        m4876a(this.f5889x);
        return this.f5889x;
    }

    public final eu m4918q() {
        m4876a(this.f5852A);
        return this.f5852A;
    }

    public final eo m4919r() {
        m4875a(this.f5853B);
        return this.f5853B;
    }

    public final boolean m4920s() {
        m4907f().mo1606c();
        m4888a();
        boolean z = false;
        if (this.f5868b.m11946x()) {
            return false;
        }
        Boolean b = this.f5868b.m11922b("firebase_analytics_collection_enabled");
        if (b != null) {
            z = b.booleanValue();
        } else if (!C1730t.m4355b()) {
            z = true;
        }
        return m4905d().m16286c(z);
    }

    public final void m4921u() {
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
        r14 = this;
        r0 = r14.m4907f();
        r0.mo1606c();
        r14.m4888a();
        r0 = 1;
        r14.f5866O = r0;
        r1 = 0;
        r2 = r14.m4915n();	 Catch:{ all -> 0x0273 }
        r2 = r2.f18206c;	 Catch:{ all -> 0x0273 }
        if (r2 != 0) goto L_0x0027;	 Catch:{ all -> 0x0273 }
    L_0x0016:
        r0 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r0 = r0.f18136c;	 Catch:{ all -> 0x0273 }
        r2 = "Upload data called on the client side before use of service was decided";	 Catch:{ all -> 0x0273 }
    L_0x001e:
        r0.m4846a(r2);	 Catch:{ all -> 0x0273 }
    L_0x0021:
        r14.f5866O = r1;
        r14.m4869E();
        return;
    L_0x0027:
        r2 = r2.booleanValue();	 Catch:{ all -> 0x0273 }
        if (r2 == 0) goto L_0x0036;	 Catch:{ all -> 0x0273 }
    L_0x002d:
        r0 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r0 = r0.f18134a;	 Catch:{ all -> 0x0273 }
        r2 = "Upload called in the client side when service should be used";	 Catch:{ all -> 0x0273 }
        goto L_0x001e;	 Catch:{ all -> 0x0273 }
    L_0x0036:
        r2 = r14.f5863L;	 Catch:{ all -> 0x0273 }
        r4 = 0;	 Catch:{ all -> 0x0273 }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x0273 }
        if (r6 <= 0) goto L_0x0042;	 Catch:{ all -> 0x0273 }
    L_0x003e:
        r14.m4922v();	 Catch:{ all -> 0x0273 }
        goto L_0x0021;	 Catch:{ all -> 0x0273 }
    L_0x0042:
        r2 = r14.m4907f();	 Catch:{ all -> 0x0273 }
        r2.mo1606c();	 Catch:{ all -> 0x0273 }
        r2 = r14.f5860I;	 Catch:{ all -> 0x0273 }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x0273 }
    L_0x004d:
        r2 = r0;	 Catch:{ all -> 0x0273 }
        goto L_0x0050;	 Catch:{ all -> 0x0273 }
    L_0x004f:
        r2 = r1;	 Catch:{ all -> 0x0273 }
    L_0x0050:
        if (r2 == 0) goto L_0x005b;	 Catch:{ all -> 0x0273 }
    L_0x0052:
        r0 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r0 = r0.f18140g;	 Catch:{ all -> 0x0273 }
        r2 = "Uploading requested multiple times";	 Catch:{ all -> 0x0273 }
        goto L_0x001e;	 Catch:{ all -> 0x0273 }
    L_0x005b:
        r2 = r14.m4913l();	 Catch:{ all -> 0x0273 }
        r2 = r2.m16275y();	 Catch:{ all -> 0x0273 }
        if (r2 != 0) goto L_0x0071;	 Catch:{ all -> 0x0273 }
    L_0x0065:
        r0 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r0 = r0.f18140g;	 Catch:{ all -> 0x0273 }
        r2 = "Network not connected, ignoring upload request";	 Catch:{ all -> 0x0273 }
        r0.m4846a(r2);	 Catch:{ all -> 0x0273 }
        goto L_0x003e;	 Catch:{ all -> 0x0273 }
    L_0x0071:
        r2 = r14.f5875i;	 Catch:{ all -> 0x0273 }
        r2 = r2.mo1575a();	 Catch:{ all -> 0x0273 }
        r6 = com.google.android.gms.internal.ew.m11916z();	 Catch:{ all -> 0x0273 }
        r8 = r2 - r6;	 Catch:{ all -> 0x0273 }
        r14.m4878a(r8);	 Catch:{ all -> 0x0273 }
        r6 = r14.m4905d();	 Catch:{ all -> 0x0273 }
        r6 = r6.f18148c;	 Catch:{ all -> 0x0273 }
        r6 = r6.m4854a();	 Catch:{ all -> 0x0273 }
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));	 Catch:{ all -> 0x0273 }
        if (r8 == 0) goto L_0x00a3;	 Catch:{ all -> 0x0273 }
    L_0x008e:
        r4 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r4 = r4.f18139f;	 Catch:{ all -> 0x0273 }
        r5 = "Uploading events. Elapsed time since last upload attempt (ms)";	 Catch:{ all -> 0x0273 }
        r8 = r2 - r6;	 Catch:{ all -> 0x0273 }
        r6 = java.lang.Math.abs(r8);	 Catch:{ all -> 0x0273 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0273 }
        r4.m4847a(r5, r6);	 Catch:{ all -> 0x0273 }
    L_0x00a3:
        r4 = r14.m4912k();	 Catch:{ all -> 0x0273 }
        r4 = r4.m16058B();	 Catch:{ all -> 0x0273 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0273 }
        r6 = -1;	 Catch:{ all -> 0x0273 }
        if (r5 != 0) goto L_0x024e;	 Catch:{ all -> 0x0273 }
    L_0x00b3:
        r8 = r14.f5862K;	 Catch:{ all -> 0x0273 }
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ all -> 0x0273 }
        if (r5 != 0) goto L_0x00c3;	 Catch:{ all -> 0x0273 }
    L_0x00b9:
        r5 = r14.m4912k();	 Catch:{ all -> 0x0273 }
        r5 = r5.m16060D();	 Catch:{ all -> 0x0273 }
        r14.f5862K = r5;	 Catch:{ all -> 0x0273 }
    L_0x00c3:
        r5 = r14.f5868b;	 Catch:{ all -> 0x0273 }
        r6 = com.google.android.gms.internal.fj.f5768i;	 Catch:{ all -> 0x0273 }
        r5 = r5.m11921b(r4, r6);	 Catch:{ all -> 0x0273 }
        r6 = r14.f5868b;	 Catch:{ all -> 0x0273 }
        r7 = com.google.android.gms.internal.fj.f5769j;	 Catch:{ all -> 0x0273 }
        r6 = r6.m11921b(r4, r7);	 Catch:{ all -> 0x0273 }
        r6 = java.lang.Math.max(r1, r6);	 Catch:{ all -> 0x0273 }
        r7 = r14.m4912k();	 Catch:{ all -> 0x0273 }
        r5 = r7.m16068a(r4, r5, r6);	 Catch:{ all -> 0x0273 }
        r6 = r5.isEmpty();	 Catch:{ all -> 0x0273 }
        if (r6 != 0) goto L_0x0021;	 Catch:{ all -> 0x0273 }
    L_0x00e5:
        r6 = r5.iterator();	 Catch:{ all -> 0x0273 }
    L_0x00e9:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0273 }
        r8 = 0;	 Catch:{ all -> 0x0273 }
        if (r7 == 0) goto L_0x0105;	 Catch:{ all -> 0x0273 }
    L_0x00f0:
        r7 = r6.next();	 Catch:{ all -> 0x0273 }
        r7 = (android.util.Pair) r7;	 Catch:{ all -> 0x0273 }
        r7 = r7.first;	 Catch:{ all -> 0x0273 }
        r7 = (com.google.android.gms.internal.ki) r7;	 Catch:{ all -> 0x0273 }
        r9 = r7.f18310s;	 Catch:{ all -> 0x0273 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ all -> 0x0273 }
        if (r9 != 0) goto L_0x00e9;	 Catch:{ all -> 0x0273 }
    L_0x0102:
        r6 = r7.f18310s;	 Catch:{ all -> 0x0273 }
        goto L_0x0106;	 Catch:{ all -> 0x0273 }
    L_0x0105:
        r6 = r8;	 Catch:{ all -> 0x0273 }
    L_0x0106:
        if (r6 == 0) goto L_0x0131;	 Catch:{ all -> 0x0273 }
    L_0x0108:
        r7 = r1;	 Catch:{ all -> 0x0273 }
    L_0x0109:
        r9 = r5.size();	 Catch:{ all -> 0x0273 }
        if (r7 >= r9) goto L_0x0131;	 Catch:{ all -> 0x0273 }
    L_0x010f:
        r9 = r5.get(r7);	 Catch:{ all -> 0x0273 }
        r9 = (android.util.Pair) r9;	 Catch:{ all -> 0x0273 }
        r9 = r9.first;	 Catch:{ all -> 0x0273 }
        r9 = (com.google.android.gms.internal.ki) r9;	 Catch:{ all -> 0x0273 }
        r10 = r9.f18310s;	 Catch:{ all -> 0x0273 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x0273 }
        if (r10 != 0) goto L_0x012e;	 Catch:{ all -> 0x0273 }
    L_0x0121:
        r9 = r9.f18310s;	 Catch:{ all -> 0x0273 }
        r9 = r9.equals(r6);	 Catch:{ all -> 0x0273 }
        if (r9 != 0) goto L_0x012e;	 Catch:{ all -> 0x0273 }
    L_0x0129:
        r5 = r5.subList(r1, r7);	 Catch:{ all -> 0x0273 }
        goto L_0x0131;	 Catch:{ all -> 0x0273 }
    L_0x012e:
        r7 = r7 + 1;	 Catch:{ all -> 0x0273 }
        goto L_0x0109;	 Catch:{ all -> 0x0273 }
    L_0x0131:
        r6 = new com.google.android.gms.internal.kh;	 Catch:{ all -> 0x0273 }
        r6.<init>();	 Catch:{ all -> 0x0273 }
        r7 = r5.size();	 Catch:{ all -> 0x0273 }
        r7 = new com.google.android.gms.internal.ki[r7];	 Catch:{ all -> 0x0273 }
        r6.f18281a = r7;	 Catch:{ all -> 0x0273 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0273 }
        r9 = r5.size();	 Catch:{ all -> 0x0273 }
        r7.<init>(r9);	 Catch:{ all -> 0x0273 }
        r9 = com.google.android.gms.internal.ew.m11914B();	 Catch:{ all -> 0x0273 }
        if (r9 == 0) goto L_0x0157;	 Catch:{ all -> 0x0273 }
    L_0x014d:
        r9 = r14.f5868b;	 Catch:{ all -> 0x0273 }
        r9 = r9.m11925c(r4);	 Catch:{ all -> 0x0273 }
        if (r9 == 0) goto L_0x0157;	 Catch:{ all -> 0x0273 }
    L_0x0155:
        r9 = r0;	 Catch:{ all -> 0x0273 }
        goto L_0x0158;	 Catch:{ all -> 0x0273 }
    L_0x0157:
        r9 = r1;	 Catch:{ all -> 0x0273 }
    L_0x0158:
        r10 = r1;	 Catch:{ all -> 0x0273 }
    L_0x0159:
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r11 = r11.length;	 Catch:{ all -> 0x0273 }
        if (r10 >= r11) goto L_0x01a4;	 Catch:{ all -> 0x0273 }
    L_0x015e:
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r12 = r5.get(r10);	 Catch:{ all -> 0x0273 }
        r12 = (android.util.Pair) r12;	 Catch:{ all -> 0x0273 }
        r12 = r12.first;	 Catch:{ all -> 0x0273 }
        r12 = (com.google.android.gms.internal.ki) r12;	 Catch:{ all -> 0x0273 }
        r11[r10] = r12;	 Catch:{ all -> 0x0273 }
        r11 = r5.get(r10);	 Catch:{ all -> 0x0273 }
        r11 = (android.util.Pair) r11;	 Catch:{ all -> 0x0273 }
        r11 = r11.second;	 Catch:{ all -> 0x0273 }
        r11 = (java.lang.Long) r11;	 Catch:{ all -> 0x0273 }
        r7.add(r11);	 Catch:{ all -> 0x0273 }
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r11 = r11[r10];	 Catch:{ all -> 0x0273 }
        r12 = 11720; // 0x2dc8 float:1.6423E-41 double:5.7904E-320;	 Catch:{ all -> 0x0273 }
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0273 }
        r11.f18309r = r12;	 Catch:{ all -> 0x0273 }
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r11 = r11[r10];	 Catch:{ all -> 0x0273 }
        r12 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0273 }
        r11.f18295d = r12;	 Catch:{ all -> 0x0273 }
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r11 = r11[r10];	 Catch:{ all -> 0x0273 }
        r12 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0273 }
        r11.f18317z = r12;	 Catch:{ all -> 0x0273 }
        if (r9 != 0) goto L_0x01a1;	 Catch:{ all -> 0x0273 }
    L_0x019b:
        r11 = r6.f18281a;	 Catch:{ all -> 0x0273 }
        r11 = r11[r10];	 Catch:{ all -> 0x0273 }
        r11.f18289G = r8;	 Catch:{ all -> 0x0273 }
    L_0x01a1:
        r10 = r10 + 1;	 Catch:{ all -> 0x0273 }
        goto L_0x0159;	 Catch:{ all -> 0x0273 }
    L_0x01a4:
        r5 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r9 = 2;	 Catch:{ all -> 0x0273 }
        r5 = r5.m16227a(r9);	 Catch:{ all -> 0x0273 }
        if (r5 == 0) goto L_0x01b7;	 Catch:{ all -> 0x0273 }
    L_0x01af:
        r5 = r14.m4911j();	 Catch:{ all -> 0x0273 }
        r8 = r5.m16192a(r6);	 Catch:{ all -> 0x0273 }
    L_0x01b7:
        r5 = r14.m4910i();	 Catch:{ all -> 0x0273 }
        r9 = r5.m16604a(r6);	 Catch:{ all -> 0x0273 }
        r5 = com.google.android.gms.internal.fj.f5778s;	 Catch:{ all -> 0x0273 }
        r5 = r5.f5786a;	 Catch:{ all -> 0x0273 }
        r12 = r5;	 Catch:{ all -> 0x0273 }
        r12 = (java.lang.String) r12;	 Catch:{ all -> 0x0273 }
        r10 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x023d }
        r10.<init>(r12);	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r7.isEmpty();	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r5 ^ r0;	 Catch:{ MalformedURLException -> 0x023d }
        com.google.android.gms.common.internal.ac.m4385b(r5);	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r14.f5860I;	 Catch:{ MalformedURLException -> 0x023d }
        if (r5 == 0) goto L_0x01e3;	 Catch:{ MalformedURLException -> 0x023d }
    L_0x01d7:
        r5 = r14.m4906e();	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r5.f18134a;	 Catch:{ MalformedURLException -> 0x023d }
        r7 = "Set uploading progress before finishing the previous upload";	 Catch:{ MalformedURLException -> 0x023d }
        r5.m4846a(r7);	 Catch:{ MalformedURLException -> 0x023d }
        goto L_0x01ea;	 Catch:{ MalformedURLException -> 0x023d }
    L_0x01e3:
        r5 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x023d }
        r5.<init>(r7);	 Catch:{ MalformedURLException -> 0x023d }
        r14.f5860I = r5;	 Catch:{ MalformedURLException -> 0x023d }
    L_0x01ea:
        r5 = r14.m4905d();	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r5.f18149d;	 Catch:{ MalformedURLException -> 0x023d }
        r5.m4855a(r2);	 Catch:{ MalformedURLException -> 0x023d }
        r2 = "?";	 Catch:{ MalformedURLException -> 0x023d }
        r3 = r6.f18281a;	 Catch:{ MalformedURLException -> 0x023d }
        r3 = r3.length;	 Catch:{ MalformedURLException -> 0x023d }
        if (r3 <= 0) goto L_0x0200;	 Catch:{ MalformedURLException -> 0x023d }
    L_0x01fa:
        r2 = r6.f18281a;	 Catch:{ MalformedURLException -> 0x023d }
        r2 = r2[r1];	 Catch:{ MalformedURLException -> 0x023d }
        r2 = r2.f18306o;	 Catch:{ MalformedURLException -> 0x023d }
    L_0x0200:
        r3 = r14.m4906e();	 Catch:{ MalformedURLException -> 0x023d }
        r3 = r3.f18140g;	 Catch:{ MalformedURLException -> 0x023d }
        r5 = "Uploading data. app, uncompressed size, data";	 Catch:{ MalformedURLException -> 0x023d }
        r6 = r9.length;	 Catch:{ MalformedURLException -> 0x023d }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ MalformedURLException -> 0x023d }
        r3.m4849a(r5, r2, r6, r8);	 Catch:{ MalformedURLException -> 0x023d }
        r14.f5865N = r0;	 Catch:{ MalformedURLException -> 0x023d }
        r6 = r14.m4913l();	 Catch:{ MalformedURLException -> 0x023d }
        r11 = new com.google.android.gms.internal.gu;	 Catch:{ MalformedURLException -> 0x023d }
        r11.<init>(r14);	 Catch:{ MalformedURLException -> 0x023d }
        r6.mo1606c();	 Catch:{ MalformedURLException -> 0x023d }
        r6.m11975L();	 Catch:{ MalformedURLException -> 0x023d }
        com.google.android.gms.common.internal.ac.m4376a(r10);	 Catch:{ MalformedURLException -> 0x023d }
        com.google.android.gms.common.internal.ac.m4376a(r9);	 Catch:{ MalformedURLException -> 0x023d }
        com.google.android.gms.common.internal.ac.m4376a(r11);	 Catch:{ MalformedURLException -> 0x023d }
        r0 = r6.mo1622s();	 Catch:{ MalformedURLException -> 0x023d }
        r2 = new com.google.android.gms.internal.ga;	 Catch:{ MalformedURLException -> 0x023d }
        r3 = 0;	 Catch:{ MalformedURLException -> 0x023d }
        r5 = r2;	 Catch:{ MalformedURLException -> 0x023d }
        r7 = r4;	 Catch:{ MalformedURLException -> 0x023d }
        r8 = r10;	 Catch:{ MalformedURLException -> 0x023d }
        r10 = r3;	 Catch:{ MalformedURLException -> 0x023d }
        r5.<init>(r6, r7, r8, r9, r10, r11);	 Catch:{ MalformedURLException -> 0x023d }
        r0.m16339b(r2);	 Catch:{ MalformedURLException -> 0x023d }
        goto L_0x0021;
    L_0x023d:
        r0 = r14.m4906e();	 Catch:{ all -> 0x0273 }
        r0 = r0.f18134a;	 Catch:{ all -> 0x0273 }
        r2 = "Failed to parse upload URL. Not uploading. appId";	 Catch:{ all -> 0x0273 }
        r3 = com.google.android.gms.internal.ft.m16220a(r4);	 Catch:{ all -> 0x0273 }
        r0.m4848a(r2, r3, r12);	 Catch:{ all -> 0x0273 }
        goto L_0x0021;	 Catch:{ all -> 0x0273 }
    L_0x024e:
        r14.f5862K = r6;	 Catch:{ all -> 0x0273 }
        r0 = r14.m4912k();	 Catch:{ all -> 0x0273 }
        r4 = com.google.android.gms.internal.ew.m11916z();	 Catch:{ all -> 0x0273 }
        r6 = r2 - r4;	 Catch:{ all -> 0x0273 }
        r0 = r0.m16066a(r6);	 Catch:{ all -> 0x0273 }
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0273 }
        if (r2 != 0) goto L_0x0021;	 Catch:{ all -> 0x0273 }
    L_0x0264:
        r2 = r14.m4912k();	 Catch:{ all -> 0x0273 }
        r0 = r2.m16078b(r0);	 Catch:{ all -> 0x0273 }
        if (r0 == 0) goto L_0x0021;	 Catch:{ all -> 0x0273 }
    L_0x026e:
        r14.m4873a(r0);	 Catch:{ all -> 0x0273 }
        goto L_0x0021;
    L_0x0273:
        r0 = move-exception;
        r14.f5866O = r1;
        r14.m4869E();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.u():void");
    }

    final void m4922v() {
        gr grVar = this;
        m4907f().mo1606c();
        m4888a();
        if (m4868D()) {
            long abs;
            long j = 0;
            if (grVar.f5863L > 0) {
                abs = 3600000 - Math.abs(grVar.f5875i.mo1576b() - grVar.f5863L);
                if (abs > 0) {
                    m4906e().f18140g.m4847a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    m4885y().m4852a();
                    m4886z().m16558y();
                    return;
                }
                grVar.f5863L = 0;
            }
            if (m4901b()) {
                if (m4867C()) {
                    Object obj;
                    CharSequence A;
                    fk fkVar;
                    long max;
                    long a;
                    long a2;
                    long j2;
                    long j3;
                    BroadcastReceiver y;
                    long a3 = grVar.f5875i.mo1575a();
                    long max2 = Math.max(0, ((Long) fj.f5747C.f5786a).longValue());
                    if ((m4912k().m16062a("select count(1) > 0 from raw_events where realtime = 1", null) != 0 ? 1 : null) == null) {
                        if ((m4912k().m16062a("select count(1) > 0 from queue where has_realtime = 1", null) != 0 ? 1 : null) == null) {
                            obj = null;
                            if (obj == null) {
                                A = grVar.f5868b.m11917A();
                                fkVar = (TextUtils.isEmpty(A) || ".none.".equals(A)) ? fj.f5782w : fj.f5783x;
                            } else {
                                fkVar = fj.f5781v;
                            }
                            max = Math.max(0, ((Long) fkVar.f5786a).longValue());
                            a = m4905d().f18148c.m4854a();
                            a2 = m4905d().f18149d.m4854a();
                            j2 = max;
                            abs = Math.max(m4912k().m16063a("select max(bundle_end_timestamp) from queue", null, 0), m4912k().m16063a("select max(timestamp) from raw_events", null, 0));
                            if (abs == 0) {
                                max = a3 - Math.abs(abs - a3);
                                j = a3 - Math.abs(a2 - a3);
                                a3 = Math.max(a3 - Math.abs(a - a3), j);
                                abs = max + max2;
                                if (obj != null && a3 > 0) {
                                    abs = Math.min(max, a3) + j2;
                                }
                                j3 = j2;
                                max2 = m4910i().m16600a(a3, j3) ? a3 + j3 : abs;
                                if (j != 0 || j < max) {
                                    j = max2;
                                } else {
                                    int i = 0;
                                    while (i < Math.min(20, Math.max(0, ((Integer) fj.f5749E.f5786a).intValue()))) {
                                        j3 = max2 + (Math.max(0, ((Long) fj.f5748D.f5786a).longValue()) * (1 << i));
                                        if (j3 > j) {
                                            j = j3;
                                        } else {
                                            i++;
                                            max2 = j3;
                                        }
                                    }
                                    a3 = 0;
                                    j = 0;
                                }
                                a3 = 0;
                                break;
                            }
                            a3 = 0;
                            if (j == a3) {
                                m4906e().f18140g.m4846a("Next upload time is 0");
                                m4885y().m4852a();
                                m4886z().m16558y();
                                return;
                            } else if (m4913l().m16275y()) {
                                m4906e().f18140g.m4846a("No network");
                                y = m4885y();
                                y.f5810a.m4888a();
                                y.f5810a.m4907f().mo1606c();
                                if (!y.f5811b) {
                                    y.f5810a.f5867a.registerReceiver(y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                    y.f5812c = y.f5810a.m4913l().m16275y();
                                    y.f5810a.m4906e().f18140g.m4847a("Registering connectivity change receiver. Network connected", Boolean.valueOf(y.f5812c));
                                    y.f5811b = true;
                                }
                                m4886z().m16558y();
                                return;
                            } else {
                                a3 = m4905d().f18150e.m4854a();
                                max2 = Math.max(0, ((Long) fj.f5779t.f5786a).longValue());
                                if (!m4910i().m16600a(a3, max2)) {
                                    j = Math.max(j, a3 + max2);
                                }
                                m4885y().m4852a();
                                max2 = j - grVar.f5875i.mo1575a();
                                if (max2 <= 0) {
                                    max2 = Math.max(0, ((Long) fj.f5784y.f5786a).longValue());
                                    m4905d().f18148c.m4855a(grVar.f5875i.mo1575a());
                                }
                                m4906e().f18140g.m4847a("Upload scheduled in approximately ms", Long.valueOf(max2));
                                m4886z().m16535a(max2);
                                return;
                            }
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        fkVar = fj.f5781v;
                    } else {
                        A = grVar.f5868b.m11917A();
                        if (!TextUtils.isEmpty(A)) {
                        }
                    }
                    max = Math.max(0, ((Long) fkVar.f5786a).longValue());
                    a = m4905d().f18148c.m4854a();
                    a2 = m4905d().f18149d.m4854a();
                    j2 = max;
                    abs = Math.max(m4912k().m16063a("select max(bundle_end_timestamp) from queue", null, 0), m4912k().m16063a("select max(timestamp) from raw_events", null, 0));
                    if (abs == 0) {
                        max = a3 - Math.abs(abs - a3);
                        j = a3 - Math.abs(a2 - a3);
                        a3 = Math.max(a3 - Math.abs(a - a3), j);
                        abs = max + max2;
                        abs = Math.min(max, a3) + j2;
                        j3 = j2;
                        if (m4910i().m16600a(a3, j3)) {
                        }
                        if (j != 0) {
                        }
                        j = max2;
                        a3 = 0;
                        break;
                    }
                    a3 = 0;
                    if (j == a3) {
                        m4906e().f18140g.m4846a("Next upload time is 0");
                        m4885y().m4852a();
                        m4886z().m16558y();
                        return;
                    } else if (m4913l().m16275y()) {
                        a3 = m4905d().f18150e.m4854a();
                        max2 = Math.max(0, ((Long) fj.f5779t.f5786a).longValue());
                        if (m4910i().m16600a(a3, max2)) {
                            j = Math.max(j, a3 + max2);
                        }
                        m4885y().m4852a();
                        max2 = j - grVar.f5875i.mo1575a();
                        if (max2 <= 0) {
                            max2 = Math.max(0, ((Long) fj.f5784y.f5786a).longValue());
                            m4905d().f18148c.m4855a(grVar.f5875i.mo1575a());
                        }
                        m4906e().f18140g.m4847a("Upload scheduled in approximately ms", Long.valueOf(max2));
                        m4886z().m16535a(max2);
                        return;
                    } else {
                        m4906e().f18140g.m4846a("No network");
                        y = m4885y();
                        y.f5810a.m4888a();
                        y.f5810a.m4907f().mo1606c();
                        if (y.f5811b) {
                            y.f5810a.f5867a.registerReceiver(y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            y.f5812c = y.f5810a.m4913l().m16275y();
                            y.f5810a.m4906e().f18140g.m4847a("Registering connectivity change receiver. Network connected", Boolean.valueOf(y.f5812c));
                            y.f5811b = true;
                        }
                        m4886z().m16558y();
                        return;
                    }
                }
            }
            m4906e().f18140g.m4846a("Nothing to upload or uploading impossible");
            m4885y().m4852a();
            m4886z().m16558y();
        }
    }

    final void m4923w() {
        this.f5861J++;
    }

    final void m4924x() {
        m4907f().mo1606c();
        m4888a();
        if (!this.f5855D) {
            m4906e().f18138e.m4846a("This instance being marked as an uploader");
            m4907f().mo1606c();
            m4888a();
            if (m4868D() && m4865A()) {
                fv fvVar;
                String str;
                int a = m4870a(this.f5859H);
                int B = m4917p().m16123B();
                m4907f().mo1606c();
                if (a > B) {
                    fvVar = m4906e().f18134a;
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a < B) {
                    if (m4877a(B, this.f5859H)) {
                        fvVar = m4906e().f18140g;
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        fvVar = m4906e().f18134a;
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                fvVar.m4848a(str, Integer.valueOf(a), Integer.valueOf(B));
            }
            this.f5855D = true;
            m4922v();
        }
    }
}
