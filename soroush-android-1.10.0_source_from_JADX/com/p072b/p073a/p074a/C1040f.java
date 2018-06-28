package com.p072b.p073a.p074a;

import com.p072b.p073a.p074a.p075b.C1020a;
import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1034c;
import com.p072b.p073a.p074a.p079f.C1035d;
import com.p072b.p073a.p074a.p079f.C1036e;
import com.p072b.p073a.p074a.p079f.C1037f;
import com.p072b.p073a.p074a.p079f.C1038i;
import com.p072b.p073a.p074a.p079f.C1039j;
import com.p072b.p073a.p074a.p079f.C5088h;
import com.p072b.p073a.p074a.p079f.p511a.C5080e;
import com.p072b.p073a.p074a.p079f.p511a.C5082g;
import com.p072b.p073a.p074a.p079f.p511a.C5084i;
import com.p072b.p073a.p074a.p079f.p511a.C5085j;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class C1040f {
    List<C1032a> f3363a = new ArrayList();
    final List<C1032a> f3364b = new ArrayList();
    final C1065b f3365c;
    final C1034c f3366d;
    final Map<String, C1066j> f3367e;
    final C1074r f3368f;
    final CopyOnWriteArrayList<Runnable> f3369g = new CopyOnWriteArrayList();
    private final int f3370h;
    private final int f3371i;
    private final long f3372j;
    private final int f3373k;
    private final int f3374l;
    private final ThreadGroup f3375m;
    private final C5098l f3376n;
    private final ThreadFactory f3377o;

    static class C1032a implements Runnable {
        static final C1035d f3327g = new C50741();
        final C5088h f3328a;
        final C1036e f3329b;
        final C1034c f3330c;
        final C1065b f3331d;
        boolean f3332e;
        long f3333f;
        final C1037f f3334h = new C50752(this);

        static class C50741 implements C1035d {
            C50741() {
            }

            public final boolean mo1079a(C1033b c1033b) {
                return c1033b.f3337a == C1038i.COMMAND && ((C5080e) c1033b).f14185d == 2;
            }
        }

        class C50752 extends C1037f {
            final /* synthetic */ C1032a f14173a;

            C50752(C1032a c1032a) {
                this.f14173a = c1032a;
            }

            public final void mo1074a() {
                C1028b.m2507b();
                C5082g c5082g = (C5082g) this.f14173a.f3330c.m2518a(C5082g.class);
                c5082g.f14188d = this.f14173a;
                c5082g.f14189e = this.f14173a.f3333f;
                this.f14173a.f3329b.mo1082a(c5082g);
            }

            public final void mo1075a(C1033b c1033b) {
                switch (c1033b.f3337a) {
                    case RUN_JOB:
                        C1032a.m2514a(this.f14173a, (C5084i) c1033b);
                        this.f14173a.f3333f = this.f14173a.f3331d.mo1091a();
                        C1032a.m2512a(this.f14173a);
                        return;
                    case COMMAND:
                        C1032a.m2513a(this.f14173a, (C5080e) c1033b);
                        return;
                    default:
                        return;
                }
            }
        }

        public C1032a(C1036e c1036e, C5088h c5088h, C1034c c1034c, C1065b c1065b) {
            this.f3328a = c5088h;
            this.f3330c = c1034c;
            this.f3329b = c1036e;
            this.f3331d = c1065b;
            this.f3333f = c1065b.mo1091a();
        }

        static /* synthetic */ void m2512a(C1032a c1032a) {
            C1039j c1039j = c1032a.f3328a;
            C1035d c1035d = f3327g;
            synchronized (c1039j.f14206a) {
                C1033b c1033b = c1039j.f3359e;
                C1033b c1033b2 = null;
                C1033b c1033b3 = null;
                while (c1033b != null) {
                    if (c1035d.mo1079a(c1033b)) {
                        C1033b c1033b4 = c1033b.f3338b;
                        if (c1039j.f3360f == c1033b) {
                            c1039j.f3360f = c1033b3;
                        }
                        if (c1033b3 == null) {
                            c1039j.f3359e = c1033b.f3338b;
                        } else {
                            c1033b3.f3338b = c1033b.f3338b;
                        }
                        c1039j.f3362h.m2519a(c1033b);
                        c1033b = c1033b4;
                    } else {
                        c1033b3 = c1033b;
                        c1033b = c1033b.f3338b;
                    }
                }
                com.p072b.p073a.p074a.p079f.C1032a c1032a2 = c1039j.f14208c;
                c1033b = c1032a2.f3335a;
                while (c1033b != null) {
                    boolean a = c1035d.mo1079a(c1033b);
                    c1033b4 = c1033b.f3338b;
                    if (a) {
                        if (c1033b2 == null) {
                            c1032a2.f3335a = c1033b.f3338b;
                        } else {
                            c1033b2.f3338b = c1033b.f3338b;
                        }
                        c1032a2.f3336b.m2519a(c1033b);
                    } else {
                        c1033b2 = c1033b;
                    }
                    c1033b = c1033b4;
                }
            }
        }

        static /* synthetic */ void m2513a(C1032a c1032a, C5080e c5080e) {
            switch (c5080e.f14185d) {
                case 1:
                    c1032a.f3328a.m10373a();
                    return;
                case 2:
                    C1028b.m2507b();
                    return;
                default:
                    return;
            }
        }

        static /* synthetic */ void m2514a(C1032a c1032a, C5084i c5084i) {
            new Object[1][0] = c5084i.f14193d.getClass().getSimpleName();
            C1028b.m2507b();
            C1066j c1066j = c5084i.f14193d;
            int safeRun = c1066j.f3476m.safeRun(c1066j, c1066j.f3469f, c1032a.f3331d);
            C5085j c5085j = (C5085j) c1032a.f3330c.m2518a(C5085j.class);
            c5085j.f14194d = c1066j;
            c5085j.f14196f = safeRun;
            c5085j.f14195e = c1032a;
            c1032a.f3329b.mo1082a(c5085j);
        }

        public final void run() {
            this.f3328a.m10375a(this.f3334h);
        }
    }

    C1040f(C5098l c5098l, C1065b c1065b, C1034c c1034c, C1020a c1020a) {
        this.f3376n = c5098l;
        this.f3365c = c1065b;
        this.f3366d = c1034c;
        this.f3374l = c1020a.f3289e;
        this.f3371i = c1020a.f3287c;
        this.f3370h = c1020a.f3286b;
        this.f3372j = ((long) (c1020a.f3288d * IjkMediaCodecInfo.RANK_MAX)) * 1000000;
        this.f3373k = c1020a.f3299o;
        this.f3377o = c1020a.f3301q;
        this.f3367e = new HashMap();
        this.f3368f = new C1074r(c1065b);
        this.f3375m = new ThreadGroup("JobConsumers");
    }

    final Set<String> m2527a(C1075s c1075s, String[] strArr, boolean z) {
        Set<String> hashSet = new HashSet();
        for (C1066j c1066j : this.f3367e.values()) {
            Object[] objArr = new Object[]{c1066j.f3476m, c1066j.f3476m.getTags()};
            C1028b.m2507b();
            if (c1066j.m2575c() && !c1066j.f3478o && c1075s.m2599a(strArr, c1066j.m2570a())) {
                hashSet.add(c1066j.f3465b);
                if (z) {
                    c1066j.f3479p = true;
                }
                c1066j.m2574b();
            }
        }
        return hashSet;
    }

    final boolean m2528a() {
        return m2531a(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m2529a(com.p072b.p073a.p074a.p079f.p511a.C5082g r14) {
        /*
        r13 = this;
        r0 = r14.f14188d;
        r0 = (com.p072b.p073a.p074a.C1040f.C1032a) r0;
        r1 = r0.f3332e;
        r2 = 1;
        if (r1 == 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r1 = r13.f3376n;
        r1 = r1.f14239i;
        r3 = 0;
        r4 = 0;
        if (r1 == 0) goto L_0x0097;
    L_0x0012:
        r5 = r13.f3376n;
        r6 = r13.f3368f;
        r6 = r6.m2595a();
        r7 = r5.f14239i;
        if (r7 != 0) goto L_0x0020;
    L_0x001e:
        goto L_0x0097;
    L_0x0020:
        r7 = r3;
    L_0x0021:
        if (r7 != 0) goto L_0x0096;
    L_0x0023:
        r7 = r5.m10434b();
        com.p072b.p073a.p074a.p078e.C1028b.m2508c();
        r8 = r5.f14237g;
        r8.m2509a();
        r8 = r5.f14231a;
        r8 = r8.mo1091a();
        r10 = r5.f14237g;
        r10.f3325h = r8;
        r10 = r5.f14237g;
        r10.f3318a = r7;
        r7 = r5.f14237g;
        r7.m2510a(r6);
        r7 = r5.f14237g;
        r7.f3323f = r2;
        r7 = r5.f14237g;
        r10 = java.lang.Long.valueOf(r8);
        r7.f3324g = r10;
        r7 = r5.f14234d;
        r10 = r5.f14237g;
        r7 = r7.mo1063b(r10);
        r10 = new java.lang.Object[r2];
        r10[r4] = r7;
        com.p072b.p073a.p074a.p078e.C1028b.m2508c();
        if (r7 != 0) goto L_0x006e;
    L_0x005f:
        r7 = r5.f14233c;
        r10 = r5.f14237g;
        r7 = r7.mo1063b(r10);
        r10 = new java.lang.Object[r2];
        r10[r4] = r7;
        com.p072b.p073a.p074a.p078e.C1028b.m2508c();
    L_0x006e:
        if (r7 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0097;
    L_0x0071:
        r10 = r5.f14232b;
        r7.m2573a(r10);
        r10 = r7.f3474k;
        r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r12 > 0) goto L_0x007e;
    L_0x007c:
        r10 = r2;
        goto L_0x007f;
    L_0x007e:
        r10 = r4;
    L_0x007f:
        r11 = r7.f3476m;
        r11.setDeadlineReached(r10);
        r10 = r7.f3474k;
        r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r12 > 0) goto L_0x0021;
    L_0x008a:
        r8 = r7.f3475l;
        if (r8 == 0) goto L_0x0021;
    L_0x008e:
        r8 = 7;
        r5.m10433a(r7, r8);
        r5.m10432a(r7);
        goto L_0x0020;
    L_0x0096:
        r3 = r7;
    L_0x0097:
        if (r3 == 0) goto L_0x00ca;
    L_0x0099:
        r0.f3332e = r2;
        r14 = r13.f3368f;
        r1 = r3.f3468e;
        r14.m2596a(r1);
        r14 = r13.f3366d;
        r1 = com.p072b.p073a.p074a.p079f.p511a.C5084i.class;
        r14 = r14.m2518a(r1);
        r14 = (com.p072b.p073a.p074a.p079f.p511a.C5084i) r14;
        r14.f14193d = r3;
        r1 = r13.f3367e;
        r4 = r3.f3476m;
        r4 = r4.getId();
        r1.put(r4, r3);
        r1 = r3.f3468e;
        if (r1 == 0) goto L_0x00c4;
    L_0x00bd:
        r1 = r13.f3368f;
        r3 = r3.f3468e;
        r1.m2596a(r3);
    L_0x00c4:
        r0 = r0.f3328a;
        r0.mo1082a(r14);
        return r2;
    L_0x00ca:
        r5 = r14.f14189e;
        r7 = r13.f3372j;
        r9 = r5 + r7;
        r14 = new java.lang.Object[r2];
        r3 = java.lang.Long.valueOf(r9);
        r14[r4] = r3;
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();
        r14 = r13.f3364b;
        r14 = r14.size();
        r3 = r13.f3371i;
        if (r14 <= r3) goto L_0x00e7;
    L_0x00e5:
        r14 = r2;
        goto L_0x00e8;
    L_0x00e7:
        r14 = r4;
    L_0x00e8:
        if (r1 == 0) goto L_0x00f9;
    L_0x00ea:
        if (r14 == 0) goto L_0x00f7;
    L_0x00ec:
        r3 = r13.f3365c;
        r5 = r3.mo1091a();
        r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00f9;
    L_0x00f7:
        r3 = r4;
        goto L_0x00fa;
    L_0x00f9:
        r3 = r2;
    L_0x00fa:
        r5 = 2;
        r6 = new java.lang.Object[r5];
        r7 = java.lang.Boolean.valueOf(r3);
        r6[r4] = r7;
        r1 = java.lang.Boolean.valueOf(r1);
        r6[r2] = r1;
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();
        if (r3 == 0) goto L_0x015c;
    L_0x010e:
        r14 = r13.f3366d;
        r1 = com.p072b.p073a.p074a.p079f.p511a.C5080e.class;
        r14 = r14.m2518a(r1);
        r14 = (com.p072b.p073a.p074a.p079f.p511a.C5080e) r14;
        r14.f14185d = r2;
        r1 = r0.f3328a;
        r1.mo1082a(r14);
        r14 = r13.f3363a;
        r14.remove(r0);
        r14 = r13.f3364b;
        r14.remove(r0);
        r14 = new java.lang.Object[r2];
        r0 = r13.f3364b;
        r0 = r0.size();
        r0 = java.lang.Integer.valueOf(r0);
        r14[r4] = r0;
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();
        r14 = r13.f3364b;
        r14 = r14.isEmpty();
        if (r14 == 0) goto L_0x01aa;
    L_0x0142:
        r14 = r13.f3369g;
        if (r14 == 0) goto L_0x01aa;
    L_0x0146:
        r14 = r13.f3369g;
        r14 = r14.iterator();
    L_0x014c:
        r0 = r14.hasNext();
        if (r0 == 0) goto L_0x01aa;
    L_0x0152:
        r0 = r14.next();
        r0 = (java.lang.Runnable) r0;
        r0.run();
        goto L_0x014c;
    L_0x015c:
        r1 = r13.f3363a;
        r1 = r1.contains(r0);
        if (r1 != 0) goto L_0x0169;
    L_0x0164:
        r1 = r13.f3363a;
        r1.add(r0);
    L_0x0169:
        if (r14 != 0) goto L_0x0173;
    L_0x016b:
        r1 = r13.f3376n;
        r1 = r1.f14235e;
        r1 = r1 instanceof com.p072b.p073a.p074a.p080g.C1042a;
        if (r1 != 0) goto L_0x01aa;
    L_0x0173:
        r1 = r13.f3366d;
        r3 = com.p072b.p073a.p074a.p079f.p511a.C5080e.class;
        r1 = r1.m2518a(r3);
        r1 = (com.p072b.p073a.p074a.p079f.p511a.C5080e) r1;
        r1.f14185d = r5;
        if (r14 != 0) goto L_0x018b;
    L_0x0181:
        r14 = r13.f3365c;
        r5 = r14.mo1091a();
        r7 = r13.f3372j;
        r9 = r5 + r7;
    L_0x018b:
        r14 = r0.f3328a;
        r0 = r14.f14206a;
        monitor-enter(r0);
        r14.f14209d = r2;	 Catch:{ all -> 0x01ab }
        r3 = r14.f14208c;	 Catch:{ all -> 0x01ab }
        r3.m2516a(r1, r9);	 Catch:{ all -> 0x01ab }
        r1 = r14.f14207b;	 Catch:{ all -> 0x01ab }
        r14 = r14.f14206a;	 Catch:{ all -> 0x01ab }
        r1.mo1094b(r14);	 Catch:{ all -> 0x01ab }
        monitor-exit(r0);	 Catch:{ all -> 0x01ab }
        r14 = new java.lang.Object[r2];
        r0 = java.lang.Long.valueOf(r9);
        r14[r4] = r0;
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();
    L_0x01aa:
        return r4;
    L_0x01ab:
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01ab }
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.f.a(com.b.a.a.f.a.g):boolean");
    }

    final boolean m2530a(String str) {
        return this.f3367e.get(str) != null;
    }

    final boolean m2531a(boolean z) {
        Object[] objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(this.f3376n.f14239i), Integer.valueOf(this.f3363a.size())};
        C1028b.m2507b();
        if (!this.f3376n.f14239i) {
            C1028b.m2507b();
            return false;
        } else if (this.f3363a.size() > 0) {
            C1028b.m2507b();
            for (int size = this.f3363a.size() - 1; size >= 0; size--) {
                C1032a c1032a = (C1032a) this.f3363a.remove(size);
                C1033b c1033b = (C5080e) this.f3366d.m2518a(C5080e.class);
                c1033b.f14185d = 2;
                c1032a.f3328a.mo1082a(c1033b);
                if (!z) {
                    break;
                }
            }
            C1028b.m2507b();
            return true;
        } else {
            boolean z2;
            int size2 = this.f3364b.size();
            if (size2 >= this.f3370h) {
                new Object[1][0] = Integer.valueOf(size2);
                C1028b.m2507b();
                z2 = false;
            } else {
                Object[] objArr2;
                C5098l c5098l = this.f3376n;
                int a = c5098l.m10430a(c5098l.m10434b()) + this.f3367e.size();
                if (this.f3374l * size2 >= a) {
                    if (size2 >= this.f3371i || size2 >= a) {
                        z2 = false;
                        objArr2 = new Object[]{Integer.valueOf(size2), Integer.valueOf(this.f3371i), Integer.valueOf(this.f3370h), Integer.valueOf(this.f3374l), Integer.valueOf(r1), Integer.valueOf(r2), Boolean.valueOf(z2)};
                        C1028b.m2507b();
                    }
                }
                z2 = true;
                objArr2 = new Object[]{Integer.valueOf(size2), Integer.valueOf(this.f3371i), Integer.valueOf(this.f3370h), Integer.valueOf(this.f3374l), Integer.valueOf(r1), Integer.valueOf(r2), Boolean.valueOf(z2)};
                C1028b.m2507b();
            }
            new Object[1][0] = Boolean.valueOf(z2);
            C1028b.m2507b();
            if (!z2) {
                return false;
            }
            Thread newThread;
            C1028b.m2507b();
            Runnable c1032a2 = new C1032a(this.f3376n.f14240j, new C5088h(this.f3365c, this.f3366d, "consumer"), this.f3366d, this.f3365c);
            if (this.f3377o != null) {
                newThread = this.f3377o.newThread(c1032a2);
            } else {
                ThreadGroup threadGroup = this.f3375m;
                StringBuilder stringBuilder = new StringBuilder("job-queue-worker-");
                stringBuilder.append(UUID.randomUUID());
                newThread = new Thread(threadGroup, c1032a2, stringBuilder.toString());
                newThread.setPriority(this.f3373k);
            }
            this.f3364b.add(c1032a2);
            newThread.start();
            return true;
        }
    }
}
