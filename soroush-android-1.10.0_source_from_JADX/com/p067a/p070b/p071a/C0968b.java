package com.p067a.p070b.p071a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class C0968b {
    protected static final Comparator<byte[]> f3128a = new C09671();
    private List<byte[]> f3129b = new LinkedList();
    private List<byte[]> f3130c = new ArrayList(64);
    private int f3131d = 0;
    private final int f3132e;

    static class C09671 implements Comparator<byte[]> {
        C09671() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((byte[]) obj).length - ((byte[]) obj2).length;
        }
    }

    public C0968b(int i) {
        this.f3132e = i;
    }

    private synchronized void m2422a() {
        while (this.f3131d > this.f3132e) {
            byte[] bArr = (byte[]) this.f3129b.remove(0);
            this.f3130c.remove(bArr);
            this.f3131d -= bArr.length;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m2423a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f3132e;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f3129b;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f3130c;	 Catch:{ all -> 0x002b }
        r1 = f3128a;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f3130c;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f3131d;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f3131d = r0;	 Catch:{ all -> 0x002b }
        r2.m2422a();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.b.a(byte[]):void");
    }

    public final synchronized byte[] m2424a(int i) {
        for (int i2 = 0; i2 < this.f3130c.size(); i2++) {
            byte[] bArr = (byte[]) this.f3130c.get(i2);
            if (bArr.length >= i) {
                this.f3131d -= bArr.length;
                this.f3130c.remove(i2);
                this.f3129b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
