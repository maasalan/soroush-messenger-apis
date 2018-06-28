package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C1898b;
import com.google.android.gms.measurement.AppMeasurement.C1899c;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.p160b.C1692d;
import com.google.android.gms.p160b.C1702p;
import com.google.android.gms.p160b.C5442o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class hs extends hq {
    protected ig f18190a;
    public C1898b f18191b;
    public final AtomicReference<String> f18192c = new AtomicReference();
    private final Set<C1899c> f18193d = new CopyOnWriteArraySet();
    private boolean f18194e;

    protected hs(gr grVar) {
        super(grVar);
    }

    static /* synthetic */ void m16381a(com.google.android.gms.internal.hs r21, com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty r22) {
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
        r0 = r22;
        r21.mo1606c();
        r21.m11975L();
        com.google.android.gms.common.internal.ac.m4376a(r22);
        r1 = r0.mName;
        com.google.android.gms.common.internal.ac.m4378a(r1);
        r1 = r0.mOrigin;
        com.google.android.gms.common.internal.ac.m4378a(r1);
        r1 = r0.mValue;
        com.google.android.gms.common.internal.ac.m4376a(r1);
        r1 = r21;
        r2 = r1.s;
        r2 = r2.m4920s();
        if (r2 != 0) goto L_0x0030;
    L_0x0024:
        r0 = r21.mo1623t();
        r0 = r0.f18139f;
        r1 = "Conditional property not sent since Firebase Analytics is disabled";
        r0.m4846a(r1);
        return;
    L_0x0030:
        r8 = new com.google.android.gms.internal.zzckk;
        r3 = r0.mName;
        r4 = r0.mTriggeredTimestamp;
        r6 = r0.mValue;
        r7 = r0.mOrigin;
        r2 = r8;
        r2.<init>(r3, r4, r6, r7);
        r9 = r21.mo1619p();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r10 = r0.mTriggeredEventName;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r11 = r0.mTriggeredEventParams;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r12 = r0.mOrigin;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r13 = 0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r13 = r9.m16594a(r10, r11, r12, r13);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = r21.mo1619p();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = r0.mTimedOutEventName;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r4 = r0.mTimedOutEventParams;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5 = r0.mOrigin;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r6 = 0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r10 = r2.m16594a(r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = r21.mo1619p();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = r0.mExpiredEventName;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r4 = r0.mExpiredEventParams;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5 = r0.mOrigin;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r6 = 0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r16 = r2.m16594a(r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r14 = new com.google.android.gms.internal.zzcfi;
        r3 = r0.mAppId;
        r4 = r0.mOrigin;
        r6 = r0.mCreationTimestamp;
        r11 = r0.mTriggerEventName;
        r17 = r10;
        r9 = r0.mTriggerTimeout;
        r0 = r0.mTimeToLive;
        r2 = r14;
        r5 = r8;
        r8 = 0;
        r18 = r9;
        r9 = r11;
        r10 = r17;
        r11 = r18;
        r20 = r14;
        r14 = r0;
        r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r13, r14, r16);
        r0 = r21.mo1612i();
        r1 = r20;
        r0.m16473a(r1);
    L_0x0097:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hs.a(com.google.android.gms.internal.hs, com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty):void");
    }

    static /* synthetic */ void m16382a(com.google.android.gms.internal.hs r24, java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
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
        r1 = r24;
        r8 = r25;
        r9 = r26;
        com.google.android.gms.common.internal.ac.m4378a(r25);
        com.google.android.gms.common.internal.ac.m4378a(r26);
        com.google.android.gms.common.internal.ac.m4376a(r29);
        r24.mo1606c();
        r24.m11975L();
        r2 = r1.s;
        r2 = r2.m4920s();
        if (r2 != 0) goto L_0x0029;
    L_0x001d:
        r1 = r24.mo1623t();
        r1 = r1.f18139f;
        r2 = "Event not sent since app measurement is disabled";
        r1.m4846a(r2);
        return;
    L_0x0029:
        r2 = r1.f18194e;
        r10 = 0;
        r11 = 1;
        if (r2 != 0) goto L_0x0069;
    L_0x002f:
        r1.f18194e = r11;
        r2 = "com.google.android.gms.tagmanager.TagManagerService";	 Catch:{ ClassNotFoundException -> 0x005e }
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x005e }
        r3 = "initialize";	 Catch:{ Exception -> 0x0050 }
        r4 = new java.lang.Class[r11];	 Catch:{ Exception -> 0x0050 }
        r5 = android.content.Context.class;	 Catch:{ Exception -> 0x0050 }
        r4[r10] = r5;	 Catch:{ Exception -> 0x0050 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x0050 }
        r3 = 0;	 Catch:{ Exception -> 0x0050 }
        r4 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0050 }
        r5 = r24.mo1615l();	 Catch:{ Exception -> 0x0050 }
        r4[r10] = r5;	 Catch:{ Exception -> 0x0050 }
        r2.invoke(r3, r4);	 Catch:{ Exception -> 0x0050 }
        goto L_0x0069;
    L_0x0050:
        r0 = move-exception;
        r2 = r0;
        r3 = r24.mo1623t();	 Catch:{ ClassNotFoundException -> 0x005e }
        r3 = r3.f18136c;	 Catch:{ ClassNotFoundException -> 0x005e }
        r4 = "Failed to invoke Tag Manager's initialize() method";	 Catch:{ ClassNotFoundException -> 0x005e }
        r3.m4847a(r4, r2);	 Catch:{ ClassNotFoundException -> 0x005e }
        goto L_0x0069;
    L_0x005e:
        r2 = r24.mo1623t();
        r2 = r2.f18138e;
        r3 = "Tag Manager is not found and thus will not be used";
        r2.m4846a(r3);
    L_0x0069:
        r2 = "am";
        r12 = r2.equals(r8);
        r2 = com.google.android.gms.internal.ju.m16584h(r26);
        if (r30 == 0) goto L_0x009b;
    L_0x0075:
        r3 = r1.f18191b;
        if (r3 == 0) goto L_0x009b;
    L_0x0079:
        if (r2 != 0) goto L_0x009b;
    L_0x007b:
        if (r12 != 0) goto L_0x009b;
    L_0x007d:
        r2 = r24.mo1623t();
        r2 = r2.f18139f;
        r3 = "Passing event to registered event handler (FE)";
        r4 = r24.mo1618o();
        r4 = r4.m16194a(r9);
        r1 = r24.mo1618o();
        r13 = r29;
        r1 = r1.m16188a(r13);
        r2.m4848a(r3, r4, r1);
        return;
    L_0x009b:
        r13 = r29;
        r2 = r1.s;
        r2 = r2.m4901b();
        if (r2 == 0) goto L_0x0257;
    L_0x00a5:
        r2 = r24.mo1619p();
        r2 = r2.m16612c(r9);
        if (r2 == 0) goto L_0x00ca;
    L_0x00af:
        r24.mo1619p();
        r3 = 40;
        r3 = com.google.android.gms.internal.ju.m16563a(r9, r3, r11);
        if (r9 == 0) goto L_0x00be;
    L_0x00ba:
        r10 = r26.length();
    L_0x00be:
        r1 = r1.s;
        r1 = r1.m4910i();
        r4 = "_ev";
        r1.m16610b(r2, r4, r3, r10);
        return;
    L_0x00ca:
        r2 = "_o";
        r19 = java.util.Collections.singletonList(r2);
        r2 = r24.mo1619p();
        r7 = 1;
        r3 = r9;
        r4 = r13;
        r5 = r19;
        r6 = r32;
        r2 = r2.m16592a(r3, r4, r5, r6, r7);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6.add(r2);
        r3 = r24.mo1619p();
        r3 = r3.m16641z();
        r3 = r3.nextLong();
        r5 = r2.keySet();
        r7 = r29.size();
        r7 = new java.lang.String[r7];
        r5 = r5.toArray(r7);
        r5 = (java.lang.String[]) r5;
        java.util.Arrays.sort(r5);
        r7 = r5.length;
        r14 = r10;
        r15 = r14;
    L_0x0109:
        if (r15 >= r7) goto L_0x018b;
    L_0x010b:
        r13 = r5[r15];
        r10 = r2.get(r13);
        r24.mo1619p();
        r10 = com.google.android.gms.internal.ju.m16575a(r10);
        if (r10 == 0) goto L_0x0176;
    L_0x011a:
        r11 = r10.length;
        r2.putInt(r13, r11);
        r20 = r5;
        r11 = 0;
    L_0x0121:
        r5 = r10.length;
        if (r11 >= r5) goto L_0x016b;
    L_0x0124:
        r5 = r10[r11];
        r16 = r24.mo1619p();
        r17 = "_ep";
        r18 = 0;
        r21 = r7;
        r7 = r13;
        r13 = r16;
        r22 = r12;
        r12 = r14;
        r14 = r17;
        r23 = r15;
        r15 = r5;
        r16 = r19;
        r17 = r32;
        r5 = r13.m16592a(r14, r15, r16, r17, r18);
        r13 = "_en";
        r5.putString(r13, r9);
        r13 = "_eid";
        r5.putLong(r13, r3);
        r13 = "_gn";
        r5.putString(r13, r7);
        r13 = "_ll";
        r14 = r10.length;
        r5.putInt(r13, r14);
        r13 = "_i";
        r5.putInt(r13, r11);
        r6.add(r5);
        r11 = r11 + 1;
        r13 = r7;
        r14 = r12;
        r7 = r21;
        r12 = r22;
        r15 = r23;
        goto L_0x0121;
    L_0x016b:
        r21 = r7;
        r22 = r12;
        r12 = r14;
        r23 = r15;
        r5 = r10.length;
        r14 = r12 + r5;
        goto L_0x017f;
    L_0x0176:
        r20 = r5;
        r21 = r7;
        r22 = r12;
        r12 = r14;
        r23 = r15;
    L_0x017f:
        r15 = r23 + 1;
        r5 = r20;
        r7 = r21;
        r12 = r22;
        r10 = 0;
        r11 = 1;
        goto L_0x0109;
    L_0x018b:
        r22 = r12;
        r12 = r14;
        if (r12 == 0) goto L_0x019a;
    L_0x0190:
        r5 = "_eid";
        r2.putLong(r5, r3);
        r3 = "_epc";
        r2.putInt(r3, r12);
    L_0x019a:
        r3 = r24.mo1613j();
        r10 = r3.m16458y();
        if (r10 == 0) goto L_0x01af;
    L_0x01a4:
        r3 = "_sc";
        r2 = r2.containsKey(r3);
        if (r2 != 0) goto L_0x01af;
    L_0x01ac:
        r2 = 1;
        r10.f15249a = r2;
    L_0x01af:
        r11 = 0;
    L_0x01b0:
        r2 = r6.size();
        if (r11 >= r2) goto L_0x023d;
    L_0x01b6:
        r2 = r6.get(r11);
        r2 = (android.os.Bundle) r2;
        if (r11 == 0) goto L_0x01c0;
    L_0x01be:
        r3 = 1;
        goto L_0x01c1;
    L_0x01c0:
        r3 = 0;
    L_0x01c1:
        if (r3 == 0) goto L_0x01c6;
    L_0x01c3:
        r3 = "_ep";
        goto L_0x01c7;
    L_0x01c6:
        r3 = r9;
    L_0x01c7:
        r4 = "_o";
        r2.putString(r4, r8);
        r4 = "_sc";
        r4 = r2.containsKey(r4);
        if (r4 != 0) goto L_0x01d7;
    L_0x01d4:
        com.google.android.gms.internal.ih.m16431a(r10, r2);
    L_0x01d7:
        if (r31 == 0) goto L_0x01e1;
    L_0x01d9:
        r4 = r24.mo1619p();
        r2 = r4.m16591a(r2);
    L_0x01e1:
        r13 = r2;
        r2 = r24.mo1623t();
        r2 = r2.f18139f;
        r4 = "Logging event (FE)";
        r5 = r24.mo1618o();
        r5 = r5.m16194a(r9);
        r7 = r24.mo1618o();
        r7 = r7.m16188a(r13);
        r2.m4848a(r4, r5, r7);
        r14 = new com.google.android.gms.internal.zzcfx;
        r4 = new com.google.android.gms.internal.zzcfu;
        r4.<init>(r13);
        r2 = r14;
        r5 = r8;
        r15 = r6;
        r6 = r27;
        r2.<init>(r3, r4, r5, r6);
        r2 = r24.mo1612i();
        r6 = r33;
        r2.m16474a(r14, r6);
        if (r22 != 0) goto L_0x0238;
    L_0x0217:
        r2 = r1.f18193d;
        r14 = r2.iterator();
    L_0x021d:
        r2 = r14.hasNext();
        if (r2 == 0) goto L_0x0238;
    L_0x0223:
        r2 = r14.next();
        r2 = (com.google.android.gms.measurement.AppMeasurement.C1899c) r2;
        r5 = new android.os.Bundle;
        r5.<init>(r13);
        r3 = r8;
        r4 = r9;
        r6 = r27;
        r2.mo1662a(r3, r4, r5, r6);
        r6 = r33;
        goto L_0x021d;
    L_0x0238:
        r11 = r11 + 1;
        r6 = r15;
        goto L_0x01b0;
    L_0x023d:
        r2 = r24.mo1613j();
        r2 = r2.m16458y();
        if (r2 == 0) goto L_0x0257;
    L_0x0247:
        r2 = "_ae";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x0257;
    L_0x024f:
        r1 = r24.mo1621r();
        r2 = 1;
        r1.m16507a(r2);
    L_0x0257:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hs.a(com.google.android.gms.internal.hs, java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    static /* synthetic */ void m16383a(hs hsVar, String str, String str2, Object obj, long j) {
        ac.m4378a(str);
        ac.m4378a(str2);
        hsVar.mo1606c();
        hsVar.m11975L();
        if (hsVar.s.m4920s()) {
            if (hsVar.s.m4901b()) {
                hsVar.mo1623t().f18139f.m4848a("Setting user property (FE)", hsVar.mo1618o().m16194a(str2), obj);
                hsVar.mo1612i().m16475a(new zzckk(str2, j, obj, str));
            }
            return;
        }
        hsVar.mo1623t().f18139f.m4846a("User property not set since app measurement is disabled");
    }

    static /* synthetic */ void m16384a(hs hsVar, boolean z) {
        hsVar.mo1606c();
        hsVar.m11975L();
        hsVar.mo1623t().f18139f.m4847a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        hsVar.mo1624u().m16284b(z);
        hsVar.mo1612i().m16504z();
    }

    private final void m16385a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            bundle2 = new Bundle();
        } else {
            Bundle bundle4 = new Bundle(bundle3);
            for (String str3 : bundle4.keySet()) {
                Object obj = bundle4.get(str3);
                if (obj instanceof Bundle) {
                    bundle4.putBundle(str3, new Bundle((Bundle) obj));
                } else {
                    int i = 0;
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        while (i < parcelableArr.length) {
                            if (parcelableArr[i] instanceof Bundle) {
                                parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                            }
                            i++;
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        while (i < arrayList.size()) {
                            Object obj2 = arrayList.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.set(i, new Bundle((Bundle) obj2));
                            }
                            i++;
                        }
                    }
                }
            }
            bundle2 = bundle4;
        }
        mo1622s().m16336a(new ia(this, str, str2, j, bundle2, z, z2, z3));
    }

    private final void m16386a(String str, String str2, long j, Object obj) {
        mo1622s().m16336a(new ib(this, str, str2, obj, j));
    }

    static /* synthetic */ void m16387b(com.google.android.gms.internal.hs r21, com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty r22) {
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
        r0 = r22;
        r21.mo1606c();
        r21.m11975L();
        com.google.android.gms.common.internal.ac.m4376a(r22);
        r1 = r0.mName;
        com.google.android.gms.common.internal.ac.m4378a(r1);
        r1 = r21;
        r2 = r1.s;
        r2 = r2.m4920s();
        if (r2 != 0) goto L_0x0026;
    L_0x001a:
        r0 = r21.mo1623t();
        r0 = r0.f18139f;
        r1 = "Conditional property not cleared since Firebase Analytics is disabled";
        r0.m4846a(r1);
        return;
    L_0x0026:
        r8 = new com.google.android.gms.internal.zzckk;
        r3 = r0.mName;
        r4 = 0;
        r6 = 0;
        r7 = 0;
        r2 = r8;
        r2.<init>(r3, r4, r6, r7);
        r9 = r21.mo1619p();	 Catch:{ IllegalArgumentException -> 0x006d }
        r10 = r0.mExpiredEventName;	 Catch:{ IllegalArgumentException -> 0x006d }
        r11 = r0.mExpiredEventParams;	 Catch:{ IllegalArgumentException -> 0x006d }
        r12 = r0.mOrigin;	 Catch:{ IllegalArgumentException -> 0x006d }
        r13 = r0.mCreationTimestamp;	 Catch:{ IllegalArgumentException -> 0x006d }
        r16 = r9.m16594a(r10, r11, r12, r13);	 Catch:{ IllegalArgumentException -> 0x006d }
        r14 = new com.google.android.gms.internal.zzcfi;
        r3 = r0.mAppId;
        r4 = r0.mOrigin;
        r6 = r0.mCreationTimestamp;
        r9 = r0.mActive;
        r10 = r0.mTriggerEventName;
        r12 = r0.mTriggerTimeout;
        r15 = 0;
        r17 = r12;
        r11 = r0.mTimeToLive;
        r2 = r14;
        r5 = r8;
        r8 = r9;
        r9 = r10;
        r0 = 0;
        r10 = r0;
        r19 = r11;
        r11 = r17;
        r13 = r15;
        r0 = r14;
        r14 = r19;
        r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r13, r14, r16);
        r1 = r21.mo1612i();
        r1.m16473a(r0);
    L_0x006d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hs.b(com.google.android.gms.internal.hs, com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty):void");
    }

    private final void m16388c(ConditionalUserProperty conditionalUserProperty) {
        long a = mo1614k().mo1575a();
        ac.m4376a((Object) conditionalUserProperty);
        ac.m4378a(conditionalUserProperty.mName);
        ac.m4378a(conditionalUserProperty.mOrigin);
        ac.m4376a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo1619p().m16614d(str) != 0) {
            mo1623t().f18134a.m4847a("Invalid conditional user property name", mo1618o().m16198c(str));
        } else if (mo1619p().m16607b(str, obj) != 0) {
            mo1623t().f18134a.m4848a("Invalid conditional user property value", mo1618o().m16198c(str), obj);
        } else {
            mo1619p();
            Object c = ju.m16580c(str, obj);
            if (c == null) {
                mo1623t().f18134a.m4848a("Unable to normalize conditional user property value", mo1618o().m16198c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                j = conditionalUserProperty.mTimeToLive;
                if (j <= 15552000000L) {
                    if (j >= 1) {
                        mo1622s().m16336a(new hu(this, conditionalUserProperty));
                        return;
                    }
                }
                mo1623t().f18134a.m4848a("Invalid conditional user property time to live", mo1618o().m16198c(str), Long.valueOf(j));
                return;
            }
            mo1623t().f18134a.m4848a("Invalid conditional user property timeout", mo1618o().m16198c(str), Long.valueOf(j));
        }
    }

    final java.lang.String m16389a(long r4) {
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
        r3 = this;
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        monitor-enter(r0);
        r1 = r3.mo1622s();	 Catch:{ all -> 0x002b }
        r2 = new com.google.android.gms.internal.ie;	 Catch:{ all -> 0x002b }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x002b }
        r1.m16336a(r2);	 Catch:{ all -> 0x002b }
        r0.wait(r4);	 Catch:{ InterruptedException -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        r4 = r0.get();
        r4 = (java.lang.String) r4;
        return r4;
    L_0x001d:
        r4 = r3.mo1623t();	 Catch:{ all -> 0x002b }
        r4 = r4.f18136c;	 Catch:{ all -> 0x002b }
        r5 = "Interrupted waiting for app instance id";	 Catch:{ all -> 0x002b }
        r4.m4846a(r5);	 Catch:{ all -> 0x002b }
        r4 = 0;	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        return r4;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r4 = move-exception;	 Catch:{ all -> 0x002b }
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hs.a(long):java.lang.String");
    }

    public final List<ConditionalUserProperty> m16390a(String str, String str2, String str3) {
        fv fvVar;
        if (mo1622s().m16361z()) {
            fvVar = mo1623t().f18134a;
            str2 = "Cannot get conditional user properties from analytics worker thread";
        } else {
            mo1622s();
            if (gm.m16332y()) {
                fvVar = mo1623t().f18134a;
                str2 = "Cannot get conditional user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.s.m4907f().m16336a(new hw(this, atomicReference, str, str2, str3));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo1623t().f18136c.m4848a("Interrupted waiting for get conditional user properties", str, e);
                    }
                }
                List<zzcfi> list = (List) atomicReference.get();
                if (list == null) {
                    mo1623t().f18136c.m4847a("Timed out waiting for get conditional user properties", str);
                    return Collections.emptyList();
                }
                List<ConditionalUserProperty> arrayList = new ArrayList(list.size());
                for (zzcfi com_google_android_gms_internal_zzcfi : list) {
                    ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                    conditionalUserProperty.mAppId = str;
                    conditionalUserProperty.mOrigin = str2;
                    conditionalUserProperty.mCreationTimestamp = com_google_android_gms_internal_zzcfi.f18535d;
                    conditionalUserProperty.mName = com_google_android_gms_internal_zzcfi.f18534c.f18549a;
                    conditionalUserProperty.mValue = com_google_android_gms_internal_zzcfi.f18534c.m16841a();
                    conditionalUserProperty.mActive = com_google_android_gms_internal_zzcfi.f18536e;
                    conditionalUserProperty.mTriggerEventName = com_google_android_gms_internal_zzcfi.f18537f;
                    if (com_google_android_gms_internal_zzcfi.f18538g != null) {
                        conditionalUserProperty.mTimedOutEventName = com_google_android_gms_internal_zzcfi.f18538g.f18545a;
                        if (com_google_android_gms_internal_zzcfi.f18538g.f18546b != null) {
                            conditionalUserProperty.mTimedOutEventParams = com_google_android_gms_internal_zzcfi.f18538g.f18546b.m16838a();
                        }
                    }
                    conditionalUserProperty.mTriggerTimeout = com_google_android_gms_internal_zzcfi.f18539h;
                    if (com_google_android_gms_internal_zzcfi.f18540i != null) {
                        conditionalUserProperty.mTriggeredEventName = com_google_android_gms_internal_zzcfi.f18540i.f18545a;
                        if (com_google_android_gms_internal_zzcfi.f18540i.f18546b != null) {
                            conditionalUserProperty.mTriggeredEventParams = com_google_android_gms_internal_zzcfi.f18540i.f18546b.m16838a();
                        }
                    }
                    conditionalUserProperty.mTriggeredTimestamp = com_google_android_gms_internal_zzcfi.f18534c.f18550b;
                    conditionalUserProperty.mTimeToLive = com_google_android_gms_internal_zzcfi.f18541j;
                    if (com_google_android_gms_internal_zzcfi.f18542k != null) {
                        conditionalUserProperty.mExpiredEventName = com_google_android_gms_internal_zzcfi.f18542k.f18545a;
                        if (com_google_android_gms_internal_zzcfi.f18542k.f18546b != null) {
                            conditionalUserProperty.mExpiredEventParams = com_google_android_gms_internal_zzcfi.f18542k.f18546b.m16838a();
                        }
                    }
                    arrayList.add(conditionalUserProperty);
                }
                return arrayList;
            }
        }
        fvVar.m4846a(str2);
        return Collections.emptyList();
    }

    public final Map<String, Object> m16391a(String str, String str2, String str3, boolean z) {
        fv fvVar;
        if (mo1622s().m16361z()) {
            fvVar = mo1623t().f18134a;
            str2 = "Cannot get user properties from analytics worker thread";
        } else {
            mo1622s();
            if (gm.m16332y()) {
                fvVar = mo1623t().f18134a;
                str2 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.s.m4907f().m16336a(new hx(this, atomicReference, str, str2, str3, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo1623t().f18136c.m4847a("Interrupted waiting for get user properties", e);
                    }
                }
                List<zzckk> list = (List) atomicReference.get();
                if (list == null) {
                    fvVar = mo1623t().f18136c;
                    str2 = "Timed out waiting for get user properties";
                } else {
                    Map<String, Object> c4813a = new C4813a(list.size());
                    for (zzckk com_google_android_gms_internal_zzckk : list) {
                        c4813a.put(com_google_android_gms_internal_zzckk.f18549a, com_google_android_gms_internal_zzckk.m16841a());
                    }
                    return c4813a;
                }
            }
        }
        fvVar.m4846a(str2);
        return Collections.emptyMap();
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m16393a(ConditionalUserProperty conditionalUserProperty) {
        ac.m4376a((Object) conditionalUserProperty);
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo1623t().f18136c.m4846a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m16388c(conditionalUserProperty2);
    }

    public final void m16394a(C1898b c1898b) {
        mo1606c();
        m11975L();
        if (!(c1898b == null || c1898b == this.f18191b)) {
            ac.m4382a(this.f18191b == null, (Object) "EventInterceptor already set.");
        }
        this.f18191b = c1898b;
    }

    public final void m16395a(C1899c c1899c) {
        m11975L();
        ac.m4376a((Object) c1899c);
        if (!this.f18193d.add(c1899c)) {
            mo1623t().f18136c.m4846a("OnEventListener already registered");
        }
    }

    final void m16396a(String str) {
        this.f18192c.set(str);
    }

    public final void m16397a(String str, String str2, Bundle bundle) {
        boolean z;
        if (this.f18191b != null) {
            if (!ju.m16584h(str2)) {
                z = false;
                m16399a(str, str2, bundle, z, false);
            }
        }
        z = true;
        m16399a(str, str2, bundle, z, false);
    }

    public final void m16398a(String str, String str2, Bundle bundle, long j) {
        m16385a(str, str2, j, bundle, false, true, true);
    }

    public final void m16399a(String str, String str2, Bundle bundle, boolean z, boolean z2) {
        m16385a(str, str2, mo1614k().mo1575a(), bundle, true, z, z2);
    }

    public final void m16400a(String str, String str2, Object obj) {
        ac.m4378a(str);
        long a = mo1614k().mo1575a();
        int d = mo1619p().m16614d(str2);
        int i = 0;
        if (d != 0) {
            mo1619p();
            str = ju.m16563a(str2, 24, true);
            if (str2 != null) {
                i = str2.length();
            }
            this.s.m4910i().m16596a(d, "_ev", str, i);
        } else if (obj != null) {
            d = mo1619p().m16607b(str2, obj);
            if (d != 0) {
                mo1619p();
                str = ju.m16563a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.s.m4910i().m16596a(d, "_ev", str, i);
                return;
            }
            mo1619p();
            Object c = ju.m16580c(str2, obj);
            if (c != null) {
                m16386a(str, str2, a, c);
            }
        } else {
            m16386a(str, str2, a, null);
        }
    }

    public final void m16401a(String str, String str2, String str3, Bundle bundle) {
        long a = mo1614k().mo1575a();
        ac.m4378a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo1622s().m16336a(new hv(this, conditionalUserProperty));
    }

    public final void m16402a(boolean z) {
        m11975L();
        mo1622s().m16336a(new ht(this, z));
    }

    public final List<zzckk> m16403b(boolean z) {
        fv fvVar;
        String str;
        m11975L();
        mo1623t().f18139f.m4846a("Fetching user attributes (FE)");
        if (mo1622s().m16361z()) {
            fvVar = mo1623t().f18134a;
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            mo1622s();
            if (gm.m16332y()) {
                fvVar = mo1623t().f18134a;
                str = "Cannot get all user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.s.m4907f().m16336a(new ic(this, atomicReference, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo1623t().f18136c.m4847a("Interrupted waiting for get user properties", e);
                    }
                }
                List<zzckk> list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                fvVar = mo1623t().f18136c;
                str = "Timed out waiting for get user properties";
            }
        }
        fvVar.m4846a(str);
        return Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final void m16405b(ConditionalUserProperty conditionalUserProperty) {
        ac.m4376a((Object) conditionalUserProperty);
        ac.m4378a(conditionalUserProperty.mAppId);
        mo1604a();
        m16388c(new ConditionalUserProperty(conditionalUserProperty));
    }

    public final void m16406b(C1899c c1899c) {
        m11975L();
        ac.m4376a((Object) c1899c);
        if (!this.f18193d.remove(c1899c)) {
            mo1623t().f18136c.m4846a("OnEventListener had not been registered");
        }
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }

    public final C1692d<String> m16428y() {
        C1692d c5442o;
        try {
            Object z = mo1624u().m16289z();
            if (z != null) {
                c5442o = new C5442o();
                c5442o.m11744a(z);
                return c5442o;
            }
            z = mo1622s().m16333A();
            Object idVar = new id(this);
            ac.m4377a(z, (Object) "Executor must not be null");
            ac.m4377a(idVar, (Object) "Callback must not be null");
            C1692d c5442o2 = new C5442o();
            z.execute(new C1702p(c5442o2, idVar));
            return c5442o2;
        } catch (Exception e) {
            mo1623t().f18136c.m4846a("Failed to schedule task for getAppInstanceId");
            c5442o = new C5442o();
            c5442o.m11743a(e);
            return c5442o;
        }
    }
}
