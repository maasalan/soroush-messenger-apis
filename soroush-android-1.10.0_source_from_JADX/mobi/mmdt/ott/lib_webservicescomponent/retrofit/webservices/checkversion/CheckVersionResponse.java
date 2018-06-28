package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion;

import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CheckVersionResponse extends BaseResponse {
    private ArrayList<String> chagesList;
    private String downloadLink;
    private String downloadLinkSHA1Sum;
    private String lastVersion;

    public CheckVersionResponse(int i, String str, String str2, String str3, String str4, ArrayList<String> arrayList) {
        super(i, str);
        this.lastVersion = str2;
        this.downloadLink = str3;
        this.downloadLinkSHA1Sum = str4;
        this.chagesList = arrayList;
    }

    public ArrayList<String> getChagesList() {
        return this.chagesList;
    }

    public String getDownloadLink() {
        return this.downloadLink;
    }

    public String getDownloadLinkSHA1Sum() {
        return this.downloadLinkSHA1Sum;
    }

    public String getLastVersion() {
        return this.lastVersion;
    }
}
