package mobi.mmdt.ott.logic.p341b;

import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public final class C2776a {
    private static C2777c f8788a;

    public static void m7091a(String str) {
        if (f8788a == null) {
            if (C5979b.f16127a == null) {
                C5979b.f16127a = new C5979b();
            }
            f8788a = C5979b.f16127a;
        }
        f8788a.mo2188a(str);
        StringBuilder stringBuilder = new StringBuilder("Google Analytics Send Screen Name : ");
        stringBuilder.append(str);
        C2480b.m6736b(stringBuilder.toString());
    }
}
