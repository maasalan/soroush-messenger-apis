package com.p072b.p073a.p074a.p083i;

import android.content.Context;

public abstract class C1061a {
    private C1060a f3442a;
    private Context f3443b;

    public interface C1060a {
    }

    protected C1061a() {
    }

    public abstract void mo1070a();

    public void mo1071a(Context context, C1060a c1060a) {
        this.f3443b = context.getApplicationContext();
        this.f3442a = c1060a;
    }

    public abstract void mo1072a(C1062b c1062b);

    public abstract void mo1073a(C1062b c1062b, boolean z);
}
