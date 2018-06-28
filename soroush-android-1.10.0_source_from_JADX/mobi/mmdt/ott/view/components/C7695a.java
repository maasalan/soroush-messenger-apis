package mobi.mmdt.ott.view.components;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.Behavior;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.C7249g;
import android.support.v4.p029a.C0346c;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.support.v7.p045d.C0694b;
import android.support.v7.p045d.C0694b.C0692c;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p107b.C1242b;
import jp.wasabeef.p215a.p216a.C7156b;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ab.C2582a;
import mobi.mmdt.ott.logic.p261a.ab.p542a.C6649a;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.squarecrop.SquareCropActivityCopy;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public abstract class C7695a extends C7576b implements C3101a {
    private RoundAvatarImageView f23962A;
    private TextView f23963B;
    private ViewStub f23964C;
    private AppBarLayout f23965D;
    private String f23966E;
    private String f23967F;
    protected CoordinatorLayout f23968m;
    protected TextView f23969n;
    protected NestedScrollView f23970o;
    protected CollapsingToolbarLayout f23971p;
    protected FloatingActionButton f23972q;
    protected FloatingActionButton f23973r;
    protected String f23974s;
    protected boolean f23975t;
    protected boolean f23976u = false;
    protected double f23977v = 0.5d;
    protected double f23978w = 0.5d;
    private ImageView f23979z;

    class C30951 implements OnClickListener {
        final /* synthetic */ C7695a f9664a;

        C30951(C7695a c7695a) {
            this.f9664a = c7695a;
        }

        public final void onClick(View view) {
            C7695a.m21039a(this.f9664a);
        }
    }

    class C30962 implements OnClickListener {
        final /* synthetic */ C7695a f9665a;

        C30962(C7695a c7695a) {
            this.f9665a = c7695a;
        }

        public final void onClick(View view) {
            this.f9665a.mo3699l();
        }
    }

    class C30976 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7695a f9666a;

        C30976(C7695a c7695a) {
            this.f9666a = c7695a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f9666a.m21073s();
        }
    }

    class C30987 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7695a f9667a;

        C30987(C7695a c7695a) {
            this.f9667a = c7695a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(C7695a.m21043c(this.f9667a));
        }
    }

    class C30998 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7695a f9668a;

        C30998(C7695a c7695a) {
            this.f9668a = c7695a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == R.id.action_camera) {
                C7695a.m21046f(this.f9668a);
            } else if (i == R.id.action_gallery) {
                C7695a.m21045e(this.f9668a);
            } else if (i == R.id.action_remove_photo) {
                C7695a.m21044d(this.f9668a);
            }
        }
    }

    class C31009 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7695a f9669a;

        C31009(C7695a c7695a) {
            this.f9669a = c7695a;
        }

        public final void onClick(android.content.DialogInterface r1, int r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x001c in {1, 3, 4, 6, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = this;
            switch(r2) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0012;
                case 2: goto L_0x000a;
                case 3: goto L_0x0004;
                default: goto L_0x0003;
            };
        L_0x0003:
            return;
        L_0x0004:
            r1 = r0.f9669a;
            mobi.mmdt.ott.view.tools.C4478a.m8152a((android.app.Activity) r1, r1.mo3696i(), r1.mo3695h(), r1.m21071q());
            return;
        L_0x000a:
            r1 = r0.f9669a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_INAPPROPRIATE;
        L_0x000e:
            mobi.mmdt.ott.view.components.C7695a.m21041a(r1, r2);
            return;
        L_0x0012:
            r1 = r0.f9669a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_VIOLENCE;
            goto L_0x000e;
        L_0x0017:
            r1 = r0.f9669a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_SPAM;
            goto L_0x000e;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.a.9.onClick(android.content.DialogInterface, int):void");
        }
    }

    class C60585 implements C0692c {
        final /* synthetic */ C7695a f16212a;

        C60585(C7695a c7695a) {
            this.f16212a = c7695a;
        }

        public final void mo2232a(C0694b c0694b) {
            int a = c0694b.m1686a(UIThemeManager.getmInstance().getPrimary_dark_color());
            this.f16212a.f23971p.setContentScrimColor(a);
            C2475a.m6720a(this.f16212a.getWindow(), a);
            a = Color.argb(255, Color.red(a), Color.green(a), Color.blue(a));
            this.f16212a.x.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{a, 0}));
        }
    }

    static /* synthetic */ void m21039a(C7695a c7695a) {
        int i;
        int i2;
        if (c7695a.f23974s == null) {
            i = R.menu.menu_bottom_sheet_choose_photo_without_remove;
            i2 = 2;
        } else {
            i = R.menu.menu_bottom_sheet_choose_photo;
            i2 = 3;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 171);
        bundle.putInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_RES_ID", i);
        bundle.putInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_GRID_COLUMNS", i2);
        c7695a.b_(bundle);
    }

    static /* synthetic */ void m21041a(C7695a c7695a, C2582a c2582a) {
        if (!(c7695a.mo3696i() == null || c7695a.mo3695h() == null)) {
            C2808d.m7148b(new C6649a(c7695a.mo3696i(), c7695a.mo3695h(), c2582a, ""));
        }
        c7695a.mo3704z();
    }

    static /* synthetic */ C7406c m21043c(C7695a c7695a) {
        return c7695a;
    }

    static /* synthetic */ void m21044d(C7695a c7695a) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 170);
        c7695a.b_(bundle);
    }

    static /* synthetic */ void m21045e(C7695a c7695a) {
        if (!C4516l.m8232a() || C2837a.m7169a()) {
            c7695a.mo3703y();
        } else {
            C2837a.m7167a(c7695a, "android.permission.WRITE_EXTERNAL_STORAGE", 100);
        }
    }

    static /* synthetic */ void m21046f(C7695a c7695a) {
        Intent intent = new Intent(c7695a, SquareCropActivityCopy.class);
        intent.putExtra("KEY_IMAGE_SELECTOR", 1002);
        c7695a.startActivityForResult(intent, 1002);
    }

    private void mo3703y() {
        Intent intent = new Intent(this, SquareCropActivityCopy.class);
        intent.putExtra("KEY_IMAGE_SELECTOR", 1001);
        startActivityForResult(intent, 1001);
    }

    private void mo3704z() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 12);
        b_(bundle);
    }

    public Dialog mo2299a(Bundle bundle) {
        switch (bundle.getInt("dialog_id")) {
            case 11:
                C0663a c0663a = new C0663a(this);
                StringBuilder stringBuilder = new StringBuilder("<b>");
                stringBuilder.append(C4522p.m8236a(R.string.action_report));
                stringBuilder.append("</b>");
                c0663a.m1608a(Html.fromHtml(stringBuilder.toString()));
                c0663a.m1611a(new CharSequence[]{C4522p.m8236a(R.string.action_spam), C4522p.m8236a(R.string.action_violence), C4522p.m8236a(R.string.action_inappropriate), C4522p.m8236a(R.string.other)}, new C31009(this));
                return c0663a.m1612a();
            case 12:
                return C4488b.m8183a(this, mo3696i());
            case 19:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.storage_permission), C4522p.m8236a(R.string.soroush_needs_access_to_your_storage), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C30987(this));
            case 170:
                return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_remove_profile_photo), C4522p.m8236a(R.string.action_remove_photo), new C30976(this), C4522p.m8236a(R.string.cancel), null);
            case 171:
                int i = bundle.getInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_RES_ID");
                int i2 = bundle.getInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_GRID_COLUMNS");
                C1286a c1286a = new C1286a(this);
                c1286a.f4034f = new C30998(this);
                C1286a a = c1286a.m3052a(i2);
                C4506e.m8204a(this, a, i);
                return a.m3053a();
            default:
                return null;
        }
    }

    protected final void m21051a(OnClickListener onClickListener) {
        this.f23972q.setOnClickListener(onClickListener);
    }

    protected final void m21052a(String str) {
        int b = (int) C2491i.m6804b((Context) this, 36.0f);
        C1212c.m2873a((C7249g) this).m10958e().m3037a((Object) str).m3034a(C1248f.m2945b().m2955b(C1144h.f3692d).m2949a(mo3643g()).m2962h().m2954b(b, b)).m3032a(new C7408b(this, this.f23962A) {
            final /* synthetic */ C7695a f23132b;

            public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                Bitmap bitmap = (Bitmap) obj;
                C0694b.m1684a(bitmap).m1678a(new C60585(this.f23132b));
                super.mo3320a(bitmap, c1242b);
            }
        });
    }

    protected final void m21053a(String str, boolean z) {
        if (str != null) {
            TextView textView;
            CharSequence b;
            if (this.f23966E.equals("fa")) {
                textView = this.f23969n;
                b = C2491i.m6814b(str.trim());
            } else {
                textView = this.f23969n;
                b = str.trim();
            }
            textView.setText(b);
        }
        if (z) {
            if (this.f23969n.getCompoundDrawables().length <= 0 || this.f23969n.getCompoundDrawables()[0] == null) {
                this.f23969n.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_star, 0);
            } else {
                this.f23969n.setCompoundDrawablesWithIntrinsicBounds(this.f23969n.getCompoundDrawables()[0], null, C0346c.m682a((Context) this, (int) R.drawable.ic_star), null);
            }
            this.f23969n.setCompoundDrawablePadding((int) C2491i.m6804b((Context) this, 4.0f));
            return;
        }
        this.f23969n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    protected final void m21054b(OnClickListener onClickListener) {
        this.f23973r.setOnClickListener(onClickListener);
    }

    protected final void m21055b(String str) {
        C1248f a = new C1248f().m2955b(C1144h.f3692d).m2962h().m2954b(160, 160).m2951a(new C7156b(6));
        if (str == null) {
            m21070p();
            return;
        }
        if (!str.equals(this.f23967F)) {
            C1212c.m2873a((C7249g) this).m10958e().m3037a((Object) str).m3034a(a).m3031a(this.f23979z);
            this.f23967F = str;
        }
    }

    protected final void m21056c(String str) {
        TextView textView;
        int i;
        if (str != null) {
            if (!str.isEmpty()) {
                TextView textView2;
                CharSequence b;
                if (this.f23966E.equals("fa")) {
                    textView2 = this.f23963B;
                    b = C2491i.m6814b(str.trim());
                } else {
                    textView2 = this.f23963B;
                    b = str.trim();
                }
                textView2.setText(b);
                textView = this.f23963B;
                i = 0;
                textView.setVisibility(i);
            }
        }
        this.f23963B.setText("");
        textView = this.f23963B;
        i = 8;
        textView.setVisibility(i);
    }

    protected final void m21057e(int i) {
        this.f23964C.setLayoutResource(i);
        this.f23964C.inflate();
    }

    protected final void m21058f(int i) {
        this.f23972q.setImageResource(i);
    }

    public abstract int mo3643g();

    protected final void m21060g(int i) {
        this.f23973r.setVisibility(i);
    }

    public abstract String mo3695h();

    protected final void m21062h(int i) {
        this.f23962A.setBackgroundColor(i);
    }

    public abstract C2973m mo3696i();

    public abstract void mo3697j();

    public abstract void mo3698k();

    public abstract void mo3699l();

    protected final void m21067m() {
        this.f23972q.setVisibility(8);
    }

    protected final void m21068n() {
        this.f23973r.setImageResource(R.drawable.ic_location_white);
    }

    protected final void m21069o() {
        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(mo3643g())).m3034a(C1248f.m2945b()).m3031a(this.f23962A);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        super.onActivityResult(r5, r6, r7);
        r0 = 1;
        r1 = 0;
        r2 = -1;
        r3 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        if (r5 != r3) goto L_0x0026;
    L_0x000a:
        if (r6 != r2) goto L_0x0034;
    L_0x000c:
        r4.f23976u = r1;
        r4.f23975t = r0;
        r4.mo3697j();
        r5 = "KEY_SQUARE_IMAGE_FILE_PATH";
        r5 = r7.getStringExtra(r5);
        r4.f23974s = r5;
        r5 = r4.f23974s;
        r4.m21052a(r5);
        r5 = r4.f23974s;
        r4.m21055b(r5);
        return;
    L_0x0026:
        r3 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        if (r5 != r3) goto L_0x002d;
    L_0x002a:
        if (r6 != r2) goto L_0x0034;
    L_0x002c:
        goto L_0x000c;
    L_0x002d:
        r6 = 10;
        if (r5 != r6) goto L_0x0034;
    L_0x0031:
        r4.mo3704z();
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.a.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_image_title);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        C2475a.m6720a(getWindow(), UIThemeManager.getmInstance().getAccent_color());
        this.f23964C = (ViewStub) findViewById(R.id.container_viewStub);
        this.f23971p = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.f23970o = (NestedScrollView) findViewById(R.id.nestedScrollView);
        this.f23969n = (TextView) findViewById(R.id.cat_title);
        this.f23963B = (TextView) findViewById(R.id.cat_subtitle);
        this.f23962A = (RoundAvatarImageView) findViewById(R.id.cat_avatar);
        this.f23979z = (ImageView) findViewById(R.id.backdrop);
        this.f23968m = (CoordinatorLayout) findViewById(R.id.main_content);
        this.f23965D = (AppBarLayout) findViewById(R.id.appbar);
        this.f23972q = (FloatingActionButton) findViewById(R.id.fab1);
        this.f23973r = (FloatingActionButton) findViewById(R.id.fab2);
        this.f23966E = C2535a.m6888a().m6919b();
        mo3698k();
        LayoutParams layoutParams = ((AppBarLayout) findViewById(R.id.appbar)).getLayoutParams();
        if (getResources().getConfiguration().orientation == 1) {
            layoutParams.height = C2489g.m6754a().m6755a((float) this.f23977v);
            Behavior behavior = (Behavior) ((C0273d) this.f23965D.getLayoutParams()).f987a;
            if (behavior != null) {
                behavior.a_(0);
                behavior.mo149a(this.f23968m, this.f23965D, null, 0, 1, new int[2]);
            }
        } else {
            layoutParams.height = C2489g.m6754a().m6756b((float) this.f23978w);
        }
        this.f23972q.setOnClickListener(new C30951(this));
        this.f23962A.setTextColor(-1);
        this.f23962A.setOnClickListener(new C30962(this));
        if (bundle != null) {
            if (bundle.containsKey("KEY_CROPPED_IMAGE_ADDRESS")) {
                this.f23974s = bundle.getString("KEY_CROPPED_IMAGE_ADDRESS");
            }
            if (bundle.containsKey("KEY_IS_IMAGE_CHANGED")) {
                this.f23975t = bundle.getBoolean("KEY_IS_IMAGE_CHANGED");
            }
            if (bundle.containsKey("KEY_IS_REMOVE_IMAGE")) {
                this.f23976u = bundle.getBoolean("KEY_IS_REMOVE_IMAGE");
            }
        }
        if (this.f23974s != null) {
            C1212c.m2873a((C7249g) this).m10958e().m3037a(this.f23974s).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2949a((int) R.drawable.ic_place_holder_contact)).m3033a().m3032a(new C7408b(this, this.f23962A) {
                final /* synthetic */ C7695a f23131b;

                public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                    Bitmap bitmap = (Bitmap) obj;
                    C0694b.m1684a(bitmap).m1678a(new C60585(this.f23131b));
                    super.mo3320a(bitmap, c1242b);
                }
            });
            C1212c.m2873a((C7249g) this).m10958e().m3037a(this.f23974s).m3034a(new C1248f().m2955b(C1144h.f3692d).m2951a(new C7156b(6)).m2962h().m2954b(160, 160)).m3031a(this.f23979z);
        }
        this.f23971p.setTitle("");
        setTitle("");
        C2491i.m6796a(this.f23968m, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f23969n, UIThemeManager.getmInstance().getTitle_profile_text_color());
        C2491i.m6802a(this.f23963B, UIThemeManager.getmInstance().getTitle_profile_text_color());
        if (this.f23972q != null) {
            C2491i.m6791a(this.f23972q, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
        }
        if (this.f23973r != null) {
            C2491i.m6791a(this.f23973r, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
        }
        this.f23971p.setContentScrimColor(UIThemeManager.getmInstance().getAccent_color());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_report) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 11);
            b_(bundle);
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100 && iArr.length > 0) {
            if (iArr[0] == -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 19);
                b_(bundle);
                return;
            }
            mo3703y();
        }
    }

    public void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f23974s != null) {
            bundle.putString("KEY_CROPPED_IMAGE_ADDRESS", this.f23974s);
        }
        bundle.putBoolean("KEY_IS_IMAGE_CHANGED", this.f23975t);
        bundle.putBoolean("KEY_IS_REMOVE_IMAGE", this.f23976u);
    }

    protected final void m21070p() {
        this.f23979z.setImageBitmap(null);
        C2491i.m6796a(this.f23979z, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.x, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final String m21071q() {
        return this.f23969n.getText().toString();
    }

    protected final String m21072r() {
        return this.f23963B.getText().toString();
    }

    public final void m21073s() {
        this.f23975t = true;
        this.f23976u = true;
        mo3697j();
        this.f23974s = null;
        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(mo3643g())).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f23962A);
        this.f23979z.setImageBitmap(null);
        this.x.setBackgroundDrawable(null);
    }
}
