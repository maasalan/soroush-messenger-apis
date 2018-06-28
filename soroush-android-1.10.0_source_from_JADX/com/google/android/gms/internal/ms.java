package com.google.android.gms.internal;

import android.util.Log;

public final class ms extends mu {
    public long f18327a;
    public Integer f18328b;
    public Integer f18329c;
    public Long f18330d;
    private mv f18331g;
    private boolean f18332h;
    private boolean f18333i;
    private String f18334j;
    private Integer f18335k;
    private Long f18336l;
    private Long f18337m;
    private String f18338n;
    private Long f18339o;
    private Long f18340p;
    private Long f18341q;

    private ms(mv mvVar) {
        this(mvVar, mt.m5013a());
    }

    private ms(mv mvVar, mt mtVar) {
        super(mtVar);
        this.f18332h = false;
        this.f18327a = -1;
        this.f18333i = false;
        this.f18331g = mvVar;
        m12014b();
    }

    public static ms m16709a(mv mvVar) {
        return new ms(mvVar);
    }

    public final ms m16710a(int i) {
        this.f18329c = Integer.valueOf(i);
        return this;
    }

    public final ms m16711a(long j) {
        this.f18336l = Long.valueOf(j);
        return this;
    }

    public final ms m16712a(String str) {
        if (str != null) {
            this.f18334j = nl.m5042b(nl.m5040a(str));
        }
        return this;
    }

    public final nq m16713a() {
        m12016c();
        oi nqVar = new nq();
        nqVar.f18364a = this.f18334j;
        nqVar.f18365b = this.f18335k;
        nqVar.f18366c = this.f18336l;
        nqVar.f18367d = this.f18337m;
        nqVar.f18368e = this.f18328b;
        nqVar.f18369f = this.f18329c;
        nqVar.f18370g = this.f18338n;
        nqVar.f18371h = this.f18339o;
        nqVar.f18372i = this.f18330d;
        nqVar.f18373j = this.f18340p;
        nqVar.f18374k = this.f18341q;
        nqVar.f18375l = null;
        if (!this.f18332h) {
            if (this.f18331g != null) {
                mv mvVar = this.f18331g;
                int i = this.f15298f;
                try {
                    byte[] a = oi.m5123a(nqVar);
                    oi nqVar2 = new nq();
                    oi.m5122a(nqVar2, a, a.length);
                    mvVar.f6170a.execute(new my(mvVar, nqVar2, i));
                } catch (Throwable e) {
                    Log.w("FirebasePerformance", "Clone NetworkRequestMetric throws exception", e);
                }
            }
            this.f18332h = true;
        }
        return nqVar;
    }

    public final ms m16714b(long j) {
        this.f18337m = Long.valueOf(j);
        return this;
    }

    public final ms m16715b(String str) {
        if (str == null) {
            return this;
        }
        Integer valueOf;
        str = str.toUpperCase();
        int i = -1;
        switch (str.hashCode()) {
            case -531492226:
                if (str.equals("OPTIONS")) {
                    i = 6;
                    break;
                }
                break;
            case 70454:
                if (str.equals("GET")) {
                    i = 0;
                    break;
                }
                break;
            case 79599:
                if (str.equals("PUT")) {
                    i = 1;
                    break;
                }
                break;
            case 2213344:
                if (str.equals("HEAD")) {
                    i = 4;
                    break;
                }
                break;
            case 2461856:
                if (str.equals("POST")) {
                    i = 2;
                    break;
                }
                break;
            case 75900968:
                if (str.equals("PATCH")) {
                    i = 5;
                    break;
                }
                break;
            case 80083237:
                if (str.equals("TRACE")) {
                    i = 7;
                    break;
                }
                break;
            case 1669334218:
                if (str.equals("CONNECT")) {
                    i = 8;
                    break;
                }
                break;
            case 2012838315:
                if (str.equals("DELETE")) {
                    i = 3;
                    break;
                }
                break;
            default:
                break;
        }
        switch (i) {
            case 0:
                valueOf = Integer.valueOf(1);
                break;
            case 1:
                valueOf = Integer.valueOf(2);
                break;
            case 2:
                valueOf = Integer.valueOf(3);
                break;
            case 3:
                valueOf = Integer.valueOf(4);
                break;
            case 4:
                valueOf = Integer.valueOf(5);
                break;
            case 5:
                valueOf = Integer.valueOf(6);
                break;
            case 6:
                valueOf = Integer.valueOf(7);
                break;
            case 7:
                valueOf = Integer.valueOf(8);
                break;
            case 8:
                valueOf = Integer.valueOf(9);
                break;
            default:
                valueOf = Integer.valueOf(0);
                break;
        }
        this.f18335k = valueOf;
        return this;
    }

    public final ms m16716c(long j) {
        this.f18339o = Long.valueOf(j);
        return this;
    }

    public final ms m16717c(String str) {
        if (str != null) {
            this.f18338n = str;
        }
        return this;
    }

    public final ms m16718d(long j) {
        this.f18327a = j;
        this.f18340p = Long.valueOf(j);
        return this;
    }

    public final ms m16719e(long j) {
        this.f18341q = Long.valueOf(j);
        return this;
    }
}
