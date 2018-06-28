package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.C0705b;
import android.support.v7.view.C0705b.C0704a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class C0662a {

    public static class C0660a extends MarginLayoutParams {
        public int gravity;

        public C0660a(int i) {
            this(-2, -1, i);
        }

        public C0660a(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public C0660a(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = i3;
        }

        public C0660a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0644j.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(C0644j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0660a(C0660a c0660a) {
            super(c0660a);
            this.gravity = 0;
            this.gravity = c0660a.gravity;
        }

        public C0660a(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }

    @Deprecated
    public static abstract class C0661b {
        public abstract Drawable m1580a();

        public abstract CharSequence m1581b();

        public abstract View m1582c();

        public abstract CharSequence m1583d();
    }

    public abstract int mo467a();

    public C0705b mo504a(C0704a c0704a) {
        return null;
    }

    public void mo468a(Configuration configuration) {
    }

    public void mo469a(Drawable drawable) {
    }

    public abstract void mo470a(CharSequence charSequence);

    public abstract void mo471a(boolean z);

    public boolean mo472a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean mo473a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void mo474b();

    public abstract void mo475b(CharSequence charSequence);

    public void mo476b(boolean z) {
    }

    public abstract void mo477c();

    public void mo478c(CharSequence charSequence) {
    }

    public void mo479c(boolean z) {
    }

    public Context mo480d() {
        return null;
    }

    public void mo481d(boolean z) {
    }

    public void mo482e() {
    }

    public void mo483e(boolean z) {
    }

    public boolean mo484f() {
        return false;
    }

    public boolean mo485g() {
        return false;
    }

    public boolean mo486h() {
        return false;
    }

    public boolean mo487i() {
        return false;
    }

    void mo488j() {
    }
}
