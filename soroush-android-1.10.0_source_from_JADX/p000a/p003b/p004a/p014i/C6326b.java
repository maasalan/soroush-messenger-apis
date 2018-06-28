package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;

public class C6326b extends C4658h {
    private C6326b(byte[] bArr) {
        super(bArr);
    }

    public static C6326b m14807a(DataInputStream dataInputStream) {
        byte[] bArr = new byte[16];
        dataInputStream.readFully(bArr);
        return new C6326b(bArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.length; i += 2) {
            if (i != 0) {
                stringBuilder.append(':');
            }
            stringBuilder.append(Integer.toHexString(((this.a[i] & 255) << 8) + (this.a[i + 1] & 255)));
        }
        return stringBuilder.toString();
    }
}
