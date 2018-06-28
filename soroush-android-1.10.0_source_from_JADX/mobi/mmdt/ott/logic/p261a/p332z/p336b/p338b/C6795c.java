package mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2565c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register.C5870a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2772g;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5975h;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import p000a.p001a.p002a.C0005c;

public final class C6795c extends C5891a {
    private String f19407a;
    private String f19408b;

    public C6795c(String str, String str2) {
        super(C2683h.f8620b);
        this.f19407a = str;
        this.f19408b = C2535a.m6889c(str2);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2565c c2565c;
        C2535a a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f19407a);
        int i = 1;
        stringBuilder.append(this.f19408b.substring(1));
        String stringBuilder2 = stringBuilder.toString();
        String name = C2565c.EN.name();
        String b = C2535a.m6888a().m6919b();
        int hashCode = b.hashCode();
        if (hashCode != 3121) {
            if (hashCode != 3259) {
                if (hashCode == 96599618) {
                    if (b.equals("en-us")) {
                        i = 0;
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                c2565c = C2565c.FA;
                                break;
                            case 2:
                                c2565c = C2565c.AR;
                                break;
                            default:
                                break;
                        }
                        name = c2565c.name();
                        name = new C5870a(MyApplication.m12952b(), stringBuilder2, name).m13075a(MyApplication.m12952b()).getActivationData();
                        a = C2535a.m6888a();
                        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_COUNTRY_CODE", this.f19407a).apply();
                        a = C2535a.m6888a();
                        a.f8278a.edit().putString("Nmobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PHONE_NUMBER", this.f19408b).apply();
                        C2535a.m6888a().m6922b(stringBuilder2);
                        C0005c.m0a().m9d(new C2772g(name));
                    }
                }
            } else if (b.equals("fa")) {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        c2565c = C2565c.FA;
                        break;
                    case 2:
                        c2565c = C2565c.AR;
                        break;
                    default:
                        break;
                }
                name = c2565c.name();
                name = new C5870a(MyApplication.m12952b(), stringBuilder2, name).m13075a(MyApplication.m12952b()).getActivationData();
                a = C2535a.m6888a();
                a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_COUNTRY_CODE", this.f19407a).apply();
                a = C2535a.m6888a();
                a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PHONE_NUMBER", this.f19408b).apply();
                C2535a.m6888a().m6922b(stringBuilder2);
                C0005c.m0a().m9d(new C2772g(name));
            }
        } else if (b.equals("ar")) {
            i = 2;
            switch (i) {
                case 0:
                    break;
                case 1:
                    c2565c = C2565c.FA;
                    break;
                case 2:
                    c2565c = C2565c.AR;
                    break;
                default:
                    break;
            }
            name = c2565c.name();
            name = new C5870a(MyApplication.m12952b(), stringBuilder2, name).m13075a(MyApplication.m12952b()).getActivationData();
            a = C2535a.m6888a();
            a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_COUNTRY_CODE", this.f19407a).apply();
            a = C2535a.m6888a();
            a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PHONE_NUMBER", this.f19408b).apply();
            C2535a.m6888a().m6922b(stringBuilder2);
            C0005c.m0a().m9d(new C2772g(name));
        }
        i = -1;
        switch (i) {
            case 0:
                break;
            case 1:
                c2565c = C2565c.FA;
                break;
            case 2:
                c2565c = C2565c.AR;
                break;
            default:
                break;
        }
        name = c2565c.name();
        name = new C5870a(MyApplication.m12952b(), stringBuilder2, name).m13075a(MyApplication.m12952b()).getActivationData();
        a = C2535a.m6888a();
        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_COUNTRY_CODE", this.f19407a).apply();
        a = C2535a.m6888a();
        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PHONE_NUMBER", this.f19408b).apply();
        C2535a.m6888a().m6922b(stringBuilder2);
        C0005c.m0a().m9d(new C2772g(name));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5975h(th));
        return C1073q.f3504b;
    }
}
