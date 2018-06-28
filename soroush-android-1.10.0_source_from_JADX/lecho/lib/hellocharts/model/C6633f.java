package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6633f extends C5750a {
    public List<C2435e> f18903k = new ArrayList();
    public float f18904l = 0.0f;

    public static C6633f m17132l() {
        C6633f c6633f = new C6633f();
        List arrayList = new ArrayList(4);
        arrayList.add(new C2436g(0.0f, 2.0f));
        arrayList.add(new C2436g(BallPulseIndicator.SCALE, 4.0f));
        arrayList.add(new C2436g(2.0f, 3.0f));
        arrayList.add(new C2436g(3.0f, 4.0f));
        C2435e c2435e = new C2435e(arrayList);
        arrayList = new ArrayList(1);
        arrayList.add(c2435e);
        c6633f.f18903k = arrayList;
        return c6633f;
    }

    public final void mo3162a(float f) {
        for (C2435e c2435e : this.f18903k) {
            for (C2436g c2436g : c2435e.f8085q) {
                c2436g.f8086a = c2436g.f8088c + (c2436g.f8090e * f);
                c2436g.f8087b = c2436g.f8089d + (c2436g.f8091f * f);
            }
        }
    }

    public final void mo3163k() {
        for (C2435e c2435e : this.f18903k) {
            for (C2436g c2436g : c2435e.f8085q) {
                c2436g.m6661a(c2436g.f8088c + c2436g.f8090e, c2436g.f8089d + c2436g.f8091f);
            }
        }
    }
}
