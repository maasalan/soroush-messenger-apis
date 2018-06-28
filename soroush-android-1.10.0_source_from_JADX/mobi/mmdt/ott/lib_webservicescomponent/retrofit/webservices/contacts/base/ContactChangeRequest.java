package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base;

import com.google.p164b.p165a.C1904c;

public class ContactChangeRequest {
    public static final String ADD = "Add";
    public static final String DELETE = "Delete";
    public static final String UPDATE = "Update";
    @C1904c(a = "Action")
    private String action;
    @C1904c(a = "Name")
    private String name;
    @C1904c(a = "Number")
    private String number;

    public ContactChangeRequest(String str, String str2, String str3) {
        this.name = str;
        this.number = str2;
        this.action = str3;
    }

    public static String getADD() {
        return ADD;
    }

    public static String getDELETE() {
        return DELETE;
    }

    public static String getUPDATE() {
        return UPDATE;
    }

    public String getAction() {
        return this.action;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }
}
