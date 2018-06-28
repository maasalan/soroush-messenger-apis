package com.p149g.p152b.p153a;

import com.coremedia.iso.Hex;
import java.math.BigInteger;
import java.util.Arrays;

public final class C1613a {
    public byte[] f5048a = new byte[0];
    public C1612j[] f5049b = null;

    public interface C1612j {
        int mo2986a();

        long mo2987b();
    }

    private abstract class C5402a implements C1612j {
        final /* synthetic */ C1613a f15038a;

        private C5402a(C1613a c1613a) {
            this.f15038a = c1613a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1612j c1612j = (C1612j) obj;
            return mo2986a() == c1612j.mo2986a() && mo2987b() == c1612j.mo2987b();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("P(");
            stringBuilder.append(mo2986a());
            stringBuilder.append("|");
            stringBuilder.append(mo2987b());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private class C6535b extends C5402a {
        final /* synthetic */ C1613a f17868b;
        private byte f17869c;
        private byte f17870d;

        public C6535b(C1613a c1613a, int i, long j) {
            this.f17868b = c1613a;
            super();
            this.f17869c = (byte) i;
            this.f17870d = (byte) ((int) j);
        }

        public final int mo2986a() {
            return this.f17869c;
        }

        public final long mo2987b() {
            return (long) this.f17870d;
        }
    }

    private class C6536c extends C5402a {
        final /* synthetic */ C1613a f17871b;
        private byte f17872c;
        private int f17873d;

        public C6536c(C1613a c1613a, int i, long j) {
            this.f17871b = c1613a;
            super();
            this.f17872c = (byte) i;
            this.f17873d = (int) j;
        }

        public final int mo2986a() {
            return this.f17872c;
        }

        public final long mo2987b() {
            return (long) this.f17873d;
        }
    }

    private class C6537d extends C5402a {
        final /* synthetic */ C1613a f17874b;
        private byte f17875c;
        private long f17876d;

        public C6537d(C1613a c1613a, int i, long j) {
            this.f17874b = c1613a;
            super();
            this.f17875c = (byte) i;
            this.f17876d = j;
        }

        public final int mo2986a() {
            return this.f17875c;
        }

        public final long mo2987b() {
            return this.f17876d;
        }
    }

    private class C6538e extends C5402a {
        final /* synthetic */ C1613a f17877b;
        private byte f17878c;
        private short f17879d;

        public C6538e(C1613a c1613a, int i, long j) {
            this.f17877b = c1613a;
            super();
            this.f17878c = (byte) i;
            this.f17879d = (short) ((int) j);
        }

        public final int mo2986a() {
            return this.f17878c;
        }

        public final long mo2987b() {
            return (long) this.f17879d;
        }
    }

    private class C6539f extends C5402a {
        final /* synthetic */ C1613a f17880b;
        private int f17881c;
        private byte f17882d;

        public C6539f(C1613a c1613a, int i, long j) {
            this.f17880b = c1613a;
            super();
            this.f17881c = i;
            this.f17882d = (byte) ((int) j);
        }

        public final int mo2986a() {
            return this.f17881c;
        }

        public final long mo2987b() {
            return (long) this.f17882d;
        }
    }

    private class C6540g extends C5402a {
        final /* synthetic */ C1613a f17883b;
        private int f17884c;
        private int f17885d;

        public C6540g(C1613a c1613a, int i, long j) {
            this.f17883b = c1613a;
            super();
            this.f17884c = i;
            this.f17885d = (int) j;
        }

        public final int mo2986a() {
            return this.f17884c;
        }

        public final long mo2987b() {
            return (long) this.f17885d;
        }
    }

    private class C6541h extends C5402a {
        final /* synthetic */ C1613a f17886b;
        private int f17887c;
        private long f17888d;

        public C6541h(C1613a c1613a, int i, long j) {
            this.f17886b = c1613a;
            super();
            this.f17887c = i;
            this.f17888d = j;
        }

        public final int mo2986a() {
            return this.f17887c;
        }

        public final long mo2987b() {
            return this.f17888d;
        }
    }

    private class C6542i extends C5402a {
        final /* synthetic */ C1613a f17889b;
        private int f17890c;
        private short f17891d;

        public C6542i(C1613a c1613a, int i, long j) {
            this.f17889b = c1613a;
            super();
            this.f17890c = i;
            this.f17891d = (short) ((int) j);
        }

        public final int mo2986a() {
            return this.f17890c;
        }

        public final long mo2987b() {
            return (long) this.f17891d;
        }
    }

    private class C6543k extends C5402a {
        final /* synthetic */ C1613a f17892b;
        private short f17893c;
        private byte f17894d;

        public C6543k(C1613a c1613a, int i, long j) {
            this.f17892b = c1613a;
            super();
            this.f17893c = (short) i;
            this.f17894d = (byte) ((int) j);
        }

        public final int mo2986a() {
            return this.f17893c;
        }

        public final long mo2987b() {
            return (long) this.f17894d;
        }
    }

    private class C6544l extends C5402a {
        final /* synthetic */ C1613a f17895b;
        private short f17896c;
        private int f17897d;

        public C6544l(C1613a c1613a, int i, long j) {
            this.f17895b = c1613a;
            super();
            this.f17896c = (short) i;
            this.f17897d = (int) j;
        }

        public final int mo2986a() {
            return this.f17896c;
        }

        public final long mo2987b() {
            return (long) this.f17897d;
        }
    }

    private class C6545m extends C5402a {
        final /* synthetic */ C1613a f17898b;
        private short f17899c;
        private long f17900d;

        public C6545m(C1613a c1613a, int i, long j) {
            this.f17898b = c1613a;
            super();
            this.f17899c = (short) i;
            this.f17900d = j;
        }

        public final int mo2986a() {
            return this.f17899c;
        }

        public final long mo2987b() {
            return this.f17900d;
        }
    }

    private class C6546n extends C5402a {
        final /* synthetic */ C1613a f17901b;
        private short f17902c;
        private short f17903d;

        public C6546n(C1613a c1613a, int i, long j) {
            this.f17901b = c1613a;
            super();
            this.f17902c = (short) i;
            this.f17903d = (short) ((int) j);
        }

        public final int mo2986a() {
            return this.f17902c;
        }

        public final long mo2987b() {
            return (long) this.f17903d;
        }
    }

    public final int m4152a() {
        int length = this.f5048a.length;
        return (this.f5049b == null || this.f5049b.length <= 0) ? length : (length + 2) + (this.f5049b.length * 6);
    }

    public final C1612j m4153a(int i, long j) {
        return i <= 127 ? j <= 127 ? new C6535b(this, i, j) : j <= 32767 ? new C6538e(this, i, j) : j <= 2147483647L ? new C6536c(this, i, j) : new C6537d(this, i, j) : i <= 32767 ? j <= 127 ? new C6543k(this, i, j) : j <= 32767 ? new C6546n(this, i, j) : j <= 2147483647L ? new C6544l(this, i, j) : new C6545m(this, i, j) : j <= 127 ? new C6539f(this, i, j) : j <= 32767 ? new C6542i(this, i, j) : j <= 2147483647L ? new C6540g(this, i, j) : new C6541h(this, i, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1613a c1613a = (C1613a) obj;
        if (!new BigInteger(this.f5048a).equals(new BigInteger(c1613a.f5048a))) {
            return false;
        }
        if (this.f5049b != null) {
            if (!Arrays.equals(this.f5049b, c1613a.f5049b)) {
                return false;
            }
        } else if (c1613a.f5049b != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = 31 * (this.f5048a != null ? Arrays.hashCode(this.f5048a) : 0);
        if (this.f5049b != null) {
            i = Arrays.hashCode(this.f5049b);
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Entry{iv=");
        stringBuilder.append(Hex.encodeHex(this.f5048a));
        stringBuilder.append(", pairs=");
        stringBuilder.append(Arrays.toString(this.f5049b));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
