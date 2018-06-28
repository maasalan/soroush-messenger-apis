package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.C5502j;
import com.google.android.gms.internal.C6581n;
import java.util.ListIterator;

public class C5436i extends C1673q<C5436i> {
    public final C1827x f15089f;
    public boolean f15090g;

    public C5436i(C1827x c1827x) {
        super(c1827x.m5161b(), c1827x.f6285c);
        this.f15089f = c1827x;
    }

    protected final void mo1535a(C1671o c1671o) {
        C5502j c5502j = (C5502j) c1671o.m4263b(C5502j.class);
        if (TextUtils.isEmpty(c5502j.f15256b)) {
            c5502j.f15256b = this.f15089f.m5166g().m15980b();
        }
        if (this.f15090g && TextUtils.isEmpty(c5502j.f15258d)) {
            C6581n f = this.f15089f.m5165f();
            c5502j.f15258d = f.m16727c();
            c5502j.f15259e = f.m16726b();
        }
    }

    public final void m11724a(String str) {
        ac.m4378a(str);
        Uri a = C5437j.m11726a(str);
        ListIterator listIterator = this.f5160i.f5155i.listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((C1680u) listIterator.next()).mo1537a())) {
                listIterator.remove();
            }
        }
        this.f5160i.f5155i.add(new C5437j(this.f15089f, str));
    }

    public final C1671o mo1536c() {
        C1671o a = this.f5160i.m4260a();
        a.m4262a(this.f15089f.m5167h().m15956b());
        a.m4262a(this.f15089f.f6290h.m15983b());
        m4270d();
        return a;
    }
}
