package android.support.v7.p048f;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class C0700a implements TransformationMethod {
    private Locale f2312a;

    public C0700a(Context context) {
        this.f2312a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence != null ? charSequence.toString().toUpperCase(this.f2312a) : null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
