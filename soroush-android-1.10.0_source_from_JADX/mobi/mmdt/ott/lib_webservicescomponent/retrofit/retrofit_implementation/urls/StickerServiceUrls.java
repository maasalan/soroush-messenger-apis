package mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.urls;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session.CreateNewSessionRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session.CreateNewSessionResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.get_sticker_banner.StickerBannersRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.get_sticker_banner.StickerBannersResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_categories.StickersCategoriesRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_categories.StickersCategoriesResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category.StickersCollectionsByCategoryRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category.StickersCollectionsByCategoryResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_filter.GetStickersCollectionsByFilterRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_filter.GetStickersCollectionsByFilterResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information.GetStickerInformationRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information.GetStickerInformationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address.StickerPackageAddressRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address.StickerPackageAddressResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail.StickerPackageDetailRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail.StickerPackageDetailResponse;
import p207e.C2305b;
import p207e.p208b.C2281a;
import p207e.p208b.C2295o;
import p207e.p208b.C2299s;

public interface StickerServiceUrls {
    @C2295o(a = "authentication/")
    C2305b<CreateNewSessionResponse> createNewSession(@C2281a CreateNewSessionRequest createNewSessionRequest);

    @C2295o(a = "browse/{filter}")
    C2305b<GetStickersCollectionsByFilterResponse> getGetStickersCollectionsByFilter(@C2281a GetStickersCollectionsByFilterRequest getStickersCollectionsByFilterRequest, @C2299s(a = "filter", b = true) String str);

    @C2295o(a = "banner/")
    C2305b<StickerBannersResponse> getStickerBanners(@C2281a StickerBannersRequest stickerBannersRequest);

    @C2295o(a = "stickers/download/")
    C2305b<GetStickerInformationResponse> getStickerInformation(@C2281a GetStickerInformationRequest getStickerInformationRequest);

    @C2295o(a = "packages/download/{package_id}")
    C2305b<StickerPackageAddressResponse> getStickerPackageAddress(@C2281a StickerPackageAddressRequest stickerPackageAddressRequest, @C2299s(a = "package_id", b = true) String str);

    @C2295o(a = "packages/view/{package_id}")
    C2305b<StickerPackageDetailResponse> getStickerPackageDetail(@C2281a StickerPackageDetailRequest stickerPackageDetailRequest, @C2299s(a = "package_id", b = true) String str);

    @C2295o(a = "browse/index/")
    C2305b<StickersCategoriesResponse> getStickersCategoiries(@C2281a StickersCategoriesRequest stickersCategoriesRequest);

    @C2295o(a = "browse/index/{category}")
    C2305b<StickersCollectionsByCategoryResponse> getStickersCollectionsByCategory(@C2281a StickersCollectionsByCategoryRequest stickersCollectionsByCategoryRequest, @C2299s(a = "category", b = true) String str);
}
