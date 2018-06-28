package com.p085c.p086a.p089c.p090a;

import com.p085c.p086a.p089c.p090a.C1098c.C1097a;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p098d.p099a.C1190p;
import java.io.InputStream;

public final class C5111i implements C1098c<InputStream> {
    private final C1190p f14291a;

    public static final class C5110a implements C1097a<InputStream> {
        private final C1104b f14290a;

        public C5110a(C1104b c1104b) {
            this.f14290a = c1104b;
        }

        public final /* synthetic */ C1098c mo1113a(Object obj) {
            return new C5111i((InputStream) obj, this.f14290a);
        }

        public final Class<InputStream> mo1114a() {
            return InputStream.class;
        }
    }

    C5111i(InputStream inputStream, C1104b c1104b) {
        this.f14291a = new C1190p(inputStream, c1104b);
        this.f14291a.mark(5242880);
    }

    public final /* synthetic */ Object mo1115a() {
        this.f14291a.reset();
        return this.f14291a;
    }

    public final void mo1116b() {
        this.f14291a.m2834b();
    }
}
