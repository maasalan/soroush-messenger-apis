package com.p085c.p086a.p089c.p092b.p093a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p085c.p086a.p109i.C1273i;

final class C5115c implements C1110k {
    private final C5114b f14299a = new C5114b();
    private final C1108g<C5113a, Bitmap> f14300b = new C1108g();

    static class C5113a implements C1111l {
        int f14295a;
        int f14296b;
        Config f14297c;
        private final C5114b f14298d;

        public C5113a(C5114b c5114b) {
            this.f14298d = c5114b;
        }

        public final void mo1118a() {
            this.f14298d.m2684a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5113a) {
                C5113a c5113a = (C5113a) obj;
                if (this.f14295a == c5113a.f14295a && this.f14296b == c5113a.f14296b && this.f14297c == c5113a.f14297c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * ((this.f14295a * 31) + this.f14296b)) + (this.f14297c != null ? this.f14297c.hashCode() : 0);
        }

        public final String toString() {
            return C5115c.m10489c(this.f14295a, this.f14296b, this.f14297c);
        }
    }

    static class C5114b extends C1105d<C5113a> {
        C5114b() {
        }

        public final C5113a m10487a(int i, int i2, Config config) {
            C5113a c5113a = (C5113a) m2685b();
            c5113a.f14295a = i;
            c5113a.f14296b = i2;
            c5113a.f14297c = config;
            return c5113a;
        }

        protected final /* synthetic */ C1111l mo1119a() {
            return new C5113a(this);
        }
    }

    C5115c() {
    }

    static String m10489c(int i, int i2, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("], ");
        stringBuilder.append(config);
        return stringBuilder.toString();
    }

    public final Bitmap mo1120a() {
        return (Bitmap) this.f14300b.m2696a();
    }

    public final Bitmap mo1121a(int i, int i2, Config config) {
        return (Bitmap) this.f14300b.m2697a(this.f14299a.m10487a(i, i2, config));
    }

    public final void mo1122a(Bitmap bitmap) {
        this.f14300b.m2698a(this.f14299a.m10487a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public final String mo1123b(int i, int i2, Config config) {
        return C5115c.m10489c(i, i2, config);
    }

    public final String mo1124b(Bitmap bitmap) {
        return C5115c.m10489c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int mo1125c(Bitmap bitmap) {
        return C1273i.m3017a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AttributeStrategy:\n  ");
        stringBuilder.append(this.f14300b);
        return stringBuilder.toString();
    }
}
