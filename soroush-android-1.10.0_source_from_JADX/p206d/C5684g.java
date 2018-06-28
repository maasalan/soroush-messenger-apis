package p206d;

public abstract class C5684g implements C2277r {
    private final C2277r f15623a;

    public C5684g(C2277r c2277r) {
        if (c2277r == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15623a = c2277r;
    }

    public final C2279t mo960a() {
        return this.f15623a.mo960a();
    }

    public void a_(C6623c c6623c, long j) {
        this.f15623a.a_(c6623c, j);
    }

    public void close() {
        this.f15623a.close();
    }

    public void flush() {
        this.f15623a.flush();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.f15623a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
