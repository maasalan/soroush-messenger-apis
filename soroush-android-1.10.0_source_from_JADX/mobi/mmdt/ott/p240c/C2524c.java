package mobi.mmdt.ott.p240c;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

public interface C2524c {

    public enum C2522a {
        ACTIVE,
        COMPOSING,
        PAUSED,
        INACTIVE,
        GONE
    }

    public enum C2523b {
        ;
        
        public static final int f8217a = 1;
        public static final int f8218b = 2;

        static {
            f8219c = new int[]{f8217a, f8218b};
        }
    }

    long mo2137a(String str);

    String mo2138a(Context context);

    String mo2139a(String str, String str2, String str3, Map<String, String> map);

    String mo2140a(String str, String str2, String str3, Map<String, String> map, String str4);

    void mo2141a();

    void mo2142a(String str, String str2);

    void mo2143a(String str, String str2, int i);

    void mo2147a(ArrayList<String> arrayList);

    void mo2148a(C2515a c2515a, Context context);

    void mo2149a(C2522a c2522a, String str);

    void mo2150a(C2526d c2526d);

    boolean mo2152a(boolean z);

    String mo2153b(String str, String str2, String str3, Map<String, String> map);

    ArrayList<String> mo2154b();

    void mo2155b(String str);

    void mo2156b(String str, String str2);

    void mo2158b(ArrayList<String> arrayList);

    void mo2159b(C2526d c2526d);

    void mo2160c(String str);
}
