package com.google.p173d.p189f.p190a;

final class C2014d {
    final int f6758a;
    final int f6759b;
    final int f6760c;
    final int f6761d;
    int f6762e = -1;

    C2014d(int i, int i2, int i3, int i4) {
        this.f6758a = i;
        this.f6759b = i2;
        this.f6760c = i3;
        this.f6761d = i4;
    }

    final boolean m5503a() {
        return m5504a(this.f6762e);
    }

    final boolean m5504a(int i) {
        return i != -1 && this.f6760c == (i % 3) * 3;
    }

    final void m5505b() {
        this.f6762e = ((this.f6761d / 30) * 3) + (this.f6760c / 3);
    }

    final int m5506c() {
        return this.f6759b - this.f6758a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6762e);
        stringBuilder.append("|");
        stringBuilder.append(this.f6761d);
        return stringBuilder.toString();
    }
}
