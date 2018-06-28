package com.google.p173d.p180c.p181a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1967c;
import com.google.p173d.p177b.C1969e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class C1979c {
    private static final char[] f6651a = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] f6652b = new char[]{'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
    private static final char[] f6653c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] f6654d = f6652b;
    private static final char[] f6655e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', ''};

    static /* synthetic */ class C19771 {
        static final /* synthetic */ int[] f6642a = new int[C1978a.m5438a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = com.google.p173d.p180c.p181a.C1979c.C1978a.m5438a();
            r0 = r0.length;
            r0 = new int[r0];
            f6642a = r0;
            r0 = 1;
            r1 = f6642a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.google.p173d.p180c.p181a.C1979c.C1978a.f6645c;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f6642a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.google.p173d.p180c.p181a.C1979c.C1978a.f6646d;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f6642a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = com.google.p173d.p180c.p181a.C1979c.C1978a.f6647e;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f6642a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = com.google.p173d.p180c.p181a.C1979c.C1978a.f6648f;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f6642a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = com.google.p173d.p180c.p181a.C1979c.C1978a.f6649g;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.a.c.1.<clinit>():void");
        }
    }

    private enum C1978a {
        ;
        
        public static final int f6643a = 1;
        public static final int f6644b = 2;
        public static final int f6645c = 3;
        public static final int f6646d = 4;
        public static final int f6647e = 5;
        public static final int f6648f = 6;
        public static final int f6649g = 7;

        static {
            f6650h = new int[]{f6643a, f6644b, f6645c, f6646d, f6647e, f6648f, f6649g};
        }

        public static int[] m5438a() {
            return (int[]) f6650h.clone();
        }
    }

    private static int m5439a(int i, int i2) {
        i -= ((i2 * 149) % 255) + 1;
        return i >= 0 ? i : i + 256;
    }

    private static int m5440a(C1967c c1967c, StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        int i = 0;
        do {
            int a = c1967c.m5424a(8);
            if (a == 0) {
                throw C5615f.m12347a();
            } else if (a <= 128) {
                if (i != 0) {
                    a += 128;
                }
                stringBuilder.append((char) (a - 1));
                return C1978a.f6644b;
            } else if (a == 129) {
                return C1978a.f6643a;
            } else {
                if (a <= 229) {
                    a -= 130;
                    if (a < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(a);
                } else if (a == 230) {
                    return C1978a.f6645c;
                } else {
                    if (a == 231) {
                        return C1978a.f6649g;
                    }
                    if (a == 232) {
                        stringBuilder.append('\u001d');
                    } else if (!(a == 233 || a == 234)) {
                        if (a == 235) {
                            i = 1;
                        } else {
                            String str;
                            if (a == 236) {
                                str = "[)>\u001e05\u001d";
                            } else if (a == 237) {
                                str = "[)>\u001e06\u001d";
                            } else if (a == 238) {
                                return C1978a.f6647e;
                            } else {
                                if (a == 239) {
                                    return C1978a.f6646d;
                                }
                                if (a == 240) {
                                    return C1978a.f6648f;
                                }
                                if (!(a == 241 || a < 242 || (a == 254 && c1967c.m5423a() == 0))) {
                                    throw C5615f.m12347a();
                                }
                            }
                            stringBuilder.append(str);
                            stringBuilder2.insert(0, "\u001e\u0004");
                        }
                    }
                }
            }
        } while (c1967c.m5423a() > 0);
        return C1978a.f6644b;
    }

    static C1969e m5441a(byte[] bArr) {
        String stringBuilder;
        C1967c c1967c = new C1967c(bArr);
        StringBuilder stringBuilder2 = new StringBuilder(100);
        StringBuilder stringBuilder3 = new StringBuilder(0);
        List arrayList = new ArrayList(1);
        int i = C1978a.f6644b;
        do {
            if (i == C1978a.f6644b) {
                i = C1979c.m5440a(c1967c, stringBuilder2, stringBuilder3);
            } else {
                switch (C19771.f6642a[i - 1]) {
                    case 1:
                        C1979c.m5443a(c1967c, stringBuilder2);
                        break;
                    case 2:
                        C1979c.m5445b(c1967c, stringBuilder2);
                        break;
                    case 3:
                        C1979c.m5446c(c1967c, stringBuilder2);
                        break;
                    case 4:
                        C1979c.m5447d(c1967c, stringBuilder2);
                        break;
                    case 5:
                        C1979c.m5444a(c1967c, stringBuilder2, (Collection) arrayList);
                        break;
                    default:
                        throw C5615f.m12347a();
                }
                i = C1978a.f6644b;
            }
            if (i != C1978a.f6643a) {
            }
            if (stringBuilder3.length() > 0) {
                stringBuilder2.append(stringBuilder3);
            }
            stringBuilder = stringBuilder2.toString();
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new C1969e(bArr, stringBuilder, arrayList, null);
        } while (c1967c.m5423a() > 0);
        if (stringBuilder3.length() > 0) {
            stringBuilder2.append(stringBuilder3);
        }
        stringBuilder = stringBuilder2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C1969e(bArr, stringBuilder, arrayList, null);
    }

    private static void m5442a(int i, int i2, int[] iArr) {
        i = ((i << 8) + i2) - 1;
        int i3 = i / 1600;
        iArr[0] = i3;
        i -= i3 * 1600;
        i3 = i / 40;
        iArr[1] = i3;
        iArr[2] = i - (i3 * 40);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5443a(com.google.p173d.p177b.C1967c r8, java.lang.StringBuilder r9) {
        /*
        r0 = 3;
        r1 = new int[r0];
        r2 = 0;
        r3 = r2;
        r4 = r3;
    L_0x0006:
        r5 = r8.m5423a();
        r6 = 8;
        if (r5 != r6) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = r8.m5424a(r6);
        r7 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r5 != r7) goto L_0x0018;
    L_0x0017:
        return;
    L_0x0018:
        r6 = r8.m5424a(r6);
        com.google.p173d.p180c.p181a.C1979c.m5442a(r5, r6, r1);
        r5 = r3;
        r3 = r2;
    L_0x0021:
        if (r3 >= r0) goto L_0x0094;
    L_0x0023:
        r6 = r1[r3];
        switch(r4) {
            case 0: goto L_0x0071;
            case 1: goto L_0x006a;
            case 2: goto L_0x003e;
            case 3: goto L_0x002d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x002d:
        if (r5 == 0) goto L_0x0037;
    L_0x002f:
        r6 = r6 + 224;
    L_0x0031:
        r4 = (char) r6;
        r9.append(r4);
        r5 = r2;
        goto L_0x006f;
    L_0x0037:
        r6 = r6 + 96;
    L_0x0039:
        r4 = (char) r6;
        r9.append(r4);
        goto L_0x006f;
    L_0x003e:
        r4 = f6652b;
        r4 = r4.length;
        if (r6 >= r4) goto L_0x0055;
    L_0x0043:
        r4 = f6652b;
        r4 = r4[r6];
        if (r5 == 0) goto L_0x0051;
    L_0x0049:
        r4 = r4 + 128;
        r4 = (char) r4;
        r9.append(r4);
        r4 = r2;
        goto L_0x0063;
    L_0x0051:
        r9.append(r4);
        goto L_0x005c;
    L_0x0055:
        r4 = 27;
        if (r6 != r4) goto L_0x005e;
    L_0x0059:
        r4 = 29;
        goto L_0x0051;
    L_0x005c:
        r4 = r5;
        goto L_0x0063;
    L_0x005e:
        r4 = 30;
        if (r6 != r4) goto L_0x0065;
    L_0x0062:
        r4 = 1;
    L_0x0063:
        r5 = r4;
        goto L_0x006f;
    L_0x0065:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x006a:
        if (r5 == 0) goto L_0x0039;
    L_0x006c:
        r6 = r6 + 128;
        goto L_0x0031;
    L_0x006f:
        r4 = r2;
        goto L_0x008c;
    L_0x0071:
        if (r6 >= r0) goto L_0x0076;
    L_0x0073:
        r4 = r6 + 1;
        goto L_0x008c;
    L_0x0076:
        r7 = f6651a;
        r7 = r7.length;
        if (r6 >= r7) goto L_0x008f;
    L_0x007b:
        r7 = f6651a;
        r6 = r7[r6];
        if (r5 == 0) goto L_0x0089;
    L_0x0081:
        r6 = r6 + 128;
        r5 = (char) r6;
        r9.append(r5);
        r5 = r2;
        goto L_0x008c;
    L_0x0089:
        r9.append(r6);
    L_0x008c:
        r3 = r3 + 1;
        goto L_0x0021;
    L_0x008f:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x0094:
        r3 = r8.m5423a();
        if (r3 > 0) goto L_0x009b;
    L_0x009a:
        return;
    L_0x009b:
        r3 = r5;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.a.c.a(com.google.d.b.c, java.lang.StringBuilder):void");
    }

    private static void m5444a(C1967c c1967c, StringBuilder stringBuilder, Collection<byte[]> collection) {
        int i = 1 + c1967c.f6577a;
        int i2 = i + 1;
        i = C1979c.m5439a(c1967c.m5424a(8), i);
        if (i == 0) {
            i = c1967c.m5423a() / 8;
        } else if (i >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
            i = C1979c.m5439a(c1967c.m5424a(8), i2) + (Callback.DEFAULT_SWIPE_ANIMATION_DURATION * (i - 249));
            i2++;
        }
        if (i < 0) {
            throw C5615f.m12347a();
        }
        Object obj = new byte[i];
        int i3 = 0;
        while (i3 < i) {
            if (c1967c.m5423a() < 8) {
                throw C5615f.m12347a();
            }
            int i4 = i2 + 1;
            obj[i3] = (byte) C1979c.m5439a(c1967c.m5424a(8), i2);
            i3++;
            i2 = i4;
        }
        collection.add(obj);
        try {
            stringBuilder.append(new String(obj, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            StringBuilder stringBuilder2 = new StringBuilder("Platform does not support required encoding: ");
            stringBuilder2.append(e);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5445b(com.google.p173d.p177b.C1967c r8, java.lang.StringBuilder r9) {
        /*
        r0 = 3;
        r1 = new int[r0];
        r2 = 0;
        r3 = r2;
        r4 = r3;
    L_0x0006:
        r5 = r8.m5423a();
        r6 = 8;
        if (r5 != r6) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = r8.m5424a(r6);
        r7 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        if (r5 != r7) goto L_0x0018;
    L_0x0017:
        return;
    L_0x0018:
        r6 = r8.m5424a(r6);
        com.google.p173d.p180c.p181a.C1979c.m5442a(r5, r6, r1);
        r5 = r3;
        r3 = r2;
    L_0x0021:
        if (r3 >= r0) goto L_0x00a2;
    L_0x0023:
        r6 = r1[r3];
        switch(r4) {
            case 0: goto L_0x007f;
            case 1: goto L_0x0075;
            case 2: goto L_0x0049;
            case 3: goto L_0x002d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x002d:
        r4 = f6655e;
        r4 = r4.length;
        if (r6 >= r4) goto L_0x0044;
    L_0x0032:
        r4 = f6655e;
        r4 = r4[r6];
        if (r5 == 0) goto L_0x0040;
    L_0x0038:
        r4 = r4 + 128;
        r4 = (char) r4;
    L_0x003b:
        r9.append(r4);
        r5 = r2;
        goto L_0x007d;
    L_0x0040:
        r9.append(r4);
        goto L_0x007d;
    L_0x0044:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x0049:
        r4 = f6654d;
        r4 = r4.length;
        if (r6 >= r4) goto L_0x0060;
    L_0x004e:
        r4 = f6654d;
        r4 = r4[r6];
        if (r5 == 0) goto L_0x005c;
    L_0x0054:
        r4 = r4 + 128;
        r4 = (char) r4;
        r9.append(r4);
        r4 = r2;
        goto L_0x006e;
    L_0x005c:
        r9.append(r4);
        goto L_0x0067;
    L_0x0060:
        r4 = 27;
        if (r6 != r4) goto L_0x0069;
    L_0x0064:
        r4 = 29;
        goto L_0x005c;
    L_0x0067:
        r4 = r5;
        goto L_0x006e;
    L_0x0069:
        r4 = 30;
        if (r6 != r4) goto L_0x0070;
    L_0x006d:
        r4 = 1;
    L_0x006e:
        r5 = r4;
        goto L_0x007d;
    L_0x0070:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x0075:
        if (r5 == 0) goto L_0x007b;
    L_0x0077:
        r6 = r6 + 128;
        r4 = (char) r6;
        goto L_0x003b;
    L_0x007b:
        r4 = (char) r6;
        goto L_0x0040;
    L_0x007d:
        r4 = r2;
        goto L_0x009a;
    L_0x007f:
        if (r6 >= r0) goto L_0x0084;
    L_0x0081:
        r4 = r6 + 1;
        goto L_0x009a;
    L_0x0084:
        r7 = f6653c;
        r7 = r7.length;
        if (r6 >= r7) goto L_0x009d;
    L_0x0089:
        r7 = f6653c;
        r6 = r7[r6];
        if (r5 == 0) goto L_0x0097;
    L_0x008f:
        r6 = r6 + 128;
        r5 = (char) r6;
        r9.append(r5);
        r5 = r2;
        goto L_0x009a;
    L_0x0097:
        r9.append(r6);
    L_0x009a:
        r3 = r3 + 1;
        goto L_0x0021;
    L_0x009d:
        r8 = com.google.p173d.C5615f.m12347a();
        throw r8;
    L_0x00a2:
        r3 = r8.m5423a();
        if (r3 > 0) goto L_0x00a9;
    L_0x00a8:
        return;
    L_0x00a9:
        r3 = r5;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.a.c.b(com.google.d.b.c, java.lang.StringBuilder):void");
    }

    private static void m5446c(C1967c c1967c, StringBuilder stringBuilder) {
        int[] iArr = new int[3];
        while (c1967c.m5423a() != 8) {
            int a = c1967c.m5424a(8);
            if (a != 254) {
                C1979c.m5442a(a, c1967c.m5424a(8), iArr);
                for (a = 0; a < 3; a++) {
                    char c;
                    int i = iArr[a];
                    if (i == 0) {
                        c = '\r';
                    } else if (i == 1) {
                        c = '*';
                    } else if (i == 2) {
                        c = '>';
                    } else if (i == 3) {
                        c = ' ';
                    } else {
                        if (i < 14) {
                            i += 44;
                        } else if (i < 40) {
                            i += 51;
                        } else {
                            throw C5615f.m12347a();
                        }
                        c = (char) i;
                    }
                    stringBuilder.append(c);
                }
                if (c1967c.m5423a() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    private static void m5447d(C1967c c1967c, StringBuilder stringBuilder) {
        while (c1967c.m5423a() > 16) {
            for (int i = 0; i < 4; i++) {
                int a = c1967c.m5424a(6);
                if (a == 31) {
                    int i2 = 8 - c1967c.f6578b;
                    if (i2 != 8) {
                        c1967c.m5424a(i2);
                    }
                    return;
                }
                if ((a & 32) == 0) {
                    a |= 64;
                }
                stringBuilder.append((char) a);
            }
            if (c1967c.m5423a() <= 0) {
                return;
            }
        }
    }
}
