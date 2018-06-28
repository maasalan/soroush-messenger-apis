package android.databinding;

import java.util.ArrayList;
import java.util.List;

public class C0128c<C, T, A> implements Cloneable {
    private List<C> f408a = new ArrayList();
    private long f409b = 0;
    private long[] f410c;
    private int f411d;
    private final C0127a<C, T, A> f412e;

    public static abstract class C0127a<C, T, A> {
        public abstract void mo41a(C c, T t, int i);
    }

    public C0128c(C0127a<C, T, A> c0127a) {
        this.f412e = c0127a;
    }

    private synchronized C0128c<C, T, A> m196a() {
        C0128c<C, T, A> c0128c;
        CloneNotSupportedException e;
        try {
            c0128c = (C0128c) super.clone();
            try {
                c0128c.f409b = 0;
                c0128c.f410c = null;
                int i = 0;
                c0128c.f411d = 0;
                c0128c.f408a = new ArrayList();
                int size = this.f408a.size();
                while (i < size) {
                    if (!m200a(i)) {
                        c0128c.f408a.add(this.f408a.get(i));
                    }
                    i++;
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return c0128c;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            c0128c = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return c0128c;
        }
        return c0128c;
    }

    private void m197a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f408a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    private void m198a(T t, int i, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f412e.mo41a(this.f408a.get(i2), t, i);
            }
            j2 <<= 1;
            i2++;
        }
    }

    private void m199a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m198a(t, i, 0, Math.min(64, this.f408a.size()), this.f409b);
            return;
        }
        long j = this.f410c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f408a.size(), i3 + 64);
        m199a(t, i, a, i2 - 1);
        m198a(t, i, i3, min, j);
    }

    private boolean m200a(int i) {
        if (i < 64) {
            return (this.f409b & (1 << i)) != 0;
        } else if (this.f410c == null) {
            return false;
        } else {
            int i2 = (i / 64) - 1;
            return i2 < this.f410c.length && (this.f410c[i2] & (1 << (i % 64))) != 0;
        }
    }

    public final synchronized void m201a(C c) {
        if (c == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.f408a.lastIndexOf(c);
        if (lastIndexOf < 0 || m200a(lastIndexOf)) {
            this.f408a.add(c);
        }
    }

    public final synchronized void m202a(T t, int i) {
        this.f411d++;
        int size = this.f408a.size();
        int length = this.f410c == null ? -1 : this.f410c.length - 1;
        m199a(t, i, null, length);
        m198a(t, i, (length + 2) * 64, size, 0);
        this.f411d--;
        if (this.f411d == 0) {
            if (this.f410c != null) {
                for (int length2 = this.f410c.length - 1; length2 >= 0; length2--) {
                    long j = this.f410c[length2];
                    if (j != 0) {
                        m197a((length2 + 1) * 64, j);
                        this.f410c[length2] = 0;
                    }
                }
            }
            if (this.f409b != 0) {
                m197a(0, this.f409b);
                this.f409b = 0;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m203b(C r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f411d;	 Catch:{ all -> 0x005b }
        if (r0 != 0) goto L_0x000c;
    L_0x0005:
        r0 = r8.f408a;	 Catch:{ all -> 0x005b }
        r0.remove(r9);	 Catch:{ all -> 0x005b }
        monitor-exit(r8);
        return;
    L_0x000c:
        r0 = r8.f408a;	 Catch:{ all -> 0x005b }
        r9 = r0.lastIndexOf(r9);	 Catch:{ all -> 0x005b }
        if (r9 < 0) goto L_0x0059;
    L_0x0014:
        r0 = 1;
        r2 = 64;
        if (r9 >= r2) goto L_0x0023;
    L_0x001a:
        r0 = r0 << r9;
        r2 = r8.f409b;	 Catch:{ all -> 0x005b }
        r4 = r2 | r0;
        r8.f409b = r4;	 Catch:{ all -> 0x005b }
        monitor-exit(r8);
        return;
    L_0x0023:
        r3 = r9 / 64;
        r3 = r3 + -1;
        r4 = r8.f410c;	 Catch:{ all -> 0x005b }
        if (r4 != 0) goto L_0x0037;
    L_0x002b:
        r4 = r8.f408a;	 Catch:{ all -> 0x005b }
        r4 = r4.size();	 Catch:{ all -> 0x005b }
        r4 = r4 / r2;
        r4 = new long[r4];	 Catch:{ all -> 0x005b }
    L_0x0034:
        r8.f410c = r4;	 Catch:{ all -> 0x005b }
        goto L_0x004f;
    L_0x0037:
        r4 = r8.f410c;	 Catch:{ all -> 0x005b }
        r4 = r4.length;	 Catch:{ all -> 0x005b }
        if (r4 > r3) goto L_0x004f;
    L_0x003c:
        r4 = r8.f408a;	 Catch:{ all -> 0x005b }
        r4 = r4.size();	 Catch:{ all -> 0x005b }
        r4 = r4 / r2;
        r4 = new long[r4];	 Catch:{ all -> 0x005b }
        r5 = r8.f410c;	 Catch:{ all -> 0x005b }
        r6 = r8.f410c;	 Catch:{ all -> 0x005b }
        r6 = r6.length;	 Catch:{ all -> 0x005b }
        r7 = 0;
        java.lang.System.arraycopy(r5, r7, r4, r7, r6);	 Catch:{ all -> 0x005b }
        goto L_0x0034;
    L_0x004f:
        r9 = r9 % r2;
        r0 = r0 << r9;
        r9 = r8.f410c;	 Catch:{ all -> 0x005b }
        r4 = r9[r3];	 Catch:{ all -> 0x005b }
        r6 = r4 | r0;
        r9[r3] = r6;	 Catch:{ all -> 0x005b }
    L_0x0059:
        monitor-exit(r8);
        return;
    L_0x005b:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.c.b(java.lang.Object):void");
    }

    public /* synthetic */ Object clone() {
        return m196a();
    }
}
