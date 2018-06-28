package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.analytics.C1667f;

@Deprecated
public final class bo {
    private static volatile C1667f f5601a = new ay();

    public static void m4618a(String str) {
        C1825u b = bp.m15990b();
        if (b != null) {
            b.m5143b(str);
        } else if (m4620a(0)) {
            Log.v((String) bf.f5560b.f5585a, str);
        }
        C1667f c1667f = f5601a;
    }

    public static void m4619a(String str, Object obj) {
        C1825u b = bp.m15990b();
        if (b != null) {
            b.m5154e(str, obj);
        } else if (m4620a(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder stringBuilder = new StringBuilder((1 + String.valueOf(str).length()) + String.valueOf(valueOf).length());
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(valueOf);
                str = stringBuilder.toString();
            }
            Log.e((String) bf.f5560b.f5585a, str);
        }
        C1667f c1667f = f5601a;
    }

    private static boolean m4620a(int i) {
        return f5601a != null && f5601a.mo1588a() <= i;
    }

    public static void m4621b(String str) {
        C1825u b = bp.m15990b();
        if (b != null) {
            b.m5153e(str);
        } else if (m4620a(2)) {
            Log.w((String) bf.f5560b.f5585a, str);
        }
        C1667f c1667f = f5601a;
    }
}
