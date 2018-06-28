package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.google.p164b.C5593n;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive.C5827a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2644e;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5917d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2661a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.p246d.p247a.C2531b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C6020e;
import mobi.mmdt.ott.provider.p384f.C6021g;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public final class C6699h extends C5891a {
    private String f19064a;
    private String f19065b;
    private int f19066c;
    private int f19067d;
    private boolean f19068e;
    private boolean f19069f = false;

    public C6699h(String str) {
        super(C2683h.f8620b);
        this.f19064a = str;
        this.f19066c = 0;
        this.f19067d = 20;
        this.f19065b = null;
        this.f19068e = false;
    }

    public C6699h(String str, String str2) {
        super(C2683h.f8620b);
        this.f19064a = str;
        this.f19066c = 0;
        this.f19067d = 20;
        this.f19065b = str2;
        this.f19068e = true;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String a;
        C5593n[] messages = new C5827a(C2535a.m6888a().m6928d(), this.f19064a, this.f19066c, this.f19067d, this.f19065b).m13032a(MyApplication.m12952b()).getMessages();
        ArrayList arrayList = new ArrayList();
        String str = this.f19064a;
        C6021g c6021g = new C6021g();
        boolean z = true;
        C6021g c = ((C6021g) c6021g.m13382a(C2973m.CHANNEL).m7368c()).m13390c(str);
        c.m7363a("conversations_receive_time", true);
        c.m7362a(1);
        C6020e i = c6021g.m13393i();
        if (i.moveToFirst()) {
            String b = i.m13362b();
            C2972l c2 = i.m13363c();
            a = i.m7352a("conversations_event");
            long d = i.m13364d();
            long e = i.m13365e();
            C2970j i2 = i.m13369i();
            C2971k j = i.m13370j();
            String k = i.m13371k();
            C2973m m = i.m13373m();
            String l = i.m13372l();
            Long c3 = i.m7354c("conversations_file_id");
            String a2 = i.m7352a("conversations_sticker_id");
            String a3 = i.m7352a("conversations_reply_message_id");
            Integer b2 = i.m7353b("conversations_is_need_notify");
            if (b2 == null) {
                throw new NullPointerException("The value of 'IS_NEED_NOTIFY' in the database was null, which is not allowed according to the model definition");
            }
            C2531b c2531b = new C2531b(b, c2, a, d, e, i2, j, k, m, l, c3, a2, a3, b2.intValue() != 0, i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_message_id"));
        } else {
            C2531b c2531b2 = null;
        }
        i.close();
        if (c2531b2 != null) {
            r1.f19065b = c2531b2.f8227a;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = messages.length;
        int i3 = 0;
        while (i3 < length) {
            int i4;
            C5593n c5593n = messages[i3];
            StringBuilder stringBuilder = new StringBuilder("GetChannelArchiveJob  Message: ");
            stringBuilder.append(c5593n.toString());
            C2480b.m6742f(stringBuilder.toString());
            JSONObject jSONObject = new JSONObject(c5593n.toString());
            a = jSONObject.getString("CHANNEL_ID");
            String string = jSONObject.getString("USER_ID");
            String string2 = jSONObject.getString("MESSAGE_ID");
            String string3 = jSONObject.has("FORWARD_MESSAGE_ID") ? jSONObject.getString("FORWARD_MESSAGE_ID") : null;
            if (string3 == null || string3.isEmpty()) {
                arrayList.add(string2);
            } else {
                arrayList.add(string3);
            }
            if (r1.f19069f) {
                i4 = length;
            } else {
                r1.f19069f = z;
                i4 = length;
                C0005c.m0a().m9d(new C2644e(r1.f19064a, r1.f19068e, messages.length > 0 ? z : false, false));
            }
            try {
                try {
                    arrayList2.add(C2668c.m7060a(string, a, jSONObject.getString("MESSAGE_BODY"), string2, C2656r.m7054a(jSONObject), C2971k.READ, false, C2970j.IN));
                } catch (Throwable e2) {
                    C2480b.m6737b("Error in parsing channel message", e2);
                }
            } catch (Throwable e22) {
                C2480b.m6737b("GetChannelArchive json parse exception", e22);
            }
            i3++;
            length = i4;
            z = true;
        }
        ArrayList a4 = arrayList.size() > 0 ? C2966b.m7398a((String[]) arrayList.toArray(new String[arrayList.size()])) : arrayList;
        z = true;
        C2661a.m7057a(arrayList2, Boolean.valueOf(true));
        for (C5593n c5593n2 : messages) {
            JSONObject jSONObject2 = new JSONObject(c5593n2.toString());
            String string4 = jSONObject2.getString("MESSAGE_ID");
            string3 = jSONObject2.getString("MESSAGE_BODY");
            if (a4.contains(string4)) {
                C2968f a5 = C2966b.m7400a(string4);
                if (!(a5 == null || a5.f9208d.equals(string3))) {
                    switch (a5.f9207c) {
                        case TEXT:
                        case IMAGE:
                        case VIDEO:
                        case FILE:
                        case GIF:
                            C2966b.m7395a(string4, string3, C2778b.m7093a());
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if (!r1.f19069f) {
            C0005c a6 = C0005c.m0a();
            String str2 = r1.f19064a;
            boolean z2 = r1.f19068e;
            if (messages.length <= 0) {
                z = false;
            }
            a6.m9d(new C2644e(str2, z2, z, false));
        }
        if (arrayList.size() > 0) {
            C2808d.m7148b(new C6712w(arrayList));
            C2808d.m7148b(new C6709t(arrayList));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5917d(th, this.f19064a));
        return C1073q.f3504b;
    }
}
