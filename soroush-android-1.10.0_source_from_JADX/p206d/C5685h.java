package p206d;

public abstract class C5685h implements C2278s {
    protected final C2278s f15624d;

    public C5685h(C2278s c2278s) {
        if (c2278s == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15624d = c2278s;
    }

    public long mo944a(C6623c c6623c, long j) {
        return this.f15624d.mo944a(c6623c, j);
    }

    public final C2279t mo945a() {
        return this.f15624d.mo945a();
    }

    public void close() {
        this.f15624d.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.f15624d.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
