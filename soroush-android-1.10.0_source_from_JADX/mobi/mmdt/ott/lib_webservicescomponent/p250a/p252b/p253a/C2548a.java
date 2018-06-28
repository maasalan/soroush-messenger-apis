package mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a;

public abstract class C2548a {
    protected boolean isError = false;
    protected String mResultCode;
    protected String mResultMessage;

    protected C2548a() {
    }

    protected C2548a(String str, String str2) {
        this.mResultCode = str;
        this.mResultMessage = str2;
    }

    public String getResultCode() {
        return this.mResultCode;
    }

    public String getResultMessage() {
        return this.mResultMessage;
    }

    protected boolean isError() {
        return this.isError;
    }

    public void setError(boolean z) {
        this.isError = z;
    }

    protected void setResultCode(String str) {
        this.mResultCode = str;
    }

    protected void setResultMessage(String str) {
        this.mResultMessage = str;
    }
}
