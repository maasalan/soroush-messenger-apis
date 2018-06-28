package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p038g.C4813a;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;

public final class C2078n {
    static C2067c f6993a;
    static String f6994c;
    private static Map<String, C2078n> f6995d = new C4813a();
    private static aa f6996f;
    String f6997b = "";
    private Context f6998e;
    private KeyPair f6999g;

    private C2078n(Context context, String str) {
        this.f6998e = context.getApplicationContext();
        this.f6997b = str;
    }

    public static synchronized C2078n m5667a(Context context) {
        C2078n a;
        synchronized (C2078n.class) {
            a = C2078n.m5668a(context, null);
        }
        return a;
    }

    public static synchronized C2078n m5668a(Context context, String str) {
        C2078n c2078n;
        synchronized (C2078n.class) {
            if (str == null) {
                str = "";
            }
            context = context.getApplicationContext();
            if (f6993a == null) {
                f6993a = new C2067c(context);
                f6996f = new aa(context);
            }
            f6994c = Integer.toString(FirebaseInstanceId.m5607a(context));
            c2078n = (C2078n) f6995d.get(str);
            if (c2078n == null) {
                c2078n = new C2078n(context, str);
                f6995d.put(str, c2078n);
            }
        }
        return c2078n;
    }

    public static C2067c m5669b() {
        return f6993a;
    }

    private void m5670f() {
        f6993a.m5646b(this.f6997b);
        this.f6999g = null;
    }

    public final String m5671a(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        str2 = "subtype";
        if (!"".equals(this.f6997b)) {
            str = this.f6997b;
        }
        bundle.putString(str2, str);
        Bundle a = f6996f.m5631a(bundle, m5672a());
        if (a == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        str2 = a.getString("registration_id");
        if (str2 != null) {
            return str2;
        }
        str2 = a.getString("unregistered");
        if (str2 != null) {
            return str2;
        }
        str2 = a.getString("error");
        if (str2 != null) {
            throw new IOException(str2);
        }
        str = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(20 + String.valueOf(str).length());
        stringBuilder.append("Unexpected response ");
        stringBuilder.append(str);
        Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    final KeyPair m5672a() {
        if (this.f6999g == null) {
            this.f6999g = f6993a.m5649d(this.f6997b);
        }
        if (this.f6999g == null) {
            this.f6999g = f6993a.m5642a(this.f6997b);
        }
        return this.f6999g;
    }

    final void m5673c() {
        m5670f();
        FirebaseInstanceId.m5609a().m5619b();
    }

    final void m5674d() {
        if (!f6993a.m5644a()) {
            m5670f();
            f6993a.m5645b();
            FirebaseInstanceId.m5609a().m5619b();
        }
    }

    final void m5675e() {
        f6993a.m5648c(this.f6997b);
        FirebaseInstanceId.m5609a().m5619b();
    }
}
