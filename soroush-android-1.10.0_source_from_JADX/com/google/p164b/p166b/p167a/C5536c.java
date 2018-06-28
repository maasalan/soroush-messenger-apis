package com.google.p164b.p166b.p167a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class C5536c extends C1948t<Date> {
    public static final C1949u f15328a = new C55351();
    private final DateFormat f15329b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat f15330c = DateFormat.getDateTimeInstance(2, 2);

    static class C55351 implements C1949u {
        C55351() {
        }

        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            return c1933a.f6422a == Date.class ? new C5536c() : null;
        }
    }

    private synchronized java.util.Date m12106a(java.lang.String r3) {
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
        monitor-enter(r2);
        r0 = r2.f15330c;	 Catch:{ ParseException -> 0x000b }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x000b }
        monitor-exit(r2);
        return r0;
    L_0x0009:
        r3 = move-exception;
        goto L_0x0026;
    L_0x000b:
        r0 = r2.f15329b;	 Catch:{ ParseException -> 0x0013 }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x0013 }
        monitor-exit(r2);
        return r0;
    L_0x0013:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x001f }
        r1 = 0;	 Catch:{ ParseException -> 0x001f }
        r0.<init>(r1);	 Catch:{ ParseException -> 0x001f }
        r0 = com.google.p164b.p166b.p167a.p168a.C1907a.m5242a(r3, r0);	 Catch:{ ParseException -> 0x001f }
        monitor-exit(r2);
        return r0;
    L_0x001f:
        r0 = move-exception;
        r1 = new com.google.b.r;	 Catch:{ all -> 0x0009 }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x0009 }
        throw r1;	 Catch:{ all -> 0x0009 }
    L_0x0026:
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.a.c.a(java.lang.String):java.util.Date");
    }

    private synchronized void m12107a(C1937c c1937c, Date date) {
        if (date == null) {
            c1937c.mo1743e();
        } else {
            c1937c.mo1739b(this.f15329b.format(date));
        }
    }

    public final /* synthetic */ Object mo1711a(C1935a c1935a) {
        if (c1935a.mo1720f() != C1936b.NULL) {
            return m12106a(c1935a.mo1723i());
        }
        c1935a.mo1725k();
        return null;
    }
}
