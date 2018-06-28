package p050b.p054b.p055a;

public final class C4973q extends C0833b {
    protected C0833b f13825a;
    protected C0833b f13826b;

    public C4973q(C0833b c0833b, C0833b c0833b2) {
        this.f13825a = c0833b;
        this.f13826b = c0833b2;
    }

    public final C0833b mo883a() {
        return this.f13825a;
    }

    public final void mo884a(C0833b c0833b) {
        this.f13825a = c0833b;
    }

    public final void mo885a(C0834v c0834v) {
        c0834v.mo903f();
    }

    public final C0833b mo886b() {
        return this.f13826b;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(<Pair> ");
        stringBuffer.append(this.f13825a == null ? "<null>" : this.f13825a.toString());
        stringBuffer.append(" . ");
        stringBuffer.append(this.f13826b == null ? "<null>" : this.f13826b.toString());
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
