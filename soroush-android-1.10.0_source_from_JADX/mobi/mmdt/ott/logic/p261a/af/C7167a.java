package mobi.mmdt.ott.logic.p261a.af;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.net.URL;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b.C2550c;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p520a.C5775a;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p522a.C5779d;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p521b.p541b.C6639d;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C2553d;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C2554y;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5783e;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5789k;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5799u;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5800v;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.aj;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.au;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2597b;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2599e;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2600f;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2601g;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2606l;
import mobi.mmdt.ott.logic.p261a.af.p270a.C5896a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C5897c;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.json.JSONObject;
import p056c.C0952v;
import p056c.C5047x;
import p056c.C5047x.C0955a;
import p056c.C5049z;
import p056c.aa;
import p056c.aa.C0915a;
import p056c.ab;

public final class C7167a extends C6664c {
    private Uri f20600h;
    private Uri f20601i;
    private int f20602j = 0;
    private C2597b f20603k;
    private int f20604l = 204800;
    private boolean f20605m;
    private int f20606n;
    private String f20607o;
    private String f20608p;
    private long f20609q;
    private long f20610r;

    public C7167a(int i, Uri uri, Uri uri2, boolean z, int i2, String str, C2896b c2896b) {
        super(i, z, false, str, c2896b);
        boolean z2 = false;
        this.f20600h = uri;
        this.f20601i = uri2;
        if (!(uri2 == null || TextUtils.isEmpty(uri2.toString()))) {
            z2 = true;
        }
        this.f20605m = z2;
        this.f20606n = i2;
    }

    private static C5779d m18951a(Uri uri) {
        String d = C2535a.m6888a().m6928d();
        C2560a.m7006a(MyApplication.m12952b());
        String b = C2560a.m7008b();
        C2560a.m7006a(MyApplication.m12952b());
        JSONObject c5775a = new C5775a(uri, d, b, C2560a.m7010d());
        Context b2 = MyApplication.m12952b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2535a.m6888a().m6942g());
        stringBuilder.append("file_exists/");
        b = stringBuilder.toString();
        C0952v a = C0952v.m2385a("application/json; charset=utf-8");
        C5047x a2 = new C0955a().m2391a();
        aa a3 = new C0915a().m2239a(b).m2240a("POST", ab.m2249a(a, c5775a.toString())).m2244b("User-Agent", C2492j.m6840a(b2)).m2242a();
        StringBuilder stringBuilder2 = new StringBuilder("POST WebService <<");
        stringBuilder2.append(c5775a.toString());
        stringBuilder2.append(">> URL <<");
        stringBuilder2.append(b);
        stringBuilder2.append(">>");
        C2480b.m6736b(stringBuilder2.toString());
        d = FirebasePerfOkHttpClient.execute(C5049z.m10240a(a2, a3, false)).f2825g.m2270e();
        stringBuilder = new StringBuilder("Receive WebService ");
        stringBuilder.append(d);
        C2480b.m6736b(stringBuilder.toString());
        try {
            return (C5779d) C2550c.m6990a(c5775a, new JSONObject(d), new C6639d());
        } catch (C2554y e) {
            if (e.f8309a == 340) {
                int i = e.f8309a;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(uri);
                stringBuilder3.append(" - ");
                stringBuilder3.append(e.f8310b);
                throw new C5789k(i, stringBuilder3.toString(), c5775a);
            } else if (e.f8309a == 342) {
                throw new C5799u(e.f8309a, e.f8310b, c5775a);
            } else if (e.f8309a == 341) {
                throw new C5783e(e.f8309a, e.f8310b, c5775a);
            } else if (e.f8309a == 343) {
                throw new aj(e.f8309a, e.f8310b, c5775a);
            } else if (e.f8309a == 950) {
                throw new C5800v(e.f8309a, e.f8310b, c5775a);
            } else {
                throw new au(e.f8309a, e.f8310b, c5775a);
            }
        }
    }

    protected final void mo3446a() {
        this.f20609q = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2535a.m6888a().m6942g());
        stringBuilder.append("ru/start_session");
        String stringBuilder2 = stringBuilder.toString();
        try {
            C2601g a;
            this.f20603k = new C2597b();
            this.f20603k.f8451a = new URL(stringBuilder2);
            C2597b c2597b = this.f20603k;
            C2599e c5897c = new C5897c(this);
            c2597b.f8452b = true;
            c2597b.f8453c = c5897c;
            C2606l c2606l = C2606l.STATIC;
            Uri uri = this.f20600h;
            Uri uri2 = this.f20601i;
            boolean z = this.f20605m;
            String str = this.f20607o;
            String str2 = this.f20608p;
            int i = this.f20606n;
            MyApplication.m12952b();
            C2600f c5896a = new C5896a(uri, uri2, z, str, str2, c2606l, i);
            C2601g a2 = this.f20603k.m7030a(c5896a);
            long j = c5896a.f8467j;
            long j2 = c5896a.f8466i;
            a2.f8479b = new byte[Math.min(this.f20604l, (int) j2)];
            this.f20610r = System.currentTimeMillis();
            StringBuilder stringBuilder3 = new StringBuilder("##### Delay For Begin Upload is ->");
            stringBuilder3.append(this.f20610r - this.f20609q);
            stringBuilder3.append(" ms");
            C2480b.m6736b(stringBuilder3.toString());
            this.f20609q = System.currentTimeMillis();
            MyApplication.m12950a().m12960c("upload_started");
            while (!isCancelled() && !this.a && a2.m7035a() > 0) {
                m17153a((int) ((a2.f8478a * 100) / j));
            }
            if (this.f20605m) {
                Uri uri3 = this.f20601i;
                String url = c5896a.f8471n.toString();
                stringBuilder2 = c5896a.f8472o.toString();
                i = this.f20606n;
                MyApplication.m12952b();
                C2600f c5896a2 = new C5896a(uri3, url, stringBuilder2, i);
                a = this.f20603k.m7030a(c5896a2);
                a.f8479b = new byte[Math.min(this.f20604l, (int) c5896a2.f8466i)];
                while (!isCancelled() && !this.a && a.m7035a() > 0) {
                    m17153a((int) (((a.f8478a + j2) * 100) / j));
                }
            } else {
                a = a2;
            }
            if (isCanceled() || this.a) {
                m17157c();
                if (a.f8481d != null) {
                    a.f8481d.close();
                }
                if (a.f8480c != null) {
                    a.f8480c.disconnect();
                    a.f8480c = null;
                }
                return;
            }
            a.m7036b();
            this.f20610r = System.currentTimeMillis();
            MyApplication.m12950a().m12960c("upload_finished");
            stringBuilder = new StringBuilder("##### Duration For Upload Complete ->");
            stringBuilder.append(this.f20610r - this.f20609q);
            stringBuilder.append(" ms");
            C2480b.m6736b(stringBuilder.toString());
        } catch (Throwable e) {
            C2480b.m6735a(e);
            m17154a((Object) e);
            if (e instanceof C2553d) {
                throw new C2553d(e.getMessage());
            }
        }
    }

    public final void onRun() {
        C5779d a = C7167a.m18951a(this.f20600h);
        if (a != null) {
            if (a.f15964d) {
                m17155a(a.f15961a, a.f15962b, a.f15963c);
                return;
            }
        }
        mo3446a();
    }
}
