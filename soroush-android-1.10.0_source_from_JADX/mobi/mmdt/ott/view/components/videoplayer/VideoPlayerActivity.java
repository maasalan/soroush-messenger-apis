package mobi.mmdt.ott.view.components.videoplayer;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
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
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar;
import mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar.C3138c;
import mobi.mmdt.ott.view.components.p402d.C7576b;

public class VideoPlayerActivity extends C7576b {
    private int f24075A = 0;
    private int f24076B = 0;
    private int f24077C = 0;
    private int f24078D = 0;
    private int f24079E = 0;
    private int f24080F = 0;
    private float f24081G = 0.0f;
    private long f24082H = 0;
    private long f24083I = 0;
    private long f24084J = 0;
    private long f24085K = 0;
    private int f24086L = 0;
    private long f24087M = 0;
    private long f24088N = 0;
    private SurfaceTextureListener f24089O = new C32525(this);
    private Runnable f24090P = new C32557(this);
    private ViewGroup f24091m;
    private DiscreteSeekBar f24092n;
    private TextureView f24093o;
    private ProgressWheel f24094p;
    private MediaPlayer f24095q;
    private Thread f24096r = null;
    private final Object f24097s = new Object();
    private float f24098t = 0.0f;
    private boolean f24099u = false;
    private boolean f24100v = false;
    private String f24101w;
    private int f24102z = 0;

    class C32491 implements OnCompletionListener {
        final /* synthetic */ VideoPlayerActivity f10015a;

        class C32481 implements Runnable {
            final /* synthetic */ C32491 f10014a;

            C32481(C32491 c32491) {
                this.f10014a = c32491;
            }

            public final void run() {
                VideoPlayerActivity.m21175a(this.f10014a.f10015a);
            }
        }

        C32491(VideoPlayerActivity videoPlayerActivity) {
            this.f10015a = videoPlayerActivity;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            VideoPlayerActivity.m21176b(this.f10015a).runOnUiThread(new C32481(this));
        }
    }

    class C32502 implements OnPreparedListener {
        final /* synthetic */ VideoPlayerActivity f10016a;

        C32502(VideoPlayerActivity videoPlayerActivity) {
            this.f10016a = videoPlayerActivity;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f10016a.f24099u = true;
            this.f10016a.f24094p.setVisibility(8);
            if (this.f10016a.f24095q != null) {
                this.f10016a.f24095q.seekTo((int) (0.0f * this.f10016a.f24081G));
            }
        }
    }

    class C32514 implements Runnable {
        final /* synthetic */ VideoPlayerActivity f10017a;

        C32514(VideoPlayerActivity videoPlayerActivity) {
            this.f10017a = videoPlayerActivity;
        }

        public final void run() {
            int l;
            int k;
            float f;
            float f2;
            float f3;
            float f4;
            C0273d c0273d;
            int width = this.f10017a.f24093o.getWidth();
            int height = this.f10017a.f24093o.getHeight();
            if (this.f10017a.f24102z != 90) {
                if (this.f10017a.f24102z != 270) {
                    l = this.f10017a.f24075A;
                    if (this.f10017a.f24102z != 90) {
                        if (this.f10017a.f24102z == 270) {
                            k = this.f10017a.f24076B;
                            f = (float) width;
                            f2 = (float) l;
                            f3 = (float) height;
                            f4 = (float) k;
                            f2 /= f4;
                            if (f / f2 <= f3 / f4) {
                                width = (int) (f3 * f2);
                            } else {
                                height = (int) (f / f2);
                            }
                            if (this.f10017a.f24093o == null) {
                                c0273d = (C0273d) this.f10017a.f24093o.getLayoutParams();
                                c0273d.width = width;
                                c0273d.height = height;
                                c0273d.leftMargin = 0;
                                c0273d.topMargin = 0;
                                this.f10017a.f24093o.setLayoutParams(c0273d);
                            }
                        }
                    }
                    k = this.f10017a.f24075A;
                    f = (float) width;
                    f2 = (float) l;
                    f3 = (float) height;
                    f4 = (float) k;
                    f2 /= f4;
                    if (f / f2 <= f3 / f4) {
                        height = (int) (f / f2);
                    } else {
                        width = (int) (f3 * f2);
                    }
                    if (this.f10017a.f24093o == null) {
                        c0273d = (C0273d) this.f10017a.f24093o.getLayoutParams();
                        c0273d.width = width;
                        c0273d.height = height;
                        c0273d.leftMargin = 0;
                        c0273d.topMargin = 0;
                        this.f10017a.f24093o.setLayoutParams(c0273d);
                    }
                }
            }
            l = this.f10017a.f24076B;
            if (this.f10017a.f24102z != 90) {
                if (this.f10017a.f24102z == 270) {
                    k = this.f10017a.f24076B;
                    f = (float) width;
                    f2 = (float) l;
                    f3 = (float) height;
                    f4 = (float) k;
                    f2 /= f4;
                    if (f / f2 <= f3 / f4) {
                        width = (int) (f3 * f2);
                    } else {
                        height = (int) (f / f2);
                    }
                    if (this.f10017a.f24093o == null) {
                        c0273d = (C0273d) this.f10017a.f24093o.getLayoutParams();
                        c0273d.width = width;
                        c0273d.height = height;
                        c0273d.leftMargin = 0;
                        c0273d.topMargin = 0;
                        this.f10017a.f24093o.setLayoutParams(c0273d);
                    }
                }
            }
            k = this.f10017a.f24075A;
            f = (float) width;
            f2 = (float) l;
            f3 = (float) height;
            f4 = (float) k;
            f2 /= f4;
            if (f / f2 <= f3 / f4) {
                height = (int) (f / f2);
            } else {
                width = (int) (f3 * f2);
            }
            if (this.f10017a.f24093o == null) {
                c0273d = (C0273d) this.f10017a.f24093o.getLayoutParams();
                c0273d.width = width;
                c0273d.height = height;
                c0273d.leftMargin = 0;
                c0273d.topMargin = 0;
                this.f10017a.f24093o.setLayoutParams(c0273d);
            }
        }
    }

    class C32525 implements SurfaceTextureListener {
        final /* synthetic */ VideoPlayerActivity f10018a;

        C32525(VideoPlayerActivity videoPlayerActivity) {
            this.f10018a = videoPlayerActivity;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VideoPlayerActivity.m21188m(this.f10018a);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (this.f10018a.f24095q == null) {
                return true;
            }
            this.f10018a.f24095q.setDisplay(null);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class C32536 implements OnSeekCompleteListener {
        final /* synthetic */ VideoPlayerActivity f10019a;

        C32536(VideoPlayerActivity videoPlayerActivity) {
            this.f10019a = videoPlayerActivity;
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            float f = this.f10019a.f24081G;
            float f2 = 0.0f;
            if (0.0f == f) {
                f2 = f - 0.01f;
            }
            this.f10019a.f24098t = (((float) this.f10019a.f24095q.getCurrentPosition()) - f2) / (f - f2);
            this.f10019a.f24092n.setFloatProgress(this.f10019a.f24098t);
        }
    }

    class C32557 implements Runnable {
        final /* synthetic */ VideoPlayerActivity f10021a;

        class C32541 implements Runnable {
            final /* synthetic */ C32557 f10020a;

            C32541(C32557 c32557) {
                this.f10020a = c32557;
            }

            public final void run() {
                if (this.f10020a.f10021a.f24095q != null && this.f10020a.f10021a.f24095q.isPlaying()) {
                    float f = this.f10020a.f10021a.f24081G;
                    float f2 = 0.0f;
                    if (0.0f == f) {
                        f2 = f - 0.01f;
                    }
                    float currentPosition = (((float) this.f10020a.f10021a.f24095q.getCurrentPosition()) - f2) / (f - f2);
                    if (currentPosition > this.f10020a.f10021a.f24098t) {
                        if (!this.f10020a.f10021a.f24092n.f9733a) {
                            this.f10020a.f10021a.f24092n.setFloatProgress(currentPosition);
                        }
                        this.f10020a.f10021a.f24098t = currentPosition;
                    }
                    if (((float) this.f10020a.f10021a.f24095q.getCurrentPosition()) >= f) {
                        try {
                            this.f10020a.f10021a.f24095q.pause();
                            VideoPlayerActivity.m21175a(this.f10020a.f10021a);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        C32557(VideoPlayerActivity videoPlayerActivity) {
            this.f10021a = videoPlayerActivity;
        }

        public final void run() {
            while (true) {
                synchronized (this.f10021a.f24097s) {
                    Object obj = null;
                    try {
                        if (this.f10021a.f24095q != null && this.f10021a.f24095q.isPlaying()) {
                            obj = 1;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (obj != null) {
                    VideoPlayerActivity.m21192q(this.f10021a).runOnUiThread(new C32541(this));
                    try {
                        Thread.sleep(50);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    synchronized (this.f10021a.f24097s) {
                        this.f10021a.f24096r = null;
                    }
                    return;
                }
            }
        }
    }

    class C32568 implements Runnable {
        final /* synthetic */ VideoPlayerActivity f10022a;

        C32568(VideoPlayerActivity videoPlayerActivity) {
            this.f10022a = videoPlayerActivity;
        }

        public final void run() {
            this.f10022a.f24092n.setVideoDuration(this.f10022a.f24081G);
        }
    }

    class C61203 implements C3138c {
        final /* synthetic */ VideoPlayerActivity f16438a;

        C61203(VideoPlayerActivity videoPlayerActivity) {
            this.f16438a = videoPlayerActivity;
        }

        public final void mo2277a(int i, boolean z) {
            if (z && this.f16438a.f24095q != null && this.f16438a.f24099u && !this.f16438a.f24095q.isPlaying()) {
                float f = ((float) i) / 1000.0f;
                this.f16438a.f24095q.seekTo((int) (this.f16438a.f24081G * f));
                this.f16438a.f24098t = f;
                this.f16438a.f24100v = true;
            }
        }

        public final void mo2278a(DiscreteSeekBar discreteSeekBar) {
            float floatProgress = discreteSeekBar.getFloatProgress();
            if (this.f16438a.f24095q != null && this.f16438a.f24099u) {
                if (this.f16438a.f24095q.isPlaying()) {
                    try {
                        StringBuilder stringBuilder = new StringBuilder("***************************   onStopTrackingTouch       progress: ");
                        stringBuilder.append(floatProgress);
                        stringBuilder.append("   (videoDurationInMs * progress): ");
                        stringBuilder.append((int) (this.f16438a.f24081G * floatProgress));
                        C2480b.m6742f(stringBuilder.toString());
                        this.f16438a.f24095q.seekTo((int) (this.f16438a.f24081G * floatProgress));
                        this.f16438a.f24098t = floatProgress;
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                this.f16438a.f24098t = floatProgress;
                this.f16438a.f24100v = true;
            }
        }
    }

    static /* synthetic */ void m21175a(VideoPlayerActivity videoPlayerActivity) {
        if (videoPlayerActivity.f24092n != null) {
            videoPlayerActivity.f24092n.setFloatProgress(0.0f);
        }
        try {
            if (videoPlayerActivity.f24095q != null) {
                videoPlayerActivity.f24095q.seekTo(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ C7406c m21176b(VideoPlayerActivity videoPlayerActivity) {
        return videoPlayerActivity;
    }

    private boolean m21181g() {
        Exception exception;
        TrackHeaderBox trackHeaderBox;
        try {
            r1.f24088N = new File(this.f24101w).length();
            Container isoFile = new IsoFile(r1.f24101w);
            List<Box> paths = Path.getPaths(isoFile, "/moov/trak/");
            TrackHeaderBox trackHeaderBox2 = null;
            if (!(Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/mp4a/") != null)) {
                return false;
            }
            boolean z = Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/avc1/") != null;
            for (Box box : paths) {
                long j;
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
                    r1.f24081G = ((float) mediaHeaderBox.getDuration()) / ((float) mediaHeaderBox.getTimescale());
                    j2 = (long) ((int) (((float) (8 * j)) / r1.f24081G));
                } catch (Exception e2) {
                    exception = e2;
                    j = 0;
                    exception.printStackTrace();
                    trackHeaderBox = trackBox.getTrackHeaderBox();
                    if (trackHeaderBox.getWidth() != 0.0d) {
                    }
                    r1.f24084J += j;
                }
                trackHeaderBox = trackBox.getTrackHeaderBox();
                if (trackHeaderBox.getWidth() != 0.0d || trackHeaderBox.getHeight() == 0.0d) {
                    r1.f24084J += j;
                } else {
                    int i2 = (int) ((j2 / 100000) * 100000);
                    r1.f24079E = i2;
                    r1.f24080F = i2;
                    if (r1.f24079E > 1000000) {
                        r1.f24079E = 1000000;
                    }
                    r1.f24085K += j;
                    trackHeaderBox2 = trackHeaderBox;
                }
            }
            if (trackHeaderBox2 == null) {
                return false;
            }
            Matrix matrix = trackHeaderBox2.getMatrix();
            if (matrix.equals(Matrix.ROTATE_90)) {
                r1.f24102z = 90;
            } else if (matrix.equals(Matrix.ROTATE_180)) {
                r1.f24102z = 180;
            } else if (matrix.equals(Matrix.ROTATE_270)) {
                r1.f24102z = 270;
            }
            int width = (int) trackHeaderBox2.getWidth();
            r1.f24075A = width;
            r1.f24077C = width;
            width = (int) trackHeaderBox2.getHeight();
            r1.f24076B = width;
            r1.f24078D = width;
            if (r1.f24077C >= 640 || r1.f24078D >= 640) {
                float f = 640.0f / ((float) (r1.f24077C > r1.f24078D ? r1.f24077C : r1.f24078D));
                r1.f24077C = (int) (((float) r1.f24077C) * f);
                r1.f24078D = (int) (((float) r1.f24078D) * f);
                if (r1.f24079E != 0) {
                    r1.f24079E = (int) (((float) r1.f24079E) * Math.max(0.5f, f));
                    r1.f24085K = (long) (((float) (r1.f24079E / 8)) * r1.f24081G);
                }
            }
            if (!z && (r1.f24077C == r1.f24075A || r1.f24078D == r1.f24076B)) {
                return false;
            }
            r1.f24081G *= 1000.0f;
            runOnUiThread(new C32568(r1));
            return true;
        } catch (Exception e22) {
            e22.printStackTrace();
            return false;
        }
    }

    static /* synthetic */ void m21188m(VideoPlayerActivity videoPlayerActivity) {
        if (videoPlayerActivity.f24093o != null && videoPlayerActivity.f24093o.isAvailable() && videoPlayerActivity.f24095q != null) {
            try {
                videoPlayerActivity.f24095q.setSurface(new Surface(videoPlayerActivity.f24093o.getSurfaceTexture()));
                if (videoPlayerActivity.f24099u) {
                    videoPlayerActivity.f24095q.seekTo(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ C7406c m21192q(VideoPlayerActivity videoPlayerActivity) {
        return videoPlayerActivity;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_video_player);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2475a.m6720a(getWindow(), C0346c.m687c(this, R.color.colorTransparentToolbarBackground));
        C2475a.m6719a((Activity) this, "Video");
        this.f24091m = (ViewGroup) findViewById(R.id.root_layout);
        this.f24092n = (DiscreteSeekBar) findViewById(R.id.discreteSeekBar1);
        this.f24094p = (ProgressWheel) findViewById(R.id.progress_wheel);
        this.f24093o = (TextureView) findViewById(R.id.textureView1);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f24101w = getIntent().getExtras().getString("KEY_MEDIA_PATH");
            C2475a.m6719a((Activity) this, getIntent().getExtras().getString("KEY_TITLE"));
        }
        if (this.f24101w != null) {
            this.f24101w = Uri.parse(this.f24101w).getPath();
            m21181g();
            this.f24095q = new MediaPlayer();
            this.f24095q.setOnCompletionListener(new C32491(this));
            this.f24095q.setOnPreparedListener(new C32502(this));
            try {
                this.f24095q.setDataSource(this.f24101w);
                this.f24095q.prepareAsync();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f24093o.setSurfaceTextureListener(this.f24089O);
            this.f24092n.setOnProgressChangeListener(new C61203(this));
            this.f24093o.post(new C32514(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f24095q != null) {
            try {
                this.f24095q.stop();
                this.f24095q.release();
                this.f24095q = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onPlayPause(View view) {
        if (this.f24095q != null && this.f24099u) {
            if (this.f24095q.isPlaying()) {
                this.f24095q.pause();
                return;
            }
            try {
                this.f24098t = 0.0f;
                if (this.f24100v) {
                    this.f24095q.seekTo((int) (this.f24081G * this.f24092n.getFloatProgress()));
                    this.f24100v = false;
                }
                this.f24095q.setOnSeekCompleteListener(new C32536(this));
                this.f24095q.start();
                synchronized (this.f24097s) {
                    if (this.f24096r == null) {
                        this.f24096r = new Thread(this.f24090P);
                        this.f24096r.start();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
