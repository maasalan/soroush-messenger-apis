package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0571r;
import android.support.v4.view.p039a.C0536b;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] f17349a = new int[]{16842912};
    private boolean f17350b;

    class C47331 extends C0547a {
        final /* synthetic */ CheckableImageButton f13068a;

        C47331(CheckableImageButton checkableImageButton) {
            this.f13068a = checkableImageButton;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f13068a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            c0536b.m1197a(true);
            c0536b.f1836b.setChecked(this.f13068a.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0571r.m1340a((View) this, new C47331(this));
    }

    public boolean isChecked() {
        return this.f17350b;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f17350b ? mergeDrawableStates(super.onCreateDrawableState(i + f17349a.length), f17349a) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f17350b != z) {
            this.f17350b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(this.f17350b ^ 1);
    }
}
