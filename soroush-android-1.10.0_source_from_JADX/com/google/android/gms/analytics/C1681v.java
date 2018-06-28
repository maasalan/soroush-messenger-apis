package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1826w;
import com.google.android.gms.internal.C5492a;
import com.google.android.gms.internal.C6581n;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.ce;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

final class C1681v implements Runnable {
    private /* synthetic */ Map f5173a;
    private /* synthetic */ boolean f5174b;
    private /* synthetic */ String f5175c;
    private /* synthetic */ long f5176d;
    private /* synthetic */ boolean f5177e;
    private /* synthetic */ boolean f5178f;
    private /* synthetic */ String f5179g;
    private /* synthetic */ C6569h f5180h;

    C1681v(C6569h c6569h, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f5180h = c6569h;
        this.f5173a = map;
        this.f5174b = z;
        this.f5175c = str;
        this.f5176d = j;
        this.f5177e = z2;
        this.f5178f = z3;
        this.f5179g = str2;
    }

    public final void run() {
        Object obj;
        long b;
        long j;
        if (this.f5180h.f17947d.m15855b()) {
            r0.f5173a.put("sc", "start");
        }
        C5436i d = r0.f5180h.f6279f.m5163d();
        ac.m4387c("getClientId can not be called from the main thread");
        ce.m4654b(r0.f5173a, "cid", d.f15089f.m5166g().m15980b());
        String str = (String) r0.f5173a.get("sf");
        if (str != null) {
            double a = ce.m4643a(str);
            if (ce.m4650a(a, (String) r0.f5173a.get("cid"))) {
                r0.f5180h.m5144b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                return;
            }
        }
        C6581n f = r0.f5180h.f6279f.m5165f();
        if (r0.f5174b) {
            ce.m4649a(r0.f5173a, "ate", f.m16726b());
            ce.m4647a(r0.f5173a, "adid", f.m16727c());
        } else {
            r0.f5173a.remove("ate");
            r0.f5173a.remove("adid");
        }
        C5492a b2 = r0.f5180h.f6279f.m5167h().m15956b();
        ce.m4647a(r0.f5173a, "an", b2.f15172a);
        ce.m4647a(r0.f5173a, "av", b2.f15173b);
        ce.m4647a(r0.f5173a, "aid", b2.f15174c);
        ce.m4647a(r0.f5173a, "aiid", b2.f15175d);
        r0.f5173a.put("v", "1");
        r0.f5173a.put("_v", C1826w.f6281b);
        ce.m4647a(r0.f5173a, XHTMLText.UL, r0.f5180h.f6279f.f6290h.m15983b().f15225a);
        ce.m4647a(r0.f5173a, "sr", r0.f5180h.f6279f.f6290h.m15984c());
        if (!r0.f5175c.equals("transaction")) {
            if (!r0.f5175c.equals("item")) {
                obj = null;
                if (obj == null || r0.f5180h.f17946c.m4617a()) {
                    b = ce.m4653b((String) r0.f5173a.get("ht"));
                    if (b == 0) {
                        b = r0.f5176d;
                    }
                    j = b;
                    if (r0.f5177e) {
                        String str2 = (String) r0.f5173a.get("cid");
                        Map hashMap = new HashMap();
                        ce.m4648a(hashMap, "uid", r0.f5173a);
                        ce.m4648a(hashMap, "an", r0.f5173a);
                        ce.m4648a(hashMap, "aid", r0.f5173a);
                        ce.m4648a(hashMap, "av", r0.f5173a);
                        ce.m4648a(hashMap, "aiid", r0.f5173a);
                        r0.f5173a.put("_s", String.valueOf(r0.f5180h.f6279f.m5162c().m16765a(new aa(str2, r0.f5179g, TextUtils.isEmpty((CharSequence) r0.f5173a.get("adid")) ^ 1, 0, hashMap))));
                        r0.f5180h.f6279f.m5162c().m16767a(new bk(r0.f5180h, r0.f5173a, j, r0.f5178f));
                        return;
                    }
                    r0.f5180h.f6279f.m5160a().m5148c("Dry run enabled. Would have sent hit", new bk(r0.f5180h, r0.f5173a, j, r0.f5178f));
                }
                r0.f5180h.f6279f.m5160a().m15993a(r0.f5173a, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        obj = 1;
        if (obj == null) {
        }
        b = ce.m4653b((String) r0.f5173a.get("ht"));
        if (b == 0) {
            b = r0.f5176d;
        }
        j = b;
        if (r0.f5177e) {
            String str22 = (String) r0.f5173a.get("cid");
            Map hashMap2 = new HashMap();
            ce.m4648a(hashMap2, "uid", r0.f5173a);
            ce.m4648a(hashMap2, "an", r0.f5173a);
            ce.m4648a(hashMap2, "aid", r0.f5173a);
            ce.m4648a(hashMap2, "av", r0.f5173a);
            ce.m4648a(hashMap2, "aiid", r0.f5173a);
            r0.f5173a.put("_s", String.valueOf(r0.f5180h.f6279f.m5162c().m16765a(new aa(str22, r0.f5179g, TextUtils.isEmpty((CharSequence) r0.f5173a.get("adid")) ^ 1, 0, hashMap2))));
            r0.f5180h.f6279f.m5162c().m16767a(new bk(r0.f5180h, r0.f5173a, j, r0.f5178f));
            return;
        }
        r0.f5180h.f6279f.m5160a().m5148c("Dry run enabled. Would have sent hit", new bk(r0.f5180h, r0.f5173a, j, r0.f5178f));
    }
}
