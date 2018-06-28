package mobi.mmdt.ott.logic.p261a.p306p;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base.LandingPageItem;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base.LandingPageRow;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page.C5858a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page.GetLandingPageResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C2725d;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C5954c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p387i.C2989a;
import mobi.mmdt.ott.provider.p387i.C2990b;
import mobi.mmdt.ott.provider.p387i.C2992c;
import mobi.mmdt.ott.provider.p387i.C2992c.C2991a;
import mobi.mmdt.ott.provider.p388j.C2996b;
import mobi.mmdt.ott.provider.p388j.C2996b.C2995a;
import mobi.mmdt.ott.provider.p388j.C2998f;
import mobi.mmdt.ott.provider.p388j.C6031e;
import mobi.mmdt.ott.provider.p388j.C6032g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p463b.C6931a;
import p000a.p001a.p002a.C0005c;

public final class C6765c extends C5891a {
    private String f19323a;

    public C6765c(String str) {
        super(C2683h.f8619a);
        this.f19323a = str;
    }

    private static void m17208a(int i, List<LandingPageRow> list, ArrayList<C2996b> arrayList, ArrayList<C2992c> arrayList2) {
        for (LandingPageRow landingPageRow : list) {
            C2990b.m7469a(landingPageRow.getId().intValue());
            C2995a b = new C2995a().m7483a(C2998f.m7494a(landingPageRow.getType())).m7487a(landingPageRow.getTitle()).m7486a(landingPageRow.getDisplayOrder()).m7490b(landingPageRow.getInterval()).m7485a(Boolean.valueOf(landingPageRow.getHasMore())).m7491b(landingPageRow.getImage()).m7492c(landingPageRow.getNumber()).m7484a((long) landingPageRow.getId().intValue()).m7489b(i);
            long abs = Math.abs(C2778b.m7093a());
            b.f9394a.f9404j = Long.valueOf(abs);
            arrayList.add(b.m7488a());
            for (LandingPageItem landingPageItem : landingPageRow.getItems()) {
                arrayList2.add(new C2991a().m7474a(landingPageItem.getTitle()).m7476b(landingPageItem.getImage()).m7478c(landingPageItem.getSubTitle()).m7479d(landingPageItem.getButtonText()).m7472a(landingPageItem.getId()).m7473a(landingPageItem.getDisplayOrder()).m7475b(landingPageRow.getId().intValue()).m7471a(C2989a.m7467a(landingPageItem.getAction())).m7480e(landingPageItem.getActionData()).m7477c(C2989a.m7467a(landingPageItem.getButtonActionType())).m7481f(landingPageItem.getButtonActionData()).f9378a);
            }
        }
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int i;
        int parseInt = Integer.parseInt(this.f19323a);
        C6032g c6032g = new C6032g();
        c6032g.m13487b(parseInt);
        C6031e b = c6032g.m13486b(MyApplication.m12952b());
        C2996b[] c2996bArr = new C2996b[b.getCount()];
        if (b.moveToFirst()) {
            i = 0;
            while (true) {
                int i2 = i + 1;
                c2996bArr[i] = C2996b.m7493a(b);
                if (!b.moveToNext()) {
                    break;
                }
                i = i2;
            }
        }
        b.close();
        parseInt = (c2996bArr.length <= 1 || c2996bArr[0].f9404j.longValue() <= Math.abs(C2778b.m7093a()) - 10800000) ? 1 : 0;
        if (parseInt == 0) {
            C2480b.m6740d("don't need doJob get landing page JOB");
            return;
        }
        GetLandingPageResponse a = new C5858a(C2535a.m6888a().m6928d(), this.f19323a).m13063a(MyApplication.m12952b());
        int landingPageId = a.getLandingPageId();
        List rows = a.getRows();
        i = Integer.parseInt(this.f19323a);
        if (rows != null && rows.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C6765c.m17208a(landingPageId, rows, arrayList, arrayList2);
            new C6032g().m13487b(i).m7360a(MyApplication.m12952b());
            C2726a.m7070a(arrayList, arrayList2);
        }
        C2480b.m6740d("landing page job ok");
        C2808d.m7147a(new C6931a(i));
        C0005c.m0a().m9d(new C2725d());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5954c(th));
        return C1073q.f3504b;
    }
}
