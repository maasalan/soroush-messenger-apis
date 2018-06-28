package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;

public final class C5885a extends C2566a {
    private UserWindowArchiveRequest f16053a;

    public C5885a(String str, String str2, int i, String str3, long j, ArchiveRetrieveMode archiveRetrieveMode) {
        this.f16053a = new UserWindowArchiveRequest(str, str2, i, str3, j, archiveRetrieveMode);
    }

    public final UserWindowArchiveResponse m13090a(Context context) {
        return (UserWindowArchiveResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getUserWindowArchive(this.f16053a), this.f16053a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13090a(context);
    }
}
