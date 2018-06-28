package me.p226a.p227a.p228a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

public final class C2447c extends SurfaceView implements Callback {
    AutoFocusCallback f8131a = new C24462(this);
    private C2449e f8132b;
    private Handler f8133c;
    private boolean f8134d = true;
    private boolean f8135e = true;
    private boolean f8136f = false;
    private boolean f8137g = true;
    private PreviewCallback f8138h;
    private float f8139i = 0.1f;
    private Runnable f8140j = new C24451(this);

    class C24451 implements Runnable {
        final /* synthetic */ C2447c f8129a;

        C24451(C2447c c2447c) {
            this.f8129a = c2447c;
        }

        public final void run() {
            if (this.f8129a.f8132b != null && this.f8129a.f8134d && this.f8129a.f8135e && this.f8129a.f8136f) {
                this.f8129a.m6681b();
            }
        }
    }

    class C24462 implements AutoFocusCallback {
        final /* synthetic */ C2447c f8130a;

        C24462(C2447c c2447c) {
            this.f8130a = c2447c;
        }

        public final void onAutoFocus(boolean z, Camera camera) {
            this.f8130a.m6676d();
        }
    }

    public C2447c(Context context, C2449e c2449e, PreviewCallback previewCallback) {
        super(context);
        m6680a(c2449e, previewCallback);
        this.f8133c = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    private void m6673a(int i, int i2) {
        LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (this.f8137g) {
            float f = (float) i;
            float width = ((float) ((View) getParent()).getWidth()) / f;
            float f2 = (float) i2;
            float height = ((float) ((View) getParent()).getHeight()) / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    private void m6676d() {
        this.f8133c.postDelayed(this.f8140j, 1000);
    }

    private Size getOptimalPreviewSize() {
        Size size = null;
        if (this.f8132b == null) {
            return null;
        }
        List<Size> supportedPreviewSizes = r0.f8132b.f8141a.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (C2450f.m6685a(getContext()) == 1) {
            int i = height;
            height = width;
            width = i;
        }
        double d = ((double) width) / ((double) height);
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Size size2 : supportedPreviewSizes) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= ((double) r0.f8139i) && ((double) Math.abs(size2.height - height)) < r9) {
                d3 = (double) Math.abs(size2.height - height);
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : supportedPreviewSizes) {
                if (((double) Math.abs(size3.height - height)) < d2) {
                    size = size3;
                    d2 = (double) Math.abs(size3.height - height);
                }
            }
        }
        return size;
    }

    public final void m6679a() {
        if (this.f8132b != null) {
            try {
                getHolder().addCallback(this);
                this.f8134d = true;
                Size optimalPreviewSize = getOptimalPreviewSize();
                Parameters parameters = this.f8132b.f8141a.getParameters();
                parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
                this.f8132b.f8141a.setParameters(parameters);
                Point point = new Point(getWidth(), getHeight());
                if (getDisplayOrientation() % 180 != 0) {
                    point = new Point(point.y, point.x);
                }
                float f = ((float) optimalPreviewSize.width) / ((float) optimalPreviewSize.height);
                if (((float) point.x) / ((float) point.y) > f) {
                    m6673a((int) (((float) point.y) * f), point.y);
                } else {
                    m6673a(point.x, (int) (((float) point.x) / f));
                }
                this.f8132b.f8141a.setPreviewDisplay(getHolder());
                this.f8132b.f8141a.setDisplayOrientation(getDisplayOrientation());
                this.f8132b.f8141a.setOneShotPreviewCallback(this.f8138h);
                this.f8132b.f8141a.startPreview();
                if (this.f8135e) {
                    if (this.f8136f) {
                        m6681b();
                        return;
                    }
                    m6676d();
                }
            } catch (Throwable e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    public final void m6680a(C2449e c2449e, PreviewCallback previewCallback) {
        this.f8132b = c2449e;
        this.f8138h = previewCallback;
    }

    public final void m6681b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f8132b;	 Catch:{ RuntimeException -> 0x000a }
        r0 = r0.f8141a;	 Catch:{ RuntimeException -> 0x000a }
        r1 = r2.f8131a;	 Catch:{ RuntimeException -> 0x000a }
        r0.autoFocus(r1);	 Catch:{ RuntimeException -> 0x000a }
        return;
    L_0x000a:
        r2.m6676d();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a.a.c.b():void");
    }

    public final void m6682c() {
        if (this.f8132b != null) {
            try {
                this.f8134d = false;
                getHolder().removeCallback(this);
                this.f8132b.f8141a.cancelAutoFocus();
                this.f8132b.f8141a.setOneShotPreviewCallback(null);
                this.f8132b.f8141a.stopPreview();
            } catch (Throwable e) {
                Log.e("CameraPreview", e.toString(), e);
            }
        }
    }

    public final int getDisplayOrientation() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0052 in {2, 5, 6, 9, 10, 11, 12, 15, 17, 18} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r4.f8132b;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = new android.hardware.Camera$CameraInfo;
        r0.<init>();
        r2 = r4.f8132b;
        r2 = r2.f8142b;
        r3 = -1;
        if (r2 != r3) goto L_0x0016;
    L_0x0012:
        android.hardware.Camera.getCameraInfo(r1, r0);
        goto L_0x001d;
    L_0x0016:
        r2 = r4.f8132b;
        r2 = r2.f8142b;
        android.hardware.Camera.getCameraInfo(r2, r0);
    L_0x001d:
        r2 = r4.getContext();
        r3 = "window";
        r2 = r2.getSystemService(r3);
        r2 = (android.view.WindowManager) r2;
        r2 = r2.getDefaultDisplay();
        r2 = r2.getRotation();
        switch(r2) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003b;
            case 2: goto L_0x0038;
            case 3: goto L_0x0035;
            default: goto L_0x0034;
        };
    L_0x0034:
        goto L_0x003d;
    L_0x0035:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x003d;
    L_0x0038:
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x003d;
    L_0x003b:
        r1 = 90;
    L_0x003d:
        r2 = r0.facing;
        r3 = 1;
        if (r2 != r3) goto L_0x004c;
    L_0x0042:
        r0 = r0.orientation;
        r0 = r0 + r1;
        r0 = r0 % 360;
        r0 = 360 - r0;
    L_0x0049:
        r0 = r0 % 360;
        return r0;
    L_0x004c:
        r0 = r0.orientation;
        r0 = r0 - r1;
        r0 = r0 + 360;
        goto L_0x0049;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a.a.c.getDisplayOrientation():int");
    }

    public final void setAspectTolerance(float f) {
        this.f8139i = f;
    }

    public final void setAutoFocus(boolean z) {
        if (this.f8132b != null && this.f8134d && z != this.f8135e) {
            this.f8135e = z;
            if (!this.f8135e) {
                Log.v("CameraPreview", "Cancelling autofocus");
                this.f8132b.f8141a.cancelAutoFocus();
            } else if (this.f8136f) {
                Log.v("CameraPreview", "Starting autofocus");
                m6681b();
            } else {
                m6676d();
            }
        }
    }

    public final void setShouldScaleToFill(boolean z) {
        this.f8137g = z;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() != null) {
            m6682c();
            m6679a();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f8136f = true;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f8136f = false;
        m6682c();
    }
}
