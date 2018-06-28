package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import org.msgpack.util.TemplatePrecompiler;
import p000a.p003b.p004a.C0044e;

public class C4655c extends C0061g {
    public final C0044e f12785a;

    public C4655c(C0044e c0044e) {
        this.f12785a = c0044e;
    }

    public static C4655c m8478a(DataInputStream dataInputStream, byte[] bArr) {
        return new C4655c(C0044e.m71a(dataInputStream, bArr));
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        this.f12785a.m79a((OutputStream) dataOutputStream);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12785a);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        return stringBuilder.toString();
    }
}
