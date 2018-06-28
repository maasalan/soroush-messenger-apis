package p050b.p051a;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Map;

public final class at extends C0814d {

    private static class C0799d {
        int f2411a;

        private C0799d() {
            this.f2411a = 0;
        }
    }

    public static abstract class C0800g {
    }

    public static class C0801h {
        C4935f f2412a;
        char f2413b;

        public C0801h() {
            this(null, '*');
        }

        C0801h(C4935f c4935f, char c) {
            this.f2412a = c4935f;
            this.f2413b = c;
        }

        public final String toString() {
            if (this.f2413b == '*') {
                return "?";
            }
            String obj = this.f2412a.toString();
            if (this.f2413b == ' ') {
                return obj;
            }
            StringBuilder stringBuilder = this.f2413b == '+' ? new StringBuilder("? extends ") : new StringBuilder("? super ");
            stringBuilder.append(obj);
            return stringBuilder.toString();
        }
    }

    public static class C4934b extends C0800g {
        char f13747a;

        C4934b(char c) {
            this.f13747a = c;
        }

        public final String toString() {
            return C0828s.m1903b(Character.toString(this.f13747a));
        }
    }

    public static abstract class C4935f extends C0800g {
    }

    public static class C6403a extends C4935f {
        int f17548a;
        C0800g f17549b;

        public C6403a(int i, C0800g c0800g) {
            this.f17548a = i;
            this.f17549b = c0800g;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer(this.f17549b.toString());
            for (int i = 0; i < this.f17548a; i++) {
                stringBuffer.append("[]");
            }
            return stringBuffer.toString();
        }
    }

    public static class C6404c extends C4935f {
        public static C6404c f17550c = new C6404c("java.lang.Object");
        String f17551a;
        C0801h[] f17552b;

        private C6404c(String str) {
            this.f17551a = str;
            this.f17552b = null;
        }

        C6404c(String str, int i, int i2, C0801h[] c0801hArr) {
            this.f17551a = str.substring(i, i2).replace('/', '.');
            this.f17552b = c0801hArr;
        }

        static C6404c m15165a(String str, int i, int i2, C0801h[] c0801hArr, C6404c c6404c) {
            return c6404c == null ? new C6404c(str, i, i2, c0801hArr) : new C7027e(str, i, i2, c0801hArr, c6404c);
        }

        public C6404c mo3311a() {
            return null;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            C6404c a = mo3311a();
            if (a != null) {
                stringBuffer.append(a.toString());
                stringBuffer.append('.');
            }
            stringBuffer.append(this.f17551a);
            if (this.f17552b != null) {
                stringBuffer.append('<');
                int length = this.f17552b.length;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        stringBuffer.append(", ");
                    }
                    stringBuffer.append(this.f17552b[i].toString());
                }
                stringBuffer.append('>');
            }
            return stringBuffer.toString();
        }
    }

    public static class C6405i extends C4935f {
        String f17553a;

        C6405i(String str, int i, int i2) {
            this.f17553a = str.substring(i, i2);
        }

        public final String toString() {
            return this.f17553a;
        }
    }

    public static class C7027e extends C6404c {
        C6404c f20042d;

        C7027e(String str, int i, int i2, C0801h[] c0801hArr, C6404c c6404c) {
            super(str, i, i2, c0801hArr);
            this.f20042d = c6404c;
        }

        public final C6404c mo3311a() {
            return this.f20042d;
        }
    }

    at(C0827p c0827p, int i, DataInputStream dataInputStream) {
        super(c0827p, i, dataInputStream);
    }

    private at(C0827p c0827p, String str) {
        super(c0827p, "Signature");
        int c = c0827p.m1883c(str);
        mo875a(new byte[]{(byte) (c >>> 8), (byte) c});
    }

    private static C4935f m9578a(String str, C0799d c0799d, boolean z) {
        int i = c0799d.f2411a;
        char charAt = str.charAt(i);
        int i2;
        if (charAt == 'L') {
            C6404c c6404c = null;
            while (true) {
                int i3;
                char charAt2;
                C0801h[] c0801hArr;
                i = c0799d.f2411a + 1;
                c0799d.f2411a = i;
                do {
                    i2 = c0799d.f2411a;
                    c0799d.f2411a = i2 + 1;
                    charAt = str.charAt(i2);
                    if (charAt == '$' || charAt == '<') {
                        i3 = c0799d.f2411a - 1;
                    }
                } while (charAt != ';');
                i3 = c0799d.f2411a - 1;
                if (charAt == '<') {
                    int i4;
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i4 = c0799d.f2411a;
                        c0799d.f2411a = i4 + 1;
                        charAt2 = str.charAt(i4);
                        if (charAt2 == '>') {
                            break;
                        }
                        Object c0801h;
                        if (charAt2 == '*') {
                            c0801h = new C0801h(null, '*');
                        } else {
                            if (!(charAt2 == '+' || charAt2 == '-')) {
                                charAt2 = ' ';
                                c0799d.f2411a--;
                            }
                            c0801h = new C0801h(at.m9578a(str, c0799d, false), charAt2);
                        }
                        arrayList.add(c0801h);
                    }
                    c0801hArr = (C0801h[]) arrayList.toArray(new C0801h[arrayList.size()]);
                    i4 = c0799d.f2411a;
                    c0799d.f2411a = i4 + 1;
                    charAt2 = str.charAt(i4);
                } else {
                    charAt2 = charAt;
                    c0801hArr = null;
                }
                c6404c = C6404c.m15165a(str, i, i3, c0801hArr, c6404c);
                if (charAt2 != '$') {
                    if (charAt2 != '.') {
                        return c6404c;
                    }
                }
                c0799d.f2411a--;
            }
        } else if (charAt == 'T') {
            r12 = str.indexOf(59, c0799d.f2411a);
            if (r12 < 0) {
                throw at.m9581b(str);
            }
            c0799d.f2411a = r12 + 1;
            return new C6405i(str, i + 1, r12);
        } else if (charAt == '[') {
            r12 = 1;
            while (true) {
                i2 = c0799d.f2411a + 1;
                c0799d.f2411a = i2;
                if (str.charAt(i2) != '[') {
                    return new C6403a(r12, at.m9580a(str, c0799d));
                }
                r12++;
            }
        } else if (z) {
            return null;
        } else {
            throw at.m9581b(str);
        }
    }

    public static p050b.p051a.at.C0800g m9579a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new b.a.at$d;	 Catch:{ IndexOutOfBoundsException -> 0x000b }
        r1 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x000b }
        r0.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x000b }
        r0 = p050b.p051a.at.m9580a(r2, r0);	 Catch:{ IndexOutOfBoundsException -> 0x000b }
        return r0;
    L_0x000b:
        r2 = p050b.p051a.at.m9581b(r2);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.at.a(java.lang.String):b.a.at$g");
    }

    private static C0800g m9580a(String str, C0799d c0799d) {
        C0800g a = at.m9578a(str, c0799d, true);
        if (a != null) {
            return a;
        }
        int i = c0799d.f2411a;
        c0799d.f2411a = i + 1;
        return new C4934b(str.charAt(i));
    }

    private static C0815e m9581b(String str) {
        StringBuilder stringBuilder = new StringBuilder("bad signature: ");
        stringBuilder.append(str);
        return new C0815e(stringBuilder.toString());
    }

    public final C0814d mo834a(C0827p c0827p, Map map) {
        return new at(c0827p, m1829b().m1892j(C0817g.m1832a(mo877d(), 0)));
    }
}
