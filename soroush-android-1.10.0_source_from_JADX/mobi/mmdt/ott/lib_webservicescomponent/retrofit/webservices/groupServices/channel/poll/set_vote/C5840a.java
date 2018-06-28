package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.set_vote;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.VoteData;

public final class C5840a extends C2566a {
    private SetVoteRequest f16002a;

    public C5840a(String str, String str2, VoteData voteData) {
        this.f16002a = new SetVoteRequest(str, str2, voteData);
    }

    public final SetVoteResponse m13045a(Context context) {
        return (SetVoteResponse) registeredSend(context, C2567b.m7018a().m7022a(context).setVote(this.f16002a), this.f16002a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13045a(context);
    }
}
