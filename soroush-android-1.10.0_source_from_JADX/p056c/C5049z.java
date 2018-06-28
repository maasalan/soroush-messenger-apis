package p056c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p056c.C0949t.C0948a;
import p056c.p057a.C0874b;
import p056c.p057a.C0885c;
import p056c.p057a.p058a.C4996a;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p059b.C4997a;
import p056c.p057a.p059b.C4998c;
import p056c.p057a.p060c.C0877c;
import p056c.p057a.p060c.C4999a;
import p056c.p057a.p060c.C5000b;
import p056c.p057a.p060c.C5001g;
import p056c.p057a.p060c.C5003j;
import p056c.p057a.p063g.C0909f;

public final class C5049z implements C0925e {
    final C5047x f14108a;
    final C5003j f14109b;
    final aa f14110c;
    final boolean f14111d;
    private C0942p f14112e;
    private boolean f14113f;

    final class C5048a extends C0874b {
        final /* synthetic */ C5049z f14106a;
        private final C0926f f14107c;

        C5048a(C5049z c5049z, C0926f c0926f) {
            this.f14106a = c5049z;
            super("OkHttp %s", c5049z.m10246d());
            this.f14107c = c0926f;
        }

        final String m10238a() {
            return this.f14106a.f14110c.f2801a.f3008b;
        }

        protected final void mo971b() {
            IOException e;
            C0909f c;
            StringBuilder stringBuilder;
            C5049z c5049z;
            StringBuilder stringBuilder2;
            Object obj = 1;
            try {
                ac e2 = this.f14106a.m10247e();
                if (this.f14106a.f14109b.f13944c) {
                    try {
                        this.f14107c.mo1783a(this.f14106a, new IOException("Canceled"));
                    } catch (IOException e3) {
                        e = e3;
                        if (obj == null) {
                            C0942p.m2336t();
                            this.f14107c.mo1783a(this.f14106a, e);
                        } else {
                            try {
                                c = C0909f.m2216c();
                                stringBuilder = new StringBuilder("Callback failure for ");
                                c5049z = this.f14106a;
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(c5049z.f14109b.f13944c ? "" : "canceled ");
                                stringBuilder2.append(c5049z.f14111d ? "call" : "web socket");
                                stringBuilder2.append(" to ");
                                stringBuilder2.append(c5049z.m10246d());
                                stringBuilder.append(stringBuilder2.toString());
                                c.mo990a(4, stringBuilder.toString(), (Throwable) e);
                            } catch (Throwable th) {
                                this.f14106a.f14108a.f14082c.m2312b(this);
                            }
                        }
                        this.f14106a.f14108a.f14082c.m2312b(this);
                    }
                }
                this.f14107c.mo1782a(this.f14106a, e2);
            } catch (Throwable e4) {
                e = e4;
                obj = null;
                if (obj == null) {
                    c = C0909f.m2216c();
                    stringBuilder = new StringBuilder("Callback failure for ");
                    c5049z = this.f14106a;
                    stringBuilder2 = new StringBuilder();
                    if (c5049z.f14109b.f13944c) {
                    }
                    stringBuilder2.append(c5049z.f14109b.f13944c ? "" : "canceled ");
                    if (c5049z.f14111d) {
                    }
                    stringBuilder2.append(c5049z.f14111d ? "call" : "web socket");
                    stringBuilder2.append(" to ");
                    stringBuilder2.append(c5049z.m10246d());
                    stringBuilder.append(stringBuilder2.toString());
                    c.mo990a(4, stringBuilder.toString(), (Throwable) e);
                } else {
                    C0942p.m2336t();
                    this.f14107c.mo1783a(this.f14106a, e);
                }
                this.f14106a.f14108a.f14082c.m2312b(this);
            }
            this.f14106a.f14108a.f14082c.m2312b(this);
        }
    }

    private C5049z(C5047x c5047x, aa aaVar, boolean z) {
        this.f14108a = c5047x;
        this.f14110c = aaVar;
        this.f14111d = z;
        this.f14109b = new C5003j(c5047x, z);
    }

    public static C5049z m10240a(C5047x c5047x, aa aaVar, boolean z) {
        C5049z c5049z = new C5049z(c5047x, aaVar, z);
        c5049z.f14112e = c5047x.f14088i.mo1006a();
        return c5049z;
    }

    private void m10241f() {
        this.f14109b.f13943b = C0909f.m2216c().mo988a("response.body().close()");
    }

    public final aa mo1018a() {
        return this.f14110c;
    }

    public final void mo1019a(C0926f c0926f) {
        synchronized (this) {
            if (this.f14113f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f14113f = true;
        }
        m10241f();
        C0942p.m2317a();
        this.f14108a.f14082c.m2310a(new C5048a(this, c0926f));
    }

    public final ac mo1020b() {
        synchronized (this) {
            if (this.f14113f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f14113f = true;
        }
        m10241f();
        C0942p.m2317a();
        try {
            this.f14108a.f14082c.m2311a(this);
            ac e = m10247e();
            if (e == null) {
                throw new IOException("Canceled");
            }
            this.f14108a.f14082c.m2313b(this);
            return e;
        } catch (IOException e2) {
            C0942p.m2336t();
            throw e2;
        } catch (Throwable th) {
            this.f14108a.f14082c.m2313b(this);
        }
    }

    public final void mo1021c() {
        C5003j c5003j = this.f14109b;
        c5003j.f13944c = true;
        C0873g c0873g = c5003j.f13942a;
        if (c0873g != null) {
            C0877c c0877c;
            C4998c c4998c;
            synchronized (c0873g.f2612d) {
                c0873g.f2617i = true;
                c0877c = c0873g.f2618j;
                c4998c = c0873g.f2616h;
            }
            if (c0877c != null) {
                c0877c.mo970c();
            } else if (c4998c != null) {
                C0885c.m2099a(c4998c.f13912b);
            }
        }
    }

    public final /* synthetic */ Object clone() {
        return C5049z.m10240a(this.f14108a, this.f14110c, this.f14111d);
    }

    final String m10246d() {
        C0948a d = this.f14110c.f2801a.m2372d("/...");
        d.f2999b = C0949t.m2360a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        d.f3000c = C0949t.m2360a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return d.m2355b().toString();
    }

    final ac m10247e() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.f14108a.f14086g);
        arrayList.add(this.f14109b);
        arrayList.add(new C4999a(this.f14108a.f14090k));
        C5047x c5047x = this.f14108a;
        arrayList.add(new C4996a(c5047x.f14091l != null ? c5047x.f14091l.f2854a : c5047x.f14092m));
        arrayList.add(new C4997a(this.f14108a));
        if (!this.f14111d) {
            arrayList.addAll(this.f14108a.f14087h);
        }
        arrayList.add(new C5000b(this.f14111d));
        return new C5001g(arrayList, null, null, null, 0, this.f14110c, this, this.f14112e, this.f14108a.f14105z, this.f14108a.f14079A, this.f14108a.f14080B).mo952a(this.f14110c);
    }
}
