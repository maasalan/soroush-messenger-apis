package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ac;

public class C1825u {
    public final C1827x f6279f;

    protected C1825u(C1827x c1827x) {
        ac.m4376a((Object) c1827x);
        this.f6279f = c1827x;
    }

    private static String m5136a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    private final void mo3025a(int i, String str, Object obj, Object obj2, Object obj3) {
        bp bpVar = this.f6279f != null ? this.f6279f.f6287e : null;
        String str2;
        if (bpVar != null) {
            str2 = (String) bf.f5560b.f5585a;
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, C1825u.m5138c(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                bpVar.mo3025a(i, str, obj, obj2, obj3);
            }
            return;
        }
        str2 = (String) bf.f5560b.f5585a;
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, C1825u.m5138c(str, obj, obj2, obj3));
        }
    }

    protected static String m5138c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        obj = C1825u.m5136a(obj);
        obj2 = C1825u.m5136a(obj2);
        obj3 = C1825u.m5136a(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(obj)) {
            stringBuilder.append(str2);
            stringBuilder.append(obj);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(obj2)) {
            stringBuilder.append(str2);
            stringBuilder.append(obj2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(obj3)) {
            stringBuilder.append(str2);
            stringBuilder.append(obj3);
        }
        return stringBuilder.toString();
    }

    public static boolean m5139i() {
        return Log.isLoggable((String) bf.f5560b.f5585a, 2);
    }

    public final void m5140a(String str, Object obj) {
        mo3025a(2, str, obj, null, null);
    }

    public final void m5141a(String str, Object obj, Object obj2) {
        mo3025a(2, str, obj, obj2, null);
    }

    public final void m5142a(String str, Object obj, Object obj2, Object obj3) {
        mo3025a(3, str, obj, obj2, obj3);
    }

    public final void m5143b(String str) {
        mo3025a(2, str, null, null, null);
    }

    public final void m5144b(String str, Object obj) {
        mo3025a(3, str, obj, null, null);
    }

    public final void m5145b(String str, Object obj, Object obj2) {
        mo3025a(3, str, obj, obj2, null);
    }

    public final void m5146b(String str, Object obj, Object obj2, Object obj3) {
        mo3025a(5, str, obj, obj2, obj3);
    }

    public final void m5147c(String str) {
        mo3025a(3, str, null, null, null);
    }

    public final void m5148c(String str, Object obj) {
        mo3025a(4, str, obj, null, null);
    }

    public final void m5149c(String str, Object obj, Object obj2) {
        mo3025a(5, str, obj, obj2, null);
    }

    public final void m5150d(String str) {
        mo3025a(4, str, null, null, null);
    }

    public final void m5151d(String str, Object obj) {
        mo3025a(5, str, obj, null, null);
    }

    public final void m5152d(String str, Object obj, Object obj2) {
        mo3025a(6, str, obj, obj2, null);
    }

    public final void m5153e(String str) {
        mo3025a(5, str, null, null, null);
    }

    public final void m5154e(String str, Object obj) {
        mo3025a(6, str, obj, null, null);
    }

    public final void m5155f(String str) {
        mo3025a(6, str, null, null, null);
    }

    protected final bc m5156g() {
        C1827x c1827x = this.f6279f;
        C1827x.m5159a(c1827x.f6288f);
        return c1827x.f6288f;
    }

    protected final bt m5157h() {
        C1827x c1827x = this.f6279f;
        C1827x.m5159a(c1827x.f6289g);
        return c1827x.f6289g;
    }
}
