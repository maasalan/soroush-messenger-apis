package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView.C2247c;
import java.lang.ref.WeakReference;

final class C2253a extends AsyncTask<Void, Void, C2252a> {
    private final WeakReference<CropImageView> f7481a;
    private final Bitmap f7482b;
    private final Uri f7483c;
    private final Context f7484d;
    private final float[] f7485e;
    private final int f7486f;
    private final int f7487g;
    private final int f7488h;
    private final boolean f7489i;
    private final int f7490j;
    private final int f7491k;
    private final int f7492l;
    private final int f7493m;
    private final Uri f7494n;
    private final CompressFormat f7495o;
    private final int f7496p;

    public static final class C2252a {
        public final Bitmap f7477a;
        public final Uri f7478b;
        public final Exception f7479c;
        public final boolean f7480d;

        C2252a(Bitmap bitmap) {
            this.f7477a = bitmap;
            this.f7478b = null;
            this.f7479c = null;
            this.f7480d = false;
        }

        C2252a(Uri uri) {
            this.f7477a = null;
            this.f7478b = uri;
            this.f7479c = null;
            this.f7480d = true;
        }

        C2252a(Exception exception, boolean z) {
            this.f7477a = null;
            this.f7478b = null;
            this.f7479c = exception;
            this.f7480d = z;
        }
    }

    public C2253a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3) {
        this.f7481a = new WeakReference(cropImageView);
        this.f7484d = cropImageView.getContext();
        this.f7482b = bitmap;
        this.f7485e = fArr;
        this.f7483c = null;
        this.f7486f = i;
        this.f7489i = z;
        this.f7490j = i2;
        this.f7491k = i3;
        this.f7494n = null;
        this.f7495o = null;
        this.f7496p = 0;
        this.f7487g = 0;
        this.f7488h = 0;
        this.f7492l = 0;
        this.f7493m = 0;
    }

    public C2253a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5) {
        this.f7481a = new WeakReference(cropImageView);
        this.f7484d = cropImageView.getContext();
        this.f7483c = uri;
        this.f7485e = fArr;
        this.f7486f = i;
        this.f7489i = z;
        this.f7490j = i4;
        this.f7491k = i5;
        this.f7487g = i2;
        this.f7488h = i3;
        this.f7492l = 0;
        this.f7493m = 0;
        this.f7494n = null;
        this.f7495o = null;
        this.f7496p = 0;
        this.f7482b = null;
    }

    private C2252a m6148a() {
        try {
            Bitmap bitmap = null;
            if (isCancelled()) {
                return null;
            }
            if (this.f7483c != null) {
                bitmap = C2258c.m6154a(this.f7484d, this.f7483c, this.f7485e, this.f7486f, this.f7487g, this.f7488h, this.f7489i, this.f7490j, this.f7491k, this.f7492l, this.f7493m);
            } else if (this.f7482b != null) {
                bitmap = C2258c.m6155a(this.f7482b, this.f7485e, this.f7486f, this.f7489i, this.f7490j, this.f7491k);
            }
            if (this.f7494n == null) {
                return new C2252a(bitmap);
            }
            C2258c.m6162a(this.f7484d, bitmap, this.f7494n, this.f7495o, this.f7496p);
            bitmap.recycle();
            return new C2252a(this.f7494n);
        } catch (Exception e) {
            return new C2252a(e, this.f7494n != null);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6148a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2252a c2252a = (C2252a) obj;
        if (c2252a != null) {
            Object obj2 = null;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f7481a.get();
                if (cropImageView != null) {
                    obj2 = 1;
                    C2247c c2247c = null;
                    cropImageView.f7434i = null;
                    cropImageView.m6139a();
                    if (!c2252a.f7480d) {
                        if (cropImageView.f7429d != null) {
                            c2247c = (C2247c) cropImageView.f7429d.get();
                        }
                        if (c2247c != null) {
                            c2247c.mo2288a(c2252a.f7477a, c2252a.f7479c);
                        }
                    } else if (cropImageView.f7430e != null) {
                        cropImageView.f7430e.get();
                    }
                }
            }
            if (obj2 == null && c2252a.f7477a != null) {
                c2252a.f7477a.recycle();
            }
        }
    }
}
