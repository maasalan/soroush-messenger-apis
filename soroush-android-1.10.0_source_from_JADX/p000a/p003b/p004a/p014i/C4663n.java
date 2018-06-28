package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import p000a.p003b.p004a.p016k.C0070b;

public final class C4663n extends C0061g {
    private final byte[] f12823a;
    private String f12824b;

    public C4663n(byte[] bArr) {
        this.f12823a = bArr;
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.f12823a);
    }

    public final String toString() {
        if (this.f12824b == null) {
            this.f12824b = C0070b.m117a(this.f12823a);
        }
        return this.f12824b;
    }
}
