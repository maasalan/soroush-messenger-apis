package p206d;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.jivesoftware.smack.util.StringUtils;

public class C2272f implements Serializable, Comparable<C2272f> {
    static final char[] f7556a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C2272f f7557b = C2272f.m6192a(new byte[0]);
    final byte[] f7558c;
    transient int f7559d;
    transient String f7560e;

    C2272f(byte[] bArr) {
        this.f7558c = bArr;
    }

    private static int m6190a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        int i = 97;
        if (c < 'a' || c > 'f') {
            i = 65;
            if (c < 'A' || c > 'F') {
                StringBuilder stringBuilder = new StringBuilder("Unexpected hex digit: ");
                stringBuilder.append(c);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return (c - i) + 10;
    }

    public static C2272f m6191a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C2272f c2272f = new C2272f(str.getBytes(C2280u.f7576a));
        c2272f.f7560e = str;
        return c2272f;
    }

    public static C2272f m6192a(byte... bArr) {
        if (bArr != null) {
            return new C2272f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static C2272f m6193b(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder stringBuilder = new StringBuilder("Unexpected hex string: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((C2272f.m6190a(str.charAt(i2)) << 4) + C2272f.m6190a(str.charAt(i2 + 1)));
        }
        return C2272f.m6192a(bArr);
    }

    private C2272f m6194c(String str) {
        try {
            return C2272f.m6192a(MessageDigest.getInstance(str).digest(this.f7558c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public byte mo2038a(int i) {
        return this.f7558c[i];
    }

    public C2272f mo2039a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 > this.f7558c.length) {
            StringBuilder stringBuilder = new StringBuilder("endIndex > length(");
            stringBuilder.append(this.f7558c.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.f7558c.length) {
                return this;
            } else {
                Object obj = new byte[i3];
                System.arraycopy(this.f7558c, i, obj, 0, i3);
                return new C2272f(obj);
            }
        }
    }

    public String mo2040a() {
        String str = this.f7560e;
        if (str != null) {
            return str;
        }
        str = new String(this.f7558c, C2280u.f7576a);
        this.f7560e = str;
        return str;
    }

    void mo2041a(C6623c c6623c) {
        c6623c.m17035b(this.f7558c, 0, this.f7558c.length);
    }

    public boolean mo2042a(int i, C2272f c2272f, int i2, int i3) {
        return c2272f.mo2043a(0, this.f7558c, 0, i3);
    }

    public boolean mo2043a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f7558c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2280u.m6237a(this.f7558c, i, bArr, i2, i3);
    }

    public String mo2044b() {
        return C2269b.m6188a(this.f7558c);
    }

    public C2272f mo2045c() {
        return m6194c(StringUtils.SHA1);
    }

    public /* synthetic */ int compareTo(Object obj) {
        C2272f c2272f = (C2272f) obj;
        int g = mo2050g();
        int g2 = c2272f.mo2050g();
        int min = Math.min(g, g2);
        int i = 0;
        while (i < min) {
            int a = mo2038a(i) & 255;
            int a2 = c2272f.mo2038a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            } else {
                i++;
            }
        }
        return g == g2 ? 0 : g < g2 ? -1 : 1;
    }

    public C2272f mo2046d() {
        return m6194c("SHA-256");
    }

    public String mo2047e() {
        int i = 0;
        char[] cArr = new char[(this.f7558c.length * 2)];
        byte[] bArr = this.f7558c;
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            cArr[i2] = f7556a[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = f7556a[b & 15];
            i++;
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2272f) {
            C2272f c2272f = (C2272f) obj;
            return c2272f.mo2050g() == this.f7558c.length && c2272f.mo2043a(0, this.f7558c, 0, this.f7558c.length);
        }
    }

    public C2272f mo2049f() {
        int i = 0;
        while (i < this.f7558c.length) {
            byte b = this.f7558c[i];
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                byte[] bArr = (byte[]) this.f7558c.clone();
                bArr[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b2 = bArr[i2];
                    if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                        bArr[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2272f(bArr);
            }
        }
        return this;
    }

    public int mo2050g() {
        return this.f7558c.length;
    }

    public byte[] mo2051h() {
        return (byte[]) this.f7558c.clone();
    }

    public int hashCode() {
        int i = this.f7559d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.f7558c);
        this.f7559d = i;
        return i;
    }

    public String toString() {
        if (this.f7558c.length == 0) {
            return "[size=0]";
        }
        String replace;
        StringBuilder stringBuilder;
        String a = mo2040a();
        int length = a.length();
        int i = 0;
        int i2 = i;
        while (i < length) {
            if (i2 != 64) {
                int codePointAt = a.codePointAt(i);
                if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                    i = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        i = a.length();
        if (i != -1) {
            replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                stringBuilder = new StringBuilder("[size=");
                stringBuilder.append(this.f7558c.length);
                stringBuilder.append(" text=");
                stringBuilder.append(replace);
                replace = "…]";
                stringBuilder.append(replace);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder("[text=");
        } else if (this.f7558c.length <= 64) {
            stringBuilder = new StringBuilder("[hex=");
            replace = mo2047e();
        } else {
            stringBuilder = new StringBuilder("[size=");
            stringBuilder.append(this.f7558c.length);
            stringBuilder.append(" hex=");
            replace = mo2039a(0, 64).mo2047e();
            stringBuilder.append(replace);
            replace = "…]";
            stringBuilder.append(replace);
            return stringBuilder.toString();
        }
        stringBuilder.append(replace);
        replace = "]";
        stringBuilder.append(replace);
        return stringBuilder.toString();
    }
}
