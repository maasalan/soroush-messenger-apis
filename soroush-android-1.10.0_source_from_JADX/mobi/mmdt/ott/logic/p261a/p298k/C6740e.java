package mobi.mmdt.ott.logic.p261a.p298k;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollOption;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll.C5838a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2700j;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5942i;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4522p;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6740e extends C5891a {
    private boolean f19220a = true;
    private String f19221b;
    private boolean f19222c;
    private PollType f19223d;
    private boolean f19224e;
    private int f19225f;
    private ArrayList<String> f19226g;
    private String f19227h;
    private boolean f19228i;

    public C6740e(String str, String str2, PollType pollType, ArrayList<String> arrayList, boolean z) {
        super(C2683h.f8620b);
        this.f19221b = str2;
        this.f19222c = true;
        this.f19223d = pollType;
        this.f19224e = false;
        this.f19225f = 10;
        this.f19226g = arrayList;
        this.f19227h = str;
        this.f19228i = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int size = this.f19226g.size();
        if (this.f19228i) {
            size++;
        }
        PollOption[] pollOptionArr = new PollOption[size];
        int i = 0;
        while (i < this.f19226g.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            int i2 = i + 1;
            stringBuilder.append(i2);
            pollOptionArr[i] = new PollOption(stringBuilder.toString(), (String) this.f19226g.get(i), false);
            i = i2;
        }
        if (this.f19228i) {
            i = pollOptionArr.length - 1;
            stringBuilder = new StringBuilder();
            stringBuilder.append(pollOptionArr.length + 1);
            pollOptionArr[i] = new PollOption(stringBuilder.toString(), C4522p.m8236a(R.string.other), false);
        }
        String pollId = new C5838a(C2535a.m6888a().m6928d(), this.f19220a, new PollData(this.f19221b, this.f19222c, this.f19223d, this.f19224e, this.f19225f, pollOptionArr)).m13043a(MyApplication.m12952b()).getPollId();
        JSONObject PollToJson = PollUtils.PollToJson(pollId, this.f19221b, this.f19222c, this.f19223d, this.f19224e, false, this.f19225f, pollOptionArr);
        C2808d.m7148b(new C6752q(this.f19227h, C2483a.m6744a(MyApplication.m12952b()), pollId, PollToJson.toString(), new C2674a(null, null, null)));
        C0005c.m0a().m9d(new C2700j());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5942i(th));
        return C1073q.f3504b;
    }
}
