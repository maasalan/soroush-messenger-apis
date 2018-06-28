package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public final class C7264a extends C7056f {
    public C7264a(C5354j c5354j, C1507k<Object> c1507k, C1475c c1475c, C1443v c1443v) {
        super(c5354j, c1507k, c1475c, c1443v);
    }

    private C7264a(C5354j c5354j, C1507k<Object> c1507k, C1475c c1475c, C1443v c1443v, C1507k<Object> c1507k2, Boolean bool) {
        super(c5354j, c1507k, c1475c, c1443v, c1507k2, bool);
    }

    protected final /* synthetic */ C7056f mo3524a(C1507k c1507k, C1507k c1507k2, C1475c c1475c, Boolean bool) {
        if (c1507k == this.e && c1507k2 == this.b && c1475c == this.c && this.f == bool) {
            return this;
        }
        return new C7264a(this.a, c1507k2, c1475c, this.d, c1507k, bool);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return b_(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }

    public final Collection<Object> mo3525a(C5303j c5303j, C5347g c5347g, Collection<Object> collection) {
        if (!c5303j.isExpectedStartArrayToken()) {
            return m18322b(c5303j, c5347g, new ArrayBlockingQueue(1));
        }
        Object arrayList = new ArrayList();
        C1507k c1507k = this.b;
        C1475c c1475c = this.c;
        while (true) {
            try {
                C1380m nextToken = c5303j.nextToken();
                if (nextToken == C1380m.END_ARRAY) {
                    break;
                }
                Object a = nextToken == C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1475c == null ? c1507k.mo1304a(c5303j, c5347g) : c1507k.mo1308a(c5303j, c5347g, c1475c);
                arrayList.add(a);
            } catch (Throwable e) {
                throw C5364l.m11579a(e, arrayList, arrayList.size());
            }
        }
        if (collection == null) {
            return new ArrayBlockingQueue(arrayList.size(), false, arrayList);
        }
        collection.addAll(arrayList);
        return collection;
    }

    public final Collection<Object> b_(C5303j c5303j, C5347g c5347g) {
        if (this.e != null) {
            return (Collection) this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g));
        }
        if (c5303j.getCurrentToken() == C1380m.VALUE_STRING) {
            String text = c5303j.getText();
            if (text.length() == 0) {
                return (Collection) this.d.mo1317a(c5347g, text);
            }
        }
        return mo3525a(c5303j, c5347g, null);
    }
}
