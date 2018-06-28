package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5829a extends C2566a {
    private CheckExistMemberInChannelRequest f15991a;

    public C5829a(String str, String str2, String[] strArr) {
        this.f15991a = new CheckExistMemberInChannelRequest(str, str2, strArr);
    }

    public final CheckExistMemberInChannelResponse m13034a(Context context) {
        return (CheckExistMemberInChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).checkExistMemberInChannel(this.f15991a), this.f15991a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13034a(context);
    }
}
