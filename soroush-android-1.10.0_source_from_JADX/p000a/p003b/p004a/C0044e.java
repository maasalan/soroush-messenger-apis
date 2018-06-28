package p000a.p003b.p004a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.msgpack.util.TemplatePrecompiler;
import p000a.p003b.p004a.C0060h.C4651a;
import p000a.p003b.p004a.C0060h.C4652b;
import p000a.p003b.p004a.p012g.C0053c;

public class C0044e implements Serializable, CharSequence, Comparable<C0044e> {
    public static final C0044e f180a = new C0044e("", false);
    public static final C0044e f181b = new C0044e(TemplatePrecompiler.DEFAULT_DEST, false);
    public static boolean f182c = true;
    static final /* synthetic */ boolean f183g = true;
    public final String f184d;
    public transient String f185e;
    public transient String f186f;
    private transient byte[] f187h;
    private transient String[] f188i;
    private transient int f189j;
    private int f190k;

    private C0044e(String str) {
        this(str, false);
    }

    private C0044e(String str, boolean z) {
        this.f190k = -1;
        this.f184d = z ? C0053c.m98a(str) : str.toLowerCase(Locale.US);
        if (f182c) {
            m75e();
            if (this.f187h.length > 255) {
                throw new C4651a(str, this.f187h);
            }
            m76f();
            for (String str2 : this.f188i) {
                if (str2.length() > 63) {
                    throw new C4652b(str, str2);
                }
            }
        }
    }

    private C0044e(String[] strArr) {
        this.f190k = -1;
        this.f188i = strArr;
        int i = 0;
        int i2 = 0;
        while (i < strArr.length) {
            i2 += strArr[i].length() + 1;
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i2);
        for (int length = strArr.length - 1; length >= 0; length--) {
            stringBuilder.append(strArr[length]);
            stringBuilder.append('.');
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        this.f184d = stringBuilder.toString();
    }

    public static C0044e m70a(C0044e c0044e, C0044e c0044e2) {
        c0044e.m76f();
        c0044e2.m76f();
        String[] strArr = new String[(c0044e.f188i.length + c0044e2.f188i.length)];
        System.arraycopy(c0044e2.f188i, 0, strArr, 0, c0044e2.f188i.length);
        System.arraycopy(c0044e.f188i, 0, strArr, c0044e2.f188i.length, c0044e.f188i.length);
        return new C0044e(strArr);
    }

    public static C0044e m71a(DataInputStream dataInputStream, byte[] bArr) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            readUnsignedByte = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte));
            return C0044e.m74a(bArr, readUnsignedByte, hashSet);
        } else if (readUnsignedByte == 0) {
            return f180a;
        } else {
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            String b = C0053c.m99b(new String(bArr2));
            C0044e a = C0044e.m71a(dataInputStream, bArr);
            if (a.length() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b);
                stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                stringBuilder.append(a);
                b = stringBuilder.toString();
            }
            return new C0044e(b);
        }
    }

    public static C0044e m72a(CharSequence charSequence) {
        return C0044e.m73a(charSequence.toString());
    }

    public static C0044e m73a(String str) {
        return new C0044e(str, true);
    }

    private static C0044e m74a(byte[] bArr, int i, HashSet<Integer> hashSet) {
        while (true) {
            int i2 = bArr[i] & 255;
            if ((i2 & 192) != 192) {
                break;
            }
            i = (bArr[i + 1] & 255) + ((i2 & 63) << 8);
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new IllegalStateException("Cyclic offsets detected.");
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (i2 == 0) {
            return f180a;
        }
        i++;
        String str = new String(bArr, i, i2);
        C0044e a = C0044e.m74a(bArr, i + i2, hashSet);
        if (a.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            stringBuilder.append(a);
            str = stringBuilder.toString();
        }
        return new C0044e(str);
    }

    private void m75e() {
        if (this.f187h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
            m76f();
            for (int length = this.f188i.length - 1; length >= 0; length--) {
                byte[] bytes = this.f188i[length].getBytes();
                byteArrayOutputStream.write(bytes.length);
                byteArrayOutputStream.write(bytes, 0, bytes.length);
            }
            byteArrayOutputStream.write(0);
            if (f183g || byteArrayOutputStream.size() <= 255) {
                this.f187h = byteArrayOutputStream.toByteArray();
                return;
            }
            throw new AssertionError();
        }
    }

    private void m76f() {
        if (this.f188i == null) {
            int i = 0;
            if (m84d()) {
                this.f188i = new String[0];
                return;
            }
            this.f188i = this.f184d.split("[.。．｡]", 128);
            while (i < this.f188i.length / 2) {
                String str = this.f188i[i];
                int length = (this.f188i.length - i) - 1;
                this.f188i[i] = this.f188i[length];
                this.f188i[length] = str;
                i++;
            }
        }
    }

    public final int m77a(C0044e c0044e) {
        return this.f184d.compareTo(c0044e.f184d);
    }

    public final C0044e m78a(int i) {
        m76f();
        if (i > this.f188i.length) {
            throw new IllegalArgumentException();
        } else if (i == this.f188i.length) {
            return this;
        } else {
            if (i == 0) {
                return f180a;
            }
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = this.f188i[i2];
            }
            return new C0044e(strArr);
        }
    }

    public final void m79a(OutputStream outputStream) {
        m75e();
        outputStream.write(this.f187h);
    }

    public final byte[] m80a() {
        m75e();
        return (byte[]) this.f187h.clone();
    }

    public final int m81b() {
        if (this.f190k < 0) {
            this.f190k = m84d() ? 1 : this.f184d.length() + 2;
        }
        return this.f190k;
    }

    public final boolean m82b(C0044e c0044e) {
        m76f();
        c0044e.m76f();
        if (this.f188i.length < c0044e.f188i.length) {
            return false;
        }
        for (int i = 0; i < c0044e.f188i.length; i++) {
            if (!this.f188i[i].equals(c0044e.f188i[i])) {
                return false;
            }
        }
        return true;
    }

    public final int m83c() {
        m76f();
        return this.f188i.length;
    }

    public char charAt(int i) {
        return this.f184d.charAt(i);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m77a((C0044e) obj);
    }

    public final boolean m84d() {
        if (!this.f184d.isEmpty()) {
            if (!this.f184d.equals(TemplatePrecompiler.DEFAULT_DEST)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0044e)) {
            return false;
        }
        C0044e c0044e = (C0044e) obj;
        m75e();
        c0044e.m75e();
        return Arrays.equals(this.f187h, c0044e.f187h);
    }

    public int hashCode() {
        if (this.f189j == 0 && !m84d()) {
            m75e();
            this.f189j = Arrays.hashCode(this.f187h);
        }
        return this.f189j;
    }

    public int length() {
        return this.f184d.length();
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f184d.subSequence(i, i2);
    }

    public String toString() {
        return this.f184d;
    }
}
