package p050b.p054b;

import p050b.C0832a;
import p050b.C0858w;

public class C0837c extends Exception {
    private C4978h f2502a;
    private String f2503b;

    public C0837c(C0832a c0832a) {
        this(c0832a.f2496a != null ? c0832a.f2496a : c0832a.toString());
    }

    public C0837c(C0858w c0858w) {
        StringBuilder stringBuilder = new StringBuilder("cannot find ");
        stringBuilder.append(c0858w.getMessage());
        this(stringBuilder.toString());
    }

    public C0837c(String str) {
        this.f2503b = str;
        this.f2502a = null;
    }

    public C0837c(String str, C4978h c4978h) {
        this.f2503b = str;
        this.f2502a = c4978h;
    }

    public String getMessage() {
        return this.f2503b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("compile error: ");
        stringBuilder.append(this.f2503b);
        return stringBuilder.toString();
    }
}
