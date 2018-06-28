package com.google.p164b.p170d;

import com.google.p164b.C5594p;
import com.google.p164b.p166b.C1920e;
import com.google.p164b.p166b.p167a.C5538e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import org.jivesoftware.smack.roster.Roster;

public class C1935a implements Closeable {
    private static final char[] f6426c = ")]}'\n".toCharArray();
    public boolean f6427a = false;
    int f6428b = 0;
    private final Reader f6429d;
    private final char[] f6430e = new char[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
    private int f6431f = 0;
    private int f6432g = 0;
    private int f6433h = 0;
    private int f6434i = 0;
    private long f6435j;
    private int f6436k;
    private String f6437l;
    private int[] f6438m = new int[32];
    private int f6439n = 0;
    private String[] f6440o;
    private int[] f6441p;

    static class C55821 extends C1920e {
        C55821() {
        }

        public final void mo1750a(C1935a c1935a) {
            if (c1935a instanceof C5538e) {
                C5538e c5538e = (C5538e) c1935a;
                c5538e.m12115a(C1936b.NAME);
                Entry entry = (Entry) ((Iterator) c5538e.mo1721g()).next();
                c5538e.m12116a(entry.getValue());
                c5538e.m12116a(new C5594p((String) entry.getKey()));
                return;
            }
            int i = c1935a.f6428b;
            if (i == 0) {
                i = c1935a.m5320q();
            }
            if (i == 13) {
                c1935a.f6428b = 9;
            } else if (i == 12) {
                c1935a.f6428b = 8;
            } else if (i == 14) {
                c1935a.f6428b = 10;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
                stringBuilder.append(c1935a.mo1720f());
                stringBuilder.append(c1935a.m5321r());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    static {
        C1920e.f6395a = new C55821();
    }

    public C1935a(Reader reader) {
        int[] iArr = this.f6438m;
        int i = this.f6439n;
        this.f6439n = i + 1;
        iArr[i] = 6;
        this.f6440o = new String[32];
        this.f6441p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f6429d = reader;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m5292a(boolean r10) {
        /*
        r9 = this;
        r0 = r9.f6430e;
    L_0x0002:
        r1 = r9.f6431f;
    L_0x0004:
        r2 = r9.f6432g;
    L_0x0006:
        r3 = 1;
        if (r1 != r2) goto L_0x0032;
    L_0x0009:
        r9.f6431f = r1;
        r1 = r9.m5297b(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r1 = r9.f6431f;
        r2 = r9.f6432g;
        goto L_0x0032;
    L_0x0016:
        if (r10 == 0) goto L_0x0030;
    L_0x0018:
        r10 = new java.io.EOFException;
        r0 = new java.lang.StringBuilder;
        r1 = "End of input";
        r0.<init>(r1);
        r1 = r9.m5321r();
        r0.append(r1);
        r0 = r0.toString();
        r10.<init>(r0);
        throw r10;
    L_0x0030:
        r10 = -1;
        return r10;
    L_0x0032:
        r4 = r1 + 1;
        r1 = r0[r1];
        r5 = 10;
        if (r1 != r5) goto L_0x0043;
    L_0x003a:
        r1 = r9.f6433h;
        r1 = r1 + r3;
        r9.f6433h = r1;
        r9.f6434i = r4;
        goto L_0x00e3;
    L_0x0043:
        r6 = 32;
        if (r1 == r6) goto L_0x00e3;
    L_0x0047:
        r6 = 13;
        if (r1 == r6) goto L_0x00e3;
    L_0x004b:
        r6 = 9;
        if (r1 == r6) goto L_0x00e3;
    L_0x004f:
        r6 = 47;
        if (r1 != r6) goto L_0x00d2;
    L_0x0053:
        r9.f6431f = r4;
        r7 = 2;
        if (r4 != r2) goto L_0x0069;
    L_0x0058:
        r2 = r9.f6431f;
        r2 = r2 - r3;
        r9.f6431f = r2;
        r2 = r9.m5297b(r7);
        r4 = r9.f6431f;
        r4 = r4 + r3;
        r9.f6431f = r4;
        if (r2 != 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        r9.m5302u();
        r2 = r9.f6431f;
        r2 = r0[r2];
        r4 = 42;
        if (r2 == r4) goto L_0x007d;
    L_0x0074:
        if (r2 == r6) goto L_0x0077;
    L_0x0076:
        return r1;
    L_0x0077:
        r1 = r9.f6431f;
        r1 = r1 + r3;
        r9.f6431f = r1;
        goto L_0x00db;
    L_0x007d:
        r1 = r9.f6431f;
        r1 = r1 + r3;
        r9.f6431f = r1;
        r1 = "*/";
        r2 = r1.length();
    L_0x0088:
        r4 = r9.f6431f;
        r4 = r4 + r2;
        r6 = r9.f6432g;
        r8 = 0;
        if (r4 <= r6) goto L_0x0099;
    L_0x0090:
        r4 = r9.m5297b(r2);
        if (r4 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x0099;
    L_0x0097:
        r3 = r8;
        goto L_0x00c4;
    L_0x0099:
        r4 = r9.f6430e;
        r6 = r9.f6431f;
        r4 = r4[r6];
        if (r4 != r5) goto L_0x00ac;
    L_0x00a1:
        r4 = r9.f6433h;
        r4 = r4 + r3;
        r9.f6433h = r4;
        r4 = r9.f6431f;
        r4 = r4 + r3;
        r9.f6434i = r4;
        goto L_0x00be;
    L_0x00ac:
        if (r8 >= r2) goto L_0x00c4;
    L_0x00ae:
        r4 = r9.f6430e;
        r6 = r9.f6431f;
        r6 = r6 + r8;
        r4 = r4[r6];
        r6 = r1.charAt(r8);
        if (r4 != r6) goto L_0x00be;
    L_0x00bb:
        r8 = r8 + 1;
        goto L_0x00ac;
    L_0x00be:
        r4 = r9.f6431f;
        r4 = r4 + r3;
        r9.f6431f = r4;
        goto L_0x0088;
    L_0x00c4:
        if (r3 != 0) goto L_0x00cd;
    L_0x00c6:
        r10 = "Unterminated comment";
        r10 = r9.m5293a(r10);
        throw r10;
    L_0x00cd:
        r1 = r9.f6431f;
        r1 = r1 + r7;
        goto L_0x0004;
    L_0x00d2:
        r2 = 35;
        if (r1 != r2) goto L_0x00e0;
    L_0x00d6:
        r9.f6431f = r4;
        r9.m5302u();
    L_0x00db:
        r9.m5303v();
        goto L_0x0002;
    L_0x00e0:
        r9.f6431f = r4;
        return r1;
    L_0x00e3:
        r1 = r4;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.a.a(boolean):int");
    }

    private IOException m5293a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m5321r());
        throw new C1938d(stringBuilder.toString());
    }

    private void m5294a(int i) {
        if (this.f6439n == this.f6438m.length) {
            Object obj = new int[(this.f6439n * 2)];
            Object obj2 = new int[(this.f6439n * 2)];
            Object obj3 = new String[(this.f6439n * 2)];
            System.arraycopy(this.f6438m, 0, obj, 0, this.f6439n);
            System.arraycopy(this.f6441p, 0, obj2, 0, this.f6439n);
            System.arraycopy(this.f6440o, 0, obj3, 0, this.f6439n);
            this.f6438m = obj;
            this.f6441p = obj2;
            this.f6440o = obj3;
        }
        int[] iArr = this.f6438m;
        int i2 = this.f6439n;
        this.f6439n = i2 + 1;
        iArr[i2] = i;
    }

    private boolean m5295a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                m5302u();
                break;
            default:
                return true;
        }
        return false;
    }

    private String m5296b(char c) {
        int i;
        int i2;
        char[] cArr = this.f6430e;
        StringBuilder stringBuilder = null;
        loop0:
        while (true) {
            i = this.f6431f;
            int i3 = this.f6432g;
            int i4 = i;
            while (i4 < i3) {
                i2 = i4 + 1;
                char c2 = cArr[i4];
                if (c2 == c) {
                    break loop0;
                } else if (c2 == '\\') {
                    this.f6431f = i2;
                    i2 = (i2 - i) - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max((i2 + 1) * 2, 16));
                    }
                    stringBuilder.append(cArr, i, i2);
                    stringBuilder.append(m5304w());
                } else {
                    if (c2 == '\n') {
                        this.f6433h++;
                        this.f6434i = i2;
                    }
                    i4 = i2;
                }
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max((i4 - i) * 2, 16));
            }
            stringBuilder.append(cArr, i, i4 - i);
            this.f6431f = i4;
            if (!m5297b(1)) {
                throw m5293a("Unterminated string");
            }
        }
        this.f6431f = i2;
        i2 = (i2 - i) - 1;
        if (stringBuilder == null) {
            return new String(cArr, i, i2);
        }
        stringBuilder.append(cArr, i, i2);
        return stringBuilder.toString();
    }

    private boolean m5297b(int i) {
        Object obj = this.f6430e;
        this.f6434i -= this.f6431f;
        if (this.f6432g != this.f6431f) {
            this.f6432g -= this.f6431f;
            System.arraycopy(obj, this.f6431f, obj, 0, this.f6432g);
        } else {
            this.f6432g = 0;
        }
        this.f6431f = 0;
        do {
            int read = this.f6429d.read(obj, this.f6432g, obj.length - this.f6432g);
            if (read == -1) {
                return false;
            }
            this.f6432g += read;
            if (this.f6433h == 0 && this.f6434i == 0 && this.f6432g > 0 && obj[0] == '﻿') {
                this.f6431f++;
                this.f6434i++;
                i++;
            }
        } while (this.f6432g < i);
        return true;
    }

    private void m5298c(char c) {
        char[] cArr = this.f6430e;
        while (true) {
            int i = this.f6431f;
            int i2 = this.f6432g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f6431f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f6431f = i3;
                    m5304w();
                    break;
                } else {
                    if (c2 == '\n') {
                        this.f6433h++;
                        this.f6434i = i3;
                    }
                    i = i3;
                }
            }
            this.f6431f = i;
            if (!m5297b(1)) {
                throw m5293a("Unterminated string");
            }
        }
    }

    private int mo1721g() {
        String str;
        String str2;
        int i;
        int length;
        int i2;
        char c;
        char c2 = this.f6430e[this.f6431f];
        if (c2 != 't') {
            if (c2 != 'T') {
                if (c2 != 'f') {
                    if (c2 != 'F') {
                        if (c2 != 'n') {
                            if (c2 != 'N') {
                                return 0;
                            }
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        length = str.length();
                        i2 = 1;
                        while (i2 < length) {
                            if (this.f6431f + i2 < this.f6432g && !m5297b(i2 + 1)) {
                                return 0;
                            }
                            c = this.f6430e[this.f6431f + i2];
                            if (c != str.charAt(i2) && c != r2.charAt(i2)) {
                                return 0;
                            }
                            i2++;
                        }
                        if ((this.f6431f + length >= this.f6432g || m5297b(length + 1)) && m5295a(this.f6430e[this.f6431f + length])) {
                            return 0;
                        }
                        this.f6431f += length;
                        this.f6428b = i;
                        return i;
                    }
                }
                str = "false";
                str2 = "FALSE";
                i = 6;
                length = str.length();
                i2 = 1;
                while (i2 < length) {
                    if (this.f6431f + i2 < this.f6432g) {
                    }
                    c = this.f6430e[this.f6431f + i2];
                    if (c != str.charAt(i2)) {
                    }
                    i2++;
                }
                if (this.f6431f + length >= this.f6432g) {
                }
                return 0;
            }
        }
        str = "true";
        str2 = "TRUE";
        i = 5;
        length = str.length();
        i2 = 1;
        while (i2 < length) {
            if (this.f6431f + i2 < this.f6432g) {
            }
            c = this.f6430e[this.f6431f + i2];
            if (c != str.charAt(i2)) {
            }
            i2++;
        }
        if (this.f6431f + length >= this.f6432g) {
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m5300s() {
        /*
        r21 = this;
        r0 = r21;
        r1 = r0.f6430e;
        r2 = r0.f6431f;
        r3 = r0.f6432g;
        r6 = 1;
        r7 = 0;
        r8 = r3;
        r10 = r6;
        r3 = r7;
        r9 = r3;
        r13 = r9;
        r11 = 0;
    L_0x0011:
        r14 = r2 + r3;
        r15 = 2;
        if (r14 != r8) goto L_0x0026;
    L_0x0016:
        r2 = r1.length;
        if (r3 != r2) goto L_0x001a;
    L_0x0019:
        return r7;
    L_0x001a:
        r2 = r3 + 1;
        r2 = r0.m5297b(r2);
        if (r2 == 0) goto L_0x0095;
    L_0x0022:
        r2 = r0.f6431f;
        r8 = r0.f6432g;
    L_0x0026:
        r14 = r2 + r3;
        r14 = r1[r14];
        r7 = 43;
        r4 = 3;
        r5 = 5;
        if (r14 == r7) goto L_0x00e9;
    L_0x0030:
        r7 = 69;
        if (r14 == r7) goto L_0x00dd;
    L_0x0034:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r14 == r7) goto L_0x00dd;
    L_0x0038:
        switch(r14) {
            case 45: goto L_0x00d0;
            case 46: goto L_0x00c9;
            default: goto L_0x003b;
        };
    L_0x003b:
        r7 = 48;
        if (r14 < r7) goto L_0x008d;
    L_0x003f:
        r7 = 57;
        if (r14 <= r7) goto L_0x0044;
    L_0x0043:
        goto L_0x008d;
    L_0x0044:
        if (r9 == r6) goto L_0x0082;
    L_0x0046:
        if (r9 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0082;
    L_0x0049:
        if (r9 != r15) goto L_0x0075;
    L_0x004b:
        r18 = 0;
        r4 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r4 != 0) goto L_0x0053;
    L_0x0051:
        r4 = 0;
        return r4;
    L_0x0053:
        r4 = 10;
        r4 = r4 * r11;
        r14 = r14 + -48;
        r14 = (long) r14;
        r16 = r4 - r14;
        r4 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r7 > 0) goto L_0x006f;
    L_0x0064:
        r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x006d;
    L_0x0068:
        r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1));
        if (r4 >= 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r4 = 0;
        goto L_0x0070;
    L_0x006f:
        r4 = r6;
    L_0x0070:
        r4 = r4 & r10;
        r10 = r4;
        r11 = r16;
        goto L_0x0088;
    L_0x0075:
        if (r9 != r4) goto L_0x007a;
    L_0x0077:
        r7 = 0;
        r9 = 4;
        goto L_0x0089;
    L_0x007a:
        if (r9 == r5) goto L_0x007f;
    L_0x007c:
        r4 = 6;
        if (r9 != r4) goto L_0x0088;
    L_0x007f:
        r7 = 0;
        r9 = 7;
        goto L_0x0089;
    L_0x0082:
        r14 = r14 + -48;
        r4 = -r14;
        r4 = (long) r4;
        r11 = r4;
        r9 = r15;
    L_0x0088:
        r7 = 0;
    L_0x0089:
        r18 = 0;
        goto L_0x00f0;
    L_0x008d:
        r1 = r0.m5295a(r14);
        if (r1 == 0) goto L_0x0095;
    L_0x0093:
        r1 = 0;
        return r1;
    L_0x0095:
        if (r9 != r15) goto L_0x00b9;
    L_0x0097:
        if (r10 == 0) goto L_0x00b9;
    L_0x0099:
        r1 = -9223372036854775808;
        r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r4 != 0) goto L_0x00a1;
    L_0x009f:
        if (r13 == 0) goto L_0x00b9;
    L_0x00a1:
        r18 = 0;
        r1 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r1 != 0) goto L_0x00a9;
    L_0x00a7:
        if (r13 != 0) goto L_0x00b9;
    L_0x00a9:
        if (r13 == 0) goto L_0x00ac;
    L_0x00ab:
        goto L_0x00ad;
    L_0x00ac:
        r11 = -r11;
    L_0x00ad:
        r0.f6435j = r11;
        r1 = r0.f6431f;
        r1 = r1 + r3;
        r0.f6431f = r1;
        r1 = 15;
    L_0x00b6:
        r0.f6428b = r1;
        return r1;
    L_0x00b9:
        if (r9 == r15) goto L_0x00c4;
    L_0x00bb:
        r1 = 4;
        if (r9 == r1) goto L_0x00c4;
    L_0x00be:
        r1 = 7;
        if (r9 != r1) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00c4;
    L_0x00c2:
        r7 = 0;
        return r7;
    L_0x00c4:
        r0.f6436k = r3;
        r1 = 16;
        goto L_0x00b6;
    L_0x00c9:
        r7 = 0;
        r18 = 0;
        if (r9 != r15) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00ef;
    L_0x00cf:
        return r7;
    L_0x00d0:
        r4 = 6;
        r7 = 0;
        r18 = 0;
        if (r9 != 0) goto L_0x00d9;
    L_0x00d6:
        r9 = r6;
        r13 = r9;
        goto L_0x00f0;
    L_0x00d9:
        if (r9 != r5) goto L_0x00dc;
    L_0x00db:
        goto L_0x00ef;
    L_0x00dc:
        return r7;
    L_0x00dd:
        r7 = 0;
        r18 = 0;
        if (r9 == r15) goto L_0x00e7;
    L_0x00e2:
        r4 = 4;
        if (r9 != r4) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00e7;
    L_0x00e6:
        return r7;
    L_0x00e7:
        r9 = r5;
        goto L_0x00f0;
    L_0x00e9:
        r4 = 6;
        r7 = 0;
        r18 = 0;
        if (r9 != r5) goto L_0x00f4;
    L_0x00ef:
        r9 = r4;
    L_0x00f0:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x00f4:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.a.s():int");
    }

    private String m5301t() {
        String str;
        int i = 0;
        StringBuilder stringBuilder = null;
        do {
            int i2 = 0;
            while (true) {
                if (this.f6431f + i2 < this.f6432g) {
                    switch (this.f6430e[this.f6431f + i2]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case '\\':
                            m5302u();
                            break;
                        default:
                            i2++;
                            break;
                    }
                } else if (i2 >= this.f6430e.length) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max(i2, 16));
                    }
                    stringBuilder.append(this.f6430e, this.f6431f, i2);
                    this.f6431f += i2;
                } else if (m5297b(i2 + 1)) {
                }
                i = i2;
                if (stringBuilder != null) {
                    str = new String(this.f6430e, this.f6431f, i);
                } else {
                    stringBuilder.append(this.f6430e, this.f6431f, i);
                    str = stringBuilder.toString();
                }
                this.f6431f += i;
                return str;
            }
        } while (m5297b(1));
        if (stringBuilder != null) {
            stringBuilder.append(this.f6430e, this.f6431f, i);
            str = stringBuilder.toString();
        } else {
            str = new String(this.f6430e, this.f6431f, i);
        }
        this.f6431f += i;
        return str;
    }

    private void m5302u() {
        if (!this.f6427a) {
            throw m5293a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void m5303v() {
        char c;
        do {
            if (this.f6431f >= this.f6432g && !m5297b(1)) {
                break;
            }
            char[] cArr = this.f6430e;
            int i = this.f6431f;
            this.f6431f = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.f6433h++;
                this.f6434i = this.f6431f;
                return;
            }
        } while (c != '\r');
    }

    private char m5304w() {
        if (this.f6431f != this.f6432g || m5297b(1)) {
            char[] cArr = this.f6430e;
            int i = this.f6431f;
            this.f6431f = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f6433h++;
                this.f6434i = this.f6431f;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                switch (c) {
                    case 't':
                        return '\t';
                    case 'u':
                        if (this.f6431f + 4 <= this.f6432g || m5297b(4)) {
                            c = '\u0000';
                            int i2 = this.f6431f;
                            int i3 = i2 + 4;
                            while (i2 < i3) {
                                int i4;
                                char c2 = this.f6430e[i2];
                                c = (char) (c << 4);
                                if (c2 < '0' || c2 > '9') {
                                    if (c2 >= 'a' && c2 <= 'f') {
                                        i4 = c2 - 97;
                                    } else if (c2 < 'A' || c2 > 'F') {
                                        StringBuilder stringBuilder = new StringBuilder("\\u");
                                        stringBuilder.append(new String(this.f6430e, this.f6431f, 4));
                                        throw new NumberFormatException(stringBuilder.toString());
                                    } else {
                                        i4 = c2 - 65;
                                    }
                                    i4 += 10;
                                } else {
                                    i4 = c2 - 48;
                                }
                                c = (char) (c + i4);
                                i2++;
                            }
                            this.f6431f += 4;
                            return c;
                        }
                        throw m5293a("Unterminated escape sequence");
                    default:
                        throw m5293a("Invalid escape sequence");
                }
            }
            return c;
        }
        throw m5293a("Unterminated escape sequence");
    }

    public void mo1714a() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 3) {
            m5294a(1);
            this.f6441p[this.f6439n - 1] = 0;
            this.f6428b = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(mo1720f());
        stringBuilder.append(m5321r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void mo1715b() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 4) {
            this.f6439n--;
            int[] iArr = this.f6441p;
            int i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6428b = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_ARRAY but was ");
        stringBuilder.append(mo1720f());
        stringBuilder.append(m5321r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void mo1716c() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 1) {
            m5294a(3);
            this.f6428b = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(mo1720f());
        stringBuilder.append(m5321r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.f6428b = 0;
        this.f6438m[0] = 8;
        this.f6439n = 1;
        this.f6429d.close();
    }

    public void mo1718d() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 2) {
            this.f6439n--;
            this.f6440o[this.f6439n] = null;
            int[] iArr = this.f6441p;
            int i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6428b = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_OBJECT but was ");
        stringBuilder.append(mo1720f());
        stringBuilder.append(m5321r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean mo1719e() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public C1936b mo1720f() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        switch (i) {
            case 1:
                return C1936b.BEGIN_OBJECT;
            case 2:
                return C1936b.END_OBJECT;
            case 3:
                return C1936b.BEGIN_ARRAY;
            case 4:
                return C1936b.END_ARRAY;
            case 5:
            case 6:
                return C1936b.BOOLEAN;
            case 7:
                return C1936b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C1936b.STRING;
            case 12:
            case 13:
            case 14:
                return C1936b.NAME;
            case 15:
            case 16:
                return C1936b.NUMBER;
            case 17:
                return C1936b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String mo1722h() {
        String t;
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 14) {
            t = m5301t();
        } else {
            char c;
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
                stringBuilder.append(mo1720f());
                stringBuilder.append(m5321r());
                throw new IllegalStateException(stringBuilder.toString());
            }
            t = m5296b(c);
        }
        this.f6428b = 0;
        this.f6440o[this.f6439n - 1] = t;
        return t;
    }

    public String mo1723i() {
        String t;
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 10) {
            t = m5301t();
        } else {
            char c;
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                t = this.f6437l;
                this.f6437l = null;
            } else if (i == 15) {
                t = Long.toString(this.f6435j);
            } else if (i == 16) {
                t = new String(this.f6430e, this.f6431f, this.f6436k);
                this.f6431f += this.f6436k;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Expected a string but was ");
                stringBuilder.append(mo1720f());
                stringBuilder.append(m5321r());
                throw new IllegalStateException(stringBuilder.toString());
            }
            t = m5296b(c);
        }
        this.f6428b = 0;
        int[] iArr = this.f6441p;
        int i2 = this.f6439n - 1;
        iArr[i2] = iArr[i2] + 1;
        return t;
    }

    public boolean mo1724j() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.f6428b = 0;
            iArr = this.f6441p;
            i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6428b = 0;
            iArr = this.f6441p;
            i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Expected a boolean but was ");
            stringBuilder.append(mo1720f());
            stringBuilder.append(m5321r());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void mo1725k() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 7) {
            this.f6428b = 0;
            int[] iArr = this.f6441p;
            int i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected null but was ");
        stringBuilder.append(mo1720f());
        stringBuilder.append(m5321r());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double mo1726l() {
        int i = this.f6428b;
        if (i == 0) {
            i = m5320q();
        }
        if (i == 15) {
            this.f6428b = 0;
            int[] iArr = this.f6441p;
            int i2 = this.f6439n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6435j;
        }
        if (i == 16) {
            this.f6437l = new String(this.f6430e, this.f6431f, this.f6436k);
            this.f6431f += this.f6436k;
        } else {
            String t;
            if (i != 8) {
                if (i != 9) {
                    if (i == 10) {
                        t = m5301t();
                        this.f6437l = t;
                    } else if (i != 11) {
                        StringBuilder stringBuilder = new StringBuilder("Expected a double but was ");
                        stringBuilder.append(mo1720f());
                        stringBuilder.append(m5321r());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            t = m5296b(i == 8 ? '\'' : '\"');
            this.f6437l = t;
        }
        this.f6428b = 11;
        double parseDouble = Double.parseDouble(this.f6437l);
        if (this.f6427a || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.f6437l = null;
            this.f6428b = 0;
            int[] iArr2 = this.f6441p;
            int i3 = this.f6439n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder stringBuilder2 = new StringBuilder("JSON forbids NaN and infinities: ");
        stringBuilder2.append(parseDouble);
        stringBuilder2.append(m5321r());
        throw new C1938d(stringBuilder2.toString());
    }

    public long mo1727m() {
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
        r8 = this;
        r0 = r8.f6428b;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r8.m5320q();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
    L_0x000d:
        r8.f6428b = r2;
        r0 = r8.f6441p;
        r1 = r8.f6439n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r8.f6435j;
        return r0;
    L_0x001e:
        r1 = 16;
        if (r0 != r1) goto L_0x0037;
    L_0x0022:
        r0 = new java.lang.String;
        r1 = r8.f6430e;
        r3 = r8.f6431f;
        r4 = r8.f6436k;
        r0.<init>(r1, r3, r4);
        r8.f6437l = r0;
        r0 = r8.f6431f;
        r1 = r8.f6436k;
        r0 = r0 + r1;
        r8.f6431f = r0;
        goto L_0x008d;
    L_0x0037:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0063;
    L_0x003d:
        r4 = 9;
        if (r0 == r4) goto L_0x0063;
    L_0x0041:
        if (r0 != r1) goto L_0x0044;
    L_0x0043:
        goto L_0x0063;
    L_0x0044:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a long but was ";
        r1.<init>(r2);
        r2 = r8.mo1720f();
        r1.append(r2);
        r2 = r8.m5321r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0063:
        if (r0 != r1) goto L_0x006c;
    L_0x0065:
        r0 = r8.m5301t();
    L_0x0069:
        r8.f6437l = r0;
        goto L_0x0078;
    L_0x006c:
        if (r0 != r3) goto L_0x0071;
    L_0x006e:
        r0 = 39;
        goto L_0x0073;
    L_0x0071:
        r0 = 34;
    L_0x0073:
        r0 = r8.m5296b(r0);
        goto L_0x0069;
    L_0x0078:
        r0 = r8.f6437l;	 Catch:{ NumberFormatException -> 0x008d }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x008d }
        r8.f6428b = r2;	 Catch:{ NumberFormatException -> 0x008d }
        r3 = r8.f6441p;	 Catch:{ NumberFormatException -> 0x008d }
        r4 = r8.f6439n;	 Catch:{ NumberFormatException -> 0x008d }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r3[r4];	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x008d }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x008d }
        return r0;
    L_0x008d:
        r0 = 11;
        r8.f6428b = r0;
        r0 = r8.f6437l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (long) r0;
        r5 = (double) r3;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 == 0) goto L_0x00ba;
    L_0x009d:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a long but was ";
        r1.<init>(r2);
        r2 = r8.f6437l;
        r1.append(r2);
        r2 = r8.m5321r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ba:
        r0 = 0;
        r8.f6437l = r0;
        r8.f6428b = r2;
        r0 = r8.f6441p;
        r1 = r8.f6439n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.a.m():long");
    }

    public int mo1728n() {
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
        r7 = this;
        r0 = r7.f6428b;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m5320q();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x0043;
    L_0x000d:
        r0 = r7.f6435j;
        r0 = (int) r0;
        r3 = r7.f6435j;
        r5 = (long) r0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x0034;
    L_0x0017:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.f6435j;
        r1.append(r2);
        r2 = r7.m5321r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0034:
        r7.f6428b = r2;
        r1 = r7.f6441p;
        r2 = r7.f6439n;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
    L_0x0043:
        r1 = 16;
        if (r0 != r1) goto L_0x005c;
    L_0x0047:
        r0 = new java.lang.String;
        r1 = r7.f6430e;
        r3 = r7.f6431f;
        r4 = r7.f6436k;
        r0.<init>(r1, r3, r4);
        r7.f6437l = r0;
        r0 = r7.f6431f;
        r1 = r7.f6436k;
        r0 = r0 + r1;
        r7.f6431f = r0;
        goto L_0x00b2;
    L_0x005c:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0088;
    L_0x0062:
        r4 = 9;
        if (r0 == r4) goto L_0x0088;
    L_0x0066:
        if (r0 != r1) goto L_0x0069;
    L_0x0068:
        goto L_0x0088;
    L_0x0069:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.mo1720f();
        r1.append(r2);
        r2 = r7.m5321r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0088:
        if (r0 != r1) goto L_0x0091;
    L_0x008a:
        r0 = r7.m5301t();
    L_0x008e:
        r7.f6437l = r0;
        goto L_0x009d;
    L_0x0091:
        if (r0 != r3) goto L_0x0096;
    L_0x0093:
        r0 = 39;
        goto L_0x0098;
    L_0x0096:
        r0 = 34;
    L_0x0098:
        r0 = r7.m5296b(r0);
        goto L_0x008e;
    L_0x009d:
        r0 = r7.f6437l;	 Catch:{ NumberFormatException -> 0x00b2 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00b2 }
        r7.f6428b = r2;	 Catch:{ NumberFormatException -> 0x00b2 }
        r1 = r7.f6441p;	 Catch:{ NumberFormatException -> 0x00b2 }
        r3 = r7.f6439n;	 Catch:{ NumberFormatException -> 0x00b2 }
        r3 = r3 + -1;	 Catch:{ NumberFormatException -> 0x00b2 }
        r4 = r1[r3];	 Catch:{ NumberFormatException -> 0x00b2 }
        r4 = r4 + 1;	 Catch:{ NumberFormatException -> 0x00b2 }
        r1[r3] = r4;	 Catch:{ NumberFormatException -> 0x00b2 }
        return r0;
    L_0x00b2:
        r0 = 11;
        r7.f6428b = r0;
        r0 = r7.f6437l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (int) r0;
        r4 = (double) r3;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 == 0) goto L_0x00df;
    L_0x00c2:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected an int but was ";
        r1.<init>(r2);
        r2 = r7.f6437l;
        r1.append(r2);
        r2 = r7.m5321r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00df:
        r0 = 0;
        r7.f6437l = r0;
        r7.f6428b = r2;
        r0 = r7.f6441p;
        r1 = r7.f6439n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.d.a.n():int");
    }

    public void mo1729o() {
        int i = 0;
        do {
            int i2 = this.f6428b;
            if (i2 == 0) {
                i2 = m5320q();
            }
            if (i2 == 3) {
                m5294a(1);
            } else if (i2 == 1) {
                m5294a(3);
            } else {
                if (i2 != 4) {
                    if (i2 != 2) {
                        if (i2 != 14) {
                            if (i2 != 10) {
                                char c;
                                if (i2 != 8) {
                                    if (i2 != 12) {
                                        if (i2 != 9) {
                                            if (i2 != 13) {
                                                if (i2 == 16) {
                                                    this.f6431f += this.f6436k;
                                                }
                                                this.f6428b = 0;
                                            }
                                        }
                                        c = '\"';
                                        m5298c(c);
                                        this.f6428b = 0;
                                    }
                                }
                                c = '\'';
                                m5298c(c);
                                this.f6428b = 0;
                            }
                        }
                        do {
                            i2 = 0;
                            while (this.f6431f + i2 < this.f6432g) {
                                switch (this.f6430e[this.f6431f + i2]) {
                                    case '\t':
                                    case '\n':
                                    case '\f':
                                    case '\r':
                                    case ' ':
                                    case ',':
                                    case ':':
                                    case '[':
                                    case ']':
                                    case '{':
                                    case '}':
                                        break;
                                    case '#':
                                    case '/':
                                    case ';':
                                    case '=':
                                    case '\\':
                                        m5302u();
                                        break;
                                    default:
                                        i2++;
                                }
                                this.f6431f += i2;
                                this.f6428b = 0;
                            }
                            this.f6431f += i2;
                        } while (m5297b(1));
                        this.f6428b = 0;
                    }
                }
                this.f6439n--;
                i--;
                this.f6428b = 0;
            }
            i++;
            this.f6428b = 0;
        } while (i != 0);
        int[] iArr = this.f6441p;
        i = this.f6439n - 1;
        iArr[i] = iArr[i] + 1;
        this.f6440o[this.f6439n - 1] = "null";
    }

    public String mo1730p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = this.f6439n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f6438m[i2]) {
                case 1:
                case 2:
                    stringBuilder.append('[');
                    stringBuilder.append(this.f6441p[i2]);
                    stringBuilder.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    stringBuilder.append('.');
                    if (this.f6440o[i2] == null) {
                        break;
                    }
                    stringBuilder.append(this.f6440o[i2]);
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    final int m5320q() {
        int i = this.f6438m[this.f6439n - 1];
        int a;
        if (i == 1) {
            this.f6438m[this.f6439n - 1] = 2;
            a = m5292a(true);
            if (a != 34) {
                i = 9;
            } else if (a == 39) {
                if (!(a == 44 || a == 59)) {
                    if (a != 91) {
                        this.f6428b = 3;
                        return 3;
                    } else if (a == 93) {
                        if (a == 123) {
                            this.f6431f--;
                            i = mo1721g();
                            if (i != 0) {
                                return i;
                            }
                            i = m5300s();
                            if (i != 0) {
                                return i;
                            }
                            if (m5295a(this.f6430e[this.f6431f])) {
                                throw m5293a("Expected value");
                            }
                            m5302u();
                            i = 10;
                        } else {
                            this.f6428b = 1;
                            return 1;
                        }
                    } else if (i == 1) {
                        this.f6428b = 4;
                        return 4;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        throw m5293a("Unexpected value");
                    }
                }
                m5302u();
                this.f6431f--;
                this.f6428b = 7;
                return 7;
            } else {
                m5302u();
                this.f6428b = 8;
                return 8;
            }
        }
        if (i == 2) {
            a = m5292a(true);
            if (a != 44) {
                if (a == 59) {
                    m5302u();
                } else if (a != 93) {
                    throw m5293a("Unterminated array");
                } else {
                    this.f6428b = 4;
                    return 4;
                }
            }
        }
        int a2;
        if (i != 3) {
            if (i != 5) {
                if (i == 4) {
                    this.f6438m[this.f6439n - 1] = 5;
                    a = m5292a(true);
                    if (a != 58) {
                        if (a != 61) {
                            throw m5293a("Expected ':'");
                        }
                        m5302u();
                        if ((this.f6431f < this.f6432g || m5297b(1)) && this.f6430e[this.f6431f] == '>') {
                            a = this.f6431f + 1;
                        }
                    }
                } else {
                    int i2 = 0;
                    if (i == 6) {
                        if (this.f6427a) {
                            m5292a(true);
                            this.f6431f--;
                            if (this.f6431f + f6426c.length <= this.f6432g || m5297b(f6426c.length)) {
                                while (i2 < f6426c.length) {
                                    if (this.f6430e[this.f6431f + i2] != f6426c[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                this.f6431f += f6426c.length;
                            }
                        }
                        this.f6438m[this.f6439n - 1] = 7;
                    } else if (i == 7) {
                        if (m5292a(false) == -1) {
                            i = 17;
                        } else {
                            m5302u();
                            a = this.f6431f - 1;
                        }
                    } else if (i == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                this.f6431f = a;
            }
        }
        this.f6438m[this.f6439n - 1] = 4;
        if (i == 5) {
            a2 = m5292a(true);
            if (a2 != 44) {
                if (a2 == 59) {
                    m5302u();
                } else if (a2 != 125) {
                    throw m5293a("Unterminated object");
                } else {
                    this.f6428b = 2;
                    return 2;
                }
            }
        }
        a2 = m5292a(true);
        if (a2 == 34) {
            i = 13;
        } else if (a2 == 39) {
            m5302u();
            i = 12;
        } else if (a2 != 125) {
            m5302u();
            this.f6431f--;
            if (m5295a((char) a2)) {
                i = 14;
            } else {
                throw m5293a("Expected name");
            }
        } else if (i != 5) {
            this.f6428b = 2;
            return 2;
        } else {
            throw m5293a("Expected name");
        }
        a = m5292a(true);
        if (a != 34) {
            i = 9;
        } else if (a == 39) {
            m5302u();
            this.f6428b = 8;
            return 8;
        } else if (a != 91) {
            this.f6428b = 3;
            return 3;
        } else if (a == 93) {
            if (i == 1) {
                this.f6428b = 4;
                return 4;
            }
            if (i != 1) {
                if (i == 2) {
                    throw m5293a("Unexpected value");
                }
            }
            m5302u();
            this.f6431f--;
            this.f6428b = 7;
            return 7;
        } else if (a == 123) {
            this.f6428b = 1;
            return 1;
        } else {
            this.f6431f--;
            i = mo1721g();
            if (i != 0) {
                return i;
            }
            i = m5300s();
            if (i != 0) {
                return i;
            }
            if (m5295a(this.f6430e[this.f6431f])) {
                m5302u();
                i = 10;
            } else {
                throw m5293a("Expected value");
            }
        }
        this.f6428b = i;
        return i;
    }

    final String m5321r() {
        int i = this.f6433h + 1;
        int i2 = (this.f6431f - this.f6434i) + 1;
        StringBuilder stringBuilder = new StringBuilder(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(mo1730p());
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(m5321r());
        return stringBuilder.toString();
    }
}
