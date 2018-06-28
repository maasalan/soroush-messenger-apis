package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactChangeRequest;

public class SyncChangeRequest extends RegisteredRequest {
    @C1904c(a = "ContactChangesList")
    private ContactChangeRequest[] contactChangesList;

    public SyncChangeRequest(String str, ContactChangeRequest[] contactChangeRequestArr) {
        super(str);
        this.contactChangesList = contactChangeRequestArr;
    }

    public ContactChangeRequest[] getContactChangesList() {
        return this.contactChangesList;
    }

    public void setContactChangesList(ContactChangeRequest[] contactChangeRequestArr) {
        this.contactChangesList = contactChangeRequestArr;
    }
}
