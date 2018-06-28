package com.google.p173d.p185e.p186a.p187a.p188a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1961a;
import com.google.p173d.p185e.p186a.p187a.p188a.C1994m.C1993a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1997s {
    private final C1961a f6696a;
    private final C1994m f6697b = new C1994m();
    private final StringBuilder f6698c = new StringBuilder();

    C1997s(C1961a c1961a) {
        this.f6696a = c1961a;
    }

    public static int m5467a(C1961a c1961a, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (c1961a.m5394a(i + i3)) {
                i4 |= 1 << ((i2 - i3) - 1);
            }
            i3++;
        }
        return i4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.p173d.p185e.p186a.p187a.p188a.C1992l m5468a() {
        /*
        r7 = this;
    L_0x0000:
        r0 = r7.f6697b;
        r0 = r0.f6688a;
        r1 = r0 + 7;
        r2 = r7.f6696a;
        r2 = r2.f6554b;
        r3 = 0;
        r4 = 1;
        if (r1 <= r2) goto L_0x001a;
    L_0x000e:
        r0 = r0 + 4;
        r1 = r7.f6696a;
        r1 = r1.f6554b;
        if (r0 > r1) goto L_0x0018;
    L_0x0016:
        r0 = r4;
        goto L_0x0031;
    L_0x0018:
        r0 = r3;
        goto L_0x0031;
    L_0x001a:
        r1 = r0;
    L_0x001b:
        r2 = r0 + 3;
        if (r1 >= r2) goto L_0x002b;
    L_0x001f:
        r2 = r7.f6696a;
        r2 = r2.m5394a(r1);
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0016;
    L_0x0028:
        r1 = r1 + 1;
        goto L_0x001b;
    L_0x002b:
        r0 = r7.f6696a;
        r0 = r0.m5394a(r2);
    L_0x0031:
        r1 = 4;
        if (r0 == 0) goto L_0x00d6;
    L_0x0034:
        r0 = r7.f6697b;
        r0 = r0.f6688a;
        r2 = r0 + 7;
        r5 = r7.f6696a;
        r5 = r5.f6554b;
        r6 = 10;
        if (r2 <= r5) goto L_0x005f;
    L_0x0042:
        r0 = r7.m5472a(r0, r1);
        if (r0 != 0) goto L_0x0052;
    L_0x0048:
        r0 = new com.google.d.e.a.a.a.p;
        r1 = r7.f6696a;
        r1 = r1.f6554b;
        r0.<init>(r1, r6, r6);
        goto L_0x0070;
    L_0x0052:
        r1 = new com.google.d.e.a.a.a.p;
        r2 = r7.f6696a;
        r2 = r2.f6554b;
        r0 = r0 + -1;
        r1.<init>(r2, r0, r6);
        r0 = r1;
        goto L_0x0070;
    L_0x005f:
        r1 = 7;
        r0 = r7.m5472a(r0, r1);
        r0 = r0 + -8;
        r1 = r0 / 11;
        r0 = r0 % 11;
        r5 = new com.google.d.e.a.a.a.p;
        r5.<init>(r2, r1, r0);
        r0 = r5;
    L_0x0070:
        r1 = r7.f6697b;
        r2 = r0.f6690d;
        r1.f6688a = r2;
        r1 = r0.f15469a;
        if (r1 != r6) goto L_0x007b;
    L_0x007a:
        r3 = r4;
    L_0x007b:
        if (r3 == 0) goto L_0x00ab;
    L_0x007d:
        r1 = r0.m12333a();
        if (r1 == 0) goto L_0x0093;
    L_0x0083:
        r0 = new com.google.d.e.a.a.a.o;
        r1 = r7.f6697b;
        r1 = r1.f6688a;
        r2 = r7.f6698c;
        r2 = r2.toString();
        r0.<init>(r1, r2);
        goto L_0x00a5;
    L_0x0093:
        r1 = new com.google.d.e.a.a.a.o;
        r2 = r7.f6697b;
        r2 = r2.f6688a;
        r3 = r7.f6698c;
        r3 = r3.toString();
        r0 = r0.f15470b;
        r1.<init>(r2, r3, r0);
        r0 = r1;
    L_0x00a5:
        r1 = new com.google.d.e.a.a.a.l;
        r1.<init>(r0, r4);
        return r1;
    L_0x00ab:
        r1 = r7.f6698c;
        r2 = r0.f15469a;
        r1.append(r2);
        r1 = r0.m12333a();
        if (r1 == 0) goto L_0x00cd;
    L_0x00b8:
        r0 = new com.google.d.e.a.a.a.o;
        r1 = r7.f6697b;
        r1 = r1.f6688a;
        r2 = r7.f6698c;
        r2 = r2.toString();
        r0.<init>(r1, r2);
        r1 = new com.google.d.e.a.a.a.l;
        r1.<init>(r0, r4);
        return r1;
    L_0x00cd:
        r1 = r7.f6698c;
        r0 = r0.f15470b;
        r1.append(r0);
        goto L_0x0000;
    L_0x00d6:
        r0 = r7.f6697b;
        r0 = r0.f6688a;
        r2 = r0 + 1;
        r5 = r7.f6696a;
        r5 = r5.f6554b;
        if (r2 <= r5) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00fb;
    L_0x00e3:
        r2 = r3;
    L_0x00e4:
        if (r2 >= r1) goto L_0x00fa;
    L_0x00e6:
        r5 = r2 + r0;
        r6 = r7.f6696a;
        r6 = r6.f6554b;
        if (r5 >= r6) goto L_0x00fa;
    L_0x00ee:
        r6 = r7.f6696a;
        r5 = r6.m5394a(r5);
        if (r5 == 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00fb;
    L_0x00f7:
        r2 = r2 + 1;
        goto L_0x00e4;
    L_0x00fa:
        r3 = r4;
    L_0x00fb:
        if (r3 == 0) goto L_0x0108;
    L_0x00fd:
        r0 = r7.f6697b;
        r2 = com.google.p173d.p185e.p186a.p187a.p188a.C1994m.C1993a.f6685b;
        r0.f6689b = r2;
        r0 = r7.f6697b;
        r0.m5463a(r1);
    L_0x0108:
        r0 = new com.google.d.e.a.a.a.l;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.a.a.a.s.a():com.google.d.e.a.a.a.l");
    }

    private boolean m5469a(int i) {
        if (i + 1 > this.f6696a.f6554b) {
            return false;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = i2 + i;
            if (i3 >= this.f6696a.f6554b) {
                break;
            }
            if (i2 == 2) {
                if (!this.f6696a.m5394a(i + 2)) {
                    return false;
                }
            } else if (this.f6696a.m5394a(i3)) {
                return false;
            }
        }
        return true;
    }

    private C1992l m5470b() {
        int a;
        C1994m c1994m;
        while (true) {
            boolean z;
            C1995q c5608n;
            char c;
            int i = this.f6697b.f6688a;
            if (i + 5 <= this.f6696a.f6554b) {
                a = m5472a(i, 5);
                if (a < 5 || a >= 16) {
                    if (i + 7 <= this.f6696a.f6554b) {
                        a = m5472a(i, 7);
                        if (a < 64 || a >= 116) {
                            if (i + 8 <= this.f6696a.f6554b) {
                                i = m5472a(i, 8);
                                if (i >= 232 && i < 253) {
                                }
                            }
                        }
                    }
                }
                z = true;
                if (z) {
                    break;
                }
                i = this.f6697b.f6688a;
                a = m5472a(i, 5);
                if (a != 15) {
                    c5608n = new C5608n(i + 5, '$');
                } else if (a >= 5 || a >= 15) {
                    a = m5472a(i, 7);
                    if (a < 64 && a < 90) {
                        c5608n = new C5608n(i + 7, (char) (a + 1));
                    } else if (a >= 90 || a >= 116) {
                        switch (m5472a(i, 8)) {
                            case 232:
                                c = '!';
                                break;
                            case 233:
                                c = '\"';
                                break;
                            case 234:
                                c = '%';
                                break;
                            case 235:
                                c = '&';
                                break;
                            case 236:
                                c = '\'';
                                break;
                            case 237:
                                c = '(';
                                break;
                            case 238:
                                c = ')';
                                break;
                            case 239:
                                c = '*';
                                break;
                            case 240:
                                c = '+';
                                break;
                            case 241:
                                c = ',';
                                break;
                            case 242:
                                c = '-';
                                break;
                            case 243:
                                c = '.';
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /*244*/:
                                c = '/';
                                break;
                            case 245:
                                c = ':';
                                break;
                            case 246:
                                c = ';';
                                break;
                            case 247:
                                c = '<';
                                break;
                            case 248:
                                c = '=';
                                break;
                            case 249:
                                c = '>';
                                break;
                            case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                                c = '?';
                                break;
                            case 251:
                                c = '_';
                                break;
                            case 252:
                                c = ' ';
                                break;
                            default:
                                throw C5615f.m12347a();
                        }
                        c5608n = new C5608n(i + 8, c);
                    } else {
                        c5608n = new C5608n(i + 7, (char) (a + 7));
                    }
                } else {
                    c5608n = new C5608n(i + 5, (char) ((a + 48) - 5));
                }
                this.f6697b.f6688a = c5608n.f6690d;
                if (c5608n.m12332a()) {
                    return new C1992l(new C5609o(this.f6697b.f6688a, this.f6698c.toString()), true);
                }
                this.f6698c.append(c5608n.f15465a);
            }
            z = false;
            if (z) {
                break;
            }
            i = this.f6697b.f6688a;
            a = m5472a(i, 5);
            if (a != 15) {
                if (a >= 5) {
                }
                a = m5472a(i, 7);
                if (a < 64) {
                }
                if (a >= 90) {
                }
                switch (m5472a(i, 8)) {
                    case 232:
                        c = '!';
                        break;
                    case 233:
                        c = '\"';
                        break;
                    case 234:
                        c = '%';
                        break;
                    case 235:
                        c = '&';
                        break;
                    case 236:
                        c = '\'';
                        break;
                    case 237:
                        c = '(';
                        break;
                    case 238:
                        c = ')';
                        break;
                    case 239:
                        c = '*';
                        break;
                    case 240:
                        c = '+';
                        break;
                    case 241:
                        c = ',';
                        break;
                    case 242:
                        c = '-';
                        break;
                    case 243:
                        c = '.';
                        break;
                    case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /*244*/:
                        c = '/';
                        break;
                    case 245:
                        c = ':';
                        break;
                    case 246:
                        c = ';';
                        break;
                    case 247:
                        c = '<';
                        break;
                    case 248:
                        c = '=';
                        break;
                    case 249:
                        c = '>';
                        break;
                    case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                        c = '?';
                        break;
                    case 251:
                        c = '_';
                        break;
                    case 252:
                        c = ' ';
                        break;
                    default:
                        throw C5615f.m12347a();
                }
                c5608n = new C5608n(i + 8, c);
            } else {
                c5608n = new C5608n(i + 5, '$');
            }
            this.f6697b.f6688a = c5608n.f6690d;
            if (c5608n.m12332a()) {
                return new C1992l(new C5609o(this.f6697b.f6688a, this.f6698c.toString()), true);
            }
            this.f6698c.append(c5608n.f15465a);
        }
        if (m5471b(this.f6697b.f6688a)) {
            this.f6697b.m5463a(3);
            c1994m = this.f6697b;
            a = C1993a.f6684a;
        } else {
            if (m5469a(this.f6697b.f6688a)) {
                if (this.f6697b.f6688a + 5 < this.f6696a.f6554b) {
                    this.f6697b.m5463a(5);
                } else {
                    this.f6697b.f6688a = this.f6696a.f6554b;
                }
                c1994m = this.f6697b;
                a = C1993a.f6685b;
            }
            return new C1992l();
        }
        c1994m.f6689b = a;
        return new C1992l();
    }

    private boolean m5471b(int i) {
        int i2 = i + 3;
        if (i2 > this.f6696a.f6554b) {
            return false;
        }
        while (i < i2) {
            if (this.f6696a.m5394a(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    final int m5472a(int i, int i2) {
        return C1997s.m5467a(this.f6696a, i, i2);
    }

    final C5609o m5473a(int i, String str) {
        C1992l c1992l;
        C5609o c5609o;
        this.f6698c.setLength(0);
        if (str != null) {
            this.f6698c.append(str);
        }
        this.f6697b.f6688a = i;
        boolean z;
        do {
            i = this.f6697b.f6688a;
            boolean z2 = true;
            if (this.f6697b.f6689b == C1993a.f6685b) {
                while (true) {
                    int a;
                    C1994m c1994m;
                    C1995q c5608n;
                    char c;
                    StringBuilder stringBuilder;
                    int i2 = this.f6697b.f6688a;
                    if (i2 + 5 <= this.f6696a.f6554b) {
                        a = m5472a(i2, 5);
                        if (a < 5 || a >= 16) {
                            if (i2 + 6 <= this.f6696a.f6554b) {
                                i2 = m5472a(i2, 6);
                                if (i2 >= 16 && i2 < 63) {
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            if (m5471b(this.f6697b.f6688a)) {
                                if (m5469a(this.f6697b.f6688a)) {
                                    if (this.f6697b.f6688a + 5 >= this.f6696a.f6554b) {
                                        this.f6697b.m5463a(5);
                                    } else {
                                        this.f6697b.f6688a = this.f6696a.f6554b;
                                    }
                                    c1994m = this.f6697b;
                                    a = C1993a.f6686c;
                                }
                                c1992l = new C1992l();
                            } else {
                                this.f6697b.m5463a(3);
                                c1994m = this.f6697b;
                                a = C1993a.f6684a;
                            }
                            c1994m.f6689b = a;
                            c1992l = new C1992l();
                        } else {
                            i2 = this.f6697b.f6688a;
                            a = m5472a(i2, 5);
                            if (a != 15) {
                                c5608n = new C5608n(i2 + 5, '$');
                            } else if (a >= 5 || a >= 15) {
                                a = m5472a(i2, 6);
                                if (a >= 32 || a >= 58) {
                                    switch (a) {
                                        case 58:
                                            c = '*';
                                            break;
                                        case 59:
                                            c = ',';
                                            break;
                                        case 60:
                                            c = '-';
                                            break;
                                        case 61:
                                            c = '.';
                                            break;
                                        case 62:
                                            c = '/';
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder("Decoding invalid alphanumeric value: ");
                                            stringBuilder.append(a);
                                            throw new IllegalStateException(stringBuilder.toString());
                                    }
                                    c5608n = new C5608n(i2 + 6, c);
                                } else {
                                    c5608n = new C5608n(i2 + 6, (char) (a + 33));
                                }
                            } else {
                                c5608n = new C5608n(i2 + 5, (char) ((a + 48) - 5));
                            }
                            this.f6697b.f6688a = c5608n.f6690d;
                            if (c5608n.m12332a()) {
                                this.f6698c.append(c5608n.f15465a);
                            } else {
                                c1992l = new C1992l(new C5609o(this.f6697b.f6688a, this.f6698c.toString()), true);
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        if (m5471b(this.f6697b.f6688a)) {
                            if (m5469a(this.f6697b.f6688a)) {
                                if (this.f6697b.f6688a + 5 >= this.f6696a.f6554b) {
                                    this.f6697b.f6688a = this.f6696a.f6554b;
                                } else {
                                    this.f6697b.m5463a(5);
                                }
                                c1994m = this.f6697b;
                                a = C1993a.f6686c;
                            }
                            c1992l = new C1992l();
                        } else {
                            this.f6697b.m5463a(3);
                            c1994m = this.f6697b;
                            a = C1993a.f6684a;
                        }
                        c1994m.f6689b = a;
                        c1992l = new C1992l();
                    } else {
                        i2 = this.f6697b.f6688a;
                        a = m5472a(i2, 5);
                        if (a != 15) {
                            if (a >= 5) {
                            }
                            a = m5472a(i2, 6);
                            if (a >= 32) {
                            }
                            switch (a) {
                                case 58:
                                    c = '*';
                                    break;
                                case 59:
                                    c = ',';
                                    break;
                                case 60:
                                    c = '-';
                                    break;
                                case 61:
                                    c = '.';
                                    break;
                                case 62:
                                    c = '/';
                                    break;
                                default:
                                    stringBuilder = new StringBuilder("Decoding invalid alphanumeric value: ");
                                    stringBuilder.append(a);
                                    throw new IllegalStateException(stringBuilder.toString());
                            }
                            c5608n = new C5608n(i2 + 6, c);
                        } else {
                            c5608n = new C5608n(i2 + 5, '$');
                        }
                        this.f6697b.f6688a = c5608n.f6690d;
                        if (c5608n.m12332a()) {
                            this.f6698c.append(c5608n.f15465a);
                        } else {
                            c1992l = new C1992l(new C5609o(this.f6697b.f6688a, this.f6698c.toString()), true);
                        }
                    }
                }
            } else {
                c1992l = this.f6697b.f6689b == C1993a.f6686c ? m5470b() : m5468a();
            }
            z = c1992l.f6683b;
            if (i == this.f6697b.f6688a) {
                z2 = false;
            }
            if (z2 || z) {
            }
            c5609o = c1992l.f6682a;
            return (c5609o == null && c5609o.f15468c) ? new C5609o(this.f6697b.f6688a, this.f6698c.toString(), c5609o.f15467b) : new C5609o(this.f6697b.f6688a, this.f6698c.toString());
        } while (!z);
        c5609o = c1992l.f6682a;
        if (c5609o == null) {
        }
    }

    final String m5474a(StringBuilder stringBuilder, int i) {
        String str = null;
        while (true) {
            C1995q a = m5473a(i, str);
            String a2 = C1996r.m5465a(a.f15466a);
            if (a2 != null) {
                stringBuilder.append(a2);
            }
            a2 = a.f15468c ? String.valueOf(a.f15467b) : null;
            if (i == a.f6690d) {
                return stringBuilder.toString();
            }
            i = a.f6690d;
            str = a2;
        }
    }
}
