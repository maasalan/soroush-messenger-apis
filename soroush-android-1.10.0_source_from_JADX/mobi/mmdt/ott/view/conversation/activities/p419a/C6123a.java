package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.p029a.C0346c;
import android.support.v4.p029a.C0350e;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.akexorcist.roundcornerprogressbar.TextRoundCornerProgressBar;
import com.google.android.gms.location.places.C1832a;
import com.google.android.gms.location.places.p161a.C5508a;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1248f;
import com.p144f.p145a.p146a.C1585a.C1584b;
import java.io.File;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import mobi.mmdt.componentsutils.p232b.C2488f;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollOption;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollResult;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2596b;
import mobi.mmdt.ott.logic.p261a.af.C6665d;
import mobi.mmdt.ott.logic.p261a.af.C6669k;
import mobi.mmdt.ott.logic.p261a.af.C6670l;
import mobi.mmdt.ott.logic.p261a.af.p271b.C5899b;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2626a;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2629d;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C6681e;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2645g;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5916c;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5924s;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6710u;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C2658c;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C5926b;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6714b;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6724m;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6727b;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2705r;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2706s;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.aa;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ab;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2717b;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2718c;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2719d;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6756c;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6757d;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6759f;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6760g;
import mobi.mmdt.ott.logic.p261a.p303m.C2722b;
import mobi.mmdt.ott.logic.p261a.p303m.C6761c;
import mobi.mmdt.ott.logic.p261a.p304n.p305a.C2723b;
import mobi.mmdt.ott.logic.p261a.p304n.p305a.C5952a;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C2727c;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C2729d;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C5955a;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.p261a.p329x.C2764d;
import mobi.mmdt.ott.logic.p261a.p329x.C6789b;
import mobi.mmdt.ott.logic.p261a.p329x.C6790e;
import mobi.mmdt.ott.logic.p261a.p329x.C6791f;
import mobi.mmdt.ott.logic.p261a.p549o.C6763a;
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.logic.p357j.p358a.C2830e;
import mobi.mmdt.ott.logic.p357j.p358a.C2831f;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.p357j.p358a.C2833i;
import mobi.mmdt.ott.logic.p357j.p358a.C2834j;
import mobi.mmdt.ott.logic.p357j.p358a.C5987d;
import mobi.mmdt.ott.logic.p357j.p358a.C5988h;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.p363m.C2863a;
import mobi.mmdt.ott.logic.p364n.C2867a;
import mobi.mmdt.ott.logic.p364n.C2868c;
import mobi.mmdt.ott.logic.p364n.C5999b;
import mobi.mmdt.ott.logic.stheme.UIThemeDefaultValue;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p249e.C2543a;
import mobi.mmdt.ott.p249e.C2543a.C25421;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2969i;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.audioselector.AudioSelectorActivity;
import mobi.mmdt.ott.view.components.fileselector.FileSelectorActivity;
import mobi.mmdt.ott.view.components.mediacaption.MediaCaptionActivity;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p400b.C3110a;
import mobi.mmdt.ott.view.components.p400b.C3110a.C6060a;
import mobi.mmdt.ott.view.components.p400b.p529d.C6065c;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.C3382a;
import mobi.mmdt.ott.view.conversation.activities.C3383b;
import mobi.mmdt.ott.view.conversation.activities.ConversationActivity;
import mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass48;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.48.C32951;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.48.C32962;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3327a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3338c;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3343d;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3343d.C33425;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3344e;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3346g;
import mobi.mmdt.ott.view.conversation.bot.C3442a;
import mobi.mmdt.ott.view.conversation.bot.C3442a.C34391;
import mobi.mmdt.ott.view.conversation.bot.C3442a.C3441a;
import mobi.mmdt.ott.view.conversation.emojisticker.C6205b;
import mobi.mmdt.ott.view.conversation.emojisticker.C6205b.C40122;
import mobi.mmdt.ott.view.conversation.emojisticker.C6205b.C4016a;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconEditText;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;
import mobi.mmdt.ott.view.conversation.forward.C4056f.C40551;
import mobi.mmdt.ott.view.conversation.forward.C4057g;
import mobi.mmdt.ott.view.conversation.forward.C4058h;
import mobi.mmdt.ott.view.conversation.forward.C4059i;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3287h;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p418a.C3289j;
import mobi.mmdt.ott.view.conversation.p424b.C3404b;
import mobi.mmdt.ott.view.conversation.p424b.C3406c;
import mobi.mmdt.ott.view.conversation.p424b.C6127a;
import mobi.mmdt.ott.view.conversation.p424b.C6127a.C33956;
import mobi.mmdt.ott.view.conversation.p424b.C6127a.C33967;
import mobi.mmdt.ott.view.conversation.p424b.p426b.C3400a;
import mobi.mmdt.ott.view.conversation.p424b.p426b.C3403b.C3402a;
import mobi.mmdt.ott.view.conversation.p427c.C6131b;
import mobi.mmdt.ott.view.conversation.p427c.C6131b.C3447a;
import mobi.mmdt.ott.view.conversation.p427c.C7191c;
import mobi.mmdt.ott.view.conversation.p431d.C3473a;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7584c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7597c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7610c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7623c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7632l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7649c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7675c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7699c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7711c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l;
import mobi.mmdt.ott.view.conversation.p573f.p598b.C7359a;
import mobi.mmdt.ott.view.conversation.typing.AVLoadingIndicatorView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4121n;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.main.C4226f;
import mobi.mmdt.ott.view.musicplayer.MusicPlayerActivity;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4521o;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4532q;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.videoplayer.VideoPlayerActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import uk.co.chrisjenx.calligraphy.CalligraphyTypefaceSpan;
import uk.co.chrisjenx.calligraphy.TypefaceUtils;

public abstract class C6123a extends C3382a implements C3101a, C3283d, C3284e, C3285f, C3286g, C3287h, C3288i, C3289j, C3404b, C3400a, C3441a, C3447a, C4016a {
    public boolean f16455A;
    LinkedHashMap<Long, C7197a> f16456B;
    boolean f16457C;
    C2973m f16458D;
    public View f16459E;
    MenuItem f16460F;
    MenuItem f16461G;
    MenuItem f16462H;
    MenuItem f16463I;
    MenuItem f16464J;
    MenuItem f16465K;
    String f16466L;
    int f16467M = 1;
    int f16468N = 0;
    public boolean f16469O = false;
    int f16470P = 0;
    final Intent f16471Q;
    JSONObject f16472R;
    PaymentModule f16473S;
    boolean f16474T;
    String f16475U;
    boolean f16476V = false;
    public boolean f16477W = false;
    public boolean f16478X = false;
    public int f16479Y = 0;
    RelativeLayout f16480Z;
    private int aA = 0;
    private String aB;
    private String aC;
    private String aD = "";
    private int aE = -1;
    private AVLoadingIndicatorView aF;
    private String aG = "";
    private final String aH;
    private View aI;
    private C6389b aJ;
    private C7197a aK;
    private final HashMap<String, Integer> aL = new HashMap();
    private final C2868c aM = new C61221(this);
    boolean aa = false;
    MenuItem ab;
    MenuItem ac;
    MenuItem ad;
    MenuItem ae;
    String af;
    public C3343d ag;
    private ViewGroup ah;
    private View ai;
    private final HashMap<Emojicon, Integer> aj = new HashMap();
    private TextView ak;
    private String al;
    private boolean am;
    private boolean an;
    private C6205b ao;
    private boolean ap;
    private TextView aq;
    private TextView ar;
    private ImageView as;
    private LinearLayout at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private int ay = -1;
    private int az = 0;
    int f16481c;
    boolean f16482d = true;
    int f16483e = 0;
    PollResult f16484f;
    C6131b f16485g;
    protected TextView f16486h;
    protected RoundAvatarImageView f16487i;
    protected C6127a f16488j;
    protected int f16489k;
    protected final String f16490l;
    protected ArrayList<String> f16491m = new ArrayList();
    protected boolean f16492n;
    protected boolean f16493o;
    int f16494p;
    C5999b f16495q;
    Toolbar f16496r;
    int f16497s = 0;
    int f16498t;
    boolean f16499u;
    boolean f16500v;
    PopupWindow f16501w;
    C3442a f16502x;
    FrameLayout f16503y;
    ActionMode f16504z;

    class AnonymousClass26 implements Runnable {
        final /* synthetic */ int f10088a;
        final /* synthetic */ C6123a f10089b;

        public AnonymousClass26(C6123a c6123a, int i) {
            this.f10089b = c6123a;
            this.f10088a = i;
        }

        public final void run() {
            this.f10089b.f16485g.f16586s = false;
            this.f10089b.f16485g.m14093c(this.f10088a);
            this.f10089b.f16485g.m14084a(this.f10088a, 0, false);
            if (this.f10089b.m14019h()) {
                this.f10089b.f16485g.f16583p = true;
            } else {
                this.f10089b.f16485g.f16582o = true;
                this.f10089b.f16485g.f16589v = this.f10089b.f16470P;
            }
            this.f10089b.f16485g.f16581n = this.f10088a;
            if (this.f10088a > 0) {
                this.f10089b.f16485g.m14085a(this.f10088a, false);
                return;
            }
            C6131b c6131b = this.f10089b.f16485g;
            if (c6131b.f16572e != null) {
                c6131b.m14103j();
            }
        }
    }

    class C32932 implements Runnable {
        final /* synthetic */ C6123a f10095a;

        C32932(C6123a c6123a) {
            this.f10095a = c6123a;
        }

        public final void run() {
            this.f10095a.f16501w.dismiss();
        }
    }

    class C32943 implements Runnable {
        final /* synthetic */ C6123a f10118a;

        C32943(C6123a c6123a) {
            this.f10118a = c6123a;
        }

        public final void run() {
            this.f10118a.f16501w.dismiss();
        }
    }

    static /* synthetic */ class AnonymousClass44 {
        static final /* synthetic */ int[] f10124b = new int[C2987i.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2973m.values();
            r0 = r0.length;
            r0 = new int[r0];
            f10126d = r0;
            r0 = 1;
            r1 = f10126d;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f10126d;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f10126d;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f10126d;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p384f.C2973m.GROUP;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = f10126d;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = mobi.mmdt.ott.provider.p384f.C2971k.values();
            r5 = r5.length;
            r5 = new int[r5];
            f10125c = r5;
            r5 = f10125c;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = mobi.mmdt.ott.provider.p384f.C2971k.ERROR;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r5 = f10125c;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r5[r6] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r5 = mobi.mmdt.ott.provider.p386h.C2987i.values();
            r5 = r5.length;
            r5 = new int[r5];
            f10124b = r5;
            r5 = f10124b;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r6 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.values();
            r5 = r5.length;
            r5 = new int[r5];
            f10123a = r5;
            r5 = f10123a;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r6 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0083 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x008d }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;	 Catch:{ NoSuchFieldError -> 0x008d }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x008d }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0097 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00ab }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;	 Catch:{ NoSuchFieldError -> 0x00ab }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ab }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x00ab }
        L_0x00ab:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        L_0x00b6:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00c1 }
        L_0x00c1:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00cd }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00cd }
        L_0x00cd:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00d9 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;	 Catch:{ NoSuchFieldError -> 0x00d9 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d9 }
            r2 = 9;	 Catch:{ NoSuchFieldError -> 0x00d9 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00d9 }
        L_0x00d9:
            r0 = f10123a;	 Catch:{ NoSuchFieldError -> 0x00e5 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;	 Catch:{ NoSuchFieldError -> 0x00e5 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e5 }
            r2 = 10;	 Catch:{ NoSuchFieldError -> 0x00e5 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00e5 }
        L_0x00e5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.44.<clinit>():void");
        }
    }

    class C33016 implements Runnable {
        final /* synthetic */ C6123a f10143a;

        class C33001 implements Runnable {
            final /* synthetic */ C33016 f10142a;

            C33001(C33016 c33016) {
                this.f10142a = c33016;
            }

            public final void run() {
                Toast.makeText((C7576b) this.f10142a.f10143a.f10377a, C4522p.m8236a(R.string.at_the_moment_there_is_no_possibility_of_payment), 0).show();
            }
        }

        C33016(C6123a c6123a) {
            this.f10143a = c6123a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C33001(this), 100);
        }
    }

    class C33037 implements Runnable {
        final /* synthetic */ C6123a f10145a;

        class C33021 implements Runnable {
            final /* synthetic */ C33037 f10144a;

            C33021(C33037 c33037) {
                this.f10144a = c33037;
            }

            public final void run() {
                C3382a c3382a = this.f10144a.f10145a;
                if (c3382a.f16473S.equals(PaymentModule.PARSIANMPL4FACTOR) || c3382a.f16473S.equals(PaymentModule.PARSIANMPL)) {
                    C7576b c7576b = (C7576b) c3382a.f10377a;
                    JSONObject jSONObject = c3382a.f16472R;
                    C2763c c2763c = C2763c.ChannelPayment;
                    C2764d.m7089a(c7576b, jSONObject);
                }
            }
        }

        C33037(C6123a c6123a) {
            this.f10145a = c6123a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C33021(this), 100);
        }
    }

    class C33048 implements Runnable {
        final /* synthetic */ C6123a f10146a;

        C33048(C6123a c6123a) {
            this.f10146a = c6123a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    private class C7190a implements Callback {
        final /* synthetic */ C6123a f10150a;
        private boolean f10151b;

        private C7190a(C6123a c6123a) {
            this.f10150a = c6123a;
            this.f10151b = false;
        }

        private void m7772a() {
            boolean z = true;
            if (this.f10150a.f16456B.size() == 1) {
                this.f10150a.m13912b(new ArrayList(this.f10150a.f16456B.values()));
                return;
            }
            ArrayList arrayList;
            boolean F = this.f10150a.m13933F();
            int i = 0;
            if (!this.f10150a.m13932E()) {
                if (!F) {
                    if (this.f10150a instanceof C6875d) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialog_id", 94);
                        arrayList = new ArrayList(this.f10150a.f16456B.values());
                        if (arrayList.size() > 0) {
                            boolean z2;
                            String[] strArr;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (C3337b.m7815c(((C7197a) it.next()).f19503j)) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            int i2;
                            if (((C6875d) this.f10150a).ai == C3004f.MEMBER) {
                                arrayList = new ArrayList(this.f10150a.f16456B.values());
                                strArr = new String[arrayList.size()];
                                for (i2 = 0; i2 < arrayList.size(); i2++) {
                                    strArr[i2] = ((C7197a) arrayList.get(i2)).f20777c;
                                }
                            } else if (z2) {
                                arrayList = new ArrayList(this.f10150a.f16456B.values());
                                strArr = new String[arrayList.size()];
                                for (i2 = 0; i2 < arrayList.size(); i2++) {
                                    strArr[i2] = ((C7197a) arrayList.get(i2)).f20777c;
                                }
                                bundle.putBoolean("KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE", true);
                            } else {
                                String[] strArr2 = new String[this.f10150a.f16456B.size()];
                                while (i < this.f10150a.f16456B.size()) {
                                    strArr2[i] = ((C7197a) arrayList.get(i)).f20777c;
                                    i++;
                                }
                                bundle.putStringArray("KEY_DIALOG_STRING_ARRAY_CHANNEL_MESSAGE_IDS", strArr2);
                                bundle.putString("KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_MULTI_DELETE_MESSAGE", C4522p.m8236a(R.string.are_you_sure_to_delete_the_messages_admin_or_owner));
                                this.f10150a.m14004e(bundle);
                            }
                            bundle.putStringArray("KEY_DIALOG_LONG_ARRAY_CHANNEL_MESSAGE_IDS", strArr);
                            bundle.putString("KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_MULTI_DELETE_MESSAGE", ((C7576b) this.f10150a.f10377a).getString(R.string.are_you_sure_to_delete_the_messages, new Object[]{Integer.valueOf(arrayList.size())}));
                            this.f10150a.m14004e(bundle);
                        }
                    }
                    return;
                }
            }
            arrayList = new ArrayList(this.f10150a.f16456B.values());
            int size = arrayList.size();
            if (!F || !this.f10150a.m13931D()) {
                for (int i3 = 0; i3 < size; i3++) {
                    if (!((C7197a) arrayList.get(i3)).m19056c()) {
                        z = false;
                        break;
                    }
                }
            }
            String[] strArr3 = new String[size];
            while (i < size) {
                strArr3[i] = ((C7197a) arrayList.get(i)).f20777c;
                i++;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("dialog_id", 90);
            bundle2.putBoolean("KEY_DIALOG_DELETE_IS_OUTPUT", z);
            bundle2.putStringArray("KEY_DIALOG_LONG_ARRAY_IDS", strArr3);
            this.f10150a.m13907a(z, bundle2);
            this.f10150a.m14004e(bundle2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onActionItemClicked(android.view.ActionMode r5, android.view.MenuItem r6) {
            /*
            r4 = this;
            r5 = r4.f10151b;
            r0 = 0;
            if (r5 != 0) goto L_0x0244;
        L_0x0005:
            r5 = r6.getItemId();
            r6 = 2131296339; // 0x7f090053 float:1.8210592E38 double:1.053000302E-314;
            r1 = 1;
            if (r5 != r6) goto L_0x0063;
        L_0x000f:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x0043;
        L_0x0019:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r6 = r5.get(r0);
            r6 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r6;
            r6 = r6 instanceof mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
            if (r6 == 0) goto L_0x0035;
        L_0x0030:
            r6 = r4.f10150a;
            r6.m13893a(r5);
        L_0x0035:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x0062;
        L_0x003b:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
            return r1;
        L_0x0043:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r6 = r4.f10150a;
            r6 = r6.f16504z;
            if (r6 == 0) goto L_0x005d;
        L_0x0056:
            r6 = r4.f10150a;
            r6 = r6.f16504z;
            r6.finish();
        L_0x005d:
            r6 = r4.f10150a;
            r6.m13893a(r5);
        L_0x0062:
            return r1;
        L_0x0063:
            r6 = 2131296331; // 0x7f09004b float:1.8210576E38 double:1.0530002983E-314;
            if (r5 != r6) goto L_0x006c;
        L_0x0068:
            r4.m7772a();
            return r1;
        L_0x006c:
            r6 = 2131296383; // 0x7f09007f float:1.8210681E38 double:1.053000324E-314;
            if (r5 != r6) goto L_0x00a9;
        L_0x0071:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x00a8;
        L_0x007b:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r5 instanceof mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
            if (r6 == 0) goto L_0x009b;
        L_0x0092:
            r6 = r4.f10150a;
            r6 = r6.f10377a;
            r6 = (mobi.mmdt.ott.view.components.p402d.C7576b) r6;
            mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7812b(r6, r5);
        L_0x009b:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x00a8;
        L_0x00a1:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x00a8:
            return r1;
        L_0x00a9:
            r6 = 2131296377; // 0x7f090079 float:1.8210669E38 double:1.053000321E-314;
            if (r5 != r6) goto L_0x00de;
        L_0x00ae:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x00dd;
        L_0x00b8:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r4.f10150a;
            r6.m13924j(r5);
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x00dd;
        L_0x00d6:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x00dd:
            return r1;
        L_0x00de:
            r6 = 2131296326; // 0x7f090046 float:1.8210566E38 double:1.053000296E-314;
            if (r5 != r6) goto L_0x0166;
        L_0x00e3:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.size();
            if (r6 != r1) goto L_0x010a;
        L_0x00fa:
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13922d(r5);
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x0165;
        L_0x0109:
            goto L_0x015e;
        L_0x010a:
            r6 = r4.f10150a;
            r5 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7799a(r5);
            r2 = android.os.Build.VERSION.SDK_INT;
            r3 = 11;
            if (r2 >= r3) goto L_0x0128;
        L_0x0116:
            r6 = r6.f10377a;
            r6 = (mobi.mmdt.ott.view.components.p402d.C7576b) r6;
            r2 = "clipboard";
            r6 = r6.getSystemService(r2);
            r6 = (android.text.ClipboardManager) r6;
            if (r6 == 0) goto L_0x0144;
        L_0x0124:
            r6.setText(r5);
            goto L_0x0144;
        L_0x0128:
            r6 = r6.f10377a;
            r6 = (mobi.mmdt.ott.view.components.p402d.C7576b) r6;
            r2 = "clipboard";
            r6 = r6.getSystemService(r2);
            r6 = (android.content.ClipboardManager) r6;
            r2 = 2131689627; // 0x7f0f009b float:1.9008275E38 double:1.0531946123E-314;
            r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
            r5 = android.content.ClipData.newPlainText(r2, r5);
            if (r6 == 0) goto L_0x0144;
        L_0x0141:
            r6.setPrimaryClip(r5);
        L_0x0144:
            r5 = r4.f10150a;
            r5 = r5.f10377a;
            r5 = (mobi.mmdt.ott.view.components.p402d.C7576b) r5;
            r6 = 2131690152; // 0x7f0f02a8 float:1.900934E38 double:1.0531948717E-314;
            r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r6);
            r5 = android.widget.Toast.makeText(r5, r6, r0);
            r5.show();
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x0165;
        L_0x015e:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x0165:
            return r1;
        L_0x0166:
            r6 = 2131296337; // 0x7f090051 float:1.8210588E38 double:1.053000301E-314;
            if (r5 != r6) goto L_0x019b;
        L_0x016b:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x018d;
        L_0x0175:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r4.f10150a;
            r6.m13925k(r5);
        L_0x018d:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x019a;
        L_0x0193:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x019a:
            return r1;
        L_0x019b:
            r6 = 2131296340; // 0x7f090054 float:1.8210594E38 double:1.0530003027E-314;
            if (r5 != r6) goto L_0x01d0;
        L_0x01a0:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x01c2;
        L_0x01aa:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r4.f10150a;
            r6.m13998c(r5);
        L_0x01c2:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x01cf;
        L_0x01c8:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x01cf:
            return r1;
        L_0x01d0:
            r6 = 2131296380; // 0x7f09007c float:1.8210675E38 double:1.0530003225E-314;
            if (r5 != r6) goto L_0x020b;
        L_0x01d5:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x01fd;
        L_0x01df:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r4.f10150a;
            r5 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r5;
            r5 = r5.mo3625i();
            r6.mo2331e(r5);
        L_0x01fd:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x020a;
        L_0x0203:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x020a:
            return r1;
        L_0x020b:
            r6 = 2131296308; // 0x7f090034 float:1.821053E38 double:1.053000287E-314;
            if (r5 != r6) goto L_0x0244;
        L_0x0210:
            r5 = r4.f10150a;
            r5 = r5.f16456B;
            r5 = r5.size();
            if (r5 != r1) goto L_0x0243;
        L_0x021a:
            r5 = new java.util.ArrayList;
            r6 = r4.f10150a;
            r6 = r6.f16456B;
            r6 = r6.values();
            r5.<init>(r6);
            r5 = r5.get(r0);
            r5 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r5;
            r6 = r4.f10150a;
            r6 = r6.f10377a;
            r6 = (mobi.mmdt.ott.view.components.p402d.C7576b) r6;
            mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7805a(r6, r5);
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            if (r5 == 0) goto L_0x0243;
        L_0x023c:
            r5 = r4.f10150a;
            r5 = r5.f16504z;
            r5.finish();
        L_0x0243:
            return r1;
        L_0x0244:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.a.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.menu_conversation_action_mode, menu);
            return true;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f10151b = true;
            if (!this.f10150a.f16469O) {
                this.f10150a.f16456B.clear();
            }
            MyApplication.m12950a().f15906l = new int[MyApplication.f15885k];
            this.f10150a.f16455A = false;
            this.f10150a.f16485g.m14104k();
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f10150a.f16456B.size());
            actionMode.setTitle(stringBuilder.toString());
            this.f10150a.f16461G = menu.findItem(R.id.action_edit);
            this.f10150a.f16460F = menu.findItem(R.id.action_copy);
            this.f10150a.f16462H = menu.findItem(R.id.action_reply);
            this.f10150a.f16463I = menu.findItem(R.id.action_delete);
            this.f10150a.f16464J = menu.findItem(R.id.action_forward);
            this.f10150a.ab = menu.findItem(R.id.action_edit);
            this.f10150a.ac = menu.findItem(R.id.action_share);
            this.f10150a.ae = menu.findItem(R.id.action_save_to_gallery);
            this.f10150a.ae.setVisible(false);
            this.f10150a.ad = menu.findItem(R.id.action_forward_to_me);
            this.f10150a.ad.setVisible(false);
            this.f10150a.ac.setVisible(false);
            this.f10150a.ab.setVisible(false);
            this.f10150a.f16465K = menu.findItem(R.id.action_add_to_stickers);
            this.f10150a.f16465K.setVisible(false);
            if (this.f10150a.f16460F != null) {
                this.f10150a.f16461G.setShowAsAction(0);
                this.f10150a.f16460F.setShowAsAction(2);
                this.f10150a.f16462H.setShowAsAction(2);
                this.f10150a.f16463I.setShowAsAction(2);
                this.f10150a.f16464J.setShowAsAction(2);
                this.f10150a.f16465K.setShowAsAction(0);
                this.f10150a.ad.setShowAsAction(0);
            }
            this.f10150a.al();
            return false;
        }
    }

    public enum C3315b {
        last_position,
        search
    }

    class C61221 implements C2868c {
        final /* synthetic */ C6123a f16454a;

        class C32921 implements Runnable {
            final /* synthetic */ C61221 f10063a;

            C32921(C61221 c61221) {
                this.f10063a = c61221;
            }

            public final void run() {
                if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                    Toast.makeText((C7576b) this.f10063a.f16454a.f10377a, C4522p.m8236a(R.string.cancel_record), 0).show();
                }
            }
        }

        C61221(C6123a c6123a) {
            this.f16454a = c6123a;
        }

        public final void mo2292a() {
            this.f16454a.f16488j.m14060a(C3402a.RECORDING);
        }

        public final void mo2293b() {
            this.f16454a.m13911b(this.f16454a.f16495q.f16155e, "", C2988j.PUSH_TO_TALK, null, false);
            this.f16454a.f16488j.m14060a(C3402a.NOT_START);
        }

        public final void mo2294c() {
            this.f16454a.f16488j.m14060a(C3402a.NOT_START);
            ((C7576b) this.f16454a.f10377a).runOnUiThread(new C32921(this));
        }
    }

    protected C6123a(Activity activity, Intent intent, String str, C2973m c2973m, String str2) {
        super(activity);
        this.f16471Q = intent;
        this.f16490l = str;
        this.f16458D = c2973m;
        this.aH = str2;
        this.b = this.f10377a.getLayoutInflater().inflate(R.layout.activity_conversation, null, false);
    }

    private String m13891a(String str, C4058h c4058h, String str2) {
        String a;
        if (str.startsWith("content:/")) {
            a = C2488f.m6752a((C7576b) this.f10377a, Uri.parse(str));
            if (a == null) {
                C7576b c7576b = (C7576b) this.f10377a;
                Uri parse = Uri.parse(str);
                switch (C25421.f8305a[c4058h.ordinal()]) {
                }
                return C2543a.m6984a(c7576b, parse, C2791c.m7109a().m7113a(C2543a.m6985a(parse), str2));
            }
        }
        a = new File(Uri.parse(str).getPath()).getPath();
        return a;
    }

    private static void m13892a(Drawable drawable) {
        C2491i.m6790a(drawable, UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    private void m13893a(ArrayList<C7197a> arrayList) {
        Activity activity = (C7576b) this.f10377a;
        String str = this.f16490l;
        C2973m c2973m = this.f16458D;
        if (arrayList.size() == 1) {
            C7358a c7358a = (C7358a) arrayList.get(0);
            if (c7358a != null) {
                ArrayList arrayList2 = new ArrayList();
                String a = C3337b.m7800a(c7358a);
                if (a != null) {
                    arrayList2.add(a);
                    C4478a.m8151a(activity, arrayList2, str, c2973m.ordinal(), false);
                    return;
                }
                C3337b.m7801a(activity);
            }
            return;
        }
        if (arrayList.size() > 1) {
            C3337b.m7803a(activity, (ArrayList) arrayList, c2973m, str);
        }
    }

    static /* synthetic */ void m13895a(C6123a c6123a, int i) {
        if (c6123a.m14019h()) {
            c6123a.m13910b(i, true, false, false);
        } else if ((c6123a.aH == null || c6123a.aH.isEmpty()) && c6123a.f16489k <= 0) {
            c6123a.m13910b(i, false, false, true);
            c6123a.f16485g.f16589v = c6123a.f16470P;
            c6123a.f16485g.f16590w = c6123a.aD;
        } else {
            c6123a.m13910b(i, false, true, false);
            c6123a.f16477W = false;
        }
        c6123a.f16485g.m14085a(i, true);
        c6123a.f16477W = false;
    }

    static /* synthetic */ void m13896a(C6123a c6123a, CharSequence charSequence) {
        if (c6123a.aK != null) {
            if (charSequence.equals(C4522p.m8236a(C3327a.forward.f10209k))) {
                C7197a c7197a = c6123a.aK;
                ArrayList arrayList = new ArrayList();
                arrayList.add(c7197a);
                c6123a.m13893a(arrayList);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.share.f10209k))) {
                C3337b.m7812b((C7576b) c6123a.f10377a, c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.copy.f10209k))) {
                C6123a.m13922d(c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.delete.f10209k))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c6123a.aK);
                c6123a.m13912b(arrayList2);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.add_sticker.f10209k))) {
                C3337b.m7805a((C7576b) c6123a.f10377a, c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.reply.f10209k))) {
                c6123a.m13924j(c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.edit.f10209k))) {
                c6123a.m13925k(c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.forward_to_me.f10209k))) {
                c6123a.m13998c(c6123a.aK);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.full_screen_gif.f10209k))) {
                C7358a c7358a = (C7358a) c6123a.aK;
                c6123a.mo2309a(c7358a.f21327m, c7358a.f21333s);
            } else if (charSequence.equals(C4522p.m8236a(C3327a.download_media.f10209k))) {
                c6123a.mo2331e(((C7358a) c6123a.aK).f21327m);
            }
        }
    }

    static /* synthetic */ void m13901a(C6123a c6123a, C3315b c3315b, int i) {
        c6123a.f16485g.f16586s = false;
        if (c3315b.equals(C3315b.search)) {
            c6123a.f16485g.m14084a(i, 0, true);
            c6123a.f16485g.m14093c(i);
        } else {
            c6123a.f16485g.m14084a(i, 0, true);
            if (c6123a.f16478X) {
                c6123a.f16478X = false;
            } else if (c6123a.f16477W || c6123a.f16489k > 0) {
                c6123a.f16477W = false;
                c6123a.f16485g.f16582o = false;
            } else {
                c6123a.f16485g.f16582o = true;
                c6123a.f16485g.f16589v = c6123a.f16470P;
                c6123a.f16485g.f16590w = c6123a.aD;
                c6123a.f16485g.m14093c(i);
            }
            c6123a.f16485g.f16581n = i;
        }
        c6123a.f16485g.m14085a(i, true);
    }

    static /* synthetic */ void m13903a(C6123a c6123a, boolean z) {
        if (C6123a.ak()) {
            c6123a.aj();
        } else if (z) {
            c6123a.ah();
        } else {
            c6123a.ai();
        }
    }

    private static void m13905a(C7197a c7197a, MenuItem menuItem) {
        C7358a c7358a = (C7358a) c7197a;
        if (c7358a.f21337w != null) {
            switch (c7358a.f21337w) {
                case ERROR:
                case SENDING:
                    menuItem.setVisible(false);
                    break;
                default:
                    menuItem.setVisible(true);
                    return;
            }
        }
    }

    private static void m13906a(C7197a c7197a, boolean z) {
        int i = z ? 1 : -1;
        int[] iArr;
        int i2;
        if (C3337b.m7821g(c7197a.f19503j) == null) {
            iArr = MyApplication.m12950a().f15906l;
            i2 = MyApplication.f15881g;
            iArr[i2] = iArr[i2] + i;
        } else if (C3337b.m7821g(c7197a.f19503j) == C2972l.TEXT) {
            iArr = MyApplication.m12950a().f15906l;
            i2 = MyApplication.f15875a;
            iArr[i2] = iArr[i2] + i;
        } else if (C3337b.m7821g(c7197a.f19503j) == C2972l.REPORT) {
            iArr = MyApplication.m12950a().f15906l;
            i2 = MyApplication.f15877c;
            iArr[i2] = iArr[i2] + i;
        } else if (C3337b.m7821g(c7197a.f19503j) == C2972l.VOTE) {
            iArr = MyApplication.m12950a().f15906l;
            i2 = MyApplication.f15878d;
            iArr[i2] = iArr[i2] + i;
        } else {
            iArr = MyApplication.m12950a().f15906l;
            i2 = MyApplication.f15876b;
            iArr[i2] = iArr[i2] + i;
        }
    }

    private void m13907a(boolean z, Bundle bundle) {
        if (this.f16458D != null && z) {
            if (this.f16458D == C2973m.SINGLE) {
                bundle.putString("KEY_DIALOG_DELETE_CONTACT_NAME", ((C7576b) this.f10377a).getString(R.string.check_box_title_delete_single_conversation, new Object[]{m14027n()}));
            } else if (this.f16458D == C2973m.GROUP) {
                bundle.putString("KEY_DIALOG_DELETE_CONTACT_NAME", ((C7576b) this.f10377a).getString(R.string.check_box_title_delete_group_conversation));
            }
        }
    }

    private static boolean m13908a(C6829g c6829g) {
        C7358a c7358a = (C7358a) c6829g;
        if (c7358a.f21337w != null) {
            switch (c7358a.f21337w) {
                case ERROR:
                case SENDING:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    private CharSequence[] m13909a(boolean... zArr) {
        boolean z = zArr[3];
        int i = 0;
        Integer valueOf = Integer.valueOf(0);
        for (int i2 = 0; i2 < 9; i2++) {
            if (zArr[i2]) {
                valueOf = Integer.valueOf(valueOf.intValue() + 1);
            }
        }
        if (z && !this.f16490l.equals(this.aB)) {
            valueOf = Integer.valueOf(valueOf.intValue() + 1);
        }
        CharSequence[] charSequenceArr = new CharSequence[valueOf.intValue()];
        int i3 = 0;
        int i4 = i3;
        while (i < 9) {
            if (zArr[i]) {
                charSequenceArr[i3] = C4522p.m8236a(C3327a.values()[i4].f10209k);
                i3++;
            }
            i4++;
            i++;
        }
        if (z && !this.f16490l.equals(this.aB)) {
            charSequenceArr[valueOf.intValue() - 1] = C4522p.m8236a(C3327a.values()[C3327a.values().length - 1].f10209k);
        }
        return charSequenceArr;
    }

    private void ad() {
        C2808d.m7147a(new C6724m(this.f16490l, this.f16458D));
    }

    private void ae() {
        CharSequence replaceAll = this.av != null ? Normalizer.normalize(this.av, Form.NFD).replaceAll("[\n]", " ") : "";
        CharSequence replaceAll2 = this.aw != null ? Normalizer.normalize(this.aw, Form.NFD).replaceAll("[\n]", " ") : "";
        this.aq.setText(replaceAll);
        if (this.f16458D == null || !(this.f16458D == C2973m.CHANNEL || this.f16458D == C2973m.CHANNEL_DIRECT || this.f16458D == C2973m.CHANNEL_REPLY)) {
            this.aq.setVisibility(0);
        } else {
            C3004f c3004f = ((C6875d) this).ai;
            if (c3004f != null && (c3004f == C3004f.MEMBER || c3004f == C3004f.VISITOR || c3004f == C3004f.NONE)) {
                this.aq.setVisibility(8);
            }
        }
        this.ar.setText(replaceAll2);
        this.as.setBackgroundColor(this.az);
        this.f16503y.setVisibility(0);
        if (this.ax != null) {
            this.as.setVisibility(0);
            C1212c.m2873a((C7576b) this.f10377a).m10958e().m3037a(this.ax).m3034a(new C1248f().m2959e().m2949a(this.ay)).m3033a().m3031a(this.as);
        } else if (this.ay > 0) {
            this.as.setVisibility(0);
            C1212c.m2873a((C7576b) this.f10377a).m10950a(Integer.valueOf(this.ay)).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.as);
        } else {
            this.as.setVisibility(8);
            this.as.setImageBitmap(null);
        }
    }

    private void af() {
        JSONException e;
        C2976c a = C2980g.m7433a(this.f16490l);
        if (!(a == null || a.f9302v == null || a.f9302v.isEmpty())) {
            try {
                this.al = a.f9303w.m6880a();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            String str = a.f9303w.f8244a;
            String str2 = a.f9303w.f8246c;
            if (str != null) {
                ((C7576b) this.f10377a).runOnUiThread(new C33967(this.f16488j, str));
                if (!(str2 == null || str2.isEmpty())) {
                    this.au = str2;
                    this.f16457C = true;
                    C2969i i = C2966b.m7418i(str2);
                    if (i != null) {
                        this.f16503y.setVisibility(0);
                        Uri uri = null;
                        this.as.setImageBitmap(null);
                        this.av = i.f9232e;
                        this.aw = i.f9229b;
                        switch (i.f9234g) {
                            case LOCATION:
                                try {
                                    JSONObject jSONObject = new JSONObject(i.f9229b);
                                    str2 = jSONObject.getString("LOCATION_LATITUDE");
                                    try {
                                        str = jSONObject.getString("LOCATION_LONGITUDE");
                                    } catch (JSONException e3) {
                                        e2 = e3;
                                        e2.printStackTrace();
                                        str = null;
                                        this.ax = C4521o.m8235a(str2, str);
                                        this.aw = C4522p.m8236a(R.string.send_you_a_location);
                                        return;
                                    }
                                } catch (JSONException e4) {
                                    e2 = e4;
                                    str2 = null;
                                    e2.printStackTrace();
                                    str = null;
                                    this.ax = C4521o.m8235a(str2, str);
                                    this.aw = C4522p.m8236a(R.string.send_you_a_location);
                                    return;
                                }
                                this.ax = C4521o.m8235a(str2, str);
                                this.aw = C4522p.m8236a(R.string.send_you_a_location);
                            case TEXT:
                                this.as.setVisibility(8);
                                return;
                            case IMAGE:
                                if (i.f9231d != null) {
                                    str2 = i.f9231d;
                                } else {
                                    if (i.f9230c != null) {
                                        str2 = i.f9230c;
                                    }
                                    if (uri != null) {
                                        this.ax = uri.toString();
                                        return;
                                    }
                                }
                                uri = Uri.parse(str2);
                                if (uri != null) {
                                    this.ax = uri.toString();
                                    return;
                                }
                                break;
                            case GIF:
                                if (i.f9231d != null) {
                                    str2 = i.f9231d;
                                } else {
                                    if (i.f9230c != null) {
                                        str2 = i.f9230c;
                                    }
                                    if (uri != null) {
                                        this.ax = uri.toString();
                                        return;
                                    }
                                }
                                uri = Uri.parse(str2);
                                if (uri != null) {
                                    this.ax = uri.toString();
                                    return;
                                }
                                break;
                            case VIDEO:
                                if (i.f9231d != null) {
                                    str2 = i.f9231d;
                                } else {
                                    if (i.f9230c != null) {
                                        str2 = i.f9230c;
                                    }
                                    if (uri != null) {
                                        this.ax = uri.toString();
                                        return;
                                    }
                                }
                                uri = Uri.parse(str2);
                                if (uri != null) {
                                    this.ax = uri.toString();
                                    return;
                                }
                                break;
                            case STICKER:
                                if (i.f9231d != null) {
                                    str2 = i.f9231d;
                                } else {
                                    if (i.f9230c != null) {
                                        str2 = i.f9230c;
                                    }
                                    if (uri != null) {
                                        this.ax = uri.toString();
                                        return;
                                    }
                                }
                                uri = Uri.parse(str2);
                                if (uri != null) {
                                    this.ax = uri.toString();
                                    return;
                                }
                                break;
                            case FILE:
                                this.ax = null;
                                this.ay = R.drawable.ic_file_attach;
                                return;
                            case PUSH_TO_TALK:
                                this.ax = null;
                                this.ay = R.drawable.ic_ptt_play;
                                return;
                            case REPORT:
                                this.ax = null;
                                this.ay = 0;
                                this.aw = C4532q.m8242a((C7576b) this.f10377a, i.f9229b, C4226f.m8056a(i.f9235h), i.f9228a, i.f9232e);
                                return;
                            case VOTE:
                                this.ax = null;
                                this.ay = 0;
                                try {
                                    this.aw = PollUtils.PollDataParser(new JSONObject(i.f9229b)).f8400b;
                                    return;
                                } catch (Throwable e5) {
                                    C2480b.m6737b("Error in parsing poll data.", e5);
                                    return;
                                }
                            default:
                                return;
                        }
                        return;
                    }
                    this.f16503y.setVisibility(8);
                }
            }
        }
    }

    private int ag() {
        int i = this.f16498t;
        if (this.f16499u) {
            i = C3344e.m7825a(this.f16480Z);
        }
        this.f16501w.setHeight(i);
        this.f16501w.setSoftInputMode(3);
        this.f16501w.showAtLocation(this.f16480Z, 80, 0, 0);
        return i;
    }

    private void ah() {
        Intent intent = new Intent((C7576b) this.f10377a, AudioSelectorActivity.class);
        intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", 10);
        intent.putExtra("EXTRA_SELECT_MODE", 1);
        m13968a(intent, 218);
        m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
    }

    private void ai() {
        Intent intent = new Intent((C7576b) this.f10377a, FileSelectorActivity.class);
        intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", 10);
        intent.putExtra("EXTRA_SELECT_MODE", 1);
        m13968a(intent, 217);
        m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
    }

    private void aj() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 92);
        m14004e(bundle);
    }

    private static boolean ak() {
        return C4516l.m8232a() && !C2837a.m7169a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void al() {
        /*
        r9 = this;
        r0 = r9.m13933F();
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x0007:
        r0 = r9.ao();
        goto L_0x000d;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r2 = r9.an();
        r3 = r9.am();
        r4 = 1;
        if (r3 == 0) goto L_0x0020;
    L_0x0018:
        r3 = r9.mo3192P();
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r3 = r4;
        goto L_0x0021;
    L_0x0020:
        r3 = r1;
    L_0x0021:
        r5 = r9.f16460F;
        if (r5 == 0) goto L_0x0364;
    L_0x0025:
        r5 = r9.f16456B;
        r5 = r5.size();
        if (r5 != r4) goto L_0x0251;
    L_0x002d:
        r5 = new java.util.ArrayList;
        r6 = r9.f16456B;
        r6 = r6.values();
        r5.<init>(r6);
        r6 = r5.get(r1);
        r6 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r6;
        r7 = r6.f19503j;
        r7 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7821g(r7);
        if (r7 != 0) goto L_0x005c;
    L_0x0046:
        r0 = r9.f16460F;
        r0.setVisible(r1);
        r0 = r9.f16462H;
        r0.setVisible(r1);
        r0 = r9.f16463I;
        r0.setVisible(r1);
    L_0x0055:
        r0 = r9.f16464J;
    L_0x0057:
        r0.setVisible(r1);
        goto L_0x0225;
    L_0x005c:
        r8 = r9.m13933F();
        if (r8 == 0) goto L_0x0078;
    L_0x0062:
        r0 = r5.get(r1);
        r0 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r0;
        r0 = r0.m19056c();
        if (r0 != 0) goto L_0x0077;
    L_0x006e:
        r0 = r9.m13931D();
        if (r0 == 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0077;
    L_0x0075:
        r0 = r1;
        goto L_0x0078;
    L_0x0077:
        r0 = r4;
    L_0x0078:
        r5 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10123a;
        r8 = r7.ordinal();
        r5 = r5[r8];
        switch(r5) {
            case 1: goto L_0x01b0;
            case 2: goto L_0x0192;
            case 3: goto L_0x0110;
            case 4: goto L_0x0110;
            case 5: goto L_0x0110;
            case 6: goto L_0x00d2;
            case 7: goto L_0x01b0;
            case 8: goto L_0x00b3;
            case 9: goto L_0x00a3;
            case 10: goto L_0x0085;
            default: goto L_0x0083;
        };
    L_0x0083:
        goto L_0x0225;
    L_0x0085:
        r0 = r9.f16460F;
        r0.setVisible(r1);
        if (r3 == 0) goto L_0x0097;
    L_0x008c:
        r0 = r9.f16462H;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r0);
        r0 = r9.f16464J;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r0);
        goto L_0x009c;
    L_0x0097:
        r0 = r9.f16462H;
        r0.setVisible(r1);
    L_0x009c:
        r0 = r9.f16463I;
        r0.setVisible(r2);
        goto L_0x0225;
    L_0x00a3:
        r2 = r9.f16460F;
        r2.setVisible(r1);
        r2 = r9.f16462H;
        r2.setVisible(r3);
        r2 = r9.f16463I;
        r2.setVisible(r0);
        goto L_0x0055;
    L_0x00b3:
        r2 = r9.f16460F;
        r2.setVisible(r1);
        if (r3 == 0) goto L_0x00c0;
    L_0x00ba:
        r2 = r9.f16462H;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r2);
        goto L_0x00c5;
    L_0x00c0:
        r2 = r9.f16462H;
        r2.setVisible(r1);
    L_0x00c5:
        r2 = r9.f16463I;
        r2.setVisible(r0);
        r0 = r9.f16464J;
        r0.setVisible(r4);
    L_0x00cf:
        r0 = r9.ac;
        goto L_0x0057;
    L_0x00d2:
        r2 = r9.f16460F;
        r2.setVisible(r1);
        if (r3 == 0) goto L_0x00df;
    L_0x00d9:
        r2 = r9.f16462H;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r2);
        goto L_0x00e4;
    L_0x00df:
        r2 = r9.f16462H;
        r2.setVisible(r1);
    L_0x00e4:
        r2 = r9.f16463I;
        r2.setVisible(r0);
        r0 = r9.f16464J;
        r0.setVisible(r4);
        r0 = r9.aq();
        if (r0 == 0) goto L_0x0107;
    L_0x00f4:
        r0 = r9.f16465K;
        r0.setShowAsAction(r1);
        r0 = r9.ad;
        r0.setShowAsAction(r1);
        r0 = r9.ad;
        r0.setVisible(r4);
        r0 = r9.f16465K;
        goto L_0x01ab;
    L_0x0107:
        r0 = r9.ad;
        r0.setVisible(r1);
        r0 = r9.f16465K;
        goto L_0x0057;
    L_0x0110:
        r2 = r9.ad;
        r2.setVisible(r1);
        r2 = r9.m13933F();
        if (r2 != 0) goto L_0x016d;
    L_0x011b:
        r2 = r9.m13932E();
        if (r2 == 0) goto L_0x0122;
    L_0x0121:
        goto L_0x016d;
    L_0x0122:
        r2 = r9.ae;
        r2.setShowAsAction(r1);
        r2 = r9.ac;
        r2.setVisible(r4);
        r2 = r9.ab;
        r2.setVisible(r1);
        r2 = r9.f16460F;
        r2.setShowAsAction(r1);
        r2 = r9.ac();
        if (r2 == 0) goto L_0x0152;
    L_0x013c:
        r2 = r6.f19503j;
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7820f(r2);
        if (r2 == 0) goto L_0x0152;
    L_0x0144:
        r2 = r6;
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r2;
        r2 = r2.mo3627d();
        if (r2 != 0) goto L_0x0152;
    L_0x014d:
        r2 = r9.ab;
        r2.setVisible(r4);
    L_0x0152:
        r2 = r9.ae;
        r2.setVisible(r1);
        r2 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10124b;
        r5 = r6;
        r5 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r5;
        r5 = r5.f21340z;
        r5 = r5.ordinal();
        r2 = r2[r5];
        if (r2 == r4) goto L_0x0167;
    L_0x0166:
        goto L_0x017c;
    L_0x0167:
        r2 = r9.ae;
        r2.setVisible(r4);
        goto L_0x017c;
    L_0x016d:
        r2 = r9.ac;
        r2.setVisible(r1);
        r2 = r9.ab;
        r2.setVisible(r1);
        r2 = r9.ae;
        r2.setVisible(r1);
    L_0x017c:
        r2 = r6.f19503j;
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7809a(r2);
        if (r2 == 0) goto L_0x018a;
    L_0x0184:
        r2 = r9.f16460F;
        r2.setVisible(r4);
        goto L_0x018f;
    L_0x018a:
        r2 = r9.f16460F;
        r2.setVisible(r1);
    L_0x018f:
        if (r3 == 0) goto L_0x019f;
    L_0x0191:
        goto L_0x0199;
    L_0x0192:
        r2 = r9.f16460F;
        r2.setVisible(r4);
        if (r3 == 0) goto L_0x019f;
    L_0x0199:
        r2 = r9.f16462H;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r2);
        goto L_0x01a4;
    L_0x019f:
        r2 = r9.f16462H;
        r2.setVisible(r1);
    L_0x01a4:
        r2 = r9.f16463I;
        r2.setVisible(r0);
        r0 = r9.f16464J;
    L_0x01ab:
        r0.setVisible(r4);
        goto L_0x0225;
    L_0x01b0:
        r2 = r9.f16460F;
        r5 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7810a(r6);
        r2.setVisible(r5);
        if (r3 == 0) goto L_0x01c1;
    L_0x01bb:
        r2 = r9.f16462H;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13905a(r6, r2);
        goto L_0x01c6;
    L_0x01c1:
        r2 = r9.f16462H;
        r2.setVisible(r1);
    L_0x01c6:
        r2 = r9.f16463I;
        r2.setVisible(r0);
        r0 = r9.f16464J;
        r0.setVisible(r4);
        r0 = r9.aq();
        if (r0 == 0) goto L_0x00cf;
    L_0x01d6:
        r0 = r9.ac;
        r0.setShowAsAction(r1);
        r0 = r9.ac;
        r0.setVisible(r4);
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;
        if (r7 != r0) goto L_0x0221;
    L_0x01e4:
        r0 = r6.m19056c();
        if (r0 == 0) goto L_0x01f5;
    L_0x01ea:
        r0 = r9.f16461G;
        r0.setShowAsAction(r1);
        r0 = r9.f16461G;
        r0.setVisible(r4);
        goto L_0x01fa;
    L_0x01f5:
        r0 = r9.f16461G;
        r0.setVisible(r1);
    L_0x01fa:
        r0 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10124b;
        r2 = r6;
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r2;
        r2 = r2.f21340z;
        r2 = r2.ordinal();
        r0 = r0[r2];
        if (r0 == r4) goto L_0x020a;
    L_0x0209:
        goto L_0x0225;
    L_0x020a:
        r0 = r9.ae;
        r0.setShowAsAction(r1);
        r0 = r9.ae;
        r0.setVisible(r4);
        r0 = r9.ae;
        r2 = 2131690489; // 0x7f0f03f9 float:1.9010023E38 double:1.053195038E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r0.setTitle(r2);
        goto L_0x0225;
    L_0x0221:
        r0 = r9.ae;
        goto L_0x0057;
    L_0x0225:
        r0 = r9.aq();
        if (r0 == 0) goto L_0x0352;
    L_0x022b:
        r0 = r9;
        r0 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r0;
        r0 = r0.ai;
        r2 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r0 != r2) goto L_0x0243;
    L_0x0234:
        r0 = r6.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7819e(r0);
        if (r0 == 0) goto L_0x0352;
    L_0x023c:
        r0 = r9.f16463I;
        r0.setVisible(r1);
        goto L_0x0352;
    L_0x0243:
        r2 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r0 != r2) goto L_0x0352;
    L_0x0247:
        r0 = r6.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7818d(r0);
        if (r0 == 0) goto L_0x0352;
    L_0x024f:
        goto L_0x0321;
    L_0x0251:
        r2 = r9.ac;
        r2.setVisible(r1);
        r2 = r9.ab;
        r2.setVisible(r1);
        r2 = r9.ad;
        r2.setVisible(r1);
        r2 = r9.ae;
        r2.setVisible(r1);
        r2 = r9.m13933F();
        if (r2 == 0) goto L_0x028b;
    L_0x026b:
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15906l;
        r3 = mobi.mmdt.ott.MyApplication.f15884j;
        r2 = r2[r3];
        r3 = r9 instanceof mobi.mmdt.ott.view.conversation.activities.p419a.C6876e;
        if (r3 == 0) goto L_0x028b;
    L_0x0279:
        r0 = r9.ap();
        if (r0 != 0) goto L_0x028a;
    L_0x027f:
        r0 = r9.f16456B;
        r0 = r0.size();
        if (r2 != r0) goto L_0x0288;
    L_0x0287:
        goto L_0x028a;
    L_0x0288:
        r0 = r1;
        goto L_0x028b;
    L_0x028a:
        r0 = r4;
    L_0x028b:
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15906l;
        r3 = mobi.mmdt.ott.MyApplication.f15875a;
        r2 = r2[r3];
        r3 = mobi.mmdt.ott.MyApplication.m12950a();
        r3 = r3.f15906l;
        r5 = mobi.mmdt.ott.MyApplication.f15882h;
        r3 = r3[r5];
        r5 = mobi.mmdt.ott.MyApplication.m12950a();
        r5 = r5.f15906l;
        r6 = mobi.mmdt.ott.MyApplication.f15876b;
        r5 = r5[r6];
        r6 = mobi.mmdt.ott.MyApplication.m12950a();
        r6 = r6.f15906l;
        r7 = mobi.mmdt.ott.MyApplication.f15878d;
        r6 = r6[r7];
        if (r2 > 0) goto L_0x02b7;
    L_0x02b5:
        if (r3 <= 0) goto L_0x02c1;
    L_0x02b7:
        if (r6 != 0) goto L_0x02c1;
    L_0x02b9:
        if (r5 != 0) goto L_0x02c1;
    L_0x02bb:
        r2 = r9.f16460F;
        r2.setVisible(r4);
        goto L_0x02c6;
    L_0x02c1:
        r2 = r9.f16460F;
        r2.setVisible(r1);
    L_0x02c6:
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15906l;
        r3 = mobi.mmdt.ott.MyApplication.f15881g;
        r2 = r2[r3];
        if (r2 > 0) goto L_0x02e7;
    L_0x02d2:
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15906l;
        r3 = mobi.mmdt.ott.MyApplication.f15877c;
        r2 = r2[r3];
        if (r2 > 0) goto L_0x02e7;
    L_0x02de:
        if (r6 <= 0) goto L_0x02e1;
    L_0x02e0:
        goto L_0x02e7;
    L_0x02e1:
        r2 = r9.f16464J;
        r2.setVisible(r4);
        goto L_0x02ec;
    L_0x02e7:
        r2 = r9.f16464J;
        r2.setVisible(r1);
    L_0x02ec:
        r2 = r9.f16462H;
        r2.setVisible(r1);
        r2 = r9.f16461G;
        r2.setVisible(r1);
        r2 = r9.f16463I;
        r2.setVisible(r0);
        r0 = r9.f16465K;
        r0.setVisible(r1);
        r0 = r9.aq();
        if (r0 == 0) goto L_0x0352;
    L_0x0306:
        r0 = r9;
        r0 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r0;
        r0 = r0.ai;
        r2 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r0 != r2) goto L_0x032a;
    L_0x030f:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r2 = mobi.mmdt.ott.MyApplication.f15883i;
        r0 = r0[r2];
        r2 = r9.f16456B;
        r2 = r2.size();
        if (r0 != r2) goto L_0x0327;
    L_0x0321:
        r0 = r9.f16463I;
        r0.setVisible(r4);
        goto L_0x0352;
    L_0x0327:
        if (r0 != 0) goto L_0x023c;
    L_0x0329:
        goto L_0x0321;
    L_0x032a:
        r2 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r0 != r2) goto L_0x033b;
    L_0x032e:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r2 = mobi.mmdt.ott.MyApplication.f15879e;
        r0 = r0[r2];
        if (r0 != 0) goto L_0x023c;
    L_0x033a:
        goto L_0x0321;
    L_0x033b:
        r2 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r0 != r2) goto L_0x0352;
    L_0x033f:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r2 = mobi.mmdt.ott.MyApplication.f15880f;
        r0 = r0[r2];
        r2 = r9.f16456B;
        r2 = r2.size();
        if (r0 != r2) goto L_0x023c;
    L_0x0351:
        goto L_0x0321;
    L_0x0352:
        r0 = r9.aq();
        if (r0 == 0) goto L_0x0364;
    L_0x0358:
        r0 = r9;
        r0 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r0;
        r0 = r0.ah;
        if (r0 != 0) goto L_0x0364;
    L_0x035f:
        r0 = r9.f16462H;
        r0.setVisible(r1);
    L_0x0364:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.al():void");
    }

    private boolean am() {
        if (m13933F() && (this instanceof C6876e)) {
            if (((C6876e) this).ah == C3004f.NONE) {
                return false;
            }
        }
        return true;
    }

    private boolean an() {
        if (!((aq() && ((C6875d) this).af()) || this.f16458D == C2973m.SINGLE)) {
            if (!m13933F()) {
                return false;
            }
        }
        return true;
    }

    private boolean ao() {
        if (aq()) {
            if (!((C6875d) this).af()) {
                return false;
            }
        }
        return true;
    }

    private boolean ap() {
        C3004f c3004f = ((C6876e) this).ah;
        if (c3004f != C3004f.OWNER) {
            if (c3004f != C3004f.ADMIN) {
                return false;
            }
        }
        return true;
    }

    private boolean aq() {
        if (!(this.f16458D == C2973m.CHANNEL || this.f16458D == C2973m.CHANNEL_REPLY)) {
            if (this.f16458D != C2973m.CHANNEL_DIRECT) {
                return false;
            }
        }
        return true;
    }

    private CalligraphyTypefaceSpan ar() {
        AssetManager assets = ((C7576b) this.f10377a).getAssets();
        StringBuilder stringBuilder = new StringBuilder("fonts/");
        stringBuilder.append(C2535a.m6888a().at());
        return new CalligraphyTypefaceSpan(TypefaceUtils.load(assets, stringBuilder.toString()));
    }

    private void m13910b(int i, boolean z, boolean z2, boolean z3) {
        this.f16485g.m14086a(i, z, z2, z3);
    }

    private void m13911b(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        if (this.f16457C) {
            mo3207a(str, str2, c2988j, this.au, c2731a, z);
            mo3231b(false);
            return;
        }
        mo3208a(str, str2, c2988j, c2731a, z);
    }

    private void m13912b(ArrayList<C7197a> arrayList) {
        Bundle bundle;
        if (!m13932E()) {
            if (!m13933F()) {
                if (this instanceof C6875d) {
                    String str;
                    String a;
                    bundle = new Bundle();
                    bundle.putInt("dialog_id", 96);
                    C7197a c7197a = (C7197a) arrayList.get(0);
                    boolean c = C3337b.m7815c(c7197a.f19503j);
                    if (((C6875d) this).ai == C3004f.MEMBER) {
                        bundle.putStringArray("KEY_DIALOG_LONG_ARRAY_CHANNEL_MESSAGE_IDS", new String[]{((C7197a) arrayList.get(0)).f20777c});
                    } else if (c) {
                        String[] strArr = new String[]{((C7197a) arrayList.get(0)).f20777c};
                        bundle.putBoolean("KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE", true);
                        bundle.putStringArray("KEY_DIALOG_LONG_ARRAY_CHANNEL_MESSAGE_IDS", strArr);
                    } else {
                        bundle.putString("KEY_DIALOG_GET_CHANNEL_MESSAGE_ID", c7197a.f20777c);
                        str = "KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_DELETE_MESSAGE";
                        a = C4522p.m8236a(R.string.are_you_sure_to_delete_this_message_admin_or_owner);
                        bundle.putString(str, a);
                        m14004e(bundle);
                    }
                    str = "KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_DELETE_MESSAGE";
                    a = C4522p.m8236a(R.string.are_you_sure_to_delete_this_message);
                    bundle.putString(str, a);
                    m14004e(bundle);
                }
                return;
            }
        }
        C7197a c7197a2 = (C7197a) arrayList.get(0);
        bundle = new Bundle();
        bundle.putInt("dialog_id", 93);
        boolean z = (m13933F() && m13931D()) || c7197a2.m19056c();
        m13907a(z, bundle);
        bundle.putBoolean("KEY_DIALOG_DELETE_IS_OUTPUT", z);
        bundle.putStringArray("KEY_DIALOG_GET_VIEW_MODEL_ID", new String[]{c7197a2.f20777c});
        m14004e(bundle);
    }

    static /* synthetic */ void m13913b(C6123a c6123a) {
        if (c6123a.f16504z != null) {
            c6123a.f16504z.finish();
        }
        c6123a.at.setVisibility(0);
        c6123a.aa();
        c6123a.f16469O = false;
        C6127a c6127a = c6123a.f16488j;
        c6127a.f16521h = false;
        c6127a.f16520g = true;
        c6127a.f16517d.setImageResource(R.drawable.ic_content_send);
        C2491i.m6801a(c6127a.f16517d, UIThemeManager.getmInstance().getText_primary_color());
        c6127a.f16518e.setVisibility(0);
        if (c6127a.f16523j != null) {
            c6127a.f16523j.m7843d();
        }
    }

    static /* synthetic */ void m13914b(C6123a c6123a, int i) {
        if (i != 172) {
            if (i != 173) {
                if (C6123a.ak()) {
                    c6123a.aj();
                    return;
                } else {
                    c6123a.m13919c(i);
                    return;
                }
            }
        }
        c6123a.m13919c(i);
    }

    private void m13917b(C7197a c7197a, boolean z) {
        int i = z ? 1 : -1;
        if (m13933F() && (this instanceof C6876e) && !ap() && c7197a.m19056c()) {
            int[] iArr = MyApplication.m12950a().f15906l;
            int i2 = MyApplication.f15884j;
            iArr[i2] = iArr[i2] + i;
        }
    }

    private void mo3231b(boolean z) {
        this.f16457C = false;
        this.au = null;
        if (z) {
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ C6123a f10105a;

                {
                    this.f10105a = r1;
                }

                public final void run() {
                    View view = this.f10105a.f16503y;
                    C6060a a = C3110a.m7562a(new C6065c());
                    a.f9674c = 500;
                    a.f9676e = new AccelerateDecelerateInterpolator();
                    a.m7561a(view);
                }
            }, 50);
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ C6123a f10127a;

                {
                    this.f10127a = r1;
                }

                public final void run() {
                    this.f10127a.m14020i();
                }
            }, 550);
        } else {
            m14020i();
        }
        if (aq() && ((C6875d) this).aB) {
            m13939L();
        }
    }

    private void m13919c(int i) {
        Intent intent = new Intent((C7576b) this.f10377a, MediaCaptionActivity.class);
        intent.putExtra("KEY_REQUEST_CODE", i);
        intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", 10);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C4522p.m8236a(R.string.send_to));
        stringBuilder.append(" ");
        stringBuilder.append(m14027n());
        intent.putExtra("EXTRA_SELECTOR_TITLE", stringBuilder.toString());
        m13968a(intent, 215);
        m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13922d(mobi.mmdt.ott.view.conversation.p573f.C7197a r2) {
        /*
        r0 = r2.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7821g(r0);
        if (r0 == 0) goto L_0x015b;
    L_0x0008:
        r1 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10123a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 7;
        if (r0 == r1) goto L_0x0017;
    L_0x0013:
        switch(r0) {
            case 2: goto L_0x0017;
            case 3: goto L_0x0017;
            case 4: goto L_0x0017;
            case 5: goto L_0x0017;
            default: goto L_0x0016;
        };
    L_0x0016:
        return;
    L_0x0017:
        r0 = r2.f19503j;
        switch(r0) {
            case 12: goto L_0x0141;
            case 13: goto L_0x013c;
            case 14: goto L_0x0137;
            case 15: goto L_0x0132;
            case 16: goto L_0x012d;
            case 17: goto L_0x0128;
            case 18: goto L_0x0123;
            case 19: goto L_0x011e;
            default: goto L_0x001c;
        };
    L_0x001c:
        switch(r0) {
            case 42: goto L_0x0119;
            case 43: goto L_0x0114;
            case 44: goto L_0x010f;
            case 45: goto L_0x010a;
            case 46: goto L_0x0105;
            case 47: goto L_0x0100;
            case 48: goto L_0x00fb;
            case 49: goto L_0x00f6;
            default: goto L_0x001f;
        };
    L_0x001f:
        switch(r0) {
            case 72: goto L_0x00f1;
            case 73: goto L_0x00ec;
            case 74: goto L_0x00e7;
            case 75: goto L_0x00e1;
            case 76: goto L_0x00db;
            case 77: goto L_0x00d5;
            case 78: goto L_0x00cf;
            case 79: goto L_0x00c9;
            default: goto L_0x0022;
        };
    L_0x0022:
        switch(r0) {
            case 82: goto L_0x00c3;
            case 83: goto L_0x00bd;
            case 84: goto L_0x00b7;
            case 85: goto L_0x00b1;
            case 86: goto L_0x00ab;
            case 87: goto L_0x00a5;
            case 88: goto L_0x009f;
            case 89: goto L_0x0099;
            default: goto L_0x0025;
        };
    L_0x0025:
        switch(r0) {
            case 112: goto L_0x0093;
            case 113: goto L_0x008d;
            case 114: goto L_0x0087;
            case 115: goto L_0x0081;
            case 116: goto L_0x007b;
            case 117: goto L_0x0075;
            case 118: goto L_0x006f;
            case 119: goto L_0x0069;
            default: goto L_0x0028;
        };
    L_0x0028:
        switch(r0) {
            case 1111: goto L_0x0063;
            case 1115: goto L_0x005d;
            case 4111: goto L_0x0057;
            case 4115: goto L_0x0051;
            case 7111: goto L_0x004b;
            case 7115: goto L_0x0045;
            case 8111: goto L_0x003f;
            case 8115: goto L_0x0039;
            case 11111: goto L_0x0033;
            case 111115: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0148;
    L_0x002d:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d) r2;
        r2 = r2.f23602T;
        goto L_0x0145;
    L_0x0033:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d) r2;
        r2 = r2.f23791T;
        goto L_0x0145;
    L_0x0039:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m) r2;
        r2 = r2.f23670U;
        goto L_0x0145;
    L_0x003f:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m) r2;
        r2 = r2.f23859U;
        goto L_0x0145;
    L_0x0045:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f) r2;
        r2 = r2.f23621U;
        goto L_0x0145;
    L_0x004b:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f) r2;
        r2 = r2.f23810U;
        goto L_0x0145;
    L_0x0051:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7649c) r2;
        r2 = r2.f23589P;
        goto L_0x0145;
    L_0x0057:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7675c) r2;
        r2 = r2.f23778P;
        goto L_0x0145;
    L_0x005d:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l) r2;
        r2 = r2.f23663P;
        goto L_0x0145;
    L_0x0063:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l) r2;
        r2 = r2.f23852P;
        goto L_0x0145;
    L_0x0069:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d) r2;
        r2 = r2.f23447T;
        goto L_0x0145;
    L_0x006f:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d) r2;
        r2 = r2.f23376U;
        goto L_0x0145;
    L_0x0075:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d) r2;
        r2 = r2.f24240T;
        goto L_0x0145;
    L_0x007b:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d) r2;
        r2 = r2.f24138U;
        goto L_0x0145;
    L_0x0081:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d) r2;
        r2 = r2.f23263T;
        goto L_0x0145;
    L_0x0087:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d) r2;
        r2 = r2.f23159U;
        goto L_0x0145;
    L_0x008d:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7637d) r2;
        r2 = r2.f23527U;
        goto L_0x0145;
    L_0x0093:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7663d) r2;
        r2 = r2.f23701U;
        goto L_0x0145;
    L_0x0099:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m) r2;
        r2 = r2.f23501U;
        goto L_0x0145;
    L_0x009f:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m) r2;
        r2 = r2.f23422U;
        goto L_0x0145;
    L_0x00a5:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l) r2;
        r2 = r2.f24317U;
        goto L_0x0145;
    L_0x00ab:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l) r2;
        r2 = r2.f24200U;
        goto L_0x0145;
    L_0x00b1:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m) r2;
        r2 = r2.f23342U;
        goto L_0x0145;
    L_0x00b7:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m) r2;
        r2 = r2.f23223U;
        goto L_0x0145;
    L_0x00bd:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7646m) r2;
        r2 = r2.f23573U;
        goto L_0x0145;
    L_0x00c3:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7672m) r2;
        r2 = r2.f23758U;
        goto L_0x0145;
    L_0x00c9:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f) r2;
        r2 = r2.f23462U;
        goto L_0x0145;
    L_0x00cf:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f) r2;
        r2 = r2.f23388U;
        goto L_0x0145;
    L_0x00d5:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f) r2;
        r2 = r2.f24263U;
        goto L_0x0145;
    L_0x00db:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f) r2;
        r2 = r2.f24156U;
        goto L_0x0145;
    L_0x00e1:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f) r2;
        r2 = r2.f23286U;
        goto L_0x0145;
    L_0x00e7:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f) r2;
        r2 = r2.f23177U;
        goto L_0x0145;
    L_0x00ec:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7639f) r2;
        r2 = r2.f23539U;
        goto L_0x0145;
    L_0x00f1:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7665f) r2;
        r2 = r2.f23717U;
        goto L_0x0145;
    L_0x00f6:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7623c) r2;
        r2 = r2.f23437Q;
        goto L_0x0145;
    L_0x00fb:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7610c) r2;
        r2 = r2.f23366Q;
        goto L_0x0145;
    L_0x0100:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7711c) r2;
        r2 = r2.f24226Q;
        goto L_0x0145;
    L_0x0105:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7699c) r2;
        r2 = r2.f24126Q;
        goto L_0x0145;
    L_0x010a:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7597c) r2;
        r2 = r2.f23248P;
        goto L_0x0145;
    L_0x010f:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7584c) r2;
        r2 = r2.f23147Q;
        goto L_0x0145;
    L_0x0114:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7636c) r2;
        r2 = r2.f23516P;
        goto L_0x0145;
    L_0x0119:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7662c) r2;
        r2 = r2.f23689P;
        goto L_0x0145;
    L_0x011e:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7632l) r2;
        r2 = r2.f23494P;
        goto L_0x0145;
    L_0x0123:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l) r2;
        r2 = r2.f23415P;
        goto L_0x0145;
    L_0x0128:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k) r2;
        r2 = r2.f24310P;
        goto L_0x0145;
    L_0x012d:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k) r2;
        r2 = r2.f24193P;
        goto L_0x0145;
    L_0x0132:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l) r2;
        r2 = r2.f23335P;
        goto L_0x0145;
    L_0x0137:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l) r2;
        r2 = r2.f23216P;
        goto L_0x0145;
    L_0x013c:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7645l) r2;
        r2 = r2.f23566P;
        goto L_0x0145;
    L_0x0141:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7671l) r2;
        r2 = r2.f23751P;
    L_0x0145:
        mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7806a(r2);
    L_0x0148:
        r2 = mobi.mmdt.ott.MyApplication.m12952b();
        r0 = 2131690152; // 0x7f0f02a8 float:1.900934E38 double:1.0531948717E-314;
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r1 = 0;
        r2 = android.widget.Toast.makeText(r2, r0, r1);
        r2.show();
    L_0x015b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.d(mobi.mmdt.ott.view.conversation.f.a):void");
    }

    private void m13923j(String str, String str2) {
        m13911b(str, str2, C2988j.OTHER, null, false);
    }

    private void m13924j(C7197a c7197a) {
        if (aq() && ((C6875d) this).aB && c7197a.m19056c()) {
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.interactive_warn), 0).show();
            return;
        }
        C1274i a;
        C1248f a2;
        m13938K();
        if (!this.f16499u) {
            this.f16488j.m14067d((C7576b) this.f10377a);
        }
        if (mo3198V()) {
            this.f16488j.m14070f();
            mo3194R();
            mo3199W();
            this.f16491m.clear();
        }
        this.f16457C = true;
        this.au = c7197a.f20777c;
        this.av = c7197a instanceof C7359a ? "Event" : ((C7358a) c7197a).f21335u;
        this.aw = "";
        this.ax = "";
        this.ay = -1;
        this.az = 0;
        Bundle a3 = C3337b.m7797a((C7576b) this.f10377a, c7197a);
        this.aw = a3.getString("REPLY_BOTTOM_TEXT");
        this.ax = a3.getString("REPLY_IMAGE_URI");
        this.ay = a3.getInt("REPLY_IMAGE_URI");
        this.az = a3.getInt("REPLY_IMAGE_RES_ID");
        if (this.f16458D == null || !(this.f16458D == C2973m.CHANNEL || this.f16458D == C2973m.CHANNEL_DIRECT || this.f16458D == C2973m.CHANNEL_REPLY)) {
            this.aq.setVisibility(0);
        } else {
            C3004f c3004f = ((C6875d) this).ai;
            if (c3004f != null && (c3004f == C3004f.MEMBER || c3004f == C3004f.VISITOR || c3004f == C3004f.NONE)) {
                this.aq.setVisibility(8);
            }
        }
        CharSequence replaceAll = this.av != null ? Normalizer.normalize(this.av, Form.NFD).replaceAll("[\n]", " ") : "";
        CharSequence replaceAll2 = this.aw != null ? Normalizer.normalize(this.aw, Form.NFD).replaceAll("[\n]", " ") : "";
        this.aq.setText(replaceAll);
        this.ar.setText(replaceAll2);
        this.as.setBackgroundColor(this.az);
        if (this.ax != null) {
            this.as.setVisibility(0);
            a = C1212c.m2873a((C7576b) this.f10377a).m10958e().m3037a(this.ax);
            a2 = new C1248f().m2959e().m2949a(this.ay);
        } else if (this.ay > 0) {
            this.as.setVisibility(0);
            a = C1212c.m2873a((C7576b) this.f10377a).m10950a(Integer.valueOf(this.ay));
            a2 = new C1248f().m2959e();
        } else {
            this.as.setVisibility(8);
            this.as.setImageBitmap(null);
            this.f16503y.setVisibility(0);
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ C6123a f10072a;

                {
                    this.f10072a = r1;
                }

                public final void run() {
                    C4144a.m8009e(this.f10072a.f16503y);
                }
            }, 50);
        }
        a.m3034a(a2).m3033a().m3031a(this.as);
        this.f16503y.setVisibility(0);
        new Handler().postDelayed(/* anonymous class already generated */, 50);
    }

    private void m13925k(C7197a c7197a) {
        boolean z;
        this.aD = c7197a.f20777c;
        this.at.setVisibility(8);
        this.f16496r.setNavigationIcon((int) R.drawable.ic_close_gray);
        if (this.f16496r.getNavigationIcon() != null) {
            C2491i.m6790a(this.f16496r.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C4522p.m8236a(R.string.action_edit));
        spannableStringBuilder.setSpan(ar(), 0, spannableStringBuilder.length(), 33);
        this.f16496r.setTitle(spannableStringBuilder);
        this.f16496r.setTitleTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
        this.f16469O = true;
        if (this.f16457C) {
            m14020i();
        }
        if (mo3198V()) {
            this.f16488j.m14070f();
            mo3199W();
            this.f16491m.clear();
            ab();
            if (!this.f16499u) {
                this.f16488j.m14067d((C7576b) this.f10377a);
            }
        }
        mo3202Z();
        int i = c7197a.f19503j;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                z = true;
                break;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        switch (i) {
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                            default:
                                switch (i) {
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                        break;
                                    default:
                                        switch (i) {
                                            case 74:
                                            case 75:
                                            case 76:
                                            case 77:
                                            case 78:
                                            case 79:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 104:
                                                            case 105:
                                                            case 106:
                                                            case 107:
                                                            case 108:
                                                            case 109:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 114:
                                                                    case 115:
                                                                    case 116:
                                                                    case 117:
                                                                    case 118:
                                                                    case 119:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 1111:
                                                                            case 1115:
                                                                            case 2111:
                                                                            case 2115:
                                                                            case 3111:
                                                                            case 3115:
                                                                            case 4111:
                                                                            case 4115:
                                                                            case 7111:
                                                                            case 7115:
                                                                            case 8111:
                                                                            case 8115:
                                                                            case 10111:
                                                                            case 10115:
                                                                            case 11111:
                                                                            case 111115:
                                                                                break;
                                                                            default:
                                                                                z = false;
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
                z = true;
                break;
        }
        if (z) {
            C3346g c3346g;
            this.aE = c7197a.f19503j;
            i = this.aE;
            switch (i) {
                case 14:
                    c3346g = new C3346g(((C7593l) c7197a).f23216P, Boolean.valueOf(false));
                    break;
                case 15:
                    c3346g = new C3346g(((C7606l) c7197a).f23335P, Boolean.valueOf(false));
                    break;
                case 16:
                    c3346g = new C3346g(((C7707k) c7197a).f24193P, Boolean.valueOf(false));
                    break;
                case 17:
                    c3346g = new C3346g(((C7719k) c7197a).f24310P, Boolean.valueOf(false));
                    break;
                case 18:
                    c3346g = new C3346g(((C7619l) c7197a).f23415P, Boolean.valueOf(false));
                    break;
                case 19:
                    c3346g = new C3346g(((C7632l) c7197a).f23494P, Boolean.valueOf(false));
                    break;
                default:
                    C3346g c3346g2;
                    switch (i) {
                        case 24:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        case 25:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        case 26:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        case 27:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        case 28:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        case 29:
                            c3346g2 = new C3346g("", Boolean.valueOf(true));
                            break;
                        default:
                            switch (i) {
                                case 34:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                case 35:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                case 36:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                case 37:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                case 38:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                case 39:
                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                    break;
                                default:
                                    switch (i) {
                                        case 44:
                                            c3346g = new C3346g(((C7584c) c7197a).f23147Q, Boolean.valueOf(true));
                                            break;
                                        case 45:
                                            c3346g = new C3346g(((C7597c) c7197a).f23248P, Boolean.valueOf(true));
                                            break;
                                        case 46:
                                            c3346g = new C3346g(((C7699c) c7197a).f24126Q, Boolean.valueOf(true));
                                            break;
                                        case 47:
                                            c3346g = new C3346g(((C7711c) c7197a).f24226Q, Boolean.valueOf(true));
                                            break;
                                        case 48:
                                            c3346g = new C3346g(((C7610c) c7197a).f23366Q, Boolean.valueOf(true));
                                            break;
                                        case 49:
                                            c3346g = new C3346g(((C7623c) c7197a).f23437Q, Boolean.valueOf(true));
                                            break;
                                        default:
                                            switch (i) {
                                                case 74:
                                                    c3346g = new C3346g(((C7587f) c7197a).f23177U, Boolean.valueOf(true));
                                                    break;
                                                case 75:
                                                    c3346g = new C3346g(((C7600f) c7197a).f23286U, Boolean.valueOf(true));
                                                    break;
                                                case 76:
                                                    c3346g = new C3346g(((C7702f) c7197a).f24156U, Boolean.valueOf(true));
                                                    break;
                                                case 77:
                                                    c3346g = new C3346g(((C7714f) c7197a).f24263U, Boolean.valueOf(true));
                                                    break;
                                                case 78:
                                                    c3346g = new C3346g(((C7613f) c7197a).f23388U, Boolean.valueOf(true));
                                                    break;
                                                case 79:
                                                    c3346g = new C3346g(((C7626f) c7197a).f23462U, Boolean.valueOf(true));
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 84:
                                                            c3346g = new C3346g(((C7594m) c7197a).f23223U, Boolean.valueOf(true));
                                                            break;
                                                        case 85:
                                                            c3346g = new C3346g(((C7607m) c7197a).f23342U, Boolean.valueOf(true));
                                                            break;
                                                        case 86:
                                                            c3346g = new C3346g(((C7708l) c7197a).f24200U, Boolean.valueOf(true));
                                                            break;
                                                        case 87:
                                                            c3346g = new C3346g(((C7720l) c7197a).f24317U, Boolean.valueOf(true));
                                                            break;
                                                        case 88:
                                                            c3346g = new C3346g(((C7620m) c7197a).f23422U, Boolean.valueOf(true));
                                                            break;
                                                        case 89:
                                                            c3346g = new C3346g(((C7633m) c7197a).f23501U, Boolean.valueOf(true));
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 104:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                case 105:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                case 106:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                case 107:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                case 108:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                case 109:
                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 114:
                                                                            c3346g = new C3346g(((C7585d) c7197a).f23159U, Boolean.valueOf(true));
                                                                            break;
                                                                        case 115:
                                                                            c3346g = new C3346g(((C7598d) c7197a).f23263T, Boolean.valueOf(true));
                                                                            break;
                                                                        case 116:
                                                                            c3346g = new C3346g(((C7700d) c7197a).f24138U, Boolean.valueOf(true));
                                                                            break;
                                                                        case 117:
                                                                            c3346g = new C3346g(((C7712d) c7197a).f24240T, Boolean.valueOf(true));
                                                                            break;
                                                                        case 118:
                                                                            c3346g = new C3346g(((C7611d) c7197a).f23376U, Boolean.valueOf(true));
                                                                            break;
                                                                        case 119:
                                                                            c3346g = new C3346g(((C7624d) c7197a).f23447T, Boolean.valueOf(true));
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 1111:
                                                                                    c3346g = new C3346g(((C7684l) c7197a).f23852P, Boolean.valueOf(false));
                                                                                    break;
                                                                                case 1115:
                                                                                    c3346g = new C3346g(((C7658l) c7197a).f23663P, Boolean.valueOf(false));
                                                                                    break;
                                                                                case 2111:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 2115:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 3111:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 3115:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 4111:
                                                                                    c3346g = new C3346g(((C7675c) c7197a).f23778P, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 4115:
                                                                                    c3346g = new C3346g(((C7649c) c7197a).f23589P, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 7111:
                                                                                    c3346g = new C3346g(((C7678f) c7197a).f23810U, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 7115:
                                                                                    c3346g = new C3346g(((C7652f) c7197a).f23621U, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 8111:
                                                                                    c3346g = new C3346g(((C7685m) c7197a).f23859U, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 8115:
                                                                                    c3346g = new C3346g(((C7659m) c7197a).f23670U, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 10111:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 10115:
                                                                                    c3346g2 = new C3346g("", Boolean.valueOf(true));
                                                                                    break;
                                                                                case 11111:
                                                                                    c3346g = new C3346g(((C7676d) c7197a).f23791T, Boolean.valueOf(true));
                                                                                    break;
                                                                                case 111115:
                                                                                    c3346g = new C3346g(((C7650d) c7197a).f23602T, Boolean.valueOf(true));
                                                                                    break;
                                                                                default:
                                                                                    c3346g2 = null;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                    c3346g = c3346g2;
                    break;
            }
            if (c3346g != null) {
                String str = (String) c3346g.f10273a;
                z = ((Boolean) c3346g.f10274b).booleanValue();
                ((C7576b) this.f10377a).runOnUiThread(new C33956(this.f16488j, str, z));
                this.f16474T = z;
                if (!this.f16499u) {
                    this.f16488j.m14067d((C7576b) this.f10377a);
                }
                C6127a c6127a = this.f16488j;
                c6127a.f16520g = false;
                c6127a.f16521h = true;
                c6127a.f16517d.setImageResource(R.drawable.ic_edit_tick);
                C2491i.m6801a(c6127a.f16517d, UIThemeManager.getmInstance().getAccent_color());
                c6127a.f16518e.setVisibility(8);
                if (c6127a.f16523j != null) {
                    c6127a.f16523j.m7842c();
                }
            }
        }
    }

    private void m13926l(String str) {
        if (this.f16457C) {
            mo3223h(str, this.au);
            mo3231b(false);
        } else {
            mo3220f(str);
        }
        if (this.al != null) {
            C2808d.m7148b(new C6761c(this.f16458D, this.f16490l));
            this.al = null;
        }
    }

    private void m13927m(String str) {
        this.f16477W = false;
        this.f16485g.f16584q = 0;
        MyApplication.m12950a().f15911q = str;
        C2808d.m7147a(new C6756c(this.f16490l, str));
    }

    public final void mo2295A() {
        C5999b c5999b = this.f16495q;
        c5999b.f16153c = false;
        c5999b.m13272c();
        if (C5999b.f16152b != null) {
            C5999b.f16152b.mo2294c();
        }
    }

    public final void mo2296B() {
        C5999b c5999b = this.f16495q;
        c5999b.f16153c = false;
        c5999b.m13271b();
    }

    protected final void m13930C() {
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ C6123a f10073a;

            {
                this.f10073a = r1;
            }

            public final void run() {
                if (this.f10073a.f16459E != null) {
                    ProgressWheel progressWheel = (ProgressWheel) this.f10073a.f16459E.findViewById(R.id.load_more_progressWheel);
                    ((TextView) this.f10073a.f16459E.findViewById(R.id.load_more_textView)).setText(C4522p.m8236a(R.string.load_more));
                    progressWheel.setVisibility(8);
                    this.f10073a.f16459E.setBackgroundResource(R.drawable.chat_load_more_selector);
                }
            }
        }, 100);
    }

    final boolean m13931D() {
        return (this instanceof C6876e) && ap();
    }

    final boolean m13932E() {
        return this.f16458D == C2973m.SINGLE;
    }

    final boolean m13933F() {
        return this.f16458D == C2973m.GROUP;
    }

    public final void mo2297G() {
        if (this.f16467M < this.f16468N && this.f16491m.size() > 0) {
            this.f16467M++;
            this.f16488j.m14057a(this.f16467M, this.f16468N);
            this.f16466L = (String) this.f16491m.get(this.f16467M - 1);
            m13927m(this.f16466L);
        }
    }

    public final void mo2298H() {
        if (this.f16467M > 1 && this.f16491m.size() > 0) {
            this.f16467M--;
            this.f16488j.m14057a(this.f16467M, this.f16468N);
            this.f16466L = (String) this.f16491m.get(this.f16467M - 1);
            m13927m(this.f16466L);
        }
    }

    public final void m13936I() {
        this.f16491m.clear();
    }

    public final boolean m13937J() {
        return this.f16492n;
    }

    protected final void m13938K() {
        this.ah.setVisibility(0);
        this.ai.setVisibility(0);
    }

    protected final void m13939L() {
        this.ah.setVisibility(8);
        this.ai.setVisibility(8);
    }

    final void m13940M() {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10122a;

            {
                this.f10122a = r1;
            }

            public final void run() {
                this.f10122a.m13990b(this.f10122a.af);
            }
        });
    }

    public abstract void mo3190N();

    public abstract void mo3191O();

    public abstract boolean mo3192P();

    protected abstract void mo3193Q();

    protected abstract void mo3194R();

    public abstract int mo3195S();

    public abstract int mo3196T();

    public abstract int mo3197U();

    public abstract boolean mo3198V();

    public abstract void mo3199W();

    public abstract void mo3200X();

    public abstract String mo3201Y();

    public abstract void mo3202Z();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog mo2299a(android.os.Bundle r18) {
        /*
        r17 = this;
        r10 = r17;
        r0 = r18;
        r1 = "dialog_id";
        r11 = r0.getInt(r1);
        r1 = r10.f10377a;
        r7 = r1;
        r7 = (mobi.mmdt.ott.view.components.p402d.C7576b) r7;
        r8 = r10.f16504z;
        r6 = r10.f16490l;
        r1 = 100;
        r2 = 2131689633; // 0x7f0f00a1 float:1.9008287E38 double:1.0531946153E-314;
        r3 = 2131689531; // 0x7f0f003b float:1.900808E38 double:1.053194565E-314;
        r4 = 2131690213; // 0x7f0f02e5 float:1.9009463E38 double:1.053194902E-314;
        r5 = 2131689728; // 0x7f0f0100 float:1.900848E38 double:1.053194662E-314;
        if (r11 == r1) goto L_0x026d;
    L_0x0023:
        r1 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r11 == r1) goto L_0x025b;
    L_0x0027:
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r2 = 1;
        r3 = 0;
        if (r11 == r1) goto L_0x021d;
    L_0x002d:
        r1 = 2131689941; // 0x7f0f01d5 float:1.9008912E38 double:1.0531947674E-314;
        r9 = 2131690162; // 0x7f0f02b2 float:1.900936E38 double:1.0531948766E-314;
        r13 = 2131689727; // 0x7f0f00ff float:1.9008478E38 double:1.0531946617E-314;
        r14 = 2131689540; // 0x7f0f0044 float:1.9008098E38 double:1.0531945693E-314;
        switch(r11) {
            case 90: goto L_0x0160;
            case 91: goto L_0x013b;
            case 92: goto L_0x012b;
            case 93: goto L_0x00cb;
            case 94: goto L_0x01d7;
            default: goto L_0x003c;
        };
    L_0x003c:
        switch(r11) {
            case 96: goto L_0x0085;
            case 97: goto L_0x005a;
            case 98: goto L_0x0042;
            default: goto L_0x003f;
        };
    L_0x003f:
        r12 = 0;
        goto L_0x0298;
    L_0x0042:
        r1 = "KEY_DIALOG_VIDEO_PATH";
        r2 = "";
        r0 = r0.getString(r1, r2);
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$6;
        r6.<init>(r7, r0);
        r0 = 2131690344; // 0x7f0f0368 float:1.9009729E38 double:1.0531949665E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r0 = 2131690347; // 0x7f0f036b float:1.9009735E38 double:1.053194968E-314;
        goto L_0x0071;
    L_0x005a:
        r1 = "KEY_DIALOG_FILE_ID";
        r2 = 0;
        r0 = r0.getLong(r1, r2);
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$5;
        r6.<init>(r7, r0);
        r0 = 2131690489; // 0x7f0f03f9 float:1.9010023E38 double:1.053195038E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r0 = 2131690348; // 0x7f0f036c float:1.9009737E38 double:1.0531949685E-314;
    L_0x0071:
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r1 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r9 = 0;
        r2 = r7;
        r4 = r0;
        r5 = r1;
        r7 = r8;
        r8 = r9;
        goto L_0x0159;
    L_0x0085:
        r1 = "KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_DELETE_MESSAGE";
        r9 = r0.getString(r1);
        r1 = "KEY_DIALOG_GET_CHANNEL_MESSAGE_ID";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x009c;
    L_0x0093:
        r1 = "KEY_DIALOG_GET_CHANNEL_MESSAGE_ID";
        r1 = r0.getString(r1);
        r4 = r1;
        r5 = 0;
        goto L_0x00a4;
    L_0x009c:
        r1 = "KEY_DIALOG_LONG_ARRAY_CHANNEL_MESSAGE_IDS";
        r1 = r0.getStringArray(r1);
        r5 = r1;
        r4 = 0;
    L_0x00a4:
        r1 = "KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x00b4;
    L_0x00ac:
        r1 = "KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE";
        r0 = r0.getBoolean(r1);
        r2 = r0;
        goto L_0x00b5;
    L_0x00b4:
        r2 = r3;
    L_0x00b5:
        r15 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$18;
        r0 = r15;
        r1 = r10;
        r3 = r6;
        r6 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r0 = 0;
        r2 = r7;
        r3 = r9;
        r5 = r15;
        goto L_0x0125;
    L_0x00cb:
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r1 = r1.m6928d();
        r2 = "KEY_DIALOG_DELETE_IS_OUTPUT";
        r2 = r0.getBoolean(r2);
        r3 = "KEY_DIALOG_GET_VIEW_MODEL_ID";
        r9 = r0.getStringArray(r3);
        r3 = "KEY_DIALOG_DELETE_CONTACT_NAME";
        r3 = r0.containsKey(r3);
        if (r3 == 0) goto L_0x00ef;
    L_0x00e7:
        r3 = "KEY_DIALOG_DELETE_CONTACT_NAME";
        r0 = r0.getString(r3);
        r15 = r0;
        goto L_0x00f0;
    L_0x00ef:
        r15 = 0;
    L_0x00f0:
        r5 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$15;
        r5.<init>(r10, r6, r9, r8);
        r0 = 2131689645; // 0x7f0f00ad float:1.9008311E38 double:1.053194621E-314;
        if (r2 == 0) goto L_0x0117;
    L_0x00fa:
        r1 = r1.equals(r6);
        if (r1 != 0) goto L_0x0117;
    L_0x0100:
        r1 = 0;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r0 = r1;
        r1 = r7;
        r5 = r10;
        r7 = r9;
        r9 = r15;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7798a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x015d;
    L_0x0117:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r0 = 0;
        r2 = r7;
    L_0x0125:
        r7 = r0;
        r0 = mobi.mmdt.ott.view.tools.C4488b.m8181a(r2, r3, r4, r5, r6, r7);
        goto L_0x015d;
    L_0x012b:
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$2;
        r6.<init>(r7);
        r0 = 2131690444; // 0x7f0f03cc float:1.9009932E38 double:1.053195016E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r0 = 2131690421; // 0x7f0f03b5 float:1.9009885E38 double:1.0531950046E-314;
        goto L_0x014a;
    L_0x013b:
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$19;
        r6.<init>(r7);
        r0 = 2131690325; // 0x7f0f0355 float:1.900969E38 double:1.053194957E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r0 = 2131690423; // 0x7f0f03b7 float:1.900989E38 double:1.0531950056E-314;
    L_0x014a:
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r5 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r1);
        r8 = 0;
        r2 = r7;
        r7 = r0;
    L_0x0159:
        r0 = mobi.mmdt.ott.view.tools.C4488b.m8182a(r2, r3, r4, r5, r6, r7, r8);
    L_0x015d:
        r12 = r0;
        goto L_0x0298;
    L_0x0160:
        r1 = "KEY_DIALOG_LONG_ARRAY_IDS";
        r9 = r0.getStringArray(r1);
        r1 = "KEY_DIALOG_DELETE_IS_OUTPUT";
        r1 = r0.getBoolean(r1);
        r4 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r4 = r4.m6928d();
        r5 = "KEY_DIALOG_DELETE_CONTACT_NAME";
        r5 = r0.containsKey(r5);
        if (r5 == 0) goto L_0x0184;
    L_0x017c:
        r5 = "KEY_DIALOG_DELETE_CONTACT_NAME";
        r5 = r0.getString(r5);
        r15 = r5;
        goto L_0x0185;
    L_0x0184:
        r15 = 0;
    L_0x0185:
        r5 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$16;
        r5.<init>(r10, r6, r9, r8);
        r12 = 2131689642; // 0x7f0f00aa float:1.9008305E38 double:1.0531946197E-314;
        if (r1 == 0) goto L_0x01b7;
    L_0x018f:
        r1 = r4.equals(r6);
        if (r1 != 0) goto L_0x01b7;
    L_0x0195:
        if (r9 == 0) goto L_0x01d7;
    L_0x0197:
        r0 = 1;
        r1 = new java.lang.Object[r2];
        r2 = r9.length;
        r2 = java.lang.Integer.valueOf(r2);
        r1[r3] = r2;
        r2 = r7.getString(r12, r1);
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r1 = r7;
        r5 = r10;
        r7 = r9;
        r9 = r15;
        r12 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7798a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x0298;
    L_0x01b7:
        if (r9 == 0) goto L_0x01d7;
    L_0x01b9:
        r0 = new java.lang.Object[r2];
        r1 = r9.length;
        r1 = java.lang.Integer.valueOf(r1);
        r0[r3] = r1;
        r3 = r7.getString(r12, r0);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r0 = 0;
        r2 = r7;
    L_0x01d0:
        r7 = r0;
        r12 = mobi.mmdt.ott.view.tools.C4488b.m8181a(r2, r3, r4, r5, r6, r7);
        goto L_0x0298;
    L_0x01d7:
        r1 = "KEY_DIALOG_CHANNEL_TITLE_MESSAGE_IN_MULTI_DELETE_MESSAGE";
        r9 = r0.getString(r1);
        r1 = "KEY_DIALOG_STRING_ARRAY_CHANNEL_MESSAGE_IDS";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x01ee;
    L_0x01e5:
        r1 = "KEY_DIALOG_STRING_ARRAY_CHANNEL_MESSAGE_IDS";
        r1 = r0.getStringArray(r1);
        r4 = r1;
        r5 = 0;
        goto L_0x01f6;
    L_0x01ee:
        r1 = "KEY_DIALOG_LONG_ARRAY_CHANNEL_MESSAGE_IDS";
        r1 = r0.getStringArray(r1);
        r5 = r1;
        r4 = 0;
    L_0x01f6:
        r1 = "KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0206;
    L_0x01fe:
        r1 = "KEY_DIALOG_GET_CHANNEL_IS_INPUT_DIRECT_VIEW_TYPE";
        r0 = r0.getBoolean(r1);
        r2 = r0;
        goto L_0x0207;
    L_0x0206:
        r2 = r3;
    L_0x0207:
        r12 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$17;
        r0 = r12;
        r1 = r10;
        r3 = r6;
        r6 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r0 = 0;
        r2 = r7;
        r3 = r9;
        r5 = r12;
        goto L_0x01d0;
    L_0x021d:
        r1 = "KEY_DIALOG_STICKER_ID";
        r0 = r0.getInt(r1, r3);
        r1 = new android.support.v7.app.b$a;
        r1.<init>(r7);
        r4 = "Select an option";
        r1.m1608a(r4);
        r4 = 2;
        r4 = new java.lang.CharSequence[r4];
        r6 = 2131689555; // 0x7f0f0053 float:1.9008129E38 double:1.0531945767E-314;
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r6);
        r4[r3] = r6;
        r3 = 2131689542; // 0x7f0f0046 float:1.9008102E38 double:1.0531945703E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        r4[r2] = r3;
        r2 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$3;
        r2.<init>(r7, r0);
        r1.m1611a(r4, r2);
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r2 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$4;
        r2.<init>();
        r1.m1614b(r0, r2);
        r12 = r1.m1612a();
        goto L_0x0298;
    L_0x025b:
        r1 = "THEME_ORG_FILE_PATH";
        r1 = r0.getString(r1);
        r6 = "THEME_ORG_FILE_NAME";
        r0 = r0.getString(r6);
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$8;
        r6.<init>(r0, r1);
        goto L_0x027e;
    L_0x026d:
        r1 = "THEME_ORG_FILE_PATH";
        r1 = r0.getString(r1);
        r6 = "THEME_ORG_FILE_NAME";
        r0 = r0.getString(r6);
        r6 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$7;
        r6.<init>(r0, r1);
    L_0x027e:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r1 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r9 = 0;
        r2 = r7;
        r4 = r0;
        r5 = r1;
        r7 = r8;
        r8 = r9;
        r12 = mobi.mmdt.ott.view.tools.C4488b.m8182a(r2, r3, r4, r5, r6, r7, r8);
    L_0x0298:
        if (r12 == 0) goto L_0x029b;
    L_0x029a:
        return r12;
    L_0x029b:
        r0 = 95;
        if (r11 == r0) goto L_0x02a1;
    L_0x029f:
        r0 = 0;
        return r0;
    L_0x02a1:
        r0 = new com.cocosw.bottomsheet.c$a;
        r1 = r10.f10377a;
        r1 = (mobi.mmdt.ott.view.components.p402d.C7576b) r1;
        r0.<init>(r1);
        r1 = new mobi.mmdt.ott.view.conversation.activities.a.a$42;
        r1.<init>(r10);
        r0.f4034f = r1;
        r1 = r10.f10377a;
        r1 = (mobi.mmdt.ott.view.components.p402d.C7576b) r1;
        r2 = 2131492891; // 0x7f0c001b float:1.8609247E38 double:1.053097412E-314;
        mobi.mmdt.ott.view.tools.C4506e.m8204a(r1, r0, r2);
        r1 = 5;
        r0 = r0.m3052a(r1);
        r0 = r0.m3053a();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.a(android.os.Bundle):android.app.Dialog");
    }

    protected final SearchView m13955a(SearchView searchView) {
        if (searchView != null) {
            ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
            imageView.setImageResource(R.drawable.ic_search);
            C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
            imageView = (ImageView) searchView.findViewById(R.id.search_close_btn);
            imageView.setImageResource(R.drawable.ic_close_gray);
            C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
            View view = (TextView) searchView.findViewById(R.id.search_src_text);
            view.setTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
            view.setHintTextColor(UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color());
            C2491i.m6818b(view, UIThemeManager.getmInstance().getAccent_color());
            Display defaultDisplay = ((C7576b) this.f10377a).getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            searchView.setMaxWidth(point.x);
        }
        return searchView;
    }

    public void mo2300a() {
        Drawable navigationIcon = this.f16496r.getNavigationIcon();
        Drawable overflowIcon = this.f16496r.getOverflowIcon();
        if (navigationIcon != null) {
            C6123a.m13892a(navigationIcon);
        }
        if (overflowIcon != null) {
            C6123a.m13892a(overflowIcon);
        }
        this.f16476V = true;
        this.ao = new C6205b((C7576b) this.f10377a, this.f16498t);
        this.ao.f16754a = this;
        new Thread(new C40122(this.ao)).start();
        if (C3338c.m7822a(this.f16458D)) {
            this.f16502x = new C3442a((C7576b) this.f10377a, this.f16498t, C2489g.m6754a().m6755a(BallPulseIndicator.SCALE));
            this.f16502x.f10501a = this;
        }
    }

    public final void mo2301a(int i) {
        C2867a.m7211a().m7215a(i);
    }

    public final void m13958a(int i, int i2) {
        ((C7576b) this.f10377a).overridePendingTransition(i, i2);
    }

    public final void mo2302a(int i, int i2, int i3, String str) {
        if (this.f16457C) {
            mo3203a(i, i2, i3, str, this.au);
            mo3231b(false);
            return;
        }
        mo3218b(i, i2, i3, str);
    }

    protected abstract void mo3203a(int i, int i2, int i3, String str, String str2);

    public void mo2303a(int i, int i2, Intent intent) {
        ViewGroup viewGroup;
        String valueOf;
        C3382a c3382a = this;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        StringBuilder stringBuilder = new StringBuilder("onActivityResult requestCode:");
        stringBuilder.append(i3);
        stringBuilder.append(" ,resultCode:");
        stringBuilder.append(i4);
        C2480b.m6742f(stringBuilder.toString());
        if (i3 == 215 || i3 == 172) {
            viewGroup = null;
            i3 = -1;
        } else if (i3 == 173) {
            i3 = -1;
            viewGroup = null;
        } else {
            final String str;
            if (i3 == 217) {
                if (i4 == -1 && intent2.hasExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT")) {
                    ArrayList stringArrayListExtra = intent2.getStringArrayListExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT");
                    if (stringArrayListExtra.size() == 1 && intent2.hasExtra("KEY_FILE_ARRAY_LIST_OF_FILE_NAME_RESULT")) {
                        ArrayList stringArrayListExtra2 = intent2.getStringArrayListExtra("KEY_FILE_ARRAY_LIST_OF_FILE_NAME_RESULT");
                        ArrayList stringArrayListExtra3 = intent2.getStringArrayListExtra("KEY_FILE_ARRAY_LIST_OF_SIZE_RESULT");
                        Activity activity = (C7576b) c3382a.f10377a;
                        str = (String) stringArrayListExtra.get(0);
                        C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
                        View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_set_caption_file, null);
                        ImageView imageView = (RoundAvatarImageView) inflate.findViewById(R.id.imageView1);
                        TextView textView = (TextView) inflate.findViewById(R.id.textView1);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.textView2);
                        final EditText editText = (EditText) inflate.findViewById(R.id.edit_text_caption);
                        editText.requestFocus();
                        C2491i.m6780a((int) UIThemeDefaultValue.default_text_primary_color, UIThemeManager.getmInstance().getAccent_color(), editText);
                        C2491i.m6800a(editText, (int) IjkMediaCodecInfo.RANK_MAX);
                        textView.setTypeface(textView.getTypeface(), 1);
                        textView.setText((CharSequence) stringArrayListExtra2.get(0));
                        textView2.setText((CharSequence) stringArrayListExtra3.get(0));
                        imageView.setBackgroundColor(-14800569);
                        imageView.setImageBitmap(null);
                        C1212c.m2872a(activity).m10950a(Integer.valueOf(R.drawable.ic_file_attach)).m3031a(imageView);
                        c0663a.m1607a(inflate);
                        c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                        c0663a.m1609a(C4522p.m8236a(R.string.send), new OnClickListener(c3382a) {
                            final /* synthetic */ C6123a f10066c;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Editable text = editText.getText();
                                this.f10066c.m13923j(str, text != null ? text.toString() : "");
                                if (this.f10066c.f16488j != null) {
                                    C3406c.m7859a(this.f10066c.f16488j.f16515b);
                                }
                            }
                        });
                        C6389b a = c0663a.m1612a();
                        a.show();
                        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                        return;
                    }
                    Iterator it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        m13923j((String) it.next(), "");
                    }
                    return;
                }
            } else if (i3 == 218) {
                if (i4 == -1 && intent2.hasExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT")) {
                    Iterator it2 = intent2.getStringArrayListExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT").iterator();
                    while (it2.hasNext()) {
                        m13911b((String) it2.next(), "", C2988j.AUDIO, null, false);
                    }
                    return;
                }
            } else if (i4 == 18) {
                m14012g();
                return;
            } else if (i3 == 100) {
                if (i4 == -1) {
                    C1832a a2 = C5508a.m12042a(intent2, (C7576b) c3382a.f10377a);
                    valueOf = String.valueOf(a2.mo3044a().f18734a);
                    str = String.valueOf(a2.mo3044a().f18735b);
                    if (!c3382a.f16457C || c3382a.au == null || c3382a.au.isEmpty()) {
                        mo3206a(valueOf, str, null);
                        return;
                    }
                    mo3206a(valueOf, str, c3382a.au);
                    mo3231b(false);
                    return;
                }
            } else if (i3 == 1) {
                if (C2535a.m6888a().m6972t()) {
                    MyApplication.m12950a().f15901P = System.currentTimeMillis();
                }
                if (intent2 != null && intent2.hasExtra("enData")) {
                    C2808d.m7148b(new C6791f(c3382a.aG, intent2.getStringExtra("enData"), C2763c.ChannelPayment));
                    return;
                }
            }
        }
        if (i4 == i3 && intent2.hasExtra("KEY_RESULT_ARRAYLIST_OF_PATH") && intent2.hasExtra("KEY_RESULT_ARRAYLIST_OF_CAPTION")) {
            C2988j c2988j;
            C2731a c2731a;
            int intExtra = intent2.getIntExtra("KEY_RESULT_TYPE", 1);
            if (intExtra == 2) {
                c2988j = C2988j.VIDEO;
                c2731a = (C2731a) intent2.getSerializableExtra("KEY_COMPRESS_VIDEO_INFO");
            } else {
                C2988j c2988j2;
                if (intExtra == 1) {
                    c2988j2 = C2988j.IMAGE;
                } else if (intExtra == 3) {
                    c2988j2 = C2988j.GIF;
                } else {
                    c2731a = viewGroup;
                    c2988j = c2731a;
                }
                c2988j = c2988j2;
                c2731a = viewGroup;
            }
            ArrayList stringArrayListExtra4 = intent2.getStringArrayListExtra("KEY_RESULT_ARRAYLIST_OF_PATH");
            ArrayList stringArrayListExtra5 = intent2.getStringArrayListExtra("KEY_RESULT_ARRAYLIST_OF_CAPTION");
            boolean[] zArr = new boolean[stringArrayListExtra4.size()];
            if (intExtra == 1 && intent.getExtras() != null && intent2.hasExtra("KEY_RESULT_ARRAYLIST_OF_IS_COMPRESS")) {
                zArr = intent.getExtras().getBooleanArray("KEY_RESULT_ARRAYLIST_OF_IS_COMPRESS");
            }
            boolean[] zArr2 = zArr;
            for (int i5 = 0; i5 < stringArrayListExtra4.size(); i5++) {
                boolean z;
                C6123a c6123a;
                C2988j c2988j3;
                C2731a c2731a2;
                valueOf = (String) stringArrayListExtra4.get(i5);
                String str2 = (String) stringArrayListExtra5.get(i5);
                if (intExtra != 1 || zArr2 == null || zArr2.length <= 0) {
                    z = false;
                    c6123a = c3382a;
                    c2988j3 = c2988j;
                    c2731a2 = c2731a;
                } else if (zArr2[i5]) {
                    c2731a2 = null;
                    z = true;
                    c6123a = c3382a;
                    c2988j3 = c2988j;
                } else {
                    m13923j(valueOf, str2);
                }
                c6123a.m13911b(valueOf, str2, c2988j3, c2731a2, z);
            }
        }
    }

    public final void m13962a(final int i, final C3315b c3315b) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10087c;

            public final void run() {
                C6131b c6131b = this.f10087c.f16485g;
                int b = c6131b.f16574g != null ? c6131b.f16574g.m13682b() : 0;
                if (b <= 0) {
                    if (this.f10087c.f16458D != null) {
                        b = -1;
                        switch (this.f10087c.f16458D) {
                            case CHANNEL:
                            case CHANNEL_DIRECT:
                            case CHANNEL_REPLY:
                                b = 20;
                                break;
                            case GROUP:
                            case SINGLE:
                                b = 50;
                                break;
                            default:
                                break;
                        }
                        if (i > b) {
                            C6123a.m13895a(this.f10087c, i);
                        }
                    }
                } else if (i < b) {
                    C6123a.m13901a(this.f10087c, c3315b, i);
                } else {
                    C6123a.m13895a(this.f10087c, i);
                }
            }
        });
    }

    public abstract void mo3204a(int i, boolean z, boolean z2, boolean z3);

    public final void mo2304a(int i, int[] iArr) {
        if (i == 186) {
            if (iArr.length > 0 && iArr[0] != -1) {
                if (this.f16490l.equals(this.aB)) {
                    Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.you_can_not_call_yourself), 1).show();
                } else {
                    C4478a.m8163c((C7576b) this.f10377a, this.f16490l);
                }
            }
        } else if (i == 187 && (iArr.length <= 0 || iArr[0] != -1)) {
            if (this.f16494p == 215) {
                m13919c(this.f16494p);
            } else if (this.f16494p == 216) {
                ai();
            } else if (this.f16494p == 217) {
                ah();
            }
        }
    }

    public final void mo2305a(long j) {
        C2808d.m7149c(new C6665d(j));
    }

    public final void mo2306a(long j, String str) {
        if (new File(Uri.parse(str).getPath()).canRead()) {
            try {
                C2867a.m7211a().m7216a(j);
                return;
            } catch (Throwable e) {
                C2480b.m6738b(e);
                return;
            }
        }
        C2984c.m7457a(str, C2987i.NOT_STARTED);
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo2307a(long j, boolean z) {
        if (C6123a.ak()) {
            aj();
        } else {
            C2808d.m7149c(z ? new C6670l(j) : new C6669k(j, false));
        }
    }

    public final void m13968a(Intent intent, int i) {
        ((C7576b) this.f10377a).startActivityForResult(intent, i);
    }

    final void m13969a(String str) {
        if (this.f16488j != null) {
            C6127a c6127a = this.f16488j;
            if (c6127a.f16515b != null) {
                EmojiconEditText emojiconEditText = c6127a.f16515b;
                StringBuilder stringBuilder = new StringBuilder("<small>");
                stringBuilder.append(str);
                stringBuilder.append("</small>");
                emojiconEditText.setHint(Html.fromHtml(stringBuilder.toString()));
            }
        }
    }

    public final void mo2308a(String str, int i, boolean z) {
        C2808d.m7147a(new C6710u(str, i, z));
    }

    public final void mo2309a(String str, String str2) {
        if (!this.f16455A) {
            if (new File(Uri.parse(str).getPath()).exists()) {
                Activity activity = (C7576b) this.f10377a;
                Intent intent = new Intent(activity, VideoPlayerActivity.class);
                intent.putExtra("KEY_STREAM_URL", str);
                intent.putExtra("KEY_STREAM_POSITION", 0);
                intent.putExtra("KEY_PLAYER_TYPE", 0);
                if (!(str2 == null || TextUtils.isEmpty(str2))) {
                    intent.putExtra("KEY_VIDEO_CAPTION", str2);
                }
                if (activity != null) {
                    activity.startActivity(intent);
                    C4478a.m8165c(activity, true);
                }
                return;
            }
            C2984c.m7457a(str, C2987i.NOT_STARTED);
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
        }
    }

    protected abstract void mo3206a(String str, String str2, String str3);

    public final void mo2310a(String str, String str2, String str3, String str4) {
        if (new File(Uri.parse(str).getPath()).canRead()) {
            if (str3 == null) {
                str3 = str4 != null ? str4 : "";
            }
            C4478a.m8164c((C7576b) this.f10377a, str, str2, str3);
            return;
        }
        C2984c.m7457a(str, C2987i.NOT_STARTED);
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo2311a(String str, String str2, C2973m c2973m) {
        this.f16479Y = this.f16485g.f16573f.findLastVisibleItemPosition();
        this.f16458D = c2973m;
        this.f16485g.f16584q = 0;
        MyApplication.m12950a().f15911q = str2;
        C2808d.m7147a(new C6756c(str, str2));
        this.f16493o = true;
    }

    protected abstract void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z);

    protected abstract void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z);

    public final void mo2312a(String str, String str2, String[] strArr, String str3) {
        if (strArr.length <= 0 || str3.isEmpty()) {
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.payment_error_no_option_selected), 0).show();
            return;
        }
        C2808d.m7148b(new C6789b(str2, str3, this.f16458D, this.f16490l, str));
        C4501c.m8189a().m8191a((C7576b) this.f10377a, R.string.wait, false);
    }

    protected final void m13978a(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            this.f16486h.setText("");
            this.f16486h.setVisibility(8);
            return;
        }
        CharSequence b;
        if (this.aC.equals("fa")) {
            b = C2491i.m6814b(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(b);
        spannableStringBuilder.setSpan(ar(), 0, spannableStringBuilder.length(), 33);
        this.f16486h.setText(b);
        this.f16486h.setVisibility(0);
        if (z) {
            if (this.f16486h.getCompoundDrawables().length <= 0 || this.f16486h.getCompoundDrawables()[0] == null) {
                this.f16486h.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_star, 0);
            } else {
                this.f16486h.setCompoundDrawablesWithIntrinsicBounds(this.f16486h.getCompoundDrawables()[0], null, C0346c.m682a((C7576b) this.f10377a, (int) R.drawable.ic_star), null);
            }
            this.f16486h.setCompoundDrawablePadding((int) C2491i.m6804b((C7576b) this.f10377a, 4.0f));
            return;
        }
        this.f16486h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    protected final void m13979a(PollResult pollResult) {
        String a;
        Object[] objArr;
        C0663a c0663a = new C0663a((C7576b) this.f10377a, R.style.AppCompatAlertDialogStyle);
        c0663a.m1608a(pollResult.getmQuestionTitle());
        ViewGroup viewGroup = null;
        View inflate = this.f10377a.getLayoutInflater().inflate(R.layout.dialog_poll_result, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.box_linearLayout);
        long j = pollResult.getmTotalVotes();
        PollOption[] pollOptionArr = pollResult.getmOptions();
        int length = pollOptionArr.length;
        int i = 0;
        while (i < length) {
            String b;
            PollOption pollOption = pollOptionArr[i];
            View inflate2 = r0.f10377a.getLayoutInflater().inflate(R.layout.poll_result_item, viewGroup);
            TextRoundCornerProgressBar textRoundCornerProgressBar = (TextRoundCornerProgressBar) inflate2.findViewById(R.id.roundCornerProgressBar);
            TextView textView = (TextView) inflate2.findViewById(R.id.content_textView);
            if (r0.aC.equals("fa")) {
                textView.setText(C2491i.m6814b(pollOption.getmText()));
                b = C2491i.m6814b(C2491i.m6765a((C7576b) r0.f10377a, (float) ((int) pollOption.getmVotesCount())));
            } else {
                textView.setText(pollOption.getmText());
                b = C2491i.m6765a((C7576b) r0.f10377a, (float) ((int) pollOption.getmVotesCount()));
            }
            textRoundCornerProgressBar.setProgressText(b);
            float f = 0.0f;
            if (j > 0) {
                f = (((float) pollOption.getmVotesCount()) / ((float) j)) * 100.0f;
            }
            textRoundCornerProgressBar.setProgress(f);
            textRoundCornerProgressBar.setProgressColor(UIThemeManager.getmInstance().getAccent_color());
            linearLayout.addView(inflate2);
            textRoundCornerProgressBar.setTextProgressMargin((int) C2491i.m6804b((C7576b) r0.f10377a, 32.0f));
            i++;
            viewGroup = null;
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.total_textView);
        if (r0.aC.equals("fa")) {
            a = C4522p.m8236a(R.string.total_voters);
            objArr = new Object[]{C2491i.m6814b(C2491i.m6765a((C7576b) r0.f10377a, (float) ((int) j)))};
        } else {
            a = C4522p.m8236a(R.string.total_voters);
            objArr = new Object[]{C2491i.m6765a((C7576b) r0.f10377a, (float) ((int) j))};
        }
        textView2.setText(String.format(a, objArr));
        c0663a.m1607a(inflate);
        c0663a.m1614b(C4522p.m8236a(R.string.close_button_text), new OnClickListener(r0) {
            final /* synthetic */ C6123a f10120a;

            {
                this.f10120a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f10120a.f16484f = null;
            }
        });
        r0.aJ = c0663a.m1612a();
        r0.aJ.show();
        r0.aJ.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        r0.aJ.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
    }

    public final void mo2313a(Emojicon emojicon) {
        if (this.aj.containsKey(emojicon)) {
            this.aj.put(emojicon, Integer.valueOf(((Integer) this.aj.get(emojicon)).intValue() + 1));
        } else {
            this.aj.put(emojicon, Integer.valueOf(1));
        }
        C6127a c6127a = this.f16488j;
        if (c6127a.f16515b != null && emojicon != null) {
            int selectionStart = c6127a.f16515b.getSelectionStart();
            int selectionEnd = c6127a.f16515b.getSelectionEnd();
            if (selectionStart < 0) {
                c6127a.f16515b.append(emojicon.f11581f);
            } else {
                c6127a.f16515b.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), emojicon.f11581f, 0, emojicon.f11581f.length());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2314a(mobi.mmdt.ott.view.conversation.p573f.C7197a r9) {
        /*
        r8 = this;
        r0 = r9.f19504k;
        r8.f16470P = r0;
        r0 = r8.f16469O;
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r9.f20777c;
        r8.aD = r0;
    L_0x000c:
        r0 = r8.f16456B;
        r0 = r0.isEmpty();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0091;
    L_0x0016:
        r0 = r8.f16456B;
        r0 = r0.size();
        r3 = 95;
        r4 = 93;
        r5 = 94;
        r6 = 92;
        if (r0 != r2) goto L_0x007e;
    L_0x0026:
        r0 = new java.util.ArrayList;
        r7 = r8.f16456B;
        r7 = r7.values();
        r0.<init>(r7);
        r7 = r0.get(r1);
        r7 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r7;
        r7 = r7.f19503j;
        if (r7 == r6) goto L_0x006b;
    L_0x003b:
        r7 = r0.get(r1);
        r7 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r7;
        r7 = r7.f19503j;
        if (r7 == r5) goto L_0x006b;
    L_0x0045:
        r7 = r0.get(r1);
        r7 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r7;
        r7 = r7.f19503j;
        if (r7 == r4) goto L_0x006b;
    L_0x004f:
        r7 = r0.get(r1);
        r7 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r7;
        r7 = r7.f19503j;
        if (r7 != r3) goto L_0x005a;
    L_0x0059:
        goto L_0x006b;
    L_0x005a:
        r0 = r9.f19503j;
        if (r0 == r6) goto L_0x008e;
    L_0x005e:
        r0 = r9.f19503j;
        if (r0 == r5) goto L_0x008e;
    L_0x0062:
        r0 = r9.f19503j;
        if (r0 == r4) goto L_0x008e;
    L_0x0066:
        r0 = r9.f19503j;
        if (r0 != r3) goto L_0x0091;
    L_0x006a:
        goto L_0x007d;
    L_0x006b:
        r0 = r0.get(r1);
        r0 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r0;
        r3 = r0.mo3604b();
        r5 = r9.mo3604b();
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x0091;
    L_0x007d:
        goto L_0x008e;
    L_0x007e:
        r0 = r9.f19503j;
        if (r0 == r6) goto L_0x008e;
    L_0x0082:
        r0 = r9.f19503j;
        if (r0 == r5) goto L_0x008e;
    L_0x0086:
        r0 = r9.f19503j;
        if (r0 == r4) goto L_0x008e;
    L_0x008a:
        r0 = r9.f19503j;
        if (r0 != r3) goto L_0x0091;
    L_0x008e:
        r0 = r8.f16482d;
        goto L_0x0092;
    L_0x0091:
        r0 = r2;
    L_0x0092:
        if (r0 == 0) goto L_0x01e2;
    L_0x0094:
        r0 = r8.f16455A;
        if (r0 == 0) goto L_0x01e2;
    L_0x0098:
        r0 = r8.f16469O;
        if (r0 != 0) goto L_0x01e2;
    L_0x009c:
        r0 = r8.f16456B;
        r3 = r9.mo3604b();
        r3 = java.lang.Long.valueOf(r3);
        r0 = r0.containsKey(r3);
        if (r0 != 0) goto L_0x0130;
    L_0x00ac:
        r0 = r8.f16456B;
        r3 = r9.mo3604b();
        r1 = java.lang.Long.valueOf(r3);
        r0.put(r1, r9);
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13906a(r9, r2);
        r8.m13917b(r9, r2);
        r0 = r8.aq();
        if (r0 == 0) goto L_0x0117;
    L_0x00c5:
        r0 = r8;
        r0 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r0;
        r0 = r0.ai;
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r0 != r1) goto L_0x00e4;
    L_0x00ce:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7819e(r0);
        if (r0 == 0) goto L_0x0117;
    L_0x00d6:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15883i;
        r3 = r0[r1];
        r3 = r3 + r2;
        r0[r1] = r3;
        goto L_0x0117;
    L_0x00e4:
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r0 != r1) goto L_0x00fe;
    L_0x00e8:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7819e(r0);
        if (r0 == 0) goto L_0x0117;
    L_0x00f0:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15879e;
        r3 = r0[r1];
        r3 = r3 + r2;
        r0[r1] = r3;
        goto L_0x0117;
    L_0x00fe:
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r0 != r1) goto L_0x0117;
    L_0x0102:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7818d(r0);
        if (r0 == 0) goto L_0x0117;
    L_0x010a:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15880f;
        r3 = r0[r1];
        r3 = r3 + r2;
        r0[r1] = r3;
    L_0x0117:
        r0 = r8.f16504z;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r8.f16456B;
        r2 = r2.size();
        r1.append(r2);
        r1 = r1.toString();
        r0.setTitle(r1);
        goto L_0x01cf;
    L_0x0130:
        r0 = r8.f16456B;
        r3 = r9.mo3604b();
        r3 = java.lang.Long.valueOf(r3);
        r0.remove(r3);
        r0 = "";
        r8.aD = r0;
        mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13906a(r9, r1);
        r8.m13917b(r9, r1);
        r0 = r8.f16456B;
        r0 = r0.size();
        if (r0 == 0) goto L_0x0166;
    L_0x014f:
        r0 = r8.f16504z;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r8.f16456B;
        r3 = r3.size();
        r1.append(r3);
        r1 = r1.toString();
        r0.setTitle(r1);
    L_0x0166:
        r0 = r8.aq();
        if (r0 == 0) goto L_0x01be;
    L_0x016c:
        r0 = r8;
        r0 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r0;
        r0 = r0.ai;
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r0 != r1) goto L_0x018b;
    L_0x0175:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7814b(r0);
        if (r0 == 0) goto L_0x01be;
    L_0x017d:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15883i;
        r3 = r0[r1];
        r3 = r3 - r2;
        r0[r1] = r3;
        goto L_0x01be;
    L_0x018b:
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r0 != r1) goto L_0x01a5;
    L_0x018f:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7819e(r0);
        if (r0 == 0) goto L_0x01be;
    L_0x0197:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15879e;
        r3 = r0[r1];
        r3 = r3 - r2;
        r0[r1] = r3;
        goto L_0x01be;
    L_0x01a5:
        r1 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r0 != r1) goto L_0x01be;
    L_0x01a9:
        r0 = r9.f19503j;
        r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7818d(r0);
        if (r0 == 0) goto L_0x01be;
    L_0x01b1:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r0 = r0.f15906l;
        r1 = mobi.mmdt.ott.MyApplication.f15880f;
        r3 = r0[r1];
        r3 = r3 - r2;
        r0[r1] = r3;
    L_0x01be:
        r0 = r8.f16456B;
        r0 = r0.size();
        if (r0 != 0) goto L_0x01cf;
    L_0x01c6:
        r0 = r8.f16504z;
        if (r0 == 0) goto L_0x01cf;
    L_0x01ca:
        r0 = r8.f16504z;
        r0.finish();
    L_0x01cf:
        r0 = r8.f16485g;
        r9 = r9.f19504k;
        r0.m14093c(r9);
        r9 = r8.f16456B;
        r9 = r9.size();
        if (r9 == 0) goto L_0x0210;
    L_0x01de:
        r8.al();
        return;
    L_0x01e2:
        r0 = r9.f19503j;
        r1 = 6;
        if (r0 != r1) goto L_0x0210;
    L_0x01e7:
        r0 = new android.content.Intent;
        r1 = r8.f10377a;
        r1 = (mobi.mmdt.ott.view.components.p402d.C7576b) r1;
        r2 = mobi.mmdt.ott.view.main.callslist.newdesign.callhistory.CallHistoryProfileActivity.class;
        r0.<init>(r1, r2);
        r1 = "KEY_CONTACT_USER_ID_STRING";
        r2 = r8.f16490l;
        r0.putExtra(r1, r2);
        r1 = "KEY_TIME_CALL";
        r2 = r9.f20781g;
        r0.putExtra(r1, r2);
        r9 = r8.f10377a;
        r9 = (mobi.mmdt.ott.view.components.p402d.C7576b) r9;
        r9.startActivity(r0);
        r9 = 2130771980; // 0x7f01000c float:1.7147065E38 double:1.0527412344E-314;
        r0 = 2130771983; // 0x7f01000f float:1.7147072E38 double:1.052741236E-314;
        r8.m13958a(r9, r0);
    L_0x0210:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.a(mobi.mmdt.ott.view.conversation.f.a):void");
    }

    final void m13982a(C4057g c4057g) {
        if (c4057g != null) {
            C4058h c4058h = c4057g.f11618b;
            ArrayList arrayList = c4057g.f11619c;
            String str;
            if (arrayList == null && c4058h.equals(C4058h.TEXT)) {
                str = c4057g.f11617a;
                if (str != null && str.length() > 4000) {
                    str = str.substring(0, 4000);
                }
                if (str != null) {
                    m13926l(str);
                }
            } else if (arrayList != null && arrayList.size() == 1 && c4058h.equals(C4058h.VIDEO)) {
                C4059i c4059i = (C4059i) arrayList.get(0);
                String uri = c4059i.f11626a.toString();
                str = c4059i.f11627b;
                if (uri != null) {
                    str = m13891a(uri, C4058h.VIDEO, str);
                    Intent intent = new Intent((C7576b) this.f10377a, MediaCaptionActivity.class);
                    intent.putExtra("KEY_PATH_SHARE_VIDEO", str);
                    intent.putExtra("KEY_IS_SHARE_VIDEO", true);
                    intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", 10);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(C4522p.m8236a(R.string.send_to));
                    stringBuilder.append(" ");
                    stringBuilder.append(m14027n());
                    intent.putExtra("EXTRA_SELECTOR_TITLE", stringBuilder.toString());
                    m13968a(intent, 215);
                    m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C4059i c4059i2 = (C4059i) it.next();
                    if (c4059i2 != null) {
                        String uri2 = c4059i2.f11626a.toString();
                        String str2 = c4059i2.f11627b;
                        if (uri2 != null) {
                            C2988j c2988j;
                            String a = m13891a(uri2, c4058h, str2);
                            String str3 = "";
                            switch (C40551.f11616a[c4058h.ordinal()]) {
                                case 1:
                                    c2988j = C2988j.IMAGE;
                                    break;
                                case 2:
                                    c2988j = C2988j.VIDEO;
                                    break;
                                case 4:
                                    c2988j = C2988j.GIF;
                                    break;
                                default:
                                    c2988j = C2988j.OTHER;
                                    break;
                            }
                            m13911b(a, str3, c2988j, null, true);
                        }
                    }
                }
            }
        }
    }

    final void m13983a(boolean z) {
        AVLoadingIndicatorView aVLoadingIndicatorView;
        int i;
        if (z) {
            this.aF.show();
            aVLoadingIndicatorView = this.aF;
            i = 0;
        } else {
            this.aF.hide();
            aVLoadingIndicatorView = this.aF;
            i = 8;
        }
        aVLoadingIndicatorView.setVisibility(i);
    }

    public boolean mo2315a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            return itemId == R.id.action_checkable_items ? true : super.mo2315a(menuItem);
        } else {
            mo2330e();
            return true;
        }
    }

    public abstract void aa();

    public abstract void ab();

    protected abstract boolean ac();

    public abstract C0350e<Cursor> mo3217b(int i);

    public void mo2316b() {
        this.f16476V = false;
        if (this.ao.isShowing()) {
            this.ao.dismiss();
        }
        if (this.f16502x != null && this.f16502x.isShowing()) {
            this.f16502x.dismiss();
        }
        if (this.f16501w.isShowing()) {
            this.f16501w.dismiss();
        }
        this.f16488j.m14065c((C7576b) this.f10377a);
    }

    protected abstract void mo3218b(int i, int i2, int i3, String str);

    public final void mo2317b(long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 97);
        bundle.putLong("KEY_DIALOG_FILE_ID", j);
        m14004e(bundle);
        C2827a.m7163a();
    }

    public void mo2318b(Bundle bundle) {
        int i;
        View view;
        int i2;
        Bundle bundle2 = bundle;
        if (!C0005c.m0a().m7b(this)) {
            C0005c.m0a().m6a((Object) r8);
        }
        r8.f16476V = false;
        r8.f16496r = (Toolbar) r8.b.findViewById(R.id.toolbar);
        ((C7576b) r8.f10377a).m20722a(r8.f16496r, true);
        r8.f16496r.setTitle((CharSequence) "");
        r8.aI = r8.b.findViewById(R.id.shadow_line_top);
        r8.f16480Z = (RelativeLayout) r8.b.findViewById(R.id.root_relativeLayout);
        View view2 = (LinearLayout) r8.b.findViewById(R.id.layout1);
        r8.at = (LinearLayout) r8.b.findViewById(R.id.inside_toolbar_linearLayout);
        r8.f16486h = (TextView) r8.b.findViewById(R.id.title_toolbar_textView);
        r8.ak = (TextView) r8.b.findViewById(R.id.subtitle_toolbar_textView);
        String stringExtra = r8.f16471Q.getStringExtra("indicator");
        r8.aF = (AVLoadingIndicatorView) r8.b.findViewById(R.id.typing_view_subtitle_toolbar);
        r8.aF.setIndicator(stringExtra);
        r8.f16487i = (RoundAvatarImageView) r8.b.findViewById(R.id.logo_imageView);
        ViewStub viewStub = (ViewStub) r8.b.findViewById(R.id.replyPanel_viewStub);
        r8.f16503y = (FrameLayout) r8.b.findViewById(R.id.replyPanel_frameLayout);
        r8.ag = new C3343d((C7576b) r8.f10377a, r8.b, r8.aL);
        r8.aC = C2535a.m6888a().m6919b();
        r8.aB = C2535a.m6888a().m6928d();
        r8.f16481c = C2491i.m6830d((C7576b) r8.f10377a) ? C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) : C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        r8.ah = (ViewGroup) r8.b.findViewById(R.id.conversation_text_box_frameLayout);
        r8.ai = r8.b.findViewById(R.id.line_separator_text_box);
        if (aq()) {
            m13939L();
        }
        r8.at.setOnClickListener(new View.OnClickListener(r8) {
            final /* synthetic */ C6123a f10069a;

            {
                this.f10069a = r1;
            }

            public final void onClick(View view) {
                this.f10069a.mo3193Q();
            }
        });
        r8.f16489k = C2980g.m7445f(r8.f16490l);
        r8.f16456B = MyApplication.m12950a().f15910p;
        boolean a = C3338c.m7822a(r8.f16458D);
        Bundle bundle3 = new Bundle();
        Bundle bundle4 = new Bundle();
        int i3 = -1;
        if (bundle2 != null) {
            int i4;
            if (bundle2.containsKey("KEY_ROTATE_FORWARD_PEER_PARTY")) {
                ArrayList stringArrayList = bundle2.getStringArrayList("KEY_ROTATE_FORWARD_PEER_PARTY");
                ArrayList integerArrayList = bundle2.getIntegerArrayList("KEY_ROTATE_FORWARD_GROUP_ID");
                if (stringArrayList != null && integerArrayList != null && stringArrayList.size() > 0 && integerArrayList.size() > 0) {
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        r8.aL.put(stringArrayList.get(i5), integerArrayList.get(i5));
                    }
                    r8.ag.m7824a();
                }
            }
            r8.f16455A = bundle2.getBoolean("KEY_IS_ACTION_MODE_SHOWING", false);
            r8.f16457C = bundle2.getBoolean("key_is_reply_mode", false);
            r8.au = bundle2.getString("key_reply_message_id", null);
            r8.av = bundle2.getString("key_reply_top_text", null);
            r8.ag.f10262a = bundle2.getString("KEY_FLOATING_FORWARD_MESSAGE_ID", null);
            r8.aw = bundle2.getString("key_reply_bottom_text", null);
            r8.ax = bundle2.getString("key_reply_image_uri", null);
            r8.ay = bundle2.getInt("key_reply_image_res_id", -1);
            int i6 = bundle2.getInt("KEY_MAX_COUNT_LIMIT", -1);
            r8.f16494p = bundle2.getInt("key_request_code_on_attach_pressed", 0);
            r8.az = bundle2.getInt("key_reply_image_background_color", 0);
            r8.aA = bundle2.getInt("key_selected_color_dialog_color_picker", 0);
            int i7 = bundle2.getInt("KEY_TOP_VISIBLE_ITEM_IN_ROTATION");
            boolean z = bundle2.getBoolean("KEY_IS_ROTATED");
            boolean z2 = bundle2.getBoolean("KEY_IS_REQUESTED_LOAD_MORE");
            i = bundle2.getInt("KEY_MESSAGES_COUNT_LIMIT");
            r8.f16466L = bundle2.getString("KEY_CHAT_SEARCHED_MESSAGE_ID", null);
            r8.aD = bundle2.getString("KEY_CHAT_MESSAGE_ID_CHAT_ITEM_PRESSED", null);
            r8.f16469O = bundle2.getBoolean("KEY_IS_EDIT_MODE", false);
            r8.f16474T = bundle2.getBoolean("KEY_SET_CAPTION_LIMIT_IN_SAVE_INSTANCE", false);
            String string = bundle2.getString("KEY_GET_MESSAGE_ID_FOR_SHOW_UNREAD_HEADER");
            if (bundle2.containsKey("KEY_POLL_RESULT")) {
                r8.f16484f = (PollResult) bundle2.getSerializable("KEY_POLL_RESULT");
                if (r8.f16484f != null) {
                    m13979a(r8.f16484f);
                }
                bundle2.remove("KEY_POLL_RESULT");
            }
            if (r8.f16469O) {
                if (r8.at != null) {
                    r8.at.setVisibility(8);
                }
                CharSequence spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(C4522p.m8236a(R.string.action_edit));
                i4 = i6;
                view = view2;
                spannableStringBuilder.setSpan(ar(), 0, spannableStringBuilder.length(), 33);
                r8.f16496r.setTitle(spannableStringBuilder);
                mo3202Z();
            } else {
                i4 = i6;
                view = view2;
            }
            if (bundle2.containsKey("KEY_TYPE_VIEW_MODEL_EDIT_MESSAGE_SELECTED")) {
                i3 = -1;
                r8.aE = bundle2.getInt("KEY_TYPE_VIEW_MODEL_EDIT_MESSAGE_SELECTED", -1);
            } else {
                i3 = -1;
            }
            bundle3.putInt("KEY_TOP_VISIBLE_ITEM_IN_ROTATION", i7);
            bundle3.putBoolean("KEY_IS_ROTATED", z);
            bundle3.putBoolean("KEY_IS_REQUESTED_LOAD_MORE", z2);
            bundle3.putInt("KEY_MESSAGES_COUNT_LIMIT", i);
            bundle3.putString("KEY_GET_MESSAGE_ID_FOR_SHOW_UNREAD_HEADER", string);
            bundle4.putBoolean("KEY_TEXT_BOX_IS_EDIT_MODE", bundle2.getBoolean("KEY_TEXT_BOX_IS_EDIT_MODE"));
            i = i4;
        } else {
            view = view2;
            i = -1;
        }
        bundle3.putString("KEY_PEER_PARTY", r8.f16490l);
        int i8 = i3;
        r8.f16485g = new C6131b((C7576b) r8.f10377a, r8, bundle3, r8, r8.aH, r8.f16458D, a);
        FrameLayout frameLayout = (FrameLayout) r8.b.findViewById(R.id.conversation_thread_container_frame);
        if (frameLayout != null) {
            frameLayout.addView(r8.f16485g.f16592y);
        }
        Bundle bundle5 = new Bundle();
        bundle5.putBoolean("KEY_SET_CAPTION_LIMIT", r8.f16474T);
        bundle5.putBoolean("KEY_TEXT_BOX_IS_EDIT_MODE", r8.f16469O);
        r8.f16488j = new C6127a((C7576b) r8.f10377a, bundle5, r8, r8, a);
        r8.ah.addView(r8.f16488j.f16530q);
        r8.f16488j.f16531r = i;
        if (m14019h()) {
            String stringExtra2 = r8.f16471Q.getStringExtra("key_searched_message_id");
            r8.f16485g.f16584q = 0;
            r8.f16485g.f16569b = false;
            r8.f16485g.f16583p = true;
            MyApplication.m12950a().f15911q = stringExtra2;
            C2808d.m7147a(new C6756c(r8.f16490l, stringExtra2));
        }
        if (C2491i.m6830d((C7576b) r8.f10377a)) {
            i2 = C2535a.m6888a().f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_VIRTUAL_KEYBOARD_HEIGHT_PORTRAIT", i8);
            if (i2 == i8) {
                i2 = C2489g.m6754a().m6755a(0.6f);
            }
        } else {
            i2 = C2535a.m6888a().f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_VIRTUAL_KEYBOARD_HEIGHT_LANDSCAPE", i8);
            if (i2 == i8) {
                i2 = C2489g.m6754a().m6756b(0.5f);
            }
        }
        r8.f16498t = i2;
        r8.f16480Z.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(r8) {
            final /* synthetic */ C6123a f10132a;

            class C32951 implements Runnable {
                final /* synthetic */ AnonymousClass48 f10130a;

                C32951(AnonymousClass48 anonymousClass48) {
                    this.f10130a = anonymousClass48;
                }

                public final void run() {
                    this.f10130a.f10132a.f16498t = C3344e.m7825a(this.f10130a.f10132a.f16480Z);
                    C2535a a = C2535a.m6888a();
                    a.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_VIRTUAL_KEYBOARD_HEIGHT_PORTRAIT", this.f10130a.f10132a.f16498t).apply();
                }
            }

            class C32962 implements Runnable {
                final /* synthetic */ AnonymousClass48 f10131a;

                C32962(AnonymousClass48 anonymousClass48) {
                    this.f10131a = anonymousClass48;
                }

                public final void run() {
                    this.f10131a.f10132a.f16498t = C3344e.m7825a(this.f10131a.f10132a.f16480Z);
                    C2535a a = C2535a.m6888a();
                    a.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_VIRTUAL_KEYBOARD_HEIGHT_LANDSCAPE", this.f10131a.f10132a.f16498t).apply();
                }
            }

            {
                this.f10132a = r1;
            }

            public final void onGlobalLayout() {
                int a = C3344e.m7825a(this.f10132a.f16480Z);
                if (this.f10132a.f16497s != a) {
                    this.f10132a.f16497s = a;
                    C3382a c3382a = this.f10132a;
                    if (c3382a.f16481c == 0) {
                        c3382a.f16481c = C2491i.m6830d((C7576b) c3382a.f10377a) ? C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) : C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
                    }
                    if (a > c3382a.f16481c / 3) {
                        Handler handler;
                        Runnable c32951;
                        if (C2491i.m6830d((C7576b) this.f10132a.f10377a)) {
                            handler = new Handler();
                            c32951 = new C32951(this);
                        } else {
                            handler = new Handler();
                            c32951 = new C32962(this);
                        }
                        handler.postDelayed(c32951, 100);
                        C6123a c6123a = this.f10132a;
                        if (!c6123a.f16499u) {
                            c6123a.f16499u = true;
                            new Handler().postDelayed(new Runnable(c6123a) {
                                final /* synthetic */ C6123a f10133a;

                                {
                                    this.f10133a = r1;
                                }

                                public final void run() {
                                    if (this.f10133a.f16500v) {
                                        this.f10133a.f16500v = false;
                                        return;
                                    }
                                    C6131b c6131b = this.f10133a.f16485g;
                                    c6131b.m14084a(c6131b.f16578k, 0, false);
                                }
                            }, 500);
                        }
                        return;
                    }
                    this.f10132a.mo2343r();
                }
            }
        });
        r8.ak.setVisibility(8);
        r8.aF.hide();
        r8.aF.setVisibility(8);
        r8.f16486h.setVisibility(8);
        C5999b.f16152b = r8.aM;
        if (C5999b.f16151a == null) {
            C5999b.f16151a = new C5999b();
        }
        r8.f16495q = C5999b.f16151a;
        r8.f16501w = new PopupWindow(r8.f10377a.getLayoutInflater().inflate(R.layout.layout_white, null), i8, r8.f16498t, false);
        viewStub.inflate();
        r8.aq = (TextView) r8.b.findViewById(R.id.reply_top_textView);
        r8.ar = (TextView) r8.b.findViewById(R.id.reply_bottom_textView);
        r8.as = (ImageView) r8.b.findViewById(R.id.reply_imageView);
        ImageView imageView = (ImageView) r8.b.findViewById(R.id.image_view_ic_reply);
        ((ImageButton) r8.b.findViewById(R.id.close_reply_button)).setOnClickListener(new View.OnClickListener(r8) {
            final /* synthetic */ C6123a f10083a;

            {
                this.f10083a = r1;
            }

            public final void onClick(View view) {
                this.f10083a.mo3231b(true);
            }
        });
        af();
        C3337b.m7802a((C7576b) r8.f10377a, r8.f16471Q, r8.f16490l, r8.f16458D);
        if (!r8.f16457C || r8.au == null || r8.f16469O) {
            r8.f16503y.setVisibility(8);
        } else {
            ae();
        }
        if (r8.f16455A) {
            r8.f16504z = ((C7576b) r8.f10377a).startActionMode(new C7190a());
        }
        ad();
        C0005c.m0a().m9d(new C3473a(r8.f16490l));
        if (r8.f16496r != null) {
            C2491i.m6796a(r8.f16496r, UIThemeManager.getmInstance().getPrimary_color());
            C2491i.m6790a(r8.f16496r.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
            r8.f16496r.setOverflowIcon(C0343b.m671a(((C7576b) r8.f10377a).getResources(), R.drawable.ic_option, ((C7576b) r8.f10377a).getTheme()));
            if (r8.f16496r.getOverflowIcon() != null) {
                C6123a.m13892a(r8.f16496r.getOverflowIcon());
            }
        }
        C2491i.m6801a(imageView, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6797a(r8.aI, UIThemeManager.getmInstance().getShadow_toolbar_start_gradient_color(), UIThemeManager.getmInstance().getShadow_toolbar_end_gradient_color());
        C2491i.m6802a(r8.f16486h, UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6802a(r8.ak, UIThemeManager.getmInstance().getSubtitle_toolbar_color());
        if (r8.aF != null) {
            r8.aF.setIndicatorColor(UIThemeManager.getmInstance().getSubtitle_toolbar_color());
        }
        C2491i.m6796a(view, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(r8.ai, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C4121n.m8000b();
    }

    protected final void m13990b(String str) {
        this.af = str;
        if (this.f16483e != 0) {
            this.ak.setText(C4522p.m8236a(R.string.updating_sub_title));
            this.ak.setVisibility(0);
        } else if (str == null || str.isEmpty()) {
            this.ak.setText("");
            this.ak.setVisibility(8);
        } else {
            CharSequence b;
            if (this.aC.equals("fa")) {
                b = C2491i.m6814b(str);
            }
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(b);
            spannableStringBuilder.setSpan(ar(), 0, spannableStringBuilder.length(), 33);
            this.ak.setText(spannableStringBuilder);
            this.ak.setVisibility(0);
        }
    }

    public final void mo2319b(String str, String str2) {
        if (!this.f16455A) {
            String n = m14027n();
            if (new File(Uri.parse(str).getPath()).exists()) {
                C4478a.m8148a((C7576b) this.f10377a, str, str2, this.f16458D, n);
                return;
            }
            C2984c.m7457a(str, C2987i.NOT_STARTED);
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
        }
    }

    public final void mo2320b(String str, String str2, String str3, String str4) {
        if (new File(Uri.parse(str).getPath()).exists()) {
            Activity activity = (C7576b) this.f10377a;
            Intent intent = new Intent(activity, MusicPlayerActivity.class);
            intent.putExtra("KEY_AUDIO_PATH", str);
            intent.putExtra("KEY_AUDIO_TITLE", str2);
            intent.putExtra("KEY_AUDIO_DESCRIPTION", str3);
            intent.putExtra("KEY_AUDIO_AVATAR", str4);
            if (activity != null) {
                activity.startActivity(intent);
                C4478a.m8165c(activity, true);
            }
            return;
        }
        C2984c.m7457a(str, C2987i.NOT_STARTED);
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo2321b(C7197a c7197a) {
        if (!this.f16469O) {
            this.aD = c7197a.f20777c;
        }
        if (ac() && !this.f16455A && !this.f16469O) {
            Vibrator vibrator = (Vibrator) ((C7576b) this.f10377a).getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(50);
            }
            if (ac() && !this.f16455A) {
                this.f16455A = true;
                if (!this.f16456B.containsKey(Long.valueOf(c7197a.mo3604b()))) {
                    this.f16456B.put(Long.valueOf(c7197a.mo3604b()), c7197a);
                    C6123a.m13906a(c7197a, true);
                    m13917b(c7197a, true);
                    if (aq()) {
                        C3004f c3004f = ((C6875d) this).ai;
                        int[] iArr;
                        int i;
                        if (c3004f == C3004f.OWNER) {
                            if (C3337b.m7814b(c7197a.f19503j)) {
                                iArr = MyApplication.m12950a().f15906l;
                                i = MyApplication.f15883i;
                                iArr[i] = iArr[i] + 1;
                            }
                        } else if (c3004f == C3004f.ADMIN) {
                            if (C3337b.m7819e(c7197a.f19503j)) {
                                iArr = MyApplication.m12950a().f15906l;
                                i = MyApplication.f15879e;
                                iArr[i] = iArr[i] + 1;
                            }
                        } else if (c3004f == C3004f.MEMBER && C3337b.m7818d(c7197a.f19503j)) {
                            iArr = MyApplication.m12950a().f15906l;
                            i = MyApplication.f15880f;
                            iArr[i] = iArr[i] + 1;
                        }
                    }
                    this.f16485g.m14093c(c7197a.f19504k);
                    this.f16504z = ((C7576b) this.f10377a).startActionMode(new C7190a());
                }
            }
        }
    }

    public void mo2322c() {
        this.f16476V = false;
        C6131b c6131b = this.f16485g;
        String str = this.f16490l;
        if (!(c6131b.f16574g == null || c6131b.f16574g.getItemCount() <= 0 || c6131b.f16573f == null)) {
            String str2 = null;
            C7197a c7197a = (C7197a) c6131b.f16574g.m17257b(c6131b.f16573f.findFirstVisibleItemPosition());
            if (c7197a != null) {
                str2 = c7197a.f20777c;
            }
            C2808d.m7147a(new C6759f(str, str2));
        }
        C2808d.m7147a(new C6760g(this.f16490l, this.f16492n, true));
        MyApplication.m12950a().f15911q = "";
    }

    public void mo2323c(Bundle bundle) {
        if (this.f16469O) {
            this.f16496r.setNavigationIcon((int) R.drawable.ic_close_gray);
            if (this.f16496r.getNavigationIcon() != null) {
                C2491i.m6790a(this.f16496r.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
            }
        }
    }

    public final void mo2324c(String str) {
        m13926l(str);
    }

    public final void mo2325c(String str, String str2) {
        if (!this.f16455A) {
            String n = m14027n();
            if (new File(Uri.parse(str).getPath()).canRead()) {
                C4478a.m8148a((C7576b) this.f10377a, str, str2, this.f16458D, n);
                return;
            }
            C2984c.m7457a(str, C2987i.NOT_STARTED);
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
        }
    }

    final void m13998c(C7197a c7197a) {
        C2808d.m7147a(new C6727b(new String[]{c7197a.f20777c}, this.aB, C2973m.SINGLE));
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.toast_message_send_to_my_cloud), 0).show();
    }

    public void mo2326d() {
        ((C7576b) this.f10377a).m19190e().mo269a(57);
        if (!(this.f16485g == null || !this.f16485g.f16585r || this.f16458D == null || this.f16458D.equals(C2973m.SINGLE))) {
            ad();
        }
        if (this.f16488j != null) {
            String c = this.f16488j.m14064c();
            Object obj = 1;
            if (c != null) {
                if (this.au != null && !this.au.isEmpty()) {
                    mo3225i(c, this.au);
                    C2808d.m7148b(new C6761c(this.f16458D, this.f16490l));
                    this.al = null;
                } else if (!c.isEmpty()) {
                    mo3225i(c, null);
                    if (obj == null && this.al != null) {
                        C2808d.m7148b(new C6761c(this.f16458D, this.f16490l));
                        this.al = null;
                    }
                }
            }
            obj = null;
            C2808d.m7148b(new C6761c(this.f16458D, this.f16490l));
            this.al = null;
        }
        MyApplication.m12950a().f15896K = null;
        C2808d.m7148b(new C6763a(this.aj));
        if (C0005c.m0a().m7b(this)) {
            C0005c.m0a().m8c(this);
        }
    }

    public void mo2327d(Bundle bundle) {
        if (this.aL != null && this.aL.size() > 0) {
            bundle.putStringArrayList("KEY_ROTATE_FORWARD_PEER_PARTY", new ArrayList(this.aL.keySet()));
            bundle.putIntegerArrayList("KEY_ROTATE_FORWARD_GROUP_ID", new ArrayList(this.aL.values()));
        }
        bundle.putInt("KEY_TOP_VISIBLE_ITEM_IN_ROTATION", this.f16485g.f16578k);
        bundle.putBoolean("KEY_IS_ROTATED", true);
        bundle.putBoolean("KEY_IS_REQUESTED_LOAD_MORE", this.f16485g.f16591x);
        bundle.putInt("KEY_MESSAGES_COUNT_LIMIT", this.f16485g.f16577j);
        String str = "KEY_GET_MESSAGE_ID_FOR_SHOW_UNREAD_HEADER";
        C6131b c6131b = this.f16485g;
        bundle.putString(str, c6131b.f16574g != null ? ((C7191c) c6131b.f16574g).f20703a : "");
        bundle.putBoolean("KEY_TEXT_BOX_IS_EDIT_MODE", this.f16488j.f16521h);
        bundle.putBoolean("key_is_reply_mode", this.f16457C);
        bundle.putString("key_reply_message_id", this.au);
        bundle.putString("KEY_FLOATING_FORWARD_MESSAGE_ID", this.ag != null ? this.ag.f10262a : "");
        bundle.putString("key_reply_top_text", this.av);
        bundle.putString("key_reply_bottom_text", this.aw);
        bundle.putString("key_reply_image_uri", this.ax);
        bundle.putInt("key_reply_image_res_id", this.ay);
        bundle.putInt("key_request_code_on_attach_pressed", this.f16494p);
        bundle.putInt("key_reply_image_background_color", this.az);
        bundle.putBoolean("KEY_IS_ACTION_MODE_SHOWING", this.f16455A);
        bundle.putInt("key_selected_color_dialog_color_picker", this.aA);
        bundle.putString("KEY_CHAT_SEARCHED_MESSAGE_ID", this.f16466L);
        bundle.putString("KEY_CHAT_MESSAGE_ID_CHAT_ITEM_PRESSED", this.aD);
        bundle.putBoolean("KEY_IS_EDIT_MODE", this.f16469O);
        bundle.putBoolean("KEY_SET_CAPTION_LIMIT_IN_SAVE_INSTANCE", this.f16474T);
        if (this.aE != -1) {
            bundle.putInt("KEY_TYPE_VIEW_MODEL_EDIT_MESSAGE_SELECTED", this.aE);
        }
        if (this.f16488j != null) {
            bundle.putInt("KEY_MAX_COUNT_LIMIT", this.f16488j.f16531r);
        }
        if (this.aJ == null || !this.aJ.isShowing()) {
            this.f16484f = null;
        } else {
            bundle.putSerializable("KEY_POLL_RESULT", this.f16484f);
        }
    }

    public final void mo2328d(String str) {
        if (str.isEmpty()) {
            Object obj;
            int i = this.aE;
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    obj = 1;
                    break;
                default:
                    switch (i) {
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                case 79:
                                    break;
                                default:
                                    switch (i) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                            break;
                                        default:
                                            switch (i) {
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 114:
                                                        case 115:
                                                        case 116:
                                                        case 117:
                                                        case 118:
                                                        case 119:
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 45:
                                                                case 47:
                                                                case 49:
                                                                case 2111:
                                                                case 2115:
                                                                case 3111:
                                                                case 3115:
                                                                case 4111:
                                                                case 4115:
                                                                case 7111:
                                                                case 7115:
                                                                case 8111:
                                                                case 8115:
                                                                case 10111:
                                                                case 10115:
                                                                case 11111:
                                                                case 111115:
                                                                    break;
                                                                default:
                                                                    obj = null;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                    obj = 1;
                    break;
            }
            if (obj == null) {
                return;
            }
        }
        C2808d.m7148b(new C6714b(this.aD, str));
    }

    public final void mo2329d(java.lang.String r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new java.io.File;
        r1 = android.net.Uri.parse(r4);
        r1 = r1.getPath();
        r0.<init>(r1);
        r0 = r0.exists();
        if (r0 == 0) goto L_0x008f;
    L_0x0013:
        r0 = mobi.mmdt.componentsutils.C2468a.m6711h(r5);
        r1 = "stheme";
        r1 = r0.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x0039;
    L_0x001f:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = "dialog_id";
        r2 = 100;
        r0.putInt(r1, r2);
        r1 = "THEME_ORG_FILE_PATH";
        r0.putString(r1, r4);
        r4 = "THEME_ORG_FILE_NAME";
        r0.putString(r4, r5);
        r3.m14004e(r0);
        return;
    L_0x0039:
        r1 = "stheme2";
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x005b;
    L_0x0041:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = "dialog_id";
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0.putInt(r1, r2);
        r1 = "THEME_ORG_FILE_PATH";
        r0.putString(r1, r4);
        r4 = "THEME_ORG_FILE_NAME";
        r0.putString(r4, r5);
        r3.m14004e(r0);
        return;
    L_0x005b:
        r5 = r3.f10377a;
        r5 = (mobi.mmdt.ott.view.components.p402d.C7576b) r5;
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r0.<init>(r1);
        r1 = mobi.mmdt.componentsutils.C2468a.m6713j(r4);
        r4 = android.net.Uri.parse(r4);
        r0.setDataAndType(r4, r1);
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.setFlags(r4);
        if (r5 == 0) goto L_0x008e;
    L_0x0078:
        r4 = 1;
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0080 }
        mobi.mmdt.ott.view.tools.C4478a.m8165c(r5, r4);	 Catch:{ ActivityNotFoundException -> 0x0080 }
        return;
    L_0x0080:
        r0 = 2131690177; // 0x7f0f02c1 float:1.900939E38 double:1.053194884E-314;
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r4 = android.widget.Toast.makeText(r5, r0, r4);
        r4.show();
    L_0x008e:
        return;
    L_0x008f:
        r5 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        mobi.mmdt.ott.provider.p386h.C2984c.m7457a(r4, r5);
        r4 = r3.f10377a;
        r4 = (mobi.mmdt.ott.view.components.p402d.C7576b) r4;
        r5 = 2131689942; // 0x7f0f01d6 float:1.9008914E38 double:1.053194768E-314;
        r5 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r0 = 0;
        r4 = android.widget.Toast.makeText(r4, r5, r0);
        r4.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.d(java.lang.String, java.lang.String):void");
    }

    public void mo2330e() {
        if (this.f16469O) {
            if (this.f16457C) {
                ae();
            }
            this.f16469O = false;
            this.aD = "";
            this.f16456B.clear();
            this.f16485g.m14104k();
            this.f16496r.setTitle((CharSequence) "");
            this.f16488j.m14063b((C7576b) this.f10377a);
            this.f16488j.m14059a((C7576b) this.f10377a, Integer.valueOf(4000));
            this.f16474T = false;
            this.f16488j.m14062b();
            this.at.setVisibility(0);
            aa();
            this.f16496r.setNavigationIcon((int) R.drawable.ic_back_dark);
            if (this.f16496r.getNavigationIcon() != null) {
                C2491i.m6790a(this.f16496r.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
            }
        } else if (this.an) {
            this.an = false;
            this.f16488j.m14066d();
        } else {
            m14012g();
            m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
        }
    }

    public final void m14004e(Bundle bundle) {
        ((ConversationActivity) ((C7576b) this.f10377a)).b_(bundle);
    }

    public final void mo2331e(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 98);
        bundle.putString("KEY_DIALOG_VIDEO_PATH", str);
        m14004e(bundle);
        C2827a.m7163a();
    }

    public final void mo2332e(String str, String str2) {
        if (!this.f16455A) {
            C4478a.m8140a((C7576b) this.f10377a, Double.parseDouble(str), Double.parseDouble(str2), false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2333e(mobi.mmdt.ott.view.conversation.p573f.C7197a r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r1.f19503j;
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7821g(r2);
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.au();
        if (r3 == 0) goto L_0x001f;
    L_0x0014:
        r3 = r17.aq();
        if (r3 == 0) goto L_0x001f;
    L_0x001a:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
        if (r2 == r3) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r0.aK = r1;
        r3 = r0.f16456B;
        r3 = r3.size();
        if (r3 != 0) goto L_0x027f;
    L_0x0029:
        r3 = r0.f16469O;
        if (r3 != 0) goto L_0x027f;
    L_0x002d:
        r3 = r0.f16457C;
        if (r3 != 0) goto L_0x027f;
    L_0x0031:
        r3 = r0.aa;
        if (r3 != 0) goto L_0x027f;
    L_0x0035:
        r3 = r17.ac();
        if (r3 == 0) goto L_0x027f;
    L_0x003b:
        r3 = 1;
        r0.aa = r3;
        r4 = r17.m13933F();
        r5 = 0;
        if (r4 == 0) goto L_0x0056;
    L_0x0045:
        r4 = r18.m19056c();
        if (r4 != 0) goto L_0x0054;
    L_0x004b:
        r4 = r17.m13931D();
        if (r4 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        r4 = r5;
        goto L_0x005a;
    L_0x0054:
        r4 = r3;
        goto L_0x005a;
    L_0x0056:
        r4 = r17.ao();
    L_0x005a:
        r6 = r17.an();
        r7 = r17.am();
        if (r7 == 0) goto L_0x006c;
    L_0x0064:
        r7 = r17.mo3192P();
        if (r7 == 0) goto L_0x006c;
    L_0x006a:
        r7 = r3;
        goto L_0x006d;
    L_0x006c:
        r7 = r5;
    L_0x006d:
        if (r2 == 0) goto L_0x027f;
    L_0x006f:
        r8 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10123a;
        r2 = r2.ordinal();
        r2 = r8[r2];
        r8 = 2;
        switch(r2) {
            case 1: goto L_0x018f;
            case 2: goto L_0x017c;
            case 3: goto L_0x0163;
            case 4: goto L_0x0163;
            case 5: goto L_0x0151;
            case 6: goto L_0x00ac;
            case 7: goto L_0x018f;
            case 8: goto L_0x009a;
            case 9: goto L_0x0095;
            case 10: goto L_0x0085;
            default: goto L_0x007b;
        };
    L_0x007b:
        r2 = r5;
        r4 = r2;
        r6 = r4;
        r7 = r6;
        r9 = r7;
    L_0x0080:
        r10 = r9;
    L_0x0081:
        r11 = r10;
        r12 = r11;
        goto L_0x01a5;
    L_0x0085:
        if (r7 == 0) goto L_0x0090;
    L_0x0087:
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        r4 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        goto L_0x0092;
    L_0x0090:
        r2 = r5;
        r4 = r2;
    L_0x0092:
        r7 = r2;
        r9 = r4;
        goto L_0x00a8;
    L_0x0095:
        r6 = r4;
        r2 = r5;
        r4 = r2;
        r9 = r4;
        goto L_0x0080;
    L_0x009a:
        if (r7 == 0) goto L_0x00a4;
    L_0x009c:
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        if (r2 == 0) goto L_0x00a4;
    L_0x00a2:
        r2 = r3;
        goto L_0x00a5;
    L_0x00a4:
        r2 = r5;
    L_0x00a5:
        r7 = r2;
        r9 = r3;
        r6 = r4;
    L_0x00a8:
        r2 = r5;
        r4 = r2;
        r10 = r4;
        goto L_0x0081;
    L_0x00ac:
        if (r7 == 0) goto L_0x00b6;
    L_0x00ae:
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        if (r2 == 0) goto L_0x00b6;
    L_0x00b4:
        r2 = r3;
        goto L_0x00b7;
    L_0x00b6:
        r2 = r5;
    L_0x00b7:
        r6 = r1.f19503j;
        r7 = 6111; // 0x17df float:8.563E-42 double:3.019E-320;
        if (r6 == r7) goto L_0x00fc;
    L_0x00bd:
        r7 = 6115; // 0x17e3 float:8.569E-42 double:3.021E-320;
        if (r6 == r7) goto L_0x00f6;
    L_0x00c1:
        switch(r6) {
            case 62: goto L_0x00f0;
            case 63: goto L_0x00ea;
            case 64: goto L_0x00e4;
            case 65: goto L_0x00de;
            case 66: goto L_0x00d8;
            case 67: goto L_0x00d2;
            case 68: goto L_0x00cc;
            case 69: goto L_0x00c6;
            default: goto L_0x00c4;
        };
    L_0x00c4:
        r6 = 0;
        goto L_0x0101;
    L_0x00c6:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7631k) r6;
        r6 = r6.f23488Q;
        goto L_0x0101;
    L_0x00cc:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7618k) r6;
        r6 = r6.f23410Q;
        goto L_0x0101;
    L_0x00d2:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7718j) r6;
        r6 = r6.f24300Q;
        goto L_0x0101;
    L_0x00d8:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7706j) r6;
        r6 = r6.f24183Q;
        goto L_0x0101;
    L_0x00de:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7605k) r6;
        r6 = r6.f23325Q;
        goto L_0x0101;
    L_0x00e4:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7592k) r6;
        r6 = r6.f23206Q;
        goto L_0x0101;
    L_0x00ea:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7644k) r6;
        r6 = r6.f23561Q;
        goto L_0x0101;
    L_0x00f0:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7670k) r6;
        r6 = r6.f23744Q;
        goto L_0x0101;
    L_0x00f6:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7657k) r6;
        r6 = r6.f23655Q;
        goto L_0x0101;
    L_0x00fc:
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7683k) r6;
        r6 = r6.f23844Q;
    L_0x0101:
        if (r6 == 0) goto L_0x0144;
    L_0x0103:
        r7 = r0.f10377a;
        r7 = (mobi.mmdt.ott.view.components.p402d.C7576b) r7;
        r9 = r7.getContentResolver();
        r10 = mobi.mmdt.ott.provider.p394p.C3015b.f9463a;
        r11 = 0;
        r12 = "stickerspackage_package_id =?  AND stickerspackage_download_state =? ";
        r13 = new java.lang.String[r8];
        r13[r5] = r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = mobi.mmdt.ott.provider.p394p.C3016f.READY;
        r7 = r7.ordinal();
        r6.append(r7);
        r6 = r6.toString();
        r13[r3] = r6;
        r14 = 0;
        r6 = r9.query(r10, r11, r12, r13, r14);
        if (r6 == 0) goto L_0x0137;
    L_0x012f:
        r7 = r6.getCount();
        if (r7 <= 0) goto L_0x0137;
    L_0x0135:
        r7 = r3;
        goto L_0x0138;
    L_0x0137:
        r7 = r5;
    L_0x0138:
        if (r6 == 0) goto L_0x0145;
    L_0x013a:
        r9 = r6.isClosed();
        if (r9 != 0) goto L_0x0145;
    L_0x0140:
        r6.close();
        goto L_0x0145;
    L_0x0144:
        r7 = r5;
    L_0x0145:
        r6 = r7 ^ 1;
        r7 = r2;
        r9 = r3;
        r2 = r5;
        r11 = r2;
        r12 = r11;
        r10 = r6;
        r6 = r4;
        r4 = r12;
        goto L_0x01a5;
    L_0x0151:
        r2 = mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass44.f10124b;
        r6 = r1;
        r6 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r6;
        r6 = r6.f21340z;
        r6 = r6.ordinal();
        r2 = r2[r6];
        if (r2 == r3) goto L_0x0161;
    L_0x0160:
        goto L_0x0163;
    L_0x0161:
        r2 = r3;
        goto L_0x0164;
    L_0x0163:
        r2 = r5;
    L_0x0164:
        r6 = r2;
        r9 = r1.f19503j;
        r9 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7809a(r9);
        if (r7 == 0) goto L_0x0175;
    L_0x016d:
        r7 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        if (r7 == 0) goto L_0x0175;
    L_0x0173:
        r7 = r3;
        goto L_0x0176;
    L_0x0175:
        r7 = r5;
    L_0x0176:
        r11 = r2;
        r10 = r5;
        r12 = r6;
        r2 = r9;
        r9 = r3;
        goto L_0x01a3;
    L_0x017c:
        if (r7 == 0) goto L_0x0186;
    L_0x017e:
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        if (r2 == 0) goto L_0x0186;
    L_0x0184:
        r2 = r3;
        goto L_0x0187;
    L_0x0186:
        r2 = r5;
    L_0x0187:
        r7 = r2;
        r2 = r3;
        r9 = r2;
        r6 = r4;
        r10 = r5;
        r11 = r10;
        r12 = r11;
        goto L_0x01a4;
    L_0x018f:
        r2 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7810a(r18);
        if (r7 == 0) goto L_0x019d;
    L_0x0195:
        r6 = mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.m13908a(r18);
        if (r6 == 0) goto L_0x019d;
    L_0x019b:
        r6 = r3;
        goto L_0x019e;
    L_0x019d:
        r6 = r5;
    L_0x019e:
        r9 = r3;
        r10 = r5;
        r11 = r10;
        r12 = r11;
        r7 = r6;
    L_0x01a3:
        r6 = r4;
    L_0x01a4:
        r4 = r9;
    L_0x01a5:
        r13 = r1.f19503j;
        r13 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7820f(r13);
        if (r13 == 0) goto L_0x01bf;
    L_0x01ad:
        r13 = r0.aK;
        r13 = r13 instanceof mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
        if (r13 == 0) goto L_0x01bf;
    L_0x01b3:
        r13 = r0.aK;
        r13 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r13;
        r13 = r13.mo3627d();
        if (r13 != 0) goto L_0x01bf;
    L_0x01bd:
        r13 = r3;
        goto L_0x01c0;
    L_0x01bf:
        r13 = r5;
    L_0x01c0:
        r14 = r17.aq();
        if (r14 == 0) goto L_0x020c;
    L_0x01c6:
        r14 = r0;
        r14 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r14;
        r15 = r14.ai;
        r8 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r15 != r8) goto L_0x01ec;
    L_0x01cf:
        r8 = r1.f19503j;
        switch(r8) {
            case 14: goto L_0x01d6;
            case 16: goto L_0x01d6;
            case 24: goto L_0x01d6;
            case 26: goto L_0x01d6;
            case 34: goto L_0x01d6;
            case 36: goto L_0x01d6;
            case 44: goto L_0x01d6;
            case 46: goto L_0x01d6;
            case 74: goto L_0x01d6;
            case 76: goto L_0x01d6;
            case 84: goto L_0x01d6;
            case 86: goto L_0x01d6;
            case 104: goto L_0x01d6;
            case 106: goto L_0x01d6;
            case 114: goto L_0x01d6;
            case 116: goto L_0x01d6;
            default: goto L_0x01d4;
        };
    L_0x01d4:
        r8 = r5;
        goto L_0x01d7;
    L_0x01d6:
        r8 = r3;
    L_0x01d7:
        if (r8 == 0) goto L_0x01ec;
    L_0x01d9:
        r8 = r0.aK;
        r8 = r8 instanceof mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
        if (r8 == 0) goto L_0x01eb;
    L_0x01df:
        r8 = r0.aK;
        r8 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r8;
        r8 = r8.mo3627d();
        if (r8 != 0) goto L_0x01ec;
    L_0x01e9:
        r13 = r3;
        goto L_0x01ec;
    L_0x01eb:
        r13 = r5;
    L_0x01ec:
        r8 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r15 != r8) goto L_0x01fa;
    L_0x01f0:
        r1 = r1.f19503j;
        r1 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7819e(r1);
        if (r1 == 0) goto L_0x0207;
    L_0x01f8:
        r6 = r5;
        goto L_0x0207;
    L_0x01fa:
        r8 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r15 != r8) goto L_0x0207;
    L_0x01fe:
        r1 = r1.f19503j;
        r1 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b.m7818d(r1);
        if (r1 == 0) goto L_0x0207;
    L_0x0206:
        r6 = r3;
    L_0x0207:
        r1 = r14.ah;
        if (r1 != 0) goto L_0x020c;
    L_0x020b:
        r7 = r5;
    L_0x020c:
        r1 = 9;
        r1 = new boolean[r1];
        r1[r5] = r7;
        r1[r3] = r2;
        r2 = 2;
        r1[r2] = r4;
        r2 = 3;
        r1[r2] = r9;
        r2 = 4;
        r1[r2] = r13;
        r2 = 5;
        r1[r2] = r6;
        r2 = 6;
        r1[r2] = r10;
        r2 = 7;
        r1[r2] = r12;
        r2 = 8;
        r1[r2] = r11;
        r1 = r0.m13909a(r1);
        r2 = r1.length;
        if (r2 <= 0) goto L_0x027d;
    L_0x0231:
        r2 = new android.support.v7.app.b$a;
        r3 = r0.f10377a;
        r3 = (mobi.mmdt.ott.view.components.p402d.C7576b) r3;
        r2.<init>(r3);
        r3 = new java.lang.StringBuilder;
        r4 = "<b>";
        r3.<init>(r4);
        r4 = 2131690486; // 0x7f0f03f6 float:1.9010017E38 double:1.0531950367E-314;
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);
        r3.append(r4);
        r4 = "</b>";
        r3.append(r4);
        r3 = r3.toString();
        r3 = android.text.Html.fromHtml(r3);
        r2.m1608a(r3);
        r3 = new mobi.mmdt.ott.view.conversation.activities.a.a$11;
        r3.<init>(r0, r1);
        r2.m1611a(r1, r3);
        r1 = new mobi.mmdt.ott.view.conversation.activities.a.a$13;
        r1.<init>(r0);
        r3 = r2.f2211a;
        r3.f2135q = r1;
        r1 = new mobi.mmdt.ott.view.conversation.activities.a.a$14;
        r1.<init>(r0);
        r3 = r2.f2211a;
        r3.f2134p = r1;
        r1 = r2.m1612a();
        r1.show();
        return;
    L_0x027d:
        r0.aa = r5;
    L_0x027f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.e(mobi.mmdt.ott.view.conversation.f.a):void");
    }

    public final View m14008f() {
        return this.b;
    }

    protected abstract void mo3220f(String str);

    public final void mo2334f(String str, String str2) {
        mo2343r();
        this.f16488j.m14065c((C7576b) this.f10377a);
        this.f16488j.m14056a();
        C2808d.m7147a(new C6681e(this.f16490l, str, str2));
    }

    public final void mo2335f(C7197a c7197a) {
        if (!this.f16469O && !this.f16457C) {
            this.ag.f10262a = c7197a.f20777c;
            if (this.f16499u) {
                this.f16488j.m14065c((C7576b) this.f10377a);
            }
            C3343d c3343d = this.ag;
            boolean z = this.f16499u;
            c3343d.f10263b.m19190e().mo268a(57, null, c3343d.f10271j);
            new Handler().postDelayed(new C33425(c3343d), z ? 100 : 0);
        }
    }

    protected final void m14012g() {
        ((C7576b) this.f10377a).finish();
    }

    public abstract void mo3221g(String str);

    public final void mo2336g(String str, String str2) {
        if (new File(Uri.parse(str2).getPath()).canRead()) {
            try {
                C4121n.m7999a().m8001a(str);
                return;
            } catch (Throwable e) {
                C2480b.m6738b(e);
                return;
            }
        }
        C2984c.m7457a(str2, C2987i.NOT_STARTED);
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo2337g(C7197a c7197a) {
        m13998c(c7197a);
    }

    public abstract void mo3222h(String str);

    protected abstract void mo3223h(String str, String str2);

    public final void mo2338h(C7197a c7197a) {
        C7358a c7358a = (C7358a) c7197a;
        mo2309a(c7358a.f21327m, c7358a.f21333s);
    }

    public final boolean m14019h() {
        return (this.f16471Q == null || this.f16471Q.getExtras() == null || !this.f16471Q.getExtras().containsKey("key_searched_message_id")) ? false : true;
    }

    final void m14020i() {
        this.f16503y.setVisibility(8);
    }

    protected abstract void mo3225i(String str, String str2);

    public final void mo2339i(C7197a c7197a) {
        m13924j(c7197a);
    }

    final void m14023j() {
        this.f16503y.setVisibility(0);
    }

    public final int m14024k() {
        return this.f16489k;
    }

    public final void m14025l() {
        this.f16489k = 0;
    }

    final void m14026m() {
        if (this.f16471Q != null && this.f16471Q.getExtras() != null && this.f16471Q.getExtras().getBoolean("key_is_share_mode", false)) {
            C4488b.m8185b((C7576b) this.f10377a, C4522p.m8236a(R.string.share), C4522p.m8236a(R.string.are_you_wanna_send_to_here), C4522p.m8236a(R.string.ok_cap), new OnClickListener(this) {
                final /* synthetic */ C6123a f10128a;

                {
                    this.f10128a = r1;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.content.DialogInterface r8, int r9) {
                    /*
                    r7 = this;
                    r8 = r7.f10128a;
                    r8 = r8.f16471Q;
                    r9 = "key_is_share_mode";
                    r8.removeExtra(r9);
                    r8 = r7.f10128a;
                    r9 = r8.f16471Q;
                    r9 = r9.getExtras();
                    r0 = "KEY_SHARE_INTENT";
                    r9 = r9.containsKey(r0);
                    if (r9 == 0) goto L_0x009b;
                L_0x0019:
                    r9 = r8.f16471Q;
                    r9 = r9.getExtras();
                    r0 = "KEY_SHARE_INTENT";
                    r9 = r9.getParcelable(r0);
                    r9 = (android.content.Intent) r9;
                    r0 = r9.getAction();
                    r1 = r9.getType();
                    if (r1 == 0) goto L_0x009b;
                L_0x0031:
                    r2 = -1;
                    r3 = r0.hashCode();
                    r4 = -1173264947; // 0xffffffffba1165cd float:-5.5464805E-4 double:NaN;
                    r5 = 0;
                    r6 = 1;
                    if (r3 == r4) goto L_0x004d;
                L_0x003d:
                    r4 = -58484670; // 0xfffffffffc839842 float:-5.4662324E36 double:NaN;
                    if (r3 == r4) goto L_0x0043;
                L_0x0042:
                    goto L_0x0056;
                L_0x0043:
                    r3 = "android.intent.action.SEND_MULTIPLE";
                    r0 = r0.equals(r3);
                    if (r0 == 0) goto L_0x0056;
                L_0x004b:
                    r2 = r6;
                    goto L_0x0056;
                L_0x004d:
                    r3 = "android.intent.action.SEND";
                    r0 = r0.equals(r3);
                    if (r0 == 0) goto L_0x0056;
                L_0x0055:
                    r2 = r5;
                L_0x0056:
                    r0 = 0;
                    switch(r2) {
                        case 0: goto L_0x0066;
                        case 1: goto L_0x005b;
                        default: goto L_0x005a;
                    };
                L_0x005a:
                    goto L_0x0098;
                L_0x005b:
                    r2 = "android.intent.extra.STREAM";
                    r9 = r9.getParcelableArrayListExtra(r2);
                L_0x0061:
                    r0 = mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3345f.m7826a(r1, r9, r0);
                    goto L_0x0098;
                L_0x0066:
                    r2 = "android.intent.extra.STREAM";
                    r2 = r9.getParcelableExtra(r2);
                    r2 = (android.net.Uri) r2;
                    if (r1 != 0) goto L_0x0071;
                L_0x0070:
                    goto L_0x007f;
                L_0x0071:
                    r0 = "/";
                    r0 = r1.split(r0);
                    r3 = r0.length;
                    if (r3 != r6) goto L_0x007d;
                L_0x007a:
                    r0 = r0[r5];
                    goto L_0x007f;
                L_0x007d:
                    r0 = r0[r6];
                L_0x007f:
                    r3 = "android.intent.extra.TEXT";
                    r9 = r9.getStringExtra(r3);
                    if (r2 != 0) goto L_0x008f;
                L_0x0087:
                    r0 = new mobi.mmdt.ott.view.conversation.forward.g;
                    r1 = mobi.mmdt.ott.view.conversation.forward.C4058h.TEXT;
                    r0.<init>(r1, r9);
                    goto L_0x0098;
                L_0x008f:
                    r9 = new java.util.ArrayList;
                    r9.<init>();
                    r9.add(r2);
                    goto L_0x0061;
                L_0x0098:
                    r8.m13982a(r0);
                L_0x009b:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.46.onClick(android.content.DialogInterface, int):void");
                }
            }, C4522p.m8236a(R.string.cancel), new OnClickListener(this) {
                final /* synthetic */ C6123a f10129a;

                {
                    this.f10129a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f10129a.f16471Q.removeExtra("key_is_share_mode");
                    this.f10129a.m14012g();
                }
            });
        }
    }

    final String m14027n() {
        return (this.f16486h == null || this.f16486h.getText() == null) ? "" : this.f16486h.getText().toString();
    }

    public final void mo2340o() {
        if (!this.ap) {
            this.ap = true;
            C2808d.m7147a(new C6760g(this.f16490l, this.f16492n, false));
        }
    }

    public void onEvent(C2596b c2596b) {
        if (((C7576b) this.f10377a) != null) {
            ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6123a f10119a;

                {
                    this.f10119a = r1;
                }

                public final void run() {
                    C4258b.m8066a((C7576b) this.f10119a.f10377a);
                    if (!(this.f10119a.f16458D == null || this.f10119a.f16490l == null)) {
                        int i = AnonymousClass44.f10126d[this.f10119a.f16458D.ordinal()];
                        Activity activity;
                        String str;
                        Intent intent;
                        if (i != 1) {
                            switch (i) {
                                case 4:
                                    activity = (C7576b) this.f10119a.f10377a;
                                    str = this.f10119a.f16490l;
                                    intent = new Intent(activity, MainActivity.class);
                                    intent.putExtra("KEY_START_GROUP_PARTY", str);
                                    intent.putExtra("KEY_LAST_POSITION", "");
                                    intent.putExtra("KEY_START_KIND", C3383b.f10380b - 1);
                                    intent.putExtra("KEY_PARTY", str);
                                    if (activity != null) {
                                        activity.startActivity(intent);
                                        C4478a.m8165c(activity, false);
                                    }
                                    return;
                                case 5:
                                    activity = (C7576b) this.f10119a.f10377a;
                                    str = this.f10119a.f16490l;
                                    intent = new Intent(activity, MainActivity.class);
                                    intent.putExtra("KEY_START_SINGLE_PARTY", str);
                                    intent.putExtra("KEY_LAST_POSITION", "");
                                    intent.putExtra("KEY_START_KIND", C3383b.f10379a - 1);
                                    intent.putExtra("KEY_PARTY", str);
                                    if (activity != null) {
                                        activity.startActivity(intent);
                                        C4478a.m8165c(activity, false);
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        activity = (C7576b) this.f10119a.f10377a;
                        str = this.f10119a.f16490l;
                        intent = new Intent(activity, MainActivity.class);
                        intent.putExtra("KEY_START_CHANNEL_PARTY", str);
                        intent.putExtra("KEY_LAST_POSITION", "");
                        intent.putExtra("KEY_START_KIND", C3383b.f10381c - 1);
                        intent.putExtra("KEY_PARTY", str);
                        if (activity != null) {
                            activity.startActivity(intent);
                            C4478a.m8165c(activity, false);
                        }
                    }
                }
            });
        }
    }

    public void onEvent(final C5899b c5899b) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10075b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10075b.f10377a, c5899b.f8890a);
            }
        });
    }

    public void onEvent(C2629d c2629d) {
        if (c2629d != null) {
            final C2626a c2626a = c2629d.f8531a;
            if (c2626a != null) {
                ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C6123a f10135b;

                    public final void run() {
                        ArrayList arrayList = c2626a.f8527a;
                        if (arrayList.size() > 0) {
                            new Thread(new C34391(this.f10135b.f16502x, arrayList)).start();
                            this.f10135b.m14034u();
                        }
                    }
                });
            }
        }
    }

    public void onEvent(C5916c c5916c) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10084a;

            {
                this.f10084a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                Toast.makeText((C7576b) this.f10084a.f10377a, C4522p.m8236a(R.string.connection_error_message), 0).show();
            }
        });
    }

    public void onEvent(final C2645g c2645g) {
        final String str = c2645g.f8552c;
        final C7576b c7576b = (C7576b) this.f10377a;
        c7576b.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10113d;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (c2645g.f8550a || !c2645g.f8551b) {
                    if (c2645g.f8551b) {
                        Intent intent = new Intent(c7576b, ConversationActivity.class);
                        intent.putExtra("KEY_PARTY", str);
                        intent.putExtra("KEY_START_KIND", C3383b.f10381c - 1);
                        c7576b.startActivity(intent);
                    }
                    return;
                }
                Context context = c7576b;
                CharSequence a = C4522p.m8236a(R.string.you_are_not_allowed_to_visit_this_channel);
                CharSequence a2 = C4522p.m8236a(R.string.ok_cap);
                C0663a c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.m1613b(a);
                c0663a.m1609a(a2, null);
                C6389b a3 = c0663a.m1612a();
                a3.show();
                a3.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a3.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
            }
        });
    }

    public void onEvent(final C5924s c5924s) {
        if (this.f16485g != null) {
            ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6123a f10091b;

                public final void run() {
                    this.f10091b.f16485g.m14104k();
                    C4513i.m8228a((C7576b) this.f10091b.f10377a, c5924s.f8890a);
                }
            });
        }
    }

    public void onEvent(final C5926b c5926b) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10097b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10097b.f10377a, c5926b.f8890a);
            }
        });
    }

    public void onEvent(C2658c c2658c) {
        C2729d.m7071a((C7576b) this.f10377a);
    }

    public void onEvent(final aa aaVar) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10149b;

            class C33051 implements Runnable {
                final /* synthetic */ C33069 f10147a;

                C33051(C33069 c33069) {
                    this.f10147a = c33069;
                }

                public final void run() {
                    C4513i.m8228a((C7576b) this.f10147a.f10149b.f10377a, aaVar.f8890a);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C33051(this), 100);
            }
        });
    }

    public void onEvent(ab abVar) {
        this.f16472R = abVar.f8636b;
        this.aG = abVar.f8635a;
        this.f16473S = abVar.f8637c;
        ((C7576b) this.f10377a).runOnUiThread(new C33037(this));
    }

    public void onEvent(C2705r c2705r) {
        ((C7576b) this.f10377a).runOnUiThread(new C33016(this));
    }

    public void onEvent(C2706s c2706s) {
        final String str = c2706s.f8644a;
        final String str2 = c2706s.f8645b;
        final PaymentModule[] paymentModuleArr = c2706s.f8646c;
        final C2706s c2706s2 = c2706s;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10141e;

            class C32981 implements Runnable {
                final /* synthetic */ C32995 f10136a;

                C32981(C32995 c32995) {
                    this.f10136a = c32995;
                }

                public final void run() {
                    if (paymentModuleArr == null || paymentModuleArr.length <= 0) {
                        Toast.makeText((C7576b) this.f10136a.f10141e.f10377a, C4522p.m8236a(R.string.at_the_moment_there_is_no_possibility_of_payment), 0).show();
                        return;
                    }
                    PaymentModule paymentModule = PaymentModule.OTHER;
                    PaymentModule[] paymentModuleArr = paymentModuleArr;
                    int length = paymentModuleArr.length;
                    int i = 0;
                    while (i < length) {
                        PaymentModule paymentModule2 = paymentModuleArr[i];
                        if (paymentModule2.equals(PaymentModule.PARSIANMPL4FACTOR)) {
                            paymentModule = PaymentModule.PARSIANMPL4FACTOR;
                            break;
                        } else if (paymentModule2.equals(PaymentModule.PARSIANMPL)) {
                            paymentModule = PaymentModule.PARSIANMPL;
                            break;
                        } else {
                            i++;
                        }
                    }
                    PaymentModule paymentModule3 = paymentModule;
                    if (!paymentModule3.equals(PaymentModule.PARSIANMPL4FACTOR)) {
                        if (!paymentModule3.equals(PaymentModule.PARSIANMPL)) {
                            Toast.makeText((C7576b) this.f10136a.f10141e.f10377a, C4522p.m8236a(R.string.at_the_moment_there_is_no_possibility_of_payment), 0).show();
                            return;
                        }
                    }
                    C2808d.m7148b(new C6790e(str, str2, paymentModule3, C2763c.ChannelPayment, c2706s2.f8649f, c2706s2.f8647d, c2706s2.f8648e));
                }
            }

            public final void run() {
                new Handler().postDelayed(new C32981(this), 100);
            }
        });
    }

    public void onEvent(C2717b c2717b) {
        int i = c2717b.f8665a > 0 ? c2717b.f8665a - 1 : 0;
        if (m14019h()) {
            this.f16485g.f16581n = i;
        }
        if (this.aH != null || m14019h() || this.f16493o) {
            m13962a(i, C3315b.last_position);
        }
    }

    public void onEvent(final C2718c c2718c) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10101b;

            public final void run() {
                this.f10101b.mo3222h(c2718c.f8666a);
                C2808d.m7147a(new C6757d(this.f10101b.f16490l, c2718c.f8666a));
            }
        });
    }

    public void onEvent(final C2719d c2719d) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10099b;

            public final void run() {
                this.f10099b.f16468N = 0;
                this.f10099b.m13936I();
                this.f10099b.f16491m = c2719d.f8667a;
                this.f10099b.f16468N = this.f10099b.f16491m.size();
                if (this.f10099b.f16468N > 0) {
                    if (this.f10099b.mo3201Y().isEmpty() || this.f10099b.f16466L == null) {
                        this.f10099b.f16467M = 1;
                    } else {
                        this.f10099b.f16467M = this.f10099b.f16491m.indexOf(this.f10099b.f16466L) + 1;
                    }
                    this.f10099b.f16488j.m14057a(this.f10099b.f16467M, this.f10099b.f16468N);
                    this.f10099b.f16466L = (String) this.f10099b.f16491m.get(this.f10099b.f16467M - 1);
                    this.f10099b.m13927m(this.f10099b.f16466L);
                    return;
                }
                MyApplication.m12950a().f15911q = "";
                this.f10099b.f16485g.m14104k();
                C6127a c6127a = this.f10099b.f16488j;
                c6127a.f16529p.setText(C4522p.m8236a(R.string.no_item_found));
                c6127a.f16527n.setImageResource(R.drawable.ic_keyboard_arrow_up_black_disable);
                c6127a.f16528o.setImageResource(R.drawable.ic_keyboard_arrow_down_black_disable);
            }
        });
    }

    public void onEvent(C2722b c2722b) {
        if (c2722b.f8670a.equals(this.f16490l)) {
            ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6123a f10082a;

                {
                    this.f10082a = r1;
                }

                public final void run() {
                    this.f10082a.af();
                }
            });
        }
    }

    public void onEvent(final C5952a c5952a) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10081b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10081b.f10377a, c5952a.f8890a);
            }
        });
    }

    public void onEvent(C2723b c2723b) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10079a;

            {
                this.f10079a = r1;
            }

            public final void run() {
                C6123a.m13913b(this.f10079a);
                this.f10079a.f16496r.setNavigationIcon((int) R.drawable.ic_back_dark);
                if (this.f10079a.f16496r.getNavigationIcon() != null) {
                    C2491i.m6790a(this.f10079a.f16496r.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
                }
                this.f10079a.f16456B.clear();
                this.f10079a.f16488j.m14063b((C7576b) this.f10079a.f10377a);
                this.f10079a.f16488j.m14059a((C7576b) this.f10079a.f10377a, null);
                this.f10079a.f16474T = false;
                this.f10079a.f16485g.m14104k();
            }
        });
    }

    public void onEvent(final C5955a c5955a) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10094b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10094b.f10377a, c5955a.f8890a);
            }
        });
    }

    public void onEvent(C2727c c2727c) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10092a;

            {
                this.f10092a = r1;
            }

            public final void run() {
                Toast.makeText((C7576b) this.f10092a.f10377a, C4522p.m8236a(R.string.file_saved_to_downloads), 0).show();
            }
        });
    }

    public void onEvent(final C5987d c5987d) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10078b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10078b.f10377a, c5987d.f8890a);
            }
        });
    }

    public void onEvent(C2830e c2830e) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10076a;

            {
                this.f10076a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                C4478a.m8160b((C7576b) this.f10076a.f10377a, this.f10076a.f16475U, false, null, "");
                Toast.makeText((C7576b) this.f10076a.f10377a, C4522p.m8236a(R.string.you_joined_to_group), 0).show();
            }
        });
    }

    public void onEvent(C2831f c2831f) {
        final String str = c2831f.f8912a;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10115b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (str != null && !str.isEmpty()) {
                    C4478a.m8159b((C7576b) this.f10115b.f10377a, str, null, null);
                }
            }
        });
    }

    public void onEvent(C2832g c2832g) {
        final String str = c2832g.f8913a;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10109b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (str != null && !str.isEmpty()) {
                    C4478a.m8144a((C7576b) this.f10109b.f10377a, str, null, null);
                }
            }
        });
    }

    public void onEvent(final C5988h c5988h) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10117b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10117b.f10377a, c5988h.f8890a);
                C4501c.m8189a().m8193b();
            }
        });
    }

    public void onEvent(final C2833i c2833i) {
        final LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse = c2833i.f8915a;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10104c;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (!c2833i.f8916b || lookUpGroupJoinLinkResponse.getmJID() == null || lookUpGroupJoinLinkResponse.getmJID().isEmpty()) {
                    C3382a c3382a = this.f10104c;
                    LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse = lookUpGroupJoinLinkResponse;
                    if (c3382a.f16476V) {
                        c3382a.f16475U = lookUpGroupJoinLinkResponse.getmJID();
                        C3337b.m7804a((C7576b) c3382a.f10377a, lookUpGroupJoinLinkResponse);
                    }
                } else if (this.f10104c.f16490l == null || !this.f10104c.f16490l.equals(lookUpGroupJoinLinkResponse.getmJID())) {
                    C4478a.m8160b((C7576b) this.f10104c.f10377a, lookUpGroupJoinLinkResponse.getmJID(), false, null, "");
                }
            }
        });
    }

    public void onEvent(C2834j c2834j) {
        final String str = c2834j.f8917a;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6123a f10107b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (str != null && !str.isEmpty()) {
                    C4478a.m8149a((C7576b) this.f10107b.f10377a, str, true);
                }
            }
        });
    }

    public void onEvent(C2863a c2863a) {
        ((C7576b) this.f10377a).runOnUiThread(new C33048(this));
    }

    public void onEvent(C3473a c3473a) {
        if (this.f16490l != null && c3473a.f10605a != null && !c3473a.f10605a.equals(this.f16490l)) {
            m14012g();
        }
    }

    public void onLoadMoreClicked(View view) {
        this.f16459E = view;
        view.setClickable(false);
        this.f16485g.m14091b(false);
        ProgressWheel progressWheel = (ProgressWheel) view.findViewById(R.id.load_more_progressWheel);
        ((TextView) view.findViewById(R.id.load_more_textView)).setText(C4522p.m8236a(R.string.loading));
        progressWheel.setVisibility(0);
        view.setBackgroundResource(R.drawable.chat_load_more_layout_normal_background);
        this.f16485g.m14105l();
    }

    public final void mo2341p() {
        C4478a.m8162c((C7576b) this.f10377a);
    }

    public final void mo2342q() {
        C6127a c6127a = this.f16488j;
        c6127a.f16515b.dispatchKeyEvent(new KeyEvent(0, 0, 0, 67, 0, 0, 0, 0, 6));
    }

    public final void mo2343r() {
        if (this.f16499u) {
            this.f16499u = false;
            this.f16488j.m14066d();
            if (this.ao.isShowing()) {
                if (this.am) {
                    this.am = false;
                    this.f16501w.dismiss();
                } else {
                    new Handler().postDelayed(new C32932(this), 300);
                }
                this.ao.dismiss();
            } else if (this.f16502x != null && this.f16502x.isShowing()) {
                if (this.am) {
                    this.am = false;
                    this.f16501w.dismiss();
                    return;
                }
                new Handler().postDelayed(new C32943(this), 300);
                this.f16502x.dismiss();
            }
        }
    }

    public final void mo2344s() {
        if (this.ao.isShowing()) {
            this.f16501w.dismiss();
            this.ao.dismiss();
            return;
        }
        if (this.f16502x != null && this.f16502x.isShowing()) {
            this.f16501w.dismiss();
            this.f16502x.dismiss();
        }
        this.ao.setHeight(ag());
        this.ao.setSoftInputMode(3);
        this.ao.showAtLocation(this.f16480Z, 80, 0, 0);
        if (!this.f16499u) {
            this.f16488j.m14067d((C7576b) this.f10377a);
        }
    }

    public void mo2345t() {
        if (this.f16488j.f16523j.m7840a()) {
            this.f16488j.m14067d((C7576b) this.f10377a);
        }
    }

    public final void m14034u() {
        if (this.f16502x.isShowing()) {
            this.f16501w.dismiss();
            this.f16502x.dismiss();
            return;
        }
        if (this.ao.isShowing()) {
            this.ao.dismiss();
            this.f16501w.dismiss();
        }
        this.f16502x.setHeight(ag());
        this.f16502x.setSoftInputMode(3);
        this.f16502x.showAtLocation(this.f16480Z, 80, 0, 0);
        if (!this.f16499u) {
            this.f16488j.m14067d((C7576b) this.f10377a);
        }
    }

    public final void mo2346v() {
        this.f16500v = true;
    }

    public final void mo2347w() {
        C2867a.m7211a().m7217b();
    }

    public final boolean mo2348x() {
        return this.f16455A;
    }

    public final void mo2349y() {
        this.am = true;
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 95);
        m14004e(bundle);
    }

    public final void mo2350z() {
        if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            C5999b c5999b = this.f16495q;
            if (c5999b.f16153c) {
                c5999b.f16153c = false;
                c5999b.m13271b();
            }
            c5999b.f16156f = C1584b.f4918a;
            C2791c a = C2791c.m7109a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Calendar.getInstance(TimeZone.getDefault()).get(1));
            stringBuilder.append("_");
            stringBuilder.append(Calendar.getInstance(TimeZone.getDefault()).get(2));
            stringBuilder.append("_");
            stringBuilder.append(Calendar.getInstance(TimeZone.getDefault()).get(5));
            stringBuilder.append(".m4a");
            c5999b.f16155e = a.m7119d(stringBuilder.toString());
            c5999b.f16156f.m4107a(new File(c5999b.f16155e));
            c5999b.f16153c = true;
            c5999b.f16154d = System.currentTimeMillis();
            c5999b.f16156f.m4106a();
            if (C5999b.f16152b != null) {
                C5999b.f16152b.mo2292a();
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 91);
        m14004e(bundle);
    }
}
