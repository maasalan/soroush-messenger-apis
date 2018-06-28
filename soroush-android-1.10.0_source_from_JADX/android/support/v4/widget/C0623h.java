package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public final class C0623h {
    static final C0622b f2049a = (VERSION.SDK_INT >= 21 ? new C6382c() : new C4856a());

    interface C0622b {
        ColorStateList mo432a(ImageView imageView);

        void mo433a(ImageView imageView, ColorStateList colorStateList);

        void mo434a(ImageView imageView, Mode mode);

        Mode mo435b(ImageView imageView);
    }

    static class C4856a implements C0622b {
        C4856a() {
        }

        public ColorStateList mo432a(ImageView imageView) {
            return imageView instanceof C0630o ? ((C0630o) imageView).getSupportImageTintList() : null;
        }

        public void mo433a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0630o) {
                ((C0630o) imageView).setSupportImageTintList(colorStateList);
            }
        }

        public void mo434a(ImageView imageView, Mode mode) {
            if (imageView instanceof C0630o) {
                ((C0630o) imageView).setSupportImageTintMode(mode);
            }
        }

        public Mode mo435b(ImageView imageView) {
            return imageView instanceof C0630o ? ((C0630o) imageView).getSupportImageTintMode() : null;
        }
    }

    static class C6382c extends C4856a {
        C6382c() {
        }

        public final ColorStateList mo432a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public final void mo433a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final void mo434a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final Mode mo435b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    public static ColorStateList m1510a(ImageView imageView) {
        return f2049a.mo432a(imageView);
    }

    public static void m1511a(ImageView imageView, ColorStateList colorStateList) {
        f2049a.mo433a(imageView, colorStateList);
    }

    public static void m1512a(ImageView imageView, Mode mode) {
        f2049a.mo434a(imageView, mode);
    }

    public static Mode m1513b(ImageView imageView) {
        return f2049a.mo435b(imageView);
    }
}
