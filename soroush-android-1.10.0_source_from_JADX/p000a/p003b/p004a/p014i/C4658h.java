package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import java.net.InetAddress;

public abstract class C4658h extends C0061g {
    protected final byte[] f12800a;
    private InetAddress f12801b;

    protected C4658h(byte[] bArr) {
        this.f12800a = bArr;
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.f12800a);
    }

    public final byte[] m8488a() {
        return (byte[]) this.f12800a.clone();
    }

    public final InetAddress m8489b() {
        InetAddress inetAddress = this.f12801b;
        if (inetAddress != null) {
            return inetAddress;
        }
        try {
            inetAddress = InetAddress.getByAddress(this.f12800a);
            this.f12801b = inetAddress;
            return inetAddress;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
