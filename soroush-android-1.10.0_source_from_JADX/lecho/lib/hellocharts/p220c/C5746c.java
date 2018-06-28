package lecho.lib.hellocharts.p220c;

import android.util.Log;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import lecho.lib.hellocharts.model.C2436g;
import lecho.lib.hellocharts.p225h.C2430c;

public final class C5746c implements C2412b {
    private C2413d f15802a = new C2413d();

    public C5746c() {
        C2413d c2413d = this.f15802a;
        NumberFormat instance = NumberFormat.getInstance();
        if (instance instanceof DecimalFormat) {
            c2413d.f7967d = ((DecimalFormat) instance).getDecimalFormatSymbols().getDecimalSeparator();
        }
    }

    public final int mo2096a(char[] cArr, C2436g c2436g) {
        C2413d c2413d = this.f15802a;
        float f = c2436g.f8087b;
        Object obj = c2436g.f8092g;
        if (obj != null) {
            int length = obj.length;
            if (length > cArr.length) {
                Log.w("ValueFormatterHelper", "Label length is larger than buffer size(64chars), some chars will be skipped!");
                length = cArr.length;
            }
            System.arraycopy(obj, 0, cArr, cArr.length - length, length);
            return length;
        }
        int a = C2430c.m6643a(cArr, f, cArr.length - c2413d.f7965b.length, c2413d.f7964a < 0 ? 0 : c2413d.f7964a, c2413d.f7967d);
        if (c2413d.f7965b.length > 0) {
            System.arraycopy(c2413d.f7965b, 0, cArr, cArr.length - c2413d.f7965b.length, c2413d.f7965b.length);
        }
        if (c2413d.f7966c.length > 0) {
            System.arraycopy(c2413d.f7966c, 0, cArr, ((cArr.length - a) - c2413d.f7965b.length) - c2413d.f7966c.length, c2413d.f7966c.length);
        }
        return (a + c2413d.f7966c.length) + c2413d.f7965b.length;
    }
}
