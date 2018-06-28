package mobi.mmdt.ott.logic.p350g;

import java.security.GeneralSecurityException;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5780a;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5781b;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5783e;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5784f;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5787i;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5788j;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5789k;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5793o;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5796r;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5800v;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5801w;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5802x;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.aa;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ab;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ad;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ae;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ag;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ah;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.am;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ap;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.aq;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.as;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.au;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.av;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2812e;
import mobi.mmdt.ott.logic.p261a.ag.p272a.C2616b;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C2773a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.jivesoftware.smack.SmackException.ConnectionException;
import org.json.JSONException;
import p000a.p001a.p002a.C0005c;

public abstract class C2816a {
    public C2775a f8890a;

    public C2816a(Throwable th) {
        C2775a c2775a;
        StringBuilder stringBuilder;
        if (!(th instanceof GeneralSecurityException)) {
            if (th instanceof au) {
                c2775a = C2775a.WEB_SERVICE_ERROR;
            } else if (th instanceof C5801w) {
                c2775a = C2775a.INVALID_VOTE_DATA;
            } else if (th instanceof av) {
                c2775a = C2775a.YOU_ALREADY_VOTED;
            } else {
                if (th instanceof aa) {
                    c2775a = C2775a.NOT_AUTHORIZED;
                } else if (th instanceof ap) {
                    c2775a = C2775a.UNKNOWN_SECURITY_ERROR;
                } else if (th instanceof C5784f) {
                    c2775a = C2775a.IP_BLOCKED;
                } else if (th instanceof C5793o) {
                    c2775a = C2775a.INVALID_REQUEST_ID;
                } else {
                    if (!(th instanceof ConnectionException)) {
                        if (th instanceof aq) {
                            c2775a = C2775a.UNKNOWN_SERVER_ERROR;
                        } else {
                            C0005c a;
                            Object c2616b;
                            if (th instanceof ad) {
                                c2775a = C2775a.OLD_VERSION_ERROR;
                                a = C0005c.m0a();
                                c2616b = new C2616b();
                            } else if (th instanceof as) {
                                c2775a = C2775a.USER_NOT_HAVE_PERMISSION;
                            } else if (th instanceof C5783e) {
                                c2775a = C2775a.FILE_TOO_LARGE;
                            } else if (th instanceof C5789k) {
                                c2775a = C2775a.INVALID_FILE_EXTENSION;
                            } else if (!(th instanceof C5787i)) {
                                if (th instanceof ag) {
                                    c2775a = C2775a.POLL_RESULT_DISABLED;
                                } else if (th instanceof ae) {
                                    c2775a = C2775a.POLL_DISABLED;
                                } else if (!(th instanceof ab)) {
                                    if (th instanceof C5780a) {
                                        c2775a = C2775a.CHANNEL_ID_ALREADY_EXIST_EXCEPTION;
                                    } else if (th instanceof C5802x) {
                                        c2775a = C2775a.ITEM_NOT_FOUND;
                                    } else if (th instanceof C5788j) {
                                        c2775a = C2775a.INVALID_CHANNEL_ID;
                                    } else if (th instanceof am) {
                                        c2775a = C2775a.TOO_MANY_SMS_REQUEST;
                                    } else if (th instanceof C5781b) {
                                        c2775a = C2775a.DAILY_SEND_MESSAGE_COUNT_LIMIT;
                                    } else if (th instanceof C5796r) {
                                        c2775a = C2775a.INVALID_SOROUSH_ID_EXCEPTION;
                                    } else if (th instanceof ah) {
                                        c2775a = C2775a.SOROUSH_ID_ALREADY_EXIST_EXCEPTION;
                                    } else if (th instanceof JSONException) {
                                        c2775a = C2775a.JSON_EXCEPTION;
                                    } else if (th instanceof C2773a) {
                                        c2775a = C2775a.ACTIVATION_CODE_IS_WRONG;
                                    } else {
                                        if (th instanceof C5800v) {
                                            c2775a = C2775a.INVALID_USERNAME_EXCEPTION;
                                        } else if (th instanceof C2559b) {
                                            c2775a = C2775a.valueOf(((C2559b) th).f8367a.toString());
                                            if (!c2775a.equals(C2775a.INVALID_USERNAME_EXCEPTION)) {
                                                if (!c2775a.equals(C2775a.NOT_AUTHORIZED)) {
                                                    if (c2775a.equals(C2775a.OLD_VERSION_ERROR)) {
                                                        a = C0005c.m0a();
                                                        c2616b = new C2616b();
                                                    }
                                                }
                                            }
                                        } else {
                                            c2775a = C2775a.UNEXPECTED_ERROR;
                                            C2480b.m6734a("Un handled error", th);
                                        }
                                        C2812e.m7152a();
                                    }
                                }
                            }
                            a.m9d(c2616b);
                        }
                    }
                    c2775a = C2775a.CONNECTION_ERROR;
                }
                C2535a.m6888a().m6901M();
            }
            stringBuilder = new StringBuilder("*********  error : ");
            stringBuilder.append(c2775a);
            C2480b.m6732a(stringBuilder.toString());
            C2480b.m6737b("", th);
            this.f8890a = c2775a;
        }
        c2775a = null;
        stringBuilder = new StringBuilder("*********  error : ");
        stringBuilder.append(c2775a);
        C2480b.m6732a(stringBuilder.toString());
        C2480b.m6737b("", th);
        this.f8890a = c2775a;
    }
}
