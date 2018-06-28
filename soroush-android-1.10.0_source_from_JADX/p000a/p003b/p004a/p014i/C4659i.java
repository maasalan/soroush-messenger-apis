package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import java.io.OutputStream;
import p000a.p003b.p004a.C0044e;

public final class C4659i extends C0061g {
    public final int f12802a;
    public final C0044e f12803b;

    public C4659i(int i, C0044e c0044e) {
        this.f12802a = i;
        this.f12803b = c0044e;
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f12802a);
        this.f12803b.m79a((OutputStream) dataOutputStream);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12802a);
        stringBuilder.append(" ");
        stringBuilder.append(this.f12803b);
        stringBuilder.append('.');
        return stringBuilder.toString();
    }
}
