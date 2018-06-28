package mobi.mmdt.ott.logic.p261a.p332z.p333a.p335b;

import android.content.Intent;
import com.p072b.p073a.p074a.C1073q;
import java.io.IOException;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.deactivation.C5817a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PrivateGroupInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.GetMemberJoinGroupListResponse;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p332z.p333a.p334a.C2767a;
import mobi.mmdt.ott.logic.p261a.p332z.p333a.p334a.C5971b;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p360l.p361a.C2840b;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.logic.p371s.C2898a;
import mobi.mmdt.ott.logic.sync.C2905d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.C2960d;
import mobi.mmdt.ott.provider.C2963e;
import mobi.mmdt.ott.provider.p389k.C2999a;
import p000a.p001a.p002a.C0005c;

public final class C6793a extends C5891a {
    private C2535a f19406a = C2535a.m6888a();

    class C27681 implements Runnable {
        final /* synthetic */ C6793a f8733a;

        C27681(C6793a c6793a) {
            this.f8733a = c6793a;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0009 }
            r0 = 0;	 Catch:{ InterruptedException -> 0x0009 }
            java.lang.System.exit(r0);	 Catch:{ InterruptedException -> 0x0009 }
        L_0x0009:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.z.a.b.a.1.run():void");
        }
    }

    public C6793a() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (C2474a.m6718b(MyApplication.m12952b())) {
            String d = C2535a.m6888a().m6928d();
            GetMemberJoinGroupListResponse a = C2898a.m7274a();
            if (a.getPrivateGroups() != null) {
                for (PrivateGroupInfo privateGroupInfo : a.getPrivateGroups()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(C2999a.m7500a(d).f9416b);
                    stringBuilder.append(" left group");
                    C2840b.m7183a(privateGroupInfo.getGroupJID(), stringBuilder.toString(), d, C2483a.m6744a(MyApplication.m12952b()));
                    try {
                        C5996e.m13260a().f16147a.m7104a(privateGroupInfo.getGroupJID(), d);
                    } catch (Throwable e) {
                        C2480b.m6737b("cannot leave group on deactive user", e);
                    }
                }
            }
            new C5817a(C2535a.m6888a().m6928d()).m13022a(MyApplication.m12952b());
            this.f19406a.m6923b(true);
            StartUpService.m7130e();
            C2873a.m7225a();
            MyApplication.m12952b().stopService(new Intent(MyApplication.m12952b(), UpdateNotificationService.class));
            C6004c.m13279a().m13284c();
            C2963e.m7389a(C2960d.m7386a(MyApplication.m12952b()).getWritableDatabase());
            C2905d.m7283b();
            this.f19406a.m6892C();
            C0005c.m0a().m9d(new C2767a());
            new Thread(new C27681(this)).start();
            return;
        }
        throw new IOException();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5971b(th));
        return C1073q.f3504b;
    }
}
