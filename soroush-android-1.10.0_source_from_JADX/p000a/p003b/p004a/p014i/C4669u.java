package p000a.p003b.p004a.p014i;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C4669u extends C0061g {
    private final byte[] f12853a;

    public C4669u(byte[] bArr) {
        this.f12853a = bArr;
    }

    private String m8510a() {
        List arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i2 < this.f12853a.length) {
            i2++;
            int i3 = (255 & this.f12853a[i2]) + i2;
            arrayList.add(Arrays.copyOfRange(this.f12853a, i2, i3));
            i2 = i3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i < arrayList.size() - 1) {
            stringBuilder.append(new String((byte[]) arrayList.get(i)));
            stringBuilder.append(" / ");
            i++;
        }
        stringBuilder.append(new String((byte[]) arrayList.get(i)));
        return stringBuilder.toString();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.f12853a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\"");
        stringBuilder.append(m8510a());
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }
}
