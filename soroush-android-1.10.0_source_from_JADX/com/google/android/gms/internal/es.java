package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;

final class es {
    private long f5689A;
    final gr f5690a;
    long f5691b;
    long f5692c;
    long f5693d;
    long f5694e;
    long f5695f;
    long f5696g;
    String f5697h;
    boolean f5698i;
    private final String f5699j;
    private String f5700k;
    private String f5701l;
    private String f5702m;
    private String f5703n;
    private long f5704o;
    private long f5705p;
    private long f5706q;
    private String f5707r;
    private long f5708s;
    private String f5709t;
    private long f5710u;
    private long f5711v;
    private boolean f5712w;
    private long f5713x;
    private boolean f5714y;
    private long f5715z;

    es(gr grVar, String str) {
        ac.m4376a((Object) grVar);
        ac.m4378a(str);
        this.f5690a = grVar;
        this.f5699j = str;
        this.f5690a.m4907f().mo1606c();
    }

    public final String m4772a() {
        this.f5690a.m4907f().mo1606c();
        return this.f5699j;
    }

    public final void m4773a(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5705p != j ? 1 : 0;
        this.f5705p = j;
    }

    public final void m4774a(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5700k, str) ^ 1;
        this.f5700k = str;
    }

    public final void m4775a(boolean z) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5712w != z ? 1 : 0;
        this.f5712w = z;
    }

    public final String m4776b() {
        this.f5690a.m4907f().mo1606c();
        return this.f5700k;
    }

    public final void m4777b(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5706q != j ? 1 : 0;
        this.f5706q = j;
    }

    public final void m4778b(String str) {
        this.f5690a.m4907f().mo1606c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5698i |= ju.m16578b(this.f5701l, str) ^ 1;
        this.f5701l = str;
    }

    public final void m4779b(boolean z) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i = this.f5714y != z;
        this.f5714y = z;
    }

    public final String m4780c() {
        this.f5690a.m4907f().mo1606c();
        return this.f5701l;
    }

    public final void m4781c(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5708s != j ? 1 : 0;
        this.f5708s = j;
    }

    public final void m4782c(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5702m, str) ^ 1;
        this.f5702m = str;
    }

    public final String m4783d() {
        this.f5690a.m4907f().mo1606c();
        return this.f5702m;
    }

    public final void m4784d(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5710u != j ? 1 : 0;
        this.f5710u = j;
    }

    public final void m4785d(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5703n, str) ^ 1;
        this.f5703n = str;
    }

    public final String m4786e() {
        this.f5690a.m4907f().mo1606c();
        return this.f5703n;
    }

    public final void m4787e(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5711v != j ? 1 : 0;
        this.f5711v = j;
    }

    public final void m4788e(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5707r, str) ^ 1;
        this.f5707r = str;
    }

    public final long m4789f() {
        this.f5690a.m4907f().mo1606c();
        return this.f5705p;
    }

    public final void m4790f(long j) {
        int i = 0;
        ac.m4385b(j >= 0);
        this.f5690a.m4907f().mo1606c();
        boolean z = this.f5698i;
        if (this.f5704o != j) {
            i = 1;
        }
        this.f5698i = i | z;
        this.f5704o = j;
    }

    public final void m4791f(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5709t, str) ^ 1;
        this.f5709t = str;
    }

    public final long m4792g() {
        this.f5690a.m4907f().mo1606c();
        return this.f5706q;
    }

    public final void m4793g(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5715z != j ? 1 : 0;
        this.f5715z = j;
    }

    public final void m4794g(String str) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= ju.m16578b(this.f5697h, str) ^ 1;
        this.f5697h = str;
    }

    public final String m4795h() {
        this.f5690a.m4907f().mo1606c();
        return this.f5707r;
    }

    public final void m4796h(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5689A != j ? 1 : 0;
        this.f5689A = j;
    }

    public final long m4797i() {
        this.f5690a.m4907f().mo1606c();
        return this.f5708s;
    }

    public final void m4798i(long j) {
        this.f5690a.m4907f().mo1606c();
        this.f5698i |= this.f5713x != j ? 1 : 0;
        this.f5713x = j;
    }

    public final String m4799j() {
        this.f5690a.m4907f().mo1606c();
        return this.f5709t;
    }

    public final long m4800k() {
        this.f5690a.m4907f().mo1606c();
        return this.f5710u;
    }

    public final long m4801l() {
        this.f5690a.m4907f().mo1606c();
        return this.f5711v;
    }

    public final boolean m4802m() {
        this.f5690a.m4907f().mo1606c();
        return this.f5712w;
    }

    public final long m4803n() {
        this.f5690a.m4907f().mo1606c();
        return this.f5704o;
    }

    public final long m4804o() {
        this.f5690a.m4907f().mo1606c();
        return this.f5715z;
    }

    public final long m4805p() {
        this.f5690a.m4907f().mo1606c();
        return this.f5689A;
    }

    public final void m4806q() {
        this.f5690a.m4907f().mo1606c();
        long j = this.f5704o + 1;
        if (j > 2147483647L) {
            this.f5690a.m4906e().f18136c.m4847a("Bundle index overflow. appId", ft.m16220a(this.f5699j));
            j = 0;
        }
        this.f5698i = true;
        this.f5704o = j;
    }

    public final String m4807r() {
        this.f5690a.m4907f().mo1606c();
        return this.f5697h;
    }

    public final long m4808s() {
        this.f5690a.m4907f().mo1606c();
        return this.f5713x;
    }

    public final boolean m4809t() {
        this.f5690a.m4907f().mo1606c();
        return this.f5714y;
    }
}
