package p050b.p051a;

public class C0815e extends Exception {
    public C0815e(int i) {
        StringBuilder stringBuilder = new StringBuilder("bytecode ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
    }

    public C0815e(an anVar, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anVar.toString());
        stringBuilder.append(" in ");
        stringBuilder.append(anVar.f2404a.m1876a());
        stringBuilder.append(": ");
        stringBuilder.append(th.getMessage());
        super(stringBuilder.toString(), th);
    }

    public C0815e(String str) {
        super(str);
    }

    public C0815e(String str, Throwable th) {
        super(str, th);
    }
}
