package com.p111d.p112a.p114b.p116c;

import com.p111d.p112a.p114b.p539a.C6464a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1355l extends Writer {
    private final C1347c f4233a;
    private OutputStream f4234b;
    private byte[] f4235c;
    private final int f4236d = (this.f4235c.length - 4);
    private int f4237e = 0;
    private int f4238f;

    public C1355l(C1347c c1347c, OutputStream outputStream) {
        this.f4233a = c1347c;
        this.f4234b = outputStream;
        this.f4235c = c1347c.m3208f();
    }

    protected static String m3253a(int i) {
        StringBuilder stringBuilder;
        String str;
        if (i > 1114111) {
            stringBuilder = new StringBuilder("Illegal character point (0x");
            stringBuilder.append(Integer.toHexString(i));
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i >= C6464a.SURR1_FIRST) {
            stringBuilder = i <= C6464a.SURR1_LAST ? new StringBuilder("Unmatched first part of surrogate pair (0x") : new StringBuilder("Unmatched second part of surrogate pair (0x");
            stringBuilder.append(Integer.toHexString(i));
            str = ")";
        } else {
            stringBuilder = new StringBuilder("Illegal character point (0x");
            stringBuilder.append(Integer.toHexString(i));
            str = ") to output";
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private int m3254b(int i) {
        int i2 = this.f4238f;
        this.f4238f = 0;
        if (i >= C6464a.SURR2_FIRST) {
            if (i <= C6464a.SURR2_LAST) {
                return (65536 + ((i2 - C6464a.SURR1_FIRST) << 10)) + (i - C6464a.SURR2_FIRST);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(i2));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append("; illegal combination");
        throw new IOException(stringBuilder.toString());
    }

    private static void m3255c(int i) {
        throw new IOException(C1355l.m3253a(i));
    }

    public final Writer append(char c) {
        write((int) c);
        return this;
    }

    public final void close() {
        if (this.f4234b != null) {
            if (this.f4237e > 0) {
                this.f4234b.write(this.f4235c, 0, this.f4237e);
                this.f4237e = 0;
            }
            OutputStream outputStream = this.f4234b;
            this.f4234b = null;
            byte[] bArr = this.f4235c;
            if (bArr != null) {
                this.f4235c = null;
                this.f4233a.m3200b(bArr);
            }
            outputStream.close();
            int i = this.f4238f;
            this.f4238f = 0;
            if (i > 0) {
                C1355l.m3255c(i);
            }
        }
    }

    public final void flush() {
        if (this.f4234b != null) {
            if (this.f4237e > 0) {
                this.f4234b.write(this.f4235c, 0, this.f4237e);
                this.f4237e = 0;
            }
            this.f4234b.flush();
        }
    }

    public final void write(int i) {
        if (this.f4238f > 0) {
            i = m3254b(i);
        } else if (i >= C6464a.SURR1_FIRST && i <= C6464a.SURR2_LAST) {
            if (i > C6464a.SURR1_LAST) {
                C1355l.m3255c(i);
            }
            this.f4238f = i;
            return;
        }
        if (this.f4237e >= this.f4236d) {
            this.f4234b.write(this.f4235c, 0, this.f4237e);
            this.f4237e = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f4235c;
            int i2 = this.f4237e;
            this.f4237e = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        int i3;
        i2 = this.f4237e;
        int i4;
        if (i < 2048) {
            i4 = i2 + 1;
            this.f4235c[i2] = (byte) (192 | (i >> 6));
            i3 = i4 + 1;
            this.f4235c[i4] = (byte) ((i & 63) | 128);
        } else if (i <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
            i4 = i2 + 1;
            this.f4235c[i2] = (byte) (224 | (i >> 12));
            i3 = i4 + 1;
            this.f4235c[i4] = (byte) (((i >> 6) & 63) | 128);
            i4 = i3 + 1;
            this.f4235c[i3] = (byte) ((i & 63) | 128);
            i3 = i4;
        } else {
            if (i > 1114111) {
                C1355l.m3255c(i);
            }
            i4 = i2 + 1;
            this.f4235c[i2] = (byte) (240 | (i >> 18));
            i3 = i4 + 1;
            this.f4235c[i4] = (byte) (((i >> 12) & 63) | 128);
            i4 = i3 + 1;
            this.f4235c[i3] = (byte) (((i >> 6) & 63) | 128);
            i3 = i4 + 1;
            this.f4235c[i4] = (byte) ((i & 63) | 128);
        }
        this.f4237e = i3;
    }

    public final void write(String str) {
        write(str, 0, str.length());
    }

    public final void write(String str, int i, int i2) {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
            }
            return;
        }
        int i3;
        if (this.f4238f > 0) {
            i3 = i + 1;
            i2--;
            write(m3254b(str.charAt(i)));
            i = i3;
        }
        i3 = this.f4237e;
        byte[] bArr = this.f4235c;
        int i4 = this.f4236d;
        i2 += i;
        while (i < i2) {
            int i5;
            if (i3 >= i4) {
                this.f4234b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            i = str.charAt(i);
            if (i < 128) {
                i5 = i3 + 1;
                bArr[i3] = (byte) i;
                i = i2 - i6;
                i3 = i4 - i5;
                if (i > i3) {
                    i = i3;
                }
                i += i6;
                i3 = i5;
                while (i6 < i) {
                    i5 = i6 + 1;
                    char charAt = str.charAt(i6);
                    if (charAt < '') {
                        int i7 = i3 + 1;
                        bArr[i3] = (byte) charAt;
                        i6 = i5;
                        i3 = i7;
                    } else {
                        i = charAt;
                        i6 = i5;
                    }
                }
                i = i6;
            }
            if (i < 2048) {
                i5 = i3 + 1;
                bArr[i3] = (byte) (192 | (i >> 6));
                i3 = i5 + 1;
                bArr[i5] = (byte) ((i & 63) | 128);
                i = i6;
            } else {
                if (i >= C6464a.SURR1_FIRST) {
                    if (i <= C6464a.SURR2_LAST) {
                        if (i > C6464a.SURR1_LAST) {
                            this.f4237e = i3;
                            C1355l.m3255c(i);
                        }
                        this.f4238f = i;
                        if (i6 >= i2) {
                            break;
                        }
                        i = i6 + 1;
                        i6 = m3254b(str.charAt(i6));
                        if (i6 > 1114111) {
                            this.f4237e = i3;
                            C1355l.m3255c(i6);
                        }
                        i5 = i3 + 1;
                        bArr[i3] = (byte) (240 | (i6 >> 18));
                        i3 = i5 + 1;
                        bArr[i5] = (byte) (((i6 >> 12) & 63) | 128);
                        i5 = i3 + 1;
                        bArr[i3] = (byte) (((i6 >> 6) & 63) | 128);
                        i3 = i5 + 1;
                        bArr[i5] = (byte) ((i6 & 63) | 128);
                    }
                }
                i5 = i3 + 1;
                bArr[i3] = (byte) (224 | (i >> 12));
                i3 = i5 + 1;
                bArr[i5] = (byte) (((i >> 6) & 63) | 128);
                i5 = i3 + 1;
                bArr[i3] = (byte) ((i & 63) | 128);
                i = i6;
                i3 = i5;
            }
        }
        this.f4237e = i3;
    }

    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public final void write(char[] cArr, int i, int i2) {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
            }
            return;
        }
        int i3;
        if (this.f4238f > 0) {
            i3 = i + 1;
            i2--;
            write(m3254b(cArr[i]));
            i = i3;
        }
        i3 = this.f4237e;
        byte[] bArr = this.f4235c;
        int i4 = this.f4236d;
        i2 += i;
        while (i < i2) {
            int i5;
            if (i3 >= i4) {
                this.f4234b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            i = cArr[i];
            if (i < 128) {
                i5 = i3 + 1;
                bArr[i3] = (byte) i;
                i = i2 - i6;
                i3 = i4 - i5;
                if (i > i3) {
                    i = i3;
                }
                i += i6;
                i3 = i5;
                while (i6 < i) {
                    i5 = i6 + 1;
                    char c = cArr[i6];
                    if (c < '') {
                        int i7 = i3 + 1;
                        bArr[i3] = (byte) c;
                        i6 = i5;
                        i3 = i7;
                    } else {
                        i = c;
                        i6 = i5;
                    }
                }
                i = i6;
            }
            if (i < 2048) {
                i5 = i3 + 1;
                bArr[i3] = (byte) (192 | (i >> 6));
                i3 = i5 + 1;
                bArr[i5] = (byte) ((i & 63) | 128);
                i = i6;
            } else {
                if (i >= C6464a.SURR1_FIRST) {
                    if (i <= C6464a.SURR2_LAST) {
                        if (i > C6464a.SURR1_LAST) {
                            this.f4237e = i3;
                            C1355l.m3255c(i);
                        }
                        this.f4238f = i;
                        if (i6 >= i2) {
                            break;
                        }
                        i = i6 + 1;
                        i6 = m3254b(cArr[i6]);
                        if (i6 > 1114111) {
                            this.f4237e = i3;
                            C1355l.m3255c(i6);
                        }
                        i5 = i3 + 1;
                        bArr[i3] = (byte) (240 | (i6 >> 18));
                        i3 = i5 + 1;
                        bArr[i5] = (byte) (((i6 >> 12) & 63) | 128);
                        i5 = i3 + 1;
                        bArr[i3] = (byte) (((i6 >> 6) & 63) | 128);
                        i3 = i5 + 1;
                        bArr[i5] = (byte) ((i6 & 63) | 128);
                    }
                }
                i5 = i3 + 1;
                bArr[i3] = (byte) (224 | (i >> 12));
                i3 = i5 + 1;
                bArr[i5] = (byte) (((i >> 6) & 63) | 128);
                i5 = i3 + 1;
                bArr[i3] = (byte) ((i & 63) | 128);
                i = i6;
                i3 = i5;
            }
        }
        this.f4237e = i3;
    }
}
