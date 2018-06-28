package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.ContactModelRequest;

public class SyncAllRequest extends RegisteredRequest {
    @C1904c(a = "ContactList")
    private ContactModelRequest[] contactList;

    public SyncAllRequest(String str, ContactModelRequest[] contactModelRequestArr) {
        super(str);
        this.contactList = contactModelRequestArr;
    }

    public ContactModelRequest[] getContactList() {
        return this.contactList;
    }

    public void setContactList(ContactModelRequest[] contactModelRequestArr) {
        this.contactList = contactModelRequestArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SyncAllRequest{contactList=");
        stringBuilder.append(this.contactList);
        stringBuilder.append(", requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", userName='");
        stringBuilder.append(this.userName);
        stringBuilder.append('\'');
        stringBuilder.append(", hashMethod='");
        stringBuilder.append(this.hashMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", authValue='");
        stringBuilder.append(this.authValue);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
