package mobi.mmdt.ott.logic.p261a.p301l.p548b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2719d;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C6020e;
import mobi.mmdt.ott.provider.p384f.C6021g;
import p000a.p001a.p002a.C0005c;

public final class C6757d extends C5891a {
    private String f19304a;
    private String f19305b;

    public C6757d(String str, String str2) {
        super(C2683h.f8622d);
        this.f19304a = str;
        this.f19305b = str2;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String str = this.f19304a;
        String str2 = this.f19305b;
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations_message_id FROM conversations WHERE conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append("' AND conversations_event_type <> '");
        stringBuilder.append(C2972l.HEAD_MESSAGE.ordinal());
        stringBuilder.append("' AND conversations_event_type <> '");
        stringBuilder.append(C2972l.CALL.ordinal());
        stringBuilder.append("' AND conversations_event_type <> '");
        stringBuilder.append(C2972l.MISSED_CALL.ordinal());
        stringBuilder.append("' AND conversations_event LIKE '%");
        stringBuilder.append(str2);
        stringBuilder.append("%' ORDER BY conversations_send_time DESC");
        C6020e b = new C6021g().m13384b(stringBuilder.toString());
        ArrayList arrayList = new ArrayList();
        if (b.moveToFirst()) {
            do {
                arrayList.add(b.getString(0));
            } while (b.moveToNext());
        }
        b.close();
        C0005c.m0a().m9d(new C2719d(arrayList));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
