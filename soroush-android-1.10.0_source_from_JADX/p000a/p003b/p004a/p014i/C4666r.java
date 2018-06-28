package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import java.io.OutputStream;
import p000a.p003b.p004a.C0044e;

public final class C4666r extends C0061g {
    public final C0044e f12838a;
    public final C0044e f12839b;
    public final long f12840c;
    public final int f12841d;
    public final int f12842e;
    public final int f12843f;
    public final long f12844g;

    public C4666r(C0044e c0044e, C0044e c0044e2, long j, int i, int i2, int i3, long j2) {
        this.f12838a = c0044e;
        this.f12839b = c0044e2;
        this.f12840c = j;
        this.f12841d = i;
        this.f12842e = i2;
        this.f12843f = i3;
        this.f12844g = j2;
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        this.f12838a.m79a((OutputStream) dataOutputStream);
        this.f12839b.m79a((OutputStream) dataOutputStream);
        dataOutputStream.writeInt((int) this.f12840c);
        dataOutputStream.writeInt(this.f12841d);
        dataOutputStream.writeInt(this.f12842e);
        dataOutputStream.writeInt(this.f12843f);
        dataOutputStream.writeInt((int) this.f12844g);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12838a);
        stringBuilder.append(". ");
        stringBuilder.append(this.f12839b);
        stringBuilder.append(". ");
        stringBuilder.append(this.f12840c);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12841d);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12842e);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12843f);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12844g);
        return stringBuilder.toString();
    }
}
