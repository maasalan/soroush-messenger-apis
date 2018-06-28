package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class ContactModelRequest {
    @C1902a
    @C1904c(a = "Number")
    private String Number;
    @C1902a
    @C1904c(a = "Name")
    private String name;

    public ContactModelRequest(String str, String str2) {
        this.name = str;
        this.Number = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.Number;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.Number = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContactModelRequest{name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append(", Number='");
        stringBuilder.append(this.Number);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
