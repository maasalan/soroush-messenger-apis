package mobi.mmdt.ott.logic.p261a.aa;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a;
import mobi.mmdt.componentsutils.p232b.p235c.C2481c;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportType;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p371s.C2900c;
import mobi.mmdt.ott.provider.p392n.C6043f;

public final class C6644c extends C5891a {
    private C2481c f18919a;

    static /* synthetic */ class C25791 {
        static final /* synthetic */ int[] f8422a = new int[C2479a.m6730a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.m6730a();
            r0 = r0.length;
            r0 = new int[r0];
            f8422a = r0;
            r0 = 1;
            r1 = f8422a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8154a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8422a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8155b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8422a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8156c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.aa.c.1.<clinit>():void");
        }
    }

    public C6644c(C2481c c2481c) {
        super(C2683h.f8619a);
        this.f18919a = c2481c;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        try {
            String str;
            if (this.f18919a.f8160a != null) {
                str = this.f18919a.f8160a;
                int i = this.f18919a.f8162c;
                String str2 = this.f18919a.f8161b;
                ReportType reportType = null;
                switch (C25791.f8422a[i - 1]) {
                    case 1:
                        reportType = ReportType.bug;
                        break;
                    case 2:
                        reportType = ReportType.error;
                        break;
                    case 3:
                        reportType = ReportType.info;
                        break;
                    default:
                        break;
                }
                C2900c.m7279a(str, reportType, str2, C2478a.m6728a());
            }
            if (this.f18919a.f8160a.equals("REPORT_PARTY")) {
                str = this.f18919a.f8161b;
                int a = new C6043f().m13545a(str).m7360a(MyApplication.m12952b());
                StringBuilder stringBuilder = new StringBuilder("ReportEvents Deleted events is : ");
                stringBuilder.append(a);
                C2480b.m6742f(stringBuilder.toString());
            }
        } catch (Throwable e) {
            C2480b.m6738b(e);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
