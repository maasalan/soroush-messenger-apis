package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.list;

import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.base.Sessions;

public class SessionListResponse extends BaseResponse {
    @C1904c(a = "Sessions")
    private ArrayList<Sessions> sessions;

    public SessionListResponse(int i, String str, ArrayList<Sessions> arrayList) {
        super(i, str);
        this.sessions = arrayList;
    }

    public ArrayList<Sessions> getSessions() {
        return this.sessions;
    }
}
