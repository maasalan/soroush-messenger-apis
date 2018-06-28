package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5813a extends C2566a {
    private CheckVersionRequest f15976a;

    public C5813a(String str) {
        this.f15976a = new CheckVersionRequest(str);
    }

    public final CheckVersionResponse m13018a(Context context) {
        return (CheckVersionResponse) send(C2567b.m7018a().m7022a(context).checkVersion(this.f15976a));
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13018a(context);
    }
}
