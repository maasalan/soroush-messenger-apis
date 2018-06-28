package mobi.mmdt.ott.logic.p261a.p329x;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollOption;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.ThreadType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create.C5866a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p298k.C6752q;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2700j;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5942i;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4522p;
import p000a.p001a.p002a.C0005c;

public final class C6788a extends C5891a {
    private boolean f19379a = true;
    private String f19380b;
    private boolean f19381c;
    private PollType f19382d;
    private boolean f19383e;
    private int f19384f;
    private ArrayList<String> f19385g;
    private String f19386h;
    private boolean f19387i;

    public C6788a(String str, String str2, PollType pollType, ArrayList<String> arrayList) {
        super(C2683h.f8620b);
        this.f19380b = str2;
        this.f19381c = true;
        this.f19382d = pollType;
        this.f19383e = false;
        this.f19384f = 10;
        this.f19385g = arrayList;
        this.f19386h = str;
        this.f19387i = false;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int size = this.f19385g.size();
        if (this.f19387i) {
            size++;
        }
        PollOption[] pollOptionArr = new PollOption[size];
        int i = 0;
        while (i < this.f19385g.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            int i2 = i + 1;
            stringBuilder.append(i2);
            pollOptionArr[i] = new PollOption(stringBuilder.toString(), (String) this.f19385g.get(i), false);
            i = i2;
        }
        if (this.f19387i) {
            i = pollOptionArr.length - 1;
            stringBuilder = new StringBuilder();
            stringBuilder.append(pollOptionArr.length + 1);
            pollOptionArr[i] = new PollOption(stringBuilder.toString(), C4522p.m8236a(R.string.other), false);
        }
        String a = C2483a.m6744a(MyApplication.m12952b());
        String paymentId = new C5866a(C2535a.m6888a().m6928d(), ThreadType.CHANNELPAY, this.f19386h, a, this.f19385g).m13071a(MyApplication.m12952b()).getPaymentId();
        String str = a;
        String str2 = paymentId;
        C2808d.m7148b(new C6752q(this.f19386h, str, str2, PollUtils.PollToJson(paymentId, this.f19380b, this.f19381c, this.f19382d, this.f19383e, true, this.f19384f, pollOptionArr).toString(), new C2674a(null, null, null)));
        C0005c.m0a().m9d(new C2700j());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5942i(th));
        return C1073q.f3504b;
    }
}
