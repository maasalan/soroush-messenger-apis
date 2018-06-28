package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C1344b;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C1381o;
import com.p111d.p112a.p114b.C1384r;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C1386t;
import com.p111d.p112a.p114b.C5297e;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p119f.C1366b;
import com.p111d.p112a.p114b.p120g.C5300d;
import com.p111d.p112a.p121c.p123b.C1405a;
import com.p111d.p112a.p121c.p123b.C5307h;
import com.p111d.p112a.p121c.p124c.C6486f;
import com.p111d.p112a.p121c.p124c.C6487l;
import com.p111d.p112a.p121c.p124c.C6487l.C7083a;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p128f.C1464z.C5344a;
import com.p111d.p112a.p121c.p128f.C5331m;
import com.p111d.p112a.p121c.p128f.C5342w;
import com.p111d.p112a.p121c.p128f.C6496q;
import com.p111d.p112a.p121c.p131i.C1473b;
import com.p111d.p112a.p121c.p131i.p132a.C5349l;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p133j.C7413m;
import com.p111d.p112a.p121c.p134k.C1505r;
import com.p111d.p112a.p121c.p134k.C6518g;
import com.p111d.p112a.p121c.p134k.C6520k;
import com.p111d.p112a.p121c.p134k.C6520k.C7121a;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p137l.C7126j;
import com.p111d.p112a.p121c.p138m.C1538r;
import com.p111d.p112a.p121c.p138m.C1539t;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class C6526t extends C5304n implements C1386t, Serializable {
    protected static final C5308b f17790a = new C6496q();
    protected static final C1464z<?> f17791b = C5344a.m11412a();
    @Deprecated
    protected static final C1381o f17792c = new C5300d();
    protected static final C1405a f17793d = new C1405a(null, f17790a, f17791b, null, C1513m.m3909a(), null, C1539t.f4797f, null, Locale.getDefault(), null, C1344b.m3177a());
    private static final C5354j f17794p = C7126j.m18716f(C6524m.class);
    protected final C5297e f17795e;
    protected C1513m f17796f;
    protected C1479i f17797g;
    protected C1473b f17798h;
    protected C5342w f17799i;
    protected C7128y f17800j;
    protected C6520k f17801k;
    protected C1505r f17802l;
    protected C7089f f17803m;
    protected C6487l f17804n;
    protected final ConcurrentHashMap<C5354j, C1507k<Object>> f17805o;

    public C6526t() {
        this(null, (byte) 0);
    }

    public C6526t(C5297e c5297e) {
        this(c5297e, (byte) 0);
    }

    private C6526t(C5297e c5297e, byte b) {
        this.f17805o = new ConcurrentHashMap(64, 0.6f, 2);
        if (c5297e == null) {
            this.f17795e = new C6525s(this);
        } else {
            this.f17795e = c5297e;
            if (c5297e.getCodec() == null) {
                this.f17795e.setCodec(this);
            }
        }
        this.f17798h = new C5349l();
        C1538r c1538r = new C1538r();
        this.f17796f = C1513m.m3909a();
        C5342w c5342w = new C5342w();
        this.f17799i = c5342w;
        C1405a a = f17793d.m3416a(new C5331m());
        this.f17800j = new C7128y(a, this.f17798h, c5342w, c1538r);
        this.f17803m = new C7089f(a, this.f17798h, c5342w, c1538r);
        boolean requiresPropertyOrdering = this.f17795e.requiresPropertyOrdering();
        if ((this.f17800j.m11077a(C5385q.SORT_PROPERTIES_ALPHABETICALLY) ^ requiresPropertyOrdering) != 0) {
            C7128y a2;
            C7089f a3;
            C5385q c5385q = C5385q.SORT_PROPERTIES_ALPHABETICALLY;
            if (requiresPropertyOrdering) {
                a2 = this.f17800j.m18736a(c5385q);
            } else {
                a2 = this.f17800j.m18740b(c5385q);
            }
            this.f17800j = a2;
            if (requiresPropertyOrdering) {
                a3 = this.f17803m.m18507a(c5385q);
            } else {
                a3 = this.f17803m.m18512b(c5385q);
            }
            this.f17803m = a3;
        }
        this.f17801k = new C7121a();
        this.f17804n = new C7083a(C6486f.f17695e);
        this.f17802l = C6518g.instance;
    }

    private C6487l m15751a(C5303j c5303j, C7089f c7089f) {
        return this.f17804n.mo3351a(c7089f, c5303j, this.f17797g);
    }

    private C6520k m15752a(C7128y c7128y) {
        return this.f17801k.mo3377a(c7128y, this.f17802l);
    }

    private C1507k<Object> m15753a(C5347g c5347g, C5354j c5354j) {
        C1507k<Object> c1507k = (C1507k) this.f17805o.get(c5354j);
        if (c1507k != null) {
            return c1507k;
        }
        c1507k = c5347g.m11454b(c5354j);
        if (c1507k == null) {
            StringBuilder stringBuilder = new StringBuilder("Can not find a deserializer for type ");
            stringBuilder.append(c5354j);
            throw C5364l.m11574a(c5347g, stringBuilder.toString());
        }
        this.f17805o.put(c5354j, c1507k);
        return c1507k;
    }

    private <T> C1547r<T> m15754a(C5303j c5303j, C5354j c5354j) {
        C5347g a = m15751a(c5303j, this.f17803m);
        return new C1547r(c5354j, c5303j, a, m15753a(a, c5354j));
    }

    private static Object m15755a(C5303j c5303j, C5347g c5347g, C7089f c7089f, C5354j c5354j, C1507k<Object> c1507k) {
        String b = c7089f.m15412e(c5354j).m4060b();
        StringBuilder stringBuilder;
        if (c5303j.getCurrentToken() != C1380m.START_OBJECT) {
            stringBuilder = new StringBuilder("Current token not START_OBJECT (needed to unwrap root name '");
            stringBuilder.append(b);
            stringBuilder.append("'), but ");
            stringBuilder.append(c5303j.getCurrentToken());
            throw C5364l.m11572a(c5303j, stringBuilder.toString());
        } else if (c5303j.nextToken() != C1380m.FIELD_NAME) {
            stringBuilder = new StringBuilder("Current token not FIELD_NAME (to contain expected root name '");
            stringBuilder.append(b);
            stringBuilder.append("'), but ");
            stringBuilder.append(c5303j.getCurrentToken());
            throw C5364l.m11572a(c5303j, stringBuilder.toString());
        } else {
            String currentName = c5303j.getCurrentName();
            if (b.equals(currentName)) {
                c5303j.nextToken();
                Object a = c1507k.mo1304a(c5303j, c5347g);
                if (c5303j.nextToken() == C1380m.END_OBJECT) {
                    return a;
                }
                stringBuilder = new StringBuilder("Current token not END_OBJECT (to match wrapper object with root name '");
                stringBuilder.append(b);
                stringBuilder.append("'), but ");
                stringBuilder.append(c5303j.getCurrentToken());
                throw C5364l.m11572a(c5303j, stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("Root name '");
            stringBuilder.append(currentName);
            stringBuilder.append("' does not match expected ('");
            stringBuilder.append(b);
            stringBuilder.append("') for type ");
            stringBuilder.append(c5354j);
            throw C5364l.m11572a(c5303j, stringBuilder.toString());
        }
    }

    private Object m15756a(C7089f c7089f, C5303j c5303j, C5354j c5354j) {
        Object a;
        C1380m b = m15757b(c5303j);
        if (b == C1380m.VALUE_NULL) {
            C5347g a2 = m15751a(c5303j, c7089f);
            a = m15753a(a2, c5354j).mo2803a(a2);
        } else {
            if (b != C1380m.END_ARRAY) {
                if (b != C1380m.END_OBJECT) {
                    C5347g a3 = m15751a(c5303j, c7089f);
                    C1507k a4 = m15753a(a3, c5354j);
                    a = c7089f.m18517e() ? C6526t.m15755a(c5303j, a3, c7089f, c5354j, a4) : a4.mo1304a(c5303j, a3);
                }
            }
            a = null;
        }
        c5303j.clearCurrentToken();
        return a;
    }

    private C1380m m15757b(C5303j c5303j) {
        this.f17803m.m18508a(c5303j);
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == null) {
            currentToken = c5303j.nextToken();
            if (currentToken == null) {
                throw C5364l.m11572a(c5303j, "No content to map due to end-of-input");
            }
        }
        return currentToken;
    }

    private java.lang.Object m15758b(com.p111d.p112a.p114b.C5303j r5, com.p111d.p112a.p121c.C5354j r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.m15757b(r5);	 Catch:{ all -> 0x0045 }
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;	 Catch:{ all -> 0x0045 }
        if (r0 != r1) goto L_0x0017;	 Catch:{ all -> 0x0045 }
    L_0x0008:
        r0 = r4.f17803m;	 Catch:{ all -> 0x0045 }
        r0 = r4.m15751a(r5, r0);	 Catch:{ all -> 0x0045 }
        r6 = r4.m15753a(r0, r6);	 Catch:{ all -> 0x0045 }
        r6 = r6.mo2803a(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x003e;	 Catch:{ all -> 0x0045 }
    L_0x0017:
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;	 Catch:{ all -> 0x0045 }
        if (r0 == r1) goto L_0x003d;	 Catch:{ all -> 0x0045 }
    L_0x001b:
        r1 = com.p111d.p112a.p114b.C1380m.END_OBJECT;	 Catch:{ all -> 0x0045 }
        if (r0 != r1) goto L_0x0020;	 Catch:{ all -> 0x0045 }
    L_0x001f:
        goto L_0x003d;	 Catch:{ all -> 0x0045 }
    L_0x0020:
        r0 = r4.f17803m;	 Catch:{ all -> 0x0045 }
        r1 = r4.m15751a(r5, r0);	 Catch:{ all -> 0x0045 }
        r2 = r4.m15753a(r1, r6);	 Catch:{ all -> 0x0045 }
        r3 = r0.m18517e();	 Catch:{ all -> 0x0045 }
        if (r3 == 0) goto L_0x0035;	 Catch:{ all -> 0x0045 }
    L_0x0030:
        r6 = com.p111d.p112a.p121c.C6526t.m15755a(r5, r1, r0, r6, r2);	 Catch:{ all -> 0x0045 }
        goto L_0x0039;	 Catch:{ all -> 0x0045 }
    L_0x0035:
        r6 = r2.mo1304a(r5, r1);	 Catch:{ all -> 0x0045 }
    L_0x0039:
        r1.mo2814n();	 Catch:{ all -> 0x0045 }
        goto L_0x003e;	 Catch:{ all -> 0x0045 }
    L_0x003d:
        r6 = 0;	 Catch:{ all -> 0x0045 }
    L_0x003e:
        r5.clearCurrentToken();	 Catch:{ all -> 0x0045 }
        r5.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        return r6;
    L_0x0045:
        r6 = move-exception;
        r5.close();	 Catch:{ IOException -> 0x0049 }
    L_0x0049:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.t.b(com.d.a.b.j, com.d.a.c.j):java.lang.Object");
    }

    public final <T extends C1384r> T mo2976a(C5303j c5303j) {
        C7089f c7089f = this.f17803m;
        if (c5303j.getCurrentToken() == null && c5303j.nextToken() == null) {
            return null;
        }
        T t = (C6524m) m15756a(c7089f, c5303j, f17794p);
        if (t == null) {
            this.f17803m.m18520h();
            t = C1480j.m3810a();
        }
        return t;
    }

    public final C6524m m15760a(String str) {
        C6524m c6524m = (C6524m) m15758b(this.f17795e.createParser(str), f17794p);
        return c6524m == null ? C7413m.f21540a : c6524m;
    }

    public final <T> T mo2977a(C5303j c5303j, C1366b<?> c1366b) {
        return m15756a(this.f17803m, c5303j, this.f17796f.m3917a((C1366b) c1366b));
    }

    public final <T> T mo2978a(C5303j c5303j, Class<T> cls) {
        return m15756a(this.f17803m, c5303j, this.f17796f.m3927b((Type) cls));
    }

    public final <T> T m15763a(byte[] bArr, C1366b c1366b) {
        return m15758b(this.f17795e.createParser(bArr), this.f17796f.m3917a(c1366b));
    }

    public final <T> T m15764a(byte[] bArr, Class<T> cls) {
        return m15758b(this.f17795e.createParser(bArr), this.f17796f.m3927b((Type) cls));
    }

    public final void mo2979a(C5301g c5301g, C1384r c1384r) {
        C7128y c7128y = this.f17800j;
        m15752a(c7128y).m15719a(c5301g, (Object) c1384r);
        if (c7128y.m18737a(C5387z.FLUSH_AFTER_WRITE_VALUE)) {
            c5301g.flush();
        }
    }

    public final void mo2980a(com.p111d.p112a.p114b.C5301g r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f17800j;
        r1 = com.p111d.p112a.p121c.C5387z.INDENT_OUTPUT;
        r1 = r0.m18737a(r1);
        if (r1 == 0) goto L_0x0017;
    L_0x000a:
        r1 = r4.getPrettyPrinter();
        if (r1 != 0) goto L_0x0017;
    L_0x0010:
        r1 = r0.m18743e();
        r4.setPrettyPrinter(r1);
    L_0x0017:
        r1 = com.p111d.p112a.p121c.C5387z.CLOSE_CLOSEABLE;
        r1 = r0.m18737a(r1);
        if (r1 == 0) goto L_0x0048;
    L_0x001f:
        r1 = r5 instanceof java.io.Closeable;
        if (r1 == 0) goto L_0x0048;
    L_0x0023:
        r1 = r5;
        r1 = (java.io.Closeable) r1;
        r2 = r3.m15752a(r0);	 Catch:{ all -> 0x0041 }
        r2.m15719a(r4, r5);	 Catch:{ all -> 0x0041 }
        r5 = com.p111d.p112a.p121c.C5387z.FLUSH_AFTER_WRITE_VALUE;	 Catch:{ all -> 0x0041 }
        r5 = r0.m18737a(r5);	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x0038;	 Catch:{ all -> 0x0041 }
    L_0x0035:
        r4.flush();	 Catch:{ all -> 0x0041 }
    L_0x0038:
        r4 = 0;
        r1.close();	 Catch:{ all -> 0x003d }
        return;
    L_0x003d:
        r5 = move-exception;
        r1 = r4;
        r4 = r5;
        goto L_0x0042;
    L_0x0041:
        r4 = move-exception;
    L_0x0042:
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.close();	 Catch:{ IOException -> 0x0047 }
    L_0x0047:
        throw r4;
    L_0x0048:
        r1 = r3.m15752a(r0);
        r1.m15719a(r4, r5);
        r5 = com.p111d.p112a.p121c.C5387z.FLUSH_AFTER_WRITE_VALUE;
        r5 = r0.m18737a(r5);
        if (r5 == 0) goto L_0x005a;
    L_0x0057:
        r4.flush();
    L_0x005a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.t.a(com.d.a.b.g, java.lang.Object):void");
    }

    public final /* synthetic */ Iterator mo2981b(C5303j c5303j, C1366b c1366b) {
        return m15754a(c5303j, this.f17796f.m3917a(c1366b));
    }

    public final /* synthetic */ Iterator mo2982b(C5303j c5303j, Class cls) {
        return m15754a(c5303j, this.f17796f.m3927b((Type) cls));
    }

    public final C1385s version() {
        return C5307h.f14729a;
    }
}
