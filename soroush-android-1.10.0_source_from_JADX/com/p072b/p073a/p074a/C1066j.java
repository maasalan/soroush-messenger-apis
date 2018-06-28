package com.p072b.p073a.p074a;

import android.content.Context;
import java.util.Set;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1066j {
    public Long f3464a;
    public final String f3465b;
    public final boolean f3466c;
    public int f3467d;
    public final String f3468e;
    public int f3469f;
    public long f3470g;
    public long f3471h;
    public long f3472i;
    public int f3473j;
    public long f3474k;
    public boolean f3475l;
    public final transient C1063i f3476m;
    protected final Set<String> f3477n;
    public volatile boolean f3478o;
    volatile boolean f3479p;
    C1073q f3480q;
    Throwable f3481r;

    public static class C5094a {
        public int f3449a = 0;
        public Long f3450b;
        private int f3451c;
        private String f3452d;
        private boolean f3453e;
        private String f3454f;
        private C1063i f3455g;
        private long f3456h;
        private long f3457i = Long.MIN_VALUE;
        private long f3458j;
        private long f3459k = Long.MAX_VALUE;
        private boolean f3460l = false;
        private int f3461m = 0;
        private Set<String> f3462n;
        private int f3463o;

        public final C5094a m2554a(int i) {
            this.f3451c = i;
            this.f3461m |= 1;
            return this;
        }

        public final C5094a m2555a(long j) {
            this.f3456h = j;
            this.f3461m |= 32;
            return this;
        }

        public final C5094a m2556a(long j, boolean z) {
            this.f3459k = j;
            this.f3460l = z;
            this.f3461m |= 128;
            return this;
        }

        public final C5094a m2557a(C1063i c1063i) {
            this.f3455g = c1063i;
            this.f3461m |= 16;
            return this;
        }

        public final C5094a m2558a(String str) {
            this.f3454f = str;
            this.f3461m |= 8;
            return this;
        }

        public final C5094a m2559a(Set<String> set) {
            this.f3462n = set;
            this.f3461m |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            return this;
        }

        public final C5094a m2560a(boolean z) {
            this.f3453e = z;
            this.f3461m |= 2;
            return this;
        }

        public final C1066j m2561a() {
            if (this.f3455g == null) {
                throw new IllegalArgumentException("must provide a job");
            }
            int i = r0.f3461m & 2047;
            if (i != 2047) {
                StringBuilder stringBuilder = new StringBuilder("must provide all required fields. your result:");
                stringBuilder.append(Long.toBinaryString((long) i));
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            String str = r0.f3452d;
            boolean z = r0.f3453e;
            int i2 = r0.f3451c;
            String str2 = r0.f3454f;
            int i3 = r0.f3449a;
            C1063i c1063i = r0.f3455g;
            long j = r0.f3456h;
            long j2 = r0.f3457i;
            long j3 = r0.f3458j;
            Set set = r0.f3462n;
            int i4 = r0.f3463o;
            long j4 = j3;
            long j5 = r0.f3459k;
            C1066j c1066j = new C1066j(str, z, i2, str2, i3, c1063i, j, j2, j4, set, i4, j5, r0.f3460l);
            if (r0.f3450b != null) {
                c1066j.m2572a(r0.f3450b.longValue());
            }
            r0.f3455g.updateFromJobHolder(c1066j);
            return c1066j;
        }

        public final C5094a m2562b(int i) {
            this.f3463o = i;
            this.f3461m |= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
            return this;
        }

        public final C5094a m2563b(long j) {
            this.f3457i = j;
            this.f3461m |= 64;
            return this;
        }

        public final C5094a m2564b(String str) {
            this.f3452d = str;
            this.f3461m |= 4;
            return this;
        }

        public final C5094a m2565c(long j) {
            this.f3458j = j;
            this.f3461m |= 256;
            return this;
        }
    }

    private C1066j(String str, boolean z, int i, String str2, int i2, C1063i c1063i, long j, long j2, long j3, Set<String> set, int i3, long j4, boolean z2) {
        this.f3465b = str;
        this.f3466c = z;
        this.f3467d = i;
        this.f3468e = str2;
        this.f3469f = i2;
        this.f3471h = j;
        this.f3470g = j2;
        this.f3476m = c1063i;
        this.f3472i = j3;
        this.f3473j = i3;
        this.f3477n = set;
        this.f3474k = j4;
        this.f3475l = z2;
    }

    public final Set<String> m2570a() {
        return this.f3477n;
    }

    public final void m2571a(int i) {
        this.f3476m.onCancel(i, this.f3481r);
    }

    public final void m2572a(long j) {
        this.f3464a = Long.valueOf(j);
    }

    public final void m2573a(Context context) {
        this.f3476m.setApplicationContext(context);
    }

    public final void m2574b() {
        this.f3478o = true;
        this.f3476m.cancelled = true;
    }

    public final boolean m2575c() {
        return this.f3477n != null && this.f3477n.size() > 0;
    }

    public final boolean m2576d() {
        return this.f3474k != Long.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1066j)) {
            return false;
        }
        return this.f3465b.equals(((C1066j) obj).f3465b);
    }

    public final int hashCode() {
        return this.f3465b.hashCode();
    }
}
