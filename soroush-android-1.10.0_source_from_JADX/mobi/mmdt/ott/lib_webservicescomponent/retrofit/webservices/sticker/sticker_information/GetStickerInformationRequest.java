package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetStickerInformationRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "DeviceId")
    private String deviceId;
    @C1902a
    @C1904c(a = "FromUsername")
    private String formUserName;
    @C1902a
    @C1904c(a = "PackageID")
    private String packageId;
    @C1902a
    @C1904c(a = "Resolution")
    private String resolution;
    @C1902a
    @C1904c(a = "StickerID")
    private String stickerID;
    @C1902a
    @C1904c(a = "StickerVersion")
    private String stickerVersion;

    public GetStickerInformationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str);
        this.formUserName = str2;
        this.stickerVersion = str3;
        this.packageId = str4;
        this.stickerID = str5;
        this.resolution = str6;
        this.deviceId = str7;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getFormUserName() {
        return this.formUserName;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getStickerID() {
        return this.stickerID;
    }

    public String getStickerVersion() {
        return this.stickerVersion;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setFormUserName(String str) {
        this.formUserName = str;
    }

    public void setPackageId(String str) {
        this.packageId = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setStickerID(String str) {
        this.stickerID = str;
    }

    public void setStickerVersion(String str) {
        this.stickerVersion = str;
    }
}
