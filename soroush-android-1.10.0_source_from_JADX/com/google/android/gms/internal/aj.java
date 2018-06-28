package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C1660a;
import com.google.android.gms.analytics.C1671o;
import com.google.android.gms.analytics.C1672p;
import com.google.android.gms.analytics.C1673q;
import com.google.android.gms.analytics.C1677r;
import com.google.android.gms.analytics.C1678s;
import com.google.android.gms.analytics.C5436i;
import com.google.android.gms.common.internal.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;

final class aj extends C5506v {
    long f18077a;
    private boolean f18078b;
    private final ag f18079c;
    private final br f18080d;
    private final bq f18081e;
    private final ab f18082g;
    private long f18083h = Long.MIN_VALUE;
    private final az f18084i;
    private final az f18085j;
    private final ca f18086k;
    private boolean f18087l;

    protected aj(C1827x c1827x, C1829z c1829z) {
        super(c1827x);
        ac.m4376a((Object) c1829z);
        this.f18081e = new bq(c1827x);
        this.f18079c = new ag(c1827x);
        this.f18080d = new br(c1827x);
        this.f18082g = new ab(c1827x);
        this.f18086k = new ca(this.f6279f.f6285c);
        this.f18084i = new ak(this, c1827x);
        this.f18085j = new al(this, c1827x);
    }

    private final void m15957a(aa aaVar, C5493b c5493b) {
        ac.m4376a((Object) aaVar);
        ac.m4376a((Object) c5493b);
        C1673q c5436i = new C5436i(this.f6279f);
        c5436i.m11724a(aaVar.f5508c);
        c5436i.f15090g = aaVar.f5509d;
        C1671o c = c5436i.mo1536c();
        C5502j c5502j = (C5502j) c.m4263b(C5502j.class);
        c5502j.f15255a = "data";
        c5502j.f15261g = true;
        c.m4262a((C1672p) c5493b);
        C5496e c5496e = (C5496e) c.m4263b(C5496e.class);
        C5492a c5492a = (C5492a) c.m4263b(C5492a.class);
        for (Entry entry : aaVar.f5511f.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                c5492a.f15172a = str2;
            } else if ("av".equals(str)) {
                c5492a.f15173b = str2;
            } else if ("aid".equals(str)) {
                c5492a.f15174c = str2;
            } else if ("aiid".equals(str)) {
                c5492a.f15175d = str2;
            } else if ("uid".equals(str)) {
                c5502j.f15257c = str2;
            } else {
                ac.m4378a(str);
                if (str != null && str.startsWith("&")) {
                    str = str.substring(1);
                }
                ac.m4379a(str, (Object) "Name can not be empty or \"&\"");
                c5496e.f15220a.put(str, str2);
            }
        }
        m5145b("Sending installation campaign to", aaVar.f5508c, c5493b);
        c.f5151e = m5157h().m16009b();
        C1677r c1677r = c.f5147a.f5159h;
        if (c.f5153g) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (c.f5149c) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            C1671o a = c.m4260a();
            a.f5152f = a.f5148b.mo1576b();
            a.f5150d = a.f5151e != 0 ? a.f5151e : a.f5148b.mo1575a();
            a.f5149c = true;
            c1677r.f5165b.execute(new C1678s(c1677r, a));
        }
    }

    static /* synthetic */ void m15959b(aj ajVar) {
        try {
            ajVar.f18079c.m15952f();
            ajVar.m15977f();
        } catch (SQLiteException e) {
            ajVar.m5151d("Failed to delete stale hits", e);
        }
        ajVar.f18085j.m4601a(86400000);
    }

    private final boolean m15960g(String str) {
        return dz.m4762a(this.f6279f.f6283a).m4756a(str) == 0;
    }

    private final void m15961m() {
        if (!this.f18087l && ax.m4586b() && !this.f18082g.m15930b()) {
            if (this.f18086k.m4642a(((Long) bf.f5544C.f5585a).longValue())) {
                this.f18086k.m4641a();
                m5143b("Connecting to service");
                if (this.f18082g.m15932d()) {
                    m5143b("Connected to service");
                    this.f18086k.f5619a = 0;
                    m15975d();
                }
            }
        }
    }

    private final boolean m15962n() {
        C1677r.m4275b();
        m12037k();
        m5143b("Dispatching a batch of local hits");
        int b = this.f18080d.m16007b() ^ 1;
        if ((this.f18082g.m15930b() ^ 1) == 0 || b == 0) {
            List<bk> a;
            long max = (long) Math.max(ax.m4590f(), ax.m4591g());
            List arrayList = new ArrayList();
            long j = 0;
            while (true) {
                this.f18079c.m15947b();
                arrayList.clear();
                try {
                    a = this.f18079c.m15944a(max);
                    if (a.isEmpty()) {
                        m5143b("Store is empty, nothing to dispatch");
                        m15965q();
                        try {
                            this.f18079c.m15949c();
                            this.f18079c.m15950d();
                            return false;
                        } catch (SQLiteException e) {
                            m5154e("Failed to commit local dispatch transaction", e);
                            m15965q();
                            return false;
                        }
                    }
                    m5140a("Hits loaded from store. count", Integer.valueOf(a.size()));
                    for (bk bkVar : a) {
                        if (bkVar.f5589c == j) {
                            break;
                        }
                    }
                    if (this.f18082g.m15930b()) {
                        m5143b("Service connected, sending hits to the service");
                        while (!a.isEmpty()) {
                            bk bkVar2 = (bk) a.get(0);
                            if (this.f18082g.m15929a(bkVar2)) {
                                j = Math.max(j, bkVar2.f5589c);
                                a.remove(bkVar2);
                                m5144b("Hit sent do device AnalyticsService for delivery", bkVar2);
                                try {
                                    this.f18079c.m15948b(bkVar2.f5589c);
                                    arrayList.add(Long.valueOf(bkVar2.f5589c));
                                } catch (SQLiteException e2) {
                                    m5154e("Failed to remove hit that was send for delivery", e2);
                                    m15965q();
                                    return false;
                                } finally {
                                    try {
                                        this.f18079c.m15949c();
                                        this.f18079c.m15950d();
                                    } catch (SQLiteException e22) {
                                        m5154e("Failed to commit local dispatch transaction", e22);
                                        m15965q();
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    if (this.f18080d.m16007b()) {
                        List<Long> a2 = this.f18080d.m16006a((List) a);
                        for (Long longValue : a2) {
                            j = Math.max(j, longValue.longValue());
                        }
                        try {
                            this.f18079c.m15946a((List) a2);
                            arrayList.addAll(a2);
                        } catch (SQLiteException e222) {
                            m5154e("Failed to remove successfully uploaded hits", e222);
                            m15965q();
                            try {
                                this.f18079c.m15949c();
                                this.f18079c.m15950d();
                                return false;
                            } catch (SQLiteException e2222) {
                                m5154e("Failed to commit local dispatch transaction", e2222);
                                m15965q();
                                return false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            this.f18079c.m15949c();
                            this.f18079c.m15950d();
                            return false;
                        } catch (SQLiteException e22222) {
                            m5154e("Failed to commit local dispatch transaction", e22222);
                            m15965q();
                            return false;
                        }
                    }
                    try {
                        this.f18079c.m15949c();
                        this.f18079c.m15950d();
                    } catch (SQLiteException e222222) {
                        m5154e("Failed to commit local dispatch transaction", e222222);
                        m15965q();
                        return false;
                    }
                } catch (SQLiteException e2222222) {
                    m5151d("Failed to read hits from persisted store", e2222222);
                    m15965q();
                    try {
                        this.f18079c.m15949c();
                        this.f18079c.m15950d();
                        return false;
                    } catch (SQLiteException e22222222) {
                        m5154e("Failed to commit local dispatch transaction", e22222222);
                        m15965q();
                        return false;
                    }
                }
            }
            m5152d("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(a.size()));
            m15965q();
            return false;
        }
        m5143b("No network or service available. Will retry later");
        return false;
    }

    private final long m15963o() {
        C1677r.m4275b();
        m12037k();
        try {
            return this.f18079c.m15953m();
        } catch (SQLiteException e) {
            m5154e("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    private final void m15964p() {
        bc g = m5156g();
        if (g.f18090a && !g.f18091b) {
            long o = m15963o();
            if (o != 0 && Math.abs(this.f6279f.f6285c.mo1575a() - o) <= ((Long) bf.f5566h.f5585a).longValue()) {
                m5140a("Dispatch alarm scheduled (ms)", Long.valueOf(ax.m4589e()));
                g.m15987b();
            }
        }
    }

    private final void m15965q() {
        if (this.f18084i.m4602b()) {
            m5143b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f18084i.m4603c();
        bc g = m5156g();
        if (g.f18091b) {
            g.m15988c();
        }
    }

    private final long m15966r() {
        if (this.f18083h != Long.MIN_VALUE) {
            return this.f18083h;
        }
        long longValue = ((Long) bf.f5563e.f5585a).longValue();
        C5506v e = this.f6279f.m5164e();
        e.m12037k();
        if (e.f18102a) {
            C5506v e2 = this.f6279f.m5164e();
            e2.m12037k();
            longValue = ((long) e2.f18103b) * 1000;
        }
        return longValue;
    }

    private final void m15967s() {
        m12037k();
        C1677r.m4275b();
        this.f18087l = true;
        this.f18082g.m15933e();
        m15977f();
    }

    protected final void m15968a(aa aaVar) {
        C1677r.m4275b();
        m5144b("Sending first hit to property", aaVar.f5508c);
        if (!m5157h().m16010c().m4642a(ax.m4595l())) {
            String f = m5157h().m16013f();
            if (!TextUtils.isEmpty(f)) {
                C5493b a = ce.m4644a(this.f6279f.m5160a(), f);
                m5144b("Found relevant installation campaign", a);
                m15957a(aaVar, a);
            }
        }
    }

    public final void m15969a(bd bdVar) {
        long j = this.f18077a;
        C1677r.m4275b();
        m12037k();
        long d = m5157h().m16011d();
        m5144b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(d != 0 ? Math.abs(this.f6279f.f6285c.mo1575a() - d) : -1));
        m15961m();
        try {
            m15962n();
            m5157h().m16012e();
            m15977f();
            if (bdVar != null) {
                bdVar.mo1587a();
            }
            if (this.f18077a != j) {
                this.f18081e.m4624c();
            }
        } catch (Throwable th) {
            m5154e("Local dispatch failed", th);
            m5157h().m16012e();
            m15977f();
            if (bdVar != null) {
                bdVar.mo1587a();
            }
        }
    }

    public final void m15970a(bk bkVar) {
        ac.m4376a((Object) bkVar);
        C1677r.m4275b();
        m12037k();
        if (this.f18087l) {
            m5147c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            m5140a("Delivering hit", bkVar);
        }
        if (TextUtils.isEmpty(bkVar.m4615a("_m", ""))) {
            String string;
            bu buVar = m5157h().f18099b;
            long b = buVar.m4629b();
            b = b == 0 ? 0 : Math.abs(b - buVar.f5610b.f6279f.f6285c.mo1575a());
            Pair pair = null;
            if (b >= buVar.f5609a) {
                if (b > (buVar.f5609a << 1)) {
                    buVar.m4628a();
                } else {
                    string = buVar.f5610b.f18098a.getString(buVar.m4631d(), null);
                    long j = buVar.f5610b.f18098a.getLong(buVar.m4630c(), 0);
                    buVar.m4628a();
                    if (string != null) {
                        if (j > 0) {
                            pair = new Pair(string, Long.valueOf(j));
                        }
                    }
                }
            }
            if (pair != null) {
                string = (String) pair.first;
                String valueOf = String.valueOf((Long) pair.second);
                StringBuilder stringBuilder = new StringBuilder((1 + String.valueOf(valueOf).length()) + String.valueOf(string).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(string);
                valueOf = stringBuilder.toString();
                Map hashMap = new HashMap(bkVar.f5587a);
                hashMap.put("_m", valueOf);
                bkVar = new bk(this, hashMap, bkVar.f5590d, bkVar.f5592f, bkVar.f5589c, bkVar.f5591e, bkVar.f5588b);
            }
        }
        m15961m();
        if (this.f18082g.m15929a(bkVar)) {
            m5147c("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f18079c.m15945a(bkVar);
            m15977f();
        } catch (SQLiteException e) {
            m5154e("Delivery failed to save hit to a database", e);
            this.f6279f.m5160a().m15992a(bkVar, "deliver: failed to insert hit to database");
        }
    }

    public final void m15971a(String str) {
        ac.m4378a(str);
        C1677r.m4275b();
        C5493b a = ce.m4644a(this.f6279f.m5160a(), str);
        if (a == null) {
            m5151d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        CharSequence f = m5157h().m16013f();
        if (str.equals(f)) {
            m5153e("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(f)) {
            m5157h().m16008a(str);
            if (m5157h().m16010c().m4642a(ax.m4595l())) {
                m5151d("Campaign received too late, ignoring", a);
                return;
            }
            m5144b("Received installation campaign", a);
            for (aa a2 : this.f18079c.m15954n()) {
                m15957a(a2, a);
            }
        } else {
            m5152d("Ignoring multiple install campaigns. original, new", f, str);
        }
    }

    public final long m15972b(aa aaVar) {
        ac.m4376a((Object) aaVar);
        m12037k();
        C1677r.m4275b();
        long j = -1;
        long a;
        try {
            this.f18079c.m15947b();
            C1825u c1825u = this.f18079c;
            long j2 = aaVar.f5506a;
            ac.m4378a(aaVar.f5507b);
            c1825u.m12037k();
            C1677r.m4275b();
            int delete = c1825u.m15955o().delete(JivePropertiesExtension.ELEMENT, "app_uid=? AND cid<>?", new String[]{String.valueOf(j2), r5});
            if (delete > 0) {
                c1825u.m5140a("Deleted property records", Integer.valueOf(delete));
            }
            a = this.f18079c.m15943a(aaVar.f5506a, aaVar.f5507b, aaVar.f5508c);
            aaVar.f5510e = a + 1;
            C1825u c1825u2 = this.f18079c;
            ac.m4376a((Object) aaVar);
            c1825u2.m12037k();
            C1677r.m4275b();
            SQLiteDatabase o = c1825u2.m15955o();
            Object obj = aaVar.f5511f;
            ac.m4376a(obj);
            Builder builder = new Builder();
            for (Entry entry : obj.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(aaVar.f5506a));
            contentValues.put("cid", aaVar.f5507b);
            contentValues.put("tid", aaVar.f5508c);
            contentValues.put("adid", Integer.valueOf(aaVar.f5509d));
            contentValues.put("hits_count", Long.valueOf(aaVar.f5510e));
            contentValues.put("params", encodedQuery);
            try {
                if (o.insertWithOnConflict(JivePropertiesExtension.ELEMENT, null, contentValues, 5) == -1) {
                    c1825u2.m5155f("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                c1825u2.m5154e("Error storing a property", e);
            }
            this.f18079c.m15949c();
            return a;
        } catch (SQLiteException e2) {
            a = "Failed to update Analytics property";
            m5154e(a, e2);
            return j;
        } finally {
            try {
                j = this.f18079c;
                j.m15950d();
            } catch (SQLiteException e3) {
                m5154e("Failed to end transaction", e3);
            }
        }
    }

    final void m15973b() {
        m12037k();
        ac.m4382a(this.f18078b ^ true, (Object) "Analytics backend already started");
        this.f18078b = true;
        this.f6279f.m5161b().m4278a(new am(this));
    }

    protected final void m15974c() {
        m12037k();
        C1677r.m4275b();
        Context context = this.f6279f.f6283a;
        if (!bv.m4633a(context)) {
            m5153e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!bw.m4634a(context)) {
            m5155f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C1660a.m4251a(context)) {
            m5153e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        m5157h().m16009b();
        if (!m15960g("android.permission.ACCESS_NETWORK_STATE")) {
            m5155f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m15967s();
        }
        if (!m15960g("android.permission.INTERNET")) {
            m5155f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m15967s();
        }
        if (bw.m4634a(this.f6279f.f6283a)) {
            m5143b("AnalyticsService registered in the app manifest and enabled");
        } else {
            m5153e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.f18087l || this.f18079c.m15951e())) {
            m15961m();
        }
        m15977f();
    }

    protected final void c_() {
        this.f18079c.m12038l();
        this.f18080d.m12038l();
        this.f18082g.m12038l();
    }

    protected final void m15975d() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        com.google.android.gms.analytics.C1677r.m4275b();
        com.google.android.gms.analytics.C1677r.m4275b();
        r5.m12037k();
        r0 = com.google.android.gms.internal.ax.m4586b();
        if (r0 != 0) goto L_0x0014;
    L_0x000f:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r5.m5153e(r0);
    L_0x0014:
        r0 = r5.f18082g;
        r0 = r0.m15930b();
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = "Service not connected";
        r5.m5143b(r0);
        return;
    L_0x0022:
        r0 = r5.f18079c;
        r0 = r0.m15951e();
        if (r0 != 0) goto L_0x007b;
    L_0x002a:
        r0 = "Dispatching local hits to device AnalyticsService";
        r5.m5143b(r0);
    L_0x002f:
        r0 = r5.f18079c;	 Catch:{ SQLiteException -> 0x0072 }
        r1 = com.google.android.gms.internal.ax.m4590f();	 Catch:{ SQLiteException -> 0x0072 }
        r1 = (long) r1;	 Catch:{ SQLiteException -> 0x0072 }
        r0 = r0.m15944a(r1);	 Catch:{ SQLiteException -> 0x0072 }
        r1 = r0.isEmpty();	 Catch:{ SQLiteException -> 0x0072 }
        if (r1 == 0) goto L_0x0044;	 Catch:{ SQLiteException -> 0x0072 }
    L_0x0040:
        r5.m15977f();	 Catch:{ SQLiteException -> 0x0072 }
        return;
    L_0x0044:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x002f;
    L_0x004a:
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (com.google.android.gms.internal.bk) r1;
        r2 = r5.f18082g;
        r2 = r2.m15929a(r1);
        if (r2 != 0) goto L_0x005d;
    L_0x0059:
        r5.m15977f();
        return;
    L_0x005d:
        r0.remove(r1);
        r2 = r5.f18079c;	 Catch:{ SQLiteException -> 0x0068 }
        r3 = r1.f5589c;	 Catch:{ SQLiteException -> 0x0068 }
        r2.m15948b(r3);	 Catch:{ SQLiteException -> 0x0068 }
        goto L_0x0044;
    L_0x0068:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r5.m5154e(r1, r0);
        r5.m15965q();
        return;
    L_0x0072:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r5.m5154e(r1, r0);
        r5.m15965q();
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aj.d():void");
    }

    public final void m15976e() {
        C1677r.m4275b();
        m12037k();
        m5147c("Sync dispatching local hits");
        long j = this.f18077a;
        m15961m();
        try {
            m15962n();
            m5157h().m16012e();
            m15977f();
            if (this.f18077a != j) {
                this.f18081e.m4624c();
            }
        } catch (Throwable th) {
            m5154e("Sync local dispatch failed", th);
            m15977f();
        }
    }

    public final void m15977f() {
        C1677r.m4275b();
        m12037k();
        boolean z = true;
        long j = 0;
        boolean z2 = !this.f18087l && m15966r() > 0;
        if (!z2) {
            this.f18081e.m4623b();
            m15965q();
        } else if (this.f18079c.m15951e()) {
            this.f18081e.m4623b();
            m15965q();
        } else {
            if (!((Boolean) bf.f5584z.f5585a).booleanValue()) {
                BroadcastReceiver broadcastReceiver = this.f18081e;
                broadcastReceiver.m4622a();
                if (!broadcastReceiver.f5604b) {
                    Context context = broadcastReceiver.f5603a.f6283a;
                    context.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                    intentFilter.addCategory(context.getPackageName());
                    context.registerReceiver(broadcastReceiver, intentFilter);
                    broadcastReceiver.f5605c = broadcastReceiver.m4625d();
                    broadcastReceiver.f5603a.m5160a().m5140a("Registering connectivity change receiver. Network connected", Boolean.valueOf(broadcastReceiver.f5605c));
                    broadcastReceiver.f5604b = true;
                }
                bq bqVar = this.f18081e;
                if (!bqVar.f5604b) {
                    bqVar.f5603a.m5160a().m5153e("Connectivity unknown. Receiver not registered");
                }
                z = bqVar.f5605c;
            }
            if (z) {
                long abs;
                az azVar;
                long abs2;
                m15964p();
                long r = m15966r();
                long d = m5157h().m16011d();
                if (d != 0) {
                    abs = r - Math.abs(this.f6279f.f6285c.mo1575a() - d);
                    if (abs > 0) {
                        m5140a("Dispatch scheduled (ms)", Long.valueOf(abs));
                        if (this.f18084i.m4602b()) {
                            this.f18084i.m4601a(abs);
                            return;
                        }
                        azVar = this.f18084i;
                        r = Math.max(1, abs + (azVar.f5540c != 0 ? 0 : Math.abs(azVar.f5538a.f6285c.mo1575a() - azVar.f5540c)));
                        azVar = this.f18084i;
                        if (azVar.m4602b()) {
                            if (r >= 0) {
                                azVar.m4603c();
                                return;
                            }
                            abs2 = r - Math.abs(azVar.f5538a.f6285c.mo1575a() - azVar.f5540c);
                            if (abs2 < 0) {
                                j = abs2;
                            }
                            azVar.m4604d().removeCallbacks(azVar.f5539b);
                            if (!azVar.m4604d().postDelayed(azVar.f5539b, j)) {
                                azVar.f5538a.m5160a().m5154e("Failed to adjust delayed post. time", Long.valueOf(j));
                            }
                        }
                        return;
                    }
                }
                abs = Math.min(ax.m4588d(), r);
                m5140a("Dispatch scheduled (ms)", Long.valueOf(abs));
                if (this.f18084i.m4602b()) {
                    this.f18084i.m4601a(abs);
                    return;
                }
                azVar = this.f18084i;
                if (azVar.f5540c != 0) {
                }
                r = Math.max(1, abs + (azVar.f5540c != 0 ? 0 : Math.abs(azVar.f5538a.f6285c.mo1575a() - azVar.f5540c)));
                azVar = this.f18084i;
                if (azVar.m4602b()) {
                    if (r >= 0) {
                        abs2 = r - Math.abs(azVar.f5538a.f6285c.mo1575a() - azVar.f5540c);
                        if (abs2 < 0) {
                            j = abs2;
                        }
                        azVar.m4604d().removeCallbacks(azVar.f5539b);
                        if (azVar.m4604d().postDelayed(azVar.f5539b, j)) {
                            azVar.f5538a.m5160a().m5154e("Failed to adjust delayed post. time", Long.valueOf(j));
                        }
                    } else {
                        azVar.m4603c();
                        return;
                    }
                }
                return;
            }
            m15965q();
            m15964p();
        }
    }
}
