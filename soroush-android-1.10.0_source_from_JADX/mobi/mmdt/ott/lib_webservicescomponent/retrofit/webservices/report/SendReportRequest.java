package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportType;

public class SendReportRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "NetType")
    private String netType;
    @C1902a
    @C1904c(a = "OSVersion")
    private String osVersion;
    @C1902a
    @C1904c(a = "ReportData")
    private ReportData reportData;
    @C1902a
    @C1904c(a = "ReportDescription")
    private String reportDescription;
    @C1902a
    @C1904c(a = "ReportTitle")
    private String reportTitle;
    @C1902a
    @C1904c(a = "ReportType")
    private ReportType reportType;

    SendReportRequest(String str, String str2, String str3, String str4, ReportType reportType, String str5, ReportData reportData) {
        super(str);
        this.osVersion = str2;
        this.netType = str3;
        this.reportTitle = str4;
        this.reportType = reportType;
        this.reportDescription = str5;
        this.reportData = reportData;
    }

    public String getNetType() {
        return this.netType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public ReportData getReportData() {
        return this.reportData;
    }

    public String getReportDescription() {
        return this.reportDescription;
    }

    public String getReportTitle() {
        return this.reportTitle;
    }

    public ReportType getReportType() {
        return this.reportType;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }

    public void setReportDescription(String str) {
        this.reportDescription = str;
    }

    public void setReportTitle(String str) {
        this.reportTitle = str;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }
}
