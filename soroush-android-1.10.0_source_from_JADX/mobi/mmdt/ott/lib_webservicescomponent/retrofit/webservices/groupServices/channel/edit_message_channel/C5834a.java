package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.edit_message_channel;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5834a extends C2566a {
    private EditChannelMessageRequest f15996a;

    public C5834a(String str, String str2, String str3, String str4) {
        this.f15996a = new EditChannelMessageRequest(str, str2, str3, str4);
    }

    public final EditChannelMessageResponse m13039a(Context context) {
        return (EditChannelMessageResponse) registeredSend(context, C2567b.m7018a().m7022a(context).editChannelMessage(this.f15996a), this.f15996a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13039a(context);
    }
}
