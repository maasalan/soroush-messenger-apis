package pl.droidsonroids.gif;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import pl.droidsonroids.gif.C7844d.C7843a;

public class GifImageView extends ImageView {
    private boolean f24881a;

    public GifImageView(Context context) {
        super(context);
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22102a(C7844d.m22132a(this, attributeSet, 0, 0));
    }

    public GifImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22102a(C7844d.m22132a(this, attributeSet, i, 0));
    }

    @TargetApi(21)
    public GifImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m22102a(C7844d.m22132a(this, attributeSet, i, i2));
    }

    private void m22102a(C7843a c7843a) {
        this.f24881a = c7843a.f24931c;
        if (c7843a.f24929a > 0) {
            super.setImageResource(c7843a.f24929a);
        }
        if (c7843a.f24930b > 0) {
            super.setBackgroundResource(c7843a.f24930b);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof GifViewSavedState) {
            GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
            super.onRestoreInstanceState(gifViewSavedState.getSuperState());
            gifViewSavedState.m22123a(getDrawable(), 0);
            gifViewSavedState.m22123a(getBackground(), 1);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Drawable drawable = null;
        Drawable drawable2 = this.f24881a ? getDrawable() : null;
        if (this.f24881a) {
            drawable = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawable2, drawable);
    }

    public void setBackgroundResource(int i) {
        if (!C7844d.m22134a((ImageView) this, false, i)) {
            super.setBackgroundResource(i);
        }
    }

    public void setFreezesAnimation(boolean z) {
        this.f24881a = z;
    }

    public void setImageResource(int i) {
        if (!C7844d.m22134a((ImageView) this, true, i)) {
            super.setImageResource(i);
        }
    }

    public void setImageURI(Uri uri) {
        if (!C7844d.m22133a((ImageView) this, uri)) {
            super.setImageURI(uri);
        }
    }
}
