package com.p072b.p073a.p074a.p079f.p511a;

import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1038i;

public class C5080e extends C1033b {
    public int f14185d;
    public Runnable f14186e;

    public C5080e() {
        super(C1038i.COMMAND);
    }

    protected final void mo1080a() {
        this.f14185d = -1;
        this.f14186e = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Command[");
        stringBuilder.append(this.f14185d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
