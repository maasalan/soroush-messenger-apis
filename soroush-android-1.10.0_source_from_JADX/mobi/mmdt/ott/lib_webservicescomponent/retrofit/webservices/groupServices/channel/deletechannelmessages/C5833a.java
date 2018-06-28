package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannelmessages;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5833a extends C2566a {
    private DeleteChannelMessagesRequest f15995a;

    public C5833a(String str, String str2, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            StringBuilder stringBuilder2 = new StringBuilder(",");
            stringBuilder2.append(strArr[i]);
            stringBuilder.append(stringBuilder2.toString());
        }
        this.f15995a = new DeleteChannelMessagesRequest(str, str2, stringBuilder.toString());
    }

    public final DeleteChannelMessagesResponse m13038a(Context context) {
        return (DeleteChannelMessagesResponse) registeredSend(context, C2567b.m7018a().m7022a(context).deleteChannelMessages(this.f15995a), this.f15995a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13038a(context);
    }
}
