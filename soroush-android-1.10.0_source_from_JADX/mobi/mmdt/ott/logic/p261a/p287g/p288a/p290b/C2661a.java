package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.af.C2609f;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a;
import mobi.mmdt.ott.p246d.p247a.C2531b;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C2661a {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7056a(java.util.ArrayList<mobi.mmdt.ott.p246d.p247a.C2531b> r4) {
        /*
        r0 = new java.util.HashSet;
        r0.<init>();
        r4 = r4.iterator();
    L_0x0009:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x004b;
    L_0x000f:
        r1 = r4.next();
        r1 = (mobi.mmdt.ott.p246d.p247a.C2531b) r1;
        r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a.C26591.f8574a;
        r3 = r1.f8235i;
        r3 = r3.ordinal();
        r2 = r2[r3];
        switch(r2) {
            case 1: goto L_0x0033;
            case 2: goto L_0x0023;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x0045;
    L_0x0023:
        r2 = r1.f8234h;
        r2 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r2);
        if (r2 != 0) goto L_0x0045;
    L_0x002b:
        r2 = new mobi.mmdt.ott.logic.a.f.b.i;
        r3 = r1.f8234h;
        r2.<init>(r3);
        goto L_0x0042;
    L_0x0033:
        r2 = r1.f8234h;
        r2 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r2);
        if (r2 != 0) goto L_0x0045;
    L_0x003b:
        r2 = new mobi.mmdt.ott.logic.a.r.a.b.d;
        r3 = r1.f8234h;
        r2.<init>(r3);
    L_0x0042:
        mobi.mmdt.ott.logic.C2808d.m7149c(r2);
    L_0x0045:
        r1 = r1.f8236j;
        r0.add(r1);
        goto L_0x0009;
    L_0x004b:
        r4 = r0.size();
        if (r4 <= 0) goto L_0x0066;
    L_0x0051:
        r4 = new mobi.mmdt.ott.logic.a.aa.b;
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r0 = r0.toArray(r1);
        r0 = (java.lang.String[]) r0;
        r1 = 0;
        r4.<init>(r0, r1, r1);
        mobi.mmdt.ott.logic.C2808d.m7149c(r4);
    L_0x0066:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.a.a(java.util.ArrayList):void");
    }

    public static void m7057a(ArrayList<C2531b> arrayList, Boolean bool) {
        HashMap hashMap;
        Iterator it;
        boolean z;
        Throwable e;
        C2674a c2674a;
        long longValue;
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2531b c2531b = (C2531b) it2.next();
            if (c2531b != null) {
                arrayList2.add(c2531b.f8227a);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList2.removeAll(C2966b.m7398a((String[]) arrayList2.toArray(new String[arrayList2.size()])));
        }
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C2531b c2531b2 = (C2531b) it3.next();
                if (c2531b2 != null && c2531b2.f8227a.equals(str)) {
                    hashMap2.put(c2531b2.f8227a, c2531b2);
                }
            }
        }
        if (arrayList.size() != 0) {
            boolean a = C2966b.m7403a(hashMap2);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C2983b a2;
                c2531b = (C2531b) hashMap2.get((String) it4.next());
                if (a) {
                    hashMap = hashMap2;
                    it = it4;
                    z = a;
                } else {
                    try {
                        String str2;
                        Long l;
                        String str3 = c2531b.f8227a;
                        C2972l c2972l = c2531b.f8228b;
                        String str4 = c2531b.f8229c;
                        long j = c2531b.f8230d;
                        long j2 = c2531b.f8231e;
                        C2970j c2970j = c2531b.f8232f;
                        C2971k c2971k = c2531b.f8233g;
                        String str5 = c2531b.f8234h;
                        C2973m c2973m = c2531b.f8235i;
                        hashMap = hashMap2;
                        try {
                            str2 = c2531b.f8236j;
                            it = it4;
                            try {
                                l = c2531b.f8237k;
                                z = a;
                            } catch (C2964a e2) {
                                e = e2;
                                z = a;
                                C2480b.m6737b("Handled ConversationExistException", e);
                                if (c2531b.f8240n != null) {
                                    c2674a = new C2674a(c2531b.f8242p, c2531b.f8240n, c2531b.f8241o);
                                    C6729f.m17190a(c2674a.f8607b, c2674a.f8606a, c2531b.f8227a, c2674a.f8608c, null);
                                    C2808d.m7148b(new C6729f(c2531b.f8227a, c2674a));
                                }
                                if (c2531b.f8228b.equals(C2972l.TEXT)) {
                                    C2808d.m7148b(new C6784a(c2531b.f8227a, c2531b.f8229c));
                                }
                                longValue = c2531b.f8237k.longValue();
                                a2 = C2984c.m7461a(longValue);
                                C2984c.m7464b(longValue, C2987i.FINISHED);
                                C2609f.m7041a().m7043a(c2531b.f8237k.longValue());
                                hashMap2 = hashMap;
                                it4 = it;
                                a = z;
                            }
                        } catch (C2964a e3) {
                            e = e3;
                            it = it4;
                            z = a;
                            C2480b.m6737b("Handled ConversationExistException", e);
                            if (c2531b.f8240n != null) {
                                c2674a = new C2674a(c2531b.f8242p, c2531b.f8240n, c2531b.f8241o);
                                C6729f.m17190a(c2674a.f8607b, c2674a.f8606a, c2531b.f8227a, c2674a.f8608c, null);
                                C2808d.m7148b(new C6729f(c2531b.f8227a, c2674a));
                            }
                            if (c2531b.f8228b.equals(C2972l.TEXT)) {
                                C2808d.m7148b(new C6784a(c2531b.f8227a, c2531b.f8229c));
                            }
                            longValue = c2531b.f8237k.longValue();
                            a2 = C2984c.m7461a(longValue);
                            C2984c.m7464b(longValue, C2987i.FINISHED);
                            C2609f.m7041a().m7043a(c2531b.f8237k.longValue());
                            hashMap2 = hashMap;
                            it4 = it;
                            a = z;
                        }
                        try {
                            C2966b.m7397a(str3, c2972l, str4, j, j2, c2970j, c2971k, str5, c2973m, str2, l, c2531b.f8238l, c2531b.f8239m, null, c2531b.f8243q);
                            if (!bool.booleanValue()) {
                                C2980g.m7424a(c2531b.f8234h, c2531b.f8227a, Long.valueOf(c2531b.f8230d));
                            }
                        } catch (C2964a e4) {
                            e = e4;
                            C2480b.m6737b("Handled ConversationExistException", e);
                            if (c2531b.f8240n != null) {
                                c2674a = new C2674a(c2531b.f8242p, c2531b.f8240n, c2531b.f8241o);
                                C6729f.m17190a(c2674a.f8607b, c2674a.f8606a, c2531b.f8227a, c2674a.f8608c, null);
                                C2808d.m7148b(new C6729f(c2531b.f8227a, c2674a));
                            }
                            if (c2531b.f8228b.equals(C2972l.TEXT)) {
                                C2808d.m7148b(new C6784a(c2531b.f8227a, c2531b.f8229c));
                            }
                            longValue = c2531b.f8237k.longValue();
                            a2 = C2984c.m7461a(longValue);
                            C2984c.m7464b(longValue, C2987i.FINISHED);
                            C2609f.m7041a().m7043a(c2531b.f8237k.longValue());
                            hashMap2 = hashMap;
                            it4 = it;
                            a = z;
                        }
                    } catch (C2964a e5) {
                        e = e5;
                        hashMap = hashMap2;
                        it = it4;
                        z = a;
                        C2480b.m6737b("Handled ConversationExistException", e);
                        if (c2531b.f8240n != null) {
                            c2674a = new C2674a(c2531b.f8242p, c2531b.f8240n, c2531b.f8241o);
                            C6729f.m17190a(c2674a.f8607b, c2674a.f8606a, c2531b.f8227a, c2674a.f8608c, null);
                            C2808d.m7148b(new C6729f(c2531b.f8227a, c2674a));
                        }
                        if (c2531b.f8228b.equals(C2972l.TEXT)) {
                            C2808d.m7148b(new C6784a(c2531b.f8227a, c2531b.f8229c));
                        }
                        longValue = c2531b.f8237k.longValue();
                        a2 = C2984c.m7461a(longValue);
                        C2984c.m7464b(longValue, C2987i.FINISHED);
                        C2609f.m7041a().m7043a(c2531b.f8237k.longValue());
                        hashMap2 = hashMap;
                        it4 = it;
                        a = z;
                    }
                }
                if (c2531b.f8240n != null) {
                    c2674a = new C2674a(c2531b.f8242p, c2531b.f8240n, c2531b.f8241o);
                    C6729f.m17190a(c2674a.f8607b, c2674a.f8606a, c2531b.f8227a, c2674a.f8608c, null);
                    C2808d.m7148b(new C6729f(c2531b.f8227a, c2674a));
                }
                if (c2531b.f8228b.equals(C2972l.TEXT)) {
                    C2808d.m7148b(new C6784a(c2531b.f8227a, c2531b.f8229c));
                }
                if (!(c2531b.f8228b.equals(C2972l.TEXT) || c2531b.f8237k == null)) {
                    longValue = c2531b.f8237k.longValue();
                    a2 = C2984c.m7461a(longValue);
                    if (a2.f9340i != null && new File(a2.f9340i.getPath()).exists()) {
                        C2984c.m7464b(longValue, C2987i.FINISHED);
                    }
                    C2609f.m7041a().m7043a(c2531b.f8237k.longValue());
                }
                hashMap2 = hashMap;
                it4 = it;
                a = z;
            }
            C2661a.m7056a(arrayList);
        }
    }
}
