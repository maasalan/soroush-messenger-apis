package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C1718g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C5476f;
import com.google.firebase.C2053a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.perf.C2096a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class mv {
    private static volatile mv f6169c;
    final ThreadPoolExecutor f6170a;
    nd f6171b;
    private C2053a f6172d;
    private C2096a f6173e;
    private Context f6174f;
    private cg f6175g;
    private String f6176h;
    private nn f6177i;
    private mt f6178j;
    private boolean f6179k;

    private mv(ThreadPoolExecutor threadPoolExecutor) {
        this.f6170a = threadPoolExecutor;
        this.f6170a.execute(new mw(this));
    }

    public static com.google.android.gms.internal.mv m5020a() {
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
        r0 = f6169c;
        if (r0 != 0) goto L_0x0033;
    L_0x0004:
        r0 = com.google.android.gms.internal.mv.class;
        monitor-enter(r0);
        r1 = f6169c;	 Catch:{ all -> 0x0030 }
        if (r1 != 0) goto L_0x002e;
    L_0x000b:
        com.google.firebase.C2053a.m5590c();	 Catch:{ IllegalStateException -> 0x002b }
        r1 = new java.util.concurrent.ThreadPoolExecutor;	 Catch:{ all -> 0x0030 }
        r3 = 1;	 Catch:{ all -> 0x0030 }
        r4 = 1;	 Catch:{ all -> 0x0030 }
        r5 = 10;	 Catch:{ all -> 0x0030 }
        r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0030 }
        r8 = new java.util.concurrent.LinkedBlockingQueue;	 Catch:{ all -> 0x0030 }
        r8.<init>();	 Catch:{ all -> 0x0030 }
        r2 = r1;	 Catch:{ all -> 0x0030 }
        r2.<init>(r3, r4, r5, r7, r8);	 Catch:{ all -> 0x0030 }
        r2 = 1;	 Catch:{ all -> 0x0030 }
        r1.allowCoreThreadTimeOut(r2);	 Catch:{ all -> 0x0030 }
        r2 = new com.google.android.gms.internal.mv;	 Catch:{ all -> 0x0030 }
        r2.<init>(r1);	 Catch:{ all -> 0x0030 }
        f6169c = r2;	 Catch:{ all -> 0x0030 }
        goto L_0x002e;	 Catch:{ all -> 0x0030 }
    L_0x002b:
        r1 = 0;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return r1;	 Catch:{ all -> 0x0030 }
    L_0x002e:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0033;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r1 = move-exception;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
    L_0x0033:
        r0 = f6169c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mv.a():com.google.android.gms.internal.mv");
    }

    private static java.lang.String m5021a(android.content.Context r2) {
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
        r0 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0010 }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r0.getPackageInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0010 }
        r2 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x0010 }
        return r2;
    L_0x0010:
        r2 = "";
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mv.a(android.content.Context):java.lang.String");
    }

    static /* synthetic */ void m5022a(mv mvVar) {
        mvVar.f6172d = C2053a.m5590c();
        mvVar.f6173e = C2096a.m5726a();
        mvVar.f6174f = mvVar.f6172d.m5597a();
        mvVar.f6176h = mvVar.f6172d.m5598b().f6912b;
        mvVar.f6177i = new nn();
        mvVar.f6177i.f18351a = mvVar.f6176h;
        mvVar.f6177i.f18352b = FirebaseInstanceId.m5609a().m5620c();
        mvVar.f6177i.f18353c = new nm();
        mvVar.f6177i.f18353c.f18348a = mvVar.f6174f.getPackageName();
        mvVar.f6177i.f18353c.f18349b = "1.0.0.172621853";
        mvVar.f6177i.f18353c.f18350c = m5021a(mvVar.f6174f);
        Context context = mvVar.f6174f;
        mvVar.f6175g = new cg(context, "FIREPERF", new cp(context), C5476f.m11826d(), new cz(context));
        mvVar.f6171b = new nd(mvVar.f6174f, mvVar.f6176h);
        mvVar.f6178j = mt.m5013a();
        mvVar.f6179k = nl.m5041a(mvVar.f6174f);
    }

    static /* synthetic */ void m5023a(mv mvVar, nq nqVar, int i) {
        if (mvVar.f6173e.f7052b) {
            if (mvVar.f6179k) {
                long j = 0;
                long longValue = nqVar.f18374k == null ? 0 : nqVar.f18374k.longValue();
                if (nqVar.f18367d != null) {
                    j = nqVar.f18367d.longValue();
                }
                Log.i("FirebasePerformance", String.format("Logging NetworkRequestMetric - %s %db %dms,", new Object[]{nqVar.f18364a, Long.valueOf(j), Long.valueOf(longValue / 1000)}));
            }
            ns nsVar = new ns();
            nsVar.f18379a = mvVar.f6177i;
            nsVar.f18379a.f18354d = Integer.valueOf(i);
            nsVar.f18381c = nqVar;
            mvVar.m5025a(nsVar);
        }
    }

    static /* synthetic */ void m5024a(mv mvVar, nt ntVar, int i) {
        if (mvVar.f6173e.f7052b) {
            int i2 = 0;
            if (mvVar.f6179k) {
                long longValue = ntVar.f18385c == null ? 0 : ntVar.f18385c.longValue();
                Log.i("FirebasePerformance", String.format("Logging TraceMetric - %s %dms", new Object[]{ntVar.f18383a, Long.valueOf(longValue / 1000)}));
            }
            ns nsVar = new ns();
            nsVar.f18379a = mvVar.f6177i;
            nsVar.f18379a.f18354d = Integer.valueOf(i);
            nsVar.f18380b = ntVar;
            Map hashMap = new HashMap(C2096a.m5726a().f7051a);
            if (!hashMap.isEmpty()) {
                nsVar.f18379a.f18355e = new no[hashMap.size()];
                for (String str : hashMap.keySet()) {
                    String str2 = (String) hashMap.get(str);
                    no noVar = new no();
                    noVar.f18358a = str;
                    noVar.f18359b = str2;
                    int i3 = i2 + 1;
                    nsVar.f18379a.f18355e[i2] = noVar;
                    i2 = i3;
                }
            }
            mvVar.m5025a(nsVar);
        }
    }

    private final void m5025a(ns nsVar) {
        if (this.f6177i.f18352b == null) {
            this.f6177i.f18352b = FirebaseInstanceId.m5609a().m5620c();
        }
        if (this.f6177i.f18352b == null) {
            Log.w("FirebasePerformance", "App Instance ID is null, dropping the log.");
            return;
        }
        if (this.f6173e.f7052b) {
            char c;
            nd ndVar;
            char c2;
            boolean z;
            nf nfVar;
            ci ciVar;
            zzbde com_google_android_gms_internal_zzbde;
            zzbdt com_google_android_gms_internal_zzbdt;
            List arrayList = new ArrayList();
            if (nsVar.f18380b != null) {
                arrayList.add(new nb(nsVar.f18380b));
            }
            if (nsVar.f18381c != null) {
                arrayList.add(new na(nsVar.f18381c));
            }
            if (arrayList.isEmpty()) {
                Log.d("FirebasePerformance", "No validators found for PerfMetric.");
            } else {
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    if (!((nc) obj).mo1664a()) {
                    }
                }
                c = true;
                if (c != '\u0000') {
                    Log.i("FirebasePerformance", "Unable to process an HTTP request/response due to missing or invalid values. See earlier log statements for additional information on the specific invalid/missing values.");
                }
                ndVar = this.f6171b;
                if (ndVar.f6189a) {
                    c2 = (nsVar.f18380b != null || nsVar.f18380b.f18383a == null || (!(nsVar.f18380b.f18383a.equals(ni.FOREGROUND_TRACE_NAME.toString()) || nsVar.f18380b.f18383a.equals(ni.BACKGROUND_TRACE_NAME.toString())) || nsVar.f18380b.f18386d == null || nsVar.f18380b.f18386d.length <= 0)) ? true : '\u0000';
                    if (c2 != '\u0000') {
                        z = true;
                    } else {
                        if (nsVar.f18381c != null) {
                            nfVar = ndVar.f6191c;
                        } else if (nsVar.f18380b != null) {
                            nfVar = ndVar.f6190b;
                        }
                        z = nfVar.m5038a();
                    }
                    if (z) {
                        ciVar = new ci(this.f6175g, oi.m5123a((oi) nsVar));
                        if (ciVar.f5646g) {
                            ciVar.f5646g = true;
                            com_google_android_gms_internal_zzbde = new zzbde(new zzbdt(ciVar.f5647h.f5628g, ciVar.f5647h.f5629h, ciVar.f5640a, ciVar.f5641b, ciVar.f5642c, ciVar.f5643d, ciVar.f5647h.f5634m), ciVar.f5645f, null, null, ciVar.f5644e);
                            com_google_android_gms_internal_zzbdt = com_google_android_gms_internal_zzbde.f18454a;
                            if (ciVar.f5647h.f5639r.mo1597a(com_google_android_gms_internal_zzbdt.f18466b, com_google_android_gms_internal_zzbdt.f18465a)) {
                                C1718g.m4314a(Status.f17975a);
                            } else {
                                ciVar.f5647h.f5636o.mo1595a(com_google_android_gms_internal_zzbde);
                                return;
                            }
                        }
                        throw new IllegalStateException("do not reuse LogEventBuilder");
                    } else if (nsVar.f18381c == null) {
                        this.f6178j.m5019a(nh.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
                        return;
                    } else {
                        if (nsVar.f18380b != null) {
                            this.f6178j.m5019a(nh.TRACE_EVENT_RATE_LIMITED.toString());
                        }
                        return;
                    }
                }
                z = false;
                if (z) {
                    ciVar = new ci(this.f6175g, oi.m5123a((oi) nsVar));
                    if (ciVar.f5646g) {
                        ciVar.f5646g = true;
                        com_google_android_gms_internal_zzbde = new zzbde(new zzbdt(ciVar.f5647h.f5628g, ciVar.f5647h.f5629h, ciVar.f5640a, ciVar.f5641b, ciVar.f5642c, ciVar.f5643d, ciVar.f5647h.f5634m), ciVar.f5645f, null, null, ciVar.f5644e);
                        com_google_android_gms_internal_zzbdt = com_google_android_gms_internal_zzbde.f18454a;
                        if (ciVar.f5647h.f5639r.mo1597a(com_google_android_gms_internal_zzbdt.f18466b, com_google_android_gms_internal_zzbdt.f18465a)) {
                            C1718g.m4314a(Status.f17975a);
                        } else {
                            ciVar.f5647h.f5636o.mo1595a(com_google_android_gms_internal_zzbde);
                            return;
                        }
                    }
                    throw new IllegalStateException("do not reuse LogEventBuilder");
                } else if (nsVar.f18381c == null) {
                    if (nsVar.f18380b != null) {
                        this.f6178j.m5019a(nh.TRACE_EVENT_RATE_LIMITED.toString());
                    }
                    return;
                } else {
                    this.f6178j.m5019a(nh.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
                    return;
                }
            }
            c = '\u0000';
            if (c != '\u0000') {
                ndVar = this.f6171b;
                if (ndVar.f6189a) {
                    if (nsVar.f18380b != null) {
                    }
                    if (c2 != '\u0000') {
                        if (nsVar.f18381c != null) {
                            nfVar = ndVar.f6191c;
                        } else if (nsVar.f18380b != null) {
                            nfVar = ndVar.f6190b;
                        }
                        z = nfVar.m5038a();
                    } else {
                        z = true;
                    }
                    if (z) {
                        ciVar = new ci(this.f6175g, oi.m5123a((oi) nsVar));
                        if (ciVar.f5646g) {
                            throw new IllegalStateException("do not reuse LogEventBuilder");
                        }
                        ciVar.f5646g = true;
                        com_google_android_gms_internal_zzbde = new zzbde(new zzbdt(ciVar.f5647h.f5628g, ciVar.f5647h.f5629h, ciVar.f5640a, ciVar.f5641b, ciVar.f5642c, ciVar.f5643d, ciVar.f5647h.f5634m), ciVar.f5645f, null, null, ciVar.f5644e);
                        com_google_android_gms_internal_zzbdt = com_google_android_gms_internal_zzbde.f18454a;
                        if (ciVar.f5647h.f5639r.mo1597a(com_google_android_gms_internal_zzbdt.f18466b, com_google_android_gms_internal_zzbdt.f18465a)) {
                            ciVar.f5647h.f5636o.mo1595a(com_google_android_gms_internal_zzbde);
                            return;
                        }
                        C1718g.m4314a(Status.f17975a);
                    } else if (nsVar.f18381c == null) {
                        this.f6178j.m5019a(nh.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
                        return;
                    } else {
                        if (nsVar.f18380b != null) {
                            this.f6178j.m5019a(nh.TRACE_EVENT_RATE_LIMITED.toString());
                        }
                        return;
                    }
                }
                z = false;
                if (z) {
                    ciVar = new ci(this.f6175g, oi.m5123a((oi) nsVar));
                    if (ciVar.f5646g) {
                        ciVar.f5646g = true;
                        com_google_android_gms_internal_zzbde = new zzbde(new zzbdt(ciVar.f5647h.f5628g, ciVar.f5647h.f5629h, ciVar.f5640a, ciVar.f5641b, ciVar.f5642c, ciVar.f5643d, ciVar.f5647h.f5634m), ciVar.f5645f, null, null, ciVar.f5644e);
                        com_google_android_gms_internal_zzbdt = com_google_android_gms_internal_zzbde.f18454a;
                        if (ciVar.f5647h.f5639r.mo1597a(com_google_android_gms_internal_zzbdt.f18466b, com_google_android_gms_internal_zzbdt.f18465a)) {
                            C1718g.m4314a(Status.f17975a);
                        } else {
                            ciVar.f5647h.f5636o.mo1595a(com_google_android_gms_internal_zzbde);
                            return;
                        }
                    }
                    throw new IllegalStateException("do not reuse LogEventBuilder");
                } else if (nsVar.f18381c == null) {
                    if (nsVar.f18380b != null) {
                        this.f6178j.m5019a(nh.TRACE_EVENT_RATE_LIMITED.toString());
                    }
                    return;
                } else {
                    this.f6178j.m5019a(nh.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
                    return;
                }
            }
            Log.i("FirebasePerformance", "Unable to process an HTTP request/response due to missing or invalid values. See earlier log statements for additional information on the specific invalid/missing values.");
        }
    }

    public final void m5026a(nt ntVar, int i) {
        try {
            byte[] a = oi.m5123a((oi) ntVar);
            oi ntVar2 = new nt();
            oi.m5122a(ntVar2, a, a.length);
            this.f6170a.execute(new mx(this, ntVar2, i));
        } catch (oh e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(35 + String.valueOf(valueOf).length());
            stringBuilder.append("Clone TraceMetric throws exception ");
            stringBuilder.append(valueOf);
            Log.w("FirebasePerformance", stringBuilder.toString());
        }
    }
}
