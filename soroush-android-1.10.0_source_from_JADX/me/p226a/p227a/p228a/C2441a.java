package me.p226a.p227a.p228a;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import me.p226a.p227a.p228a.C2454h.C2452a;
import me.p226a.p227a.p228a.C2454h.C2453b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C2441a extends FrameLayout implements PreviewCallback {
    public C2447c f8104a;
    public C2444b f8105b;
    private C2449e f8106c;
    private C2451g f8107d;
    private Rect f8108e;
    private Boolean f8109f;
    private boolean f8110g = true;
    private boolean f8111h = true;
    private boolean f8112i = true;
    private int f8113j = getResources().getColor(C2452a.viewfinder_laser);
    private int f8114k = getResources().getColor(C2452a.viewfinder_border);
    private int f8115l = getResources().getColor(C2452a.viewfinder_mask);
    private int f8116m = getResources().getInteger(C2453b.viewfinder_border_width);
    private int f8117n = getResources().getInteger(C2453b.viewfinder_border_length);
    private boolean f8118o = false;
    private int f8119p = 0;
    private boolean f8120q = false;
    private float f8121r = BallPulseIndicator.SCALE;
    private int f8122s = 0;
    private float f8123t = 0.1f;

    public C2441a(Context context) {
        super(context);
        C2451g c5752i = new C5752i(getContext());
        c5752i.setBorderColor(this.f8114k);
        c5752i.setLaserColor(this.f8113j);
        c5752i.setLaserEnabled(this.f8112i);
        c5752i.setBorderStrokeWidth(this.f8116m);
        c5752i.setBorderLineLength(this.f8117n);
        c5752i.setMaskColor(this.f8115l);
        c5752i.setBorderCornerRounded(this.f8118o);
        c5752i.setBorderCornerRadius(this.f8119p);
        c5752i.setSquareViewFinder(this.f8120q);
        c5752i.setViewFinderOffset(this.f8122s);
        this.f8107d = c5752i;
    }

    public final synchronized Rect m6669a(int i, int i2) {
        if (this.f8108e == null) {
            Rect framingRect = this.f8107d.getFramingRect();
            int width = this.f8107d.getWidth();
            int height = this.f8107d.getHeight();
            if (!(framingRect == null || width == 0)) {
                if (height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i < width) {
                        rect.left = (rect.left * i) / width;
                        rect.right = (rect.right * i) / width;
                    }
                    if (i2 < height) {
                        rect.top = (rect.top * i2) / height;
                        rect.bottom = (rect.bottom * i2) / height;
                    }
                    this.f8108e = rect;
                }
            }
            return null;
        }
        return this.f8108e;
    }

    public final void m6670a() {
        if (this.f8106c != null) {
            this.f8104a.m6682c();
            this.f8104a.m6680a(null, null);
            this.f8106c.f8141a.release();
            this.f8106c = null;
        }
        if (this.f8105b != null) {
            this.f8105b.quit();
            this.f8105b = null;
        }
    }

    public boolean getFlash() {
        return this.f8106c != null && C2448d.m6684a(this.f8106c.f8141a) && this.f8106c.f8141a.getParameters().getFlashMode().equals("torch");
    }

    public int getRotationCount() {
        return this.f8104a.getDisplayOrientation() / 90;
    }

    public void setAspectTolerance(float f) {
        this.f8123t = f;
    }

    public void setAutoFocus(boolean z) {
        this.f8110g = z;
        if (this.f8104a != null) {
            this.f8104a.setAutoFocus(z);
        }
    }

    public void setBorderAlpha(float f) {
        this.f8121r = f;
        this.f8107d.setBorderAlpha(this.f8121r);
        this.f8107d.mo2122a();
    }

    public void setBorderColor(int i) {
        this.f8114k = i;
        this.f8107d.setBorderColor(this.f8114k);
        this.f8107d.mo2122a();
    }

    public void setBorderCornerRadius(int i) {
        this.f8119p = i;
        this.f8107d.setBorderCornerRadius(this.f8119p);
        this.f8107d.mo2122a();
    }

    public void setBorderLineLength(int i) {
        this.f8117n = i;
        this.f8107d.setBorderLineLength(this.f8117n);
        this.f8107d.mo2122a();
    }

    public void setBorderStrokeWidth(int i) {
        this.f8116m = i;
        this.f8107d.setBorderStrokeWidth(this.f8116m);
        this.f8107d.mo2122a();
    }

    public void setFlash(boolean z) {
        this.f8109f = Boolean.valueOf(z);
        if (this.f8106c != null && C2448d.m6684a(this.f8106c.f8141a)) {
            String str;
            Parameters parameters = this.f8106c.f8141a.getParameters();
            if (z) {
                if (!parameters.getFlashMode().equals("torch")) {
                    str = "torch";
                } else {
                    return;
                }
            } else if (!parameters.getFlashMode().equals("off")) {
                str = "off";
            } else {
                return;
            }
            parameters.setFlashMode(str);
            this.f8106c.f8141a.setParameters(parameters);
        }
    }

    public void setIsBorderCornerRounded(boolean z) {
        this.f8118o = z;
        this.f8107d.setBorderCornerRounded(this.f8118o);
        this.f8107d.mo2122a();
    }

    public void setLaserColor(int i) {
        this.f8113j = i;
        this.f8107d.setLaserColor(this.f8113j);
        this.f8107d.mo2122a();
    }

    public void setLaserEnabled(boolean z) {
        this.f8112i = z;
        this.f8107d.setLaserEnabled(this.f8112i);
        this.f8107d.mo2122a();
    }

    public void setMaskColor(int i) {
        this.f8115l = i;
        this.f8107d.setMaskColor(this.f8115l);
        this.f8107d.mo2122a();
    }

    public void setShouldScaleToFill(boolean z) {
        this.f8111h = z;
    }

    public void setSquareViewFinder(boolean z) {
        this.f8120q = z;
        this.f8107d.setSquareViewFinder(this.f8120q);
        this.f8107d.mo2122a();
    }

    public void setupCameraPreview(C2449e c2449e) {
        this.f8106c = c2449e;
        if (this.f8106c != null) {
            setupLayout(this.f8106c);
            this.f8107d.mo2122a();
            if (this.f8109f != null) {
                setFlash(this.f8109f.booleanValue());
            }
            setAutoFocus(this.f8110g);
        }
    }

    public final void setupLayout(C2449e c2449e) {
        View view;
        removeAllViews();
        this.f8104a = new C2447c(getContext(), c2449e, this);
        this.f8104a.setAspectTolerance(this.f8123t);
        this.f8104a.setShouldScaleToFill(this.f8111h);
        if (this.f8111h) {
            view = this.f8104a;
        } else {
            view = new RelativeLayout(getContext());
            view.setGravity(17);
            view.setBackgroundColor(-16777216);
            view.addView(this.f8104a);
        }
        addView(view);
        if (this.f8107d instanceof View) {
            addView((View) this.f8107d);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }
}
