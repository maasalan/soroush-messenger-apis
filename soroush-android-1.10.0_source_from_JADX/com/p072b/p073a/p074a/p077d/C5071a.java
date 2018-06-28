package com.p072b.p073a.p074a.p077d;

import com.p072b.p073a.p074a.C1029e;
import com.p072b.p073a.p074a.C1066j;
import com.p072b.p073a.p074a.C1069m;
import com.p072b.p073a.p074a.C1075s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

public final class C5071a implements C1069m {
    private final TreeSet<C1066j> f14168a = new TreeSet(new C10251(this));
    private final Map<String, C1066j> f14169b = new HashMap();
    private final AtomicLong f14170c = new AtomicLong(0);
    private final List<String> f14171d = new ArrayList();
    private final long f14172e;

    class C10251 implements Comparator<C1066j> {
        final /* synthetic */ C5071a f3314a;

        C10251(C5071a c5071a) {
            this.f3314a = c5071a;
        }

        private static int m2499a(long j, long j2) {
            return j > j2 ? -1 : j2 > j ? 1 : 0;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C1066j c1066j = (C1066j) obj;
            C1066j c1066j2 = (C1066j) obj2;
            int i = 0;
            if (c1066j.f3476m.getId().equals(c1066j2.f3476m.getId())) {
                return 0;
            }
            int i2 = c1066j.f3467d;
            int i3 = c1066j2.f3467d;
            if (i2 > i3) {
                i = -1;
            } else if (i3 > i2) {
                i = 1;
            }
            if (i != 0) {
                return i;
            }
            i2 = -C10251.m2499a(c1066j.f3471h, c1066j2.f3471h);
            return i2 != 0 ? i2 : -C10251.m2499a(c1066j.f3464a.longValue(), c1066j2.f3464a.longValue());
        }
    }

    public C5071a(long j) {
        this.f14172e = j;
    }

    private static boolean m10334a(C1066j c1066j, C1029e c1029e, boolean z) {
        C1075s c1075s;
        Set a;
        boolean z2;
        if (c1029e.f3325h < c1066j.f3474k) {
            if (!z || !c1066j.m2576d()) {
                z = false;
                if (z && c1029e.f3318a < c1066j.f3473j) {
                    return false;
                }
                if (c1029e.f3324g == null && c1066j.f3470g > c1029e.f3324g.longValue()) {
                    return false;
                }
                if ((c1066j.f3468e == null && c1029e.f3321d.contains(c1066j.f3468e)) || c1029e.f3322e.contains(c1066j.f3465b)) {
                    return false;
                }
                if (c1029e.f3319b != null) {
                    if (!(c1066j.m2570a() == null || c1029e.f3320c.isEmpty())) {
                        c1075s = c1029e.f3319b;
                        Collection<String> collection = c1029e.f3320c;
                        a = c1066j.m2570a();
                        if (c1075s != C1075s.ANY) {
                            for (String contains : collection) {
                                if (!a.contains(contains)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            for (String contains2 : collection) {
                                if (!a.contains(contains2)) {
                                }
                            }
                            z2 = true;
                            if (z2) {
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
            }
        }
        z = true;
        if (z) {
        }
        if (c1029e.f3324g == null) {
        }
        if (c1066j.f3468e == null) {
        }
        if (c1029e.f3319b != null) {
            c1075s = c1029e.f3319b;
            Collection<String> collection2 = c1029e.f3320c;
            a = c1066j.m2570a();
            if (c1075s != C1075s.ANY) {
                while (r7.hasNext()) {
                    if (a.contains(contains2)) {
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
            while (r7.hasNext()) {
                if (!a.contains(contains2)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            return z2;
        }
    }

    public final int mo1058a() {
        return this.f14168a.size();
    }

    public final int mo1059a(C1029e c1029e) {
        this.f14171d.clear();
        Iterator it = this.f14168a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C1066j c1066j = (C1066j) it.next();
            String str = c1066j.f3468e;
            if ((str == null || !this.f14171d.contains(str)) && C5071a.m10334a(c1066j, c1029e, false)) {
                i++;
                if (str != null) {
                    this.f14171d.add(str);
                }
            }
        }
        this.f14171d.clear();
        return i;
    }

    public final C1066j mo1060a(String str) {
        return (C1066j) this.f14169b.get(str);
    }

    public final void mo1061a(C1066j c1066j, C1066j c1066j2) {
        mo1067c(c1066j2);
        mo1062a(c1066j);
    }

    public final boolean mo1062a(C1066j c1066j) {
        c1066j.m2572a(this.f14170c.incrementAndGet());
        if (((C1066j) this.f14169b.get(c1066j.f3465b)) != null) {
            throw new IllegalArgumentException("cannot add a job with the same id twice");
        }
        this.f14169b.put(c1066j.f3465b, c1066j);
        this.f14168a.add(c1066j);
        return true;
    }

    public final C1066j mo1063b(C1029e c1029e) {
        Iterator it = this.f14168a.iterator();
        while (it.hasNext()) {
            C1066j c1066j = (C1066j) it.next();
            if (C5071a.m10334a(c1066j, c1029e, false)) {
                mo1067c(c1066j);
                c1066j.f3469f++;
                c1066j.f3472i = this.f14172e;
                return c1066j;
            }
        }
        return null;
    }

    public final void mo1064b() {
        this.f14168a.clear();
        this.f14169b.clear();
    }

    public final boolean mo1065b(C1066j c1066j) {
        if (c1066j.f3464a == null) {
            return mo1062a(c1066j);
        }
        C1066j c1066j2 = (C1066j) this.f14169b.get(c1066j.f3465b);
        if (c1066j2 != null) {
            mo1067c(c1066j2);
        }
        this.f14169b.put(c1066j.f3465b, c1066j);
        this.f14168a.add(c1066j);
        return true;
    }

    public final Long mo1066c(C1029e c1029e) {
        Iterator it = this.f14168a.iterator();
        Long l = null;
        while (it.hasNext()) {
            C1066j c1066j = (C1066j) it.next();
            boolean z = true;
            if (C5071a.m10334a(c1066j, c1029e, true)) {
                if (!(c1066j.f3470g != Long.MIN_VALUE) || !C5071a.m10334a(c1066j, c1029e, false)) {
                    z = false;
                }
                boolean d = c1066j.m2576d();
                long min = d == z ? Math.min(c1066j.f3474k, c1066j.f3470g) : d ? c1066j.f3474k : c1066j.f3470g;
                if (l == null || min < l.longValue()) {
                    l = Long.valueOf(min);
                }
            }
        }
        return l;
    }

    public final void mo1067c(C1066j c1066j) {
        this.f14169b.remove(c1066j.f3465b);
        this.f14168a.remove(c1066j);
    }

    public final Set<C1066j> mo1068d(C1029e c1029e) {
        Set<C1066j> hashSet = new HashSet();
        Iterator it = this.f14168a.iterator();
        while (it.hasNext()) {
            C1066j c1066j = (C1066j) it.next();
            if (C5071a.m10334a(c1066j, c1029e, false)) {
                hashSet.add(c1066j);
            }
        }
        return hashSet;
    }

    public final void mo1069d(C1066j c1066j) {
        mo1067c(c1066j);
    }
}
