package mobi.mmdt.ott.logic.p261a.p306p;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base.LandingPageItem;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items.C5857a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items.GetCategoryItemsResponse;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C2724b;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C5953a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p387i.C2989a;
import mobi.mmdt.ott.provider.p387i.C2990b;
import mobi.mmdt.ott.provider.p387i.C2992c.C2991a;
import mobi.mmdt.ott.provider.p388j.C2996b;
import mobi.mmdt.ott.provider.p388j.C6032g;
import p000a.p001a.p002a.C0005c;

public final class C6764b extends C5891a {
    private int f19322a;

    public C6764b(int i) {
        super(C2683h.f8619a);
        this.f19322a = i;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetCategoryItemsResponse a = new C5857a(C2535a.m6888a().m6928d(), (long) this.f19322a).m13062a(MyApplication.m12952b());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (a.getImage() != null) {
            int i = this.f19322a;
            C6032g c6032g = new C6032g();
            Object obj = null;
            c6032g.m13488b((long) i);
            Object b = c6032g.m13486b(MyApplication.m12952b());
            if (b.moveToFirst()) {
                obj = C2996b.m7493a(b);
            }
            b.close();
            a.setImage(a.getImage());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        for (LandingPageItem landingPageItem : a.getItems()) {
            arrayList2.add(new C2991a().m7474a(landingPageItem.getTitle()).m7476b(landingPageItem.getImage()).m7478c(landingPageItem.getSubTitle()).m7479d(landingPageItem.getButtonText()).m7473a(landingPageItem.getDisplayOrder()).m7475b(this.f19322a).m7472a(landingPageItem.getId()).m7471a(C2989a.m7467a(landingPageItem.getAction())).m7480e(landingPageItem.getActionData()).m7477c(C2989a.m7467a(landingPageItem.getButtonActionType())).m7481f(landingPageItem.getButtonActionData()).f9378a);
        }
        if (arrayList2.size() > 0) {
            C2990b.m7469a(this.f19322a);
            C2726a.m7070a(arrayList, arrayList2);
        }
        C2480b.m6740d("landing page category job ok");
        C0005c.m0a().m9d(new C2724b());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5953a(th));
        return C1073q.f3504b;
    }
}
