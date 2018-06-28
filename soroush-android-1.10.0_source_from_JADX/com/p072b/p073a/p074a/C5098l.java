package com.p072b.p073a.p074a;

import android.content.Context;
import com.p072b.p073a.p074a.C1040f.C1032a;
import com.p072b.p073a.p074a.C1066j.C5094a;
import com.p072b.p073a.p074a.p075b.C1020a;
import com.p072b.p073a.p074a.p076c.C1022a;
import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1034c;
import com.p072b.p073a.p074a.p079f.C1037f;
import com.p072b.p073a.p074a.p079f.C1038i;
import com.p072b.p073a.p074a.p079f.C1039j;
import com.p072b.p073a.p074a.p079f.C5087g;
import com.p072b.p073a.p074a.p079f.C5088h;
import com.p072b.p073a.p074a.p079f.p511a.C5076a;
import com.p072b.p073a.p074a.p079f.p511a.C5077b;
import com.p072b.p073a.p074a.p079f.p511a.C5078c;
import com.p072b.p073a.p074a.p079f.p511a.C5080e;
import com.p072b.p073a.p074a.p079f.p511a.C5081f;
import com.p072b.p073a.p074a.p079f.p511a.C5082g;
import com.p072b.p073a.p074a.p079f.p511a.C5083h;
import com.p072b.p073a.p074a.p079f.p511a.C5085j;
import com.p072b.p073a.p074a.p079f.p511a.C5086k;
import com.p072b.p073a.p074a.p080g.C1042a;
import com.p072b.p073a.p074a.p080g.C1042a.C1041a;
import com.p072b.p073a.p074a.p080g.C1043b;
import com.p072b.p073a.p074a.p083i.C1061a;
import com.p072b.p073a.p074a.p083i.C1062b;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

final class C5098l implements C1041a, Runnable {
    final C1065b f14231a;
    final Context f14232b;
    final C1069m f14233c;
    final C1069m f14234d;
    final C1043b f14235e;
    final C1040f f14236f;
    final C1029e f14237g = new C1029e();
    final C1021b f14238h;
    boolean f14239i = true;
    final C5087g f14240j;
    C1061a f14241k;
    private final long f14242l;
    private final C1022a f14243m;
    private final C1034c f14244n;
    private List<C1023c> f14245o;
    private List<C1062b> f14246p;
    private boolean f14247q = false;
    private boolean f14248r = true;

    class C50971 extends C1037f {
        final /* synthetic */ C5098l f14230a;

        C50971(C5098l c5098l) {
            this.f14230a = c5098l;
        }

        public final void mo1074a() {
            new Object[1][0] = Boolean.valueOf(this.f14230a.f14239i);
            C1028b.m2508c();
            if (!this.f14230a.f14239i) {
                return;
            }
            if (this.f14230a.f14248r) {
                C5098l c5098l = this.f14230a;
                C1074r c1074r = c5098l.f14236f.f3368f;
                Long valueOf = c1074r.f3509a == Long.MAX_VALUE ? null : Long.valueOf(c1074r.f3509a);
                int b = c5098l.m10434b();
                Collection a = c5098l.f14236f.f3368f.m2595a();
                c5098l.f14237g.m2509a();
                c5098l.f14237g.f3325h = c5098l.f14231a.mo1091a();
                c5098l.f14237g.f3318a = b;
                c5098l.f14237g.m2510a(a);
                c5098l.f14237g.f3323f = true;
                Long c = c5098l.f14234d.mo1066c(c5098l.f14237g);
                Long c2 = c5098l.f14233c.mo1066c(c5098l.f14237g);
                if (valueOf == null) {
                    valueOf = null;
                }
                if (c != null) {
                    valueOf = Long.valueOf(valueOf == null ? c.longValue() : Math.min(c.longValue(), valueOf.longValue()));
                }
                if (c2 != null) {
                    valueOf = Long.valueOf(valueOf == null ? c2.longValue() : Math.min(c2.longValue(), valueOf.longValue()));
                }
                if (!(c5098l.f14235e instanceof C1042a)) {
                    long a2 = c5098l.f14231a.mo1091a() + C1067k.f3482a;
                    if (valueOf != null) {
                        a2 = Math.min(a2, valueOf.longValue());
                    }
                    valueOf = Long.valueOf(a2);
                }
                new Object[1][0] = valueOf;
                C1028b.m2507b();
                if (valueOf != null) {
                    C1033b c1033b = (C5081f) this.f14230a.f14244n.m2518a(C5081f.class);
                    c1033b.f14187d = true;
                    C5087g c5087g = this.f14230a.f14240j;
                    long longValue = valueOf.longValue();
                    synchronized (c5087g.f14199a) {
                        c5087g.f14204f = true;
                        c5087g.f14201c.m2516a(c1033b, longValue);
                        c5087g.f14202d.mo1094b(c5087g.f14199a);
                    }
                    return;
                }
                if (this.f14230a.f14241k != null && this.f14230a.f14247q && this.f14230a.f14233c.mo1058a() == 0) {
                    this.f14230a.f14247q = false;
                    this.f14230a.f14241k.mo1070a();
                }
                return;
            }
            C1028b.m2508c();
        }

        public final void mo1075a(C1033b c1033b) {
            boolean z = true;
            this.f14230a.f14248r = true;
            switch (c1033b.f3337a) {
                case ADD_JOB:
                    C5098l.m10415a(this.f14230a, (C5076a) c1033b);
                    break;
                case JOB_CONSUMER_IDLE:
                    if (!this.f14230a.f14236f.m2529a((C5082g) c1033b)) {
                        C5098l.m10414a(this.f14230a);
                        return;
                    }
                    break;
                case RUN_JOB_RESULT:
                    C5098l.m10419a(this.f14230a, (C5085j) c1033b);
                    return;
                case CONSTRAINT_CHANGE:
                    boolean a = this.f14230a.f14236f.m2531a(true);
                    C5081f c5081f = (C5081f) c1033b;
                    C5098l c5098l = this.f14230a;
                    if (!a) {
                        if (c5081f.f14187d) {
                            z = false;
                        }
                    }
                    c5098l.f14248r = z;
                    return;
                case CANCEL:
                    C5098l.m10416a(this.f14230a, (C5078c) c1033b);
                    return;
                case PUBLIC_QUERY:
                    C5098l.m10418a(this.f14230a, (C5083h) c1033b);
                    return;
                case COMMAND:
                    C5098l.m10417a(this.f14230a, (C5080e) c1033b);
                    return;
                case SCHEDULER:
                    C5098l.m10420a(this.f14230a, (C5086k) c1033b);
                    return;
                default:
                    return;
            }
        }
    }

    C5098l(C1020a c1020a, C5087g c5087g, C1034c c1034c) {
        this.f14240j = c5087g;
        if (c1020a.f3294j != null) {
            C1028b.m2503a(c1020a.f3294j);
        }
        this.f14244n = c1034c;
        this.f14231a = c1020a.f3295k;
        this.f14232b = c1020a.f3290f;
        this.f14242l = this.f14231a.mo1091a();
        this.f14241k = c1020a.f3296l;
        if (!(this.f14241k == null || !c1020a.f3300p || (this.f14241k instanceof C5069a))) {
            this.f14241k = new C5069a(this.f14241k, this.f14231a);
        }
        this.f14233c = c1020a.f3291g.mo1087a(c1020a, this.f14242l);
        this.f14234d = c1020a.f3291g.mo1086a(this.f14242l);
        this.f14235e = c1020a.f3293i;
        this.f14243m = c1020a.f3292h;
        if (this.f14235e instanceof C1042a) {
            ((C1042a) this.f14235e).mo1085a(this);
        }
        this.f14236f = new C1040f(this, this.f14231a, c1034c, c1020a);
        this.f14238h = new C1021b(c1034c, this.f14231a);
    }

    static /* synthetic */ void m10414a(C5098l c5098l) {
        if (!(c5098l.f14241k == null || c5098l.f14246p == null || c5098l.f14246p.isEmpty())) {
            C1040f c1040f = c5098l.f14236f;
            if ((c1040f.f3363a.size() == c1040f.f3364b.size() ? 1 : 0) != 0) {
                for (int size = c5098l.f14246p.size() - 1; size >= 0; size--) {
                    C1062b c1062b = (C1062b) c5098l.f14246p.remove(size);
                    c5098l.f14241k.mo1073a(c1062b, c5098l.m10421a(c1062b));
                }
            }
        }
    }

    static /* synthetic */ void m10415a(C5098l c5098l, C5076a c5076a) {
        C1066j c1066j;
        boolean z;
        C1069m c1069m;
        Object[] objArr;
        C1021b c1021b;
        C1063i c1063i;
        C1033b c1033b;
        int i;
        long j;
        long j2;
        long toMillis;
        Long valueOf;
        boolean z2;
        C1062b c1062b;
        C5098l c5098l2 = c5098l;
        C1063i c1063i2 = c5076a.f14174d;
        long a = c5098l2.f14231a.mo1091a();
        long delayInMs = c1063i2.getDelayInMs() > 0 ? a + (c1063i2.getDelayInMs() * 1000000) : Long.MIN_VALUE;
        long deadlineInMs = c1063i2.getDeadlineInMs() > 0 ? a + (c1063i2.getDeadlineInMs() * 1000000) : Long.MAX_VALUE;
        C5094a a2 = new C5094a().m2554a(c1063i2.getPriority()).m2557a(c1063i2).m2558a(c1063i2.getRunGroupId()).m2555a(a).m2563b(delayInMs).m2564b(c1063i2.getId()).m2559a(c1063i2.getTags()).m2560a(c1063i2.isPersistent());
        boolean z3 = false;
        a2.f3449a = 0;
        C1066j a3 = a2.m2556a(deadlineInMs, c1063i2.shouldCancelOnDeadline()).m2562b(c1063i2.requiredNetworkType).m2565c(Long.MIN_VALUE).m2561a();
        if (c1063i2.getSingleInstanceId() != null) {
            c5098l2.f14237g.m2509a();
            c5098l2.f14237g.m2511a(new String[]{r5});
            c5098l2.f14237g.f3319b = C1075s.ANY;
            c5098l2.f14237g.f3318a = 2;
            Set<C1066j> d = c5098l2.f14234d.mo1068d(c5098l2.f14237g);
            d.addAll(c5098l2.f14233c.mo1068d(c5098l2.f14237g));
            if (!d.isEmpty()) {
                for (C1066j c1066j2 : d) {
                    if (!c5098l2.f14236f.m2530a(c1066j2.f3465b)) {
                        break;
                    }
                }
                c1066j2 = (C1066j) d.iterator().next();
                if (c1066j2 != null) {
                    if (c5098l2.f14236f.m2530a(c1066j2.f3465b)) {
                        z = false;
                        if (z) {
                            new Object[1][0] = c1063i2.getSingleInstanceId();
                        } else {
                            c1069m = c1063i2.isPersistent() ? c5098l2.f14233c : c5098l2.f14234d;
                            if (c1066j2 == null) {
                                c5098l2.f14236f.m2527a(C1075s.ANY, new String[]{c1063i2.getSingleInstanceId()}, true);
                                c1069m.mo1061a(a3, c1066j2);
                            } else {
                                c1069m.mo1062a(a3);
                            }
                            if (C1028b.m2506a()) {
                                objArr = new Object[]{c1063i2.getClass().getSimpleName(), Integer.valueOf(c1063i2.getPriority()), Long.valueOf(c1063i2.getDelayInMs()), c1063i2.getRunGroupId(), Boolean.valueOf(c1063i2.isPersistent())};
                            }
                            a3.m2573a(c5098l2.f14232b);
                            a3.f3476m.onAdded();
                            c1021b = c5098l2.f14238h;
                            c1063i = a3.f3476m;
                            if (c1021b.m2496b()) {
                                c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                                c1033b.m10358a(c1063i, 1);
                                c1021b.f3302a.mo1082a(c1033b);
                            }
                            if (z) {
                                c5098l2.m10433a(a3, 1);
                                c5098l2.f14238h.m2494a(a3.f3476m);
                            } else {
                                c5098l2.f14236f.m2531a(false);
                                if (c1063i2.isPersistent() && c5098l2.f14241k != null) {
                                    i = a3.f3473j;
                                    j = a3.f3470g;
                                    j2 = a3.f3474k;
                                    toMillis = j <= a ? TimeUnit.NANOSECONDS.toMillis(j - a) : 0;
                                    valueOf = j2 == Long.MAX_VALUE ? Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j2 - a)) : null;
                                    z2 = j <= a && toMillis >= 30000;
                                    if (valueOf != null && valueOf.longValue() >= 30000) {
                                        z3 = true;
                                    }
                                    if (i != 0 || z2 || r13) {
                                        c1062b = new C1062b(UUID.randomUUID().toString());
                                        c1062b.f3446c = i;
                                        c1062b.f3445b = toMillis;
                                        c1062b.f3447d = valueOf;
                                        c5098l2.f14241k.mo1072a(c1062b);
                                        c5098l2.f14247q = true;
                                    }
                                }
                            }
                        }
                        C1028b.m2507b();
                        a3.m2573a(c5098l2.f14232b);
                        a3.f3476m.onAdded();
                        c1021b = c5098l2.f14238h;
                        c1063i = a3.f3476m;
                        if (c1021b.m2496b()) {
                            c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                            c1033b.m10358a(c1063i, 1);
                            c1021b.f3302a.mo1082a(c1033b);
                        }
                        if (z) {
                            c5098l2.m10433a(a3, 1);
                            c5098l2.f14238h.m2494a(a3.f3476m);
                        } else {
                            c5098l2.f14236f.m2531a(false);
                            i = a3.f3473j;
                            j = a3.f3470g;
                            j2 = a3.f3474k;
                            if (j <= a) {
                            }
                            if (j2 == Long.MAX_VALUE) {
                            }
                            if (j <= a) {
                            }
                            z3 = true;
                            c1062b = new C1062b(UUID.randomUUID().toString());
                            c1062b.f3446c = i;
                            c1062b.f3445b = toMillis;
                            c1062b.f3447d = valueOf;
                            c5098l2.f14241k.mo1072a(c1062b);
                            c5098l2.f14247q = true;
                        }
                    }
                }
                z = true;
                if (z) {
                    new Object[1][0] = c1063i2.getSingleInstanceId();
                } else {
                    if (c1063i2.isPersistent()) {
                    }
                    if (c1066j2 == null) {
                        c1069m.mo1062a(a3);
                    } else {
                        c5098l2.f14236f.m2527a(C1075s.ANY, new String[]{c1063i2.getSingleInstanceId()}, true);
                        c1069m.mo1061a(a3, c1066j2);
                    }
                    if (C1028b.m2506a()) {
                        objArr = new Object[]{c1063i2.getClass().getSimpleName(), Integer.valueOf(c1063i2.getPriority()), Long.valueOf(c1063i2.getDelayInMs()), c1063i2.getRunGroupId(), Boolean.valueOf(c1063i2.isPersistent())};
                    }
                    a3.m2573a(c5098l2.f14232b);
                    a3.f3476m.onAdded();
                    c1021b = c5098l2.f14238h;
                    c1063i = a3.f3476m;
                    if (c1021b.m2496b()) {
                        c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                        c1033b.m10358a(c1063i, 1);
                        c1021b.f3302a.mo1082a(c1033b);
                    }
                    if (z) {
                        c5098l2.f14236f.m2531a(false);
                        i = a3.f3473j;
                        j = a3.f3470g;
                        j2 = a3.f3474k;
                        if (j <= a) {
                        }
                        if (j2 == Long.MAX_VALUE) {
                        }
                        if (j <= a) {
                        }
                        z3 = true;
                        c1062b = new C1062b(UUID.randomUUID().toString());
                        c1062b.f3446c = i;
                        c1062b.f3445b = toMillis;
                        c1062b.f3447d = valueOf;
                        c5098l2.f14241k.mo1072a(c1062b);
                        c5098l2.f14247q = true;
                    }
                    c5098l2.m10433a(a3, 1);
                    c5098l2.f14238h.m2494a(a3.f3476m);
                }
                C1028b.m2507b();
                a3.m2573a(c5098l2.f14232b);
                a3.f3476m.onAdded();
                c1021b = c5098l2.f14238h;
                c1063i = a3.f3476m;
                if (c1021b.m2496b()) {
                    c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                    c1033b.m10358a(c1063i, 1);
                    c1021b.f3302a.mo1082a(c1033b);
                }
                if (z) {
                    c5098l2.m10433a(a3, 1);
                    c5098l2.f14238h.m2494a(a3.f3476m);
                } else {
                    c5098l2.f14236f.m2531a(false);
                    i = a3.f3473j;
                    j = a3.f3470g;
                    j2 = a3.f3474k;
                    if (j <= a) {
                    }
                    if (j2 == Long.MAX_VALUE) {
                    }
                    if (j <= a) {
                    }
                    z3 = true;
                    c1062b = new C1062b(UUID.randomUUID().toString());
                    c1062b.f3446c = i;
                    c1062b.f3445b = toMillis;
                    c1062b.f3447d = valueOf;
                    c5098l2.f14241k.mo1072a(c1062b);
                    c5098l2.f14247q = true;
                }
            }
        }
        c1066j2 = null;
        if (c1066j2 != null) {
            if (c5098l2.f14236f.m2530a(c1066j2.f3465b)) {
                z = false;
                if (z) {
                    if (c1063i2.isPersistent()) {
                    }
                    if (c1066j2 == null) {
                        c5098l2.f14236f.m2527a(C1075s.ANY, new String[]{c1063i2.getSingleInstanceId()}, true);
                        c1069m.mo1061a(a3, c1066j2);
                    } else {
                        c1069m.mo1062a(a3);
                    }
                    if (C1028b.m2506a()) {
                        objArr = new Object[]{c1063i2.getClass().getSimpleName(), Integer.valueOf(c1063i2.getPriority()), Long.valueOf(c1063i2.getDelayInMs()), c1063i2.getRunGroupId(), Boolean.valueOf(c1063i2.isPersistent())};
                    }
                    a3.m2573a(c5098l2.f14232b);
                    a3.f3476m.onAdded();
                    c1021b = c5098l2.f14238h;
                    c1063i = a3.f3476m;
                    if (c1021b.m2496b()) {
                        c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                        c1033b.m10358a(c1063i, 1);
                        c1021b.f3302a.mo1082a(c1033b);
                    }
                    if (z) {
                        c5098l2.f14236f.m2531a(false);
                        i = a3.f3473j;
                        j = a3.f3470g;
                        j2 = a3.f3474k;
                        if (j <= a) {
                        }
                        if (j2 == Long.MAX_VALUE) {
                        }
                        if (j <= a) {
                        }
                        z3 = true;
                        c1062b = new C1062b(UUID.randomUUID().toString());
                        c1062b.f3446c = i;
                        c1062b.f3445b = toMillis;
                        c1062b.f3447d = valueOf;
                        c5098l2.f14241k.mo1072a(c1062b);
                        c5098l2.f14247q = true;
                    }
                    c5098l2.m10433a(a3, 1);
                    c5098l2.f14238h.m2494a(a3.f3476m);
                }
                new Object[1][0] = c1063i2.getSingleInstanceId();
                C1028b.m2507b();
                a3.m2573a(c5098l2.f14232b);
                a3.f3476m.onAdded();
                c1021b = c5098l2.f14238h;
                c1063i = a3.f3476m;
                if (c1021b.m2496b()) {
                    c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                    c1033b.m10358a(c1063i, 1);
                    c1021b.f3302a.mo1082a(c1033b);
                }
                if (z) {
                    c5098l2.m10433a(a3, 1);
                    c5098l2.f14238h.m2494a(a3.f3476m);
                } else {
                    c5098l2.f14236f.m2531a(false);
                    i = a3.f3473j;
                    j = a3.f3470g;
                    j2 = a3.f3474k;
                    if (j <= a) {
                    }
                    if (j2 == Long.MAX_VALUE) {
                    }
                    if (j <= a) {
                    }
                    z3 = true;
                    c1062b = new C1062b(UUID.randomUUID().toString());
                    c1062b.f3446c = i;
                    c1062b.f3445b = toMillis;
                    c1062b.f3447d = valueOf;
                    c5098l2.f14241k.mo1072a(c1062b);
                    c5098l2.f14247q = true;
                }
            }
        }
        z = true;
        if (z) {
            new Object[1][0] = c1063i2.getSingleInstanceId();
        } else {
            if (c1063i2.isPersistent()) {
            }
            if (c1066j2 == null) {
                c1069m.mo1062a(a3);
            } else {
                c5098l2.f14236f.m2527a(C1075s.ANY, new String[]{c1063i2.getSingleInstanceId()}, true);
                c1069m.mo1061a(a3, c1066j2);
            }
            if (C1028b.m2506a()) {
                objArr = new Object[]{c1063i2.getClass().getSimpleName(), Integer.valueOf(c1063i2.getPriority()), Long.valueOf(c1063i2.getDelayInMs()), c1063i2.getRunGroupId(), Boolean.valueOf(c1063i2.isPersistent())};
            }
            a3.m2573a(c5098l2.f14232b);
            a3.f3476m.onAdded();
            c1021b = c5098l2.f14238h;
            c1063i = a3.f3476m;
            if (c1021b.m2496b()) {
                c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
                c1033b.m10358a(c1063i, 1);
                c1021b.f3302a.mo1082a(c1033b);
            }
            if (z) {
                c5098l2.f14236f.m2531a(false);
                i = a3.f3473j;
                j = a3.f3470g;
                j2 = a3.f3474k;
                if (j <= a) {
                }
                if (j2 == Long.MAX_VALUE) {
                }
                if (j <= a) {
                }
                z3 = true;
                c1062b = new C1062b(UUID.randomUUID().toString());
                c1062b.f3446c = i;
                c1062b.f3445b = toMillis;
                c1062b.f3447d = valueOf;
                c5098l2.f14241k.mo1072a(c1062b);
                c5098l2.f14247q = true;
            }
            c5098l2.m10433a(a3, 1);
            c5098l2.f14238h.m2494a(a3.f3476m);
        }
        C1028b.m2507b();
        a3.m2573a(c5098l2.f14232b);
        a3.f3476m.onAdded();
        c1021b = c5098l2.f14238h;
        c1063i = a3.f3476m;
        if (c1021b.m2496b()) {
            c1033b = (C5077b) c1021b.f3304c.m2518a(C5077b.class);
            c1033b.m10358a(c1063i, 1);
            c1021b.f3302a.mo1082a(c1033b);
        }
        if (z) {
            c5098l2.m10433a(a3, 1);
            c5098l2.f14238h.m2494a(a3.f3476m);
        } else {
            c5098l2.f14236f.m2531a(false);
            i = a3.f3473j;
            j = a3.f3470g;
            j2 = a3.f3474k;
            if (j <= a) {
            }
            if (j2 == Long.MAX_VALUE) {
            }
            if (j <= a) {
            }
            z3 = true;
            c1062b = new C1062b(UUID.randomUUID().toString());
            c1062b.f3446c = i;
            c1062b.f3445b = toMillis;
            c1062b.f3447d = valueOf;
            c5098l2.f14241k.mo1072a(c1062b);
            c5098l2.f14247q = true;
        }
    }

    static /* synthetic */ void m10416a(C5098l c5098l, C5078c c5078c) {
        C1023c c1023c = new C1023c(c5078c.f14180d, c5078c.f14181e, c5078c.f14182f);
        c1023c.f3308a = c5098l.f14236f.m2527a(c1023c.f3309b, c1023c.f3310c, false);
        C1029e c1029e = c5098l.f14237g;
        c1029e.m2509a();
        c1029e.f3325h = c5098l.f14231a.mo1091a();
        c1029e.f3319b = c1023c.f3309b;
        Collection collection = c1023c.f3308a;
        c1029e.f3322e.clear();
        if (collection != null) {
            c1029e.f3322e.addAll(collection);
        }
        c1029e.m2511a(c1023c.f3310c);
        c1029e.f3323f = true;
        c1029e.f3318a = 2;
        Set<C1066j> d = c5098l.f14234d.mo1068d(c1029e);
        Set<C1066j> d2 = c5098l.f14233c.mo1068d(c1029e);
        for (C1066j c1066j : d) {
            c1066j.m2574b();
            c1023c.f3311d.add(c1066j);
            c5098l.f14234d.mo1069d(c1066j);
        }
        for (C1066j c1066j2 : d2) {
            c1066j2.m2574b();
            c1023c.f3311d.add(c1066j2);
            c5098l.f14233c.mo1069d(c1066j2);
        }
        if (c1023c.m2498a()) {
            c1023c.m2497a(c5098l);
            return;
        }
        if (c5098l.f14245o == null) {
            c5098l.f14245o = new ArrayList();
        }
        c5098l.f14245o.add(c1023c);
    }

    static /* synthetic */ void m10417a(C5098l c5098l, C5080e c5080e) {
        if (c5080e.f14185d == 1) {
            C5087g c5087g = c5098l.f14240j;
            c5087g.f14203e.set(false);
            synchronized (c5087g.f14199a) {
                c5087g.f14202d.mo1094b(c5087g.f14199a);
            }
            C5087g c5087g2 = c5098l.f14240j;
            synchronized (c5087g2.f14199a) {
                for (int i = C1038i.f3354o; i >= 0; i--) {
                    C1039j c1039j = c5087g2.f14200b[i];
                    if (c1039j != null) {
                        c1039j.mo1083b();
                    }
                }
            }
        }
    }

    static /* synthetic */ void m10418a(C5098l c5098l, C5083h c5083h) {
        int i = c5083h.f14191e;
        if (i != 101) {
            switch (i) {
                case 0:
                    c5083h.f14190d.mo1095a(c5098l.f14233c.mo1058a() + c5098l.f14234d.mo1058a());
                    return;
                case 1:
                    c5083h.f14190d.mo1095a(c5098l.m10430a(c5098l.m10434b()));
                    return;
                case 2:
                    C1028b.m2507b();
                    if (!c5098l.f14239i) {
                        c5098l.f14239i = true;
                        c5098l.f14236f.m2531a(true);
                        break;
                    }
                    break;
                case 3:
                    C1028b.m2507b();
                    c5098l.f14239i = false;
                    C1040f c1040f = c5098l.f14236f;
                    for (C1032a c1032a : c1040f.f3364b) {
                        C5088h c5088h = c1032a.f3328a;
                        C1033b c1033b = (C5080e) c1040f.f3366d.m2518a(C5080e.class);
                        c1033b.f14185d = 2;
                        c5088h.mo1082a(c1033b);
                    }
                    if (c1040f.f3364b.isEmpty()) {
                        Iterator it = c1040f.f3369g.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                    }
                    return;
                case 4:
                    int i2;
                    String str = c5083h.f14192f;
                    if (c5098l.f14236f.m2530a(str)) {
                        i2 = C1070n.f3491c;
                    } else {
                        C1066j a = c5098l.f14234d.mo1060a(str);
                        if (a == null) {
                            a = c5098l.f14233c.mo1060a(str);
                        }
                        if (a == null) {
                            i2 = C1070n.f3492d;
                        } else {
                            i = c5098l.m10434b();
                            long a2 = c5098l.f14231a.mo1091a();
                            if (i >= a.f3473j) {
                                if (a.f3470g <= a2) {
                                    i2 = C1070n.f3490b;
                                }
                            }
                            i2 = C1070n.f3489a;
                        }
                    }
                    c5083h.f14190d.mo1095a(i2 - 1);
                    return;
                case 5:
                    c5098l.f14234d.mo1064b();
                    c5098l.f14233c.mo1064b();
                    if (c5083h.f14190d != null) {
                        c5083h.f14190d.mo1095a(0);
                        return;
                    }
                    break;
                case 6:
                    c5083h.f14190d.mo1095a(c5098l.f14236f.f3364b.size());
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder("cannot handle public query with type ");
                    stringBuilder.append(c5083h.f14191e);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            return;
        }
        c5083h.f14190d.mo1095a(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m10419a(com.p072b.p073a.p074a.C5098l r17, com.p072b.p073a.p074a.p079f.p511a.C5085j r18) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = r1.f14196f;
        r3 = r1.f14194d;
        r4 = r0.f14238h;
        r5 = r3.f3476m;
        r6 = r4.m2496b();
        r7 = 2;
        if (r6 == 0) goto L_0x0025;
    L_0x0013:
        r6 = r4.f3304c;
        r8 = com.p072b.p073a.p074a.p079f.p511a.C5077b.class;
        r6 = r6.m2518a(r8);
        r6 = (com.p072b.p073a.p074a.p079f.p511a.C5077b) r6;
        r6.m10359a(r5, r7, r2);
        r4 = r4.f3302a;
        r4.mo1082a(r6);
    L_0x0025:
        r4 = 0;
        r5 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = 0;
        r10 = 5;
        switch(r2) {
            case 1: goto L_0x0083;
            case 2: goto L_0x0080;
            case 3: goto L_0x007c;
            case 4: goto L_0x003f;
            case 5: goto L_0x003b;
            case 6: goto L_0x0039;
            case 7: goto L_0x0037;
            default: goto L_0x002f;
        };
    L_0x002f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "unknown job holder result";
        r0.<init>(r1);
        throw r0;
    L_0x0037:
        r7 = 7;
        goto L_0x0080;
    L_0x0039:
        r7 = 6;
        goto L_0x0080;
    L_0x003b:
        r0.m10433a(r3, r10);
        goto L_0x0083;
    L_0x003f:
        r4 = r3.f3480q;
        r7 = r3.f3480q;
        if (r7 != 0) goto L_0x0049;
    L_0x0045:
        r0.m10424b(r3);
        goto L_0x0086;
    L_0x0049:
        r11 = r7.f3507e;
        if (r11 == 0) goto L_0x005b;
    L_0x004d:
        r11 = r7.f3507e;
        r11 = r11.intValue();
        r3.f3467d = r11;
        r11 = r3.f3476m;
        r12 = r3.f3467d;
        r11.priority = r12;
    L_0x005b:
        r11 = -1;
        r13 = r7.f3506d;
        if (r13 == 0) goto L_0x0067;
    L_0x0061:
        r7 = r7.f3506d;
        r11 = r7.longValue();
    L_0x0067:
        r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x0076;
    L_0x006b:
        r7 = r0.f14231a;
        r13 = r7.mo1091a();
        r11 = r11 * r5;
        r15 = r13 + r11;
    L_0x0074:
        r11 = r15;
        goto L_0x0079;
    L_0x0076:
        r15 = -9223372036854775808;
        goto L_0x0074;
    L_0x0079:
        r3.f3470g = r11;
        goto L_0x0045;
    L_0x007c:
        com.p072b.p073a.p074a.p078e.C1028b.m2507b();
        goto L_0x0086;
    L_0x0080:
        r0.m10433a(r3, r7);
    L_0x0083:
        r0.m10432a(r3);
    L_0x0086:
        r7 = r0.f14236f;
        r1 = r1.f14195e;
        r1 = (com.p072b.p073a.p074a.C1040f.C1032a) r1;
        r11 = r1.f3332e;
        if (r11 != 0) goto L_0x0098;
    L_0x0090:
        r0 = new java.lang.IllegalStateException;
        r1 = "this worker should not have a job";
        r0.<init>(r1);
        throw r0;
    L_0x0098:
        r11 = 0;
        r1.f3332e = r11;
        r1 = r7.f3367e;
        r12 = r3.f3476m;
        r12 = r12.getId();
        r1.remove(r12);
        r1 = r3.f3468e;
        if (r1 == 0) goto L_0x00d7;
    L_0x00aa:
        r1 = r7.f3368f;
        r12 = r3.f3468e;
        r1.m2598b(r12);
        if (r4 == 0) goto L_0x00d7;
    L_0x00b3:
        r1 = r4.f3508f;
        if (r1 == 0) goto L_0x00d7;
    L_0x00b7:
        r1 = r4.f3506d;
        r12 = r1.longValue();
        r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x00d7;
    L_0x00c1:
        r1 = r7.f3368f;
        r8 = r3.f3468e;
        r7 = r7.f3365c;
        r12 = r7.mo1091a();
        r4 = r4.f3506d;
        r14 = r4.longValue();
        r14 = r14 * r5;
        r4 = r12 + r14;
        r1.m2597a(r8, r4);
    L_0x00d7:
        r1 = r0.f14238h;
        r4 = r3.f3476m;
        r5 = r1.m2496b();
        if (r5 == 0) goto L_0x00f3;
    L_0x00e1:
        r5 = r1.f3304c;
        r6 = com.p072b.p073a.p074a.p079f.p511a.C5077b.class;
        r5 = r5.m2518a(r6);
        r5 = (com.p072b.p073a.p074a.p079f.p511a.C5077b) r5;
        r5.m10359a(r4, r10, r2);
        r1 = r1.f3302a;
        r1.mo1082a(r5);
    L_0x00f3:
        r1 = r0.f14245o;
        if (r1 == 0) goto L_0x0132;
    L_0x00f7:
        r1 = r0.f14245o;
        r1 = r1.size();
    L_0x00fd:
        if (r11 >= r1) goto L_0x0132;
    L_0x00ff:
        r4 = r0.f14245o;
        r4 = r4.get(r11);
        r4 = (com.p072b.p073a.p074a.C1023c) r4;
        r5 = r4.f3308a;
        r6 = r3.f3465b;
        r5 = r5.remove(r6);
        if (r5 == 0) goto L_0x011d;
    L_0x0111:
        r5 = 3;
        if (r2 != r5) goto L_0x011a;
    L_0x0114:
        r5 = r4.f3311d;
    L_0x0116:
        r5.add(r3);
        goto L_0x011d;
    L_0x011a:
        r5 = r4.f3312e;
        goto L_0x0116;
    L_0x011d:
        r5 = r4.m2498a();
        if (r5 == 0) goto L_0x012f;
    L_0x0123:
        r4.m2497a(r0);
        r4 = r0.f14245o;
        r4.remove(r11);
        r11 = r11 + -1;
        r1 = r1 + -1;
    L_0x012f:
        r11 = r11 + 1;
        goto L_0x00fd;
    L_0x0132:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.l.a(com.b.a.a.l, com.b.a.a.f.a.j):void");
    }

    static /* synthetic */ void m10420a(C5098l c5098l, C5086k c5086k) {
        int i = c5086k.f14197d;
        if (i == 1) {
            C1062b c1062b = c5086k.f14198e;
            if (!c5098l.f14239i) {
                if (c5098l.f14241k != null) {
                    c5098l.f14241k.mo1073a(c1062b, true);
                }
            } else if (c5098l.m10421a(c1062b)) {
                if (c5098l.f14246p == null) {
                    c5098l.f14246p = new ArrayList();
                }
                c5098l.f14246p.add(c1062b);
                c5098l.f14236f.m2528a();
            } else {
                if (c5098l.f14241k != null) {
                    c5098l.f14241k.mo1073a(c1062b, false);
                }
            }
        } else if (i == 2) {
            c5098l.m10423b(c5086k.f14198e);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Unknown scheduler message with what ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private boolean m10421a(C1062b c1062b) {
        boolean z;
        for (C1066j c1066j : this.f14236f.f3367e.values()) {
            if (c1066j.f3476m.isPersistent() && c1062b.f3446c >= c1066j.f3473j) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        this.f14237g.m2509a();
        this.f14237g.f3325h = this.f14231a.mo1091a();
        this.f14237g.f3318a = c1062b.f3446c;
        return this.f14233c.mo1059a(this.f14237g) > 0;
    }

    private void m10423b(C1062b c1062b) {
        List list = this.f14246p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((C1062b) list.get(size)).f3444a.equals(c1062b.f3444a)) {
                    list.remove(size);
                }
            }
        }
        if (this.f14241k != null && m10421a(c1062b)) {
            this.f14241k.mo1072a(c1062b);
        }
    }

    private void m10424b(C1066j c1066j) {
        if (c1066j.f3478o) {
            new StringBuilder("not re-adding cancelled job ").append(c1066j);
            C1028b.m2507b();
        } else if (c1066j.f3476m.isPersistent()) {
            this.f14233c.mo1065b(c1066j);
        } else {
            this.f14234d.mo1065b(c1066j);
        }
    }

    final int m10430a(int i) {
        Collection a = this.f14236f.f3368f.m2595a();
        this.f14237g.m2509a();
        this.f14237g.f3325h = this.f14231a.mo1091a();
        this.f14237g.f3318a = i;
        this.f14237g.m2510a(a);
        this.f14237g.f3323f = true;
        this.f14237g.f3324g = Long.valueOf(this.f14231a.mo1091a());
        return (0 + this.f14234d.mo1059a(this.f14237g)) + this.f14233c.mo1059a(this.f14237g);
    }

    public final void mo1096a() {
        this.f14240j.mo1082a((C5081f) this.f14244n.m2518a(C5081f.class));
    }

    final void m10432a(C1066j c1066j) {
        (c1066j.f3476m.isPersistent() ? this.f14233c : this.f14234d).mo1067c(c1066j);
        this.f14238h.m2494a(c1066j.f3476m);
    }

    final void m10433a(C1066j c1066j, int i) {
        try {
            c1066j.m2571a(i);
        } catch (Throwable th) {
            C1028b.m2505a(th, "job's onCancel did throw an exception, ignoring...", new Object[0]);
        }
        this.f14238h.m2495a(c1066j.f3476m, false, c1066j.f3481r);
    }

    final int m10434b() {
        return this.f14235e == null ? 2 : this.f14235e.mo1084a(this.f14232b);
    }

    public final void run() {
        C5087g c5087g = this.f14240j;
        C1037f c50971 = new C50971(this);
        if (c5087g.f14203e.getAndSet(true)) {
            throw new IllegalStateException("only 1 consumer per MQ");
        }
        while (c5087g.f14203e.get()) {
            C1033b a = c5087g.m10370a(c50971);
            if (a != null) {
                Object[] objArr = new Object[]{"priority_mq", a.f3337a};
                C1028b.m2507b();
                c50971.mo1075a(a);
                c5087g.f14205g.m2519a(a);
            }
        }
    }
}
