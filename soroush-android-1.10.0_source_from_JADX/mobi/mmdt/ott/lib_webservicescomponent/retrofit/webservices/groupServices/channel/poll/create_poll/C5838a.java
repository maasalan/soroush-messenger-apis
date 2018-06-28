package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollData;

public final class C5838a extends C2566a {
    private CreatePollRequest f16000a;

    public C5838a(String str, int i, PollData pollData) {
        this.f16000a = new CreatePollRequest(str, i, pollData);
    }

    public final CreatePollResponse m13043a(Context context) {
        return (CreatePollResponse) registeredSend(context, C2567b.m7018a().m7022a(context).createPoll(this.f16000a), this.f16000a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13043a(context);
    }
}
