package p000a.p003b.p004a.p007c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p000a.p003b.p004a.C0025b;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0054g;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.C0076k.C0069a;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p007c.C0034g.C4633b;
import p000a.p003b.p004a.p007c.C0034g.C4634c;
import p000a.p003b.p004a.p007c.C0034g.C4635d;
import p000a.p003b.p004a.p007c.C0034g.C4637f;
import p000a.p003b.p004a.p007c.C0034g.C4638g;
import p000a.p003b.p004a.p007c.C0034g.C4639h;
import p000a.p003b.p004a.p007c.C0034g.C4640i;
import p000a.p003b.p004a.p007c.p008a.C0029a;
import p000a.p003b.p004a.p013h.C4653c;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4656e;
import p000a.p003b.p004a.p014i.C4657f;
import p000a.p003b.p004a.p014i.C4660k;
import p000a.p003b.p004a.p014i.C4665q;
import p000a.p003b.p004a.p014i.C6327d;

public final class C6317a extends C4653c {
    private static final BigInteger f17259h = new BigInteger("03010001a80020a95566ba42e886bb804cda84e47ef56dbd7aec612615552cec906d2116d0ef207028c51554144dfeafe7c7cb8f005dd18234133ac0710a81182ce1fd14ad2283bc83435f9df2f6313251931a176df0da51e54f42e604860dfb359580250f559cc543c4ffd51cbe3de8cfd06719237f9fc47ee729da06835fa452e825e9a18ebc2ecbcf563474652c33cf56a9033bcdf5d973121797ec8089041b6e03a1b72d0a735b984e03687309332324f27c2dba85e9db15e83a0143382e974b0621c18e625ecec907577d9e7bade95241a81ebbe8a901d4d3276e40b114c0a2e6fc38d19c2e6aab02644b2813f575fc21601e0dee49cd9ee96a43103e524d62873d", 16);
    private static final C0044e f17260i = C0044e.m73a("dlv.isc.org");
    private C0036h f17261j;
    private final Map<C0044e, byte[]> f17262k;
    private boolean f17263l;
    private C0044e f17264m;

    private class C0029a {
        boolean f94a;
        boolean f95b;
        Set<C0034g> f96c;
        final /* synthetic */ C6317a f97d;

        private C0029a(C6317a c6317a) {
            this.f97d = c6317a;
            this.f94a = false;
            this.f95b = false;
            this.f96c = new HashSet();
        }
    }

    public C6317a() {
        this(a);
    }

    public C6317a(C0025b c0025b) {
        super(c0025b);
        this.f17261j = new C0036h();
        this.f17262k = new ConcurrentHashMap();
        this.f17263l = true;
        this.f17262k.put(C0044e.f180a, f17259h.toByteArray());
    }

    private p000a.p003b.p004a.p007c.C6317a.C0029a m14783a(p000a.p003b.p004a.C0065j r10, java.util.Collection<p000a.p003b.p004a.C0076k<? extends p000a.p003b.p004a.p014i.C0061g>> r11, java.util.List<p000a.p003b.p004a.C0076k<? extends p000a.p003b.p004a.p014i.C0061g>> r12) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x006d in {9, 10, 11, 16, 18, 19, 31, 41, 42, 45, 46, 47, 48} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = new java.util.Date;
        r0.<init>();
        r1 = new java.util.LinkedList;
        r1.<init>();
        r2 = new a.b.a.c.a$a;
        r3 = 0;
        r2.<init>();
        r3 = new java.util.ArrayList;
        r4 = r12.size();
        r3.<init>(r4);
        r4 = r12.iterator();
    L_0x001d:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x004e;
    L_0x0023:
        r5 = r4.next();
        r5 = (p000a.p003b.p004a.C0076k) r5;
        r6 = p000a.p003b.p004a.p014i.C4665q.class;
        r5 = r5.m127a(r6);
        if (r5 == 0) goto L_0x001d;
    L_0x0031:
        r6 = r5.f345f;
        r6 = (p000a.p003b.p004a.p014i.C4665q) r6;
        r7 = r6.f12833f;
        r7 = r7.compareTo(r0);
        if (r7 < 0) goto L_0x004a;
    L_0x003d:
        r7 = r6.f12834g;
        r7 = r7.compareTo(r0);
        if (r7 <= 0) goto L_0x0046;
    L_0x0045:
        goto L_0x004a;
    L_0x0046:
        r3.add(r5);
        goto L_0x001d;
    L_0x004a:
        r1.add(r6);
        goto L_0x001d;
    L_0x004e:
        r0 = r3.isEmpty();
        if (r0 == 0) goto L_0x006e;
    L_0x0054:
        r11 = r1.isEmpty();
        if (r11 != 0) goto L_0x0065;
    L_0x005a:
        r11 = r2.f96c;
        r12 = new a.b.a.c.g$e;
        r12.<init>(r10, r1);
    L_0x0061:
        r11.add(r12);
        return r2;
    L_0x0065:
        r11 = r2.f96c;
        r12 = new a.b.a.c.g$h;
        r12.<init>(r10);
        goto L_0x0061;
        return r2;
    L_0x006e:
        r0 = r3.iterator();
    L_0x0072:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0129;
    L_0x0078:
        r1 = r0.next();
        r1 = (p000a.p003b.p004a.C0076k) r1;
        r3 = r1.f345f;
        r3 = (p000a.p003b.p004a.p014i.C4665q) r3;
        r4 = new java.util.ArrayList;
        r5 = r11.size();
        r4.<init>(r5);
        r5 = r11.iterator();
    L_0x008f:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x00af;
    L_0x0095:
        r6 = r5.next();
        r6 = (p000a.p003b.p004a.C0076k) r6;
        r7 = r6.f341b;
        r8 = r3.f12828a;
        if (r7 != r8) goto L_0x008f;
    L_0x00a1:
        r7 = r6.f340a;
        r8 = r1.f340a;
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x008f;
    L_0x00ab:
        r4.add(r6);
        goto L_0x008f;
    L_0x00af:
        r5 = r9.m14786a(r10, r3, r4);
        r6 = r2.f96c;
        r6.addAll(r5);
        r5 = r10.f271a;
        r6 = r3.f12836j;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00f3;
    L_0x00c2:
        r5 = r3.f12828a;
        r6 = p000a.p003b.p004a.C0076k.C0070b.DNSKEY;
        if (r5 != r6) goto L_0x00f3;
    L_0x00c8:
        r5 = r4.iterator();
    L_0x00cc:
        r6 = r5.hasNext();
        r7 = 1;
        if (r6 == 0) goto L_0x00f1;
    L_0x00d3:
        r6 = r5.next();
        r6 = (p000a.p003b.p004a.C0076k) r6;
        r8 = p000a.p003b.p004a.p014i.C4656e.class;
        r6 = r6.m127a(r8);
        r6 = r6.f345f;
        r6 = (p000a.p003b.p004a.p014i.C4656e) r6;
        r5.remove();
        r6 = r6.m8481a();
        r8 = r3.f12835i;
        if (r6 != r8) goto L_0x00cc;
    L_0x00ee:
        r2.f95b = r7;
        goto L_0x00cc;
    L_0x00f1:
        r2.f94a = r7;
    L_0x00f3:
        r5 = r1.f340a;
        r5 = r5.f184d;
        r6 = r3.f12836j;
        r6 = r6.f184d;
        r5 = p000a.p003b.p004a.p007c.C6317a.m14788a(r5, r6);
        if (r5 != 0) goto L_0x0121;
    L_0x0101:
        r4 = b;
        r5 = new java.lang.StringBuilder;
        r6 = "Records at ";
        r5.<init>(r6);
        r6 = r1.f340a;
        r5.append(r6);
        r6 = " are cross-signed with a key from ";
        r5.append(r6);
        r3 = r3.f12836j;
        r5.append(r3);
        r3 = r5.toString();
        r4.finer(r3);
        goto L_0x0124;
    L_0x0121:
        r12.removeAll(r4);
    L_0x0124:
        r12.remove(r1);
        goto L_0x0072;
    L_0x0129:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.c.a.a(a.b.a.j, java.util.Collection, java.util.List):a.b.a.c.a$a");
    }

    private C4631b m14784a(CharSequence charSequence, C0070b c0070b) {
        return m14789b(super.mo2469a(new C0065j(charSequence, c0070b, C0069a.IN)));
    }

    private static List<C0076k<? extends C0061g>> m14785a(List<C0076k<? extends C0061g>> list) {
        if (list.isEmpty()) {
            return list;
        }
        List<C0076k<? extends C0061g>> arrayList = new ArrayList(list.size());
        for (C0076k c0076k : list) {
            if (c0076k.f341b != C0070b.RRSIG) {
                arrayList.add(c0076k);
            }
        }
        return arrayList;
    }

    private Set<C0034g> m14786a(C0065j c0065j, C4665q c4665q, List<C0076k<? extends C0061g>> list) {
        C4656e c4656e;
        Set<C0034g> hashSet = new HashSet();
        Object obj = null;
        if (c4665q.f12828a == C0070b.DNSKEY) {
            for (C0076k a : list) {
                C0076k a2 = a2.m127a(C4656e.class);
                if (a2 != null && ((C4656e) a2.f345f).m8481a() == c4665q.f12835i) {
                    c4656e = (C4656e) a2.f345f;
                    break;
                }
            }
            c4656e = null;
        } else if (c0065j.f272b == C0070b.DS && c4665q.f12836j.equals(c0065j.f271a)) {
            hashSet.add(new C4640i(c0065j.f271a.f184d));
            return hashSet;
        } else {
            C4631b a3 = m14784a(c4665q.f12836j, C0070b.DNSKEY);
            if (a3 == null) {
                StringBuilder stringBuilder = new StringBuilder("There is no DNSKEY ");
                stringBuilder.append(c4665q.f12836j);
                stringBuilder.append(", but it is used");
                throw new C0030c(c0065j, stringBuilder.toString());
            }
            hashSet.addAll(a3.f12738r);
            C4656e c4656e2 = null;
            for (C0076k a4 : a3.l) {
                C0076k a42 = a42.m127a(C4656e.class);
                if (a42 != null && ((C4656e) a42.f345f).m8481a() == c4665q.f12835i) {
                    c4656e2 = (C4656e) a42.f345f;
                }
            }
            c4656e = c4656e2;
        }
        if (c4656e == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(list.size());
            stringBuilder2.append(" ");
            stringBuilder2.append(c4665q.f12828a);
            stringBuilder2.append(" record(s) are signed using an unknown key.");
            throw new C0030c(c0065j, stringBuilder2.toString());
        }
        C0029a c0029a = this.f17261j.f104a;
        C0033f c0033f = (C0033f) c0029a.f100c.get(c4665q.f12829b);
        if (c0033f == null) {
            obj = new C4633b(c4665q.f12830c, "RRSIG", (C0076k) list.get(0));
        } else if (!c0033f.mo4a(C0036h.m45a(c4665q, (List) list), c4665q.f12837k, c4656e.m8483b())) {
            throw new C0030c((List) list, "Signature is invalid.");
        }
        if (obj != null) {
            hashSet.add(obj);
        }
        return hashSet;
    }

    private Set<C0034g> m14787a(C0076k<C4656e> c0076k) {
        C4656e c4656e = (C4656e) c0076k.f345f;
        Set<C0034g> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (this.f17262k.containsKey(c0076k.f340a)) {
            if (Arrays.equals(c4656e.f12791e, (byte[]) this.f17262k.get(c0076k.f340a))) {
                return hashSet;
            }
            hashSet.add(new C4634c(c0076k));
            return hashSet;
        } else if (c0076k.f340a.m84d()) {
            hashSet.add(new C4637f());
            return hashSet;
        } else {
            Logger logger;
            StringBuilder stringBuilder;
            String str;
            C4631b a;
            C0076k a2;
            Set<C0034g> set;
            C0034g a3;
            C4657f c4657f = null;
            C4631b a4 = m14784a(c0076k.f340a, C0070b.DS);
            if (a4 == null) {
                logger = b;
                stringBuilder = new StringBuilder("There is no DS record for ");
                stringBuilder.append(c0076k.f340a);
                str = ", server gives no result";
            } else {
                hashSet.addAll(a4.f12738r);
                for (C0076k a5 : a4.l) {
                    C0076k a52 = a52.m127a(C4657f.class);
                    if (a52 != null) {
                        C4657f c4657f2 = (C4657f) a52.f345f;
                        if (c4656e.m8481a() == c4657f2.f12794a) {
                            hashSet2 = a4.f12738r;
                            c4657f = c4657f2;
                            break;
                        }
                    }
                }
                if (c4657f == null) {
                    logger = b;
                    stringBuilder = new StringBuilder("There is no DS record for ");
                    stringBuilder.append(c0076k.f340a);
                    str = ", server gives empty result";
                }
                if (!(c4657f != null || this.f17264m == null || this.f17264m.m82b(c0076k.f340a))) {
                    a = m14784a(C0044e.m70a(c0076k.f340a, this.f17264m), C0070b.DLV);
                    if (a != null) {
                        hashSet.addAll(a.f12738r);
                        for (C0076k a22 : a.l) {
                            a22 = a22.m127a(C6327d.class);
                            if (a22 == null && ((C4656e) c0076k.f345f).m8481a() == ((C6327d) a22.f345f).a) {
                                Logger logger2 = b;
                                StringBuilder stringBuilder2 = new StringBuilder("Found DLV for ");
                                stringBuilder2.append(c0076k.f340a);
                                stringBuilder2.append(", awesome.");
                                logger2.fine(stringBuilder2.toString());
                                c4657f = (C4657f) a22.f345f;
                                set = a.f12738r;
                                break;
                            }
                        }
                    }
                }
                set = hashSet2;
                if (c4657f != null) {
                    a3 = this.f17261j.m47a((C0076k) c0076k, c4657f);
                    if (a3 != null) {
                        hashSet.add(a3);
                    }
                    return set;
                } else if (hashSet.isEmpty()) {
                    hashSet.add(new C4640i(c0076k.f340a.f184d));
                }
                set = hashSet;
                return set;
            }
            stringBuilder.append(str);
            logger.fine(stringBuilder.toString());
            a = m14784a(C0044e.m70a(c0076k.f340a, this.f17264m), C0070b.DLV);
            if (a != null) {
                hashSet.addAll(a.f12738r);
                while (r4.hasNext()) {
                    a22 = a22.m127a(C6327d.class);
                    if (a22 == null) {
                    }
                }
            }
            set = hashSet2;
            if (c4657f != null) {
                a3 = this.f17261j.m47a((C0076k) c0076k, c4657f);
                if (a3 != null) {
                    hashSet.add(a3);
                }
                return set;
            } else if (hashSet.isEmpty()) {
                hashSet.add(new C4640i(c0076k.f340a.f184d));
            }
            set = hashSet;
            return set;
        }
    }

    private static boolean m14788a(String str, String str2) {
        if (str.equals(str2) || str2.isEmpty()) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split2.length > split.length) {
            return false;
        }
        for (int i = 1; i <= split2.length; i++) {
            if (!split2[split2.length - i].equals(split[split.length - i])) {
                return false;
            }
        }
        return true;
    }

    private C4631b m14789b(C0041d c0041d) {
        if (c0041d == null) {
            return null;
        }
        C4642a d;
        Set c;
        boolean z = false;
        if (c0041d.f161i) {
            d = c0041d.m62d();
            d.f113i = false;
            c0041d = d.m49b();
        }
        if (c0041d.f164l.isEmpty()) {
            c = m14790c(c0041d);
        } else {
            C0065j c0065j = (C0065j) c0041d.f163k.get(0);
            Collection collection = c0041d.f164l;
            List arrayList = new ArrayList(c0041d.f164l.size());
            arrayList.addAll(c0041d.f164l);
            C0029a a = m14783a(c0065j, collection, arrayList);
            c = a.f96c;
            if (c.isEmpty()) {
                Collection hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0076k a2 = ((C0076k) it.next()).m127a(C4656e.class);
                    if (a2 != null) {
                        Collection a3 = m14787a(a2);
                        if (a3.isEmpty()) {
                            z = true;
                        } else {
                            hashSet.addAll(a3);
                        }
                        if (!a.f95b) {
                            b.finer("SEP key is not self-signed.");
                        }
                        it.remove();
                    }
                }
                if (a.f95b && !r1) {
                    c.addAll(hashSet);
                }
                if (a.f94a && !a.f95b) {
                    c.add(new C4638g(c0065j.f271a.f184d));
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() != collection.size()) {
                        throw new C0030c(c0065j, "Only some records are signed!");
                    }
                    c.add(new C4639h(c0065j));
                }
            }
        }
        List list = c0041d.f164l;
        List list2 = c0041d.f165m;
        List list3 = c0041d.f166n;
        Object hashSet2 = new HashSet();
        C0076k.m126a(hashSet2, C4665q.class, list);
        C0076k.m126a(hashSet2, C4665q.class, list2);
        C0076k.m126a(hashSet2, C4665q.class, list3);
        d = c0041d.m62d();
        if (this.f17263l) {
            Collection a4 = C6317a.m14785a(list);
            d.f117m = new ArrayList(a4.size());
            d.f117m.addAll(a4);
            a4 = C6317a.m14785a(list2);
            d.f118n = new ArrayList(a4.size());
            d.f118n.addAll(a4);
            a4 = C6317a.m14785a(list3);
            d.f119o = new ArrayList(a4.size());
            d.f119o.addAll(a4);
        }
        return new C4631b(d, hashSet2, c);
    }

    private Set<C0034g> m14790c(C0041d c0041d) {
        Set<C0034g> hashSet = new HashSet();
        int i = 0;
        C0065j c0065j = (C0065j) c0041d.f163k.get(0);
        Collection<C0076k> collection = c0041d.f165m;
        C0044e c0044e = null;
        for (C0076k c0076k : collection) {
            if (c0076k.f341b == C0070b.SOA) {
                c0044e = c0076k.f340a;
            }
        }
        if (c0044e == null) {
            throw new C0030c(c0065j, "NSECs must always match to a SOA");
        }
        while (true) {
            int i2 = i;
            for (C0076k c0076k2 : collection) {
                Object c4635d;
                switch (c0076k2.f341b) {
                    case NSEC:
                        C4660k c4660k = (C4660k) c0076k2.f345f;
                        if (!c0076k2.f340a.equals(c0065j.f271a) || Arrays.asList(c4660k.f12805b).contains(c0065j.f272b)) {
                            if (!C0036h.m44a(c0065j.f271a, c0076k2.f340a, c4660k.f12804a)) {
                                c4635d = new C4635d(c0065j, c0076k2);
                                break;
                            }
                        }
                        c4635d = null;
                        break;
                    case NSEC3:
                        c4635d = this.f17261j.m46a(c0044e, c0076k2, c0065j);
                        break;
                    default:
                        break;
                }
                if (c4635d != null) {
                    hashSet.add(c4635d);
                    i = 1;
                } else {
                    i = 1;
                }
            }
            if (i == 0 || i2 != 0) {
                List c = c0041d.m61c();
                C0029a a = m14783a(c0065j, (Collection) collection, c);
                if (i2 == 0 || !a.f96c.isEmpty()) {
                    hashSet.addAll(a.f96c);
                } else {
                    hashSet.clear();
                }
                if (c.isEmpty() || c.size() == collection.size()) {
                    return hashSet;
                }
                throw new C0030c(c0065j, "Only some nameserver records are signed!");
            }
            throw new C0030c(c0065j, "Invalid NSEC!");
        }
    }

    public final C0041d mo2469a(C0065j c0065j) {
        return mo2471c(c0065j);
    }

    protected final String mo2470a(C0041d c0041d) {
        C0054g c0054g = null;
        if (c0041d.f168p == null) {
            C0076k c0076k = c0041d.f167o == -1 ? null : (C0076k) c0041d.f166n.get(c0041d.f167o);
            if (c0076k == null) {
                return c0054g != null ? false : c0054g.f243f ? "DNSSEC OK (DO) flag not set in response" : c0041d.f162j ? "CHECKING DISABLED (CD) flag not set in response" : super.mo2470a(c0041d);
            } else {
                c0041d.f168p = new C0054g(c0076k);
            }
        }
        c0054g = c0041d.f168p;
        if (c0054g != null) {
        }
        if (c0054g != null ? false : c0054g.f243f) {
            if (c0041d.f162j) {
            }
        }
    }

    protected final boolean mo17a(C0065j c0065j, C0041d c0041d) {
        return super.mo17a(c0065j, c0041d);
    }

    protected final C4642a mo7b(C4642a c4642a) {
        c4642a.m48a().m94a(this.f.m109a()).f228d = true;
        c4642a.f114j = true;
        return super.mo7b(c4642a);
    }

    public final C4631b mo2471c(C0065j c0065j) {
        return m14789b(super.mo2469a(c0065j));
    }
}
