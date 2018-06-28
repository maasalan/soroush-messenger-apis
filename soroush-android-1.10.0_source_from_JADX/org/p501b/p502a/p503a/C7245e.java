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

public final class C7245e extends C6302a implements C7005e {
    private final C7003b f20929b;
    private final C6305b f20930c;

    C7245e(String str, String str2) {
        this.f20929b = new C7244c(str2);
        this.f20930c = C6305b.m14763a(str);
    }

    public final C6305b mo3481a() {
        return this.f20930c;
    }

    public final C7005e mo3482b() {
        return this;
    }

    public final C6304a mo3471d() {
        return this.f20929b.mo3471d();
    }

    public final boolean mo3472j() {
        return true;
    }

    public final C6303a mo3473m() {
        return this;
    }

    public final C7005e mo3474n() {
        return this;
    }

    public final C7006f mo3475p() {
        return null;
    }

    public final C6308g mo3476r() {
        return this;
    }

    public final C6309h mo3477s() {
        return null;
    }

    public final C7003b mo3478t() {
        return this.f20929b;
    }

    public final String toString() {
        if (this.a != null) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20930c.toString());
        stringBuilder.append('@');
        stringBuilder.append(this.f20929b.toString());
        this.a = stringBuilder.toString();
        return this.a;
    }

    public final C6306d mo3480u() {
        return null;
    }
}
