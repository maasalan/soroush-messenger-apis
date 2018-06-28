package mobi.mmdt.ott.view.components.mediacaption.p409a;

import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.util.Matrix;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.util.List;
import java.util.Locale;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.videocompressor.VideoCompressor;
import mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar;
import mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar.C3138c;
import mobi.mmdt.ott.view.components.mediacaption.a.d.AnonymousClass11;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7328d;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7328d.11.C31931;
import mobi.mmdt.ott.view.components.video.VideoTimelineView;
import mobi.mmdt.ott.view.components.video.VideoTimelineView.C3247a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.videoplayer.core.C4593a;
import mobi.mmdt.ott.view.videoplayer.core.VideoPlayerFrame;
import org.linphone.core.Privacy;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C7328d extends C7179a implements C4593a {
    public CheckBox f21116a;
    private String aA;
    private long aB = 0;
    private long aC = 0;
    private long aD = 0;
    private VideoPlayerFrame aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private int aI;
    private boolean aJ;
    private LinearLayout aK;
    private SurfaceTextureListener aL = new C32009(this);
    private Runnable aM = new Runnable(this) {
        final /* synthetic */ C7328d f9926a;

        class C31931 implements Runnable {
            final /* synthetic */ AnonymousClass11 f9925a;

            C31931(AnonymousClass11 anonymousClass11) {
                this.f9925a = anonymousClass11;
            }

            public final void run() {
                if (this.f9925a.f9926a.aE != null && this.f9925a.f9926a.aE.m14722b()) {
                    float leftProgress = this.f9925a.f9926a.f21117b.getLeftProgress() * this.f9925a.f9926a.af;
                    float rightProgress = this.f9925a.f9926a.f21117b.getRightProgress() * this.f9925a.f9926a.af;
                    if (leftProgress == rightProgress) {
                        leftProgress = rightProgress - 0.01f;
                    }
                    float currentPosition = (((float) this.f9925a.f9926a.aE.getCurrentPosition()) - leftProgress) / (rightProgress - leftProgress);
                    float leftProgress2 = this.f9925a.f9926a.f21117b.getLeftProgress() + ((this.f9925a.f9926a.f21117b.getRightProgress() - this.f9925a.f9926a.f21117b.getLeftProgress()) * currentPosition);
                    if (leftProgress2 > this.f9925a.f9926a.ay) {
                        if (!this.f9925a.f9926a.f21118c.f9733a) {
                            this.f9925a.f9926a.f21118c.setFloatProgress(leftProgress2);
                        }
                        this.f9925a.f9926a.ay = leftProgress2;
                    }
                    if (((float) this.f9925a.f9926a.aE.getCurrentPosition()) >= rightProgress) {
                        try {
                            this.f9925a.f9926a.aE.m14724d();
                            C7328d.m19631t(this.f9925a.f9926a);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        {
            this.f9926a = r1;
        }

        public final void run() {
            while (true) {
                synchronized (this.f9926a.ax) {
                    Object obj = null;
                    try {
                        if (this.f9926a.aE != null && this.f9926a.aE.m14722b()) {
                            obj = 1;
                        }
                    } catch (Throwable e) {
                        C2480b.m6737b("Exception in set player surface video", e);
                    }
                }
                if (obj != null) {
                    this.f9926a.m8911k().runOnUiThread(new C31931(this));
                    try {
                        Thread.sleep(50);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    synchronized (this.f9926a.ax) {
                        this.f9926a.aw = null;
                    }
                    return;
                }
            }
        }
    };
    public int ae = 0;
    public float af = 0.0f;
    public long ag = 0;
    public long ah = 0;
    public int ai = 0;
    public long aj = 0;
    private C3201a al;
    private View am;
    private EditText an;
    private TextView ao;
    private TextView ap;
    private TextView aq;
    private TextView ar;
    private TextureView as;
    private ImageButton at;
    private FrameLayout au;
    private LinearLayout av;
    private Thread aw = null;
    private final Object ax = new Object();
    private float ay = 0.0f;
    private boolean az = false;
    public VideoTimelineView f21117b;
    public DiscreteSeekBar f21118c;
    public int f21119d = 0;
    public int f21120e = 0;
    public int f21121f = 0;
    public int f21122g = 0;
    public int f21123h = 0;
    public int f21124i = 0;

    class C31942 implements Runnable {
        final /* synthetic */ C7328d f9927a;

        C31942(C7328d c7328d) {
            this.f9927a = c7328d;
        }

        public final void run() {
            this.f9927a.f21118c.setVideoDuration(this.f9927a.af);
            this.f9927a.m19608V();
        }
    }

    class C31953 implements Runnable {
        final /* synthetic */ C7328d f9928a;

        C31953(C7328d c7328d) {
            this.f9928a = c7328d;
        }

        public final void run() {
            if (this.f9928a.aE.m14722b()) {
                this.f9928a.aE.m14724d();
            }
            C7328d.m19631t(this.f9928a);
        }
    }

    class C31964 implements OnCheckedChangeListener {
        final /* synthetic */ C7328d f9929a;

        C31964(C7328d c7328d) {
            this.f9929a = c7328d;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9929a.m19608V();
        }
    }

    class C31975 implements OnClickListener {
        final /* synthetic */ C7328d f9930a;

        C31975(C7328d c7328d) {
            this.f9930a = c7328d;
        }

        public final void onClick(View view) {
            if (!this.f9930a.aJ) {
                C7328d.m19623l(this.f9930a);
            } else if (this.f9930a.aE.m14722b()) {
                this.f9930a.m19606T();
            } else {
                C7328d.m19622k(this.f9930a);
            }
        }
    }

    class C31986 implements OnClickListener {
        final /* synthetic */ C7328d f9931a;

        C31986(C7328d c7328d) {
            this.f9931a = c7328d;
        }

        public final void onClick(View view) {
            if (!this.f9931a.aJ) {
                C7328d.m19623l(this.f9931a);
            } else if (this.f9931a.aE.m14722b()) {
                this.f9931a.m19606T();
            } else {
                C7328d.m19622k(this.f9931a);
            }
        }
    }

    class C31998 implements Runnable {
        final /* synthetic */ C7328d f9932a;

        C31998(C7328d c7328d) {
            this.f9932a = c7328d;
        }

        public final void run() {
            int p;
            int o;
            float f;
            float f2;
            float f3;
            float f4;
            LayoutParams layoutParams;
            int width = this.f9932a.as.getWidth();
            int height = this.f9932a.as.getHeight();
            if (this.f9932a.f21119d != 90) {
                if (this.f9932a.f21119d != 270) {
                    p = this.f9932a.f21120e;
                    if (this.f9932a.f21119d != 90) {
                        if (this.f9932a.f21119d == 270) {
                            o = this.f9932a.f21121f;
                            f = (float) width;
                            f2 = (float) p;
                            f3 = (float) height;
                            f4 = (float) o;
                            f2 /= f4;
                            if (f / f2 <= f3 / f4) {
                                width = (int) (f3 * f2);
                            } else {
                                height = (int) (f / f2);
                            }
                            if (this.f9932a.as == null) {
                                layoutParams = (LayoutParams) this.f9932a.as.getLayoutParams();
                                layoutParams.width = width;
                                layoutParams.height = height;
                                layoutParams.leftMargin = 0;
                                layoutParams.topMargin = 0;
                                this.f9932a.as.setLayoutParams(layoutParams);
                            }
                        }
                    }
                    o = this.f9932a.f21120e;
                    f = (float) width;
                    f2 = (float) p;
                    f3 = (float) height;
                    f4 = (float) o;
                    f2 /= f4;
                    if (f / f2 <= f3 / f4) {
                        height = (int) (f / f2);
                    } else {
                        width = (int) (f3 * f2);
                    }
                    if (this.f9932a.as == null) {
                        layoutParams = (LayoutParams) this.f9932a.as.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = height;
                        layoutParams.leftMargin = 0;
                        layoutParams.topMargin = 0;
                        this.f9932a.as.setLayoutParams(layoutParams);
                    }
                }
            }
            p = this.f9932a.f21121f;
            if (this.f9932a.f21119d != 90) {
                if (this.f9932a.f21119d == 270) {
                    o = this.f9932a.f21121f;
                    f = (float) width;
                    f2 = (float) p;
                    f3 = (float) height;
                    f4 = (float) o;
                    f2 /= f4;
                    if (f / f2 <= f3 / f4) {
                        width = (int) (f3 * f2);
                    } else {
                        height = (int) (f / f2);
                    }
                    if (this.f9932a.as == null) {
                        layoutParams = (LayoutParams) this.f9932a.as.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = height;
                        layoutParams.leftMargin = 0;
                        layoutParams.topMargin = 0;
                        this.f9932a.as.setLayoutParams(layoutParams);
                    }
                }
            }
            o = this.f9932a.f21120e;
            f = (float) width;
            f2 = (float) p;
            f3 = (float) height;
            f4 = (float) o;
            f2 /= f4;
            if (f / f2 <= f3 / f4) {
                height = (int) (f / f2);
            } else {
                width = (int) (f3 * f2);
            }
            if (this.f9932a.as == null) {
                layoutParams = (LayoutParams) this.f9932a.as.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = height;
                layoutParams.leftMargin = 0;
                layoutParams.topMargin = 0;
                this.f9932a.as.setLayoutParams(layoutParams);
            }
        }
    }

    class C32009 implements SurfaceTextureListener {
        final /* synthetic */ C7328d f9933a;

        C32009(C7328d c7328d) {
            this.f9933a = c7328d;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C7328d.m19628q(this.f9933a);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return this.f9933a.aE == null ? true : true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public interface C3201a {
        void mo3655h();
    }

    class C60991 implements C3247a {
        final /* synthetic */ C7328d f16364a;

        C60991(C7328d c7328d) {
            this.f16364a = c7328d;
        }

        public final void mo2275a(float f) {
            if (this.f16364a.aE != null && this.f16364a.aH) {
                try {
                    if (this.f16364a.aE.m14722b()) {
                        this.f16364a.aE.m14724d();
                        this.f16364a.at.setVisibility(0);
                    }
                    this.f16364a.aE.setOnSeekCompleteListener(null);
                    this.f16364a.aE.m14721a((int) (this.f16364a.af * f));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f16364a.az = true;
                this.f16364a.f21118c.setFloatProgress(this.f16364a.f21117b.getLeftProgress());
                this.f16364a.m19608V();
            }
        }

        public final void mo2276b(float f) {
            if (this.f16364a.aE != null && this.f16364a.aH) {
                try {
                    if (this.f16364a.aE.m14722b()) {
                        this.f16364a.aE.m14724d();
                        this.f16364a.at.setVisibility(0);
                    }
                    this.f16364a.aE.setOnSeekCompleteListener(null);
                    this.f16364a.aE.m14721a((int) (this.f16364a.af * f));
                } catch (Throwable e) {
                    C2480b.m6737b("Exception in play video", e);
                }
                this.f16364a.az = true;
                if (this.f16364a.f21118c.getFloatProgress() > f) {
                    this.f16364a.f21118c.setFloatProgress(f);
                }
                this.f16364a.m19608V();
            }
        }
    }

    class C61007 implements C3138c {
        final /* synthetic */ C7328d f16365a;

        C61007(C7328d c7328d) {
            this.f16365a = c7328d;
        }

        public final void mo2277a(int i, boolean z) {
            if (z && this.f16365a.aE != null && this.f16365a.aH && !this.f16365a.aE.m14722b()) {
                float f = ((float) i) / 1000.0f;
                this.f16365a.aE.m14721a((int) (this.f16365a.af * f));
                this.f16365a.ay = f;
                this.f16365a.az = true;
            }
        }

        public final void mo2278a(DiscreteSeekBar discreteSeekBar) {
            float floatProgress = discreteSeekBar.getFloatProgress();
            if (this.f16365a.aE != null && this.f16365a.aH) {
                if (this.f16365a.aE.m14722b()) {
                    try {
                        this.f16365a.aE.m14721a((int) (this.f16365a.af * floatProgress));
                        this.f16365a.ay = floatProgress;
                        return;
                    } catch (Throwable e) {
                        C2480b.m6737b("Exception in play video", e);
                        return;
                    }
                }
                this.f16365a.ay = floatProgress;
                this.f16365a.az = true;
            }
        }
    }

    private void m19606T() {
        if (this.aE != null) {
            this.aG = false;
            this.at.setVisibility(0);
            if (this.aE.m14722b()) {
                this.aE.m14724d();
            }
        }
    }

    private boolean m19607U() {
        return this.f21116a != null && this.f21116a.isChecked();
    }

    private void m19608V() {
        int i;
        int i2;
        int i3;
        this.aj = (long) Math.ceil((double) ((this.f21117b.getRightProgress() - this.f21117b.getLeftProgress()) * this.af));
        if (m19607U()) {
            if (r0.f21119d != 90) {
                if (r0.f21119d != 270) {
                    i = r0.f21122g;
                    if (r0.f21119d != 90) {
                        if (r0.f21119d == 270) {
                            i2 = r0.f21123h;
                            i3 = (int) (((float) (r0.aB + r0.aC)) * (((float) r0.aj) / r0.af));
                            i3 += (i3 / Privacy.DEFAULT) * 16;
                        }
                    }
                    i2 = r0.f21122g;
                    i3 = (int) (((float) (r0.aB + r0.aC)) * (((float) r0.aj) / r0.af));
                    i3 += (i3 / Privacy.DEFAULT) * 16;
                }
            }
            i = r0.f21123h;
            if (r0.f21119d != 90) {
                if (r0.f21119d == 270) {
                    i2 = r0.f21123h;
                    i3 = (int) (((float) (r0.aB + r0.aC)) * (((float) r0.aj) / r0.af));
                    i3 += (i3 / Privacy.DEFAULT) * 16;
                }
            }
            i2 = r0.f21122g;
            i3 = (int) (((float) (r0.aB + r0.aC)) * (((float) r0.aj) / r0.af));
            i3 += (i3 / Privacy.DEFAULT) * 16;
        } else {
            if (r0.f21119d != 90) {
                if (r0.f21119d != 270) {
                    i = r0.f21120e;
                    if (r0.f21119d != 90) {
                        if (r0.f21119d == 270) {
                            i2 = r0.f21121f;
                            i3 = (int) (((float) r0.aD) * (((float) r0.aj) / r0.af));
                        }
                    }
                    i2 = r0.f21120e;
                    i3 = (int) (((float) r0.aD) * (((float) r0.aj) / r0.af));
                }
            }
            i = r0.f21121f;
            if (r0.f21119d != 90) {
                if (r0.f21119d == 270) {
                    i2 = r0.f21121f;
                    i3 = (int) (((float) r0.aD) * (((float) r0.aj) / r0.af));
                }
            }
            i2 = r0.f21120e;
            i3 = (int) (((float) r0.aD) * (((float) r0.aj) / r0.af));
        }
        r0.ai = i3;
        if (r0.f21117b.getLeftProgress() == 0.0f) {
            r0.ag = -1;
        } else {
            r0.ag = ((long) (r0.f21117b.getLeftProgress() * r0.af)) * 1000;
        }
        if (r0.f21117b.getRightProgress() == BallPulseIndicator.SCALE) {
            r0.ah = -1;
        } else {
            r0.ah = ((long) (r0.f21117b.getRightProgress() * r0.af)) * 1000;
        }
        TextView textView = r0.aq;
        String a = C4522p.m8236a(R.string.start_time);
        Object[] objArr = new Object[1];
        objArr[0] = C2491i.m6774a(m8911k(), r0.ag < 0 ? 0 : r0.ag / 1000, false);
        textView.setText(String.format(a, objArr));
        textView = r0.ar;
        a = C4522p.m8236a(R.string.end_time);
        objArr = new Object[1];
        objArr[0] = C2491i.m6774a(m8911k(), r0.ah < 0 ? (long) r0.af : r0.ah / 1000, false);
        textView.setText(String.format(a, objArr));
        int i4;
        StringBuilder stringBuilder;
        String format;
        if (m19607U()) {
            int i5;
            String format2;
            CharSequence spannableString;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(C4522p.m8236a(R.string.file_size));
            stringBuilder2.append(" ");
            String stringBuilder3 = stringBuilder2.toString();
            String a2 = C2491i.m6770a(m8911k(), (float) ((int) (((float) r0.aD) * (((float) r0.aj) / r0.af))));
            String a3 = C2491i.m6770a(m8911k(), (float) r0.ai);
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder3);
            stringBuilder4.append(a2);
            stringBuilder4.append("  ");
            stringBuilder4.append(a3);
            CharSequence spannableString2 = new SpannableString(stringBuilder4.toString());
            spannableString2.setSpan(new StrikethroughSpan(), stringBuilder3.length(), stringBuilder3.length() + a2.length(), 0);
            r0.ap.setText(spannableString2);
            if (r0.f21119d != 90) {
                i5 = 270;
                if (r0.f21119d != 270) {
                    i3 = r0.f21120e;
                    if (r0.f21119d != 90) {
                        if (r0.f21119d == i5) {
                            i4 = r0.f21121f;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(C4522p.m8236a(R.string.dimensions));
                            stringBuilder.append(" ");
                            a = stringBuilder.toString();
                            format2 = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
                            format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(a);
                            stringBuilder2.append(format2);
                            stringBuilder2.append("  ");
                            stringBuilder2.append(format);
                            spannableString = new SpannableString(stringBuilder2.toString());
                            spannableString.setSpan(new StrikethroughSpan(), a.length(), a.length() + format2.length(), 0);
                            r0.ao.setText(spannableString);
                            return;
                        }
                    }
                    i4 = r0.f21120e;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C4522p.m8236a(R.string.dimensions));
                    stringBuilder.append(" ");
                    a = stringBuilder.toString();
                    format2 = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
                    format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(a);
                    stringBuilder2.append(format2);
                    stringBuilder2.append("  ");
                    stringBuilder2.append(format);
                    spannableString = new SpannableString(stringBuilder2.toString());
                    spannableString.setSpan(new StrikethroughSpan(), a.length(), a.length() + format2.length(), 0);
                    r0.ao.setText(spannableString);
                    return;
                }
            } else {
                i5 = 270;
            }
            i3 = r0.f21121f;
            if (r0.f21119d != 90) {
                if (r0.f21119d == i5) {
                    i4 = r0.f21121f;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C4522p.m8236a(R.string.dimensions));
                    stringBuilder.append(" ");
                    a = stringBuilder.toString();
                    format2 = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
                    format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(a);
                    stringBuilder2.append(format2);
                    stringBuilder2.append("  ");
                    stringBuilder2.append(format);
                    spannableString = new SpannableString(stringBuilder2.toString());
                    spannableString.setSpan(new StrikethroughSpan(), a.length(), a.length() + format2.length(), 0);
                    r0.ao.setText(spannableString);
                    return;
                }
            }
            i4 = r0.f21120e;
            stringBuilder = new StringBuilder();
            stringBuilder.append(C4522p.m8236a(R.string.dimensions));
            stringBuilder.append(" ");
            a = stringBuilder.toString();
            format2 = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
            format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a);
            stringBuilder2.append(format2);
            stringBuilder2.append("  ");
            stringBuilder2.append(format);
            spannableString = new SpannableString(stringBuilder2.toString());
            spannableString.setSpan(new StrikethroughSpan(), a.length(), a.length() + format2.length(), 0);
            r0.ao.setText(spannableString);
            return;
        }
        StringBuilder stringBuilder5;
        StringBuilder stringBuilder6;
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(C4522p.m8236a(R.string.file_size));
        stringBuilder7.append(" ");
        format = stringBuilder7.toString();
        String a4 = C2491i.m6770a(m8911k(), (float) ((int) (((float) r0.aD) * (((float) r0.aj) / r0.af))));
        stringBuilder = new StringBuilder();
        stringBuilder.append(format);
        stringBuilder.append(a4);
        r0.ap.setText(new SpannableString(stringBuilder.toString()));
        if (r0.f21119d != 90) {
            i2 = 270;
            if (r0.f21119d != 270) {
                i = r0.f21120e;
                if (r0.f21119d != 90) {
                    if (r0.f21119d == i2) {
                        i4 = r0.f21121f;
                        stringBuilder5 = new StringBuilder();
                        stringBuilder5.append(C4522p.m8236a(R.string.dimensions));
                        stringBuilder5.append(" ");
                        a4 = stringBuilder5.toString();
                        format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i4)});
                        stringBuilder6 = new StringBuilder();
                        stringBuilder6.append(a4);
                        stringBuilder6.append(format);
                        r0.ao.setText(new SpannableString(stringBuilder6.toString()));
                    }
                }
                i4 = r0.f21120e;
                stringBuilder5 = new StringBuilder();
                stringBuilder5.append(C4522p.m8236a(R.string.dimensions));
                stringBuilder5.append(" ");
                a4 = stringBuilder5.toString();
                format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i4)});
                stringBuilder6 = new StringBuilder();
                stringBuilder6.append(a4);
                stringBuilder6.append(format);
                r0.ao.setText(new SpannableString(stringBuilder6.toString()));
            }
        } else {
            i2 = 270;
        }
        i = r0.f21121f;
        if (r0.f21119d != 90) {
            if (r0.f21119d == i2) {
                i4 = r0.f21121f;
                stringBuilder5 = new StringBuilder();
                stringBuilder5.append(C4522p.m8236a(R.string.dimensions));
                stringBuilder5.append(" ");
                a4 = stringBuilder5.toString();
                format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i4)});
                stringBuilder6 = new StringBuilder();
                stringBuilder6.append(a4);
                stringBuilder6.append(format);
                r0.ao.setText(new SpannableString(stringBuilder6.toString()));
            }
        }
        i4 = r0.f21120e;
        stringBuilder5 = new StringBuilder();
        stringBuilder5.append(C4522p.m8236a(R.string.dimensions));
        stringBuilder5.append(" ");
        a4 = stringBuilder5.toString();
        format = String.format(Locale.getDefault(), "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i4)});
        stringBuilder6 = new StringBuilder();
        stringBuilder6.append(a4);
        stringBuilder6.append(format);
        r0.ao.setText(new SpannableString(stringBuilder6.toString()));
    }

    private boolean m19609W() {
        long j;
        Exception exception;
        TrackHeaderBox trackHeaderBox;
        try {
            r1.aD = new File(this.aA).length();
            Container isoFile = new IsoFile(r1.aA);
            List<Box> paths = Path.getPaths(isoFile, "/moov/trak/");
            TrackHeaderBox trackHeaderBox2 = null;
            if (!(Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/mp4a/") != null)) {
                return false;
            }
            boolean z = Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/avc1/") != null;
            for (Box box : paths) {
                TrackBox trackBox = (TrackBox) box;
                long j2 = 0;
                try {
                    MediaBox mediaBox = trackBox.getMediaBox();
                    MediaHeaderBox mediaHeaderBox = mediaBox.getMediaHeaderBox();
                    long[] sampleSizes = mediaBox.getMediaInformationBox().getSampleTableBox().getSampleSizeBox().getSampleSizes();
                    int i = 0;
                    j = 0;
                    while (i < sampleSizes.length) {
                        try {
                            i++;
                            j += sampleSizes[i];
                        } catch (Exception e) {
                            exception = e;
                        }
                    }
                    r1.af = ((float) mediaHeaderBox.getDuration()) / ((float) mediaHeaderBox.getTimescale());
                    j2 = (long) ((int) (((float) (8 * j)) / r1.af));
                } catch (Exception e2) {
                    exception = e2;
                    j = 0;
                    exception.printStackTrace();
                    trackHeaderBox = trackBox.getTrackHeaderBox();
                    if (trackHeaderBox.getWidth() != 0.0d) {
                    }
                    r1.aB += j;
                }
                trackHeaderBox = trackBox.getTrackHeaderBox();
                if (trackHeaderBox.getWidth() != 0.0d || trackHeaderBox.getHeight() == 0.0d) {
                    r1.aB += j;
                } else {
                    int i2 = (int) ((j2 / 100000) * 100000);
                    r1.f21124i = i2;
                    r1.ae = i2;
                    if (r1.f21124i > 1000000) {
                        r1.f21124i = 1000000;
                    }
                    r1.aC += j;
                    trackHeaderBox2 = trackHeaderBox;
                }
            }
            if (trackHeaderBox2 == null) {
                return false;
            }
            Matrix matrix = trackHeaderBox2.getMatrix();
            if (matrix.equals(Matrix.ROTATE_90)) {
                r1.f21119d = 90;
            } else if (matrix.equals(Matrix.ROTATE_180)) {
                r1.f21119d = 180;
            } else if (matrix.equals(Matrix.ROTATE_270)) {
                r1.f21119d = 270;
            }
            int width = (int) trackHeaderBox2.getWidth();
            r1.f21120e = width;
            r1.f21122g = width;
            width = (int) trackHeaderBox2.getHeight();
            r1.f21121f = width;
            r1.f21123h = width;
            if (r1.f21122g >= 640 || r1.f21123h >= 640) {
                float f = 640.0f / ((float) (r1.f21122g > r1.f21123h ? r1.f21122g : r1.f21123h));
                r1.f21122g = (int) (((float) r1.f21122g) * f);
                r1.f21123h = (int) (((float) r1.f21123h) * f);
                if (r1.f21124i != 0) {
                    r1.f21124i = (int) (((float) r1.f21124i) * Math.max(0.8f, f));
                    r1.aC = (long) (((float) (r1.f21124i / 8)) * r1.af);
                }
            }
            if (!z || r1.f21122g == r1.f21120e || r1.f21123h == r1.f21121f) {
                return false;
            }
            r1.af *= 1000.0f;
            m8911k().runOnUiThread(new C31942(r1));
            return true;
        } catch (Throwable e3) {
            C2480b.m6737b("Exception in processing open video", e3);
            return false;
        }
    }

    public static C7328d m19611a(int i, String str, String str2, Bundle bundle) {
        C7328d c7328d = new C7328d();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ARG_SECTION_NUMBER", i);
        bundle2.putString("ARG_SECTION_PATH", str);
        bundle2.putString("ARG_SECTION_CAPTION", str2);
        bundle2.putBundle("ARG_SAVE_STATE_BUNDLE", bundle);
        c7328d.mo3059e(bundle2);
        return c7328d;
    }

    static /* synthetic */ void m19622k(C7328d c7328d) {
        if (c7328d.aE != null) {
            c7328d.aG = true;
            c7328d.aE.m14723c();
            c7328d.at.setVisibility(8);
        }
    }

    static /* synthetic */ void m19623l(C7328d c7328d) {
        if (c7328d.aE != null && c7328d.aH) {
            if (c7328d.aE.m14722b()) {
                c7328d.at.setVisibility(0);
                c7328d.aE.m14724d();
                c7328d.aG = false;
                return;
            }
            try {
                c7328d.aG = true;
                c7328d.at.setVisibility(4);
                c7328d.ay = 0.0f;
                c7328d.aE.setOnSeekCompleteListener(new OnSeekCompleteListener(c7328d) {
                    final /* synthetic */ C7328d f16363a;

                    {
                        this.f16363a = r1;
                    }

                    public final void onSeekComplete(IMediaPlayer iMediaPlayer) {
                        float leftProgress = this.f16363a.f21117b.getLeftProgress() * this.f16363a.af;
                        float rightProgress = this.f16363a.f21117b.getRightProgress() * this.f16363a.af;
                        if (leftProgress == rightProgress) {
                            leftProgress = rightProgress - 0.01f;
                        }
                        this.f16363a.ay = (((float) this.f16363a.aE.getCurrentPosition()) - leftProgress) / (rightProgress - leftProgress);
                        this.f16363a.ay = this.f16363a.f21117b.getLeftProgress() + ((this.f16363a.f21117b.getRightProgress() - this.f16363a.f21117b.getLeftProgress()) * this.f16363a.ay);
                        this.f16363a.f21118c.setFloatProgress(this.f16363a.ay);
                    }
                });
                if (c7328d.az) {
                    c7328d.aE.m14721a((int) (c7328d.af * c7328d.f21118c.getFloatProgress()));
                    c7328d.az = false;
                }
                c7328d.aE.m14723c();
                synchronized (c7328d.ax) {
                    if (c7328d.aw == null) {
                        c7328d.aw = new Thread(c7328d.aM);
                        c7328d.aw.start();
                    }
                }
            } catch (Throwable e) {
                C2480b.m6737b("Exception in play video", e);
            }
        }
    }

    static /* synthetic */ void m19628q(C7328d c7328d) {
        if (c7328d.as != null && c7328d.as.isAvailable() && c7328d.aE != null) {
            try {
                if (c7328d.aH) {
                    c7328d.aE.m14721a((int) (c7328d.f21117b.getLeftProgress() * c7328d.af));
                }
            } catch (Throwable e) {
                C2480b.m6737b("Exception in set player surface video", e);
            }
        }
    }

    static /* synthetic */ void m19631t(C7328d c7328d) {
        if (!(c7328d.f21118c == null || c7328d.f21117b == null)) {
            c7328d.f21118c.setFloatProgress(c7328d.f21117b.getLeftProgress());
        }
        try {
            if (!(c7328d.aE == null || c7328d.f21117b == null)) {
                c7328d.aE.m14721a((int) (c7328d.f21117b.getLeftProgress() * c7328d.af));
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in complete playing video", e);
        }
    }

    public final boolean mo3573O() {
        return false;
    }

    public final void mo3576P() {
        C2480b.m6736b("EasyVideoPlayer:onPreparing");
    }

    public final void mo3577Q() {
        C2480b.m6736b("EasyVideoPlayer:onPrepared");
        if (this.aI > 0) {
            this.aE.m14721a(this.aI);
        }
        this.aH = true;
        if (this.aG) {
            this.aE.m14723c();
        }
        if (this.f21117b != null && this.aE != null) {
            this.aE.m14721a((int) (this.f21117b.getLeftProgress() * this.af));
        }
    }

    public final void mo3578R() {
        if (!this.aF) {
            this.aG = false;
            this.aE.m14721a(0);
            new Handler().postDelayed(new C31953(this), 100);
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        this.am = layoutInflater.inflate(R.layout.fragment_caption_item_video, viewGroup, false);
        this.an = (EditText) this.am.findViewById(R.id.editText);
        this.f21116a = (CheckBox) this.am.findViewById(R.id.compression_checkBox);
        this.aK = (LinearLayout) this.am.findViewById(R.id.time_linear_layout);
        this.av = (LinearLayout) this.am.findViewById(R.id.video_trim_linearLayout);
        this.f21118c = (DiscreteSeekBar) this.am.findViewById(R.id.discreteSeekBar1);
        this.ao = (TextView) this.am.findViewById(R.id.video_dimensions_textView);
        this.ap = (TextView) this.am.findViewById(R.id.file_size_textView);
        this.aq = (TextView) this.am.findViewById(R.id.start_time_textView);
        this.ar = (TextView) this.am.findViewById(R.id.end_time_textView);
        this.at = (ImageButton) this.am.findViewById(R.id.action_imageView);
        this.au = (FrameLayout) this.am.findViewById(R.id.video_container_frameLayout);
        String string = this.f13204p.getString("ARG_SECTION_PATH");
        this.aA = string;
        this.aE = (VideoPlayerFrame) this.am.findViewById(R.id.video_view);
        this.aH = false;
        this.aE.setKeepScreenOn(true);
        this.aE.setCallback(this);
        this.aE.setSource(Uri.parse(this.aA));
        this.aE.setAutoPlay(false);
        this.aE.setClickable(false);
        this.aE.setBackgroundColor(-16777216);
        String str = null;
        if (VERSION.SDK_INT >= 23) {
            this.aE.setForeground(null);
        }
        for (int i = 0; i < this.aE.getChildCount(); i++) {
            View childAt = this.aE.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                ((FrameLayout) childAt).setForeground(null);
            }
        }
        this.aE.m14720a();
        this.aG = false;
        this.an.setFilters(new InputFilter[]{new LengthFilter(IjkMediaCodecInfo.RANK_MAX)});
        CharSequence string2 = this.f13204p.getString("ARG_SECTION_CAPTION");
        if (string2 != null) {
            this.an.setText(string2);
        } else {
            this.an.setText("");
        }
        this.as = (TextureView) this.am.findViewById(R.id.textureView1);
        this.as.setSurfaceTextureListener(this.aL);
        this.f21117b = (VideoTimelineView) this.am.findViewById(R.id.video_timeline_view);
        this.f21117b.setVideoPath(string);
        this.f21117b.setVideoTimelineViewListener(new C60991(this));
        this.f21116a.setOnCheckedChangeListener(new C31964(this));
        this.au.setOnClickListener(new C31975(this));
        this.at.setOnClickListener(new C31986(this));
        this.f21118c.setOnProgressChangeListener(new C61007(this));
        if (VERSION.SDK_INT < 18) {
            try {
                CheckBox checkBox;
                MediaCodecInfo selectCodec = VideoCompressor.selectCodec(VideoCompressor.MIME_TYPE);
                if (selectCodec == null) {
                    checkBox = this.f21116a;
                } else {
                    if (VERSION.SDK_INT >= 16) {
                        str = selectCodec.getName();
                    }
                    if (str != null && (str.equals("OMX.google.h264.encoder") || str.equals("OMX.ST.VFM.H264Enc") || str.equals("OMX.Exynos.avc.enc") || str.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER") || str.equals("OMX.MARVELL.VIDEO.H264ENCODER") || str.equals("OMX.k3.video.encoder.avc") || str.equals("OMX.TI.DUCATI1.VIDEO.H264E"))) {
                        checkBox = this.f21116a;
                    } else if (VideoCompressor.selectColorFormat(selectCodec, VideoCompressor.MIME_TYPE) == 0) {
                        checkBox = this.f21116a;
                    }
                }
                checkBox.setVisibility(8);
            } catch (Throwable e) {
                this.f21116a.setVisibility(8);
                C2480b.m6737b("Exception in play video", e);
            }
        }
        if (!m19609W()) {
            this.aJ = true;
            if (m8912l().getConfiguration().orientation == 1) {
                this.av.setVisibility(8);
            } else {
                this.f21117b.setVisibility(8);
                this.f21116a.setVisibility(8);
                this.f21116a.setChecked(false);
                this.f21118c.setVisibility(8);
                this.ao.setVisibility(8);
                this.ap.setVisibility(8);
                this.aq.setVisibility(8);
                this.ar.setVisibility(8);
            }
            m19608V();
        }
        Bundle bundle2 = this.f13204p.getBundle("ARG_SAVE_STATE_BUNDLE");
        if (bundle2 != null) {
            z = bundle2.getBoolean("isVideoCompress");
            this.f21117b.setProgressLeft(bundle2.getFloat("LeftProgress"));
            this.f21117b.setProgressRight(bundle2.getFloat("RightProgress"));
            this.f21118c.setFloatProgress(bundle2.getFloat("SeekBarProgress"));
            if (this.aE != null && this.aH) {
                float f = bundle2.getFloat("SeekBarProgress");
                this.aE.m14721a((int) (this.af * f));
                this.ay = f;
                this.az = true;
            }
            m19608V();
        } else {
            z = true;
        }
        if (!this.aJ) {
            this.f21116a.setChecked(z);
        }
        this.as.post(new C31998(this));
        C2491i.m6799a(this.f21116a, -1);
        C2491i.m6780a(-1, -1, this.an);
        this.an.getBackground().mutate().setColorFilter(-1, Mode.SRC_ATOP);
        return this.am;
    }

    public final void mo3057a(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.mo3057a(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.components.mediacaption.p409a.C7328d.C3201a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.al = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IVideoMediaCaptionItemFragmentInteractions";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediacaption.a.d.a(android.app.Activity):void");
    }

    public final void mo3579a(Exception exception) {
        this.aF = true;
        StringBuilder stringBuilder = new StringBuilder("EasyVideoPlayer:onError:");
        stringBuilder.append(exception.toString());
        C2480b.m6732a(stringBuilder.toString());
        Toast.makeText(MyApplication.m12952b(), R.string.cant_show_video, 0).show();
        this.al.mo3655h();
    }

    public final void mo3574a(String str) {
        if (this.an != null) {
            this.an.setText(str);
        }
    }

    public final void mo3575a(boolean z) {
    }

    public final void mo2481b() {
        super.mo2481b();
        if (this.aE != null && this.aE.m14722b()) {
            m19606T();
        }
    }

    public final void mo2482c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        super.mo2482c();
        r0 = r5.f21117b;
        r1 = 0;
        if (r0 == 0) goto L_0x0052;
    L_0x0008:
        r0 = r5.f21117b;
        r2 = mobi.mmdt.ott.view.components.video.VideoTimelineView.f9995d;
        monitor-enter(r2);
        r3 = r0.f9996a;	 Catch:{ Exception -> 0x001b }
        if (r3 == 0) goto L_0x0025;	 Catch:{ Exception -> 0x001b }
    L_0x0011:
        r3 = r0.f9996a;	 Catch:{ Exception -> 0x001b }
        r3.release();	 Catch:{ Exception -> 0x001b }
        r0.f9996a = r1;	 Catch:{ Exception -> 0x001b }
        goto L_0x0025;
    L_0x0019:
        r0 = move-exception;
        goto L_0x0050;
    L_0x001b:
        r3 = move-exception;
        r4 = "VideoTimeLineView";	 Catch:{ all -> 0x0019 }
        r3 = r3.getMessage();	 Catch:{ all -> 0x0019 }
        android.util.Log.e(r4, r3);	 Catch:{ all -> 0x0019 }
    L_0x0025:
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        r2 = r0.f9997b;
        r2 = r2.iterator();
    L_0x002c:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x003e;
    L_0x0032:
        r3 = r2.next();
        r3 = (android.graphics.Bitmap) r3;
        if (r3 == 0) goto L_0x002c;
    L_0x003a:
        r3.recycle();
        goto L_0x002c;
    L_0x003e:
        r2 = r0.f9997b;
        r2.clear();
        r2 = r0.f9998c;
        if (r2 == 0) goto L_0x0052;
    L_0x0047:
        r2 = r0.f9998c;
        r3 = 1;
        r2.cancel(r3);
        r0.f9998c = r1;
        goto L_0x0052;
    L_0x0050:
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        throw r0;
    L_0x0052:
        r0 = r5.aE;
        if (r0 == 0) goto L_0x006f;
    L_0x0056:
        r0 = r5.aE;	 Catch:{ Exception -> 0x0069 }
        r2 = r0.f17213a;	 Catch:{ Exception -> 0x0069 }
        if (r2 == 0) goto L_0x0061;
    L_0x005c:
        r0 = r0.f17213a;	 Catch:{ Throwable -> 0x0061 }
        r0.stop();	 Catch:{ Throwable -> 0x0061 }
    L_0x0061:
        r0 = r5.aE;	 Catch:{ Exception -> 0x0069 }
        r0.m14725e();	 Catch:{ Exception -> 0x0069 }
        r5.aE = r1;	 Catch:{ Exception -> 0x0069 }
        return;
    L_0x0069:
        r0 = move-exception;
        r1 = "Exception in stop video";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r1, r0);
    L_0x006f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediacaption.a.d.c():void");
    }

    public final void mo3580d(int i) {
    }

    public final String mo2533e() {
        return (this.an == null || this.an.getText() == null) ? null : this.an.getText().toString();
    }
}
