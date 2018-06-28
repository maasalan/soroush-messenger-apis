package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

public enum ArchiveRetrieveMode {
    DEFAULT("default"),
    NEW_MSG("new_msg"),
    FORWARD_MSG("forward_msg"),
    REPLY_MSG("reply_msg"),
    SINGLE("single");
    
    public String text;

    private ArchiveRetrieveMode(String str) {
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }
}
