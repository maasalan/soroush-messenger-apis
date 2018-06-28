package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p114b.p116c.C1346b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p116c.C1352h;
import com.p111d.p112a.p114b.p539a.C6464a;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C7261h extends C7042c {
    private static final byte[] f20968p = C1345a.m3187h();
    private static final byte[] f20969q = new byte[]{(byte) 110, (byte) 117, (byte) 108, (byte) 108};
    private static final byte[] f20970r = new byte[]{(byte) 116, (byte) 114, (byte) 117, (byte) 101};
    private static final byte[] f20971s = new byte[]{(byte) 102, (byte) 97, (byte) 108, (byte) 115, (byte) 101};
    protected final OutputStream f20972g;
    protected byte[] f20973h;
    protected int f20974i;
    protected final int f20975j;
    protected final int f20976k;
    protected char[] f20977l;
    protected final int f20978m;
    protected boolean f20979n = true;
    protected boolean f20980o;

    public C7261h(C1347c c1347c, int i, C5304n c5304n, OutputStream outputStream) {
        super(c1347c, i, c5304n);
        this.f20972g = outputStream;
        this.f20973h = c1347c.m3208f();
        this.f20975j = this.f20973h.length;
        this.f20976k = this.f20975j >> 3;
        this.f20977l = c1347c.m3211i();
        this.f20978m = this.f20977l.length;
        if (isEnabled(C1368a.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
        this.f20980o = C1368a.QUOTE_FIELD_NAMES.m3311a(i) ^ true;
    }

    private final int m19265a(int i, int i2) {
        byte[] bArr = this.f20973h;
        if (i < C6464a.SURR1_FIRST || i > C6464a.SURR2_LAST) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) (224 | (i >> 12));
            i2 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            i3 = i2 + 1;
            bArr[i2] = (byte) ((i & 63) | 128);
            return i3;
        }
        i3 = i2 + 1;
        bArr[i2] = (byte) 92;
        i2 = i3 + 1;
        bArr[i3] = (byte) 117;
        i3 = i2 + 1;
        bArr[i2] = f20968p[(i >> 12) & 15];
        i2 = i3 + 1;
        bArr[i3] = f20968p[(i >> 8) & 15];
        i3 = i2 + 1;
        bArr[i2] = f20968p[(i >> 4) & 15];
        i2 = i3 + 1;
        bArr[i3] = f20968p[i & 15];
        return i2;
    }

    private final int m19266a(int i, char[] cArr, int i2, int i3) {
        if (i < C6464a.SURR1_FIRST || i > C6464a.SURR2_LAST) {
            byte[] bArr = this.f20973h;
            i3 = this.f20974i;
            this.f20974i = i3 + 1;
            bArr[i3] = (byte) (224 | (i >> 12));
            i3 = this.f20974i;
            this.f20974i = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            i3 = this.f20974i;
            this.f20974i = i3 + 1;
            bArr[i3] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            _reportError("Split surrogate on writeRaw() input (last character)");
        }
        i = _decodeSurrogate(i, cArr[i2]);
        if (this.f20974i + 4 > this.f20975j) {
            m19277b();
        }
        bArr = this.f20973h;
        i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr[i3] = (byte) (240 | (i >> 18));
        i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr[i3] = (byte) (((i >> 12) & 63) | 128);
        i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr[i3] = (byte) (((i >> 6) & 63) | 128);
        i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr[i3] = (byte) ((i & 63) | 128);
        return i2 + 1;
    }

    private static int m19267a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        i = Math.min(i3, bArr.length);
        do {
            i2 = i - i4;
            if (i2 == 0) {
                break;
            }
            i2 = inputStream.read(bArr, i4, i2);
            if (i2 < 0) {
                return i4;
            }
            i4 += i2;
        } while (i4 < 3);
        return i4;
    }

    private final int m19268a(byte[] bArr, int i, C1382p c1382p, int i2) {
        Object asUnquotedUTF8 = c1382p.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            length = this.f20975j;
            int length2 = asUnquotedUTF8.length;
            if (i + length2 > length) {
                this.f20974i = i;
                m19277b();
                i = this.f20974i;
                if (length2 > bArr.length) {
                    this.f20972g.write(asUnquotedUTF8, 0, length2);
                    return i;
                }
                System.arraycopy(asUnquotedUTF8, 0, bArr, i, length2);
                i += length2;
            }
            if ((6 * i2) + i <= length) {
                return i;
            }
            m19277b();
            return this.f20974i;
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    private final void m19269a() {
        if (this.f20974i + 4 >= this.f20975j) {
            m19277b();
        }
        System.arraycopy(f20969q, 0, this.f20973h, this.f20974i, 4);
        this.f20974i += 4;
    }

    private final void m19270a(String str) {
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 34;
        writeRaw(str);
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        int i2 = this.f20974i;
        this.f20974i = i2 + 1;
        bArr2[i2] = (byte) 34;
    }

    private final void m19271a(String str, int i, int i2) {
        i2 += i;
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt > '' || iArr[charAt] != 0) {
                break;
            }
            int i4 = i3 + 1;
            bArr[i3] = (byte) charAt;
            i++;
            i3 = i4;
        }
        this.f20974i = i3;
        if (i < i2) {
            if (this.e != null) {
                if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
                    m19277b();
                }
                i3 = this.f20974i;
                bArr = this.f20973h;
                iArr = this.c;
                charAt = this.d <= 0 ? '￿' : this.d;
                C1346b c1346b = this.e;
                while (i < i2) {
                    int i5 = i + 1;
                    i = str.charAt(i);
                    int i6;
                    C1382p b;
                    if (i <= '') {
                        if (iArr[i] == 0) {
                            i6 = i3 + 1;
                            bArr[i3] = (byte) i;
                            i = i5;
                            i3 = i6;
                        } else {
                            i6 = iArr[i];
                            if (i6 > 0) {
                                i = i3 + 1;
                                bArr[i3] = (byte) 92;
                                i3 = i + 1;
                                bArr[i] = (byte) i6;
                                i = i5;
                            } else if (i6 == -2) {
                                b = c1346b.m3189b();
                                if (b == null) {
                                    StringBuilder stringBuilder = new StringBuilder("Invalid custom escape definitions; custom escape not found for character code 0x");
                                    stringBuilder.append(Integer.toHexString(i));
                                    stringBuilder.append(", although was supposed to have one");
                                    _reportError(stringBuilder.toString());
                                }
                                i3 = m19268a(bArr, i3, b, i2 - i5);
                                i = i5;
                            }
                        }
                    } else if (i <= charAt) {
                        b = c1346b.m3189b();
                        if (b == null) {
                            if (i <= '߿') {
                                i6 = i3 + 1;
                                bArr[i3] = (byte) (192 | (i >> 6));
                                i3 = i6 + 1;
                                bArr[i6] = (byte) ((i & 63) | 128);
                            } else {
                                i3 = m19265a(i, i3);
                            }
                            i = i5;
                        }
                        i3 = m19268a(bArr, i3, b, i2 - i5);
                        i = i5;
                    }
                    i3 = m19276b(i, i3);
                    i = i5;
                }
                this.f20974i = i3;
            } else if (this.d == 0) {
                m19278b(str, i, i2);
            } else {
                m19280c(str, i, i2);
            }
        }
    }

    private final void m19272a(String str, boolean z) {
        int i;
        if (z) {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) 34;
        }
        int length = str.length();
        i = 0;
        while (length > 0) {
            int min = Math.min(this.f20976k, length);
            if (this.f20974i + min > this.f20975j) {
                m19277b();
            }
            m19271a(str, i, min);
            i += min;
            length -= min;
        }
        if (z) {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr2 = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr2[i2] = (byte) 34;
        }
    }

    private final void m19273a(byte[] bArr) {
        int length = bArr.length;
        if (this.f20974i + length > this.f20975j) {
            m19277b();
            if (length > IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
                this.f20972g.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f20973h, this.f20974i, length);
        this.f20974i += length;
    }

    private final void m19274a(byte[] bArr, int i, int i2) {
        int[] iArr = this.c;
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < (byte) 0 || iArr[b] == 0) {
                i4 = i5;
            } else {
                int i6 = this.f20974i;
                if ((i2 * 6) + i6 > this.f20975j) {
                    m19277b();
                    i6 = this.f20974i;
                }
                byte[] bArr2 = this.f20973h;
                int[] iArr2 = this.c;
                while (i < i3) {
                    int i7;
                    i5 = i + 1;
                    byte b2 = bArr[i];
                    if (b2 >= (byte) 0) {
                        if (iArr2[b2] != 0) {
                            i7 = iArr2[b2];
                            if (i7 > 0) {
                                i = i6 + 1;
                                bArr2[i6] = (byte) 92;
                                i6 = i + 1;
                                bArr2[i] = (byte) i7;
                            } else {
                                i6 = m19276b(b2, i6);
                            }
                            i = i5;
                        }
                    }
                    i7 = i6 + 1;
                    bArr2[i6] = b2;
                    i = i5;
                    i6 = i7;
                }
                this.f20974i = i6;
                return;
            }
        }
        if (this.f20974i + i2 > this.f20975j) {
            m19277b();
        }
        System.arraycopy(bArr, i, this.f20973h, this.f20974i, i2);
        this.f20974i += i2;
    }

    private final void m19275a(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this.f20976k, i2);
            if (this.f20974i + min > this.f20975j) {
                m19277b();
            }
            m19279b(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private int m19276b(int i, int i2) {
        byte[] bArr = this.f20973h;
        int i3 = i2 + 1;
        bArr[i2] = (byte) 92;
        i2 = i3 + 1;
        bArr[i3] = (byte) 117;
        if (i > 255) {
            i3 = 255 & (i >> 8);
            int i4 = i2 + 1;
            bArr[i2] = f20968p[i3 >> 4];
            i2 = i4 + 1;
            bArr[i4] = f20968p[i3 & 15];
            i &= 255;
        } else {
            i3 = i2 + 1;
            bArr[i2] = (byte) 48;
            i2 = i3 + 1;
            bArr[i3] = (byte) 48;
        }
        i3 = i2 + 1;
        bArr[i2] = f20968p[i >> 4];
        i2 = i3 + 1;
        bArr[i3] = f20968p[i & 15];
        return i2;
    }

    private void m19277b() {
        int i = this.f20974i;
        if (i > 0) {
            this.f20974i = 0;
            this.f20972g.write(this.f20973h, 0, i);
        }
    }

    private final void m19278b(String str, int i, int i2) {
        if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
            m19277b();
        }
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        while (i < i2) {
            int i4 = i + 1;
            i = str.charAt(i);
            int i5;
            if (i <= '') {
                if (iArr[i] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) i;
                    i = i4;
                    i3 = i5;
                } else {
                    i5 = iArr[i];
                    if (i5 > 0) {
                        i = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i + 1;
                        bArr[i] = (byte) i5;
                    } else {
                        i3 = m19276b(i, i3);
                    }
                }
            } else if (i <= '߿') {
                i5 = i3 + 1;
                bArr[i3] = (byte) (192 | (i >> 6));
                i3 = i5 + 1;
                bArr[i5] = (byte) ((i & 63) | 128);
            } else {
                i3 = m19265a(i, i3);
            }
            i = i4;
        }
        this.f20974i = i3;
    }

    private final void m19279b(char[] cArr, int i, int i2) {
        i2 += i;
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        while (i < i2) {
            char c = cArr[i];
            if (c > '' || iArr[c] != 0) {
                break;
            }
            int i4 = i3 + 1;
            bArr[i3] = (byte) c;
            i++;
            i3 = i4;
        }
        this.f20974i = i3;
        if (i < i2) {
            if (this.e != null) {
                if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
                    m19277b();
                }
                i3 = this.f20974i;
                bArr = this.f20973h;
                iArr = this.c;
                c = this.d <= 0 ? '￿' : this.d;
                C1346b c1346b = this.e;
                while (i < i2) {
                    int i5 = i + 1;
                    i = cArr[i];
                    int i6;
                    C1382p b;
                    if (i <= '') {
                        if (iArr[i] == 0) {
                            i6 = i3 + 1;
                            bArr[i3] = (byte) i;
                            i = i5;
                            i3 = i6;
                        } else {
                            i6 = iArr[i];
                            if (i6 > 0) {
                                i = i3 + 1;
                                bArr[i3] = (byte) 92;
                                i3 = i + 1;
                                bArr[i] = (byte) i6;
                                i = i5;
                            } else if (i6 == -2) {
                                b = c1346b.m3189b();
                                if (b == null) {
                                    StringBuilder stringBuilder = new StringBuilder("Invalid custom escape definitions; custom escape not found for character code 0x");
                                    stringBuilder.append(Integer.toHexString(i));
                                    stringBuilder.append(", although was supposed to have one");
                                    _reportError(stringBuilder.toString());
                                }
                                i3 = m19268a(bArr, i3, b, i2 - i5);
                                i = i5;
                            }
                        }
                    } else if (i <= c) {
                        b = c1346b.m3189b();
                        if (b == null) {
                            if (i <= '߿') {
                                i6 = i3 + 1;
                                bArr[i3] = (byte) (192 | (i >> 6));
                                i3 = i6 + 1;
                                bArr[i6] = (byte) ((i & 63) | 128);
                            } else {
                                i3 = m19265a(i, i3);
                            }
                            i = i5;
                        }
                        i3 = m19268a(bArr, i3, b, i2 - i5);
                        i = i5;
                    }
                    i3 = m19276b(i, i3);
                    i = i5;
                }
                this.f20974i = i3;
            } else if (this.d == 0) {
                m19281c(cArr, i, i2);
            } else {
                m19282d(cArr, i, i2);
            }
        }
    }

    private final void m19280c(String str, int i, int i2) {
        if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
            m19277b();
        }
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        char c = this.d;
        while (i < i2) {
            int i4 = i + 1;
            i = str.charAt(i);
            int i5;
            if (i <= '') {
                if (iArr[i] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) i;
                    i = i4;
                    i3 = i5;
                } else {
                    i5 = iArr[i];
                    if (i5 > 0) {
                        i = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i + 1;
                        bArr[i] = (byte) i5;
                        i = i4;
                    }
                }
            } else if (i <= c) {
                if (i <= '߿') {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) (192 | (i >> 6));
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((i & 63) | 128);
                } else {
                    i3 = m19265a(i, i3);
                }
                i = i4;
            }
            i3 = m19276b(i, i3);
            i = i4;
        }
        this.f20974i = i3;
    }

    private final void m19281c(char[] cArr, int i, int i2) {
        if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
            m19277b();
        }
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        while (i < i2) {
            int i4 = i + 1;
            i = cArr[i];
            int i5;
            if (i <= '') {
                if (iArr[i] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) i;
                    i = i4;
                    i3 = i5;
                } else {
                    i5 = iArr[i];
                    if (i5 > 0) {
                        i = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i + 1;
                        bArr[i] = (byte) i5;
                    } else {
                        i3 = m19276b(i, i3);
                    }
                }
            } else if (i <= '߿') {
                i5 = i3 + 1;
                bArr[i3] = (byte) (192 | (i >> 6));
                i3 = i5 + 1;
                bArr[i5] = (byte) ((i & 63) | 128);
            } else {
                i3 = m19265a(i, i3);
            }
            i = i4;
        }
        this.f20974i = i3;
    }

    private final void m19282d(char[] cArr, int i, int i2) {
        if (this.f20974i + (6 * (i2 - i)) > this.f20975j) {
            m19277b();
        }
        int i3 = this.f20974i;
        byte[] bArr = this.f20973h;
        int[] iArr = this.c;
        char c = this.d;
        while (i < i2) {
            int i4 = i + 1;
            i = cArr[i];
            int i5;
            if (i <= '') {
                if (iArr[i] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) i;
                    i = i4;
                    i3 = i5;
                } else {
                    i5 = iArr[i];
                    if (i5 > 0) {
                        i = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i + 1;
                        bArr[i] = (byte) i5;
                        i = i4;
                    }
                }
            } else if (i <= c) {
                if (i <= '߿') {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) (192 | (i >> 6));
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((i & 63) | 128);
                } else {
                    i3 = m19265a(i, i3);
                }
                i = i4;
            }
            i3 = m19276b(i, i3);
            i = i4;
        }
        this.f20974i = i3;
    }

    protected final void _releaseBuffers() {
        byte[] bArr = this.f20973h;
        if (bArr != null && this.f20979n) {
            this.f20973h = null;
            this.b.m3200b(bArr);
        }
        char[] cArr = this.f20977l;
        if (cArr != null) {
            this.f20977l = null;
            this.b.m3201b(cArr);
        }
    }

    protected final void _verifyValueWrite(String str) {
        int n = this._writeContext.m11006n();
        if (n == 5) {
            StringBuilder stringBuilder = new StringBuilder("Can not ");
            stringBuilder.append(str);
            stringBuilder.append(", expecting field name");
            _reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter == null) {
            byte b;
            switch (n) {
                case 1:
                    b = (byte) 44;
                    break;
                case 2:
                    b = (byte) 58;
                    break;
                case 3:
                    if (this.f != null) {
                        byte[] asUnquotedUTF8 = this.f.asUnquotedUTF8();
                        if (asUnquotedUTF8.length > 0) {
                            m19273a(asUnquotedUTF8);
                        }
                    }
                    return;
                default:
                    return;
            }
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            this.f20973h[this.f20974i] = b;
            this.f20974i++;
            return;
        }
        switch (n) {
            case 0:
                if (this._writeContext.m3357b()) {
                    this._cfgPrettyPrinter.mo1294g(this);
                    return;
                }
                if (this._writeContext.m3359d()) {
                    this._cfgPrettyPrinter.mo1295h(this);
                }
                return;
            case 1:
                this._cfgPrettyPrinter.mo1293f(this);
                return;
            case 2:
                this._cfgPrettyPrinter.mo1291d(this);
                return;
            case 3:
                this._cfgPrettyPrinter.mo1286a(this);
                return;
            default:
                _throwInternal();
                return;
        }
    }

    public final void close() {
        super.close();
        if (this.f20973h != null && isEnabled(C1368a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C1379l outputContext = getOutputContext();
                if (!outputContext.m3357b()) {
                    if (!outputContext.m3359d()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        m19277b();
        this.f20974i = 0;
        if (this.f20972g != null) {
            if (!this.b.m3205c()) {
                if (!isEnabled(C1368a.AUTO_CLOSE_TARGET)) {
                    if (isEnabled(C1368a.FLUSH_PASSED_TO_STREAM)) {
                        this.f20972g.flush();
                    }
                }
            }
            this.f20972g.close();
        }
        _releaseBuffers();
    }

    public final void flush() {
        m19277b();
        if (this.f20972g != null && isEnabled(C1368a.FLUSH_PASSED_TO_STREAM)) {
            this.f20972g.flush();
        }
    }

    public final int getOutputBuffered() {
        return this.f20974i;
    }

    public final Object getOutputTarget() {
        return this.f20972g;
    }

    public final int writeBinary(C1341a c1341a, InputStream inputStream, int i) {
        int i2;
        int i3;
        C1341a c1341a2 = c1341a;
        InputStream inputStream2 = inputStream;
        int i4 = i;
        _verifyValueWrite("write a binary value");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = r1.f20973h;
        int i5 = r1.f20974i;
        r1.f20974i = i5 + 1;
        bArr[i5] = (byte) 34;
        bArr = r1.b.m3209g();
        int i6 = 3;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i4 < 0) {
            try {
                i4 = r1.f20975j - 6;
                i10 = 0;
                i2 = i10;
                int c = c1341a.m3174c() >> 2;
                i11 = -3;
                i12 = i2;
                while (true) {
                    if (i12 > i11) {
                        i12 = C7261h.m19267a(inputStream2, bArr, i12, i10, bArr.length);
                        if (i12 < 3) {
                            break;
                        }
                        i11 = i12 - 3;
                        i10 = i12;
                        i12 = i8;
                    }
                    if (r1.f20974i > i4) {
                        m19277b();
                    }
                    i13 = i12 + 1;
                    i12 = bArr[i12] << 8;
                    int i14 = i13 + 1;
                    i12 = i14 + 1;
                    i2 += 3;
                    r1.f20974i = c1341a2.m3163a((((bArr[i13] & 255) | i12) << 8) | (bArr[i14] & 255), r1.f20973h, r1.f20974i);
                    c--;
                    if (c <= 0) {
                        byte[] bArr2 = r1.f20973h;
                        i8 = r1.f20974i;
                        r1.f20974i = i8 + 1;
                        bArr2[i8] = (byte) 92;
                        bArr2 = r1.f20973h;
                        i8 = r1.f20974i;
                        r1.f20974i = i8 + 1;
                        bArr2[i8] = (byte) 110;
                        c = c1341a.m3174c() >> 2;
                    }
                    i8 = 0;
                    i9 = 1;
                }
                if (i12 > 0) {
                    if (r1.f20974i > i4) {
                        m19277b();
                    }
                    i3 = bArr[i8] << 16;
                    if (i9 < i12) {
                        i3 |= (bArr[i9] & 255) << 8;
                    } else {
                        i7 = i9;
                    }
                    i2 += i7;
                    r1.f20974i = c1341a2.m3161a(i3, i7, r1.f20973h, r1.f20974i);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                r1.b.m3203c(bArr);
            }
        } else {
            i13 = r1.f20975j - 6;
            i9 = -3;
            i10 = c1341a.m3174c() >> 2;
            i8 = 0;
            i11 = 0;
            i12 = i4;
            while (i12 > i7) {
                byte b;
                if (i8 > i9) {
                    i11 = C7261h.m19267a(inputStream2, bArr, i8, i11, i12);
                    if (i11 < i6) {
                        i6 = i7;
                        i8 = 0;
                        break;
                    }
                    i9 = i11 - 3;
                    i8 = 0;
                }
                if (r1.f20974i > i13) {
                    m19277b();
                }
                i6 = i8 + 1;
                i8 = bArr[i8] << 8;
                i2 = i6 + 1;
                i8 = i2 + 1;
                i12 -= 3;
                r1.f20974i = c1341a2.m3163a((((bArr[i6] & 255) | i8) << 8) | (bArr[i2] & 255), r1.f20973h, r1.f20974i);
                i10--;
                if (i10 <= 0) {
                    byte[] bArr3 = r1.f20973h;
                    i6 = r1.f20974i;
                    r1.f20974i = i6 + 1;
                    bArr3[i6] = (byte) 92;
                    bArr3 = r1.f20973h;
                    i6 = r1.f20974i;
                    r1.f20974i = i6 + 1;
                    b = (byte) 110;
                    bArr3[i6] = (byte) 110;
                    i6 = 2;
                    i10 = c1341a.m3174c() >> 2;
                } else {
                    i6 = 2;
                    b = (byte) 110;
                }
                byte b2 = b;
                i7 = i6;
                i6 = 3;
            }
            i6 = i7;
            if (i12 > 0) {
                i3 = C7261h.m19267a(inputStream2, bArr, i8, i11, i12);
                if (i3 > 0) {
                    if (r1.f20974i > i13) {
                        m19277b();
                    }
                    i5 = bArr[0] << 16;
                    if (1 < i3) {
                        i5 |= (bArr[1] & 255) << 8;
                    } else {
                        i6 = 1;
                    }
                    r1.f20974i = c1341a2.m3161a(i5, i6, r1.f20973h, r1.f20974i);
                    i12 -= i6;
                }
            }
            if (i12 > 0) {
                StringBuilder stringBuilder = new StringBuilder("Too few bytes available: missing ");
                stringBuilder.append(i12);
                stringBuilder.append(" bytes (out of ");
                stringBuilder.append(i4);
                stringBuilder.append(")");
                _reportError(stringBuilder.toString());
            }
            i2 = i4;
        }
        r1.b.m3203c(bArr);
        if (r1.f20974i >= r1.f20975j) {
            m19277b();
        }
        byte[] bArr4 = r1.f20973h;
        i3 = r1.f20974i;
        r1.f20974i = i3 + 1;
        bArr4[i3] = (byte) 34;
        return i2;
    }

    public final void writeBinary(C1341a c1341a, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a binary value");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        int i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr2[i3] = (byte) 34;
        i2 += i;
        int i4 = i2 - 3;
        i3 = this.f20975j - 6;
        int c = c1341a.m3174c() >> 2;
        while (i <= i4) {
            if (this.f20974i > i3) {
                m19277b();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            i5 = i6 + 1;
            this.f20974i = c1341a.m3163a((((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f20973h, this.f20974i);
            c--;
            if (c <= 0) {
                byte[] bArr3 = this.f20973h;
                c = this.f20974i;
                this.f20974i = c + 1;
                bArr3[c] = (byte) 92;
                bArr3 = this.f20973h;
                c = this.f20974i;
                this.f20974i = c + 1;
                bArr3[c] = (byte) 110;
                c = c1341a.m3174c() >> 2;
            }
            i = i5;
        }
        i2 -= i;
        if (i2 > 0) {
            if (this.f20974i > i3) {
                m19277b();
            }
            i4 = i + 1;
            i = bArr[i] << 16;
            if (i2 == 2) {
                i |= (bArr[i4] & 255) << 8;
            }
            this.f20974i = c1341a.m3161a(i, i2, this.f20973h, this.f20974i);
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr4 = this.f20973h;
        int i7 = this.f20974i;
        this.f20974i = i7 + 1;
        bArr4[i7] = (byte) 34;
    }

    public final void writeBoolean(boolean z) {
        _verifyValueWrite("write a boolean value");
        if (this.f20974i + 5 >= this.f20975j) {
            m19277b();
        }
        Object obj = z ? f20970r : f20971s;
        int length = obj.length;
        System.arraycopy(obj, 0, this.f20973h, this.f20974i, length);
        this.f20974i += length;
    }

    public final void writeEndArray() {
        if (!this._writeContext.m3357b()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an ARRAY but ");
            stringBuilder.append(this._writeContext.m3360e());
            _reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1289b(this, this._writeContext.m3361f());
        } else {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) 93;
        }
        this._writeContext = this._writeContext.m11004l();
    }

    public final void writeEndObject() {
        if (!this._writeContext.m3359d()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an object but ");
            stringBuilder.append(this._writeContext.m3360e());
            _reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1287a(this, this._writeContext.m3361f());
        } else {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) 125;
        }
        this._writeContext = this._writeContext.m11004l();
    }

    public final void writeFieldName(C1382p c1382p) {
        int a;
        if (this._cfgPrettyPrinter != null) {
            a = this._writeContext.m10996a(c1382p.getValue());
            if (a == 4) {
                _reportError("Can not write a field name, expecting a value");
            }
            if (a == 1) {
                this._cfgPrettyPrinter.mo1290c(this);
            } else {
                this._cfgPrettyPrinter.mo1295h(this);
            }
            a = this.f20980o ^ 1;
            if (a != 0) {
                if (this.f20974i >= this.f20975j) {
                    m19277b();
                }
                byte[] bArr = this.f20973h;
                int i = this.f20974i;
                this.f20974i = i + 1;
                bArr[i] = (byte) 34;
            }
            m19273a(c1382p.asQuotedUTF8());
            if (a != 0) {
                if (this.f20974i >= this.f20975j) {
                    m19277b();
                }
                byte[] bArr2 = this.f20973h;
                a = this.f20974i;
                this.f20974i = a + 1;
                bArr2[a] = (byte) 34;
            }
            return;
        }
        a = this._writeContext.m10996a(c1382p.getValue());
        if (a == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (a == 1) {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr3 = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr3[i2] = (byte) 44;
        }
        if (this.f20980o) {
            a = c1382p.appendQuotedUTF8(this.f20973h, this.f20974i);
            if (a < 0) {
                m19273a(c1382p.asQuotedUTF8());
                return;
            } else {
                this.f20974i += a;
                return;
            }
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr3 = this.f20973h;
        i2 = this.f20974i;
        this.f20974i = i2 + 1;
        bArr3[i2] = (byte) 34;
        a = c1382p.appendQuotedUTF8(this.f20973h, this.f20974i);
        if (a < 0) {
            m19273a(c1382p.asQuotedUTF8());
        } else {
            this.f20974i += a;
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr2 = this.f20973h;
        a = this.f20974i;
        this.f20974i = a + 1;
        bArr2[a] = (byte) 34;
    }

    public final void writeFieldName(String str) {
        int i = 0;
        int a;
        if (this._cfgPrettyPrinter != null) {
            a = this._writeContext.m10996a(str);
            if (a == 4) {
                _reportError("Can not write a field name, expecting a value");
            }
            if (a == 1) {
                this._cfgPrettyPrinter.mo1290c(this);
            } else {
                this._cfgPrettyPrinter.mo1295h(this);
            }
            if (this.f20980o) {
                m19272a(str, false);
                return;
            }
            a = str.length();
            if (a > this.f20978m) {
                m19272a(str, true);
                return;
            }
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr[i2] = (byte) 34;
            str.getChars(0, a, this.f20977l, 0);
            if (a <= this.f20976k) {
                if (this.f20974i + a > this.f20975j) {
                    m19277b();
                }
                m19279b(this.f20977l, 0, a);
            } else {
                m19275a(this.f20977l, 0, a);
            }
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr2 = this.f20973h;
            a = this.f20974i;
            this.f20974i = a + 1;
            bArr2[a] = (byte) 34;
            return;
        }
        a = this._writeContext.m10996a(str);
        if (a == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (a == 1) {
            if (this.f20974i >= this.f20975j) {
                m19277b();
            }
            byte[] bArr3 = this.f20973h;
            int i3 = this.f20974i;
            this.f20974i = i3 + 1;
            bArr3[i3] = (byte) 44;
        }
        if (this.f20980o) {
            m19272a(str, false);
            return;
        }
        a = str.length();
        if (a > this.f20978m) {
            m19272a(str, true);
            return;
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr = this.f20973h;
        i2 = this.f20974i;
        this.f20974i = i2 + 1;
        bArr[i2] = (byte) 34;
        if (a <= this.f20976k) {
            if (this.f20974i + a > this.f20975j) {
                m19277b();
            }
            m19271a(str, 0, a);
        } else {
            do {
                i3 = Math.min(this.f20976k, a);
                if (this.f20974i + i3 > this.f20975j) {
                    m19277b();
                }
                m19271a(str, i, i3);
                i += i3;
                a -= i3;
            } while (a > 0);
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr2 = this.f20973h;
        a = this.f20974i;
        this.f20974i = a + 1;
        bArr2[a] = (byte) 34;
    }

    public final void writeNull() {
        _verifyValueWrite("write a null");
        m19269a();
    }

    public final void writeNumber(double d) {
        if (!this._cfgNumbersAsStrings) {
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !C1368a.QUOTE_NON_NUMERIC_NUMBERS.m3311a(this._features)) {
                _verifyValueWrite("write a number");
                writeRaw(String.valueOf(d));
                return;
            }
        }
        writeString(String.valueOf(d));
    }

    public final void writeNumber(float f) {
        if (!this._cfgNumbersAsStrings) {
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !C1368a.QUOTE_NON_NUMERIC_NUMBERS.m3311a(this._features)) {
                _verifyValueWrite("write a number");
                writeRaw(String.valueOf(f));
                return;
            }
        }
        writeString(String.valueOf(f));
    }

    public final void writeNumber(int i) {
        _verifyValueWrite("write a number");
        if (this.f20974i + 11 >= this.f20975j) {
            m19277b();
        }
        if (this._cfgNumbersAsStrings) {
            if (this.f20974i + 13 >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr[i2] = (byte) 34;
            this.f20974i = C1352h.m3236a(i, this.f20973h, this.f20974i);
            byte[] bArr2 = this.f20973h;
            int i3 = this.f20974i;
            this.f20974i = i3 + 1;
            bArr2[i3] = (byte) 34;
            return;
        }
        this.f20974i = C1352h.m3236a(i, this.f20973h, this.f20974i);
    }

    public final void writeNumber(long j) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this.f20974i + 23 >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) 34;
            this.f20974i = C1352h.m3238a(j, this.f20973h, this.f20974i);
            byte[] bArr2 = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr2[i2] = (byte) 34;
            return;
        }
        if (this.f20974i + 21 >= this.f20975j) {
            m19277b();
        }
        this.f20974i = C1352h.m3238a(j, this.f20973h, this.f20974i);
    }

    public final void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            m19270a(str);
        } else {
            writeRaw(str);
        }
    }

    public final void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            m19269a();
        } else if (this._cfgNumbersAsStrings) {
            m19270a(C1368a.WRITE_BIGDECIMAL_AS_PLAIN.m3311a(this._features) ? bigDecimal.toPlainString() : bigDecimal.toString());
        } else {
            writeRaw(C1368a.WRITE_BIGDECIMAL_AS_PLAIN.m3311a(this._features) ? bigDecimal.toPlainString() : bigDecimal.toString());
        }
    }

    public final void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            m19269a();
        } else if (this._cfgNumbersAsStrings) {
            m19270a(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public final void writeNumber(short s) {
        _verifyValueWrite("write a number");
        if (this.f20974i + 6 >= this.f20975j) {
            m19277b();
        }
        if (this._cfgNumbersAsStrings) {
            if (this.f20974i + 8 >= this.f20975j) {
                m19277b();
            }
            byte[] bArr = this.f20973h;
            int i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) 34;
            this.f20974i = C1352h.m3236a((int) s, this.f20973h, this.f20974i);
            byte[] bArr2 = this.f20973h;
            int i2 = this.f20974i;
            this.f20974i = i2 + 1;
            bArr2[i2] = (byte) 34;
            return;
        }
        this.f20974i = C1352h.m3236a((int) s, this.f20973h, this.f20974i);
    }

    public final void writeRaw(char c) {
        if (this.f20974i + 3 >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i;
        if (c <= '') {
            i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 'ࠀ') {
            i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) (192 | (c >> 6));
            i = this.f20974i;
            this.f20974i = i + 1;
            bArr[i] = (byte) ((c & 63) | 128);
        } else {
            m19266a((int) c, null, 0, 0);
        }
    }

    public final void writeRaw(C1382p c1382p) {
        byte[] asUnquotedUTF8 = c1382p.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            m19273a(asUnquotedUTF8);
        }
    }

    public final void writeRaw(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.f20977l;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            writeRaw(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    public final void writeRaw(String str, int i, int i2) {
        while (i2 > 0) {
            char[] cArr = this.f20977l;
            int length = cArr.length;
            if (i2 < length) {
                length = i2;
            }
            int i3 = i + length;
            str.getChars(i, i3, cArr, 0);
            writeRaw(cArr, 0, length);
            i2 -= length;
            i = i3;
        }
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        byte[] bArr;
        int i3;
        int i4 = (i2 + i2) + i2;
        if (this.f20974i + i4 > this.f20975j) {
            if (this.f20975j < i4) {
                i4 = this.f20975j;
                bArr = this.f20973h;
                loop0:
                while (i < i2) {
                    int i5;
                    while (true) {
                        char c = cArr[i];
                        if (c >= '') {
                            break;
                        }
                        if (this.f20974i >= i4) {
                            m19277b();
                        }
                        i5 = this.f20974i;
                        this.f20974i = i5 + 1;
                        bArr[i5] = (byte) c;
                        i++;
                        if (i >= i2) {
                            break loop0;
                        }
                    }
                    if (this.f20974i + 3 >= this.f20975j) {
                        m19277b();
                    }
                    i3 = i + 1;
                    i = cArr[i];
                    if (i < 'ࠀ') {
                        i5 = this.f20974i;
                        this.f20974i = i5 + 1;
                        bArr[i5] = (byte) ((i >> 6) | 192);
                        i5 = this.f20974i;
                        this.f20974i = i5 + 1;
                        bArr[i5] = (byte) ((i & 63) | 128);
                        i = i3;
                    } else {
                        i = m19266a(i, cArr, i3, i2);
                    }
                }
                return;
            }
            m19277b();
        }
        i2 += i;
        loop2:
        while (i < i2) {
            while (true) {
                char c2 = cArr[i];
                if (c2 > '') {
                    break;
                }
                bArr = this.f20973h;
                i3 = this.f20974i;
                this.f20974i = i3 + 1;
                bArr[i3] = (byte) c2;
                i++;
                if (i >= i2) {
                    break loop2;
                }
            }
            i4 = i + 1;
            i = cArr[i];
            if (i < 'ࠀ') {
                bArr = this.f20973h;
                i3 = this.f20974i;
                this.f20974i = i3 + 1;
                bArr[i3] = (byte) ((i >> 6) | 192);
                bArr = this.f20973h;
                i3 = this.f20974i;
                this.f20974i = i3 + 1;
                bArr[i3] = (byte) ((i & 63) | 128);
                i = i4;
            } else {
                i = m19266a(i, cArr, i4, i2);
            }
        }
    }

    public final void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a string");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        int i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr2[i3] = (byte) 34;
        if (this.f20974i + i2 > this.f20975j) {
            m19277b();
            if (i2 > IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
                this.f20972g.write(bArr, i, i2);
                if (this.f20974i >= this.f20975j) {
                    m19277b();
                }
                bArr = this.f20973h;
                i = this.f20974i;
                this.f20974i = i + 1;
                bArr[i] = (byte) 34;
            }
        }
        System.arraycopy(bArr, i, this.f20973h, this.f20974i, i2);
        this.f20974i += i2;
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr = this.f20973h;
        i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 34;
    }

    public final void writeRawValue(C1382p c1382p) {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = c1382p.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            m19273a(asUnquotedUTF8);
        }
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.m11001i();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1292e(this);
            return;
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 91;
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.m11002j();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.mo1288b(this);
            return;
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 123;
    }

    public final void writeString(C1382p c1382p) {
        _verifyValueWrite("write a string");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 34;
        int appendQuotedUTF8 = c1382p.appendQuotedUTF8(this.f20973h, this.f20974i);
        if (appendQuotedUTF8 < 0) {
            m19273a(c1382p.asQuotedUTF8());
        } else {
            this.f20974i += appendQuotedUTF8;
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        appendQuotedUTF8 = this.f20974i;
        this.f20974i = appendQuotedUTF8 + 1;
        bArr2[appendQuotedUTF8] = (byte) 34;
    }

    public final void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            m19269a();
            return;
        }
        int length = str.length();
        if (length > this.f20976k) {
            m19272a(str, true);
            return;
        }
        if (this.f20974i + length >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 34;
        m19271a(str, 0, length);
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        length = this.f20974i;
        this.f20974i = length + 1;
        bArr2[length] = (byte) 34;
    }

    public final void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write a string");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr = this.f20973h;
        int i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr[i3] = (byte) 34;
        if (i2 <= this.f20976k) {
            if (this.f20974i + i2 > this.f20975j) {
                m19277b();
            }
            m19279b(cArr, i, i2);
        } else {
            m19275a(cArr, i, i2);
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        i = this.f20974i;
        this.f20974i = i + 1;
        bArr2[i] = (byte) 34;
    }

    public final void writeUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a string");
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        byte[] bArr2 = this.f20973h;
        int i3 = this.f20974i;
        this.f20974i = i3 + 1;
        bArr2[i3] = (byte) 34;
        if (i2 <= this.f20976k) {
            m19274a(bArr, i, i2);
        } else {
            do {
                int min = Math.min(this.f20976k, i2);
                m19274a(bArr, i, min);
                i += min;
                i2 -= min;
            } while (i2 > 0);
        }
        if (this.f20974i >= this.f20975j) {
            m19277b();
        }
        bArr = this.f20973h;
        i = this.f20974i;
        this.f20974i = i + 1;
        bArr[i] = (byte) 34;
    }
}
