package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactChangeRequest;

public final class C5816a extends C2566a {
    private SyncChangeRequest f15978a;

    public C5816a(String str, ContactChangeRequest[] contactChangeRequestArr) {
        this.f15978a = new SyncChangeRequest(str, contactChangeRequestArr);
    }

    public final SyncChangeResponse m13021a(Context context) {
        return (SyncChangeResponse) registeredSend(context, C2567b.m7018a().m7022a(context).syncChange(this.f15978a), this.f15978a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13021a(context);
    }
}
