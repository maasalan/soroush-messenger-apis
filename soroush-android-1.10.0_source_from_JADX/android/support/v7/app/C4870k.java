package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p041a.C0645a.C0635a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class C4870k extends Dialog implements C0664d {
    private C0665e f13528a;

    public C4870k(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0635a.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        m9370b().mo2584a(null);
        m9370b().mo464j();
    }

    private C0665e m9370b() {
        if (this.f13528a == null) {
            this.f13528a = C0665e.m1617a((Dialog) this, (C0664d) this);
        }
        return this.f13528a;
    }

    public final boolean m9371a() {
        return m9370b().mo2594c(1);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m9370b().mo2591b(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return m9370b().mo2582a(i);
    }

    public void invalidateOptionsMenu() {
        m9370b().mo2598g();
    }

    public void onCreate(Bundle bundle) {
        m9370b().mo2599i();
        super.onCreate(bundle);
        m9370b().mo2584a(bundle);
    }

    protected void onStop() {
        super.onStop();
        m9370b().mo462e();
    }

    public void setContentView(int i) {
        m9370b().mo2590b(i);
    }

    public void setContentView(View view) {
        m9370b().mo2586a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m9370b().mo2587a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m9370b().mo458a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m9370b().mo458a(charSequence);
    }
}
