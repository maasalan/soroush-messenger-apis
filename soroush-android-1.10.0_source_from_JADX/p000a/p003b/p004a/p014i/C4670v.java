package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import p000a.p003b.p004a.C0076k.C0070b;

public final class C4670v extends C0061g {
    private final C0070b f12854a;
    private final byte[] f12855b;

    public C4670v(DataInputStream dataInputStream, int i, C0070b c0070b) {
        this.f12854a = c0070b;
        this.f12855b = new byte[i];
        dataInputStream.readFully(this.f12855b);
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.f12855b);
    }
}
