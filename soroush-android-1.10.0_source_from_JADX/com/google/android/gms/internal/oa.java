package com.google.android.gms.internal;

import com.p111d.p112a.p114b.p539a.C6464a;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class oa {
    private final ByteBuffer f6238a;

    private oa(ByteBuffer byteBuffer) {
        this.f6238a = byteBuffer;
        this.f6238a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private oa(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int m5068a(int i) {
        return i >= 0 ? m5081c(i) : 10;
    }

    private static int m5069a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            StringBuilder stringBuilder;
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i2);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                if (i3 < length) {
                    return i3;
                }
                long j = ((long) i3) + IjkMediaMeta.AV_CH_WIDE_RIGHT;
                stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i3 < length) {
            return i3;
        }
        long j2 = ((long) i3) + IjkMediaMeta.AV_CH_WIDE_RIGHT;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(j2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int m5070a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        i2 += i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            if (i4 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i4] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        i += i3;
        while (i3 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) (960 | (charAt2 >>> 6));
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
                i3++;
            } else if ((charAt2 < '?' || '?' < charAt2) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) (480 | (charAt2 >>> 12));
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | 128);
            } else if (i <= i2 - 4) {
                i5 = i3 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        i4 = i + 1;
                        bArr[i] = (byte) (240 | (i3 >>> 18));
                        i = i4 + 1;
                        bArr[i4] = (byte) (((i3 >>> 12) & 63) | 128);
                        i4 = i + 1;
                        bArr[i] = (byte) (((i3 >>> 6) & 63) | 128);
                        i = i4 + 1;
                        bArr[i4] = (byte) ((i3 & 63) | 128);
                        i3 = i5;
                        i3++;
                    } else {
                        i3 = i5;
                    }
                }
                i3--;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Unpaired surrogate at index ");
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(37);
                stringBuilder2.append("Failed writing ");
                stringBuilder2.append(charAt2);
                stringBuilder2.append(" at index ");
                stringBuilder2.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }

    public static int m5071a(String str) {
        int a = m5069a((CharSequence) str);
        return m5081c(a) + a;
    }

    public static int m5072a(byte[] bArr) {
        return m5081c(bArr.length) + bArr.length;
    }

    public static oa m5073a(byte[] bArr, int i) {
        return new oa(bArr, i);
    }

    private static void m5074a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m5070a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            m5080b(charSequence, byteBuffer);
        }
    }

    public static int m5075b(int i, int i2) {
        return m5081c(i << 3) + m5068a(i2);
    }

    public static int m5076b(int i, oi oiVar) {
        i = m5081c(i << 3);
        int f = oiVar.m5129f();
        return i + (m5081c(f) + f);
    }

    public static int m5077b(int i, String str) {
        return m5081c(i << 3) + m5071a(str);
    }

    public static int m5078b(int i, byte[] bArr) {
        return m5081c(i << 3) + m5072a(bArr);
    }

    public static int m5079b(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private static void m5080b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i);
            if (charAt >= 128) {
                int i2;
                if (charAt < 2048) {
                    i2 = 960 | (charAt >>> 6);
                } else {
                    if (charAt >= C6464a.SURR1_FIRST) {
                        if (C6464a.SURR2_LAST >= charAt) {
                            i2 = i + 1;
                            if (i2 != charSequence.length()) {
                                char charAt2 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    i = Character.toCodePoint(charAt, charAt2);
                                    byteBuffer.put((byte) (240 | (i >>> 18)));
                                    byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((i & 63) | 128));
                                    i = i2;
                                    i++;
                                } else {
                                    i = i2;
                                }
                            }
                            i--;
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    byteBuffer.put((byte) (480 | (charAt >>> 12)));
                    i2 = ((charAt >>> 6) & 63) | 128;
                }
                byteBuffer.put((byte) i2);
                charAt = (charAt & 63) | 128;
            }
            byteBuffer.put((byte) charAt);
            i++;
        }
    }

    public static int m5081c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int m5082c(int i, long j) {
        return m5081c(i << 3) + m5079b(j);
    }

    static long m5083c(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private final void m5084d(int i) {
        byte b = (byte) i;
        if (this.f6238a.hasRemaining()) {
            this.f6238a.put(b);
            return;
        }
        throw new ob(this.f6238a.position(), this.f6238a.limit());
    }

    public final void m5085a() {
        if (this.f6238a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f6238a.remaining())}));
        }
    }

    public final void m5086a(int i, double d) {
        m5099c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f6238a.remaining() < 8) {
            throw new ob(this.f6238a.position(), this.f6238a.limit());
        }
        this.f6238a.putLong(doubleToLongBits);
    }

    public final void m5087a(int i, float f) {
        m5099c(i, 5);
        i = Float.floatToIntBits(f);
        if (this.f6238a.remaining() < 4) {
            throw new ob(this.f6238a.position(), this.f6238a.limit());
        }
        this.f6238a.putInt(i);
    }

    public final void m5088a(int i, int i2) {
        m5099c(i, 0);
        if (i2 >= 0) {
            m5096b(i2);
        } else {
            m5094a((long) i2);
        }
    }

    public final void m5089a(int i, long j) {
        m5099c(i, 0);
        m5094a(j);
    }

    public final void m5090a(int i, oi oiVar) {
        m5099c(i, 2);
        m5095a(oiVar);
    }

    public final void m5091a(int i, String str) {
        m5099c(i, 2);
        try {
            i = m5081c(str.length());
            if (i == m5081c(str.length() * 3)) {
                int position = this.f6238a.position();
                if (this.f6238a.remaining() < i) {
                    throw new ob(position + i, this.f6238a.limit());
                }
                this.f6238a.position(position + i);
                m5074a((CharSequence) str, this.f6238a);
                int position2 = this.f6238a.position();
                this.f6238a.position(position);
                m5096b((position2 - position) - i);
                this.f6238a.position(position2);
                return;
            }
            m5096b(m5069a((CharSequence) str));
            m5074a((CharSequence) str, this.f6238a);
        } catch (Throwable e) {
            ob obVar = new ob(this.f6238a.position(), this.f6238a.limit());
            obVar.initCause(e);
            throw obVar;
        }
    }

    public final void m5092a(int i, boolean z) {
        m5099c(i, 0);
        byte b = (byte) z;
        if (this.f6238a.hasRemaining()) {
            this.f6238a.put(b);
            return;
        }
        throw new ob(this.f6238a.position(), this.f6238a.limit());
    }

    public final void m5093a(int i, byte[] bArr) {
        m5099c(i, 2);
        m5096b(bArr.length);
        m5098b(bArr);
    }

    final void m5094a(long j) {
        while ((j & -128) != 0) {
            m5084d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m5084d((int) j);
    }

    public final void m5095a(oi oiVar) {
        m5096b(oiVar.m5128e());
        oiVar.mo1667a(this);
    }

    public final void m5096b(int i) {
        while ((i & -128) != 0) {
            m5084d((i & 127) | 128);
            i >>>= 7;
        }
        m5084d(i);
    }

    public final void m5097b(int i, long j) {
        m5099c(i, 0);
        m5094a(j);
    }

    public final void m5098b(byte[] bArr) {
        int length = bArr.length;
        if (this.f6238a.remaining() >= length) {
            this.f6238a.put(bArr, 0, length);
            return;
        }
        throw new ob(this.f6238a.position(), this.f6238a.limit());
    }

    public final void m5099c(int i, int i2) {
        m5096b((i << 3) | i2);
    }
}
