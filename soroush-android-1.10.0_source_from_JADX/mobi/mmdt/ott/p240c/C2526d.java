package mobi.mmdt.ott.p240c;

import java.util.Map;
import mobi.mmdt.ott.p240c.C2524c.C2522a;

public interface C2526d {

    public enum C2525a {
        DISCONNECTED_ON_ERROR,
        CONNECTED,
        DISCONNECTED_ON_REQUEST
    }

    void mo2198a(String str);

    void mo2199a(String str, String str2, String str3, String str4, Map<String, String> map);

    void mo2200a(String str, String str2, String str3, Map<String, String> map);

    void mo2201a(String str, String str2, C2522a c2522a);

    void mo2202a(String str, C2522a c2522a);

    void mo2203a(C2525a c2525a);

    void mo2204b(String str, String str2, String str3, String str4, Map<String, String> map);
}
