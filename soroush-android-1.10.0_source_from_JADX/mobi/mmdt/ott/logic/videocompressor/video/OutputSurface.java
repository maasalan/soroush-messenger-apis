package mobi.mmdt.ott.logic.videocompressor.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(16)
public class OutputSurface implements OnFrameAvailableListener {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private EGL10 mEGL;
    private EGLContext mEGLContext = null;
    private EGLDisplay mEGLDisplay = null;
    private EGLSurface mEGLSurface = null;
    private boolean mFrameAvailable;
    private final Object mFrameSyncObject = new Object();
    private int mHeight;
    private ByteBuffer mPixelBuf;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderer mTextureRender;
    private int mWidth;
    private int rotateRender = 0;

    public OutputSurface() {
        setup();
    }

    public OutputSurface(int i, int i2, int i3) {
        if (i > 0) {
            if (i2 > 0) {
                this.mWidth = i;
                this.mHeight = i2;
                this.rotateRender = i3;
                this.mPixelBuf = ByteBuffer.allocateDirect((this.mWidth * this.mHeight) * 4);
                this.mPixelBuf.order(ByteOrder.LITTLE_ENDIAN);
                eglSetup(i, i2);
                makeCurrent();
                setup();
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private void checkEglError(String str) {
        if (this.mEGL.eglGetError() != 12288) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private void eglSetup(int i, int i2) {
        this.mEGL = (EGL10) EGLContext.getEGL();
        this.mEGLDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.mEGLDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL10 display");
        } else if (this.mEGL.eglInitialize(this.mEGLDisplay, null)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.mEGL.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                checkEglError("eglCreateContext");
                if (this.mEGLContext == null) {
                    throw new RuntimeException("null context");
                }
                this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
                checkEglError("eglCreatePbufferSurface");
                if (this.mEGLSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                return;
            }
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        } else {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL10");
        }
    }

    private void setup() {
        this.mTextureRender = new TextureRenderer(this.rotateRender);
        this.mTextureRender.surfaceCreated();
        this.mSurfaceTexture = new SurfaceTexture(this.mTextureRender.getTextureId());
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    public void awaitNewImage() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r4.mFrameSyncObject;
        monitor-enter(r0);
    L_0x0003:
        r1 = r4.mFrameAvailable;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x000f;
    L_0x0007:
        r1 = r4.mFrameSyncObject;	 Catch:{ InterruptedException -> 0x0003 }
        r2 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;	 Catch:{ InterruptedException -> 0x0003 }
        r1.wait(r2);	 Catch:{ InterruptedException -> 0x0003 }
        goto L_0x0003;
    L_0x000f:
        r1 = 0;
        r4.mFrameAvailable = r1;	 Catch:{ all -> 0x0020 }
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        r0 = r4.mTextureRender;
        r1 = "before updateTexImage";
        r0.checkGlError(r1);
        r0 = r4.mSurfaceTexture;
        r0.updateTexImage();
        return;
    L_0x0020:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0020 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.videocompressor.video.OutputSurface.awaitNewImage():void");
    }

    public void changeFragmentShader(String str) {
        this.mTextureRender.changeFragmentShader(str);
    }

    public void drawImage(boolean z) {
        this.mTextureRender.drawFrame(this.mSurfaceTexture, z);
    }

    public ByteBuffer getFrame() {
        this.mPixelBuf.rewind();
        GLES20.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5121, this.mPixelBuf);
        return this.mPixelBuf;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public void makeCurrent() {
        if (this.mEGL == null) {
            throw new RuntimeException("not configured for makeCurrent");
        }
        checkEglError("before makeCurrent");
        if (!this.mEGL.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    public void release() {
        if (this.mEGL != null) {
            if (this.mEGL.eglGetCurrentContext().equals(this.mEGLContext)) {
                this.mEGL.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            }
            this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        }
        this.mSurface.release();
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mEGL = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }
}
