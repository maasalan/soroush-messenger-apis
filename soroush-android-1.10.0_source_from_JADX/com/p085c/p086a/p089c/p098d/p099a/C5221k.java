package com.p085c.p086a.p089c.p098d.p099a;

import android.util.Log;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.C1206f.C1205a;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p109i.C1271h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C5221k implements C1206f {
    static final byte[] f14549a = "Exif\u0000\u0000".getBytes(Charset.forName(StringUtils.UTF8));
    private static final int[] f14550b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class C1183b {
        final ByteBuffer f3756a;

        C1183b(byte[] bArr, int i) {
            this.f3756a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean m2808a(int i, int i2) {
            return this.f3756a.remaining() - i >= i2;
        }

        final int m2809a(int i) {
            return m2808a(i, 4) ? this.f3756a.getInt(i) : -1;
        }

        final short m2810b(int i) {
            return m2808a(i, 2) ? this.f3756a.getShort(i) : (short) -1;
        }
    }

    private interface C1184c {
        int mo1202a();

        int mo1203a(byte[] bArr, int i);

        long mo1204a(long j);

        short mo1205b();

        int mo1206c();
    }

    private static final class C5219a implements C1184c {
        private final ByteBuffer f14547a;

        C5219a(ByteBuffer byteBuffer) {
            this.f14547a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int mo1202a() {
            return ((mo1206c() << 8) & 65280) | (mo1206c() & 255);
        }

        public final int mo1203a(byte[] bArr, int i) {
            i = Math.min(i, this.f14547a.remaining());
            if (i == 0) {
                return -1;
            }
            this.f14547a.get(bArr, 0, i);
            return i;
        }

        public final long mo1204a(long j) {
            int min = (int) Math.min((long) this.f14547a.remaining(), j);
            this.f14547a.position(this.f14547a.position() + min);
            return (long) min;
        }

        public final short mo1205b() {
            return (short) (mo1206c() & 255);
        }

        public final int mo1206c() {
            return this.f14547a.remaining() <= 0 ? -1 : this.f14547a.get();
        }
    }

    private static final class C5220d implements C1184c {
        private final InputStream f14548a;

        C5220d(InputStream inputStream) {
            this.f14548a = inputStream;
        }

        public final int mo1202a() {
            return ((this.f14548a.read() << 8) & 65280) | (this.f14548a.read() & 255);
        }

        public final int mo1203a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f14548a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        public final long mo1204a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f14548a.skip(j2);
                if (skip <= 0) {
                    if (this.f14548a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        public final short mo1205b() {
            return (short) (this.f14548a.read() & 255);
        }

        public final int mo1206c() {
            return this.f14548a.read();
        }
    }

    private static int m10790a(C1183b c1183b) {
        ByteOrder byteOrder;
        int a;
        short b;
        short s;
        int i;
        short b2;
        short b3;
        int a2;
        String str;
        StringBuilder stringBuilder;
        String stringBuilder2;
        short b4 = c1183b.m2810b(6);
        if (b4 != (short) 19789) {
            if (b4 == (short) 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                c1183b.f3756a.order(byteOrder);
                a = c1183b.m2809a(10) + 6;
                b = c1183b.m2810b(a);
                for (s = (short) 0; s < b; s++) {
                    i = (a + 2) + (12 * s);
                    b2 = c1183b.m2810b(i);
                    if (b2 == (short) 274) {
                        b3 = c1183b.m2810b(i + 2);
                        if (b3 > (short) 0) {
                            if (b3 > (short) 12) {
                                a2 = c1183b.m2809a(i + 4);
                                if (a2 < 0) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        StringBuilder stringBuilder3 = new StringBuilder("Got tagIndex=");
                                        stringBuilder3.append(s);
                                        stringBuilder3.append(" tagType=");
                                        stringBuilder3.append(b2);
                                        stringBuilder3.append(" formatCode=");
                                        stringBuilder3.append(b3);
                                        stringBuilder3.append(" componentCount=");
                                        stringBuilder3.append(a2);
                                        Log.d("DfltImageHeaderParser", stringBuilder3.toString());
                                    }
                                    a2 += f14550b[b3];
                                    if (a2 > 4) {
                                        i += 8;
                                        if (i >= 0) {
                                            if (i > c1183b.f3756a.remaining()) {
                                                if (a2 >= 0) {
                                                    if (a2 + i > c1183b.f3756a.remaining()) {
                                                        return c1183b.m2810b(i);
                                                    }
                                                }
                                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    str = "DfltImageHeaderParser";
                                                    stringBuilder = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                                    stringBuilder.append(b2);
                                                    stringBuilder2 = stringBuilder.toString();
                                                    Log.d(str, stringBuilder2);
                                                }
                                            }
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            StringBuilder stringBuilder4 = new StringBuilder("Illegal tagValueOffset=");
                                            stringBuilder4.append(i);
                                            stringBuilder4.append(" tagType=");
                                            stringBuilder4.append(b2);
                                            Log.d("DfltImageHeaderParser", stringBuilder4.toString());
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = "DfltImageHeaderParser";
                                        stringBuilder = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                                        stringBuilder.append(b3);
                                        stringBuilder2 = stringBuilder.toString();
                                        Log.d(str, stringBuilder2);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "DfltImageHeaderParser";
                                    stringBuilder2 = "Negative tiff component count";
                                    Log.d(str, stringBuilder2);
                                }
                            }
                        }
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "DfltImageHeaderParser";
                            stringBuilder = new StringBuilder("Got invalid format code = ");
                            stringBuilder.append(b3);
                            stringBuilder2 = stringBuilder.toString();
                            Log.d(str, stringBuilder2);
                        }
                    }
                }
                return -1;
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder stringBuilder5 = new StringBuilder("Unknown endianness = ");
                stringBuilder5.append(b4);
                Log.d("DfltImageHeaderParser", stringBuilder5.toString());
            }
        }
        byteOrder = ByteOrder.BIG_ENDIAN;
        c1183b.f3756a.order(byteOrder);
        a = c1183b.m2809a(10) + 6;
        b = c1183b.m2810b(a);
        for (s = (short) 0; s < b; s++) {
            i = (a + 2) + (12 * s);
            b2 = c1183b.m2810b(i);
            if (b2 == (short) 274) {
                b3 = c1183b.m2810b(i + 2);
                if (b3 > (short) 0) {
                    if (b3 > (short) 12) {
                        a2 = c1183b.m2809a(i + 4);
                        if (a2 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder stringBuilder32 = new StringBuilder("Got tagIndex=");
                                stringBuilder32.append(s);
                                stringBuilder32.append(" tagType=");
                                stringBuilder32.append(b2);
                                stringBuilder32.append(" formatCode=");
                                stringBuilder32.append(b3);
                                stringBuilder32.append(" componentCount=");
                                stringBuilder32.append(a2);
                                Log.d("DfltImageHeaderParser", stringBuilder32.toString());
                            }
                            a2 += f14550b[b3];
                            if (a2 > 4) {
                                i += 8;
                                if (i >= 0) {
                                    if (i > c1183b.f3756a.remaining()) {
                                        if (a2 >= 0) {
                                            if (a2 + i > c1183b.f3756a.remaining()) {
                                                return c1183b.m2810b(i);
                                            }
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            str = "DfltImageHeaderParser";
                                            stringBuilder = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                            stringBuilder.append(b2);
                                            stringBuilder2 = stringBuilder.toString();
                                            Log.d(str, stringBuilder2);
                                        }
                                    }
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder stringBuilder42 = new StringBuilder("Illegal tagValueOffset=");
                                    stringBuilder42.append(i);
                                    stringBuilder42.append(" tagType=");
                                    stringBuilder42.append(b2);
                                    Log.d("DfltImageHeaderParser", stringBuilder42.toString());
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                str = "DfltImageHeaderParser";
                                stringBuilder = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                                stringBuilder.append(b3);
                                stringBuilder2 = stringBuilder.toString();
                                Log.d(str, stringBuilder2);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "DfltImageHeaderParser";
                            stringBuilder2 = "Negative tiff component count";
                            Log.d(str, stringBuilder2);
                        }
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    str = "DfltImageHeaderParser";
                    stringBuilder = new StringBuilder("Got invalid format code = ");
                    stringBuilder.append(b3);
                    stringBuilder2 = stringBuilder.toString();
                    Log.d(str, stringBuilder2);
                }
            }
        }
        return -1;
    }

    private static int m10791a(C1184c c1184c, C1104b c1104b) {
        Object obj;
        int i;
        int a;
        int a2 = c1184c.mo1202a();
        if (!((a2 & 65496) == 65496 || a2 == 19789)) {
            if (a2 != 18761) {
                obj = null;
                i = -1;
                if (obj != null) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        StringBuilder stringBuilder = new StringBuilder("Parser doesn't handle magic number: ");
                        stringBuilder.append(a2);
                        Log.d("DfltImageHeaderParser", stringBuilder.toString());
                    }
                    return -1;
                }
                a2 = C5221k.m10794b(c1184c);
                if (a2 != -1) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    }
                    return -1;
                }
                obj = (byte[]) c1104b.mo1130a(a2, byte[].class);
                try {
                    a = c1184c.mo1203a(obj, a2);
                    if (a == a2) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder stringBuilder2 = new StringBuilder("Unable to read exif segment data, length: ");
                            stringBuilder2.append(a2);
                            stringBuilder2.append(", actually read: ");
                            stringBuilder2.append(a);
                            Log.d("DfltImageHeaderParser", stringBuilder2.toString());
                        }
                    } else if (C5221k.m10793a((byte[]) obj, a2)) {
                        i = C5221k.m10790a(new C1183b(obj, a2));
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                    }
                    c1104b.mo1133a(obj, byte[].class);
                    return i;
                } catch (Throwable th) {
                    c1104b.mo1133a(obj, byte[].class);
                }
            }
        }
        obj = 1;
        i = -1;
        if (obj != null) {
            a2 = C5221k.m10794b(c1184c);
            if (a2 != -1) {
                obj = (byte[]) c1104b.mo1130a(a2, byte[].class);
                a = c1184c.mo1203a(obj, a2);
                if (a == a2) {
                    if (C5221k.m10793a((byte[]) obj, a2)) {
                        i = C5221k.m10790a(new C1183b(obj, a2));
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder stringBuilder22 = new StringBuilder("Unable to read exif segment data, length: ");
                    stringBuilder22.append(a2);
                    stringBuilder22.append(", actually read: ");
                    stringBuilder22.append(a);
                    Log.d("DfltImageHeaderParser", stringBuilder22.toString());
                }
                c1104b.mo1133a(obj, byte[].class);
                return i;
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder stringBuilder3 = new StringBuilder("Parser doesn't handle magic number: ");
            stringBuilder3.append(a2);
            Log.d("DfltImageHeaderParser", stringBuilder3.toString());
        }
        return -1;
    }

    private static C1205a m10792a(C1184c c1184c) {
        int a = c1184c.mo1202a();
        if (a == 65496) {
            return C1205a.JPEG;
        }
        a = ((a << 16) & -65536) | (c1184c.mo1202a() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        if (a == -1991225785) {
            c1184c.mo1204a(21);
            return c1184c.mo1206c() >= 3 ? C1205a.PNG_A : C1205a.PNG;
        } else if ((a >> 8) == 4671814) {
            return C1205a.GIF;
        } else {
            if (a != 1380533830) {
                return C1205a.UNKNOWN;
            }
            c1184c.mo1204a(4);
            if ((((c1184c.mo1202a() << 16) & -65536) | (c1184c.mo1202a() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE)) != 1464156752) {
                return C1205a.UNKNOWN;
            }
            a = ((c1184c.mo1202a() << 16) & -65536) | (c1184c.mo1202a() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
            if ((a & -256) != 1448097792) {
                return C1205a.UNKNOWN;
            }
            a &= 255;
            if (a == 88) {
                c1184c.mo1204a(4);
                return (c1184c.mo1206c() & 16) != 0 ? C1205a.WEBP_A : C1205a.WEBP;
            } else if (a != 76) {
                return C1205a.WEBP;
            } else {
                c1184c.mo1204a(4);
                return (c1184c.mo1206c() & 8) != 0 ? C1205a.WEBP_A : C1205a.WEBP;
            }
        }
    }

    private static boolean m10793a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f14549a.length;
        if (z) {
            for (int i2 = 0; i2 < f14549a.length; i2++) {
                if (bArr[i2] != f14549a[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static int m10794b(C1184c c1184c) {
        long a;
        long j;
        do {
            short b = c1184c.mo1205b();
            if (b != (short) 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder stringBuilder = new StringBuilder("Unknown segmentId=");
                    stringBuilder.append(b);
                    Log.d("DfltImageHeaderParser", stringBuilder.toString());
                }
                return -1;
            }
            b = c1184c.mo1205b();
            if (b == (short) 218) {
                return -1;
            }
            if (b == (short) 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            int a2 = c1184c.mo1202a() - 2;
            if (b == (short) 225) {
                return a2;
            }
            j = (long) a2;
            a = c1184c.mo1204a(j);
        } while (a == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder stringBuilder2 = new StringBuilder("Unable to skip enough data, type: ");
            stringBuilder2.append(b);
            stringBuilder2.append(", wanted to skip: ");
            stringBuilder2.append(a2);
            stringBuilder2.append(", but actually skipped: ");
            stringBuilder2.append(a);
            Log.d("DfltImageHeaderParser", stringBuilder2.toString());
        }
        return -1;
    }

    public final int mo1207a(InputStream inputStream, C1104b c1104b) {
        return C5221k.m10791a(new C5220d((InputStream) C1271h.m3012a((Object) inputStream, "Argument must not be null")), (C1104b) C1271h.m3012a((Object) c1104b, "Argument must not be null"));
    }

    public final C1205a mo1208a(InputStream inputStream) {
        return C5221k.m10792a(new C5220d((InputStream) C1271h.m3012a((Object) inputStream, "Argument must not be null")));
    }

    public final C1205a mo1209a(ByteBuffer byteBuffer) {
        return C5221k.m10792a(new C5219a((ByteBuffer) C1271h.m3012a((Object) byteBuffer, "Argument must not be null")));
    }
}
