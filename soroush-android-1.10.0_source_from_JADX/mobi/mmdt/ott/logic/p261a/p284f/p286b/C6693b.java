package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelCategory;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p395q.C3017a;
import mobi.mmdt.ott.provider.p395q.C3019b;
import mobi.mmdt.ott.provider.p395q.C3020c;
import mobi.mmdt.ott.provider.p395q.C3021f;
import mobi.mmdt.ott.provider.p395q.C6051e;
import mobi.mmdt.ott.provider.p395q.C6052g;

public final class C6693b extends C5891a {
    private final SuggestedChannelCategory[] f19032a;
    private int f19033b = 0;

    public C6693b(SuggestedChannelCategory[] suggestedChannelCategoryArr) {
        super(C2683h.f8620b);
        this.f19032a = suggestedChannelCategoryArr;
        if (suggestedChannelCategoryArr.length > 0) {
            this.f19033b = suggestedChannelCategoryArr[0].getParentCategoryId().intValue();
        }
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (this.f19032a.length > 0) {
            for (int i3 = 0; i3 < this.f19032a.length; i3++) {
                String party = this.f19032a[i3].getParty();
                C6052g c6052g = new C6052g();
                i = 1;
                c6052g.m13607a(party);
                C6051e b = c6052g.m13608b(MyApplication.m12952b());
                if (b.getCount() > 0) {
                    b.close();
                } else {
                    b.close();
                    i = 0;
                }
                if (i != 0) {
                    C3017a.m7528a(C3019b.m7543a(this.f19032a[i3]));
                } else {
                    arrayList.add(C3019b.m7543a(this.f19032a[i3]));
                }
            }
        }
        if (arrayList.size() > 0) {
            C3017a.m7531a(arrayList);
        }
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (C3019b c3019b : C3017a.m7532a(this.f19033b)) {
            if (!(c3019b.f9483j.equals(C3021f.SERVICE) || c3019b.f9474a.equals("-1"))) {
                hashMap.put(c3019b.f9474a, c3019b);
            }
        }
        SuggestedChannelCategory[] suggestedChannelCategoryArr = this.f19032a;
        int length = suggestedChannelCategoryArr.length;
        while (i2 < length) {
            SuggestedChannelCategory suggestedChannelCategory = suggestedChannelCategoryArr[i2];
            hashMap2.put(suggestedChannelCategory.getParty(), C3019b.m7543a(suggestedChannelCategory));
            i2++;
        }
        Map hashMap3 = new HashMap();
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        hashMap3.entrySet().removeAll(hashMap2.entrySet());
        Iterable arrayList2 = new ArrayList(hashMap3.keySet());
        StringBuilder stringBuilder = new StringBuilder("'");
        stringBuilder.append(TextUtils.join("','", arrayList2));
        stringBuilder.append("'");
        String stringBuilder2 = stringBuilder.toString();
        ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
        Uri uri = C3020c.f9490a;
        StringBuilder stringBuilder3 = new StringBuilder("party IN (");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(")");
        contentResolver.delete(uri, stringBuilder3.toString(), null);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
