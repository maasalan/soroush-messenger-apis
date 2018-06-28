package p050b.p051a;

import java.util.Map;
import p050b.C0848e;
import p050b.C0851i;

public final class C0828s {
    private static int m1894a(C0848e c0848e, String str, int i, C0851i[] c0851iArr, int i2) {
        int i3;
        char charAt = str.charAt(i);
        int i4 = 0;
        while (charAt == '[') {
            i4++;
            i++;
            charAt = str.charAt(i);
        }
        if (charAt == 'L') {
            i++;
            int indexOf = str.indexOf(59, i);
            i3 = indexOf + 1;
            str = str.substring(i, indexOf).replace('/', '.');
        } else {
            C0851i c0851i = null;
            if (charAt == 'F') {
                c0851i = C0851i.f2542j;
            } else if (charAt == 'S') {
                c0851i = C0851i.f2539g;
            } else if (charAt == 'V') {
                c0851i = C0851i.f2544l;
            } else if (charAt != 'Z') {
                switch (charAt) {
                    case 'B':
                        c0851i = C0851i.f2538f;
                        break;
                    case 'C':
                        c0851i = C0851i.f2537e;
                        break;
                    case 'D':
                        c0851i = C0851i.f2543k;
                        break;
                    default:
                        switch (charAt) {
                            case 'I':
                                c0851i = C0851i.f2540h;
                                break;
                            case 'J':
                                c0851i = C0851i.f2541i;
                                break;
                            default:
                                break;
                        }
                }
            } else {
                c0851i = C0851i.f2536d;
            }
            if (c0851i == null) {
                return -1;
            }
            i3 = i + 1;
            if (i4 == 0) {
                c0851iArr[i2] = c0851i;
                return i3;
            }
            str = c0851i.m1999m();
        }
        if (i4 > 0) {
            StringBuffer stringBuffer = new StringBuffer(str);
            while (true) {
                int i5 = i4 - 1;
                if (i4 > 0) {
                    stringBuffer.append("[]");
                    i4 = i5;
                } else {
                    str = stringBuffer.toString();
                }
            }
        }
        c0851iArr[i2] = c0848e.m1965a(str);
        return i3;
    }

    public static String m1895a(C0851i c0851i) {
        return c0851i.mo913b() ? C0828s.m1902b(c0851i) : C0828s.m1897a(c0851i.m1999m());
    }

    public static String m1896a(C0851i c0851i, C0851i[] c0851iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        if (c0851iArr != null) {
            for (C0851i a : c0851iArr) {
                C0828s.m1899a(stringBuffer, a);
            }
        }
        stringBuffer.append(')');
        if (c0851i != null) {
            C0828s.m1899a(stringBuffer, c0851i);
        }
        return stringBuffer.toString();
    }

    public static String m1897a(String str) {
        return str.replace('.', '/');
    }

    public static String m1898a(String str, Map map) {
        if (map == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        while (true) {
            i = str.indexOf(76, i);
            if (i < 0) {
                break;
            }
            int indexOf = str.indexOf(59, i);
            if (indexOf < 0) {
                break;
            }
            int i3 = indexOf + 1;
            String str2 = (String) map.get(str.substring(i + 1, indexOf));
            if (str2 != null) {
                stringBuffer.append(str.substring(i2, i));
                stringBuffer.append('L');
                stringBuffer.append(str2);
                stringBuffer.append(';');
                i2 = i3;
            }
            i = i3;
        }
        if (i2 == 0) {
            return str;
        }
        int length = str.length();
        if (i2 < length) {
            stringBuffer.append(str.substring(i2, length));
        }
        return stringBuffer.toString();
    }

    private static void m1899a(java.lang.StringBuffer r3, p050b.C0851i r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r4.mo913b();
        r1 = 59;
        r2 = 76;
        if (r0 == 0) goto L_0x0034;
    L_0x000a:
        r0 = 91;
        r3.append(r0);
        r0 = r4.mo916e();	 Catch:{ w -> 0x0017 }
        p050b.p051a.C0828s.m1899a(r3, r0);	 Catch:{ w -> 0x0017 }
        return;
    L_0x0017:
        r3.append(r2);
        r4 = r4.m1999m();
        r0 = 0;
        r2 = r4.length();
        r2 = r2 + -2;
        r4 = r4.substring(r0, r2);
        r4 = p050b.p051a.C0828s.m1897a(r4);
        r3.append(r4);
        r3.append(r1);
        return;
    L_0x0034:
        r0 = r4.mo943l();
        if (r0 == 0) goto L_0x0042;
    L_0x003a:
        r4 = (p050b.C4993s) r4;
        r4 = r4.f13896a;
        r3.append(r4);
        return;
    L_0x0042:
        r3.append(r2);
        r4 = r4.m1999m();
        r0 = 46;
        r2 = 47;
        r4 = r4.replace(r0, r2);
        r3.append(r4);
        r3.append(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.s.a(java.lang.StringBuffer, b.i):void");
    }

    public static C0851i[] m1900a(String str, C0848e c0848e) {
        int i = 0;
        if (str.charAt(0) != '(') {
            return null;
        }
        C0851i[] c0851iArr = new C0851i[C0828s.m1904c(str)];
        int i2 = 1;
        while (true) {
            int i3 = i + 1;
            i2 = C0828s.m1894a(c0848e, str, i2, c0851iArr, i);
            if (i2 <= 0) {
                return c0851iArr;
            }
            i = i3;
        }
    }

    public static C0851i m1901b(String str, C0848e c0848e) {
        int indexOf = str.indexOf(41);
        if (indexOf < 0) {
            return null;
        }
        C0851i[] c0851iArr = new C0851i[1];
        C0828s.m1894a(c0848e, str, indexOf + 1, c0851iArr, 0);
        return c0851iArr[0];
    }

    public static String m1902b(C0851i c0851i) {
        StringBuffer stringBuffer = new StringBuffer();
        C0828s.m1899a(stringBuffer, c0851i);
        return stringBuffer.toString();
    }

    public static String m1903b(String str) {
        String replace;
        int i = 0;
        char charAt = str.charAt(0);
        int i2 = 0;
        while (charAt == '[') {
            i++;
            i2++;
            charAt = str.charAt(i2);
        }
        if (charAt == 'L') {
            int i3 = i2 + 1;
            i2 = str.indexOf(59, i2);
            replace = str.substring(i3, i2).replace('/', '.');
        } else if (charAt == 'V') {
            replace = "void";
        } else if (charAt == 'I') {
            replace = "int";
        } else if (charAt == 'B') {
            replace = "byte";
        } else if (charAt == 'J') {
            replace = "long";
        } else if (charAt == 'D') {
            replace = "double";
        } else if (charAt == 'F') {
            replace = "float";
        } else if (charAt == 'C') {
            replace = "char";
        } else if (charAt == 'S') {
            replace = "short";
        } else if (charAt == 'Z') {
            replace = "boolean";
        } else {
            StringBuilder stringBuilder = new StringBuilder("bad descriptor: ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString());
        }
        if (i2 + 1 != str.length()) {
            stringBuilder = new StringBuilder("multiple descriptors?: ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString());
        } else if (i == 0) {
            return replace;
        } else {
            StringBuffer stringBuffer = new StringBuffer(replace);
            do {
                stringBuffer.append("[]");
                i--;
            } while (i > 0);
            return stringBuffer.toString();
        }
    }

    public static int m1904c(String str) {
        int i = 0;
        int i2 = 1;
        while (true) {
            char charAt = str.charAt(i2);
            if (charAt == ')') {
                return i;
            }
            while (charAt == '[') {
                i2++;
                charAt = str.charAt(i2);
            }
            if (charAt == 'L') {
                i2 = str.indexOf(59, i2) + 1;
                if (i2 <= 0) {
                    throw new IndexOutOfBoundsException("bad descriptor");
                }
            } else {
                i2++;
            }
            i++;
        }
    }

    public static C0851i m1905c(String str, C0848e c0848e) {
        C0851i[] c0851iArr = new C0851i[1];
        return C0828s.m1894a(c0848e, str, 0, c0851iArr, 0) >= 0 ? c0851iArr[0] : c0848e.m1965a(str.replace('/', '.'));
    }

    public static int m1906d(String str) {
        int i = 0;
        char charAt = str.charAt(0);
        if (charAt == '(') {
            int i2 = 0;
            int i3 = 1;
            while (true) {
                char charAt2 = str.charAt(i3);
                if (charAt2 == ')') {
                    break;
                }
                int i4 = 0;
                while (charAt2 == '[') {
                    i3++;
                    charAt2 = str.charAt(i3);
                    i4 = 1;
                }
                if (charAt2 == 'L') {
                    i3 = str.indexOf(59, i3) + 1;
                    if (i3 <= 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                }
                i3++;
                i2 = (i4 == 0 && (charAt2 == 'J' || charAt2 == 'D')) ? i2 - 2 : i2 - 1;
            }
            charAt = str.charAt(i3 + 1);
            i = i2;
        }
        if (charAt != 'J') {
            if (charAt != 'D') {
                if (charAt != 'V') {
                    return i + 1;
                }
                return i;
            }
        }
        i += 2;
        return i;
    }
}
