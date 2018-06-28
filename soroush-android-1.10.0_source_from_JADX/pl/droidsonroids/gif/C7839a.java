package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.MediaController.MediaPlayerControl;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.p615a.C7838a;

public final class C7839a extends Drawable implements Animatable, MediaPlayerControl {
    final ScheduledThreadPoolExecutor f24885a;
    volatile boolean f24886b;
    long f24887c;
    protected final Paint f24888d;
    final Bitmap f24889e;
    final GifInfoHandle f24890f;
    final ConcurrentLinkedQueue<Object> f24891g;
    final boolean f24892h;
    final C7845e f24893i;
    ScheduledFuture<?> f24894j;
    private final Rect f24895k;
    private ColorStateList f24896l;
    private PorterDuffColorFilter f24897m;
    private Mode f24898n;
    private final C7976i f24899o;
    private final Rect f24900p;
    private int f24901q;
    private int f24902r;
    private C7838a f24903s;

    public C7839a(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.m22103a(contentResolver, uri));
    }

    private C7839a(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    public C7839a(Resources resources, int i) {
        this(resources.openRawResourceFd(i));
        float a = C7844d.m22130a(resources, i);
        this.f24902r = (int) (((float) this.f24890f.m22120m()) * a);
        this.f24901q = (int) (((float) this.f24890f.m22119l()) * a);
    }

    public C7839a(String str) {
        this(new GifInfoHandle(str));
    }

    private C7839a(GifInfoHandle gifInfoHandle) {
        this.f24886b = true;
        this.f24887c = Long.MIN_VALUE;
        this.f24895k = new Rect();
        this.f24888d = new Paint(6);
        this.f24891g = new ConcurrentLinkedQueue();
        this.f24899o = new C7976i(this);
        this.f24892h = true;
        this.f24885a = C7842c.m22129a();
        this.f24890f = gifInfoHandle;
        this.f24889e = Bitmap.createBitmap(this.f24890f.m22119l(), this.f24890f.m22120m(), Config.ARGB_8888);
        if (VERSION.SDK_INT >= 12) {
            this.f24889e.setHasAlpha(gifInfoHandle.m22122o() ^ true);
        }
        this.f24900p = new Rect(0, 0, this.f24890f.m22119l(), this.f24890f.m22120m());
        this.f24893i = new C7845e(this);
        this.f24899o.mo4806a();
        this.f24901q = this.f24890f.m22119l();
        this.f24902r = this.f24890f.m22120m();
    }

    private PorterDuffColorFilter m22124a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    private void m22125a() {
        if (this.f24894j != null) {
            this.f24894j.cancel(false);
        }
        this.f24893i.removeMessages(-1);
    }

    final void m22126a(long j) {
        if (this.f24892h) {
            this.f24887c = 0;
            this.f24893i.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        m22125a();
        this.f24894j = this.f24885a.schedule(this.f24899o, Math.max(j, 0), TimeUnit.MILLISECONDS);
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return this.f24890f.m22121n() > 1;
    }

    public final boolean canSeekForward() {
        return this.f24890f.m22121n() > 1;
    }

    public final void draw(Canvas canvas) {
        Object obj;
        if (this.f24897m == null || this.f24888d.getColorFilter() != null) {
            obj = null;
        } else {
            this.f24888d.setColorFilter(this.f24897m);
            obj = 1;
        }
        if (this.f24903s == null) {
            canvas.drawBitmap(this.f24889e, this.f24900p, this.f24895k, this.f24888d);
        }
        if (obj != null) {
            this.f24888d.setColorFilter(null);
        }
        if (this.f24892h && this.f24886b && this.f24887c != Long.MIN_VALUE) {
            long max = Math.max(0, this.f24887c - SystemClock.uptimeMillis());
            this.f24887c = Long.MIN_VALUE;
            this.f24885a.remove(this.f24899o);
            this.f24894j = this.f24885a.schedule(this.f24899o, max, TimeUnit.MILLISECONDS);
        }
    }

    public final int getAlpha() {
        return this.f24888d.getAlpha();
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 100;
    }

    public final ColorFilter getColorFilter() {
        return this.f24888d.getColorFilter();
    }

    public final int getCurrentPosition() {
        return this.f24890f.m22114g();
    }

    public final int getDuration() {
        return this.f24890f.m22113f();
    }

    public final int getIntrinsicHeight() {
        return this.f24902r;
    }

    public final int getIntrinsicWidth() {
        return this.f24901q;
    }

    public final int getOpacity() {
        if (this.f24890f.m22122o()) {
            if (this.f24888d.getAlpha() >= 255) {
                return -1;
            }
        }
        return -2;
    }

    public final boolean isPlaying() {
        return this.f24886b;
    }

    public final boolean isRunning() {
        return this.f24886b;
    }

    public final boolean isStateful() {
        if (!super.isStateful()) {
            if (this.f24896l == null || !this.f24896l.isStateful()) {
                return false;
            }
        }
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        this.f24895k.set(rect);
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.f24896l == null || this.f24898n == null) {
            return false;
        }
        this.f24897m = m22124a(this.f24896l, this.f24898n);
        return true;
    }

    public final void pause() {
        stop();
    }

    public final void seekTo(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f24885a.execute(new C7851j(this, this) {
            final /* synthetic */ C7839a f24968b;

            public final void mo4806a() {
                this.f24968b.f24890f.m22108a(i, this.f24968b.f24889e);
                this.c.f24893i.sendEmptyMessageAtTime(-1, 0);
            }
        });
    }

    public final void setAlpha(int i) {
        this.f24888d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24888d.setColorFilter(colorFilter);
    }

    @Deprecated
    public final void setDither(boolean z) {
        this.f24888d.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f24888d.setFilterBitmap(z);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f24896l = colorStateList;
        this.f24897m = m22124a(colorStateList, this.f24898n);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f24898n = mode;
        this.f24897m = m22124a(this.f24896l, mode);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f24892h) {
            if (z) {
                if (z2) {
                    this.f24885a.execute(new C7851j(this, this) {
                        final /* synthetic */ C7839a f24966a;

                        public final void mo4806a() {
                            if (this.f24966a.f24890f.m22109b()) {
                                this.f24966a.start();
                            }
                        }
                    });
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    public final void start() {
        synchronized (this) {
            if (this.f24886b) {
                return;
            }
            this.f24886b = true;
            m22126a(this.f24890f.m22106a());
        }
    }

    public final void stop() {
        synchronized (this) {
            if (this.f24886b) {
                this.f24886b = false;
                m22125a();
                this.f24890f.m22110c();
                return;
            }
        }
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", new Object[]{Integer.valueOf(this.f24890f.m22119l()), Integer.valueOf(this.f24890f.m22120m()), Integer.valueOf(this.f24890f.m22121n()), Integer.valueOf(this.f24890f.m22112e())});
    }
}
