package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.BaseLookup;

public class LookupLinkResponse extends BaseResponse {
    @C1904c(a = "Key")
    private String key;
    @C1902a
    private BaseLookup lookupObject;
    @C1904c(a = "MetaData")
    private HashMap<String, Object> metaData;
    @C1904c(a = "Type")
    private String type;

    public LookupLinkResponse(int i, String str) {
        super(i, str);
    }

    public String getKey() {
        return this.key;
    }

    public BaseLookup getLookupObject() {
        return this.lookupObject;
    }

    public HashMap<String, Object> getMetaData() {
        return this.metaData;
    }

    public String getType() {
        return this.type;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLookupObject(BaseLookup baseLookup) {
        this.lookupObject = baseLookup;
    }

    public void setMetaData(HashMap<String, Object> hashMap) {
        this.metaData = hashMap;
    }

    public void setType(String str) {
        this.type = str;
    }
}
