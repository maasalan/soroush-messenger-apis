package com.p085c.p086a.p089c.p092b.p094b;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p109i.C1268e;
import com.p085c.p086a.p109i.C1273i;
import com.p085c.p086a.p109i.p110a.C1262a;
import com.p085c.p086a.p109i.p110a.C1262a.C1259a;
import com.p085c.p086a.p109i.p110a.C1262a.C1260c;
import com.p085c.p086a.p109i.p110a.C1263b;
import com.p085c.p086a.p109i.p110a.C1263b.C5282a;
import java.security.MessageDigest;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1125j {
    private final C1268e<C1208h, String> f3629a = new C1268e(IjkMediaCodecInfo.RANK_MAX);
    private final C0479a<C5134a> f3630b = C1262a.m2983a(10, new C51331(this));

    class C51331 implements C1259a<C5134a> {
        final /* synthetic */ C1125j f14352a;

        C51331(C1125j c1125j) {
            this.f14352a = c1125j;
        }

        private static C5134a m10559b() {
            try {
                return new C5134a(MessageDigest.getInstance("SHA-256"));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public final /* synthetic */ Object mo1156a() {
            return C51331.m10559b();
        }
    }

    private static final class C5134a implements C1260c {
        final MessageDigest f14353a;
        private final C1263b f14354b = new C5282a();

        C5134a(MessageDigest messageDigest) {
            this.f14353a = messageDigest;
        }

        public final C1263b b_() {
            return this.f14354b;
        }
    }

    private String m2724b(C1208h c1208h) {
        C5134a c5134a = (C5134a) this.f3630b.mo308a();
        try {
            c1208h.mo1158a(c5134a.f14353a);
            String a = C1273i.m3018a(c5134a.f14353a.digest());
            return a;
        } finally {
            this.f3630b.mo309a(c5134a);
        }
    }

    public final String m2725a(C1208h c1208h) {
        String str;
        synchronized (this.f3629a) {
            str = (String) this.f3629a.m3005b((Object) c1208h);
        }
        if (str == null) {
            str = m2724b(c1208h);
        }
        synchronized (this.f3629a) {
            this.f3629a.m3006b(c1208h, str);
        }
        return str;
    }
}
