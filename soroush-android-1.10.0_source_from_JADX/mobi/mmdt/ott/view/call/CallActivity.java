package mobi.mmdt.ott.view.call;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cocosw.bottomsheet.C1287c.C1286a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2635a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2637d;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2638f;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2639h;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C5912c;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C5913e;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C5914g;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6687a;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6688b;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6689c;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6690d;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6691e;
import mobi.mmdt.ott.logic.p261a.p281e.p283b.C6692f;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.p368p.C2881b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p400b.C3110a;
import mobi.mmdt.ott.view.components.p400b.C3110a.C6060a;
import mobi.mmdt.ott.view.components.p400b.p527b.C6061a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.C3290a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import org.jivesoftware.smack.roster.Roster;
import p000a.p001a.p002a.C0005c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class CallActivity extends C7576b implements SensorEventListener, C3101a {
    private static String f23927m;
    private String f23928A = "";
    private LinearLayout f23929B;
    private String f23930C = "";
    private MediaPlayer f23931D;
    private MediaPlayer f23932E;
    private C6053a f23933n;
    private String f23934o;
    private FrameLayout f23935p;
    private boolean f23936q;
    private boolean f23937r = false;
    private boolean f23938s = false;
    private boolean f23939t = false;
    private boolean f23940u = false;
    private CountDownTimer f23941v;
    private SensorManager f23942w;
    private C3290a f23943z = C3290a.NOTHING;

    class C30421 implements OnClickListener {
        final /* synthetic */ CallActivity f9535a;

        C30421(CallActivity callActivity) {
            this.f9535a = callActivity;
        }

        public final void onClick(View view) {
            this.f9535a.m20992o();
            this.f9535a.mo3643g();
        }
    }

    class C30452 implements Runnable {
        final /* synthetic */ CallActivity f9545a;

        C30452(CallActivity callActivity) {
            this.f9545a = callActivity;
        }

        public final void run() {
            this.f9545a.mo3643g();
        }
    }

    class C30463 implements DialogInterface.OnClickListener {
        final /* synthetic */ CallActivity f9546a;

        C30463(CallActivity callActivity) {
            this.f9546a = callActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (CallActivity.m20987m(this.f9546a) != null) {
                C2837a.m7167a(CallActivity.m20989n(this.f9546a), "android.permission.RECORD_AUDIO", 189);
            }
        }
    }

    class C30474 implements DialogInterface.OnClickListener {
        final /* synthetic */ CallActivity f9547a;

        C30474(CallActivity callActivity) {
            this.f9547a = callActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f9547a.mo3643g();
        }
    }

    class C30485 implements Runnable {
        final /* synthetic */ CallActivity f9548a;

        C30485(CallActivity callActivity) {
            this.f9548a = callActivity;
        }

        public final void run() {
            this.f9548a.mo3643g();
        }
    }

    class C30496 implements Runnable {
        final /* synthetic */ CallActivity f9549a;

        C30496(CallActivity callActivity) {
            this.f9549a = callActivity;
        }

        public final void run() {
            this.f9549a.f23935p.setVisibility(8);
        }
    }

    class C30507 implements Runnable {
        final /* synthetic */ CallActivity f9550a;

        C30507(CallActivity callActivity) {
            this.f9550a = callActivity;
        }

        public final void run() {
            this.f9550a.f23935p.setVisibility(0);
            C4144a.m8009e(this.f9550a.f23935p);
        }
    }

    class C30518 implements Runnable {
        final /* synthetic */ CallActivity f9551a;

        C30518(CallActivity callActivity) {
            this.f9551a = callActivity;
        }

        public final void run() {
            this.f9551a.f23935p.setVisibility(0);
        }
    }

    class C30529 implements Runnable {
        final /* synthetic */ CallActivity f9552a;

        C30529(CallActivity callActivity) {
            this.f9552a = callActivity;
        }

        public final void run() {
            this.f9552a.f23929B.setVisibility(0);
        }
    }

    static /* synthetic */ void m20961a(ImageView imageView, int i) {
        if (VERSION.SDK_INT >= 16) {
            imageView.setBackground(C0346c.m682a(MyApplication.m12952b(), i));
        } else {
            imageView.setBackgroundDrawable(C0346c.m682a(MyApplication.m12952b(), i));
        }
    }

    static /* synthetic */ void m20963a(CallActivity callActivity, String str) {
        callActivity.m20992o();
        ArrayList arrayList = new ArrayList();
        arrayList.add(callActivity.f23934o);
        C2808d.m7147a(new C6726o(arrayList, str, callActivity.f23934o, C2973m.SINGLE, null, null));
        callActivity.mo3643g();
    }

    private static void m20966b(ImageView imageView, int i) {
        imageView.setPadding(i, i, i, i);
    }

    private void m20968b(boolean z) {
        runOnUiThread(z ? new C30507(this) : new C30518(this));
    }

    private void m20971c(boolean z) {
        runOnUiThread(z ? new Runnable(this) {
            final /* synthetic */ CallActivity f9522a;

            class C30391 implements Runnable {
                final /* synthetic */ AnonymousClass10 f9521a;

                C30391(AnonymousClass10 anonymousClass10) {
                    this.f9521a = anonymousClass10;
                }

                public final void run() {
                    this.f9521a.f9522a.m20990n();
                }
            }

            {
                this.f9522a = r1;
            }

            public final void run() {
                View q = this.f9522a.f23929B;
                C6060a a = C3110a.m7562a(new C6061a());
                a.f9674c = 250;
                a.f9676e = new AccelerateDecelerateInterpolator();
                a.m7561a(q);
                new Handler().postDelayed(new C30391(this), 250);
            }
        } : new Runnable(this) {
            final /* synthetic */ CallActivity f9524a;

            {
                this.f9524a = r1;
            }

            public final void run() {
                this.f9524a.m20990n();
            }
        });
    }

    static /* synthetic */ C7406c m20973d(CallActivity callActivity) {
        return callActivity;
    }

    static /* synthetic */ C7406c m20974e(CallActivity callActivity) {
        return callActivity;
    }

    private void m20979i() {
        if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            m20986l();
        }
        this.f23930C = C4522p.m8236a(R.string.ringing);
        runOnUiThread(new C30496(this));
        runOnUiThread(new C30529(this));
        f23927m = C4522p.m8236a(R.string.ringing);
    }

    private void m20981j() {
        if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            C0005c.m0a().m9d(new C2635a(C2881b.f8995c, "", this.f23934o));
            m20968b(false);
            m20971c(false);
            C2808d.m7149c(new C6690d(this.f23934o));
            f23927m = C4522p.m8236a(R.string.calling);
            this.f23930C = C4522p.m8236a(R.string.calling);
            return;
        }
        m20986l();
    }

    private void m20983k() {
        this.f23935p.setVisibility(8);
        m20990n();
        new Handler().postDelayed(new C30452(this), 1500);
        f23927m = C4522p.m8236a(R.string.call_finished);
    }

    private void m20986l() {
        C4488b.m8185b(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C30463(this), C4522p.m8236a(R.string.felan_na), new C30474(this));
    }

    static /* synthetic */ C7406c m20987m(CallActivity callActivity) {
        return callActivity;
    }

    private void m20988m() {
        m20971c(true);
        m20968b(true);
        C2808d.m7147a(new C6687a());
    }

    static /* synthetic */ C7406c m20989n(CallActivity callActivity) {
        return callActivity;
    }

    private void m20990n() {
        this.f23929B.setVisibility(8);
    }

    private void m20992o() {
        if (this.f23931D != null) {
            this.f23931D.release();
        }
        if (this.f23932E != null) {
            this.f23932E.release();
        }
    }

    private void m20993p() {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CallActivity f9528a;

            class C30401 implements Runnable {
                final /* synthetic */ AnonymousClass14 f9527a;

                C30401(AnonymousClass14 anonymousClass14) {
                    this.f9527a = anonymousClass14;
                }

                public final void run() {
                    this.f9527a.f9528a.finish();
                    this.f9527a.f9528a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f9528a = r1;
            }

            public final void run() {
                if (this.f9528a.f23941v != null) {
                    this.f9528a.f23941v.cancel();
                }
                new Handler().postDelayed(new C30401(this), 1000);
            }
        });
    }

    static /* synthetic */ C7406c m20998t(CallActivity callActivity) {
        return callActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 153) {
            return null;
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.soroush_needs_record_audio_permission_to_record_and_send_audio_messages), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ CallActivity f9529a;

            {
                this.f9529a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C4488b.m8184a(CallActivity.m20998t(this.f9529a));
            }
        });
    }

    final void mo3643g() {
        m20993p();
        C2808d.m7147a(new C6688b(this.f23934o));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        MyApplication a;
        C3290a c3290a;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_call);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(false, UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        Window window = getWindow();
        window.addFlags(524288);
        window.addFlags(128);
        window.addFlags(2097152);
        this.f23936q = true;
        this.f23934o = getIntent().getExtras().getString("key_contact_user_id_string");
        this.f23943z = C3290a.values()[getIntent().getExtras().getInt("key_start_mode", 0)];
        if (this.f23943z != null && r1.f23943z.equals(C3290a.MAKE_CALL)) {
            Uri parse = Uri.parse("android.resource://mobi.mmdt.ott/2131623947");
            r1.f23931D = new MediaPlayer();
            r1.f23931D.setAudioStreamType(0);
            try {
                r1.f23931D.setVolume(0.5f, 0.5f);
                r1.f23931D.setDataSource(MyApplication.m12952b(), parse);
                r1.f23931D.prepare();
                r1.f23931D.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            r1.f23931D.setOnCompletionListener(new OnCompletionListener(r1) {
                final /* synthetic */ CallActivity f9544a;

                class C30441 implements OnCompletionListener {
                    final /* synthetic */ AnonymousClass23 f9543a;

                    class C30431 extends TimerTask {
                        final /* synthetic */ C30441 f9542a;

                        C30431(C30441 c30441) {
                            this.f9542a = c30441;
                        }

                        public final void run() {
                            try {
                                if (this.f9542a.f9543a.f9544a.f23932E != null) {
                                    if (this.f9542a.f9543a.f9544a.f23932E.isPlaying()) {
                                        this.f9542a.f9543a.f9544a.f23932E.stop();
                                    }
                                    this.f9542a.f9543a.f9544a.f23932E.start();
                                }
                            } catch (Throwable e) {
                                C2480b.m6737b("Problem in playing fake beep in call", e);
                            }
                        }
                    }

                    C30441(AnonymousClass23 anonymousClass23) {
                        this.f9543a = anonymousClass23;
                    }

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        new Timer().schedule(new C30431(this), 2000);
                    }
                }

                {
                    this.f9544a = r1;
                }

                public final void onCompletion(MediaPlayer mediaPlayer) {
                    Uri parse = Uri.parse("android.resource://mobi.mmdt.ott/2131623943");
                    this.f9544a.f23932E = new MediaPlayer();
                    this.f9544a.f23932E.setAudioStreamType(0);
                    try {
                        this.f9544a.f23932E.setDataSource(MyApplication.m12952b(), parse);
                        this.f9544a.f23932E.prepare();
                        this.f9544a.f23932E.start();
                        this.f9544a.f23932E.setOnCompletionListener(new C30441(this));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        r1.f23935p = (FrameLayout) findViewById(R.id.inCallControl_frameLayout);
        r1.f23929B = (LinearLayout) findViewById(R.id.accept_bottom_pane);
        ImageView imageView = (ImageView) findViewById(R.id.end_call);
        imageView.setOnClickListener(new C30421(r1));
        ImageView imageView2 = (ImageView) findViewById(R.id.accept_call);
        imageView2.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9523a;

            {
                this.f9523a = r1;
            }

            public final void onClick(View view) {
                MyApplication.m12950a().f15891F = C3290a.ANSWER_CALL;
                this.f9523a.m20988m();
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.decline_btn);
        imageView3.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9531a;

            {
                this.f9531a = r1;
            }

            public final void onClick(View view) {
                this.f9531a.m20992o();
                MyApplication.m12950a().f15891F = C3290a.END_CALL;
                this.f9531a.mo3643g();
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.message_btn);
        imageView4.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9533a;

            class C30411 implements DialogInterface.OnClickListener {
                final /* synthetic */ AnonymousClass18 f9532a;

                C30411(AnonymousClass18 anonymousClass18) {
                    this.f9532a = anonymousClass18;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    CallActivity callActivity;
                    if (i != R.id.action_call_you_back) {
                        switch (i) {
                            case R.id.action_please_call_me_later:
                                CallActivity.m20963a(this.f9532a.f9533a, C4522p.m8236a(R.string.call_bottom_sheet_please_call_me_later));
                                return;
                            case R.id.action_please_text_me:
                                callActivity = this.f9532a.f9533a;
                                i = R.string.call_bottom_sheet_please_text_me;
                                break;
                            default:
                                return;
                        }
                    }
                    callActivity = this.f9532a.f9533a;
                    i = R.string.call_bottom_sheet_call_you_back;
                    CallActivity.m20963a(callActivity, C4522p.m8236a(i));
                }
            }

            {
                this.f9533a = r1;
            }

            public final void onClick(View view) {
                Activity d = CallActivity.m20973d(this.f9533a);
                C1286a c1286a = new C1286a(d);
                c1286a.f4034f = new C30411(this);
                C4506e.m8204a(d, c1286a, R.menu.context_menu_call_bottom_sheet);
                c1286a.m3053a().show();
                MyApplication.m12950a().f15891F = C3290a.END_CALL;
            }
        });
        final ImageView imageView5 = (ImageView) findViewById(R.id.speaker_btn);
        final ImageView imageView6 = (ImageView) findViewById(R.id.mute_btn);
        final ImageView imageView7 = (ImageView) findViewById(R.id.hold_btn);
        r1.f23941v = new CountDownTimer(r1) {
            final /* synthetic */ CallActivity f9534a;

            {
                this.f9534a = r5;
            }

            public final void onFinish() {
            }

            public final void onTick(long j) {
                int toSeconds = (int) ((1000000 - TimeUnit.MILLISECONDS.toSeconds(j)) - 1);
                if (toSeconds < 0) {
                    toSeconds = 0;
                }
                this.f9534a.f23928A = C2491i.m6767a(CallActivity.m20974e(this.f9534a), toSeconds);
                if (this.f9534a.f23933n != null) {
                    C6053a f = this.f9534a.f23933n;
                    CharSequence g = this.f9534a.f23928A;
                    if (f.f16196a != null) {
                        f.f16196a.setText(g);
                    }
                }
            }
        };
        switch (r1.f23943z) {
            case ANSWER_CALL:
                if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                    r1.f23935p.setVisibility(8);
                    m20990n();
                    f23927m = C4522p.m8236a(R.string.in_call);
                } else {
                    m20986l();
                }
                a = MyApplication.m12950a();
                c3290a = C3290a.ANSWER_CALL;
                break;
            case END_CALL:
                m20983k();
                a = MyApplication.m12950a();
                c3290a = C3290a.END_CALL;
                break;
            case MAKE_CALL:
                m20981j();
                a = MyApplication.m12950a();
                c3290a = C3290a.MAKE_CALL;
                break;
            case RINGING:
                m20979i();
                a = MyApplication.m12950a();
                c3290a = C3290a.RINGING;
                break;
            case NOTHING:
                switch (MyApplication.m12950a().f15891F) {
                    case ANSWER_CALL:
                        if (r1.f23941v != null) {
                            r1.f23941v.start();
                        }
                        r1.f23940u = true;
                        f23927m = C4522p.m8236a(R.string.in_call);
                        m20988m();
                        break;
                    case END_CALL:
                        m20983k();
                        break;
                    case MAKE_CALL:
                        m20981j();
                        break;
                    case RINGING:
                        m20979i();
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        a.f15891F = c3290a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_contact_user_id_string", r1.f23934o);
        bundle2.putString("key_call_status_message_string", f23927m);
        bundle2.putString("KEY_CALL_STATUS_BELOW_TEXT_VIEW", r1.f23930C);
        r1.f23933n = new C6053a();
        r1.f23933n.setArguments(bundle2);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, r1.f23933n);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        if (imageView5.getLayoutParams() != null) {
            int i;
            ImageView imageView8;
            int i2;
            float f;
            int b;
            int b2;
            StringBuilder stringBuilder;
            LayoutParams layoutParams;
            LayoutParams layoutParams2;
            LayoutParams layoutParams3;
            int a2 = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
            int i3 = 12;
            if (a2 <= 360) {
                i = a2 / 5;
            } else if (a2 <= 480) {
                i = a2 / 10;
            } else {
                if (a2 <= IjkMediaCodecInfo.RANK_LAST_CHANCE) {
                    i = a2 / 10;
                } else if (a2 <= 720) {
                    i = a2 / 13;
                } else {
                    i = 65;
                    imageView8 = imageView;
                    i3 = 16;
                    i2 = (int) (((double) i) * 0.75d);
                    f = (float) i;
                    b = (int) C2491i.m6804b(MyApplication.m12952b(), f);
                    b2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i3);
                    stringBuilder = new StringBuilder("-----------------------sizeX:  ");
                    stringBuilder.append(a2);
                    stringBuilder.append("-----------------------sizeX/x:  ");
                    stringBuilder.append(i);
                    stringBuilder.append(" ------pxFromDp: ");
                    stringBuilder.append(b);
                    C2480b.m6742f(stringBuilder.toString());
                    layoutParams = new LinearLayout.LayoutParams(b, b);
                    imageView5.setLayoutParams(layoutParams);
                    m20966b(imageView5, b2);
                    imageView6.setLayoutParams(layoutParams);
                    m20966b(imageView6, b2);
                    imageView7.setLayoutParams(layoutParams);
                    m20966b(imageView7, b2);
                    a2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i2);
                    b = a2 * 3;
                    layoutParams2 = new LinearLayout.LayoutParams(b, a2);
                    layoutParams2.gravity = 17;
                    layoutParams2.setMargins(0, 16, 0, 0);
                    imageView8.setLayoutParams(layoutParams2);
                    i2 = (int) C2491i.m6804b(MyApplication.m12952b(), f);
                    layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
                    imageView3.setLayoutParams(layoutParams3);
                    m20966b(imageView3, b2);
                    imageView4.setLayoutParams(layoutParams3);
                    m20966b(imageView4, b2);
                    layoutParams2 = new RelativeLayout.LayoutParams(b, a2);
                    layoutParams2.addRule(14);
                    imageView2.setLayoutParams(layoutParams2);
                }
                imageView8 = imageView;
                i2 = (int) (((double) i) * 0.75d);
                f = (float) i;
                b = (int) C2491i.m6804b(MyApplication.m12952b(), f);
                b2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i3);
                stringBuilder = new StringBuilder("-----------------------sizeX:  ");
                stringBuilder.append(a2);
                stringBuilder.append("-----------------------sizeX/x:  ");
                stringBuilder.append(i);
                stringBuilder.append(" ------pxFromDp: ");
                stringBuilder.append(b);
                C2480b.m6742f(stringBuilder.toString());
                layoutParams = new LinearLayout.LayoutParams(b, b);
                imageView5.setLayoutParams(layoutParams);
                m20966b(imageView5, b2);
                imageView6.setLayoutParams(layoutParams);
                m20966b(imageView6, b2);
                imageView7.setLayoutParams(layoutParams);
                m20966b(imageView7, b2);
                a2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i2);
                b = a2 * 3;
                layoutParams2 = new LinearLayout.LayoutParams(b, a2);
                layoutParams2.gravity = 17;
                layoutParams2.setMargins(0, 16, 0, 0);
                imageView8.setLayoutParams(layoutParams2);
                i2 = (int) C2491i.m6804b(MyApplication.m12952b(), f);
                layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
                imageView3.setLayoutParams(layoutParams3);
                m20966b(imageView3, b2);
                imageView4.setLayoutParams(layoutParams3);
                m20966b(imageView4, b2);
                layoutParams2 = new RelativeLayout.LayoutParams(b, a2);
                layoutParams2.addRule(14);
                imageView2.setLayoutParams(layoutParams2);
            }
            imageView8 = imageView;
            i3 = 10;
            i2 = (int) (((double) i) * 0.75d);
            f = (float) i;
            b = (int) C2491i.m6804b(MyApplication.m12952b(), f);
            b2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i3);
            stringBuilder = new StringBuilder("-----------------------sizeX:  ");
            stringBuilder.append(a2);
            stringBuilder.append("-----------------------sizeX/x:  ");
            stringBuilder.append(i);
            stringBuilder.append(" ------pxFromDp: ");
            stringBuilder.append(b);
            C2480b.m6742f(stringBuilder.toString());
            layoutParams = new LinearLayout.LayoutParams(b, b);
            imageView5.setLayoutParams(layoutParams);
            m20966b(imageView5, b2);
            imageView6.setLayoutParams(layoutParams);
            m20966b(imageView6, b2);
            imageView7.setLayoutParams(layoutParams);
            m20966b(imageView7, b2);
            a2 = (int) C2491i.m6804b(MyApplication.m12952b(), (float) i2);
            b = a2 * 3;
            layoutParams2 = new LinearLayout.LayoutParams(b, a2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(0, 16, 0, 0);
            imageView8.setLayoutParams(layoutParams2);
            i2 = (int) C2491i.m6804b(MyApplication.m12952b(), f);
            layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
            imageView3.setLayoutParams(layoutParams3);
            m20966b(imageView3, b2);
            imageView4.setLayoutParams(layoutParams3);
            m20966b(imageView4, b2);
            layoutParams2 = new RelativeLayout.LayoutParams(b, a2);
            layoutParams2.addRule(14);
            imageView2.setLayoutParams(layoutParams2);
        }
        imageView5.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9537b;

            public final void onClick(View view) {
                ImageView imageView;
                int i;
                if (this.f9537b.f23937r) {
                    CallActivity.m20961a(imageView5, (int) R.drawable.call_button_selector);
                    imageView = imageView5;
                    i = -1;
                } else {
                    CallActivity.m20961a(imageView5, (int) R.drawable.call_button_circle_selected);
                    imageView = imageView5;
                    i = -12303292;
                }
                C2491i.m6801a(imageView, i);
                this.f9537b.f23937r = this.f9537b.f23937r ^ 1;
                C2808d.m7147a(new C6692f(this.f9537b.f23937r));
            }
        });
        imageView6.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9539b;

            public final void onClick(View view) {
                if (this.f9539b.f23940u) {
                    ImageView imageView;
                    int i;
                    if (this.f9539b.f23938s) {
                        CallActivity.m20961a(imageView6, (int) R.drawable.call_button_selector);
                        imageView = imageView6;
                        i = -1;
                    } else {
                        CallActivity.m20961a(imageView6, (int) R.drawable.call_button_circle_selected);
                        imageView = imageView6;
                        i = -12303292;
                    }
                    C2491i.m6801a(imageView, i);
                    this.f9539b.f23938s = this.f9539b.f23938s ^ 1;
                    C2808d.m7147a(new C6691e(this.f9539b.f23938s));
                }
            }
        });
        imageView7.setOnClickListener(new OnClickListener(r1) {
            final /* synthetic */ CallActivity f9541b;

            public final void onClick(View view) {
                if (this.f9541b.f23940u) {
                    ImageView imageView;
                    int i;
                    if (this.f9541b.f23939t) {
                        CallActivity.m20961a(imageView7, (int) R.drawable.call_button_selector);
                        imageView = imageView7;
                        i = -1;
                    } else {
                        CallActivity.m20961a(imageView7, (int) R.drawable.call_button_circle_selected);
                        imageView = imageView7;
                        i = -12303292;
                    }
                    C2491i.m6801a(imageView, i);
                    this.f9541b.f23939t = this.f9541b.f23939t ^ 1;
                    C2808d.m7147a(new C6689c(this.f9541b.f23939t));
                }
            }
        });
        r1.f23942w = (SensorManager) getSystemService("sensor");
        r1.f23942w.registerListener(r1, r1.f23942w.getDefaultSensor(8), 3);
        m20725t();
    }

    protected void onDestroy() {
        super.onDestroy();
        m20992o();
        C2491i.m6785a((Activity) this);
        this.f23936q = false;
        if (this.f23941v != null) {
            this.f23941v.cancel();
        }
        MyApplication.m12950a().f15891F = C3290a.NOTHING;
    }

    public void onDoNothing(View view) {
    }

    public void onEvent(final C2635a c2635a) {
        if (c2635a.f8538a.equals(C2881b.f8997e)) {
            C2480b.m6742f("/////////////////////***********");
            if (this.f23931D != null && this.f23931D.isPlaying()) {
                C2480b.m6742f("/////////////////////*********** mpintro!=null ");
                this.f23931D.stop();
                this.f23931D.release();
            }
            if (this.f23932E != null && this.f23932E.isPlaying()) {
                this.f23932E.stop();
                this.f23932E.release();
            }
        }
        if (!(c2635a.f8538a.equals(C2881b.f8993a) || c2635a.f8538a.equals(C2881b.f8994b) || c2635a.f8538a.equals(C2881b.f8995c) || c2635a.f8538a.equals(C2881b.f8996d) || c2635a.f8538a.equals(C2881b.f8997e) || c2635a.f8538a.equals(C2881b.f8998f) || c2635a.f8538a.equals(C2881b.f8999g))) {
            if (c2635a.f8538a.equals(C2881b.f9000h)) {
                this.f23940u = true;
                this.f23941v.start();
            } else if (!(c2635a.f8538a.equals(C2881b.f9001i) || c2635a.f8538a.equals(C2881b.f9002j) || c2635a.f8538a.equals(C2881b.f9003k) || c2635a.f8538a.equals(C2881b.f9004l))) {
                if (!c2635a.f8538a.equals(C2881b.f9005m)) {
                    if (!c2635a.f8538a.equals(C2881b.f9006n)) {
                        if (!(c2635a.f8538a.equals(C2881b.f9007o) || c2635a.f8538a.equals(C2881b.f9008p) || c2635a.f8538a.equals(C2881b.f9009q) || c2635a.f8538a.equals(C2881b.f9010r) || !c2635a.f8538a.equals(C2881b.f9011s))) {
                        }
                    }
                }
                this.f23940u = false;
                m20993p();
            }
        }
        f23927m = c2635a.m7050a();
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CallActivity f9526b;

            public final void run() {
                if (this.f9526b.f23933n != null) {
                    this.f9526b.f23933n.m13626a(c2635a.m7050a());
                }
            }
        });
    }

    public void onEvent(C5912c c5912c) {
        mo3643g();
    }

    public void onEvent(C2637d c2637d) {
    }

    public void onEvent(C5913e c5913e) {
    }

    public void onEvent(C2638f c2638f) {
    }

    public void onEvent(C5914g c5914g) {
    }

    public void onEvent(C2639h c2639h) {
    }

    protected void onNewIntent(Intent intent) {
        MyApplication a;
        C3290a c3290a;
        super.onNewIntent(intent);
        this.f23943z = C3290a.values()[intent.getExtras().getInt("key_start_mode", 0)];
        switch (this.f23943z) {
            case ANSWER_CALL:
                if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                    m20988m();
                    f23927m = C4522p.m8236a(R.string.in_call);
                }
                a = MyApplication.m12950a();
                c3290a = C3290a.ANSWER_CALL;
                break;
            case END_CALL:
                this.f23935p.setVisibility(8);
                m20990n();
                new Handler().postDelayed(new C30485(this), 1500);
                f23927m = C4522p.m8236a(R.string.call_finished);
                a = MyApplication.m12950a();
                c3290a = C3290a.END_CALL;
                break;
            default:
                break;
        }
        a.f15891F = c3290a;
        if (this.f23933n != null) {
            this.f23933n.m13626a(f23927m);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 189 || (iArr.length > 0 && iArr[0] == -1)) {
            mo3643g();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        int i = (((double) f) < 0.0d || f >= 5.0f || f >= sensorEvent.sensor.getMaximumRange()) ? 0 : 1;
        f = (float) (i != 0 ? 0.01d : -1.0d);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags |= 128;
        attributes.screenBrightness = f;
        getWindow().setAttributes(attributes);
        ImageView imageView;
        if (i != 0) {
            getWindow().setFlags(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
            imageView = (ImageView) findViewById(R.id.background_off_screen);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            return;
        }
        getWindow().clearFlags(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        imageView = (ImageView) findViewById(R.id.background_off_screen);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
