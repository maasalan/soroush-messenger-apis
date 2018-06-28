package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import p000a.p003b.p004a.C0049f.C4646a;
import p000a.p003b.p004a.C0049f.C4647b;

public class C6327d extends C4657f {
    private C6327d(int i, C4647b c4647b, C4646a c4646a, byte[] bArr) {
        super(i, c4647b, c4646a, bArr);
    }

    public static C6327d m14808a(DataInputStream dataInputStream, int i) {
        C4657f b = C4657f.m8484b(dataInputStream, i);
        return new C6327d(b.f12794a, b.f12795b, b.f12797d, b.f12799f);
    }
}
