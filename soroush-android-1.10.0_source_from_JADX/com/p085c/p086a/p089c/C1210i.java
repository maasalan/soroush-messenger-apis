package com.p085c.p086a.p089c;

import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;

public final class C1210i<T> {
    private static final C1209a<Object> f3823e = new C52521();
    final T f3824a;
    final C1209a<T> f3825b;
    final String f3826c;
    volatile byte[] f3827d;

    public interface C1209a<T> {
        void mo1214a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    static class C52521 implements C1209a<Object> {
        C52521() {
        }

        public final void mo1214a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    private C1210i(String str, T t, C1209a<T> c1209a) {
        this.f3826c = C1271h.m3013a(str);
        this.f3824a = t;
        this.f3825b = (C1209a) C1271h.m3012a((Object) c1209a, "Argument must not be null");
    }

    public static <T> C1210i<T> m2866a(String str) {
        return new C1210i(str, null, f3823e);
    }

    public static <T> C1210i<T> m2867a(String str, T t) {
        return new C1210i(str, t, f3823e);
    }

    public static <T> C1210i<T> m2868a(String str, T t, C1209a<T> c1209a) {
        return new C1210i(str, t, c1209a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1210i)) {
            return false;
        }
        return this.f3826c.equals(((C1210i) obj).f3826c);
    }

    public final int hashCode() {
        return this.f3826c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Option{key='");
        stringBuilder.append(this.f3826c);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
