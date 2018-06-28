package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_categories;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5879a extends C2566a {
    private StickersCategoriesRequest f16043a;

    public C5879a(String str, String str2) {
        this.f16043a = new StickersCategoriesRequest(str, str2);
    }

    public final StickersCategoriesResponse m13084a(Context context) {
        return (StickersCategoriesResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickersCategoiries(this.f16043a), this.f16043a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13084a(context);
    }
}
