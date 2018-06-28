package mobi.mmdt.ott.logic.p261a.af.p270a;

import java.net.HttpURLConnection;

public final class C2604i extends Exception {
    private HttpURLConnection f8495a;

    public C2604i(String str, HttpURLConnection httpURLConnection) {
        super(str);
        this.f8495a = httpURLConnection;
    }
}
