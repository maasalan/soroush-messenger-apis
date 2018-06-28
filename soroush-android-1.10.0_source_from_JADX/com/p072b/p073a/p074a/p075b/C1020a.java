package com.p072b.p073a.p074a.p075b;

import android.content.Context;
import com.p072b.p073a.p074a.C1072p;
import com.p072b.p073a.p074a.C5090g;
import com.p072b.p073a.p074a.p076c.C1022a;
import com.p072b.p073a.p074a.p078e.C1027a;
import com.p072b.p073a.p074a.p078e.C1028b.C5073a;
import com.p072b.p073a.p074a.p080g.C1043b;
import com.p072b.p073a.p074a.p080g.C5089c;
import com.p072b.p073a.p074a.p083i.C1061a;
import com.p072b.p073a.p074a.p084j.C1065b;
import com.p072b.p073a.p074a.p084j.C5094a;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

public final class C1020a {
    public String f3285a;
    public int f3286b;
    public int f3287c;
    public int f3288d;
    public int f3289e;
    public Context f3290f;
    public C1072p f3291g;
    public C1022a f3292h;
    public C1043b f3293i;
    public C1027a f3294j;
    public C1065b f3295k;
    public C1061a f3296l;
    public boolean f3297m;
    public boolean f3298n;
    public int f3299o;
    public boolean f3300p;
    public ThreadFactory f3301q;

    public static final class C1019a {
        private Pattern f3283a = Pattern.compile("^([A-Za-z]|[0-9]|_|-)+$");
        private C1020a f3284b = new C1020a();

        public C1019a(Context context) {
            this.f3284b.f3290f = context.getApplicationContext();
        }

        public final C1019a m2487a() {
            this.f3284b.f3287c = 0;
            return this;
        }

        public final C1019a m2488a(int i) {
            this.f3284b.f3288d = i;
            return this;
        }

        public final C1019a m2489a(C1027a c1027a) {
            this.f3284b.f3294j = c1027a;
            return this;
        }

        public final C1019a m2490b(int i) {
            this.f3284b.f3286b = i;
            return this;
        }

        public final C1020a m2491b() {
            if (this.f3284b.f3291g == null) {
                this.f3284b.f3291g = new C5090g();
            }
            if (this.f3284b.f3293i == null) {
                this.f3284b.f3293i = new C5089c(this.f3284b.f3290f);
            }
            if (this.f3284b.f3295k == null) {
                this.f3284b.f3295k = new C5094a();
            }
            return this.f3284b;
        }

        public final C1019a m2492c(int i) {
            this.f3284b.f3289e = i;
            return this;
        }
    }

    private C1020a() {
        this.f3285a = "default_job_manager";
        this.f3286b = 5;
        this.f3287c = 0;
        this.f3288d = 15;
        this.f3289e = 3;
        this.f3294j = new C5073a();
        this.f3297m = false;
        this.f3298n = false;
        this.f3299o = 5;
        this.f3300p = true;
        this.f3301q = null;
    }
}
