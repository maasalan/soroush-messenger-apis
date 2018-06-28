package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5884a extends C2566a {
    private StickerPackageDetailRequest f16051a;
    private String f16052b;

    public C5884a(String str, String str2, String str3) {
        this.f16051a = new StickerPackageDetailRequest(str, str2);
        this.f16052b = str3;
    }

    public final StickerPackageDetailResponse m13089a(Context context) {
        return (StickerPackageDetailResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickerPackageDetail(this.f16051a, this.f16052b), this.f16051a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13089a(context);
    }
}
