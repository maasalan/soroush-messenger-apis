package mobi.mmdt.ott.view.vas.p483a;

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
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.squarecrop.SquareCropActivityCopy;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public abstract class C7723a extends C7576b implements C3101a {
    protected double f24493A = 0.5d;
    private ImageView f24494B;
    private TextView f24495C;
    private AppBarLayout f24496D;
    private String f24497E;
    protected CoordinatorLayout f24498m;
    protected TextView f24499n;
    protected NestedScrollView f24500o;
    protected CollapsingToolbarLayout f24501p;
    protected FloatingActionButton f24502q;
    protected FloatingActionButton f24503r;
    protected String f24504s;
    protected boolean f24505t;
    protected boolean f24506u = false;
    protected RoundAvatarImageView f24507v;
    protected ViewStub f24508w;
    protected double f24509z = 0.5d;

    class C45351 implements OnClickListener {
        final /* synthetic */ C7723a f12496a;

        C45351(C7723a c7723a) {
            this.f12496a = c7723a;
        }

        public final void onClick(View view) {
            C7723a.m21475a(this.f12496a);
        }
    }

    class C45362 implements OnClickListener {
        final /* synthetic */ C7723a f12497a;

        C45362(C7723a c7723a) {
            this.f12497a = c7723a;
        }

        public final void onClick(View view) {
        }
    }

    class C45376 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7723a f12498a;

        C45376(C7723a c7723a) {
            this.f12498a = c7723a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12498a.m21493h();
        }
    }

    class C45387 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7723a f12499a;

        C45387(C7723a c7723a) {
            this.f12499a = c7723a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(C7723a.m21479e(this.f12499a));
        }
    }

    class C45398 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7723a f12500a;

        C45398(C7723a c7723a) {
            this.f12500a = c7723a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == R.id.action_camera) {
                C7723a.m21482h(this.f12500a);
            } else if (i == R.id.action_gallery) {
                C7723a.m21481g(this.f12500a);
            } else if (i == R.id.action_remove_photo) {
                C7723a.m21480f(this.f12500a);
            }
        }
    }

    class C45409 implements DialogInterface.OnClickListener {
        final /* synthetic */ C7723a f12501a;

        C45409(C7723a c7723a) {
            this.f12501a = c7723a;
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
            r1 = r0.f12501a;
            mobi.mmdt.ott.view.tools.C4478a.m8152a((android.app.Activity) r1, null, null, r1.f24499n.getText().toString());
            return;
        L_0x000a:
            r1 = r0.f12501a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_INAPPROPRIATE;
        L_0x000e:
            r1.m21485j();
            return;
        L_0x0012:
            r1 = r0.f12501a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_VIOLENCE;
            goto L_0x000e;
        L_0x0017:
            r1 = r0.f12501a;
            r2 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_SPAM;
            goto L_0x000e;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.vas.a.a.9.onClick(android.content.DialogInterface, int):void");
        }
    }

    class C76915 extends C7408b {
        final /* synthetic */ C7723a f23877b;

        class C62771 implements C0692c {
            final /* synthetic */ C76915 f17134a;

            C62771(C76915 c76915) {
                this.f17134a = c76915;
            }

            public final void mo2232a(C0694b c0694b) {
                int primary_dark_color = UIThemeManager.getmInstance().getPrimary_dark_color();
                this.f17134a.f23877b.f24501p.setContentScrimColor(primary_dark_color);
                C2475a.m6720a(this.f17134a.f23877b.getWindow(), primary_dark_color);
                primary_dark_color = Color.argb(255, Color.red(primary_dark_color), Color.green(primary_dark_color), Color.blue(primary_dark_color));
                this.f17134a.f23877b.x.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{primary_dark_color, 0}));
            }
        }

        public C76915(C7723a c7723a, ImageView imageView) {
            this.f23877b = c7723a;
            super(imageView);
        }

        public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
            Bitmap bitmap = (Bitmap) obj;
            C0694b.m1684a(bitmap).m1678a(new C62771(this));
            super.mo3320a(bitmap, c1242b);
        }
    }

    static /* synthetic */ void m21475a(C7723a c7723a) {
        int i;
        int i2;
        if (c7723a.f24504s == null) {
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
        c7723a.b_(bundle);
    }

    static /* synthetic */ C7406c m21479e(C7723a c7723a) {
        return c7723a;
    }

    static /* synthetic */ void m21480f(C7723a c7723a) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 170);
        c7723a.b_(bundle);
    }

    static /* synthetic */ void m21481g(C7723a c7723a) {
        if (!C4516l.m8232a() || C2837a.m7169a()) {
            c7723a.m21483i();
        } else {
            C2837a.m7167a(c7723a, "android.permission.WRITE_EXTERNAL_STORAGE", 100);
        }
    }

    static /* synthetic */ void m21482h(C7723a c7723a) {
        Intent intent = new Intent(c7723a, SquareCropActivityCopy.class);
        intent.putExtra("KEY_IMAGE_SELECTOR", 1002);
        c7723a.startActivityForResult(intent, 1002);
    }

    private void m21483i() {
        Intent intent = new Intent(this, SquareCropActivityCopy.class);
        intent.putExtra("KEY_IMAGE_SELECTOR", 1001);
        startActivityForResult(intent, 1001);
    }

    private void m21485j() {
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
                c0663a.m1611a(new CharSequence[]{C4522p.m8236a(R.string.action_spam), C4522p.m8236a(R.string.action_violence), C4522p.m8236a(R.string.action_inappropriate), C4522p.m8236a(R.string.other)}, new C45409(this));
                return c0663a.m1612a();
            case 12:
                return C4488b.m8183a(this, null);
            case 19:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.storage_permission), C4522p.m8236a(R.string.soroush_needs_access_to_your_storage), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C45387(this));
            case 170:
                return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_remove_profile_photo), C4522p.m8236a(R.string.action_remove_photo), new C45376(this), C4522p.m8236a(R.string.cancel), null);
            case 171:
                int i = bundle.getInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_RES_ID");
                int i2 = bundle.getInt("KEY_BOTTOM_SHEET_IMAGE_TITLE_MENU_GRID_COLUMNS");
                C1286a c1286a = new C1286a(this);
                c1286a.f4034f = new C45398(this);
                C1286a a = c1286a.m3052a(i2);
                C4506e.m8204a(this, a, i);
                return a.m3053a();
            default:
                return null;
        }
    }

    protected final void m21488a(OnClickListener onClickListener) {
        this.f24502q.setOnClickListener(onClickListener);
    }

    protected final void m21489a(String str) {
        int b = (int) C2491i.m6804b((Context) this, 36.0f);
        C1212c.m2873a((C7249g) this).m10958e().m3037a((Object) str).m3034a(C1248f.m2945b().m2955b(C1144h.f3692d).m2949a((int) R.drawable.ic_place_holder_group).m2962h().m2954b(b, b)).m3032a(new C7408b(this, this.f24507v) {
            final /* synthetic */ C7723a f23876b;

            class C62761 implements C0692c {
                final /* synthetic */ C76904 f17133a;

                C62761(C76904 c76904) {
                    this.f17133a = c76904;
                }

                public final void mo2232a(C0694b c0694b) {
                    int primary_color = UIThemeManager.getmInstance().getPrimary_color();
                    c0694b.m1686a(primary_color);
                    this.f17133a.f23876b.f24501p.setContentScrimColor(primary_color);
                    C2475a.m6720a(this.f17133a.f23876b.getWindow(), primary_color);
                    int argb = Color.argb(255, Color.red(primary_color), Color.green(primary_color), Color.blue(primary_color));
                    this.f17133a.f23876b.x.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{argb, 0}));
                }
            }

            public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                Bitmap bitmap = (Bitmap) obj;
                C0694b.m1684a(bitmap).m1678a(new C62761(this));
                super.mo3320a(bitmap, c1242b);
            }
        });
    }

    protected final void m21490b(String str) {
        if (str == null) {
            this.f24494B.setImageBitmap(null);
            C2491i.m6796a(this.f24494B, UIThemeManager.getmInstance().getAccent_color());
            C2491i.m6796a(this.x, UIThemeManager.getmInstance().getAccent_color());
            return;
        }
        C1212c.m2873a((C7249g) this).m10958e().m3037a((Object) str).m3034a(new C1248f().m2955b(C1144h.f3692d).m2962h().m2954b(160, 160)).m3031a(this.f24494B);
    }

    protected final void m21491c(String str) {
        TextView textView;
        CharSequence b;
        if (this.f24497E.equals("fa")) {
            textView = this.f24499n;
            b = C2491i.m6814b(str);
        } else {
            textView = this.f24499n;
        }
        textView.setText(b);
    }

    protected final void mo3643g() {
        this.f24502q.setImageResource(R.drawable.ic_charge_cart);
    }

    public final void m21493h() {
        this.f24505t = true;
        this.f24506u = true;
        this.f24504s = null;
        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(R.drawable.ic_place_holder_group)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f24507v);
        this.f24494B.setImageBitmap(null);
        this.x.setBackgroundDrawable(null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
        r3 = this;
        super.onActivityResult(r4, r5, r6);
        r0 = 10;
        if (r4 == r0) goto L_0x002a;
    L_0x0007:
        r0 = 1;
        r1 = 0;
        r2 = -1;
        switch(r4) {
            case 1001: goto L_0x0027;
            case 1002: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        return;
    L_0x000e:
        if (r5 != r2) goto L_0x002f;
    L_0x0010:
        r3.f24506u = r1;
        r3.f24505t = r0;
        r4 = "KEY_SQUARE_IMAGE_FILE_PATH";
        r4 = r6.getStringExtra(r4);
        r3.f24504s = r4;
        r4 = r3.f24504s;
        r3.m21489a(r4);
        r4 = r3.f24504s;
        r3.m21490b(r4);
        return;
    L_0x0027:
        if (r5 != r2) goto L_0x002f;
    L_0x0029:
        goto L_0x0010;
    L_0x002a:
        if (r5 != r0) goto L_0x002f;
    L_0x002c:
        r3.m21485j();
    L_0x002f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.vas.a.a.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        CoordinatorLayout coordinatorLayout;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vas_image_title);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        C2475a.m6720a(getWindow(), UIThemeManager.getmInstance().getAccent_color());
        this.f24508w = (ViewStub) findViewById(R.id.container_viewStub);
        this.f24501p = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.f24500o = (NestedScrollView) findViewById(R.id.nestedScrollView);
        this.f24499n = (TextView) findViewById(R.id.cat_title);
        this.f24495C = (TextView) findViewById(R.id.cat_subtitle);
        this.f24507v = (RoundAvatarImageView) findViewById(R.id.cat_avatar);
        this.f24494B = (ImageView) findViewById(R.id.backdrop);
        this.f24498m = (CoordinatorLayout) findViewById(R.id.main_content);
        this.f24496D = (AppBarLayout) findViewById(R.id.appbar);
        this.f24502q = (FloatingActionButton) findViewById(R.id.fab1);
        this.f24503r = (FloatingActionButton) findViewById(R.id.fab2);
        this.f24497E = C2535a.m6888a().m6919b();
        LayoutParams layoutParams = ((AppBarLayout) findViewById(R.id.appbar)).getLayoutParams();
        if (getResources().getConfiguration().orientation == 1) {
            layoutParams.height = (int) (((double) C2489g.m6754a().m6755a(BallPulseIndicator.SCALE)) * this.f24509z);
            Behavior behavior = (Behavior) ((C0273d) this.f24496D.getLayoutParams()).f987a;
            if (behavior != null) {
                behavior.a_(0);
                behavior.mo149a(this.f24498m, this.f24496D, null, 0, 1, new int[2]);
            }
        } else {
            layoutParams.height = (int) (((double) C2489g.m6754a().m6756b(BallPulseIndicator.SCALE)) * this.f24493A);
        }
        this.f24502q.setOnClickListener(new C45351(this));
        this.f24507v.setTextColor(-1);
        this.f24507v.setOnClickListener(new C45362(this));
        if (bundle != null) {
            if (bundle.containsKey("KEY_CROPPED_IMAGE_ADDRESS")) {
                this.f24504s = bundle.getString("KEY_CROPPED_IMAGE_ADDRESS");
            }
            if (bundle.containsKey("KEY_IS_IMAGE_CHANGED")) {
                this.f24505t = bundle.getBoolean("KEY_IS_IMAGE_CHANGED");
            }
            if (bundle.containsKey("KEY_IS_REMOVE_IMAGE")) {
                this.f24506u = bundle.getBoolean("KEY_IS_REMOVE_IMAGE");
            }
        }
        if (this.f24504s != null) {
            C1212c.m2873a((C7249g) this).m10958e().m3037a(this.f24504s).m3034a(C1248f.m2945b().m2955b(C1144h.f3692d).m2949a((int) R.drawable.ic_place_holder_contact)).m3033a().m3032a(new C7408b(this, this.f24507v) {
                final /* synthetic */ C7723a f23875b;

                class C62751 implements C0692c {
                    final /* synthetic */ C76893 f17132a;

                    C62751(C76893 c76893) {
                        this.f17132a = c76893;
                    }

                    public final void mo2232a(C0694b c0694b) {
                        int primary_color = UIThemeManager.getmInstance().getPrimary_color();
                        c0694b.m1686a(primary_color);
                        this.f17132a.f23875b.f24501p.setContentScrimColor(primary_color);
                        C2475a.m6720a(this.f17132a.f23875b.getWindow(), primary_color);
                        int argb = Color.argb(255, Color.red(primary_color), Color.green(primary_color), Color.blue(primary_color));
                        this.f17132a.f23875b.x.setBackgroundDrawable(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{argb, 0}));
                    }
                }

                public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                    Bitmap bitmap = (Bitmap) obj;
                    C0694b.m1684a(bitmap).m1678a(new C62751(this));
                    super.mo3320a(bitmap, c1242b);
                }
            });
            C1212c.m2873a((C7249g) this).m10958e().m3037a(this.f24504s).m3034a(new C1248f().m2955b(C1144h.f3692d).m2962h().m2954b(160, 160)).m3031a(this.f24494B);
        }
        this.f24501p.setTitle("");
        setTitle("");
        if (getResources().getConfiguration().orientation == 2) {
            coordinatorLayout = this.f24498m;
            i = R.color.window_background_dark;
        } else {
            coordinatorLayout = this.f24498m;
            i = R.color.white;
        }
        coordinatorLayout.setBackgroundColor(C0346c.m687c(this, i));
        C2491i.m6802a(this.f24499n, UIThemeManager.getmInstance().getTitle_profile_text_color());
        C2491i.m6802a(this.f24495C, UIThemeManager.getmInstance().getTitle_profile_text_color());
        if (this.f24502q != null) {
            C2491i.m6791a(this.f24502q, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
        }
        if (this.f24503r != null) {
            C2491i.m6791a(this.f24503r, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
        }
        this.f24501p.setContentScrimColor(UIThemeManager.getmInstance().getAccent_color());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            return itemId == R.id.action_report ? true : super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
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
            m21483i();
        }
    }

    public void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f24504s != null) {
            bundle.putString("KEY_CROPPED_IMAGE_ADDRESS", this.f24504s);
        }
        bundle.putBoolean("KEY_IS_IMAGE_CHANGED", this.f24505t);
        bundle.putBoolean("KEY_IS_REMOVE_IMAGE", this.f24506u);
    }
}
