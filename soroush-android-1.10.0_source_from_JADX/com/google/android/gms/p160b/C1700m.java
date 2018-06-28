package com.google.android.gms.p160b;

import java.util.ArrayDeque;
import java.util.Queue;

final class C1700m<TResult> {
    private final Object f5203a = new Object();
    private Queue<C1699l<TResult>> f5204b;
    private boolean f5205c;

    C1700m() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4301a(com.google.android.gms.p160b.C1692d<TResult> r3) {
        /*
        r2 = this;
        r0 = r2.f5203a;
        monitor-enter(r0);
        r1 = r2.f5204b;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;
    L_0x0007:
        r1 = r2.f5205c;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r1 = 1;
        r2.f5205c = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.f5203a;
        monitor-enter(r1);
        r0 = r2.f5204b;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (com.google.android.gms.p160b.C1699l) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r3 = 0;
        r2.f5205c = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.mo1539a(r3);
        goto L_0x0010;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.m.a(com.google.android.gms.b.d):void");
    }

    public final void m4302a(C1699l<TResult> c1699l) {
        synchronized (this.f5203a) {
            if (this.f5204b == null) {
                this.f5204b = new ArrayDeque();
            }
            this.f5204b.add(c1699l);
        }
    }
}
