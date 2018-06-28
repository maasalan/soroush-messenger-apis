package com.p072b.p073a.p074a;

import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public final class C1074r {
    long f3509a = Long.MAX_VALUE;
    private ArrayList<String> f3510b;
    private final TreeSet<String> f3511c = new TreeSet();
    private final Map<String, Long> f3512d = new HashMap();
    private final C1065b f3513e;

    public C1074r(C1065b c1065b) {
        this.f3513e = c1065b;
    }

    private long m2594b() {
        long j = Long.MAX_VALUE;
        for (Long l : this.f3512d.values()) {
            if (l.longValue() < j) {
                j = l.longValue();
            }
        }
        return j;
    }

    public final synchronized Collection<String> m2595a() {
        long a = this.f3513e.mo1091a();
        if (this.f3510b == null || a > this.f3509a) {
            if (this.f3512d.isEmpty()) {
                this.f3510b = new ArrayList(this.f3511c);
                this.f3509a = Long.MAX_VALUE;
            } else {
                Collection treeSet = new TreeSet(this.f3511c);
                Iterator it = this.f3512d.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (((Long) entry.getValue()).longValue() <= a) {
                        it.remove();
                    } else if (!treeSet.contains(entry.getKey())) {
                        treeSet.add(entry.getKey());
                    }
                }
                this.f3510b = new ArrayList(treeSet);
                this.f3509a = m2594b();
            }
        }
        return this.f3510b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m2596a(java.lang.String r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        if (r2 != 0) goto L_0x0005;
    L_0x0003:
        monitor-exit(r1);
        return;
    L_0x0005:
        r0 = r1.f3511c;	 Catch:{ all -> 0x0012 }
        r2 = r0.add(r2);	 Catch:{ all -> 0x0012 }
        if (r2 == 0) goto L_0x0010;
    L_0x000d:
        r2 = 0;
        r1.f3510b = r2;	 Catch:{ all -> 0x0012 }
    L_0x0010:
        monitor-exit(r1);
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.r.a(java.lang.String):void");
    }

    public final synchronized void m2597a(String str, long j) {
        Object[] objArr = new Object[]{str, Long.valueOf(j)};
        C1028b.m2507b();
        Long l = (Long) this.f3512d.get(str);
        if (l == null || l.longValue() <= j) {
            this.f3512d.put(str, Long.valueOf(j));
            this.f3509a = m2594b();
            this.f3510b = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m2598b(java.lang.String r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        if (r2 != 0) goto L_0x0005;
    L_0x0003:
        monitor-exit(r1);
        return;
    L_0x0005:
        r0 = r1.f3511c;	 Catch:{ all -> 0x0012 }
        r2 = r0.remove(r2);	 Catch:{ all -> 0x0012 }
        if (r2 == 0) goto L_0x0010;
    L_0x000d:
        r2 = 0;
        r1.f3510b = r2;	 Catch:{ all -> 0x0012 }
    L_0x0010:
        monitor-exit(r1);
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.r.b(java.lang.String):void");
    }
}
