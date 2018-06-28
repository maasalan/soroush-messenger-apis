package mobi.mmdt.ott.logic.p261a.p276b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.p345c.C2788a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6033c;
import mobi.mmdt.ott.provider.p389k.C6035f;
import p000a.p001a.p002a.C0005c;

public final class C6679b extends C5891a {
    private ArrayList<C2622a> f19019a;

    static /* synthetic */ class C26231 {
        static final /* synthetic */ int[] f8524a = new int[C2621a.m7046a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a.m7046a();
            r0 = r0.length;
            r0 = new int[r0];
            f8524a = r0;
            r0 = 1;
            r1 = f8524a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a.f8519a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8524a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a.f8520b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.b.b.1.<clinit>():void");
        }
    }

    public C6679b(ArrayList<C2622a> arrayList) {
        super(C2683h.f8620b);
        this.f19019a = arrayList;
    }

    public C6679b(C2622a c2622a) {
        super(C2683h.f8620b);
        this.f19019a = new ArrayList();
        this.f19019a.add(c2622a);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f19019a.iterator();
        while (it.hasNext()) {
            C2622a c2622a = (C2622a) it.next();
            switch (C26231.f8524a[c2622a.f8523b - 1]) {
                case 1:
                    arrayList.add(c2622a.f8522a);
                    break;
                case 2:
                    arrayList2.add(c2622a.f8522a);
                    break;
                default:
                    break;
            }
            if (arrayList.size() > 0) {
                try {
                    C2788a.m7101a().f8811c.mo2147a(arrayList);
                    C2999a.m7514d((String[]) arrayList.toArray(new String[arrayList.size()]));
                } catch (Throwable e) {
                    C0005c.m0a().m9d(new C5908d(e));
                    C2480b.m6737b("error in block user", e);
                }
            }
            if (arrayList2.size() > 0) {
                C2788a.m7101a().f8811c.mo2158b(arrayList2);
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                C6033c c6033c = new C6033c();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C2621a.f8520b - 1);
                c6033c.m13507j(stringBuilder.toString());
                C6035f c6035f = new C6035f();
                c6035f.m13520a(strArr);
                c6033c.m13490a(MyApplication.m12952b(), c6035f);
            }
        }
        String a = C2483a.m6744a(MyApplication.m12952b());
        Map a2 = C2840b.m7181a();
        a2.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a2.put("MINOR_TYPE", "PRIVACY");
        C5996e.m13260a().f16147a.m7102a(C2535a.m6888a().m6928d(), " ", a, a2);
        C0005c.m0a().m9d(new C2624e());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5908d(th));
        return C1073q.f3504b;
    }
}
