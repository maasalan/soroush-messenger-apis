package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import org.msgpack.util.TemplatePrecompiler;

public class C6325a extends C4658h {
    private C6325a(byte[] bArr) {
        super(bArr);
    }

    public static C6325a m14806a(DataInputStream dataInputStream) {
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        return new C6325a(bArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.a[0] & 255));
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(Integer.toString(this.a[1] & 255));
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(Integer.toString(this.a[2] & 255));
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(Integer.toString(this.a[3] & 255));
        return stringBuilder.toString();
    }
}
