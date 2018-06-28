package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5882a extends C2566a {
    private GetStickerInformationRequest f16048a;

    public C5882a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f16048a = new GetStickerInformationRequest(str, str2, str3, str4, str5, str6, str7);
    }

    public final GetStickerInformationResponse m13087a(Context context) {
        return (GetStickerInformationResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickerInformation(this.f16048a), this.f16048a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13087a(context);
    }
}
