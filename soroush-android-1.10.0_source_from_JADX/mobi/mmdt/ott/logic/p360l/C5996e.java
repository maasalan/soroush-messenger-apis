package mobi.mmdt.ott.logic.p360l;

import android.media.MediaPlayer;
import android.net.Uri;
import com.p072b.p073a.p074a.C1063i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a;
import mobi.mmdt.componentsutils.p232b.p235c.C2481c;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.C2815f;
import mobi.mmdt.ott.logic.bot.api.p342a.C6801e;
import mobi.mmdt.ott.logic.bot.api.weather.ProcessWeatherResultJob;
import mobi.mmdt.ott.logic.bot.api.weather.WeatherBot;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6715d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6717f;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6723l;
import mobi.mmdt.ott.logic.p261a.p296j.p297a.C2694a;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C2736g;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p347d.C2804a;
import mobi.mmdt.ott.logic.p347d.C2804a.C28031;
import mobi.mmdt.ott.logic.p347d.C2806c;
import mobi.mmdt.ott.logic.p347d.C2807d;
import mobi.mmdt.ott.logic.p360l.C2848d.C28471;
import mobi.mmdt.ott.p240c.C2515a.C5770a;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.p240c.C2526d;
import mobi.mmdt.ott.p240c.C2526d.C2525a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p392n.C3008a;
import mobi.mmdt.ott.provider.p392n.C3009b;
import p000a.p001a.p002a.C0005c;

public final class C5996e implements C2526d {
    private static C5996e f16146b;
    public C2788a f16147a = C2788a.m7101a();
    private C2848d f16148c;

    private C5996e() {
        if (C2848d.f8935a == null) {
            C2848d.f8935a = new C2848d();
        }
        this.f16148c = C2848d.f8935a;
        C2788a c2788a = this.f16147a;
        c2788a.f8810b = this;
        c2788a.f8811c.mo2159b(c2788a.f8810b);
    }

    public static C5996e m13260a() {
        if (f16146b == null) {
            f16146b = new C5996e();
        }
        return f16146b;
    }

    public final void mo2198a(String str) {
        C2778b.m7093a();
        C2968f a = C2966b.m7400a(str);
        if (a != null) {
            if (a.f9214j.equals(C2973m.SINGLE) || a.f9214j.equals(C2973m.BOT)) {
                C2971k c2971k = C2971k.PENDING;
                C6019d c6019d = new C6019d();
                c6019d.m13340a(c2971k);
                C6021g c6021g = new C6021g();
                ((C6021g) ((C6021g) c6021g.m13378a(str).m7368c()).m13388b(C2971k.SEEN).m7368c()).m13388b(C2971k.DELIVERED);
                c6019d.m13332a(c6021g);
            }
            str = a.f9213i;
            if (str != null && MyApplication.m12950a().f15918x != null && str.equals(MyApplication.m12950a().f15918x) && C2535a.m6888a().ai().booleanValue()) {
                try {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(MyApplication.m12952b(), Uri.parse("android.resource://mobi.mmdt.ott/raw/received"));
                    mediaPlayer.setAudioStreamType(5);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (Throwable e) {
                    C2480b.m6737b("playChatOutSound exception", e);
                }
            }
        }
    }

    public final void mo2199a(String str, String str2, String str3, String str4, Map<String, String> map) {
        C2848d.m7210a(str2, str, str3, str4, map);
    }

    public final void mo2200a(String str, String str2, String str3, Map<String, String> map) {
        C1063i c6801e;
        if (str.equals("cityapi@api.soroush")) {
            c6801e = new C6801e(str2, str3);
        } else if (str.equals(WeatherBot.BOT_ID)) {
            c6801e = new ProcessWeatherResultJob(str2, str3);
        } else {
            if (map.containsKey("MAJOR_TYPE") && ((String) map.get("MAJOR_TYPE")).equals("BOT")) {
                C2808d.m7147a(new C6715d(str, str, str2, str3, map, C2971k.NOT_READ, C2970j.IN));
            }
            return;
        }
        C2808d.m7148b(c6801e);
    }

    public final void mo2201a(String str, String str2, C2522a c2522a) {
        C2804a a = C2804a.m7145a();
        HashMap hashMap = (HashMap) a.f8869b.get(str);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (!str2.equals(C2535a.m6888a().m6928d())) {
            if (C28031.f8866a[c2522a.ordinal()] != 1) {
                hashMap.remove(str2);
            } else {
                hashMap.put(str2, c2522a);
            }
            a.f8869b.put(str, hashMap);
            str2 = MyApplication.m12950a().f15918x;
            if (str2 != null && str2.equals(str)) {
                C0005c.m0a().m9d(new C2806c(str));
            }
        }
    }

    public final void mo2202a(String str, C2522a c2522a) {
        C2804a.m7145a().f8868a.put(str, c2522a);
        C0005c.m0a().m9d(new C2807d(str, c2522a));
    }

    public final void mo2203a(C2525a c2525a) {
        C2848d c2848d = this.f16148c;
        StartUpService.m7126a(c2525a);
        if (c2525a.equals(C2525a.CONNECTED)) {
            MyApplication.m12950a().m12958a(C2845b.UPDATING);
            C2535a.m6888a().m6969s(false);
            C2808d.m7147a(new C6723l());
            C2808d.m7147a(new C6717f());
            int i = C2788a.m7101a().f8809a.f8204i;
            if (C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_INIT_GROUP_TIME", 0) < C2778b.m7093a() - 180000) {
                new Timer().schedule(new C28471(c2848d, i), 2000);
            } else if (i == C5770a.f8181b) {
                C2736g.m7074a();
            }
            C2694a.m7065a();
            if (!C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_CHANGES_SYNCED", false)) {
                C2480b.m6742f("syncTest MessageListener onStateChanged called and syncContacts Executed ");
                C2815f.m7153a();
            }
            Iterator it = C3009b.m7518a().iterator();
            while (it.hasNext()) {
                C3008a c3008a = (C3008a) it.next();
                if (c3008a.f9450a.equals("REPORT_PARTY")) {
                    C0005c.m0a().m9d(new C2481c(c3008a.f9450a, C2479a.f8156c, c3008a.f9451b));
                }
            }
            return;
        }
        MyApplication.m12950a().m12958a(C2845b.CONNECTING);
        C2804a.m7145a().m7146b();
    }

    public final void mo2204b(String str, String str2, String str3, String str4, Map<String, String> map) {
        C2848d.m7210a(str, str2, str3, str4, map);
    }
}
