package com.p111d.p112a.p114b.p120g;

import java.util.ArrayList;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1373i {
    static final char[] f4332a = new char[0];
    public final C1368a f4333b;
    public char[] f4334c;
    public int f4335d;
    public int f4336e;
    public boolean f4337f;
    public int f4338g;
    public char[] f4339h;
    public int f4340i;
    public String f4341j;
    public char[] f4342k;
    private ArrayList<char[]> f4343l;

    public C1373i(C1368a c1368a) {
        this.f4333b = c1368a;
    }

    public final void m3330a() {
        this.f4335d = -1;
        this.f4340i = 0;
        this.f4336e = 0;
        this.f4334c = null;
        this.f4341j = null;
        this.f4342k = null;
        if (this.f4337f) {
            m3333b();
        }
    }

    public final void m3331a(char[] cArr, int i, int i2) {
        this.f4341j = null;
        this.f4342k = null;
        this.f4334c = cArr;
        this.f4335d = i;
        this.f4336e = i2;
        if (this.f4337f) {
            m3333b();
        }
    }

    public final char[] m3332a(int i) {
        return this.f4333b != null ? this.f4333b.m3315a(2, i) : new char[Math.max(i, IjkMediaCodecInfo.RANK_MAX)];
    }

    public final void m3333b() {
        this.f4337f = false;
        this.f4343l.clear();
        this.f4338g = 0;
        this.f4340i = 0;
    }

    public final void m3334b(int i) {
        int i2 = this.f4336e;
        this.f4336e = 0;
        Object obj = this.f4334c;
        this.f4334c = null;
        int i3 = this.f4335d;
        this.f4335d = -1;
        i += i2;
        if (this.f4339h == null || i > this.f4339h.length) {
            this.f4339h = m3332a(i);
        }
        if (i2 > 0) {
            System.arraycopy(obj, i3, this.f4339h, 0, i2);
        }
        this.f4338g = 0;
        this.f4340i = i2;
    }

    public final int m3335c() {
        return this.f4335d >= 0 ? this.f4336e : this.f4342k != null ? this.f4342k.length : this.f4341j != null ? this.f4341j.length() : this.f4338g + this.f4340i;
    }

    public final int m3336d() {
        return this.f4335d >= 0 ? this.f4335d : 0;
    }

    public final char[] m3337e() {
        if (this.f4335d >= 0) {
            return this.f4334c;
        }
        if (this.f4342k != null) {
            return this.f4342k;
        }
        if (this.f4341j == null) {
            return !this.f4337f ? this.f4339h == null ? f4332a : this.f4339h : m3339g();
        } else {
            char[] toCharArray = this.f4341j.toCharArray();
            this.f4342k = toCharArray;
            return toCharArray;
        }
    }

    public final String m3338f() {
        if (this.f4341j == null) {
            String str;
            if (this.f4342k != null) {
                str = new String(this.f4342k);
            } else if (this.f4335d < 0) {
                int i = this.f4338g;
                int i2 = this.f4340i;
                if (i == 0) {
                    str = i2 == 0 ? "" : new String(this.f4339h, 0, i2);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(i + i2);
                    if (this.f4343l != null) {
                        i = this.f4343l.size();
                        for (i2 = 0; i2 < i; i2++) {
                            char[] cArr = (char[]) this.f4343l.get(i2);
                            stringBuilder.append(cArr, 0, cArr.length);
                        }
                    }
                    stringBuilder.append(this.f4339h, 0, this.f4340i);
                    str = stringBuilder.toString();
                }
            } else if (this.f4336e <= 0) {
                str = "";
                this.f4341j = str;
                return str;
            } else {
                str = new String(this.f4334c, this.f4335d, this.f4336e);
            }
            this.f4341j = str;
        }
        return this.f4341j;
    }

    public final char[] m3339g() {
        char[] cArr = this.f4342k;
        if (cArr == null) {
            if (this.f4341j != null) {
                cArr = this.f4341j.toCharArray();
            } else {
                int i;
                int i2;
                if (this.f4335d >= 0) {
                    i = this.f4336e;
                    if (i > 0) {
                        i2 = this.f4335d;
                        cArr = i2 == 0 ? Arrays.copyOf(this.f4334c, i) : Arrays.copyOfRange(this.f4334c, i2, i + i2);
                    }
                } else {
                    i = m3335c();
                    if (i > 0) {
                        int i3;
                        cArr = new char[i];
                        if (this.f4343l != null) {
                            i2 = this.f4343l.size();
                            int i4 = 0;
                            i3 = i4;
                            while (i4 < i2) {
                                char[] cArr2 = (char[]) this.f4343l.get(i4);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArr, i3, length);
                                i3 += length;
                                i4++;
                            }
                        } else {
                            i3 = 0;
                        }
                        System.arraycopy(this.f4339h, 0, cArr, i3, this.f4340i);
                    }
                }
                cArr = f4332a;
            }
            this.f4342k = cArr;
        }
        return cArr;
    }

    public final char[] m3340h() {
        if (this.f4335d >= 0) {
            m3334b(1);
        } else {
            char[] cArr = this.f4339h;
            if (cArr == null) {
                this.f4339h = m3332a(0);
            } else if (this.f4340i >= cArr.length) {
                m3344l();
            }
        }
        return this.f4339h;
    }

    public final char[] m3341i() {
        this.f4335d = -1;
        this.f4340i = 0;
        this.f4336e = 0;
        this.f4334c = null;
        this.f4341j = null;
        this.f4342k = null;
        if (this.f4337f) {
            m3333b();
        }
        char[] cArr = this.f4339h;
        if (cArr != null) {
            return cArr;
        }
        cArr = m3332a(0);
        this.f4339h = cArr;
        return cArr;
    }

    public final char[] m3342j() {
        if (this.f4343l == null) {
            this.f4343l = new ArrayList();
        }
        this.f4337f = true;
        this.f4343l.add(this.f4339h);
        int length = this.f4339h.length;
        this.f4338g += length;
        this.f4340i = 0;
        length += length >> 1;
        if (length < IjkMediaCodecInfo.RANK_MAX) {
            length = IjkMediaCodecInfo.RANK_MAX;
        } else if (length > 262144) {
            length = 262144;
        }
        char[] cArr = new char[length];
        this.f4339h = cArr;
        return cArr;
    }

    public final char[] m3343k() {
        char[] cArr = this.f4339h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 262144) {
            i = length + (length >> 2);
        }
        cArr = Arrays.copyOf(cArr, i);
        this.f4339h = cArr;
        return cArr;
    }

    public final void m3344l() {
        if (this.f4343l == null) {
            this.f4343l = new ArrayList();
        }
        Object obj = this.f4339h;
        this.f4337f = true;
        this.f4343l.add(obj);
        this.f4338g += obj.length;
        this.f4340i = 0;
        int length = obj.length;
        length += length >> 1;
        if (length < IjkMediaCodecInfo.RANK_MAX) {
            length = IjkMediaCodecInfo.RANK_MAX;
        } else if (length > 262144) {
            length = 262144;
        }
        this.f4339h = new char[length];
    }

    public final String toString() {
        return m3338f();
    }
}
