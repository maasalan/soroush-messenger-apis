package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.send;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike;

public final class C5860a extends C2566a {
    private SendLikeRequest f16024a;

    public C5860a(String str, MessageLike[] messageLikeArr) {
        this.f16024a = new SendLikeRequest(str, messageLikeArr);
    }

    public final SendLikeResponse m13065a(Context context) {
        return (SendLikeResponse) registeredSend(context, C2567b.m7018a().m7022a(context).sendLike(this.f16024a), this.f16024a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13065a(context);
    }
}
