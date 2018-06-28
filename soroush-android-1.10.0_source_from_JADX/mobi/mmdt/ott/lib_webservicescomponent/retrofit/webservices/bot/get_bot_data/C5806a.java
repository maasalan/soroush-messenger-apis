package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5806a extends C2566a {
    private GetBotDataRequest f15969a;

    public C5806a(String str, String str2) {
        this.f15969a = new GetBotDataRequest(str, str2);
    }

    public final GetBotDataResponse m13011a(Context context) {
        return (GetBotDataResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getBotData(this.f15969a), this.f15969a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13011a(context);
    }
}
