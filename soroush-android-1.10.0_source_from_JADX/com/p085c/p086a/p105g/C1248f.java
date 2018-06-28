package com.p085c.p086a.p105g;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p089c.p098d.p099a.C1186l;
import com.p085c.p086a.p089c.p098d.p099a.C1188m;
import com.p085c.p086a.p089c.p098d.p099a.C6450c;
import com.p085c.p086a.p089c.p098d.p099a.C7034h;
import com.p085c.p086a.p089c.p098d.p099a.C7035i;
import com.p085c.p086a.p089c.p098d.p099a.C7036j;
import com.p085c.p086a.p089c.p098d.p099a.C7037n;
import com.p085c.p086a.p089c.p098d.p100e.C5242a;
import com.p085c.p086a.p089c.p098d.p100e.C5244c;
import com.p085c.p086a.p089c.p098d.p100e.C5247i;
import com.p085c.p086a.p089c.p098d.p100e.C6457f;
import com.p085c.p086a.p108h.C5276b;
import com.p085c.p086a.p109i.C1271h;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1248f implements Cloneable {
    private static C1248f f3904y;
    private static C1248f f3905z;
    public int f3906a;
    public float f3907b = BallPulseIndicator.SCALE;
    public C1144h f3908c = C1144h.f3693e;
    public C1251g f3909d = C1251g.NORMAL;
    public Drawable f3910e;
    public int f3911f;
    public Drawable f3912g;
    public int f3913h;
    public boolean f3914i = true;
    public int f3915j = -1;
    public int f3916k = -1;
    public C1208h f3917l = C5276b.m10937a();
    public boolean f3918m;
    public boolean f3919n = true;
    public Drawable f3920o;
    public int f3921p;
    public C5253j f3922q = new C5253j();
    public Map<Class<?>, C5255m<?>> f3923r = new HashMap();
    public Class<?> f3924s = Object.class;
    public boolean f3925t;
    public Theme f3926u;
    public boolean f3927v;
    public boolean f3928w;
    public boolean f3929x;

    public static C1248f m2937a() {
        if (f3904y == null) {
            f3904y = new C1248f().m2959e().m2963i();
        }
        return f3904y;
    }

    public static C1248f m2938a(C1144h c1144h) {
        return new C1248f().m2955b(c1144h);
    }

    private C1248f m2939a(C1186l c1186l) {
        return m2941a(C1188m.f3768b, C1271h.m3012a((Object) c1186l, "Argument must not be null"));
    }

    public static C1248f m2940a(C1208h c1208h) {
        C1248f c1248f = new C1248f();
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3917l = (C1208h) C1271h.m3012a((Object) c1208h, "Argument must not be null");
        c1248f.f3906a |= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
        return c1248f.m2964j();
    }

    private <T> C1248f m2941a(C1210i<T> c1210i, T t) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        C1271h.m3012a((Object) c1210i, "Argument must not be null");
        C1271h.m3012a((Object) t, "Argument must not be null");
        c1248f.f3922q.f14601b.put(c1210i, t);
        return c1248f.m2964j();
    }

    public static C1248f m2942a(Class<?> cls) {
        C1248f c1248f = new C1248f();
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3924s = (Class) C1271h.m3012a((Object) cls, "Argument must not be null");
        c1248f.f3906a |= ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        return c1248f.m2964j();
    }

    private <T> C1248f m2943a(Class<T> cls, C5255m<T> c5255m) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        C1271h.m3012a((Object) cls, "Argument must not be null");
        C1271h.m3012a((Object) c5255m, "Argument must not be null");
        c1248f.f3923r.put(cls, c5255m);
        c1248f.f3906a |= 2048;
        c1248f.f3919n = true;
        c1248f.f3906a |= 65536;
        return c1248f.m2964j();
    }

    public static boolean m2944a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static C1248f m2945b() {
        if (f3905z == null) {
            f3905z = new C1248f().m2946b(C1186l.f3764e, new C7036j()).m2963i();
        }
        return f3905z;
    }

    private C1248f m2946b(C1186l c1186l, C5255m<Bitmap> c5255m) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.m2939a(c1186l);
        return c1248f.m2951a((C5255m) c5255m);
    }

    private C1248f m2947b(C5255m<Bitmap> c5255m) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.m2943a(Bitmap.class, (C5255m) c5255m);
        c1248f.m2943a(BitmapDrawable.class, new C6450c(c5255m));
        c1248f.m2943a(C5244c.class, new C6457f(c5255m));
        return c1248f.m2964j();
    }

    public final C1248f m2948a(float f) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        if (f >= 0.0f) {
            if (f <= BallPulseIndicator.SCALE) {
                c1248f.f3907b = f;
                c1248f.f3906a |= 2;
                return c1248f.m2964j();
            }
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public final C1248f m2949a(int i) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3913h = i;
        c1248f.f3906a |= 128;
        return c1248f.m2964j();
    }

    public final C1248f m2950a(C1186l c1186l, C5255m<Bitmap> c5255m) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.m2939a(c1186l);
        return c1248f.m2947b((C5255m) c5255m);
    }

    public final C1248f m2951a(C5255m<Bitmap> c5255m) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.m2947b((C5255m) c5255m);
        c1248f.f3918m = true;
        c1248f.f3906a |= 131072;
        return c1248f.m2964j();
    }

    public final C1248f m2952a(C1251g c1251g) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3909d = (C1251g) C1271h.m3012a((Object) c1251g, "Argument must not be null");
        c1248f.f3906a |= 8;
        return c1248f.m2964j();
    }

    public final C1248f m2953b(int i) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3911f = i;
        c1248f.f3906a |= 32;
        return c1248f.m2964j();
    }

    public final C1248f m2954b(int i, int i2) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3916k = i;
        c1248f.f3915j = i2;
        c1248f.f3906a |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        return c1248f.m2964j();
    }

    public final C1248f m2955b(C1144h c1144h) {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3908c = (C1144h) C1271h.m3012a((Object) c1144h, "Argument must not be null");
        c1248f.f3906a |= 4;
        return c1248f.m2964j();
    }

    public final C1248f m2956c() {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.f3914i = false;
        c1248f.f3906a |= 256;
        return c1248f.m2964j();
    }

    public final boolean m2957c(int i) {
        return C1248f.m2944a(this.f3906a, i);
    }

    public final /* synthetic */ Object clone() {
        return m2958d();
    }

    public final C1248f m2958d() {
        try {
            C1248f c1248f = (C1248f) super.clone();
            c1248f.f3922q = new C5253j();
            c1248f.f3922q.m10874a(this.f3922q);
            c1248f.f3923r = new HashMap();
            c1248f.f3923r.putAll(this.f3923r);
            c1248f.f3925t = false;
            c1248f.f3927v = false;
            return c1248f;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C1248f m2959e() {
        return m2946b(C1186l.f3761b, new C7034h());
    }

    public final C1248f m2960f() {
        return m2946b(C1186l.f3760a, new C7037n());
    }

    public final C1248f m2961g() {
        return m2950a(C1186l.f3764e, new C7035i());
    }

    public final C1248f m2962h() {
        C1248f c1248f = this;
        while (c1248f.f3927v) {
            c1248f = c1248f.m2958d();
        }
        c1248f.m2941a(C5242a.f14569a, Boolean.valueOf(true));
        c1248f.m2941a(C5247i.f14592a, Boolean.valueOf(true));
        return c1248f.m2964j();
    }

    public final C1248f m2963i() {
        if (!this.f3925t || this.f3927v) {
            this.f3927v = true;
            this.f3925t = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public final C1248f m2964j() {
        if (!this.f3925t) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }
}
