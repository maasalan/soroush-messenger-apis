package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.get_sticker_banner;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5878a extends C2566a {
    private StickerBannersRequest f16042a;

    public C5878a(String str, String str2) {
        this.f16042a = new StickerBannersRequest(str, str2);
    }

    public final StickerBannersResponse m13083a(Context context) {
        return (StickerBannersResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickerBanners(this.f16042a), this.f16042a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13083a(context);
    }
}
