package mobi.mmdt.ott.view.musicplayer;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C7249g;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import java.util.concurrent.TimeUnit;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.player.music.C2886b;
import mobi.mmdt.ott.logic.player.music.C2887c;
import mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService;
import mobi.mmdt.ott.logic.player.music.MusicPlayerService;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.emojisticker.C4019d;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class MusicPlayerActivity extends C7576b implements C2887c {
    private int f24367A;
    private String f24368B;
    private String f24369C;
    private String f24370D;
    private boolean f24371E = false;
    private boolean f24372F = false;
    private boolean f24373G = false;
    private ImageView f24374H;
    private RoundAvatarImageView f24375I;
    private ImageView f24376J;
    private TextView f24377K;
    private TextView f24378L;
    private String f24379M;
    private boolean f24380N = false;
    private BroadcastReceiver f24381O;
    private C4019d f24382P = new C4019d(new C42427(this));
    private C4019d f24383Q = new C4019d(new C42438(this));
    private SeekBar f24384m;
    private Uri f24385n;
    private int f24386o = 0;
    private TextView f24387p;
    private TextView f24388q;
    private ImageView f24389r;
    private ImageView f24390s;
    private ImageView f24391t;
    private ImageView f24392u;
    private ImageView f24393v;
    private ImageView f24394w;
    private boolean f24395z = false;

    class C42341 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12001a;

        C42341(MusicPlayerActivity musicPlayerActivity) {
            this.f12001a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            this.f12001a.m21297h();
            Context context = this.f12001a;
            this.f12001a.f24377K.getText().toString();
            this.f12001a.f24378L.getText().toString();
            Intent intent = new Intent(context, MusicPlayerNotificationService.class);
            intent.setAction("com.marothiatechs.customnotification.action.startforeground");
            context.startService(intent);
        }
    }

    class C42352 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12002a;

        C42352(MusicPlayerActivity musicPlayerActivity) {
            this.f12002a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            Toast.makeText(this.f12002a, "OnPreviousPressed", 0).show();
        }
    }

    class C42363 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12003a;

        C42363(MusicPlayerActivity musicPlayerActivity) {
            this.f12003a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            Toast.makeText(this.f12003a, "OnNextPressed", 0).show();
        }
    }

    class C42374 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12004a;

        C42374(MusicPlayerActivity musicPlayerActivity) {
            this.f12004a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            MusicPlayerActivity.m21294f(this.f12004a);
        }
    }

    class C42385 implements OnSeekBarChangeListener {
        final /* synthetic */ MusicPlayerActivity f12005a;

        C42385(MusicPlayerActivity musicPlayerActivity) {
            this.f12005a = musicPlayerActivity;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f12005a.f24395z = true;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f12005a.f24395z = false;
            StringBuilder stringBuilder = new StringBuilder(" // seekBar.getProgress() : ");
            stringBuilder.append(seekBar.getProgress());
            C2480b.m6742f(stringBuilder.toString());
            C2886b.m7241a(this.f12005a).m7243a(seekBar.getProgress());
            MyApplication.m12950a().f15893H = seekBar.getProgress();
            if (!this.f12005a.f24373G) {
                if (seekBar.getProgress() == seekBar.getMax()) {
                    this.f12005a.f24380N = true;
                    return;
                }
                this.f12005a.f24380N = false;
            }
        }
    }

    class C42416 implements Runnable {
        final /* synthetic */ MusicPlayerActivity f12009a;

        class C42402 implements Runnable {
            final /* synthetic */ C42416 f12008a;

            C42402(C42416 c42416) {
                this.f12008a = c42416;
            }

            public final void run() {
                StringBuilder stringBuilder = new StringBuilder("// mProgressChangedValue in thread && mIsPlaying ");
                stringBuilder.append(MyApplication.m12950a().f15893H);
                C2480b.m6742f(stringBuilder.toString());
                int toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) MyApplication.m12950a().f15893H);
                if (toSeconds < 0) {
                    toSeconds = 0;
                }
                this.f12008a.f12009a.f24388q.setText(C2491i.m6767a(MusicPlayerActivity.m21308q(this.f12008a.f12009a), toSeconds));
                this.f12008a.f12009a.f24384m.setProgress(MyApplication.m12950a().f15893H);
            }
        }

        C42416(MusicPlayerActivity musicPlayerActivity) {
            this.f12009a = musicPlayerActivity;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
        L_0x0000:
            r0 = r4.f12009a;
            r0 = r0.f24372F;
            if (r0 != 0) goto L_0x0087;
        L_0x0008:
            r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
            java.lang.Thread.sleep(r0);	 Catch:{ Exception -> 0x0087 }
            r0 = new java.lang.StringBuilder;
            r1 = "@@@@ mProgressChangedValue out : ";
            r0.<init>(r1);
            r1 = mobi.mmdt.ott.MyApplication.m12950a().f15893H;
            r0.append(r1);
            r0 = r0.toString();
            mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
            r0 = r4.f12009a;
            r0 = r0.f24380N;
            if (r0 == 0) goto L_0x006b;
        L_0x002a:
            r0 = r4.f12009a;
            r0 = r0.f24389r;
            if (r0 == 0) goto L_0x006b;
        L_0x0032:
            r0 = r4.f12009a;
            r0.f24373G = false;
            r0 = 0;
            mobi.mmdt.ott.MyApplication.m12950a().f15893H = r0;
            r1 = r4.f12009a;
            r1 = mobi.mmdt.ott.logic.player.music.C2886b.m7241a(r1);
            r1.m7248e();
            r1 = r4.f12009a;
            r1 = mobi.mmdt.ott.logic.player.music.C2886b.m7241a(r1);
            r1.m7243a(r0);
            r1 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r2 = mobi.mmdt.ott.MyApplication.m12950a().f15893H;
            r2 = (long) r2;
            r1 = r1.toSeconds(r2);
            r1 = (int) r1;
            if (r1 >= 0) goto L_0x005c;
        L_0x005b:
            r1 = r0;
        L_0x005c:
            r2 = r4.f12009a;
            r3 = new mobi.mmdt.ott.view.musicplayer.MusicPlayerActivity$6$1;
            r3.<init>(r4, r1);
            r2.runOnUiThread(r3);
            r1 = r4.f12009a;
            r1.f24380N = r0;
        L_0x006b:
            r0 = r4.f12009a;
            r0 = r0.f24395z;
            if (r0 != 0) goto L_0x0000;
        L_0x0073:
            r0 = r4.f12009a;
            r0 = r0.f24373G;
            if (r0 == 0) goto L_0x0000;
        L_0x007b:
            r0 = r4.f12009a;
            r1 = new mobi.mmdt.ott.view.musicplayer.MusicPlayerActivity$6$2;
            r1.<init>(r4);
            r0.runOnUiThread(r1);
            goto L_0x0000;
        L_0x0087:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.musicplayer.MusicPlayerActivity.6.run():void");
        }
    }

    class C42427 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12010a;

        C42427(MusicPlayerActivity musicPlayerActivity) {
            this.f12010a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            MusicPlayerActivity.m21309r(this.f12010a);
        }
    }

    class C42438 implements OnClickListener {
        final /* synthetic */ MusicPlayerActivity f12011a;

        C42438(MusicPlayerActivity musicPlayerActivity) {
            this.f12011a = musicPlayerActivity;
        }

        public final void onClick(View view) {
            MusicPlayerActivity.m21310s(this.f12011a);
        }
    }

    class C42449 extends BroadcastReceiver {
        final /* synthetic */ MusicPlayerActivity f12012a;

        C42449(MusicPlayerActivity musicPlayerActivity) {
            this.f12012a = musicPlayerActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getStringExtra("Do").equals("play_clicked")) {
                this.f12012a.m21297h();
            } else {
                MusicPlayerActivity.m21294f(this.f12012a);
            }
        }
    }

    static /* synthetic */ void m21294f(MusicPlayerActivity musicPlayerActivity) {
        musicPlayerActivity.f24373G = false;
        if (C2886b.m7241a((C2887c) musicPlayerActivity).m7247d()) {
            C2886b.m7241a((C2887c) musicPlayerActivity).m7248e();
            musicPlayerActivity.f24392u.setVisibility(0);
            musicPlayerActivity.f24389r.setVisibility(8);
        }
        musicPlayerActivity.f24392u.setVisibility(0);
        musicPlayerActivity.f24389r.setVisibility(8);
    }

    private void m21297h() {
        this.f24389r.setVisibility(0);
        this.f24392u.setVisibility(8);
        this.f24373G = true;
        if (MyApplication.m12950a().f15890E) {
            if (MyApplication.m12950a().f15893H > 0) {
                C2886b.m7241a((C2887c) this);
                C2886b.f9024b = this;
                C2886b.m7241a((C2887c) this).m7245b();
                return;
            }
            C2886b.m7241a((C2887c) this).m7242a();
        }
    }

    private void m21299i() {
        if (this.f24385n != null) {
            C2886b a = C2886b.m7241a((C2887c) this);
            Uri uri = this.f24385n;
            if (a.f9026c == null) {
                throw new IllegalAccessError("Music Player Service Not Binding! ");
            }
            int i;
            this.f24386o = MusicPlayerService.m7239a(uri);
            if (this.f24386o > 0) {
                this.f24384m.setMax(this.f24386o);
                StringBuilder stringBuilder = new StringBuilder("// mProgressChangedValue in doWhenIsPreparing before ");
                stringBuilder.append(MyApplication.m12950a().f15893H);
                C2480b.m6742f(stringBuilder.toString());
                if (this.f24371E) {
                    MyApplication.m12950a().f15893H = C2886b.m7241a((C2887c) this).m7246c();
                }
                stringBuilder = new StringBuilder("// mProgressChangedValue in doWhenIsPreparing after ");
                stringBuilder.append(MyApplication.m12950a().f15893H);
                C2480b.m6742f(stringBuilder.toString());
                if (MyApplication.m12950a().f15893H < 0) {
                    MyApplication.m12950a().f15893H = 0;
                }
                this.f24367A = (int) (((double) this.f24386o) * 0.02d);
                i = this.f24367A;
                int i2 = IjkMediaCodecInfo.RANK_MAX;
                if (i >= IjkMediaCodecInfo.RANK_MAX) {
                    i2 = this.f24367A;
                }
                this.f24367A = i2;
            } else {
                this.f24367A = 0;
                MyApplication.m12950a().f15893H = 0;
                this.f24384m.setProgress(0);
                this.f24384m.setMax(0);
            }
            i = (int) TimeUnit.MILLISECONDS.toSeconds((long) this.f24386o);
            if (i < 0) {
                i = 0;
            }
            this.f24387p.setText(C2491i.m6767a((Activity) this, i));
            if (!C2886b.m7241a((C2887c) this).m7247d()) {
                m21297h();
            }
        }
    }

    static /* synthetic */ C7406c m21305n(MusicPlayerActivity musicPlayerActivity) {
        return musicPlayerActivity;
    }

    static /* synthetic */ C7406c m21308q(MusicPlayerActivity musicPlayerActivity) {
        return musicPlayerActivity;
    }

    static /* synthetic */ void m21309r(MusicPlayerActivity musicPlayerActivity) {
        if (MyApplication.m12950a().f15893H - musicPlayerActivity.f24367A <= 0) {
            C2886b.m7241a((C2887c) musicPlayerActivity).m7243a(0);
            MyApplication.m12950a().f15893H = 0;
            musicPlayerActivity.f24384m.setProgress(0);
            C2886b.m7241a((C2887c) musicPlayerActivity).m7248e();
            musicPlayerActivity.f24392u.setVisibility(0);
            musicPlayerActivity.f24389r.setVisibility(8);
            return;
        }
        MyApplication.m12950a().f15893H -= musicPlayerActivity.f24367A;
        C2886b.m7241a((C2887c) musicPlayerActivity).m7243a(MyApplication.m12950a().f15893H);
        musicPlayerActivity.f24384m.setProgress(MyApplication.m12950a().f15893H);
    }

    static /* synthetic */ void m21310s(MusicPlayerActivity musicPlayerActivity) {
        if (MyApplication.m12950a().f15893H + musicPlayerActivity.f24367A >= musicPlayerActivity.f24386o) {
            musicPlayerActivity.f24380N = true;
            musicPlayerActivity.f24392u.setVisibility(0);
            musicPlayerActivity.f24389r.setVisibility(8);
            C2886b.m7241a((C2887c) musicPlayerActivity).m7248e();
            musicPlayerActivity.f24373G = false;
            return;
        }
        MyApplication.m12950a().f15893H += musicPlayerActivity.f24367A;
        C2886b.m7241a((C2887c) musicPlayerActivity).m7243a(MyApplication.m12950a().f15893H);
    }

    public final void mo3671a() {
        MyApplication.m12950a().f15890E = true;
        C2886b.m7241a((C2887c) this).m7244a(this.f24385n);
        m21299i();
    }

    public final void mo3672a(int i, int i2) {
        if (!this.f24395z) {
            MyApplication.m12950a().f15893H = i;
        }
        StringBuilder stringBuilder = new StringBuilder("******** position  ");
        stringBuilder.append(i);
        stringBuilder.append("   duration:  ");
        stringBuilder.append(i2);
        C2480b.m6742f(stringBuilder.toString());
    }

    public final void mo3673b() {
        MyApplication.m12950a().f15890E = false;
    }

    public final void m_() {
        if (MyApplication.m12950a().f15893H > 0) {
            this.f24380N = true;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        TextView textView;
        CharSequence b;
        super.onCreate(bundle);
        getWindow().setFlags(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        setContentView((int) R.layout.activity_music_player);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        setTitle("");
        C2886b.m7241a((C2887c) this);
        this.f24385n = MyApplication.m12950a().f15892G;
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            bundle = getIntent().getExtras();
            if (bundle.containsKey("KEY_AUDIO_PATH")) {
                String string = bundle.getString("KEY_AUDIO_PATH", "");
                if (!(this.f24385n == null || this.f24385n.equals(Uri.EMPTY) || this.f24385n.equals(Uri.parse(string)))) {
                    this.f24371E = true;
                }
                this.f24385n = Uri.parse(string);
                MyApplication.m12950a().f15892G = this.f24385n;
                StringBuilder stringBuilder = new StringBuilder(" audioPathInput: ");
                stringBuilder.append(string);
                stringBuilder.append("\n MyApp: ");
                stringBuilder.append(MyApplication.m12950a().f15892G);
                C2480b.m6742f(stringBuilder.toString());
            }
            if (bundle.containsKey("KEY_AUDIO_TITLE")) {
                this.f24368B = bundle.getString("KEY_AUDIO_TITLE", "");
            }
            if (bundle.containsKey("KEY_AUDIO_DESCRIPTION")) {
                this.f24369C = bundle.getString("KEY_AUDIO_DESCRIPTION", "");
            }
            if (bundle.containsKey("KEY_AUDIO_AVATAR")) {
                this.f24370D = bundle.getString("KEY_AUDIO_AVATAR", "");
            }
        }
        this.f24379M = C2535a.m6888a().m6919b();
        this.f24384m = (SeekBar) findViewById(R.id.seekBar);
        this.f24388q = (TextView) findViewById(R.id.start_time);
        this.f24387p = (TextView) findViewById(R.id.end_time);
        this.f24389r = (ImageView) findViewById(R.id.btnPause);
        this.f24391t = (ImageView) findViewById(R.id.btnNext);
        this.f24393v = (ImageView) findViewById(R.id.btnForward);
        this.f24394w = (ImageView) findViewById(R.id.btnBackward);
        this.f24390s = (ImageView) findViewById(R.id.btnPrevious);
        this.f24392u = (ImageView) findViewById(R.id.btnPlay);
        this.f24374H = (ImageView) findViewById(R.id.background_imageView);
        this.f24375I = (RoundAvatarImageView) findViewById(R.id.imageView1);
        this.f24376J = (ImageView) findViewById(R.id.imageView2);
        this.f24377K = (TextView) findViewById(R.id.title_textView);
        this.f24378L = (TextView) findViewById(R.id.description_textView);
        double a = ((double) C2489g.m6754a().m6755a(BallPulseIndicator.SCALE)) * 0.5d;
        int i = (int) a;
        int b2 = (int) (a + ((double) C2491i.m6804b((Context) this, 5.0f)));
        LayoutParams layoutParams = (LayoutParams) this.f24375I.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f24376J.getLayoutParams();
        layoutParams2.height = b2;
        layoutParams2.width = b2;
        StringBuilder stringBuilder2;
        if (this.f24379M.equals("fa")) {
            this.f24377K.setText(C2491i.m6814b(this.f24368B));
            textView = this.f24378L;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.f24369C);
            stringBuilder2.append("Test Description");
            b = C2491i.m6814b(stringBuilder2.toString());
        } else {
            this.f24377K.setText(this.f24368B);
            textView = this.f24378L;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.f24369C);
            stringBuilder2.append("Test Description");
            b = stringBuilder2.toString();
        }
        textView.setText(b);
        Object a2 = C2556b.m6998a(" ");
        if (a2 == null || a2.isEmpty()) {
            C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(R.drawable.ic_music_placeholder)).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f24375I);
            C1212c.m2873a((C7249g) this).m10953a(this.f24374H);
            this.f24374H.setImageBitmap(null);
            this.f24374H.setBackgroundColor(C0346c.m687c(MyApplication.m12952b(), R.color.colorBrowser));
        } else {
            C1212c.m2873a((C7249g) this).m10950a(a2).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f24375I);
            C1212c.m2873a((C7249g) this).m10958e().m3037a(a2).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2962h().m2954b(256, 256)).m3031a(this.f24374H);
        }
        this.f24392u.setOnClickListener(new C42341(this));
        this.f24390s.setOnClickListener(new C42352(this));
        this.f24391t.setOnClickListener(new C42363(this));
        this.f24389r.setOnClickListener(new C42374(this));
        this.f24394w.setOnTouchListener(this.f24382P);
        this.f24393v.setOnTouchListener(this.f24383Q);
        this.f24384m.setOnSeekBarChangeListener(new C42385(this));
        if (MyApplication.m12950a().f15890E) {
            m21299i();
            if (C2886b.m7241a((C2887c) this).m7247d()) {
                this.f24373G = true;
                this.f24392u.setVisibility(8);
                this.f24389r.setVisibility(0);
                if (this.f24371E) {
                    C2886b.m7241a((C2887c) this).m7248e();
                    C2886b.m7241a((C2887c) this).m7244a(this.f24385n);
                    MyApplication.m12950a().f15893H = 0;
                    C2886b.m7241a((C2887c) this).m7242a();
                }
            }
        } else {
            this.f24386o = 0;
            this.f24367A = 0;
            MyApplication.m12950a().f15893H = 0;
            this.f24384m.setProgress(0);
            this.f24388q.setText("00:00");
            this.f24387p.setText("00:00");
        }
        new Thread(new C42416(this)).start();
    }

    protected void onDestroy() {
        super.onDestroy();
        C2491i.m6785a((Activity) this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.f24381O);
    }

    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MAIN");
        this.f24381O = new C42449(this);
        registerReceiver(this.f24381O, intentFilter);
    }

    protected void onStop() {
        super.onStop();
        this.f24372F = true;
    }
}
