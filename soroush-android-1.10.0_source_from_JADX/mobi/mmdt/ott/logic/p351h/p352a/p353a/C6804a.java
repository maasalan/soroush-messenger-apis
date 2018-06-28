package mobi.mmdt.ott.logic.p351h.p352a.p353a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C6020e;
import mobi.mmdt.ott.provider.p384f.C6021g;

public final class C6804a extends C5891a {
    public C6804a() {
        super(C2683h.f8621c);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        long a = C2778b.m7093a() - 2592000000L;
        if (C2535a.m6888a().aa() > C2778b.m7093a()) {
            C2535a.m6888a().m6930d(C2778b.m7093a());
        }
        if (C2535a.m6888a().aa() < a) {
            StringBuilder stringBuilder = new StringBuilder("SELECT MAX(conversations_send_time) , conversations_message_id FROM conversations WHERE conversations_event_state <> '");
            stringBuilder.append(C2971k.DELETED.ordinal());
            stringBuilder.append("' AND conversations_event_type <> '");
            stringBuilder.append(C2972l.HEAD_MESSAGE.ordinal());
            stringBuilder.append("' AND ( conversations_group_type = '");
            stringBuilder.append(C2973m.CHANNEL.ordinal());
            stringBuilder.append("' OR conversations_group_type = '");
            stringBuilder.append(C2973m.GROUP.ordinal());
            stringBuilder.append("' ) GROUP BY conversations_party");
            C6020e b = new C6021g().m13384b(stringBuilder.toString());
            String[] strArr = new String[b.getCount()];
            if (b.moveToFirst()) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    strArr[i] = b.getString(1);
                    if (!b.moveToNext()) {
                        break;
                    }
                    i = i2;
                }
            }
            b.close();
            if (strArr.length > 0) {
                C6021g c6021g = new C6021g();
                ((C6021g) ((C6021g) ((C6021g) ((C6021g) ((C6021g) ((C6021g) ((C6021g) c6021g.m7361a()).m13382a(C2973m.CHANNEL).m7369d()).m13382a(C2973m.GROUP).m7366b()).m7368c()).m13381a(C2972l.HEAD_MESSAGE).m7368c()).m13388b(C2971k.NOT_READ).m7368c()).m13387b(strArr).m7368c()).m13375a(a);
                c6021g.m7360a(MyApplication.m12952b());
            }
            C2535a.m6888a().m6930d(C2778b.m7093a());
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
