package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactModelRequest;

public final class C5815a extends C2566a {
    private SyncAllRequest f15977a;

    public C5815a(String str, ContactModelRequest[] contactModelRequestArr) {
        this.f15977a = new SyncAllRequest(str, contactModelRequestArr);
    }

    public final SyncAllResponse m13020a(Context context) {
        return (SyncAllResponse) registeredSend(context, C2567b.m7018a().m7022a(context).syncAllRequest(this.f15977a), this.f15977a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13020a(context);
    }
}
