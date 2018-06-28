package mobi.mmdt.ott.logic.p261a.p277c;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.base.BotDataModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data.C5806a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6682b extends C5891a {
    private String f19023a;

    public C6682b(String str) {
        super(C2683h.f8620b);
        this.f19023a = str;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        BotDataModel botDataModel = new C5806a(C2535a.m6888a().m6928d(), this.f19023a).m13011a(MyApplication.m12952b()).getBotDataModel();
        C2976c a = C2980g.m7433a(botDataModel.getBotId());
        if (a != null) {
            C2980g.m7426a(a.f9281a, botDataModel.getName(), botDataModel.getDescription(), botDataModel.getAvatarUrl(), botDataModel.getAvatarThumbnailUrl(), a.f9292l, botDataModel.getLink(), botDataModel.getStartText(), a.f9287g);
            return;
        }
        long a2 = C2778b.m7093a();
        try {
            C2980g.m7428a(botDataModel.getBotId(), botDataModel.getName(), botDataModel.getDescription(), botDataModel.getLink(), botDataModel.getAvatarUrl(), botDataModel.getAvatarThumbnailUrl(), a2, Long.valueOf(a2), botDataModel.getStartText(), C3004f.NONE);
        } catch (Throwable e) {
            C2480b.m6737b("problem in insert bot", e);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
