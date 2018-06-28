package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Map;

public final class C0100k {
    private Map<String, Integer> f393a = new HashMap();

    public final boolean m179a(String str) {
        Integer num = (Integer) this.f393a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & 1) != 0;
        this.f393a.put(str, Integer.valueOf(intValue | 1));
        return !z;
    }
}
