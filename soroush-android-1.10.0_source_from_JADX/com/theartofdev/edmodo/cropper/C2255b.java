package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.C2258c.C2256a;
import com.theartofdev.edmodo.cropper.C2258c.C2257b;
import com.theartofdev.edmodo.cropper.CropImageView.C2249e;
import java.lang.ref.WeakReference;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C2255b extends AsyncTask<Void, Void, C2254a> {
    final Uri f7502a;
    private final WeakReference<CropImageView> f7503b;
    private final Context f7504c;
    private final int f7505d;
    private final int f7506e;

    public static final class C2254a {
        public final Uri f7497a;
        public final Bitmap f7498b;
        public final int f7499c;
        public final int f7500d;
        public final Exception f7501e;

        C2254a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f7497a = uri;
            this.f7498b = bitmap;
            this.f7499c = i;
            this.f7500d = i2;
            this.f7501e = null;
        }

        C2254a(Uri uri, Exception exception) {
            this.f7497a = uri;
            this.f7498b = null;
            this.f7499c = 0;
            this.f7500d = 0;
            this.f7501e = exception;
        }
    }

    public C2255b(CropImageView cropImageView, Uri uri) {
        this.f7502a = uri;
        this.f7503b = new WeakReference(cropImageView);
        this.f7504c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        double d = displayMetrics.density > BallPulseIndicator.SCALE ? (double) (BallPulseIndicator.SCALE / displayMetrics.density) : 1.0d;
        this.f7505d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f7506e = (int) (((double) displayMetrics.heightPixels) * d);
    }

    private C2254a m6149a() {
        try {
            if (!isCancelled()) {
                C2256a a = C2258c.m6159a(this.f7504c, this.f7502a, this.f7505d, this.f7506e);
                if (!isCancelled()) {
                    C2257b a2 = C2258c.m6160a(a.f7507a, this.f7504c, this.f7502a);
                    return new C2254a(this.f7502a, a2.f7509a, a.f7508b, a2.f7510b);
                }
            }
            return null;
        } catch (Exception e) {
            return new C2254a(this.f7502a, e);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6149a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2254a c2254a = (C2254a) obj;
        if (c2254a != null) {
            Object obj2 = null;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f7503b.get();
                if (cropImageView != null) {
                    obj2 = 1;
                    C2249e c2249e = null;
                    cropImageView.f7433h = null;
                    cropImageView.m6139a();
                    if (c2254a.f7501e == null) {
                        cropImageView.setBitmap$1fdc9e65(c2254a.f7498b);
                        cropImageView.f7431f = c2254a.f7497a;
                        cropImageView.f7432g = c2254a.f7499c;
                        cropImageView.f7427b = c2254a.f7500d;
                    }
                    if (cropImageView.f7428c != null) {
                        c2249e = (C2249e) cropImageView.f7428c.get();
                    }
                    if (c2249e != null) {
                        c2249e.mo2289a(c2254a.f7501e);
                    }
                }
            }
            if (obj2 == null && c2254a.f7498b != null) {
                c2254a.f7498b.recycle();
            }
        }
    }
}
