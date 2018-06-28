package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import java.math.BigInteger;

public final class C4668t extends C0061g {
    public final byte f12849a;
    public final byte f12850b;
    public final byte f12851c;
    public final byte[] f12852d;

    public C4668t(byte b, byte b2, byte b3, byte[] bArr) {
        this.f12849a = b;
        this.f12850b = b2;
        this.f12851c = b3;
        this.f12852d = bArr;
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f12849a);
        dataOutputStream.writeByte(this.f12850b);
        dataOutputStream.writeByte(this.f12851c);
        dataOutputStream.write(this.f12852d);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12849a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12850b);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12851c);
        stringBuilder.append(' ');
        stringBuilder.append(new BigInteger(1, this.f12852d).toString(16));
        return stringBuilder.toString();
    }
}
