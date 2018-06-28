package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.C2267g.C2264a;
import com.theartofdev.edmodo.cropper.C2267g.C2265b;
import com.theartofdev.edmodo.cropper.C2267g.C2266c;
import com.theartofdev.edmodo.cropper.CropOverlayView.C2251a;
import java.lang.ref.WeakReference;
import java.util.UUID;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CropImageView extends FrameLayout {
    private float f7424A;
    private RectF f7425B;
    public final CropOverlayView f7426a;
    int f7427b;
    WeakReference<C2249e> f7428c;
    WeakReference<C2247c> f7429d;
    WeakReference<C2248d> f7430e;
    Uri f7431f;
    int f7432g;
    WeakReference<C2255b> f7433h;
    WeakReference<C2253a> f7434i;
    private final ImageView f7435j;
    private final Matrix f7436k;
    private final Matrix f7437l;
    private final ProgressBar f7438m;
    private final RectF f7439n;
    private C2259d f7440o;
    private Bitmap f7441p;
    private int f7442q;
    private int f7443r;
    private int f7444s;
    private C2250f f7445t;
    private boolean f7446u;
    private boolean f7447v;
    private boolean f7448w;
    private int f7449x;
    private float f7450y;
    private float f7451z;

    public enum C2245a {
        RECTANGLE,
        OVAL
    }

    public enum C2246b {
        OFF,
        ON_TOUCH,
        ON
    }

    public interface C2247c {
        void mo2288a(Bitmap bitmap, Exception exception);
    }

    public interface C2248d {
    }

    public interface C2249e {
        void mo2289a(Exception exception);
    }

    public enum C2250f {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    class C56781 implements C2251a {
        final /* synthetic */ CropImageView f15612a;

        C56781(CropImageView cropImageView) {
            this.f15612a = cropImageView;
        }

        public final void mo2029a(boolean z) {
            this.f15612a.m6135a(z, true);
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7436k = new Matrix();
        this.f7437l = new Matrix();
        this.f7439n = new RectF();
        this.f7446u = true;
        this.f7447v = true;
        this.f7448w = true;
        this.f7432g = 1;
        this.f7450y = BallPulseIndicator.SCALE;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null) {
            cropImageOptions = (CropImageOptions) intent.getParcelableExtra("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2266c.CropImageView, 0, 0);
                try {
                    cropImageOptions.f7396k = obtainStyledAttributes.getBoolean(C2266c.CropImageView_cropFixAspectRatio, cropImageOptions.f7396k);
                    cropImageOptions.f7397l = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropAspectRatioX, cropImageOptions.f7397l);
                    cropImageOptions.f7398m = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropAspectRatioY, cropImageOptions.f7398m);
                    cropImageOptions.f7390e = C2250f.values()[obtainStyledAttributes.getInt(C2266c.CropImageView_cropScaleType, cropImageOptions.f7390e.ordinal())];
                    cropImageOptions.f7393h = obtainStyledAttributes.getBoolean(C2266c.CropImageView_cropAutoZoomEnabled, cropImageOptions.f7393h);
                    cropImageOptions.f7394i = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropMaxZoom, cropImageOptions.f7394i);
                    cropImageOptions.f7386a = C2245a.values()[obtainStyledAttributes.getInt(C2266c.CropImageView_cropShape, cropImageOptions.f7386a.ordinal())];
                    cropImageOptions.f7389d = C2246b.values()[obtainStyledAttributes.getInt(C2266c.CropImageView_cropGuidelines, cropImageOptions.f7389d.ordinal())];
                    cropImageOptions.f7387b = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropSnapRadius, cropImageOptions.f7387b);
                    cropImageOptions.f7388c = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropTouchRadius, cropImageOptions.f7388c);
                    cropImageOptions.f7395j = obtainStyledAttributes.getFloat(C2266c.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.f7395j);
                    cropImageOptions.f7399n = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropBorderLineThickness, cropImageOptions.f7399n);
                    cropImageOptions.f7400o = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropBorderLineColor, cropImageOptions.f7400o);
                    cropImageOptions.f7401p = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropBorderCornerThickness, cropImageOptions.f7401p);
                    cropImageOptions.f7402q = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropBorderCornerOffset, cropImageOptions.f7402q);
                    cropImageOptions.f7403r = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropBorderCornerLength, cropImageOptions.f7403r);
                    cropImageOptions.f7404s = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropBorderCornerColor, cropImageOptions.f7404s);
                    cropImageOptions.f7405t = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropGuidelinesThickness, cropImageOptions.f7405t);
                    cropImageOptions.f7406u = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropGuidelinesColor, cropImageOptions.f7406u);
                    cropImageOptions.f7407v = obtainStyledAttributes.getInteger(C2266c.CropImageView_cropBackgroundColor, cropImageOptions.f7407v);
                    cropImageOptions.f7391f = obtainStyledAttributes.getBoolean(C2266c.CropImageView_cropShowCropOverlay, this.f7446u);
                    cropImageOptions.f7392g = obtainStyledAttributes.getBoolean(C2266c.CropImageView_cropShowProgressBar, this.f7447v);
                    cropImageOptions.f7401p = obtainStyledAttributes.getDimension(C2266c.CropImageView_cropBorderCornerThickness, cropImageOptions.f7401p);
                    cropImageOptions.f7408w = (int) obtainStyledAttributes.getDimension(C2266c.CropImageView_cropMinCropWindowWidth, (float) cropImageOptions.f7408w);
                    cropImageOptions.f7409x = (int) obtainStyledAttributes.getDimension(C2266c.CropImageView_cropMinCropWindowHeight, (float) cropImageOptions.f7409x);
                    cropImageOptions.f7410y = (int) obtainStyledAttributes.getFloat(C2266c.CropImageView_cropMinCropResultWidthPX, (float) cropImageOptions.f7410y);
                    cropImageOptions.f7411z = (int) obtainStyledAttributes.getFloat(C2266c.CropImageView_cropMinCropResultHeightPX, (float) cropImageOptions.f7411z);
                    cropImageOptions.f7374A = (int) obtainStyledAttributes.getFloat(C2266c.CropImageView_cropMaxCropResultWidthPX, (float) cropImageOptions.f7374A);
                    cropImageOptions.f7375B = (int) obtainStyledAttributes.getFloat(C2266c.CropImageView_cropMaxCropResultHeightPX, (float) cropImageOptions.f7375B);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        if (cropImageOptions.f7394i < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (cropImageOptions.f7388c < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        } else {
            if (cropImageOptions.f7395j >= 0.0f) {
                if (((double) cropImageOptions.f7395j) < 0.5d) {
                    if (cropImageOptions.f7397l <= 0) {
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    } else if (cropImageOptions.f7398m <= 0) {
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    } else if (cropImageOptions.f7399n < 0.0f) {
                        throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
                    } else if (cropImageOptions.f7401p < 0.0f) {
                        throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
                    } else if (cropImageOptions.f7405t < 0.0f) {
                        throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                    } else if (cropImageOptions.f7409x < 0) {
                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                    } else if (cropImageOptions.f7410y < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                    } else if (cropImageOptions.f7411z < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (cropImageOptions.f7374A < cropImageOptions.f7410y) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (cropImageOptions.f7375B < cropImageOptions.f7411z) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (cropImageOptions.f7381H < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (cropImageOptions.f7382I < 0) {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    } else {
                        this.f7445t = cropImageOptions.f7390e;
                        this.f7448w = cropImageOptions.f7393h;
                        this.f7449x = cropImageOptions.f7394i;
                        this.f7446u = cropImageOptions.f7391f;
                        this.f7447v = cropImageOptions.f7392g;
                        View inflate = LayoutInflater.from(context).inflate(C2265b.crop_image_view, this, true);
                        this.f7435j = (ImageView) inflate.findViewById(C2264a.ImageView_image);
                        this.f7435j.setScaleType(ScaleType.MATRIX);
                        this.f7426a = (CropOverlayView) inflate.findViewById(C2264a.CropOverlayView);
                        this.f7426a.setCropWindowChangeListener(new C56781(this));
                        this.f7426a.setInitialAttributeValues(cropImageOptions);
                        this.f7438m = (ProgressBar) inflate.findViewById(C2264a.CropProgressBar);
                        m6139a();
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
    }

    private static int m6131a(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    private void m6132a(float f, float f2, boolean z, boolean z2) {
        if (this.f7441p != null) {
            float f3 = 0.0f;
            if (f > 0.0f && f2 > 0.0f) {
                this.f7436k.reset();
                this.f7439n.set(0.0f, 0.0f, (float) this.f7441p.getWidth(), (float) this.f7441p.getHeight());
                this.f7436k.postTranslate((f - this.f7439n.width()) / 2.0f, (f2 - this.f7439n.height()) / 2.0f);
                m6133a(this.f7439n);
                if (this.f7427b > 0) {
                    this.f7436k.postRotate((float) this.f7427b, this.f7439n.centerX(), this.f7439n.centerY());
                    m6133a(this.f7439n);
                }
                float min = Math.min(f / this.f7439n.width(), f2 / this.f7439n.height());
                if (this.f7445t == C2250f.FIT_CENTER || ((this.f7445t == C2250f.CENTER_INSIDE && min < BallPulseIndicator.SCALE) || (min > BallPulseIndicator.SCALE && this.f7448w))) {
                    this.f7436k.postScale(min, min, this.f7439n.centerX(), this.f7439n.centerY());
                    m6133a(this.f7439n);
                }
                this.f7436k.postScale(this.f7450y, this.f7450y, this.f7439n.centerX(), this.f7439n.centerY());
                m6133a(this.f7439n);
                RectF cropWindowRect = this.f7426a.getCropWindowRect();
                cropWindowRect.offset((-this.f7451z) * this.f7450y, (-this.f7424A) * this.f7450y);
                if (z) {
                    this.f7451z = f > this.f7439n.width() ? 0.0f : Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -this.f7439n.left), ((float) getWidth()) - this.f7439n.right) / this.f7450y;
                    if (f2 <= this.f7439n.height()) {
                        f3 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -this.f7439n.top), ((float) getHeight()) - this.f7439n.bottom) / this.f7450y;
                    }
                    this.f7424A = f3;
                } else {
                    this.f7451z = Math.min(Math.max(this.f7451z * this.f7450y, -cropWindowRect.left), (-cropWindowRect.right) + f) / this.f7450y;
                    this.f7424A = Math.min(Math.max(this.f7424A * this.f7450y, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / this.f7450y;
                }
                this.f7436k.postTranslate(this.f7451z * this.f7450y, this.f7424A * this.f7450y);
                cropWindowRect.offset(this.f7451z * this.f7450y, this.f7424A * this.f7450y);
                this.f7426a.setCropWindowRect(cropWindowRect);
                m6133a(this.f7439n);
                if (z2) {
                    C2259d c2259d = this.f7440o;
                    RectF rectF = this.f7439n;
                    Matrix matrix = this.f7436k;
                    c2259d.f7518c.set(rectF);
                    c2259d.f7520e.set(c2259d.f7516a.getCropWindowRect());
                    matrix.getValues(c2259d.f7522g);
                    this.f7435j.startAnimation(this.f7440o);
                } else {
                    this.f7435j.setImageMatrix(this.f7436k);
                }
                m6137b(this.f7439n);
            }
        }
    }

    private void m6133a(RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) this.f7441p.getWidth(), (float) this.f7441p.getHeight());
        this.f7436k.mapRect(rectF);
    }

    private void m6135a(boolean z, boolean z2) {
        int width = getWidth();
        int height = getHeight();
        if (this.f7441p != null && width > 0 && height > 0) {
            RectF cropWindowRect = this.f7426a.getCropWindowRect();
            if (z) {
                if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > ((float) width) || cropWindowRect.bottom > ((float) height)) {
                    m6132a((float) width, (float) height, false, false);
                }
            } else if (this.f7448w || this.f7450y > BallPulseIndicator.SCALE) {
                float f;
                float min;
                float f2;
                C2259d c2259d;
                RectF rectF;
                Matrix matrix;
                float f3;
                float width2;
                if (this.f7450y < ((float) this.f7449x)) {
                    f = (float) width;
                    if (cropWindowRect.width() < f * 0.5f) {
                        float f4 = (float) height;
                        if (cropWindowRect.height() < 0.5f * f4) {
                            min = Math.min((float) this.f7449x, Math.min(f / ((cropWindowRect.width() / this.f7450y) / 0.64f), f4 / ((cropWindowRect.height() / this.f7450y) / 0.64f)));
                            if (this.f7450y > BallPulseIndicator.SCALE) {
                                f2 = (float) width;
                                if (cropWindowRect.width() > f2 * 0.65f || cropWindowRect.height() > ((float) height) * 0.65f) {
                                    min = Math.max(BallPulseIndicator.SCALE, Math.min(f2 / ((cropWindowRect.width() / this.f7450y) / 0.51f), ((float) height) / ((cropWindowRect.height() / this.f7450y) / 0.51f)));
                                }
                            }
                            if (!this.f7448w) {
                                min = BallPulseIndicator.SCALE;
                            }
                            if (min > 0.0f && min != this.f7450y) {
                                if (z2) {
                                    if (this.f7440o == null) {
                                        this.f7440o = new C2259d(this.f7435j, this.f7426a);
                                    }
                                    c2259d = this.f7440o;
                                    rectF = this.f7439n;
                                    matrix = this.f7436k;
                                    c2259d.reset();
                                    c2259d.f7517b.set(rectF);
                                    c2259d.f7519d.set(c2259d.f7516a.getCropWindowRect());
                                    matrix.getValues(c2259d.f7521f);
                                }
                                f3 = min / this.f7450y;
                                rectF = this.f7426a.getCropWindowRect();
                                width2 = ((float) (getWidth() / 2)) - rectF.centerX();
                                f = ((float) (getHeight() / 2)) - rectF.centerY();
                                rectF.offset(width2 - (width2 * f3), f - (f * f3));
                                rectF.inset((rectF.width() - (rectF.width() * f3)) / 2.0f, (rectF.height() - (rectF.height() * f3)) / 2.0f);
                                this.f7426a.setCropWindowRect(rectF);
                                this.f7450y = min;
                                m6132a((float) width, (float) height, true, z2);
                            }
                        }
                    }
                }
                min = 0.0f;
                if (this.f7450y > BallPulseIndicator.SCALE) {
                    f2 = (float) width;
                    min = Math.max(BallPulseIndicator.SCALE, Math.min(f2 / ((cropWindowRect.width() / this.f7450y) / 0.51f), ((float) height) / ((cropWindowRect.height() / this.f7450y) / 0.51f)));
                }
                if (this.f7448w) {
                    min = BallPulseIndicator.SCALE;
                }
                if (z2) {
                    if (this.f7440o == null) {
                        this.f7440o = new C2259d(this.f7435j, this.f7426a);
                    }
                    c2259d = this.f7440o;
                    rectF = this.f7439n;
                    matrix = this.f7436k;
                    c2259d.reset();
                    c2259d.f7517b.set(rectF);
                    c2259d.f7519d.set(c2259d.f7516a.getCropWindowRect());
                    matrix.getValues(c2259d.f7521f);
                }
                f3 = min / this.f7450y;
                rectF = this.f7426a.getCropWindowRect();
                width2 = ((float) (getWidth() / 2)) - rectF.centerX();
                f = ((float) (getHeight() / 2)) - rectF.centerY();
                rectF.offset(width2 - (width2 * f3), f - (f * f3));
                rectF.inset((rectF.width() - (rectF.width() * f3)) / 2.0f, (rectF.height() - (rectF.height() * f3)) / 2.0f);
                this.f7426a.setCropWindowRect(rectF);
                this.f7450y = min;
                m6132a((float) width, (float) height, true, z2);
            }
        }
    }

    private void m6136b() {
        if (this.f7441p != null && (this.f7444s > 0 || this.f7431f != null)) {
            this.f7441p.recycle();
        }
        this.f7441p = null;
        this.f7444s = 0;
        this.f7431f = null;
        this.f7432g = 1;
        this.f7427b = 0;
        this.f7450y = BallPulseIndicator.SCALE;
        this.f7451z = 0.0f;
        this.f7424A = 0.0f;
        this.f7436k.reset();
        this.f7435j.setImageBitmap(null);
        m6138c();
    }

    private void m6137b(RectF rectF) {
        if (this.f7441p != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
            float width = ((float) (this.f7441p.getWidth() * this.f7432g)) / rectF.width();
            float height = ((float) (this.f7441p.getHeight() * this.f7432g)) / rectF.height();
            float width2 = (float) getWidth();
            float height2 = (float) getHeight();
            C2260e c2260e = this.f7426a.f7452a;
            c2260e.f7529d = width2;
            c2260e.f7530e = height2;
            c2260e.f7535j = width;
            c2260e.f7536k = height;
        }
        this.f7426a.m6147a(rectF, getWidth(), getHeight());
    }

    private void m6138c() {
        if (this.f7426a != null) {
            CropOverlayView cropOverlayView = this.f7426a;
            int i = (!this.f7446u || this.f7441p == null) ? 4 : 0;
            cropOverlayView.setVisibility(i);
        }
    }

    final void m6139a() {
        int i = 0;
        int i2 = (!this.f7447v || ((this.f7441p != null || this.f7433h == null) && this.f7434i == null)) ? 0 : 1;
        ProgressBar progressBar = this.f7438m;
        if (i2 == 0) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    public final void m6140a(int i) {
        if (this.f7441p != null) {
            if (i % 90 == 0) {
                C2258c.f7513c.set(this.f7426a.getCropWindowRect());
                this.f7436k.invert(this.f7437l);
                this.f7437l.mapRect(C2258c.f7513c);
                this.f7450y = BallPulseIndicator.SCALE;
                this.f7451z = 0.0f;
                this.f7424A = 0.0f;
                this.f7427b += i;
                this.f7427b = this.f7427b >= 0 ? this.f7427b % 360 : (this.f7427b % 360) + 360;
                m6132a((float) getWidth(), (float) getHeight(), true, false);
                this.f7436k.mapRect(C2258c.f7513c);
                this.f7426a.m6146a();
                this.f7426a.setCropWindowRect(C2258c.f7513c);
                m6132a((float) getWidth(), (float) getHeight(), true, false);
                m6135a(false, false);
                return;
            }
            this.f7427b += i;
            this.f7427b = this.f7427b >= 0 ? this.f7427b % 360 : (this.f7427b % 360) + 360;
            this.f7450y = BallPulseIndicator.SCALE;
            this.f7424A = 0.0f;
            this.f7451z = 0.0f;
            this.f7426a.m6146a();
            m6132a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair(Integer.valueOf(this.f7426a.getAspectRatioX()), Integer.valueOf(this.f7426a.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f7426a.getCropWindowRect();
        r2 = new float[8];
        int i = 0;
        r2[0] = cropWindowRect.left;
        r2[1] = cropWindowRect.top;
        r2[2] = cropWindowRect.right;
        r2[3] = cropWindowRect.top;
        r2[4] = cropWindowRect.right;
        r2[5] = cropWindowRect.bottom;
        r2[6] = cropWindowRect.left;
        r2[7] = cropWindowRect.bottom;
        this.f7436k.invert(this.f7437l);
        this.f7437l.mapPoints(r2);
        while (i < 8) {
            r2[i] = r2[i] * ((float) this.f7432g);
            i++;
        }
        return r2;
    }

    public Rect getCropRect() {
        if (this.f7441p == null) {
            return null;
        }
        return C2258c.m6158a(getCropPoints(), this.f7432g * this.f7441p.getWidth(), this.f7432g * this.f7441p.getHeight(), this.f7426a.f7453b, this.f7426a.getAspectRatioX(), this.f7426a.getAspectRatioY());
    }

    public C2245a getCropShape() {
        return this.f7426a.getCropShape();
    }

    public Bitmap getCroppedImage() {
        if (this.f7441p == null) {
            return null;
        }
        this.f7435j.clearAnimation();
        if (this.f7431f == null || this.f7432g <= 1) {
            return C2258c.m6155a(this.f7441p, getCropPoints(), this.f7427b, this.f7426a.f7453b, this.f7426a.getAspectRatioX(), this.f7426a.getAspectRatioY());
        }
        return C2258c.m6154a(getContext(), this.f7431f, getCropPoints(), this.f7427b, this.f7441p.getWidth() * this.f7432g, this.f7441p.getHeight() * this.f7432g, this.f7426a.f7453b, this.f7426a.getAspectRatioX(), this.f7426a.getAspectRatioY(), 0, 0);
    }

    public void getCroppedImageAsync() {
        if (this.f7429d == null) {
            throw new IllegalArgumentException("OnGetCroppedImageCompleteListener is not set");
        }
        this.f7435j.clearAnimation();
        C2253a c2253a = this.f7434i != null ? (C2253a) this.f7434i.get() : null;
        if (c2253a != null) {
            c2253a.cancel(true);
        }
        WeakReference weakReference = (this.f7431f == null || this.f7432g <= 1) ? new WeakReference(new C2253a(this, this.f7441p, getCropPoints(), this.f7427b, this.f7426a.f7453b, this.f7426a.getAspectRatioX(), this.f7426a.getAspectRatioY())) : new WeakReference(new C2253a(this, this.f7431f, getCropPoints(), this.f7427b, this.f7441p.getWidth() * this.f7432g, this.f7441p.getHeight() * this.f7432g, this.f7426a.f7453b, this.f7426a.getAspectRatioX(), this.f7426a.getAspectRatioY()));
        this.f7434i = weakReference;
        ((C2253a) this.f7434i.get()).execute(new Void[0]);
        m6139a();
    }

    public C2246b getGuidelines() {
        return this.f7426a.getGuidelines();
    }

    public int getImageResource() {
        return this.f7444s;
    }

    public Uri getImageUri() {
        return this.f7431f;
    }

    public int getMaxZoom() {
        return this.f7449x;
    }

    public int getRotatedDegrees() {
        return this.f7427b;
    }

    public C2250f getScaleType() {
        return this.f7445t;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7442q <= 0 || this.f7443r <= 0) {
            m6137b(C2258c.f7512b);
            return;
        }
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f7442q;
        layoutParams.height = this.f7443r;
        setLayoutParams(layoutParams);
        if (this.f7441p != null) {
            m6132a((float) (i3 - i), (float) (i4 - i2), false, false);
            if (!(this.f7441p == null || this.f7425B == null)) {
                this.f7436k.mapRect(this.f7425B);
                this.f7426a.setCropWindowRect(this.f7425B);
                this.f7425B = null;
                m6135a(false, false);
                return;
            }
        }
        m6137b(C2258c.f7512b);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (this.f7441p != null) {
            int width;
            int height;
            if (i2 == 0) {
                i2 = this.f7441p.getHeight();
            }
            double width2 = i < this.f7441p.getWidth() ? ((double) i) / ((double) this.f7441p.getWidth()) : Double.POSITIVE_INFINITY;
            double height2 = i2 < this.f7441p.getHeight() ? ((double) i2) / ((double) this.f7441p.getHeight()) : Double.POSITIVE_INFINITY;
            if (width2 == Double.POSITIVE_INFINITY) {
                if (height2 == Double.POSITIVE_INFINITY) {
                    width = this.f7441p.getWidth();
                    height = this.f7441p.getHeight();
                    i = m6131a(mode, i, width);
                    i2 = m6131a(mode2, i2, height);
                    this.f7442q = i;
                    this.f7443r = i2;
                    setMeasuredDimension(this.f7442q, this.f7443r);
                    return;
                }
            }
            if (width2 <= height2) {
                height = (int) (((double) this.f7441p.getHeight()) * width2);
                width = i;
            } else {
                width = (int) (((double) this.f7441p.getWidth()) * height2);
                height = i2;
            }
            i = m6131a(mode, i, width);
            i2 = m6131a(mode2, i2, height);
            this.f7442q = i;
            this.f7443r = i2;
            setMeasuredDimension(this.f7442q, this.f7443r);
            return;
        }
        setMeasuredDimension(i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestoreInstanceState(android.os.Parcelable r5) {
        /*
        r4 = this;
        r0 = r5 instanceof android.os.Bundle;
        if (r0 == 0) goto L_0x00c2;
    L_0x0004:
        r5 = (android.os.Bundle) r5;
        r0 = "LOADED_IMAGE_URI";
        r0 = r5.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        if (r0 == 0) goto L_0x0053;
    L_0x0010:
        r1 = "LOADED_IMAGE_STATE_BITMAP_KEY";
        r1 = r5.getString(r1);
        if (r1 == 0) goto L_0x004e;
    L_0x0018:
        r2 = com.theartofdev.edmodo.cropper.C2258c.f7515e;
        r3 = 0;
        if (r2 == 0) goto L_0x0036;
    L_0x001d:
        r2 = com.theartofdev.edmodo.cropper.C2258c.f7515e;
        r2 = r2.first;
        r2 = (java.lang.String) r2;
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0036;
    L_0x0029:
        r1 = com.theartofdev.edmodo.cropper.C2258c.f7515e;
        r1 = r1.second;
        r1 = (java.lang.ref.WeakReference) r1;
        r1 = r1.get();
        r1 = (android.graphics.Bitmap) r1;
        goto L_0x0037;
    L_0x0036:
        r1 = r3;
    L_0x0037:
        if (r1 == 0) goto L_0x004e;
    L_0x0039:
        r2 = r1.isRecycled();
        if (r2 != 0) goto L_0x004e;
    L_0x003f:
        com.theartofdev.edmodo.cropper.C2258c.f7515e = r3;
        r4.setBitmap$1fdc9e65(r1);
        r4.f7431f = r0;
        r1 = "LOADED_SAMPLE_SIZE";
        r1 = r5.getInt(r1);
        r4.f7432g = r1;
    L_0x004e:
        r1 = r4.f7431f;
        if (r1 != 0) goto L_0x007a;
    L_0x0052:
        goto L_0x0077;
    L_0x0053:
        r0 = "LOADED_IMAGE_RESOURCE";
        r0 = r5.getInt(r0);
        if (r0 <= 0) goto L_0x005f;
    L_0x005b:
        r4.setImageResource(r0);
        goto L_0x007a;
    L_0x005f:
        r0 = "SET_BITMAP";
        r0 = r5.getParcelable(r0);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x006d;
    L_0x0069:
        r4.setBitmap$1fdc9e65(r0);
        goto L_0x007a;
    L_0x006d:
        r0 = "LOADING_IMAGE_URI";
        r0 = r5.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        if (r0 == 0) goto L_0x007a;
    L_0x0077:
        r4.setImageUriAsync(r0);
    L_0x007a:
        r0 = "DEGREES_ROTATED";
        r0 = r5.getInt(r0);
        r4.f7427b = r0;
        r0 = r4.f7426a;
        r1 = "INITIAL_CROP_RECT";
        r1 = r5.getParcelable(r1);
        r1 = (android.graphics.Rect) r1;
        r0.setInitialCropWindowRect(r1);
        r0 = "CROP_WINDOW_RECT";
        r0 = r5.getParcelable(r0);
        r0 = (android.graphics.RectF) r0;
        r4.f7425B = r0;
        r0 = r4.f7426a;
        r1 = "CROP_SHAPE";
        r1 = r5.getString(r1);
        r1 = com.theartofdev.edmodo.cropper.CropImageView.C2245a.valueOf(r1);
        r0.setCropShape(r1);
        r0 = "CROP_AUTO_ZOOM_ENABLED";
        r0 = r5.getBoolean(r0);
        r4.f7448w = r0;
        r0 = "CROP_MAX_ZOOM";
        r0 = r5.getInt(r0);
        r4.f7449x = r0;
        r0 = "instanceState";
        r5 = r5.getParcelable(r0);
        super.onRestoreInstanceState(r5);
        return;
    L_0x00c2:
        super.onRestoreInstanceState(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", this.f7431f);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f7444s);
        if (this.f7431f == null && this.f7444s <= 0) {
            bundle.putParcelable("SET_BITMAP", this.f7441p);
        }
        if (!(this.f7431f == null || this.f7441p == null)) {
            String uuid = UUID.randomUUID().toString();
            C2258c.f7515e = new Pair(uuid, new WeakReference(this.f7441p));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        if (this.f7433h != null) {
            C2255b c2255b = (C2255b) this.f7433h.get();
            if (c2255b != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", c2255b.f7502a);
            }
        }
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f7432g);
        bundle.putInt("DEGREES_ROTATED", this.f7427b);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f7426a.getInitialCropWindowRect());
        C2258c.f7513c.set(this.f7426a.getCropWindowRect());
        this.f7436k.invert(this.f7437l);
        this.f7437l.mapRect(C2258c.f7513c);
        bundle.putParcelable("CROP_WINDOW_RECT", C2258c.f7513c);
        bundle.putString("CROP_SHAPE", this.f7426a.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f7448w);
        bundle.putInt("CROP_MAX_ZOOM", this.f7449x);
        return bundle;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f7448w != z) {
            this.f7448w = z;
            m6135a(false, false);
            this.f7426a.invalidate();
        }
    }

    final void setBitmap$1fdc9e65(Bitmap bitmap) {
        if (this.f7441p == null || !this.f7441p.equals(bitmap)) {
            this.f7435j.clearAnimation();
            m6136b();
            this.f7441p = bitmap;
            this.f7435j.setImageBitmap(this.f7441p);
            m6132a((float) getWidth(), (float) getHeight(), true, false);
            if (this.f7426a != null) {
                this.f7426a.m6146a();
                m6138c();
            }
        }
    }

    public void setCropRect(Rect rect) {
        this.f7426a.setInitialCropWindowRect(rect);
    }

    public void setCropShape(C2245a c2245a) {
        this.f7426a.setCropShape(c2245a);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f7426a.setFixedAspectRatio(z);
    }

    public void setGuidelines(C2246b c2246b) {
        this.f7426a.setGuidelines(c2246b);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f7426a.setInitialCropWindowRect(null);
        setBitmap$1fdc9e65(bitmap);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f7426a.setInitialCropWindowRect(null);
            setBitmap$1fdc9e65(BitmapFactory.decodeResource(getResources(), i));
            this.f7444s = i;
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            C2255b c2255b = this.f7433h != null ? (C2255b) this.f7433h.get() : null;
            if (c2255b != null) {
                c2255b.cancel(true);
            }
            m6136b();
            this.f7426a.setInitialCropWindowRect(null);
            this.f7433h = new WeakReference(new C2255b(this, uri));
            ((C2255b) this.f7433h.get()).execute(new Void[0]);
            m6139a();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f7449x != i && i > 0) {
            this.f7449x = i;
            m6135a(false, false);
            this.f7426a.invalidate();
        }
    }

    public void setOnGetCroppedImageCompleteListener(C2247c c2247c) {
        this.f7429d = c2247c != null ? new WeakReference(c2247c) : null;
    }

    public void setOnSaveCroppedImageCompleteListener(C2248d c2248d) {
        this.f7430e = c2248d != null ? new WeakReference(c2248d) : null;
    }

    public void setOnSetImageUriCompleteListener(C2249e c2249e) {
        this.f7428c = c2249e != null ? new WeakReference(c2249e) : null;
    }

    public void setRotatedDegrees(int i) {
        if (this.f7427b != i) {
            m6140a(i - this.f7427b);
        }
    }

    public void setScaleType(C2250f c2250f) {
        if (c2250f != this.f7445t) {
            this.f7445t = c2250f;
            this.f7450y = BallPulseIndicator.SCALE;
            this.f7424A = 0.0f;
            this.f7451z = 0.0f;
            this.f7426a.m6146a();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f7446u != z) {
            this.f7446u = z;
            m6138c();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f7447v != z) {
            this.f7447v = z;
            m6139a();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f7426a.setSnapRadius(f);
        }
    }
}
