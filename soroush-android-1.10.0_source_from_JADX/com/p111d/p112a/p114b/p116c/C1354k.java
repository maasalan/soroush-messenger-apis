package com.p111d.p112a.p114b.p116c;

import com.p111d.p112a.p114b.p539a.C6464a;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1354k extends Reader {
    protected final C1347c f4222a;
    protected InputStream f4223b;
    protected byte[] f4224c;
    protected int f4225d;
    protected int f4226e;
    protected final boolean f4227f;
    protected char f4228g = '\u0000';
    protected int f4229h;
    protected int f4230i;
    protected final boolean f4231j;
    protected char[] f4232k;

    public C1354k(C1347c c1347c, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.f4222a = c1347c;
        this.f4223b = inputStream;
        this.f4224c = bArr;
        this.f4225d = i;
        this.f4226e = i2;
        this.f4227f = z;
        if (inputStream != null) {
            z2 = true;
        }
        this.f4231j = z2;
    }

    private void m3250a() {
        byte[] bArr = this.f4224c;
        if (bArr != null) {
            this.f4224c = null;
            this.f4222a.m3196a(bArr);
        }
    }

    private boolean m3251a(int i) {
        this.f4230i += this.f4226e - i;
        if (i <= 0) {
            this.f4225d = 0;
            i = this.f4223b == null ? -1 : this.f4223b.read(this.f4224c);
            if (i <= 0) {
                this.f4226e = 0;
                if (i < 0) {
                    if (this.f4231j) {
                        m3250a();
                    }
                    return false;
                }
                C1354k.m3252b();
            }
        } else if (this.f4225d > 0) {
            System.arraycopy(this.f4224c, this.f4225d, this.f4224c, 0, i);
            this.f4225d = 0;
        }
        this.f4226e = i;
        while (this.f4226e < 4) {
            i = this.f4223b == null ? -1 : this.f4223b.read(this.f4224c, this.f4226e, this.f4224c.length - this.f4226e);
            if (i <= 0) {
                if (i < 0) {
                    if (this.f4231j) {
                        m3250a();
                    }
                    i = this.f4226e;
                    int i2 = this.f4230i + i;
                    int i3 = this.f4229h;
                    StringBuilder stringBuilder = new StringBuilder("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
                    stringBuilder.append(i);
                    stringBuilder.append(", needed 4, at char #");
                    stringBuilder.append(i3);
                    stringBuilder.append(", byte #");
                    stringBuilder.append(i2);
                    stringBuilder.append(")");
                    throw new CharConversionException(stringBuilder.toString());
                }
                C1354k.m3252b();
            }
            this.f4226e += i;
        }
        return true;
    }

    private static void m3252b() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public final void close() {
        InputStream inputStream = this.f4223b;
        if (inputStream != null) {
            this.f4223b = null;
            m3250a();
            inputStream.close();
        }
    }

    public final int read() {
        if (this.f4232k == null) {
            this.f4232k = new char[1];
        }
        return read(this.f4232k, 0, 1) <= 0 ? -1 : this.f4232k[0];
    }

    public final int read(char[] cArr, int i, int i2) {
        if (this.f4224c == null) {
            return -1;
        }
        if (i2 <= 0) {
            return i2;
        }
        if (i >= 0) {
            int i3 = i + i2;
            if (i3 <= cArr.length) {
                int i4;
                if (this.f4228g != '\u0000') {
                    i2 = i + 1;
                    cArr[i] = this.f4228g;
                    this.f4228g = '\u0000';
                } else {
                    i2 = this.f4226e - this.f4225d;
                    if (i2 < 4 && !m3251a(i2)) {
                        return -1;
                    }
                    i2 = i;
                }
                while (i2 < i3) {
                    int i5 = this.f4225d;
                    if (this.f4227f) {
                        i4 = ((this.f4224c[i5] << 24) | ((this.f4224c[i5 + 1] & 255) << 16)) | ((this.f4224c[i5 + 2] & 255) << 8);
                        i5 = this.f4224c[i5 + 3] & 255;
                    } else {
                        i4 = ((this.f4224c[i5] & 255) | ((this.f4224c[i5 + 1] & 255) << 8)) | ((this.f4224c[i5 + 2] & 255) << 16);
                        i5 = this.f4224c[i5 + 3] << 24;
                    }
                    i5 |= i4;
                    this.f4225d += 4;
                    if (i5 > InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                        if (i5 > 1114111) {
                            i2 -= i;
                            StringBuilder stringBuilder = new StringBuilder("(above ");
                            stringBuilder.append(Integer.toHexString(1114111));
                            stringBuilder.append(") ");
                            String stringBuilder2 = stringBuilder.toString();
                            i = (this.f4230i + this.f4225d) - 1;
                            i3 = this.f4229h + i2;
                            StringBuilder stringBuilder3 = new StringBuilder("Invalid UTF-32 character 0x");
                            stringBuilder3.append(Integer.toHexString(i5));
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append(" at char #");
                            stringBuilder3.append(i3);
                            stringBuilder3.append(", byte #");
                            stringBuilder3.append(i);
                            stringBuilder3.append(")");
                            throw new CharConversionException(stringBuilder3.toString());
                        }
                        i5 -= 65536;
                        i4 = i2 + 1;
                        cArr[i2] = (char) (C6464a.SURR1_FIRST + (i5 >> 10));
                        i5 = (i5 & 1023) | C6464a.SURR2_FIRST;
                        if (i4 >= i3) {
                            this.f4228g = (char) i5;
                            break;
                        }
                        i2 = i4;
                    }
                    i4 = i2 + 1;
                    cArr[i2] = (char) i5;
                    if (this.f4225d >= this.f4226e) {
                        break;
                    }
                    i2 = i4;
                }
                i4 = i2;
                i4 -= i;
                this.f4229h += i4;
                return i4;
            }
        }
        StringBuilder stringBuilder4 = new StringBuilder("read(buf,");
        stringBuilder4.append(i);
        stringBuilder4.append(",");
        stringBuilder4.append(i2);
        stringBuilder4.append("), cbuf[");
        stringBuilder4.append(cArr.length);
        stringBuilder4.append("]");
        throw new ArrayIndexOutOfBoundsException(stringBuilder4.toString());
    }
}
