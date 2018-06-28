package p056c;

import java.io.IOException;

public enum C0956y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    
    private final String f3060f;

    private C0956y(String str) {
        this.f3060f = str;
    }

    public static C0956y m2392a(String str) {
        if (str.equals(HTTP_1_0.f3060f)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f3060f)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f3060f)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f3060f)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f3060f)) {
            return QUIC;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected protocol: ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    public final String toString() {
        return this.f3060f;
    }
}
