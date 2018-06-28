package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2573f;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.VoteData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.set_vote.C5840a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2652u;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5925t;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6711v extends C5891a {
    private String f19096a;
    private String f19097b;
    private String f19098c;
    private String[] f19099d;

    public C6711v(String str, String str2, String[] strArr, String str3) {
        super(C2683h.f8620b);
        this.f19096a = str2;
        this.f19097b = str;
        this.f19099d = strArr;
        this.f19098c = str3;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str = this.f19096a;
        String[] strArr = this.f19099d;
        String str2 = this.f19098c;
        StringBuilder stringBuilder = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(",");
            stringBuilder.append(strArr[i]);
        }
        new C5840a(C2535a.m6888a().m6928d(), str, new VoteData(stringBuilder.toString(), str2)).m13045a(MyApplication.m12952b());
        JSONObject VoteToJson = PollUtils.VoteToJson(new C2573f(this.f19099d, this.f19098c));
        String str3 = this.f19097b;
        str = VoteToJson.toString();
        C6019d c6019d = new C6019d();
        c6019d.m13350c(str);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str3);
        c6019d.m13332a(c6021g);
        C0005c.m0a().m9d(new C2652u());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5925t(th));
        return C1073q.f3504b;
    }
}
