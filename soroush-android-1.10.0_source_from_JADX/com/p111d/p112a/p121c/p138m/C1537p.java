package com.p111d.p112a.p121c.p138m;

public abstract class C1537p<T> {
    protected T f4787a;
    protected C1536a<T> f4788b;
    protected C1536a<T> f4789c;
    protected int f4790d;

    static final class C1536a<T> {
        final T f4784a;
        final int f4785b;
        C1536a<T> f4786c;

        public C1536a(T t, int i) {
            this.f4784a = t;
            this.f4785b = i;
        }
    }

    protected C1537p() {
    }

    public final int m4013a() {
        return this.f4790d;
    }

    protected abstract T mo1481a(int i);

    public final T m4015a(T t, int i) {
        C1536a c1536a = new C1536a(t, i);
        if (this.f4788b == null) {
            this.f4789c = c1536a;
            this.f4788b = c1536a;
        } else {
            C1536a c1536a2 = this.f4789c;
            if (c1536a2.f4786c != null) {
                throw new IllegalStateException();
            }
            c1536a2.f4786c = c1536a;
            this.f4789c = c1536a;
        }
        this.f4790d += i;
        return mo1481a(i < 16384 ? i + i : i + (i >> 2));
    }

    public final T m4016b() {
        if (this.f4789c != null) {
            this.f4787a = this.f4789c.f4784a;
        }
        this.f4789c = null;
        this.f4788b = null;
        this.f4790d = 0;
        return this.f4787a == null ? mo1481a(12) : this.f4787a;
    }

    public final T m4017b(T t, int i) {
        int i2 = this.f4790d + i;
        T a = mo1481a(i2);
        int i3 = 0;
        for (C1536a c1536a = this.f4788b; c1536a != null; c1536a = c1536a.f4786c) {
            System.arraycopy(c1536a.f4784a, 0, a, i3, c1536a.f4785b);
            i3 += c1536a.f4785b;
        }
        System.arraycopy(t, 0, a, i3, i);
        i3 += i;
        if (i3 == i2) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder("Should have gotten ");
        stringBuilder.append(i2);
        stringBuilder.append(" entries, got ");
        stringBuilder.append(i3);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
