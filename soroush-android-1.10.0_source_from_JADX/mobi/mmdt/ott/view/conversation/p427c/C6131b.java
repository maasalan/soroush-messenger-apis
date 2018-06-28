package mobi.mmdt.ott.view.conversation.p427c;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import java.util.HashMap;
import java.util.HashSet;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.af.C6671m;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6760g;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6786d;
import mobi.mmdt.ott.logic.p360l.C2842a;
import mobi.mmdt.ott.logic.p370r.C2895a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.fab.UnreadCounterFab;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.C3382a;
import mobi.mmdt.ott.view.conversation.activities.a.a.AnonymousClass26;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a.C3315b;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6875d;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6876e;
import mobi.mmdt.ott.view.conversation.p418a.C3282c;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.tools.C4522p;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C6131b implements C0416a<Cursor>, C3128a, C3282c {
    C6123a f16542A;
    boolean f16543B = false;
    int f16544C;
    public boolean f16545D;
    int f16546E = 0;
    boolean f16547F = true;
    public TextView f16548G;
    public boolean f16549H = false;
    public boolean f16550I = false;
    int f16551J = 0;
    boolean f16552K = false;
    private final boolean f16553L;
    private final C2973m f16554M;
    private ViewGroup f16555N;
    private int f16556O;
    private boolean f16557P = false;
    private int f16558Q;
    private int f16559R;
    private int f16560S = -1;
    private Bundle f16561T;
    private boolean f16562U = false;
    private String f16563V = "";
    private int f16564W;
    private boolean f16565X = false;
    private boolean f16566Y = false;
    private boolean f16567Z = true;
    String f16568a;
    private int aa = 0;
    private int ab = 0;
    private int ac = 0;
    private boolean ad = true;
    public boolean f16569b;
    RecyclerView f16570c;
    TextView f16571d;
    public UnreadCounterFab f16572e;
    public LinearLayoutManager f16573f;
    public C6827b f16574g;
    final C3447a f16575h;
    boolean f16576i = false;
    public int f16577j = 20;
    public int f16578k;
    int f16579l;
    String f16580m;
    public int f16581n = 0;
    public boolean f16582o = false;
    public boolean f16583p = false;
    public int f16584q = 0;
    public boolean f16585r = false;
    public boolean f16586s = false;
    boolean f16587t = false;
    int f16588u = 1;
    public int f16589v = 0;
    public String f16590w = "";
    public boolean f16591x = true;
    public final View f16592y;
    Activity f16593z;

    class C34452 implements OnClickListener {
        final /* synthetic */ C6131b f10561a;

        C34452(C6131b c6131b) {
            this.f10561a = c6131b;
        }

        public final void onClick(View view) {
            this.f10561a.f16569b = false;
            this.f10561a.f16543B = true;
            int findFirstVisibleItemPosition = this.f10561a.f16573f.findFirstVisibleItemPosition();
            int i = this.f10561a.f16551J > 0 ? this.f10561a.f16551J : 0;
            if (this.f10561a.f16582o) {
                C6131b c6131b = this.f10561a;
                i = this.f10561a.f16589v;
                MyApplication.m12950a().f15911q = c6131b.f16590w;
                C3382a c3382a = c6131b.f16542A;
                ((C7576b) c3382a.f10377a).runOnUiThread(new AnonymousClass26(c3382a, i));
                c6131b.m14093c(i);
            } else {
                if (findFirstVisibleItemPosition > 0) {
                    int i2 = i - 1;
                    if (findFirstVisibleItemPosition > i2 && i > 0) {
                        this.f10561a.m14094c(false);
                        if (this.f10561a.f16574g != null && this.f10561a.f16574g.getItemCount() > 0) {
                            this.f10561a.m14084a(i2, 0, false);
                        }
                    }
                }
                this.f10561a.m14108o();
                C6131b.m14080b(this.f10561a);
            }
            this.f10561a.f16582o = false;
            this.f10561a.f16583p = false;
            this.f10561a.f16584q = 0;
            this.f10561a.f16581n = 0;
            this.f10561a.m14101h();
        }
    }

    public interface C3447a {
        void mo2314a(C7197a c7197a);

        void mo2321b(C7197a c7197a);

        void mo3224i(String str);

        void mo2340o();
    }

    class C61301 extends OnScrollListener {
        final /* synthetic */ C6131b f16541a;

        C61301(C6131b c6131b) {
            this.f16541a = c6131b;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f16541a.f16576i = this.f16541a.f16573f.findFirstVisibleItemPosition() == 0;
                if (this.f16541a.f16576i) {
                    this.f16541a.m14103j();
                    this.f16541a.f16575h.mo2340o();
                    this.f16541a.f16542A.m14025l();
                }
                C6131b c6131b = this.f16541a;
                int findLastVisibleItemPosition = c6131b.f16573f.findLastVisibleItemPosition();
                HashSet hashSet = new HashSet();
                for (int findFirstVisibleItemPosition = c6131b.f16573f.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                    if (findFirstVisibleItemPosition >= 0 && c6131b.f16574g != null) {
                        C6829g b = c6131b.f16574g.m17257b(findFirstVisibleItemPosition);
                        if (b instanceof C7358a) {
                            hashSet.add(((C7358a) b).f20777c);
                        }
                    }
                }
                C2842a.m7197a().m7199a(hashSet);
                if (!MyApplication.m12950a().f15911q.isEmpty()) {
                    MyApplication.m12950a().f15911q = "";
                    this.f16541a.m14104k();
                    this.f16541a.f16582o = false;
                    this.f16541a.f16583p = false;
                    this.f16541a.f16584q = 0;
                    this.f16541a.f16581n = 0;
                    this.f16541a.f16587t = false;
                    this.f16541a.f16588u = 1;
                }
            } else {
                C6131b.m14078a(this.f16541a);
            }
            this.f16541a.f16569b = false;
            this.f16541a.f16543B = true;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (this.f16541a.f16547F && ((float) this.f16541a.f16546E) < -25.0f) {
                this.f16541a.m14103j();
            } else if (!this.f16541a.f16547F && ((float) this.f16541a.f16546E) > 25.0f) {
                this.f16541a.m14102i();
            }
            if ((this.f16541a.f16547F && i2 < 0) || (!this.f16541a.f16547F && i2 > 0)) {
                this.f16541a.f16546E += i2;
            }
            int findFirstVisibleItemPosition = this.f16541a.f16573f.findFirstVisibleItemPosition();
            i = this.f16541a.f16573f.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition == 0) {
                this.f16541a.m14103j();
                this.f16541a.m14094c(false);
                this.f16541a.m14101h();
            }
            int itemCount = this.f16541a.f16574g.getItemCount();
            if (this.f16541a.f16579l != i) {
                if (i < 0 || this.f16541a.f16574g == null || itemCount <= 0) {
                    this.f16541a.f16571d.setText(C2491i.m6773a(this.f16541a.f16593z, System.currentTimeMillis(), this.f16541a.f16580m));
                } else {
                    C7197a c7197a = (C7197a) this.f16541a.f16574g.m17257b(i);
                    this.f16541a.f16571d.setText(c7197a.f20776b);
                    if (c7197a.f20780f) {
                        this.f16541a.f16571d.setVisibility(4);
                    } else {
                        this.f16541a.f16571d.setVisibility(0);
                    }
                }
                itemCount--;
                if (i <= itemCount && i >= itemCount - 10 && !this.f16541a.f16591x) {
                    this.f16541a.f16591x = true;
                    this.f16541a.m14105l();
                }
                if (!this.f16541a.f16552K && i >= (this.f16541a.f16581n + 9) - 10) {
                    this.f16541a.f16552K = true;
                    this.f16541a.f16542A.mo3191O();
                }
            }
            this.f16541a.f16578k = findFirstVisibleItemPosition;
            this.f16541a.f16579l = i;
        }
    }

    public C6131b(Activity activity, C6123a c6123a, Bundle bundle, C3447a c3447a, String str, C2973m c2973m, boolean z) {
        this.f16593z = activity;
        this.f16553L = z;
        this.f16542A = c6123a;
        this.f16554M = c2973m;
        this.f16561T = bundle;
        this.f16575h = c3447a;
        this.f16592y = LayoutInflater.from(activity).inflate(R.layout.fragment_conversation_thread, null, false);
        this.f16568a = str;
        boolean z2 = (this.f16568a == null || r11.f16568a.isEmpty()) ? false : true;
        r11.f16569b = z2;
        String str2 = "";
        if (r11.f16561T != null) {
            r11.f16556O = r11.f16561T.getInt("KEY_TOP_VISIBLE_ITEM_IN_ROTATION");
            r11.f16577j = r11.f16561T.getInt("KEY_MESSAGES_COUNT_LIMIT", r11.f16542A.mo3195S());
            r11.f16557P = r11.f16561T.getBoolean("KEY_IS_ROTATED");
            r11.f16591x = r11.f16561T.getBoolean("KEY_IS_REQUESTED_LOAD_MORE");
            r11.f16563V = r11.f16561T.getString("KEY_PEER_PARTY");
            if (r11.f16561T.containsKey("KEY_GET_MESSAGE_ID_FOR_SHOW_UNREAD_HEADER")) {
                str2 = r11.f16561T.getString("KEY_GET_MESSAGE_ID_FOR_SHOW_UNREAD_HEADER");
            }
            r11.f16544C = r11.f16542A.m14024k();
            if (r11.f16568a != null && !r11.f16542A.m14019h()) {
                int a = C2966b.m7394a(r11.f16563V, r11.f16568a);
                r11.f16581n = a > 0 ? a - 1 : 0;
            } else if (r11.f16544C > 0) {
                r11.f16582o = false;
                r11.f16577j += r11.f16544C;
            }
        }
        String str3 = str2;
        if (!r11.f16557P && r11.f16544C > 0) {
            r11.f16557P = true;
            r11.f16556O = r11.f16544C - 1;
        }
        int e = (int) C2491i.m6832e(r11.f16593z);
        int i = (int) C2491i.m6836i(r11.f16593z);
        int a2 = C2489g.m6754a().m6755a(0.5f);
        int B = C2535a.m6888a().m6891B();
        r11.f16570c = (RecyclerView) r11.f16592y.findViewById(R.id.recycler_view);
        r11.f16570c.setItemAnimator(null);
        r11.f16548G = (TextView) r11.f16592y.findViewById(R.id.bot_comment);
        if (r11.f16553L) {
            r11.f16548G.setVisibility(0);
        }
        r11.f16571d = (TextView) r11.f16592y.findViewById(R.id.date_textView);
        r11.f16572e = (UnreadCounterFab) r11.f16592y.findViewById(R.id.move_to_last_fab);
        r11.f16555N = (ViewGroup) r11.f16592y.findViewById(R.id.overlay_load_more_view);
        r11.f16555N.setClickable(false);
        r11.f16580m = C2535a.m6888a().m6919b();
        ((TextView) r11.f16592y.findViewById(R.id.load_more_textView)).setText(C4522p.m8236a(R.string.loading));
        ((ProgressWheel) r11.f16592y.findViewById(R.id.load_more_progressWheel)).setVisibility(0);
        r11.f16571d.setText(C2491i.m6773a(r11.f16593z, System.currentTimeMillis(), r11.f16580m));
        r11.f16574g = new C7191c(r11.f16593z, r11.f16542A, r11, e, e, i, a2, B, r11.f16580m, str3);
        r11.f16570c.setHasFixedSize(true);
        r11.f16570c.setAdapter(r11.f16574g);
        r11.f16570c.addOnItemTouchListener(new C6075j(r11.f16593z, r11.f16570c, r11));
        r11.f16573f = new LinearLayoutManager(r11.f16593z);
        r11.f16573f.setReverseLayout(true);
        r11.f16573f.setAutoMeasureEnabled(false);
        r11.f16570c.setLayoutManager(r11.f16573f);
        r11.f16572e.setCount(r11.f16544C);
        r11.f16570c.addOnScrollListener(new C61301(r11));
        m14103j();
        r11.f16572e.setOnClickListener(new C34452(r11));
        m14081s();
        C2491i.m6790a(r11.f16571d.getBackground(), UIThemeManager.getmInstance().getDate_bubble_background_color());
        C2491i.m6802a(r11.f16571d, UIThemeManager.getmInstance().getDate_bubble_text_color());
        r11.f16572e.setBackgroundTintList(ColorStateList.valueOf(UIThemeManager.getmInstance().getAccent_color()));
        r11.f16572e.setRippleColor(UIThemeManager.getmInstance().getFab_ripple_color());
        C2491i.m6784a(UIThemeManager.getmInstance().getText_primary_color(), r11.f16548G);
        r11.f16564W = C2491i.m6837j(MyApplication.m12952b());
    }

    static /* synthetic */ void m14078a(C6131b c6131b) {
        int findLastVisibleItemPosition = c6131b.f16573f.findLastVisibleItemPosition();
        HashMap hashMap = new HashMap();
        for (int findFirstVisibleItemPosition = c6131b.f16573f.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
            if (findFirstVisibleItemPosition >= 0) {
                C6829g b = c6131b.f16574g.m17257b(findFirstVisibleItemPosition);
                if (b instanceof C7358a) {
                    boolean z;
                    C1063i c6671m;
                    C7358a c7358a = (C7358a) b;
                    hashMap.put(c7358a.f20777c, Boolean.valueOf(c7358a.f21339y));
                    int i = c7358a.f19503j;
                    boolean z2 = false;
                    switch (i) {
                        case 22:
                        case 23:
                        case 24:
                        case 32:
                        case 33:
                        case 34:
                        case 42:
                        case 43:
                        case 44:
                        case 72:
                        case 73:
                        case 74:
                        case 82:
                        case 83:
                        case 84:
                        case 102:
                        case 103:
                        case 104:
                        case 112:
                        case 113:
                        case 114:
                        case 4111:
                        case 4115:
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                    C2987i c2987i;
                    if (z) {
                        c2987i = c7358a.f21340z;
                        if (!(c2987i.equals(C2987i.FINISHED) || c2987i.equals(C2987i.CANCEL) || c2987i.equals(C2987i.TRANSMITTING) || c7358a.f21314O == null || !C2895a.m7255a(c7358a.f21314O))) {
                            c6671m = new C6671m(c7358a.f21300A, true);
                        }
                    } else {
                        if (!(i == 1111 || i == 1115)) {
                            switch (i) {
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                    break;
                                default:
                                    break;
                            }
                        }
                        z2 = true;
                        if (z2 && c7358a.f21303D != null) {
                            c2987i = c7358a.f21340z;
                            if (!(c7358a.f21300A == 0 || c2987i.equals(C2987i.FINISHED) || c2987i.equals(C2987i.CANCEL) || c2987i.equals(C2987i.TRANSMITTING))) {
                                c6671m = new C6786d(c7358a.f21300A);
                            }
                        }
                    }
                    C2808d.m7149c(c6671m);
                }
            }
        }
    }

    static boolean m14079a(int i, float f) {
        return ((float) i) - f < 0.0f;
    }

    static /* synthetic */ void m14080b(C6131b c6131b) {
        if (!MyApplication.m12950a().f15911q.isEmpty()) {
            MyApplication.m12950a().f15911q = "";
            c6131b.m14104k();
        }
    }

    private void m14081s() {
        this.f16555N.setVisibility(8);
        if (!(this.f16542A instanceof C6875d)) {
            if (!(this.f16542A instanceof C6876e)) {
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_EXPECTED_ITEMS_COUNT", this.f16577j);
                ((C7406c) this.f16593z).m19190e().mo268a(9, bundle, this);
                return;
            }
        }
        ((C7406c) this.f16593z).m19190e().mo268a(9, null, this);
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        if (bundle != null) {
            this.f16582o = bundle.getBoolean("KEY_IS_REPLY_MESSAGE_PRESSED", false);
            this.f16583p = bundle.getBoolean("KEY_IS_SEARCHED_MESSAGE_PRESSED", false);
            this.f16562U = bundle.getBoolean("KEY_IS_LAST_POSITION", false);
        }
        return this.f16542A.mo3217b(this.f16577j > this.f16581n ? this.f16577j + this.f16581n : this.f16581n + 15);
    }

    public final void mo2227a() {
        if (this.f16574g != null) {
            this.f16574g.m13684c(null);
        }
    }

    public final void m14084a(final int i, int i2, boolean z) {
        if (this.f16570c != null) {
            if (z) {
                this.f16570c.scrollToPosition(i);
                new Handler().postDelayed(new Runnable(this) {
                    final /* synthetic */ C6131b f10563b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        r8 = this;
                        r0 = r8.f10563b;
                        r1 = r0.f16542A;
                        r1 = r1.m14019h();
                        r2 = r0.f16568a;
                        r3 = 0;
                        if (r2 == 0) goto L_0x001e;
                    L_0x000d:
                        r2 = r0.f16568a;
                        r2 = r2.isEmpty();
                        if (r2 != 0) goto L_0x001e;
                    L_0x0015:
                        r2 = r0.f16544C;
                        if (r2 != 0) goto L_0x001e;
                    L_0x0019:
                        r2 = r0.f16581n;
                        if (r2 <= 0) goto L_0x001e;
                    L_0x001d:
                        goto L_0x0058;
                    L_0x001e:
                        r2 = r0.f16568a;
                        if (r2 == 0) goto L_0x002e;
                    L_0x0022:
                        r2 = r0.f16568a;
                        r2 = r2.isEmpty();
                        if (r2 != 0) goto L_0x002e;
                    L_0x002a:
                        r2 = r0.f16581n;
                        if (r2 != 0) goto L_0x0033;
                    L_0x002e:
                        r2 = r0.f16544C;
                        r4 = 1;
                        if (r2 > r4) goto L_0x0058;
                    L_0x0033:
                        r2 = r0.f16568a;
                        if (r2 == 0) goto L_0x0048;
                    L_0x0037:
                        r2 = r0.f16568a;
                        r2 = r2.isEmpty();
                        if (r2 != 0) goto L_0x0048;
                    L_0x003f:
                        r2 = r0.f16581n;
                        if (r2 <= 0) goto L_0x0048;
                    L_0x0043:
                        r2 = r0.f16544C;
                        if (r2 <= 0) goto L_0x0048;
                    L_0x0047:
                        goto L_0x0058;
                    L_0x0048:
                        if (r1 == 0) goto L_0x004f;
                    L_0x004a:
                        r2 = r0.f16578k;
                        if (r2 <= 0) goto L_0x004f;
                    L_0x004e:
                        goto L_0x0058;
                    L_0x004f:
                        r2 = r0.f16581n;
                        if (r2 <= 0) goto L_0x00b8;
                    L_0x0053:
                        r2 = r0.m14110q();
                        goto L_0x005c;
                    L_0x0058:
                        r2 = r0.m14111r();
                    L_0x005c:
                        r4 = 32;
                        r4 = r0.m14097d(r4);
                        r5 = 0;
                        if (r2 == 0) goto L_0x00af;
                    L_0x0065:
                        r6 = r0.f16570c;
                        r6 = r6.getHeight();
                        r7 = r2.getTop();
                        r7 = (float) r7;
                        r2 = r2.getHeight();
                        r2 = (float) r2;
                        if (r1 == 0) goto L_0x0096;
                    L_0x0077:
                        r1 = mobi.mmdt.ott.view.conversation.p427c.C6131b.m14079a(r6, r2);
                        if (r1 != 0) goto L_0x008a;
                    L_0x007d:
                        r1 = (float) r6;
                        r1 = r1 - r2;
                        r2 = 6;
                        r0 = r0.m14097d(r2);
                        r0 = (float) r0;
                        r1 = r1 - r0;
                        r0 = (int) r1;
                        r3 = r0 / 2;
                        goto L_0x00b8;
                    L_0x008a:
                        r1 = (float) r6;
                        r1 = r1 - r2;
                        r1 = (int) r1;
                        r2 = 16;
                        r0 = r0.m14097d(r2);
                        r3 = r1 - r0;
                        goto L_0x00b8;
                    L_0x0096:
                        r1 = mobi.mmdt.ott.view.conversation.p427c.C6131b.m14079a(r6, r2);
                        if (r1 != 0) goto L_0x00a8;
                    L_0x009c:
                        r0 = r0.m14109p();
                        if (r0 == 0) goto L_0x00b8;
                    L_0x00a2:
                        r0 = (float) r6;
                        r0 = r0 - r2;
                        r0 = (int) r0;
                        r3 = r0 - r4;
                        goto L_0x00b8;
                    L_0x00a8:
                        r0 = r0.m14109p();
                        if (r0 == 0) goto L_0x00b0;
                    L_0x00ae:
                        goto L_0x00a2;
                    L_0x00af:
                        r7 = r5;
                    L_0x00b0:
                        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
                        if (r0 != 0) goto L_0x00b5;
                    L_0x00b4:
                        goto L_0x00b8;
                    L_0x00b5:
                        r0 = (float) r4;
                        r7 = r7 - r0;
                        r3 = (int) r7;
                    L_0x00b8:
                        if (r3 == 0) goto L_0x00c3;
                    L_0x00ba:
                        r0 = r8.f10563b;
                        r0 = r0.f16573f;
                        r1 = r3;
                        r0.scrollToPositionWithOffset(r1, r3);
                    L_0x00c3:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.c.b.3.run():void");
                    }
                }, 10);
            } else {
                if (this.ad && i == this.f16581n && this.f16581n == this.f16544C && this.f16544C > 0) {
                    this.ad = false;
                    i2 += 50;
                }
                this.f16573f.scrollToPositionWithOffset(i, i2);
            }
        }
    }

    public final void m14085a(int i, boolean z) {
        if (this.f16572e != null && this.f16573f != null) {
            if (i > (z ? this.f16542A.f16479Y : this.f16573f.findLastVisibleItemPosition())) {
                m14102i();
            }
        }
    }

    public final void m14086a(int i, boolean z, boolean z2, boolean z3) {
        this.f16583p = z;
        this.f16586s = true;
        this.f16581n = i;
        if (this.f16559R > 0 && this.f16574g.m13682b() > 0) {
            this.f16574g.m17257b(0);
        }
        if (i >= this.f16574g.m13682b()) {
            i = (i - this.f16574g.m13682b()) + this.f16588u;
            C6123a c6123a = this.f16542A;
            this.f16574g.getItemCount();
            c6123a.mo3204a(i, z, z2, z3);
            return;
        }
        C6123a c6123a2 = this.f16542A;
        this.f16574g.getItemCount();
        c6123a2.mo3204a(0, z, z2, z3);
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16574g != null) {
            int i;
            boolean z;
            int position = cursor.getPosition();
            if (cursor.moveToFirst()) {
                i = cursor.getInt(cursor.getColumnIndex("_id"));
                cursor.moveToPosition(position);
            } else {
                i = -1;
            }
            this.f16559R = cursor.getCount();
            if (this.f16558Q <= this.f16559R && !this.f16565X) {
                this.f16591x = false;
            }
            this.f16574g.m13684c(cursor);
            if (this.f16553L) {
                if (this.f16574g.getItemCount() > 0) {
                    this.f16548G.setVisibility(8);
                } else {
                    this.f16548G.setVisibility(0);
                }
            }
            this.aa = C2980g.m7445f(this.f16563V);
            if (this.f16557P) {
                m14084a(this.f16556O, 0, false);
                if (this.f16556O > 0) {
                    m14102i();
                }
            } else {
                int itemCount;
                int i2;
                if (this.f16549H && this.f16573f != null) {
                    position = this.f16573f.findFirstVisibleItemPosition();
                    if (position != -1) {
                        C7191c c7191c = (C7191c) this.f16574g;
                        String str = ((C7197a) this.f16574g.m17257b(position)).f20777c;
                        itemCount = c7191c.getItemCount();
                        if (itemCount > 0) {
                            i2 = 0;
                            while (i2 < itemCount) {
                                Cursor cursor2 = (Cursor) c7191c.m13685c(i2);
                                String string = cursor2.getString(cursor2.getColumnIndex("conversations_message_id"));
                                if (string != null && string.equalsIgnoreCase(str)) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
                i2 = -1;
                if ((this.f16560S != -1 && this.f16560S < i) || i2 != -1) {
                    C7197a c7197a = (C7197a) this.f16574g.m17257b(0);
                    int i3 = this.aa;
                    this.f16551J = this.aa - this.ab;
                    int i4 = i3 - this.ac;
                    this.ac = i3;
                    this.f16584q = this.f16551J;
                    this.f16585r = true;
                    if (this.f16582o && this.f16586s) {
                        this.f16587t = true;
                        this.f16588u = 0;
                    } else {
                        this.f16587t = false;
                    }
                    if (!c7197a.m19056c() || this.f16549H) {
                        this.f16575h.mo3224i(c7197a.f20777c);
                        if (this.f16578k > 2 || this.f16549H) {
                            this.f16572e.setCount(this.f16551J);
                            View q = m14110q();
                            float top = (float) q.getTop();
                            float bottom = (float) q.getBottom();
                            itemCount = this.f16564W;
                            int i5 = -itemCount;
                            float height = (float) this.f16570c.getHeight();
                            if (height - top > ((float) itemCount)) {
                                i5 += (int) (height - bottom);
                            }
                            if (this.f16549H) {
                                m14084a(i2, 0, false);
                                m14093c(0);
                                if (i2 > 0) {
                                }
                            } else {
                                m14084a(this.f16578k + i4, i5, false);
                            }
                            m14102i();
                        } else {
                            m14108o();
                        }
                        z = false;
                    } else {
                        if (this.f16574g != null) {
                            ((C7191c) this.f16574g).f20704l = false;
                        }
                        m14108o();
                        m14094c(true);
                        this.aa = 0;
                        this.ab = 0;
                        this.f16551J = 0;
                        this.ac = 0;
                        z = true;
                    }
                    this.f16549H = false;
                    if (this.f16559R > 0) {
                        this.f16557P = false;
                    }
                    this.f16558Q = this.f16559R;
                    this.f16560S = i;
                    if (this.f16559R >= 10) {
                        this.f16571d.setVisibility(8);
                    } else {
                        this.f16571d.setVisibility(0);
                    }
                    if (this.f16559R > 0 && this.f16555N.getVisibility() == 0) {
                        this.f16555N.setVisibility(8);
                    }
                    if (!this.f16587t && !r10) {
                        this.f16588u = 0;
                        m14086a(this.f16574g.m13682b() + 1, this.f16583p, false, false);
                        this.f16587t = false;
                    } else if (!this.f16562U || this.f16569b || !this.f16583p || r10) {
                        if (this.f16562U && !this.f16569b && this.f16582o && !r10) {
                            this.f16582o = false;
                            this.f16583p = false;
                            this.f16588u = 1;
                        } else if (this.f16562U && !this.f16543B && !this.f16583p && this.f16569b && this.f16568a != null && !this.f16568a.isEmpty()) {
                            this.f16582o = false;
                            this.f16569b = false;
                            this.f16542A.f16477W = true;
                            this.f16542A.m13962a(this.f16581n, C3315b.last_position);
                            this.f16584q = 0;
                        } else if (this.f16543B && this.f16562U && !this.f16583p && !this.f16582o && this.f16568a != null && !this.f16568a.isEmpty()) {
                            this.f16562U = false;
                            this.f16568a = "";
                        } else if (!this.f16569b && this.f16568a == null && this.f16542A.m14024k() > 0 && this.f16567Z) {
                            this.f16582o = false;
                            this.f16584q = 0;
                            this.f16542A.f16478X = true;
                            this.f16542A.m13962a(this.f16542A.m14024k() - 1, C3315b.last_position);
                            this.f16567Z = false;
                        }
                        m14084a(this.f16581n + this.f16584q, 0, false);
                        this.f16581n = 0;
                    } else {
                        this.f16582o = false;
                        this.f16588u = 1;
                        this.f16583p = false;
                        this.f16542A.m13962a(this.f16581n + this.f16584q, C3315b.search);
                    }
                    if (!this.f16566Y) {
                        this.f16566Y = true;
                        this.f16542A.mo3190N();
                    }
                }
            }
            z = false;
            if (this.f16559R > 0) {
                this.f16557P = false;
            }
            this.f16558Q = this.f16559R;
            this.f16560S = i;
            if (this.f16559R >= 10) {
                this.f16571d.setVisibility(0);
            } else {
                this.f16571d.setVisibility(8);
            }
            this.f16555N.setVisibility(8);
            if (!this.f16587t) {
            }
            if (this.f16562U) {
            }
            if (this.f16562U) {
            }
            if (this.f16562U) {
            }
            if (this.f16543B) {
            }
            this.f16582o = false;
            this.f16584q = 0;
            this.f16542A.f16478X = true;
            this.f16542A.m13962a(this.f16542A.m14024k() - 1, C3315b.last_position);
            this.f16567Z = false;
            if (!this.f16566Y) {
                this.f16566Y = true;
                this.f16542A.mo3190N();
            }
        }
    }

    public final void mo2354a(boolean z) {
        ViewGroup viewGroup;
        boolean z2 = false;
        if (!z) {
            this.f16555N.setVisibility(8);
        } else if (!this.f16555N.isShown()) {
            this.f16555N.setVisibility(0);
            viewGroup = this.f16555N;
            z2 = true;
            viewGroup.setClickable(z2);
        }
        viewGroup = this.f16555N;
        viewGroup.setClickable(z2);
    }

    public final void m14089a(boolean z, boolean z2, boolean z3) {
        if (this.f16577j <= this.f16581n || this.f16584q > 0) {
            this.f16577j += this.f16542A.mo3197U();
        }
        this.f16542A.mo3200X();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_EXPECTED_ITEMS_COUNT", this.f16577j);
        if (z) {
            bundle.putBoolean("KEY_IS_SEARCHED_MESSAGE_PRESSED", true);
        } else {
            bundle.putBoolean("KEY_IS_SEARCHED_MESSAGE_PRESSED", false);
        }
        if (z3) {
            bundle.putBoolean("KEY_IS_REPLY_MESSAGE_PRESSED", true);
        } else {
            bundle.putBoolean("KEY_IS_REPLY_MESSAGE_PRESSED", false);
        }
        if (z2) {
            bundle.putBoolean("KEY_IS_LAST_POSITION", true);
        } else {
            bundle.putBoolean("KEY_IS_LAST_POSITION", false);
        }
        ((C7406c) this.f16593z).m19190e().mo270b(9, bundle, this);
    }

    public final void mo2280b(int i) {
        if (i >= 0) {
            C6829g b = this.f16574g.m17257b(i);
            if (b.f19503j != 7) {
                this.f16575h.mo2321b((C7197a) b);
            }
        }
    }

    public final void m14091b(boolean z) {
        C6123a c6123a = this.f16542A;
        if (c6123a.f16459E != null) {
            c6123a.f16459E.setEnabled(z);
            c6123a.f16459E.setClickable(z);
        }
        this.f16555N.setClickable(z);
    }

    public final boolean mo2355b() {
        return this.f16545D;
    }

    public final void m14093c(int i) {
        if (this.f16574g != null && this.f16574g.m13682b() > 0) {
            this.f16574g.notifyItemChanged(i);
        }
    }

    final void m14094c(boolean z) {
        this.f16584q = 0;
        C2808d.m7147a(new C6760g(this.f16563V, this.f16542A.m13937J(), z));
    }

    public final boolean mo2356c() {
        if (!this.f16542A.f16455A) {
            if (!this.f16542A.f16469O) {
                return false;
            }
        }
        return true;
    }

    public final void c_(int i) {
        if (i >= 0) {
            C6829g b = this.f16574g.m17257b(i);
            if (b.f19503j != 7) {
                this.f16575h.mo2314a((C7197a) b);
            }
        }
    }

    public final int mo2357d() {
        return this.aa;
    }

    final int m14097d(int i) {
        return (int) C2491i.m6804b(this.f16593z, (float) i);
    }

    public final boolean mo2358e() {
        return !(this.f16554M == C2973m.GROUP && (this.f16542A instanceof C6876e) && ((C6876e) this.f16542A).ah == C3004f.NONE) && this.f16542A.mo3192P();
    }

    public final boolean mo2359f() {
        return this.f16550I;
    }

    protected final void finalize() {
        if (this.f16570c != null) {
            this.f16570c.setItemAnimator(null);
            this.f16570c.setAdapter(null);
            this.f16570c = null;
        }
        this.f16574g = null;
        super.finalize();
    }

    public final void mo2360g() {
        m14081s();
    }

    final void m14101h() {
        this.ab = this.aa;
        this.f16572e.setCount(0);
    }

    final void m14102i() {
        if (this.f16572e != null) {
            this.f16546E = 0;
            this.f16547F = true;
            if (VERSION.SDK_INT >= 16) {
                this.f16572e.animate().translationY(16.0f).setInterpolator(new DecelerateInterpolator()).withLayer().start();
                return;
            }
            this.f16572e.animate().translationY(16.0f).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    public final void m14103j() {
        if (this.f16572e != null) {
            this.f16546E = 0;
            this.f16547F = false;
            if (VERSION.SDK_INT >= 16) {
                this.f16572e.animate().translationY((float) (this.f16572e.getHeight() + IjkMediaCodecInfo.RANK_MAX)).setInterpolator(new AccelerateInterpolator()).withLayer().start();
                return;
            }
            this.f16572e.animate().translationY((float) (this.f16572e.getHeight() + IjkMediaCodecInfo.RANK_MAX)).setInterpolator(new AccelerateInterpolator()).start();
        }
    }

    public final void m14104k() {
        if (this.f16574g != null) {
            this.f16574g.notifyDataSetChanged();
        }
    }

    public final void m14105l() {
        String str;
        if (this.f16559R <= 0 || this.f16574g == null) {
            str = null;
        } else {
            this.f16574g.m17257b(0);
            str = ((C7197a) this.f16574g.m17257b(this.f16574g.getItemCount() - 1)).f20777c;
        }
        C6123a c6123a = this.f16542A;
        if (this.f16574g != null) {
            this.f16574g.getItemCount();
        }
        c6123a.mo3221g(str);
    }

    public final void m14106m() {
        this.f16577j += this.f16542A.mo3196T();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_EXPECTED_ITEMS_COUNT", this.f16577j);
        ((C7406c) this.f16593z).m19190e().mo270b(9, bundle, this);
    }

    public final void m14107n() {
        this.f16565X = true;
        this.f16591x = true;
    }

    final void m14108o() {
        m14101h();
        m14094c(false);
        this.f16582o = false;
        this.f16583p = false;
        this.f16584q = 0;
        this.f16581n = 0;
        this.f16587t = false;
        this.f16588u = 1;
        this.f16542A.m14025l();
        this.f16569b = false;
        this.f16562U = false;
        this.f16543B = true;
        m14103j();
        m14084a(0, 0, false);
        this.f16575h.mo2340o();
    }

    final boolean m14109p() {
        return (this.f16568a == null || this.f16568a.isEmpty()) && this.f16544C > 0;
    }

    final View m14110q() {
        return this.f16570c.getChildAt(0);
    }

    final View m14111r() {
        return this.f16570c.getChildAt(1);
    }
}
