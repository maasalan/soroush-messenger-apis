package p050b;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

final class C0849f {
    protected C0846d f2532a = null;

    public final synchronized C0845c m1971a(C0845c c0845c) {
        C0846d c0846d = new C0846d(c0845c);
        C0846d c0846d2 = this.f2532a;
        if (c0846d2 == null) {
            this.f2532a = c0846d;
        } else {
            while (c0846d2.f2517a != null) {
                c0846d2 = c0846d2.f2517a;
            }
            c0846d2.f2517a = c0846d;
        }
        return c0845c;
    }

    final InputStream m1972a(String str) {
        InputStream inputStream = null;
        InputStream inputStream2 = inputStream;
        for (C0846d c0846d = this.f2532a; c0846d != null; c0846d = c0846d.f2517a) {
            try {
                inputStream2 = c0846d.f2518b.mo909a(str);
            } catch (C0858w e) {
                if (inputStream == null) {
                    inputStream = e;
                }
            }
            if (inputStream2 != null) {
                return inputStream2;
            }
        }
        if (inputStream == null) {
            return null;
        }
        throw inputStream;
    }

    public final URL m1973b(String str) {
        for (C0846d c0846d = this.f2532a; c0846d != null; c0846d = c0846d.f2517a) {
            URL b = c0846d.f2518b.mo910b(str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[class path: ");
        for (C0846d c0846d = this.f2532a; c0846d != null; c0846d = c0846d.f2517a) {
            stringBuffer.append(c0846d.f2518b.toString());
            stringBuffer.append(File.pathSeparatorChar);
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
