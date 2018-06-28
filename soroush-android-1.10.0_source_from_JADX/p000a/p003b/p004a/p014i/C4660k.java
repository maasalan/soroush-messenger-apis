package p000a.p003b.p004a.p014i;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0076k.C0070b;

public final class C4660k extends C0061g {
    public final C0044e f12804a;
    public final C0070b[] f12805b;
    private final byte[] f12806c;

    public C4660k(C0044e c0044e, C0070b[] c0070bArr) {
        this.f12804a = c0044e;
        this.f12805b = c0070bArr;
        this.f12806c = C4660k.m8492a(c0070bArr);
    }

    private static void m8491a(byte[] bArr, DataOutputStream dataOutputStream) {
        int i = 0;
        int i2 = 0;
        int i3 = i2;
        while (i2 < 32) {
            if (bArr[i2] != (byte) 0) {
                i3 = i2 + 1;
            }
            i2++;
        }
        dataOutputStream.writeByte(i3);
        while (i < i3) {
            dataOutputStream.writeByte(bArr[i]);
            i++;
        }
    }

    static byte[] m8492a(C0070b[] c0070bArr) {
        int i;
        List<Integer> arrayList = new ArrayList();
        for (C0070b c0070b : c0070bArr) {
            arrayList.add(Integer.valueOf(c0070b.aF));
        }
        Collections.sort(arrayList);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            byte[] bArr = null;
            i = -1;
            for (Integer num : arrayList) {
                if (i == -1 || (num.intValue() >> 8) != i) {
                    if (i != -1) {
                        C4660k.m8491a(bArr, dataOutputStream);
                    }
                    i = num.intValue() >> 8;
                    dataOutputStream.writeByte(i);
                    bArr = new byte[32];
                }
                int intValue = (num.intValue() >> 3) % 32;
                bArr[intValue] = (byte) ((128 >> (num.intValue() % 8)) | bArr[intValue]);
            }
            if (i != -1) {
                C4660k.m8491a(bArr, dataOutputStream);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static C0070b[] m8493a(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (bArr.length > i) {
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                for (int i3 = 0; i3 < 8; i3++) {
                    if (((readUnsignedByte3 >> i3) & 1) > 0) {
                        arrayList.add(C0070b.m113a(((readUnsignedByte << 8) + (i2 * 8)) + (7 - i3)));
                    }
                }
            }
            i += readUnsignedByte2 + 2;
        }
        return (C0070b[]) arrayList.toArray(new C0070b[arrayList.size()]);
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        this.f12804a.m79a((OutputStream) dataOutputStream);
        dataOutputStream.write(this.f12806c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12804a);
        stringBuilder.append('.');
        for (Object obj : this.f12805b) {
            stringBuilder.append(' ');
            stringBuilder.append(obj);
        }
        return stringBuilder.toString();
    }
}
