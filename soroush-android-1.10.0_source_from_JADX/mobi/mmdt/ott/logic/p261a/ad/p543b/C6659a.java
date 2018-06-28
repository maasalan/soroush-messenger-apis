package mobi.mmdt.ott.logic.p261a.ad.p543b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ad.p268a.C2594a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import p000a.p001a.p002a.C0005c;

public final class C6659a extends C5891a {
    public C6659a() {
        super(C2683h.f8621c);
    }

    private static HashSet<Integer> m17151a(int i) {
        int i2 = 10;
        if (i <= 10) {
            i2 = i;
        }
        HashSet<Integer> hashSet = new HashSet();
        do {
            hashSet.add(Integer.valueOf(new Random().nextInt(i)));
        } while (hashSet.size() < i2);
        return hashSet;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        ArrayList arrayList = new ArrayList();
        String d = C2535a.m6888a().m6928d();
        List arrayList2 = new ArrayList();
        arrayList2.add(d);
        HashMap a = C2999a.m7498a(arrayList2);
        HashSet a2 = C6659a.m17151a(a.size());
        Iterator it = a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            it.remove();
            if (a2.contains(Integer.valueOf(i))) {
                arrayList.add((C3001e) entry.getValue());
            }
            i++;
        }
        C0005c.m0a().m9d(new C2594a(arrayList));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
