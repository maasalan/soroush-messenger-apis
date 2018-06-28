package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5839a extends C2566a {
    private GetPollResultRequest f16001a;

    public C5839a(String str, String str2) {
        this.f16001a = new GetPollResultRequest(str, str2);
    }

    public final GetPollResultResponse m13044a(Context context) {
        return (GetPollResultResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getPollResult(this.f16001a), this.f16001a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13044a(context);
    }
}
