package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;

public final class C5810a extends C2566a {
    private WindowsGroupArchiveRequest f15973a;

    public C5810a(String str, String str2, ArchiveRetrieveMode archiveRetrieveMode, String str3, Long l) {
        this.f15973a = new WindowsGroupArchiveRequest(str, str2, archiveRetrieveMode, str3, l, 1.0d);
    }

    public final WindowsGroupArchiveResponse m13015a(Context context) {
        return (WindowsGroupArchiveResponse) registeredSend(context, C2567b.m7018a().m7022a(context).groupChatArchiveWindows(this.f15973a), this.f15973a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13015a(context);
    }
}
