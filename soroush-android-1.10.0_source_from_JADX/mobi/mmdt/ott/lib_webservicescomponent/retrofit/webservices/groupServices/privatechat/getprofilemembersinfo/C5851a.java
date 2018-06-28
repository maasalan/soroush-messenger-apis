package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5851a extends C2566a {
    private GetProfileMembersInfoInPrivateChatRequest f16013a;

    public C5851a(String str, String str2) {
        this.f16013a = new GetProfileMembersInfoInPrivateChatRequest(str, str2);
    }

    public final GetProfileMembersInfoInPrivateChatResponse m13056a(Context context) {
        return (GetProfileMembersInfoInPrivateChatResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getProfileMembersInfo(this.f16013a), this.f16013a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13056a(context);
    }
}
