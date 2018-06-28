package com.google.p173d.p177b;

import com.google.p173d.C2007e;
import java.nio.charset.Charset;
import java.util.Map;

public final class C1973l {
    private static final String f6634a = Charset.defaultCharset().name();
    private static final boolean f6635b;

    static {
        boolean z;
        if (!"SJIS".equalsIgnoreCase(f6634a)) {
            if (!"EUC_JP".equalsIgnoreCase(f6634a)) {
                z = false;
                f6635b = z;
            }
        }
        z = true;
        f6635b = z;
    }

    public static String m5431a(byte[] bArr, Map<C2007e, ?> map) {
        byte[] bArr2 = bArr;
        Map<C2007e, ?> map2 = map;
        if (map2 != null && map2.containsKey(C2007e.CHARACTER_SET)) {
            return map2.get(C2007e.CHARACTER_SET).toString();
        }
        int i = 0;
        int length = bArr2.length;
        int i2 = (bArr2.length > 3 && bArr2[0] == (byte) -17 && bArr2[1] == (byte) -69 && bArr2[2] == (byte) -65) ? 1 : 0;
        int i3 = 1;
        int i4 = i3;
        int i5 = i4;
        int i6 = 0;
        int i7 = i6;
        int i8 = i7;
        int i9 = i8;
        int i10 = i9;
        int i11 = i10;
        int i12 = i11;
        int i13 = i12;
        int i14 = i13;
        int i15 = i14;
        int i16 = i15;
        while (i7 < length && (i3 != 0 || i4 != 0 || i5 != 0)) {
            int i17 = bArr2[i7] & 255;
            if (i5 != 0) {
                if (i8 > 0) {
                    if ((i17 & 128) != 0) {
                        i8--;
                    }
                } else if ((i17 & 128) != 0) {
                    if ((i17 & 64) != 0) {
                        i8++;
                        if ((i17 & 32) == 0) {
                            i10++;
                        } else {
                            i8++;
                            if ((i17 & 16) == 0) {
                                i11++;
                            } else {
                                i8++;
                                if ((i17 & 8) == 0) {
                                    i12++;
                                }
                            }
                        }
                    }
                }
                i5 = 0;
            }
            if (i3 != 0) {
                if (i17 > 127 && i17 < 160) {
                    i3 = 0;
                } else if (i17 > 159 && (i17 < 192 || i17 == 215 || i17 == 247)) {
                    i14++;
                }
            }
            if (i4 != 0) {
                if (i9 > 0) {
                    if (i17 >= 64 && i17 != 127) {
                        if (i17 <= 252) {
                            i9--;
                        }
                    }
                } else if (!(i17 == 128 || i17 == 160)) {
                    if (i17 <= 239) {
                        int i18;
                        if (i17 > 160 && i17 < 224) {
                            i6++;
                            i18 = i15 + 1;
                            if (i18 > i13) {
                                i13 = i18;
                                i15 = i13;
                            } else {
                                i15 = i18;
                            }
                        } else if (i17 > 127) {
                            i9++;
                            i18 = i16 + 1;
                            if (i18 > i) {
                                i = i18;
                                i16 = i;
                            } else {
                                i16 = i18;
                            }
                            i15 = 0;
                        } else {
                            i15 = 0;
                        }
                        i16 = 0;
                    }
                }
                i4 = 0;
            }
            i7++;
            bArr2 = bArr;
        }
        if (i5 != 0 && i8 > 0) {
            i5 = 0;
        }
        int i19 = (i4 == 0 || i9 <= 0) ? i4 : 0;
        return (i5 == 0 || (i2 == 0 && (i10 + i11) + i12 <= 0)) ? (i19 == 0 || (!f6635b && i13 < 3 && i < 3)) ? (i3 == 0 || i19 == 0) ? i3 != 0 ? "ISO8859_1" : i19 != 0 ? "SJIS" : i5 != 0 ? "UTF8" : f6634a : (!(i13 == 2 && i6 == 2) && i14 * 10 < length) ? "ISO8859_1" : "SJIS" : "SJIS" : "UTF8";
    }
}
