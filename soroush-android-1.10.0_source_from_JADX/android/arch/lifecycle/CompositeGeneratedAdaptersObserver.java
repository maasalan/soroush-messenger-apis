package android.arch.lifecycle;

import android.arch.lifecycle.C0093d.C0091a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {
    private final C0090c[] f17274a;

    CompositeGeneratedAdaptersObserver(C0090c[] c0090cArr) {
        this.f17274a = c0090cArr;
    }

    public final void mo2476a(C0096g c0096g, C0091a c0091a) {
        C0100k c0100k = new C0100k();
        int i = 0;
        for (C0090c a : this.f17274a) {
            a.mo2136a(c0091a, false, c0100k);
        }
        C0090c[] c0090cArr = this.f17274a;
        int length = c0090cArr.length;
        while (i < length) {
            c0090cArr[i].mo2136a(c0091a, true, c0100k);
            i++;
        }
    }
}
