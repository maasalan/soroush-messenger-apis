package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;

public class IvrProcess extends C2566a {
    private IvrRequest ivrRequest;

    public IvrProcess(String str) {
        this.ivrRequest = new IvrRequest(C2547a.m6986a(), str);
    }

    public IvrResponse sendRequest(Context context) {
        return (IvrResponse) send(C2567b.m7018a().m7022a(context).ivrRequest(this.ivrRequest));
    }
}
