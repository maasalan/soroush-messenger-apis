package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.p038g.C0482m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class C4778j<E> extends C0386h {
    final Activity f13260b;
    final Context f13261c;
    final Handler f13262d;
    final int f13263e;
    public final C4783l f13264f;
    C0482m<String, C0417s> f13265g;
    boolean f13266h;
    C4787t f13267i;
    boolean f13268j;
    boolean f13269k;

    private C4778j(Activity activity, Context context, Handler handler) {
        this.f13264f = new C4783l();
        this.f13260b = activity;
        this.f13261c = context;
        this.f13262d = handler;
        this.f13263e = 0;
    }

    C4778j(C7249g c7249g) {
        this(c7249g, c7249g, c7249g.f20937c);
    }

    final C4787t m8972a(String str, boolean z, boolean z2) {
        if (this.f13265g == null) {
            this.f13265g = new C0482m();
        }
        C4787t c4787t = (C4787t) this.f13265g.get(str);
        if (c4787t == null && z2) {
            c4787t = new C4787t(str, this, z);
            this.f13265g.put(str, c4787t);
            return c4787t;
        }
        if (!(!z || c4787t == null || c4787t.f13342e)) {
            c4787t.m9123c();
        }
        return c4787t;
    }

    public View mo222a(int i) {
        return null;
    }

    public void mo2537a(Intent intent) {
        this.f13261c.startActivity(intent);
    }

    final void m8975a(String str) {
        if (this.f13265g != null) {
            C4787t c4787t = (C4787t) this.f13265g.get(str);
            if (c4787t != null && !c4787t.f13343f) {
                c4787t.m9128h();
                this.f13265g.remove(str);
            }
        }
    }

    public void mo2538a(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean mo223a() {
        return true;
    }

    public boolean mo2539b() {
        return true;
    }

    public LayoutInflater mo2540c() {
        return (LayoutInflater) this.f13261c.getSystemService("layout_inflater");
    }

    public void mo2541d() {
    }

    public boolean mo2542e() {
        return true;
    }

    public int mo2543f() {
        return this.f13263e;
    }
}
