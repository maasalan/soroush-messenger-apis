package com.google.p164b;

import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class C5530a extends C1948t<Date> {
    private final Class<? extends Date> f15319a;
    private final DateFormat f15320b;
    private final DateFormat f15321c;

    public C5530a(Class<? extends Date> cls, int i, int i2) {
        this((Class) cls, DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    public C5530a(Class<? extends Date> cls, String str) {
        this((Class) cls, new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    private C5530a(Class<? extends Date> cls, DateFormat dateFormat, DateFormat dateFormat2) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f15319a = cls;
            this.f15320b = dateFormat;
            this.f15321c = dateFormat2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Date type must be one of ");
        stringBuilder.append(Date.class);
        stringBuilder.append(", ");
        stringBuilder.append(Timestamp.class);
        stringBuilder.append(", or ");
        stringBuilder.append(java.sql.Date.class);
        stringBuilder.append(" but was ");
        stringBuilder.append(cls);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private java.util.Date m12096a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f15321c;
        monitor-enter(r0);
        r1 = r3.f15321c;	 Catch:{ ParseException -> 0x000d }
        r1 = r1.parse(r4);	 Catch:{ ParseException -> 0x000d }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;
    L_0x000b:
        r4 = move-exception;
        goto L_0x0028;
    L_0x000d:
        r1 = r3.f15320b;	 Catch:{ ParseException -> 0x0015 }
        r1 = r1.parse(r4);	 Catch:{ ParseException -> 0x0015 }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;
    L_0x0015:
        r1 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x0021 }
        r2 = 0;	 Catch:{ ParseException -> 0x0021 }
        r1.<init>(r2);	 Catch:{ ParseException -> 0x0021 }
        r1 = com.google.p164b.p166b.p167a.p168a.C1907a.m5242a(r4, r1);	 Catch:{ ParseException -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x0021:
        r1 = move-exception;	 Catch:{ all -> 0x000b }
        r2 = new com.google.b.r;	 Catch:{ all -> 0x000b }
        r2.<init>(r4, r1);	 Catch:{ all -> 0x000b }
        throw r2;	 Catch:{ all -> 0x000b }
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.a.a(java.lang.String):java.util.Date");
    }

    public final /* synthetic */ Object mo1711a(C1935a c1935a) {
        if (c1935a.mo1720f() == C1936b.NULL) {
            c1935a.mo1725k();
            return null;
        }
        Date a = m12096a(c1935a.mo1723i());
        if (this.f15319a == Date.class) {
            return a;
        }
        if (this.f15319a == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (this.f15319a == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            c1937c.mo1743e();
            return;
        }
        synchronized (this.f15321c) {
            c1937c.mo1739b(this.f15320b.format(date));
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultDateTypeAdapter");
        stringBuilder.append('(');
        stringBuilder.append(this.f15321c.getClass().getSimpleName());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
