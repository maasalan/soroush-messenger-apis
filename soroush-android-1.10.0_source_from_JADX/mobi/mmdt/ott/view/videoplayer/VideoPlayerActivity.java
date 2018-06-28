package mobi.mmdt.ott.view.videoplayer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p234b.C2476b;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C2658c;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C5926b;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C2729d;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.videoplayer.core.C4593a;
import mobi.mmdt.ott.view.videoplayer.core.VideoPlayerFrame;
import org.jivesoftware.smack.roster.Roster;

public class VideoPlayerActivity extends C7576b implements OnClickListener, OnSeekBarChangeListener, C4593a {
    private AppCompatTextView f24558A;
    private String f24559B;
    private LinearLayout f24560C;
    private boolean f24561D;
    private Timer f24562E;
    private boolean f24563F = false;
    private final Runnable f24564G = new C45902(this);
    private String f24565m;
    private int f24566n;
    private ProgressWheel f24567o;
    private VideoPlayerFrame f24568p;
    private AppCompatImageView f24569q;
    private AppCompatImageView f24570r;
    private AppCompatImageView f24571s;
    private boolean f24572t;
    private Handler f24573u;
    private SeekBar f24574v;
    private int f24575w;
    private AppCompatTextView f24576z;

    class C45891 extends TimerTask {
        final /* synthetic */ VideoPlayerActivity f12610a;

        class C45881 implements Runnable {
            final /* synthetic */ C45891 f12609a;

            C45881(C45891 c45891) {
                this.f12609a = c45891;
            }

            public final void run() {
                this.f12609a.f12610a.f24558A.setVisibility(8);
                this.f12609a.f12610a.x.setVisibility(8);
                this.f12609a.f12610a.f24560C.setVisibility(8);
            }
        }

        C45891(VideoPlayerActivity videoPlayerActivity) {
            this.f12610a = videoPlayerActivity;
        }

        public final void run() {
            this.f12610a.f24561D = false;
            this.f12610a.runOnUiThread(new C45881(this));
        }
    }

    class C45902 implements Runnable {
        final /* synthetic */ VideoPlayerActivity f12611a;

        C45902(VideoPlayerActivity videoPlayerActivity) {
            this.f12611a = videoPlayerActivity;
        }

        public final void run() {
            long duration = this.f12611a.f24568p.getDuration();
            long currentPosition = this.f12611a.f24568p.getCurrentPosition();
            AppCompatTextView f = this.f12611a.f24576z;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(VideoPlayerActivity.m21520a(currentPosition));
            stringBuilder.append("/");
            stringBuilder.append(VideoPlayerActivity.m21520a(duration));
            f.setText(stringBuilder.toString());
            this.f12611a.f24574v.setProgress((int) this.f12611a.f24568p.getCurrentPosition());
            this.f12611a.f24573u.postDelayed(this.f12611a.f24564G, 200);
        }
    }

    class C45913 extends TimerTask {
        final /* synthetic */ VideoPlayerActivity f12612a;

        C45913(VideoPlayerActivity videoPlayerActivity) {
            this.f12612a = videoPlayerActivity;
        }

        public final void run() {
            if (this.f12612a.f24568p.m14722b()) {
                this.f12612a.f24568p.m14724d();
            }
            this.f12612a.f24574v.setProgress(0);
        }
    }

    static /* synthetic */ String m21520a(long j) {
        String valueOf;
        String valueOf2;
        j /= 1000;
        long j2 = j / 60;
        j %= 60;
        if (j2 > 9) {
            valueOf = String.valueOf(j2);
        } else {
            StringBuilder stringBuilder = new StringBuilder("0");
            stringBuilder.append(j2);
            valueOf = stringBuilder.toString();
        }
        if (j > 9) {
            valueOf2 = String.valueOf(j);
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("0");
            stringBuilder2.append(j);
            valueOf2 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(valueOf);
        stringBuilder3.append(":");
        stringBuilder3.append(valueOf2);
        return stringBuilder3.toString();
    }

    private void m21528g() {
        if (this.f24562E != null) {
            this.f24562E.cancel();
            this.f24562E = null;
        }
        this.f24562E = new Timer();
        this.f24562E.schedule(new C45891(this), 5000);
        this.f24558A.setText(this.f24559B);
    }

    private void m21530h() {
        this.f24568p = (VideoPlayerFrame) findViewById(R.id.video_view);
        this.f24568p.setKeepScreenOn(true);
        this.f24568p.setCallback(this);
        StringBuilder stringBuilder = new StringBuilder("Video Url is: ");
        stringBuilder.append(this.f24565m);
        C2480b.m6736b(stringBuilder.toString());
        this.f24568p.setSource(Uri.parse(this.f24565m));
        this.f24568p.setAutoPlay(true);
        this.f24568p.setClickable(false);
        if (VERSION.SDK_INT >= 23) {
            this.f24568p.setForeground(null);
        }
        for (int i = 0; i < this.f24568p.getChildCount(); i++) {
            View childAt = this.f24568p.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                ((FrameLayout) childAt).setForeground(null);
            }
        }
        this.f24568p.m14720a();
        this.f24572t = true;
        this.f24569q.setVisibility(4);
        this.f24570r.setVisibility(0);
    }

    private void m21532i() {
        this.f24572t = true;
        this.f24569q.setVisibility(4);
        this.f24570r.setVisibility(0);
        this.f24568p.m14723c();
    }

    static /* synthetic */ C7406c m21533j(VideoPlayerActivity videoPlayerActivity) {
        return videoPlayerActivity;
    }

    private void m21534j() {
        this.f24572t = false;
        this.f24569q.setVisibility(0);
        this.f24570r.setVisibility(4);
        if (this.f24568p.m14722b()) {
            this.f24568p.m14724d();
        }
    }

    public final void mo3576P() {
        C2480b.m6736b("EasyVideoPlayer:onPreparing");
    }

    public final void mo3577Q() {
        C2480b.m6736b("EasyVideoPlayer:onPrepared");
        if (this.f24566n > 0) {
            this.f24568p.m14721a(this.f24566n);
        }
        this.f24567o.setVisibility(4);
        if (this.f24572t) {
            this.f24568p.m14723c();
        }
        this.f24574v.setMax((int) this.f24568p.getDuration());
        this.f24567o.setVisibility(4);
        this.f24573u.postDelayed(this.f24564G, 200);
    }

    public final void mo3578R() {
        C2480b.m6736b("EasyVideoPlayer:onCompletion");
        if (C2476b.m6722a(this.f24565m) || !C2535a.m6888a().m6981z()) {
            if (!this.f24563F) {
                new Timer().schedule(new C45913(this), 100);
                this.f24569q.setVisibility(0);
                this.f24570r.setVisibility(4);
            }
            return;
        }
        this.f24572t = false;
        this.f24568p.m14721a(0);
        m21532i();
    }

    public final void mo3579a(Exception exception) {
        StringBuilder stringBuilder = new StringBuilder("EasyVideoPlayer:onError:");
        stringBuilder.append(exception.toString());
        C2480b.m6732a(stringBuilder.toString());
        this.f24563F = true;
        finish();
        if (!this.f24565m.startsWith("http://")) {
            if (!this.f24565m.startsWith("https://")) {
                C4478a.m8158b((Activity) this, this.f24565m);
                return;
            }
        }
        Toast.makeText(MyApplication.m12952b(), R.string.cant_show_video, 0).show();
    }

    public final void mo3580d(int i) {
        StringBuilder stringBuilder = new StringBuilder("EasyVideoPlayer:onBuffering percent:");
        stringBuilder.append(i);
        C2480b.m6736b(stringBuilder.toString());
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.close_button:
                finish();
                return;
            case R.id.exo_pause:
                m21534j();
                return;
            case R.id.exo_play:
                m21532i();
                return;
            case R.id.exo_unfull:
                intent = new Intent();
                intent.putExtra("KEY_STREAM_URL", this.f24565m);
                intent.putExtra("KEY_STREAM_POSITION", this.f24568p.getCurrentPosition());
                setResult(-1, intent);
                finish();
                return;
            case R.id.open_with_button:
                if (this.f24565m != null) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f24565m));
                    startActivity(intent);
                    finish();
                    return;
                }
                Toast.makeText(MyApplication.m12952b(), "Stream url is null !!!", 0).show();
                return;
            case R.id.video_view_container:
                if (this.f24561D) {
                    this.f24561D = false;
                    this.f24558A.setVisibility(8);
                    this.x.setVisibility(8);
                    this.f24560C.setVisibility(8);
                    return;
                }
                this.f24561D = true;
                if (!(this.f24559B == null && TextUtils.isEmpty(this.f24559B))) {
                    this.f24558A.setVisibility(0);
                }
                this.x.setVisibility(0);
                this.f24560C.setVisibility(0);
                m21528g();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_new_player);
        C2475a.m6720a(getWindow(), UIThemeManager.getmInstance().getPrimary_dark_color());
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f24565m = getIntent().getExtras().getString("KEY_STREAM_URL");
            this.f24566n = getIntent().getExtras().getInt("KEY_STREAM_POSITION");
            this.f24575w = getIntent().getExtras().getInt("KEY_PLAYER_TYPE");
            this.f24559B = getIntent().getExtras().getString("KEY_VIDEO_CAPTION");
        }
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.x.setTitle((CharSequence) "");
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        this.f24567o = (ProgressWheel) findViewById(R.id.progress_wheel);
        this.f24569q = (AppCompatImageView) findViewById(R.id.exo_play);
        this.f24570r = (AppCompatImageView) findViewById(R.id.exo_pause);
        this.f24571s = (AppCompatImageView) findViewById(R.id.exo_unfull);
        this.f24574v = (SeekBar) findViewById(R.id.exo_seek_bar);
        this.f24576z = (AppCompatTextView) findViewById(R.id.exo_player_timer);
        this.f24558A = (AppCompatTextView) findViewById(R.id.exo_player_caption);
        this.f24560C = (LinearLayout) findViewById(R.id.exoplayer_controls);
        this.f24573u = new Handler();
        this.f24561D = true;
        this.f24574v.setOnSeekBarChangeListener(this);
        this.f24562E = new Timer();
        if (this.f24559B == null || TextUtils.isEmpty(this.f24559B)) {
            this.f24558A.setVisibility(8);
        } else {
            this.f24558A.setText(this.f24559B);
        }
        m21528g();
        m21530h();
        if (this.f24575w == 0) {
            this.f24571s.setVisibility(8);
        } else if (this.f24575w == 1) {
            getWindow().setFlags(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
            this.f24571s.setVisibility(0);
        }
        C2491i.m6801a(this.f24569q, C0346c.m687c(this, R.color.video_player_accent_color));
        C2491i.m6801a(this.f24570r, C0346c.m687c(this, R.color.video_player_accent_color));
        C2491i.m6801a(this.f24571s, C0346c.m687c(this, R.color.video_player_accent_color));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_video_viewer, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        C2480b.m6736b("Easy Video Player : NewPlayer Activity OnDestroy");
        this.f24568p.m14725e();
        this.f24573u.removeCallbacksAndMessages(null);
        this.f24573u = null;
    }

    public void onEvent(final C5926b c5926b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ VideoPlayerActivity f12614b;

            public final void run() {
                C4513i.m8228a(VideoPlayerActivity.m21533j(this.f12614b), c5926b.f8890a);
            }
        });
    }

    public void onEvent(C2658c c2658c) {
        C2729d.m7071a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_save_to_gallery) {
            C2729d.m7072a(this, this.f24565m);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f24568p.m14721a(i);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    protected void onStop() {
        super.onStop();
        if (this.f24568p != null && this.f24568p.m14722b()) {
            m21534j();
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
