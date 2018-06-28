package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.setprofile;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5876a extends C2566a {
    private SetProfileRequest f16040a;

    public C5876a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f16040a = new SetProfileRequest(str, str2, str3, str4, str5, str6);
    }

    public final SetProfileResponse m13081a(Context context) {
        return (SetProfileResponse) registeredSend(context, C2567b.m7018a().m7022a(context).setProfile(this.f16040a), this.f16040a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13081a(context);
    }
}
