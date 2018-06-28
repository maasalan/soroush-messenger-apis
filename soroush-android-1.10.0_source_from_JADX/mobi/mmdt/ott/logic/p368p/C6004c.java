package mobi.mmdt.ott.logic.p368p;

import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.core.C2800c;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.core.p346a.C2793a;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6688b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAddress.TransportType;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.customized.CustomizedCallManager;
import org.linphone.customized.CustomizedCallManager.AudioAction;
import org.linphone.customized.ICustomizedListener;

public final class C6004c implements ICustomizedListener {
    private static C6004c f16172b;
    public ICustomizedListener f16173a;

    public C6004c() {
        if (LinphoneCoreFactory.instance() != null) {
            LinphoneCoreFactory.instance().enableLogCollection(C2480b.f8158a);
        }
        if (this.f16173a == null) {
            this.f16173a = new C6005d();
        }
    }

    public static C6004c m13279a() {
        if (f16172b == null) {
            f16172b = new C6004c();
        }
        return f16172b;
    }

    public static String m13280d() {
        LinphoneCall currentCall = CustomizedCallManager.getInstance().getCurrentCall(MyApplication.m12952b()) != null ? CustomizedCallManager.getInstance().getCurrentCall(MyApplication.m12952b()) : null;
        if (currentCall != null) {
            LinphoneAddress remoteAddress = currentCall.getRemoteAddress();
            if (remoteAddress.getUserName() != null) {
                return remoteAddress.getUserName();
            }
            if (remoteAddress.getDisplayName() != null) {
                return remoteAddress.getDisplayName();
            }
        }
        return null;
    }

    public static boolean m13281e() {
        return CustomizedCallManager.getInstance().isInCall(MyApplication.m12952b());
    }

    public final void m13282a(String str) {
        int i = 0;
        while (((long) i) < 16) {
            try {
                if (MyApplication.m12950a().f15889D != 0) {
                    Thread.sleep(500);
                }
                i++;
            } catch (Throwable e) {
                C2480b.m6737b("Cannot sleep thread", e);
            }
        }
        if (MyApplication.m12950a().f15899N) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            C2808d.m7148b(new C6688b(str));
            return;
        }
        CustomizedCallManager.getInstance(this.f16173a).call(MyApplication.m12952b(), str);
    }

    public final void m13283b() {
        String R = C2535a.m6888a().m6906R();
        if (R != null) {
            ArrayList arrayList = new C2793a(R).f8829a;
            if (arrayList.size() != 0) {
                C2880a c2880a = (C2880a) arrayList.get(0);
                CustomizedCallManager.getInstance(this.f16173a).register(MyApplication.m12952b(), c2880a.f8986b, c2880a.f8987c, c2880a.f8986b, c2880a.f8985a, c2880a.f8988d, TransportType.LinphoneTransportUdp);
                return;
            }
        }
        C2535a.m6888a().m6969s(true);
        C2800c.m7135a().m7139b(C2799a.f8851c);
    }

    public final void m13284c() {
        CustomizedCallManager.getInstance(this.f16173a).unRegister(MyApplication.m12952b());
    }

    public final String onAudioStateChanged(AudioAction audioAction, boolean z) {
        return null;
    }

    public final String onCallStateChanged(LinphoneCall linphoneCall, State state, String str) {
        State state2 = State.IncomingReceived;
        return null;
    }

    public final String onRegistrationStateChanged(RegistrationState registrationState, String str) {
        return null;
    }
}
