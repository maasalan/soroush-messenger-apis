package org.p501b.p502a.p503a;

import org.p501b.p502a.C6303a;
import org.p501b.p502a.C6308g;
import org.p501b.p502a.C6309h;
import org.p501b.p502a.C7003b;
import org.p501b.p502a.C7005e;
import org.p501b.p502a.C7006f;
import org.p501b.p502a.p504b.C6304a;
import org.p501b.p502a.p504b.C6305b;
import org.p501b.p502a.p504b.C6306d;

public final class C7246f extends C6302a implements C7006f {
    private final C7005e f20931b;
    private final C6306d f20932c;

    C7246f(String str, String str2, String str3) {
        this(new C7245e(str, str2), C6306d.m14764a(str3));
    }

    C7246f(C7005e c7005e, C6306d c6306d) {
        this.f20931b = c7005e;
        this.f20932c = c6306d;
    }

    public final C6305b mo3481a() {
        return this.f20931b.mo3481a();
    }

    public final C7005e mo3482b() {
        return this.f20931b;
    }

    public final C6306d mo3470c() {
        return this.f20932c;
    }

    public final C6304a mo3471d() {
        return this.f20931b.mo3471d();
    }

    public final boolean mo3472j() {
        return false;
    }

    public final C6303a mo3473m() {
        return this.f20931b;
    }

    public final C7005e mo3474n() {
        return this.f20931b;
    }

    public final C7006f mo3475p() {
        return this;
    }

    public final C6308g mo3476r() {
        return this;
    }

    public final C6309h mo3477s() {
        return this;
    }

    public final C7003b mo3478t() {
        return this.f20931b.mo3478t();
    }

    public final String toString() {
        if (this.a != null) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20931b.toString());
        stringBuilder.append('/');
        stringBuilder.append(this.f20932c);
        this.a = stringBuilder.toString();
        return this.a;
    }

    public final C6306d mo3480u() {
        return this.f20932c;
    }
}
