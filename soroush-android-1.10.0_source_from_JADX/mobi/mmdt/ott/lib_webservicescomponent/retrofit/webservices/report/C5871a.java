package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportType;

public final class C5871a extends C2566a {
    private SendReportRequest f16035a;

    public C5871a(String str, String str2, String str3, String str4, ReportType reportType, String str5, ReportData reportData) {
        this.f16035a = new SendReportRequest(str, str2, str3, str4, reportType, str5, reportData);
    }

    public final SendReportResponse m13076a(Context context) {
        return (SendReportResponse) registeredSend(context, C2567b.m7018a().m7022a(context).sendReport(this.f16035a), this.f16035a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13076a(context);
    }
}
