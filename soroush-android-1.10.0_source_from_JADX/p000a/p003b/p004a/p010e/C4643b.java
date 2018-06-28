package p000a.p003b.p004a.p010e;

import p000a.p003b.p004a.C0054g.C0052b;
import p000a.p003b.p004a.p016k.C0072d;

public final class C4643b extends C0043a {
    public static final C4643b f12765d = new C4643b();

    private C4643b() {
        this(new byte[0]);
    }

    public C4643b(byte[] bArr) {
        super(bArr);
    }

    public final C0052b mo10a() {
        return C0052b.NSID;
    }

    protected final CharSequence mo11b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0052b.NSID);
        stringBuilder.append(": ");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(new String(this.c));
        return stringBuilder3.toString();
    }

    protected final CharSequence mo12d() {
        return C0072d.m119a(this.c);
    }
}
