package mobi.mmdt.ott.logic.p261a.p294h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ab;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2561a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.C5872a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.SalamResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.base.Servers;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.base.Servers.Protocol;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.core.C2800c;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.core.p346a.C2793a;
import mobi.mmdt.ott.logic.core.p346a.C2794b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p348e.C2810a.C2809a;
import mobi.mmdt.ott.logic.p348e.C5981b;
import mobi.mmdt.ott.logic.p348e.C5981b.C2811a;
import mobi.mmdt.ott.logic.p368p.C2880a;
import mobi.mmdt.ott.logic.p368p.C2880a.C2879a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C6730a extends C5891a {
    public C6730a() {
        super(C2683h.f8621c);
    }

    private static C5981b m17191a(Servers servers, int i, long j, String str) {
        int i2 = C2811a.f8884b;
        switch (servers.getGroupJoinProtocol()) {
            case MUCSub:
                i2 = C2811a.f8883a;
                break;
            case MUC:
                i2 = C2811a.f8884b;
                break;
        }
        return new C5981b(servers.getUserName(), servers.getPassword(), servers.getServerAddress(), servers.getHostName(), servers.getGroupHostName(), servers.getPortNo(), i, j, str, i2);
    }

    private static C2880a m17192a(Servers servers, int i) {
        return new C2880a(servers.getServerAddress(), servers.getPortNo(), servers.getUserName(), servers.getPassword(), i, C2492j.m6840a(MyApplication.m12952b()));
    }

    private static boolean m17193a(Servers servers) {
        if (!(servers.getUserName() == null || servers.getUserName().equals("null") || servers.getPassword() == null)) {
            if (!servers.getPassword().equals("null")) {
                return false;
            }
        }
        return true;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        if (C2535a.m6888a().m6928d() != null && C2535a.m6888a().m6952j() && !C2535a.m6888a().m6902N()) {
            if (C2535a.m6888a().m6909V() >= C2778b.m7093a() - 60000) {
                if (C2535a.m6888a().m6909V() <= C2778b.m7093a() + 60000) {
                    return;
                }
            }
            C2535a.m6888a().f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_SALAM_CALL_TIME", C2778b.m7093a()).apply();
            if (!C2474a.m6718b(MyApplication.m12952b())) {
                return;
            }
            if (!C2474a.m6718b(MyApplication.m12952b())) {
                throw new ab();
            } else if (C2535a.m6888a().m6928d() == null) {
                throw new NullPointerException();
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) MyApplication.m12952b().getSystemService("connectivity")).getActiveNetworkInfo();
                String typeName = activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : null;
                C2560a.m7006a(MyApplication.m12952b());
                SalamResponse a = new C5872a(C2535a.m6888a().m6928d(), C2560a.m7009c(), typeName).m13077a(MyApplication.m12952b());
                C2535a.m6888a().m6969s(false);
                long parseLong = Long.parseLong(a.getSinceLastConnection());
                String a2 = C2492j.m6840a(MyApplication.m12952b());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Servers servers : a.getServers()) {
                    String iv;
                    boolean z;
                    int i;
                    if (servers.getEncryptionMode().equalsIgnoreCase("encrypted")) {
                        iv = servers.getIv();
                        String authValue = a.getAuthValue();
                        C2560a.m7006a(getApplicationContext());
                        servers.setPassword(C2561a.m7011a(C2560a.m7009c(), servers.getPassword(), iv, authValue));
                    }
                    iv = servers.getApplication();
                    int hashCode = iv.hashCode();
                    if (hashCode != 3052376) {
                        if (hashCode == 3625376) {
                            if (iv.equals(Servers.VOIP)) {
                                z = true;
                                switch (z) {
                                    case false:
                                        for (String str : servers.getProtocol()) {
                                            if (C6730a.m17193a(servers)) {
                                                C2480b.m6737b("server config have null config!", new NullPointerException());
                                            } else {
                                                i = str.equals(Protocol.TCP.getProtocolValue()) ? C2809a.f8873a : str.equals(Protocol.TLS_V2.getProtocolValue()) ? C2809a.f8875c : str.equals(Protocol.TLS.getProtocolValue()) ? C2809a.f8876d : C2809a.f8874b;
                                                arrayList.add(C6730a.m17191a(servers, i, parseLong, a2));
                                            }
                                        }
                                        break;
                                    case true:
                                        for (String str2 : servers.getProtocol()) {
                                            if (C6730a.m17193a(servers)) {
                                                C2480b.m6737b("server config have null config!", new NullPointerException());
                                            } else {
                                                i = str2.equals(Servers.TCP) ? C2879a.f8981a : str2.equals(Servers.TLS) ? C2879a.f8983c : C2879a.f8982b;
                                                arrayList2.add(C6730a.m17192a(servers, i));
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                    } else if (iv.equals(Servers.CHAT)) {
                        z = false;
                        switch (z) {
                            case false:
                                for (hashCode = 0; hashCode < r12; hashCode++) {
                                    if (C6730a.m17193a(servers)) {
                                        if (str2.equals(Protocol.TCP.getProtocolValue())) {
                                            if (str2.equals(Protocol.TLS_V2.getProtocolValue())) {
                                                if (str2.equals(Protocol.TLS.getProtocolValue())) {
                                                }
                                            }
                                        }
                                        arrayList.add(C6730a.m17191a(servers, i, parseLong, a2));
                                    } else {
                                        C2480b.m6737b("server config have null config!", new NullPointerException());
                                    }
                                }
                                break;
                            case true:
                                for (hashCode = 0; hashCode < r12; hashCode++) {
                                    if (C6730a.m17193a(servers)) {
                                        if (str2.equals(Servers.TCP)) {
                                            if (str2.equals(Servers.TLS)) {
                                            }
                                        }
                                        arrayList2.add(C6730a.m17192a(servers, i));
                                    } else {
                                        C2480b.m6737b("server config have null config!", new NullPointerException());
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    z = true;
                    switch (z) {
                        case false:
                            for (hashCode = 0; hashCode < r12; hashCode++) {
                                if (C6730a.m17193a(servers)) {
                                    C2480b.m6737b("server config have null config!", new NullPointerException());
                                } else {
                                    if (str2.equals(Protocol.TCP.getProtocolValue())) {
                                    }
                                    arrayList.add(C6730a.m17191a(servers, i, parseLong, a2));
                                }
                            }
                            break;
                        case true:
                            for (hashCode = 0; hashCode < r12; hashCode++) {
                                if (C6730a.m17193a(servers)) {
                                    C2480b.m6737b("server config have null config!", new NullPointerException());
                                } else {
                                    if (str2.equals(Servers.TCP)) {
                                    }
                                    arrayList2.add(C6730a.m17192a(servers, i));
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                C2793a c2793a = new C2793a(arrayList2);
                C2535a a3 = C2535a.m6888a();
                typeName = c2793a.f8830b.toString();
                C2555a.m6994a(a3.m6928d());
                C2555a.m6995a(typeName, a3.m6928d().getBytes());
                a3.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_CALL_CONFIG", C2555a.f8313b).apply();
                C2794b c2794b = new C2794b(arrayList);
                a3 = C2535a.m6888a();
                typeName = c2794b.f8837b.toString();
                C2555a.m6994a(a3.m6928d());
                C2555a.m6995a(typeName, a3.m6928d().getBytes());
                a3.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_CHAT_CONFIG2", C2555a.f8313b).apply();
                C2800c.m7135a().m7139b(C2799a.f8850b);
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
