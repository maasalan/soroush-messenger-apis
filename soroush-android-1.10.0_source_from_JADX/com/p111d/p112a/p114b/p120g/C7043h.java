package com.p111d.p112a.p114b.p120g;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import java.util.ArrayList;
import java.util.List;

public final class C7043h extends C6468g {
    protected final C5303j[] f20121b;
    protected int f20122c = 1;

    private C7043h(C5303j[] c5303jArr) {
        super(c5303jArr[0]);
        this.f20121b = c5303jArr;
    }

    public static C7043h m18225a(C5303j c5303j, C5303j c5303j2) {
        boolean z = c5303j instanceof C7043h;
        if (z || (c5303j2 instanceof C7043h)) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                ((C7043h) c5303j).m18226a(arrayList);
            } else {
                arrayList.add(c5303j);
            }
            if (c5303j2 instanceof C7043h) {
                ((C7043h) c5303j2).m18226a(arrayList);
            } else {
                arrayList.add(c5303j2);
            }
            return new C7043h((C5303j[]) arrayList.toArray(new C5303j[arrayList.size()]));
        }
        return new C7043h(new C5303j[]{c5303j, c5303j2});
    }

    private void m18226a(List<C5303j> list) {
        int length = this.f20121b.length;
        for (int i = this.f20122c - 1; i < length; i++) {
            Object obj = this.f20121b[i];
            if (obj instanceof C7043h) {
                ((C7043h) obj).m18226a(list);
            } else {
                list.add(obj);
            }
        }
    }

    private boolean m18227a() {
        if (this.f20122c >= this.f20121b.length) {
            return false;
        }
        C5303j[] c5303jArr = this.f20121b;
        int i = this.f20122c;
        this.f20122c = i + 1;
        this.a = c5303jArr[i];
        return true;
    }

    public final void close() {
        do {
            this.a.close();
        } while (m18227a());
    }

    public final C1380m nextToken() {
        C1380m nextToken = this.a.nextToken();
        if (nextToken != null) {
            return nextToken;
        }
        while (m18227a()) {
            nextToken = this.a.nextToken();
            if (nextToken != null) {
                return nextToken;
            }
        }
        return null;
    }
}
