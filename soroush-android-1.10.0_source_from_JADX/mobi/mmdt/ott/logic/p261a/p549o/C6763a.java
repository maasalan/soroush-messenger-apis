package mobi.mmdt.ott.logic.p261a.p549o;

import android.database.Cursor;
import com.p072b.p073a.p074a.C1073q;
import java.util.HashMap;
import java.util.Map.Entry;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p391m.C3006a.C30051;
import mobi.mmdt.ott.provider.p391m.C3007b;
import mobi.mmdt.ott.provider.p391m.C6038c;
import mobi.mmdt.ott.provider.p391m.C6040e;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;

public final class C6763a extends C5891a {
    private HashMap<Emojicon, Integer> f19321a;

    public C6763a(HashMap<Emojicon, Integer> hashMap) {
        super(C2683h.f8620b);
        this.f19321a = hashMap;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        for (Entry entry : this.f19321a.entrySet()) {
            StringBuilder stringBuilder;
            Emojicon emojicon = (Emojicon) entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            String str = emojicon.f11581f;
            switch (C30051.f9447a[emojicon.f11576a - 1]) {
                case 1:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(emojicon.f11578c);
                    break;
                case 2:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(emojicon.f11579d);
                    break;
                case 3:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(emojicon.f11577b);
                    break;
                default:
                    break;
            }
            str = stringBuilder.toString();
            String[] strArr = new String[1];
            int i = 0;
            strArr[0] = str;
            Cursor query = MyApplication.m12952b().getContentResolver().query(C3007b.f9448a, null, "recentemoji_value =? ", strArr, null);
            if (query != null) {
                i = query.moveToFirst();
            }
            if (!(query == null || query.isClosed())) {
                query.close();
            }
            if (i != 0) {
                StringBuilder stringBuilder2 = new StringBuilder("UPDATE recentemoji SET recentemoji_usage_count = recentemoji_usage_count +");
                stringBuilder2.append(intValue);
                stringBuilder2.append(" WHERE recentemoji_value = '");
                stringBuilder2.append(str);
                stringBuilder2.append("' ;");
                new C6040e().m13539a(MyApplication.m12952b(), stringBuilder2.toString());
            } else {
                int i2 = emojicon.f11576a;
                Integer valueOf = Integer.valueOf(intValue);
                if (!(str == null || i2 == 0)) {
                    if (valueOf != null) {
                        C6038c c6038c = new C6038c();
                        c6038c.m13536a(str).m13537b(i2).m13535a(valueOf.intValue());
                        c6038c.m7349a(MyApplication.m12952b());
                    }
                }
                throw new NullPointerException();
            }
        }
        new C6040e().m13539a(MyApplication.m12952b(), "DELETE FROM recentemoji WHERE _id NOT IN (SELECT _id FROM recentemoji ORDER BY recentemoji_usage_count DESC LIMIT 40) ;");
        new C6040e().m13539a(MyApplication.m12952b(), "UPDATE recentemoji SET recentemoji_usage_count =  (SELECT COUNT(*) FROM recentemoji temp WHERE recentemoji.recentemoji_usage_count > temp.recentemoji_usage_count);");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
