package com.p067a.p070b;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C5058d implements C0996r {
    private int f14132a;
    private int f14133b;
    private final int f14134c;
    private final float f14135d;

    public C5058d() {
        this(2500);
    }

    public C5058d(int i) {
        this.f14132a = i;
        this.f14134c = 0;
        this.f14135d = BallPulseIndicator.SCALE;
    }

    public final int mo1043a() {
        return this.f14132a;
    }

    public final void mo1044a(C0997u c0997u) {
        int i = 1;
        this.f14133b++;
        this.f14132a = (int) (((float) this.f14132a) + (((float) this.f14132a) * this.f14135d));
        if (this.f14133b > this.f14134c) {
            i = 0;
        }
        if (i == 0) {
            throw c0997u;
        }
    }

    public final int mo1045b() {
        return this.f14133b;
    }
}
