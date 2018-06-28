package p050b.p054b;

public final class C4984o extends C0837c {
    public C4984o(C4978h c4978h) {
        StringBuilder stringBuilder = new StringBuilder("syntax error near \"");
        int i = c4978h.f13850c - 10;
        if (i < 0) {
            i = 0;
        }
        int i2 = c4978h.f13850c + 10;
        if (i2 > c4978h.f13851d) {
            i2 = c4978h.f13851d;
        }
        stringBuilder.append(c4978h.f13849b.substring(i, i2));
        stringBuilder.append("\"");
        super(stringBuilder.toString(), c4978h);
    }
}
