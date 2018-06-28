package com.p072b.p073a.p074a.p079f.p511a;

import com.p072b.p073a.p074a.C1059h;
import com.p072b.p073a.p074a.C1059h.C1047a;
import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1038i;

public class C5083h extends C1033b implements C1047a {
    public C1059h f14190d;
    public int f14191e = -1;
    public String f14192f;

    public C5083h() {
        super(C1038i.PUBLIC_QUERY);
    }

    protected final void mo1080a() {
        this.f14190d = null;
        this.f14191e = -1;
    }

    public final void mo1081a(C1059h c1059h) {
        this.f14190d = c1059h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PublicQuery[");
        stringBuilder.append(this.f14191e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
