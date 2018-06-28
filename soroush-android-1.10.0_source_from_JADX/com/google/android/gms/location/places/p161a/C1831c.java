package com.google.android.gms.location.places.p161a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.C5458b;

public class C1831c {
    protected final Intent f6306a;

    public C1831c(String str) {
        this.f6306a = new Intent(str);
        this.f6306a.setPackage("com.google.android.gms");
    }

    protected Intent mo1673a(Activity activity) {
        Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.f6306a.hasExtra("primary_color")) {
            this.f6306a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.f6306a.hasExtra("primary_color_dark")) {
            this.f6306a.putExtra("primary_color_dark", typedValue2.data);
        }
        C5458b.m11789a();
        C1771k.m4474b((Context) activity);
        return this.f6306a;
    }
}
