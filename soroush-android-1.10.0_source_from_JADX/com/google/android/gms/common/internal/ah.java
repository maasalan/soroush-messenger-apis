package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.C1650a.C1645b;

public final class ah {
    private final Resources f5341a;
    private final String f5342b = this.f5341a.getResourcePackageName(C1645b.common_google_play_services_unknown_issue);

    public ah(Context context) {
        ac.m4376a((Object) context);
        this.f5341a = context.getResources();
    }

    public final String m4388a(String str) {
        int identifier = this.f5341a.getIdentifier(str, "string", this.f5342b);
        return identifier == 0 ? null : this.f5341a.getString(identifier);
    }
}
