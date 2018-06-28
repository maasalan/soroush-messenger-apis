package org.apache.p493a.p494a.p495a;

import java.net.DatagramPacket;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.msgpack.util.TemplatePrecompiler;

public final class C6300a implements C4603b {
    private final byte[] f17245a = new byte[48];
    private volatile DatagramPacket f17246b;

    private int m14737b(int i) {
        return (this.f17245a[i + 3] & 255) | ((((this.f17245a[i] & 255) << 24) | ((this.f17245a[i + 1] & 255) << 16)) | ((this.f17245a[i + 2] & 255) << 8));
    }

    private C4605d m14738c(int i) {
        return new C4605d((((((((((long) (this.f17245a[i] & 255)) << 56) | (((long) (this.f17245a[i + 1] & 255)) << 48)) | (((long) (this.f17245a[i + 2] & 255)) << 40)) | (((long) (this.f17245a[i + 3] & 255)) << 32)) | (((long) (this.f17245a[i + 4] & 255)) << 24)) | (((long) (this.f17245a[i + 5] & 255)) << 16)) | (((long) (this.f17245a[i + 6] & 255)) << 8)) | ((long) (this.f17245a[i + 7] & 255)));
    }

    private int m14739f() {
        return ((this.f17245a[0] & 255) >> 3) & 7;
    }

    private String m14740g() {
        StringBuilder stringBuilder;
        int f = m14739f();
        int i = this.f17245a[1] & 255;
        if (f == 3 || f == 4) {
            if (i != 0) {
                if (i != 1) {
                    if (f == 4) {
                        return m14741h();
                    }
                }
            }
            stringBuilder = new StringBuilder();
            for (i = 0; i <= 3; i++) {
                char c = (char) this.f17245a[12 + i];
                if (c == '\u0000') {
                    break;
                }
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
        if (i < 2) {
            return m14741h();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f17245a[12] & 255);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(this.f17245a[13] & 255);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(this.f17245a[14] & 255);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(this.f17245a[15] & 255);
        return stringBuilder.toString();
    }

    private String m14741h() {
        return Integer.toHexString(m14737b(12));
    }

    public final void mo2443a() {
        this.f17245a[0] = (byte) ((this.f17245a[0] & 248) | 3);
    }

    public final void mo2444a(int i) {
        this.f17245a[0] = (byte) (((i & 7) << 3) | (this.f17245a[0] & 199));
    }

    public final void mo2445a(C4605d c4605d) {
        long j = c4605d == null ? 0 : c4605d.f12641a;
        for (int i = 7; i >= 0; i--) {
            this.f17245a[40 + i] = (byte) ((int) (j & 255));
            j >>>= 8;
        }
    }

    public final C4605d mo2446b() {
        return m14738c(40);
    }

    public final C4605d mo2447c() {
        return m14738c(24);
    }

    public final C4605d mo2448d() {
        return m14738c(32);
    }

    public final synchronized DatagramPacket mo2449e() {
        if (this.f17246b == null) {
            this.f17246b = new DatagramPacket(this.f17245a, this.f17245a.length);
            this.f17246b.setPort(123);
        }
        return this.f17246b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f17245a, ((C6300a) obj).f17245a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17245a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[version:");
        stringBuilder.append(m14739f());
        stringBuilder.append(", mode:");
        stringBuilder.append(((this.f17245a[0] & 255) >> 0) & 7);
        stringBuilder.append(", poll:");
        stringBuilder.append(this.f17245a[2]);
        stringBuilder.append(", precision:");
        stringBuilder.append(this.f17245a[3]);
        stringBuilder.append(", delay:");
        stringBuilder.append(m14737b(4));
        stringBuilder.append(", dispersion(ms):");
        stringBuilder.append(((double) m14737b(8)) / 65.536d);
        stringBuilder.append(", id:");
        stringBuilder.append(m14740g());
        stringBuilder.append(", xmitTime:");
        C4605d c = m14738c(40);
        if (c.f12642b == null) {
            c.f12642b = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            c.f12642b.setTimeZone(TimeZone.getDefault());
        }
        stringBuilder.append(c.f12642b.format(new Date(C4605d.m8339a(c.f12641a))));
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
