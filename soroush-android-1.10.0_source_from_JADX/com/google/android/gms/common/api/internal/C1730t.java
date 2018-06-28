package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.C1650a.C1645b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1769z;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ah;
import org.msgpack.util.TemplatePrecompiler;

@Deprecated
public final class C1730t {
    private static final Object f5282a = new Object();
    private static C1730t f5283b;
    private final String f5284c;
    private final Status f5285d;
    private final boolean f5286e;
    private final boolean f5287f;

    private C1730t(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C1645b.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f5287f = z ^ 1;
        } else {
            this.f5287f = false;
        }
        this.f5286e = z;
        Object a = C1769z.m4467a(context);
        if (a == null) {
            a = new ah(context).m4388a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f5285d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5284c = null;
            return;
        }
        this.f5284c = a;
        this.f5285d = Status.f17975a;
    }

    public static Status m4352a(Context context) {
        Status status;
        ac.m4377a((Object) context, (Object) "Context must not be null.");
        synchronized (f5282a) {
            if (f5283b == null) {
                f5283b = new C1730t(context);
            }
            status = f5283b.f5285d;
        }
        return status;
    }

    private static C1730t m4353a(String str) {
        C1730t c1730t;
        synchronized (f5282a) {
            if (f5283b == null) {
                StringBuilder stringBuilder = new StringBuilder(34 + String.valueOf(str).length());
                stringBuilder.append("Initialize must be called before ");
                stringBuilder.append(str);
                stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                throw new IllegalStateException(stringBuilder.toString());
            }
            c1730t = f5283b;
        }
        return c1730t;
    }

    public static String m4354a() {
        return C1730t.m4353a("getGoogleAppId").f5284c;
    }

    public static boolean m4355b() {
        return C1730t.m4353a("isMeasurementExplicitlyDisabled").f5287f;
    }
}
