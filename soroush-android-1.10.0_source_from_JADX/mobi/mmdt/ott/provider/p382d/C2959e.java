package mobi.mmdt.ott.provider.p382d;

import android.content.Context;
import android.content.CursorLoader;

public final class C2959e {
    public static CursorLoader m7385a(Context context) {
        return new CursorLoader(context, C2958b.f9195a, null, null, null, "TransactionTime DESC");
    }
}
