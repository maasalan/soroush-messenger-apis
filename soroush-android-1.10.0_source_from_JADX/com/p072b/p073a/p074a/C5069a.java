package com.p072b.p073a.p074a;

import android.content.Context;
import com.p072b.p073a.p074a.p083i.C1061a;
import com.p072b.p073a.p074a.p083i.C1061a.C1060a;
import com.p072b.p073a.p074a.p083i.C1062b;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class C5069a extends C1061a {
    public static final long f14160a = TimeUnit.SECONDS.toMillis(900);
    final long f14161b;
    final long f14162c;
    private final C1061a f14163d;
    private final List<C5068a> f14164e;
    private final C1065b f14165f;

    private static class C5068a {
        final long f3279a;
        final Long f3280b;
        final C1062b f3281c;

        public C5068a(long j, Long l, C1062b c1062b) {
            this.f3279a = j;
            this.f3280b = l;
            this.f3281c = c1062b;
        }
    }

    class C50671 implements C1060a {
        final /* synthetic */ C5069a f14157a;

        C50671(C5069a c5069a) {
            this.f14157a = c5069a;
        }
    }

    public C5069a(C1061a c1061a, C1065b c1065b) {
        this(c1061a, c1065b, f14160a);
    }

    private C5069a(C1061a c1061a, C1065b c1065b, long j) {
        this.f14164e = new ArrayList();
        this.f14163d = c1061a;
        this.f14165f = c1065b;
        this.f14161b = j;
        this.f14162c = TimeUnit.MILLISECONDS.toNanos(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10327b(com.p072b.p073a.p074a.p083i.C1062b r26) {
        /*
        r25 = this;
        r1 = r25;
        r2 = r26;
        r3 = r1.f14165f;
        r3 = r3.mo1091a();
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6 = r2.f3445b;
        r5 = r5.toNanos(r6);
        r7 = r5 + r3;
        r5 = r2.f3447d;
        if (r5 != 0) goto L_0x001a;
    L_0x0018:
        r5 = 0;
        goto L_0x002c;
    L_0x001a:
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r9 = r2.f3447d;
        r9 = r9.longValue();
        r9 = r5.toNanos(r9);
        r11 = r9 + r3;
        r5 = java.lang.Long.valueOf(r11);
    L_0x002c:
        r9 = r1.f14164e;
        monitor-enter(r9);
        r10 = r1.f14164e;	 Catch:{ all -> 0x00da }
        r10 = r10.iterator();	 Catch:{ all -> 0x00da }
    L_0x0035:
        r11 = r10.hasNext();	 Catch:{ all -> 0x00da }
        r13 = 1;
        if (r11 == 0) goto L_0x0086;
    L_0x003d:
        r11 = r10.next();	 Catch:{ all -> 0x00da }
        r11 = (com.p072b.p073a.p074a.C5069a.C5068a) r11;	 Catch:{ all -> 0x00da }
        r15 = r11.f3281c;	 Catch:{ all -> 0x00da }
        r15 = r15.f3446c;	 Catch:{ all -> 0x00da }
        r6 = r2.f3446c;	 Catch:{ all -> 0x00da }
        r16 = 0;
        if (r15 != r6) goto L_0x0080;
    L_0x004d:
        if (r5 == 0) goto L_0x006a;
    L_0x004f:
        r6 = r11.f3280b;	 Catch:{ all -> 0x00da }
        if (r6 == 0) goto L_0x0080;
    L_0x0053:
        r6 = r11.f3280b;	 Catch:{ all -> 0x00da }
        r17 = r6.longValue();	 Catch:{ all -> 0x00da }
        r19 = r5.longValue();	 Catch:{ all -> 0x00da }
        r21 = r17 - r19;
        r6 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1));
        if (r6 < 0) goto L_0x0080;
    L_0x0063:
        r13 = r1.f14162c;	 Catch:{ all -> 0x00da }
        r6 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1));
        if (r6 <= 0) goto L_0x006e;
    L_0x0069:
        goto L_0x0080;
    L_0x006a:
        r6 = r11.f3280b;	 Catch:{ all -> 0x00da }
        if (r6 != 0) goto L_0x0080;
    L_0x006e:
        r13 = r11.f3279a;	 Catch:{ all -> 0x00da }
        r17 = r13 - r7;
        r13 = 0;
        r6 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1));
        if (r6 <= 0) goto L_0x0080;
    L_0x0078:
        r13 = r1.f14162c;	 Catch:{ all -> 0x00da }
        r6 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x0080;
    L_0x007e:
        r12 = 1;
        goto L_0x0082;
    L_0x0080:
        r12 = r16;
    L_0x0082:
        if (r12 == 0) goto L_0x0035;
    L_0x0084:
        monitor-exit(r9);	 Catch:{ all -> 0x00da }
        return r16;
    L_0x0086:
        r5 = r2.f3445b;	 Catch:{ all -> 0x00da }
        r7 = r1.f14161b;	 Catch:{ all -> 0x00da }
        r5 = r5 / r7;
        r7 = r5 + r13;
        r5 = r1.f14161b;	 Catch:{ all -> 0x00da }
        r7 = r7 * r5;
        r2.f3445b = r7;	 Catch:{ all -> 0x00da }
        r5 = r2.f3447d;	 Catch:{ all -> 0x00da }
        if (r5 == 0) goto L_0x00ab;
    L_0x0096:
        r5 = r2.f3447d;	 Catch:{ all -> 0x00da }
        r5 = r5.longValue();	 Catch:{ all -> 0x00da }
        r10 = r1.f14161b;	 Catch:{ all -> 0x00da }
        r5 = r5 / r10;
        r10 = r5 + r13;
        r5 = r1.f14161b;	 Catch:{ all -> 0x00da }
        r10 = r10 * r5;
        r6 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x00da }
        r2.f3447d = r6;	 Catch:{ all -> 0x00da }
        goto L_0x00ac;
    L_0x00ab:
        r6 = 0;
    L_0x00ac:
        r5 = r1.f14164e;	 Catch:{ all -> 0x00da }
        r10 = new com.b.a.a.a$a;	 Catch:{ all -> 0x00da }
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00da }
        r7 = r11.toNanos(r7);	 Catch:{ all -> 0x00da }
        r13 = r3 + r7;
        if (r6 != 0) goto L_0x00bd;
    L_0x00ba:
        r3 = r13;
        r6 = 0;
        goto L_0x00d1;
    L_0x00bd:
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00da }
        r23 = r13;
        r12 = r6.longValue();	 Catch:{ all -> 0x00da }
        r6 = r7.toNanos(r12);	 Catch:{ all -> 0x00da }
        r11 = r3 + r6;
        r6 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x00da }
        r3 = r23;
    L_0x00d1:
        r10.<init>(r3, r6, r2);	 Catch:{ all -> 0x00da }
        r5.add(r10);	 Catch:{ all -> 0x00da }
        monitor-exit(r9);	 Catch:{ all -> 0x00da }
        r2 = 1;
        return r2;
    L_0x00da:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r9);	 Catch:{ all -> 0x00da }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.a.b(com.b.a.a.i.b):boolean");
    }

    public final void mo1070a() {
        synchronized (this.f14164e) {
            this.f14164e.clear();
        }
        this.f14163d.mo1070a();
    }

    public final void mo1071a(Context context, C1060a c1060a) {
        super.mo1071a(context, c1060a);
        this.f14163d.mo1071a(context, new C50671(this));
    }

    public final void mo1072a(C1062b c1062b) {
        if (m10327b(c1062b)) {
            this.f14163d.mo1072a(c1062b);
        }
    }

    public final void mo1073a(C1062b c1062b, boolean z) {
        synchronized (this.f14164e) {
            for (int size = this.f14164e.size() - 1; size >= 0; size--) {
                if (((C5068a) this.f14164e.get(size)).f3281c.f3444a.equals(c1062b.f3444a)) {
                    this.f14164e.remove(size);
                }
            }
        }
        this.f14163d.mo1073a(c1062b, false);
        if (z) {
            mo1072a(c1062b);
        }
    }
}
