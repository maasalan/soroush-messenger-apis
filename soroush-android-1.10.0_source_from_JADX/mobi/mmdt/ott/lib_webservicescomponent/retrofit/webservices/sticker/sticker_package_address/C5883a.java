package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5883a extends C2566a {
    private StickerPackageAddressRequest f16049a;
    private String f16050b;

    public C5883a(String str, String str2, String str3) {
        this.f16049a = new StickerPackageAddressRequest(str, str2);
        this.f16050b = str3;
    }

    public final StickerPackageAddressResponse m13088a(Context context) {
        return (StickerPackageAddressResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickerPackageAddress(this.f16049a, this.f16050b), this.f16049a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13088a(context);
    }
}
