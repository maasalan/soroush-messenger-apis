package org.p501b.p502a.p503a;

import org.p501b.p502a.C6303a;
import org.p501b.p502a.C6308g;
import org.p501b.p502a.C6309h;
import org.p501b.p502a.C7003b;
import org.p501b.p502a.C7004c;
import org.p501b.p502a.C7005e;
import org.p501b.p502a.C7006f;
import org.p501b.p502a.p504b.C6304a;
import org.p501b.p502a.p504b.C6306d;

public final class C7243b extends C6302a implements C7004c {
    private final C7003b f20926b;
    private final C6306d f20927c;

    C7243b(String str, String str2) {
        this(new C7244c(str), C6306d.m14764a(str2));
    }

    private C7243b(C7003b c7003b, C6306d c6306d) {
        this.f20926b = c7003b;
        this.f20927c = c6306d;
    }

    public final C6306d mo3470c() {
        return this.f20927c;
    }

    public final C6304a mo3471d() {
        return this.f20926b.mo3471d();
    }

    public final boolean mo3472j() {
        return false;
    }

    public final C6303a mo3473m() {
        return this.f20926b;
    }

    public final C7005e mo3474n() {
        return null;
    }

    public final C7006f mo3475p() {
        return null;
    }

    public final C6308g mo3476r() {
        return null;
    }

    public final C6309h mo3477s() {
        return this;
    }

    public final C7003b mo3478t() {
        return this.f20926b;
    }

    public final String toString() {
        if (this.a != null) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20926b.toString());
        stringBuilder.append('/');
        stringBuilder.append(this.f20927c);
        this.a = stringBuilder.toString();
        return this.a;
    }

    public final C6306d mo3480u() {
        return this.f20927c;
    }
}
