package p050b;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.msgpack.util.TemplatePrecompiler;
import p050b.p051a.C0819j;
import p050b.p054b.C0835a;

public abstract class C0851i {
    public static String f2535c;
    public static C0851i f2536d = new C4993s("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 172, 4, 1);
    public static C0851i f2537e = new C4993s("char", 'C', "java.lang.Character", "charValue", "()C", 172, 5, 1);
    public static C0851i f2538f = new C4993s("byte", 'B', "java.lang.Byte", "byteValue", "()B", 172, 8, 1);
    public static C0851i f2539g = new C4993s("short", 'S', "java.lang.Short", "shortValue", "()S", 172, 9, 1);
    public static C0851i f2540h = new C4993s("int", 'I', "java.lang.Integer", "intValue", "()I", 172, 10, 1);
    public static C0851i f2541i = new C4993s("long", 'J', "java.lang.Long", "longValue", "()J", 173, 11, 2);
    public static C0851i f2542j = new C4993s("float", 'F', "java.lang.Float", "floatValue", "()F", 174, 6, 1);
    public static C0851i f2543k = new C4993s("double", 'D', "java.lang.Double", "doubleValue", "()D", 175, 7, 2);
    public static C0851i f2544l = new C4993s("void", 'V', "java.lang.Void", null, null, 177, 0, 0);
    static C0851i[] f2545m = new C0851i[9];
    protected String f2546b;

    static class C0850a extends OutputStream {
        private FileOutputStream f2533a = null;
        private String f2534b;

        C0850a(String str) {
            this.f2534b = str;
        }

        private void m1974a() {
            if (this.f2533a == null) {
                this.f2533a = new FileOutputStream(this.f2534b);
            }
        }

        public final void close() {
            m1974a();
            this.f2533a.close();
        }

        public final void flush() {
            m1974a();
            this.f2533a.flush();
        }

        public final void write(int i) {
            m1974a();
            this.f2533a.write(i);
        }

        public final void write(byte[] bArr) {
            m1974a();
            this.f2533a.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            m1974a();
            this.f2533a.write(bArr, i, i2);
        }
    }

    static {
        f2545m[0] = f2536d;
        f2545m[1] = f2537e;
        f2545m[2] = f2538f;
        f2545m[3] = f2539g;
        f2545m[4] = f2540h;
        f2545m[5] = f2541i;
        f2545m[6] = f2542j;
        f2545m[7] = f2543k;
        f2545m[8] = f2544l;
    }

    protected C0851i(String str) {
        this.f2546b = str;
    }

    public C0848e mo911a() {
        return null;
    }

    public C4990l mo921a(String str) {
        throw new C0858w(str);
    }

    C4990l mo922a(String str, String str2) {
        return null;
    }

    public void mo923a(int i) {
        mo933k();
    }

    public void mo924a(C6430k c6430k) {
        mo933k();
    }

    public void mo925a(C6431n c6431n) {
        mo933k();
    }

    public void mo926a(DataOutputStream dataOutputStream) {
        throw new C0832a("not a class");
    }

    protected void mo927a(StringBuffer stringBuffer) {
        stringBuffer.append(this.f2546b);
    }

    public boolean mo912a(C0851i c0851i) {
        if (this != c0851i) {
            if (!this.f2546b.equals(c0851i.f2546b)) {
                return false;
            }
        }
        return true;
    }

    public void mo928b(C0851i c0851i) {
        mo933k();
    }

    public final void m1985b(String str) {
        DataOutputStream c = m1988c(str);
        try {
            mo926a(c);
        } finally {
            c.close();
        }
    }

    public boolean mo913b() {
        return false;
    }

    public int mo914c() {
        return 0;
    }

    protected final DataOutputStream m1988c(String str) {
        String str2 = this.f2546b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separatorChar);
        stringBuilder.append(str2.replace('.', File.separatorChar));
        stringBuilder.append(".class");
        str = stringBuilder.toString();
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf > 0) {
            str2 = str.substring(0, lastIndexOf);
            if (!str2.equals(TemplatePrecompiler.DEFAULT_DEST)) {
                new File(str2).mkdirs();
            }
        }
        return new DataOutputStream(new BufferedOutputStream(new C0850a(str)));
    }

    public void mo929c(C0851i c0851i) {
        mo933k();
    }

    public C0851i[] mo915d() {
        return new C0851i[0];
    }

    public C0851i mo916e() {
        return null;
    }

    public C0851i mo917f() {
        return null;
    }

    public final C0819j m1993g() {
        mo933k();
        return mo930h();
    }

    public C0819j mo930h() {
        return null;
    }

    public C0835a mo931i() {
        return null;
    }

    public boolean mo932j() {
        return true;
    }

    void mo933k() {
        if (mo932j()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f2546b);
            stringBuilder.append(" class is frozen");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean mo943l() {
        return false;
    }

    public final String m1999m() {
        return this.f2546b;
    }

    public final String m2000n() {
        String str = this.f2546b;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public final String m2001o() {
        String str = this.f2546b;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? null : str.substring(0, lastIndexOf);
    }

    public boolean mo934p() {
        return false;
    }

    public C0851i mo935q() {
        return null;
    }

    public C6430k[] mo936r() {
        return new C6430k[0];
    }

    void mo937s() {
    }

    public void mo938t() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(hashCode()));
        stringBuffer.append("[");
        mo927a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public final byte[] m2007u() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            mo926a(dataOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
            dataOutputStream.close();
        }
    }

    void mo939v() {
    }
}
