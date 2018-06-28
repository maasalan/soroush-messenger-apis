package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.C2206e.C2205a;

public final class C2202c {
    private volatile C2206e f7280a;
    private volatile C2201b f7281b;

    public static final class C2200a {
        private static final C2202c f7279a = new C2202c();
    }

    public interface C2201b {
        void mo1966a(MessageSnapshot messageSnapshot);
    }

    public final void m6048a(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof C2198a) {
            if (this.f7281b != null) {
                this.f7281b.mo1966a(messageSnapshot);
            }
        } else if (this.f7280a != null) {
            C2206e c2206e = this.f7280a;
            C2205a c2205a = null;
            try {
                synchronized (c2206e.f7287a) {
                    int i = messageSnapshot.f15595a;
                    for (C2205a c2205a2 : c2206e.f7287a) {
                        if (c2205a2.f7284a.contains(Integer.valueOf(i))) {
                            c2205a = c2205a2;
                            break;
                        }
                    }
                    if (c2205a == null) {
                        int i2 = 0;
                        for (C2205a c2205a22 : c2206e.f7287a) {
                            if (c2205a22.f7284a.size() <= 0) {
                                c2205a = c2205a22;
                                break;
                            } else if (i2 == 0 || c2205a22.f7284a.size() < i2) {
                                i2 = c2205a22.f7284a.size();
                                c2205a = c2205a22;
                            }
                        }
                    }
                    c2205a.f7284a.add(Integer.valueOf(i));
                }
                c2205a.m6056a(messageSnapshot);
            } catch (Throwable th) {
                c2205a.m6056a(messageSnapshot);
            }
        }
    }

    public final void m6049a(C2201b c2201b) {
        this.f7281b = c2201b;
        if (c2201b == null) {
            this.f7280a = null;
        } else {
            this.f7280a = new C2206e(c2201b);
        }
    }
}
