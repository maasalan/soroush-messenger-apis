package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import java.io.FileNotFoundException;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5783e;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5789k;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p271b.C2607a;
import mobi.mmdt.ott.logic.p261a.af.p271b.C5899b;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p386h.C6025e;
import mobi.mmdt.ott.provider.p386h.C6027g;
import p000a.p001a.p002a.C0005c;

public abstract class C6664c extends C5891a {
    protected boolean f18956a = false;
    protected final int f18957b;
    protected final boolean f18958c;
    protected Exception f18959d;
    protected final boolean f18960e;
    protected String f18961f = null;
    protected C2896b f18962g;
    private long f18963h = System.currentTimeMillis();

    public C6664c(int i, boolean z, boolean z2, String str, C2896b c2896b) {
        super(C2683h.f8620b);
        this.f18957b = i;
        this.f18958c = z;
        this.f18960e = z2;
        this.f18961f = str;
        this.f18962g = c2896b;
    }

    protected abstract void mo3446a();

    public final void m17153a(int i) {
        if (this.f18961f != null) {
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            if (!this.f18960e) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f18963h < currentTimeMillis - 1000) {
                    C2984c.m7453a(parseLong, i);
                    this.f18963h = currentTimeMillis;
                }
            }
        }
        if (this.f18962g != null) {
            this.f18962g.mo2170a(i);
        }
    }

    public final void m17154a(Object obj) {
        if (this.f18961f != null) {
            String[] strArr;
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            if (obj instanceof C5783e) {
                strArr = new String[]{C2966b.m7406b(parseLong).f9206b};
            } else if (obj instanceof C5789k) {
                strArr = new String[]{C2966b.m7406b(parseLong).f9206b};
            } else {
                if (obj instanceof FileNotFoundException) {
                    if (C2966b.m7406b(parseLong).f9211g.equals(C2970j.OUT)) {
                        strArr = new String[]{C2966b.m7406b(parseLong).f9206b};
                    }
                }
                if (this.f18960e) {
                    C2984c.m7456a(parseLong, C2987i.ERROR);
                } else {
                    C2984c.m7464b(parseLong, C2987i.ERROR);
                }
                C0005c.m0a().m9d(new C2607a(this.f18957b, this.f18959d, this.f18960e));
            }
            C2966b.m7396a(strArr, C2971k.ERROR);
            if (this.f18960e) {
                C2984c.m7456a(parseLong, C2987i.ERROR);
            } else {
                C2984c.m7464b(parseLong, C2987i.ERROR);
            }
            C0005c.m0a().m9d(new C2607a(this.f18957b, this.f18959d, this.f18960e));
        }
        if (this.f18962g != null) {
            this.f18962g.mo2171a(this.f18957b, obj);
        }
    }

    public final void m17155a(String str, String str2, String str3) {
        if (this.f18961f != null) {
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            C2984c.m7456a(parseLong, C2987i.FINISHED);
            C2984c.m7453a(parseLong, 100);
            if (str != null) {
                if (!str.isEmpty()) {
                    C6025e c6025e = new C6025e();
                    c6025e.m13456b(str);
                    c6025e.m13459c(str3);
                    c6025e.m13463f(str2);
                    C6027g c6027g = new C6027g();
                    c6027g.m13470b(parseLong);
                    c6025e.m13445a(MyApplication.m12952b(), c6027g);
                }
            }
            throw new NullPointerException();
        }
        if (this.f18962g != null) {
            this.f18962g.mo2172a(str, str2, str3);
        }
    }

    public final void m17156b() {
        this.f18956a = true;
    }

    public final void m17157c() {
        if (this.f18961f != null) {
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            if (this.f18960e) {
                C2984c.m7464b(parseLong, C2987i.CANCEL);
            } else {
                C2984c.m7456a(parseLong, C2987i.CANCEL);
            }
        }
        if (this.f18962g != null) {
            this.f18962g.mo2173b();
        }
    }

    public final void m17158d() {
        if (this.f18961f != null) {
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            if (this.f18960e) {
                C2984c.m7464b(parseLong, C2987i.FINISHED);
            } else {
                C2984c.m7453a(parseLong, 100);
                C2984c.m7456a(parseLong, C2987i.FINISHED);
            }
            if (C2535a.m6888a().m6970s()) {
                C2983b a = C2984c.m7461a(parseLong);
                if (a.f9337f.equals(C2988j.IMAGE) || a.f9337f.equals(C2988j.GIF) || a.f9337f.equals(C2988j.VIDEO)) {
                    C2791c.m7109a();
                    C2791c.m7110a(a.f9334c);
                }
            }
        }
        if (this.f18962g != null) {
            this.f18962g.mo2174c();
        }
    }

    public void onAdded() {
        if (this.f18961f != null) {
            long parseLong = Long.parseLong(this.f18961f.split("_")[1]);
            if (this.f18960e) {
                C2984c.m7464b(parseLong, C2987i.TRANSMITTING);
            } else {
                C2984c.m7456a(parseLong, C2987i.TRANSMITTING);
            }
        }
        if (this.f18962g != null) {
            this.f18962g.mo2169a();
        }
    }

    protected void onCancel(int i, Throwable th) {
        C0005c.m0a().m9d(new C2607a(this.f18957b, this.f18959d, this.f18960e));
        m17157c();
    }

    protected C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        this.f18959d = (Exception) th;
        C0005c.m0a().m9d(new C5899b(th));
        m17154a((Object) th);
        return C1073q.f3504b;
    }
}
