package mobi.mmdt.ott.view.stickermarket;

import android.app.Activity;
import android.app.Dialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p107b.C1242b;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2585c;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2586d;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2589g;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6650a;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6651b;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6656g;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6657h;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p394p.C3015b;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public class StickerDetailsActivity extends C7576b implements C3101a {
    private boolean f24459A;
    private C1063i f24460B;
    private C3016f f24461C = C3016f.NOT_STARTED;
    private MenuItem f24462D;
    private FrameLayout f24463E;
    private NestedScrollView f24464F;
    private TextView f24465G;
    private boolean f24466H;
    private C1247e<Drawable> f24467I = new C62651(this);
    private LoaderCallbacks<Cursor> f24468J = new C44454(this);
    private OnClickListener f24469K = new C44476(this);
    private OnClickListener f24470L = new C44487(this);
    private OnClickListener f24471M = new C44498(this);
    private int f24472m;
    private FloatingActionButton f24473n;
    private ProgressWheel f24474o;
    private ProgressWheel f24475p;
    private RoundAvatarImageView f24476q;
    private ImageView f24477r;
    private TextView f24478s;
    private TextView f24479t;
    private TextView f24480u;
    private TextView f24481v;
    private ViewGroup f24482w;
    private ViewGroup f24483z;

    class C44454 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ StickerDetailsActivity f12366a;

        C44454(StickerDetailsActivity stickerDetailsActivity) {
            this.f12366a = stickerDetailsActivity;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Context applicationContext = this.f12366a.getApplicationContext();
            i = this.f12366a.f24472m;
            return new CursorLoader(applicationContext, C3015b.f9463a, null, "stickerspackage_package_id =? ", new String[]{String.valueOf(i)}, "stickerspackage_package_id ASC");
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor != null) {
                final C6048d c6048d = new C6048d(cursor);
                if (!c6048d.moveToFirst()) {
                    if (this.f12366a.f24462D != null) {
                        this.f12366a.f24462D.setVisible(false);
                    }
                    C2475a.m6721b(StickerDetailsActivity.m21451q(this.f12366a), null);
                    this.f12366a.f24473n.setOnClickListener(this.f12366a.f24469K);
                    this.f12366a.f24473n.setImageResource(R.drawable.ic_download_archive);
                } else if (this.f12366a.f24483z != null) {
                    this.f12366a.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C44454 f12365b;

                        public final void run() {
                            this.f12365b.f12366a.f24461C = c6048d.m13581a();
                            switch (this.f12365b.f12366a.f24461C) {
                                case NOT_STARTED:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(false);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21439f(this.f12365b.f12366a), null);
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24469K);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_download_archive);
                                    return;
                                case CANCEL:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(false);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21443i(this.f12365b.f12366a), null);
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24469K);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_download_archive);
                                    return;
                                case ERROR:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(false);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21444j(this.f12365b.f12366a), null);
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24469K);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_download_archive);
                                    return;
                                case TRANSMITTING:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(false);
                                    }
                                    Activity k = StickerDetailsActivity.m21445k(this.f12365b.f12366a);
                                    StringBuilder stringBuilder = new StringBuilder("Downloading...  ");
                                    Integer b = c6048d.m7353b("stickerspackage_progress");
                                    if (b == null) {
                                        throw new NullPointerException("The value of 'progress' in the database was null, which is not allowed according to the model definition");
                                    }
                                    stringBuilder.append(b.intValue());
                                    stringBuilder.append("%");
                                    C2475a.m6721b(k, stringBuilder.toString());
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24471M);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_sticker_details_cancel);
                                    return;
                                case FINISHED:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(true);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21447m(this.f12365b.f12366a), "Downloaded");
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24470L);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_sticker_details_settings);
                                    return;
                                case EXTRACTING:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(false);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21449o(this.f12365b.f12366a), "Installing...");
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24470L);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_sticker_details_settings);
                                    return;
                                case READY:
                                    if (this.f12365b.f12366a.f24462D != null) {
                                        this.f12365b.f12366a.f24462D.setVisible(true);
                                    }
                                    C2475a.m6721b(StickerDetailsActivity.m21450p(this.f12365b.f12366a), "Installed");
                                    this.f12365b.f12366a.f24473n.setOnClickListener(this.f12365b.f12366a.f24470L);
                                    this.f12365b.f12366a.f24473n.setImageResource(R.drawable.ic_sticker_details_settings);
                                    return;
                                default:
                                    return;
                            }
                        }
                    });
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    class C44465 implements DialogInterface.OnClickListener {
        final /* synthetic */ StickerDetailsActivity f12367a;

        C44465(StickerDetailsActivity stickerDetailsActivity) {
            this.f12367a = stickerDetailsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7148b(new C6651b(this.f12367a.f24472m));
        }
    }

    class C44476 implements OnClickListener {
        final /* synthetic */ StickerDetailsActivity f12368a;

        C44476(StickerDetailsActivity stickerDetailsActivity) {
            this.f12368a = stickerDetailsActivity;
        }

        public final void onClick(View view) {
            StickerDetailsActivity.m21452r(this.f12368a);
        }
    }

    class C44487 implements OnClickListener {
        final /* synthetic */ StickerDetailsActivity f12369a;

        C44487(StickerDetailsActivity stickerDetailsActivity) {
            this.f12369a = stickerDetailsActivity;
        }

        public final void onClick(View view) {
            C4478a.m8157b(StickerDetailsActivity.m21453s(this.f12369a));
        }
    }

    class C44498 implements OnClickListener {
        final /* synthetic */ StickerDetailsActivity f12370a;

        C44498(StickerDetailsActivity stickerDetailsActivity) {
            this.f12370a = stickerDetailsActivity;
        }

        public final void onClick(View view) {
            C2808d.m7147a(new C6650a(this.f12370a.f24472m));
        }
    }

    class C44509 implements Runnable {
        final /* synthetic */ StickerDetailsActivity f12371a;

        C44509(StickerDetailsActivity stickerDetailsActivity) {
            this.f12371a = stickerDetailsActivity;
        }

        public final void run() {
            if (this.f12371a.f24460B instanceof C6656g) {
                this.f12371a.m21441g();
            } else if (this.f12371a.f24460B instanceof C6657h) {
                StickerDetailsActivity.m21452r(this.f12371a);
            }
            this.f12371a.f24459A = false;
        }
    }

    class C62651 implements C1247e<Drawable> {
        final /* synthetic */ StickerDetailsActivity f17090a;

        C62651(StickerDetailsActivity stickerDetailsActivity) {
            this.f17090a = stickerDetailsActivity;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f17090a.f24474o.setVisibility(8);
            return false;
        }
    }

    static /* synthetic */ C7406c m21426C(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21430G(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ void m21433a(StickerDetailsActivity stickerDetailsActivity, double d) {
        LayoutParams layoutParams;
        int g;
        if (stickerDetailsActivity.getResources().getBoolean(R.bool.xlarge)) {
            g = StickerDetailsActivityThemeDialog.m22068g();
            layoutParams = new FrameLayout.LayoutParams(g, (int) (((double) g) * d));
        } else {
            g = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
            layoutParams = new FrameLayout.LayoutParams(g, (int) (((double) g) * d));
        }
        stickerDetailsActivity.f24477r.setLayoutParams(layoutParams);
    }

    static /* synthetic */ C7406c m21439f(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    private void m21441g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f24472m);
        C1063i c6656g = new C6656g(stringBuilder.toString());
        this.f24460B = c6656g;
        C2808d.m7148b(c6656g);
    }

    static /* synthetic */ C7406c m21443i(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21444j(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21445k(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21447m(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21449o(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21450p(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ C7406c m21451q(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    static /* synthetic */ void m21452r(StickerDetailsActivity stickerDetailsActivity) {
        C1063i c6657h = new C6657h(stickerDetailsActivity.f24472m);
        stickerDetailsActivity.f24460B = c6657h;
        C2808d.m7148b(c6657h);
    }

    static /* synthetic */ C7406c m21453s(StickerDetailsActivity stickerDetailsActivity) {
        return stickerDetailsActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        return bundle.getInt("dialog_id") != 10 ? null : C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_delete_this_sticker), C4522p.m8236a(R.string.action_delete), new C44465(this), C4522p.m8236a(R.string.cancel_cap), null);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scrolling);
        this.f24466H = C2535a.m6888a().m6919b().equals("fa");
        this.x = (Toolbar) findViewById(R.id.toolbarX);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.sticker_market));
        this.y = findViewById(R.id.shadow_line_top);
        this.f24472m = getIntent().getIntExtra("StickerDetailsActivity.KEY_PACKAGE_ID", -1);
        String stringExtra = getIntent().getStringExtra("StickerDetailsActivity.KEY_PACKAGE_NAME");
        String stringExtra2 = getIntent().getStringExtra("StickerDetailsActivity.KEY_DOWNLOAD_COUNT");
        CharSequence stringExtra3 = getIntent().getStringExtra("StickerDetailsActivity.KEY_PRICE");
        if (!(stringExtra == null || stringExtra.isEmpty())) {
            C2475a.m6719a((Activity) this, stringExtra);
        }
        this.f24473n = (FloatingActionButton) findViewById(R.id.fab);
        this.f24464F = (NestedScrollView) findViewById(R.id.root_nestedScrollView);
        this.f24474o = (ProgressWheel) findViewById(R.id.thumbnail_progressBar);
        this.f24475p = (ProgressWheel) findViewById(R.id.overview_progressBar);
        this.f24463E = (FrameLayout) findViewById(R.id.root_collapse_frameLayout);
        this.f24476q = (RoundAvatarImageView) findViewById(R.id.thumbnail_imageView);
        this.f24477r = (ImageView) findViewById(R.id.overview_imageView);
        this.f24478s = (TextView) findViewById(R.id.sticker_detail_1);
        this.f24479t = (TextView) findViewById(R.id.sticker_detail_2);
        this.f24480u = (TextView) findViewById(R.id.sticker_detail_3);
        this.f24481v = (TextView) findViewById(R.id.designer_textView);
        this.f24465G = (TextView) findViewById(R.id.designed_by_textView);
        this.f24482w = (ViewGroup) findViewById(R.id.designer_linearLayout);
        this.f24483z = (ViewGroup) findViewById(R.id.root_relativeLayout);
        if (!(stringExtra3 == null || stringExtra3.isEmpty())) {
            if (Double.parseDouble(stringExtra3) == 0.0d) {
                stringExtra3 = C4522p.m8236a(R.string.free);
            }
            if (this.f24466H) {
                stringExtra3 = C2491i.m6814b((String) stringExtra3);
            }
            this.f24478s.setText(stringExtra3);
        }
        if (!(stringExtra2 == null || stringExtra2.isEmpty())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stringExtra2);
            stringBuilder.append(" ");
            stringBuilder.append(C4522p.m8236a(R.string.downloads));
            CharSequence stringBuilder2 = stringBuilder.toString();
            if (this.f24466H) {
                stringBuilder2 = C2491i.m6814b((String) stringBuilder2);
            }
            this.f24479t.setText(stringBuilder2);
        }
        this.f24476q.setTextColor(-1);
        C2475a.m6721b(this, null);
        this.f24473n.setOnClickListener(this.f24469K);
        this.f24473n.setImageResource(R.drawable.ic_download_archive);
        getLoaderManager().initLoader(26, null, this.f24468J);
        m21441g();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6796a(this.f24463E, UIThemeManager.getmInstance().getFrame_view_color());
        C2491i.m6791a(this.f24473n, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
        C2491i.m6802a(this.f24478s, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24479t, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24480u, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24481v, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24465G, UIThemeManager.getmInstance().getText_primary_color());
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        boolean z;
        getMenuInflater().inflate(R.menu.menu_sticker_details, menu);
        this.f24462D = menu.findItem(R.id.action_delete);
        this.f24462D.setTitle(C4522p.m8236a(R.string.action_delete));
        C2491i.m6790a(this.f24462D.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        switch (this.f24461C) {
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
            case TRANSMITTING:
            case EXTRACTING:
                menuItem = this.f24462D;
                z = false;
                break;
            case FINISHED:
            case READY:
                menuItem = this.f24462D;
                z = true;
                break;
            default:
                break;
        }
        menuItem.setVisible(z);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(26);
    }

    public void onEvent(C2585c c2585c) {
        final Runnable c44509 = new C44509(this);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ StickerDetailsActivity f12358b;

            class C44411 implements OnClickListener {
                final /* synthetic */ AnonymousClass10 f12356a;

                C44411(AnonymousClass10 anonymousClass10) {
                    this.f12356a = anonymousClass10;
                }

                public final void onClick(View view) {
                    c44509.run();
                }
            }

            public final void run() {
                Snackbar a = Snackbar.m8770a(this.f12358b.f24483z, C4522p.m8236a(R.string.connection_error_message), -2);
                a.m8771a(new C44411(this));
                if (!this.f12358b.f24459A) {
                    this.f12358b.f24459A = true;
                    a.m572a();
                }
            }
        });
    }

    public void onEvent(final C2586d c2586d) {
        if (this.f24483z != null) {
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ StickerDetailsActivity f12360b;

                public final void run() {
                    this.f12360b.f24482w.setVisibility(0);
                    this.f12360b.f24480u.setText(c2586d.f8434a);
                    this.f12360b.f24481v.setText(c2586d.f8435b);
                    double parseDouble = Double.parseDouble(c2586d.f8436c);
                    String str = c2586d.f8437d;
                    CharSequence a = parseDouble == 0.0d ? C4522p.m8236a(R.string.free) : c2586d.f8436c;
                    if (this.f12360b.f24466H) {
                        a = C2491i.m6814b((String) a);
                        str = C2491i.m6814b(str);
                    }
                    this.f12360b.f24478s.setText(a);
                    this.f12360b.f24479t.setText(str);
                    if (!(str == null || str.isEmpty())) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" ");
                        stringBuilder.append(C4522p.m8236a(R.string.downloads));
                        a = stringBuilder.toString();
                        if (this.f12360b.f24466H) {
                            a = C2491i.m6814b((String) a);
                        }
                        this.f12360b.f24479t.setText(a);
                    }
                    C2475a.m6719a(StickerDetailsActivity.m21426C(this.f12360b), c2586d.f8438e);
                    C1274i a2 = C1212c.m2875b(this.f12360b.getApplicationContext()).m10950a(C4515k.m8231a(c2586d.f8439f));
                    a2.f3986c = this.f12360b.f24467I;
                    a2.m3034a(C1248f.m2945b().m2955b(C1144h.f3692d)).m3033a().m3031a(this.f12360b.f24476q);
                    C1212c.m2873a(StickerDetailsActivity.m21430G(this.f12360b)).m10958e().m3037a(C4515k.m8231a(c2586d.f8440g)).m3032a(new C7408b(this, this.f12360b.f24477r) {
                        final /* synthetic */ AnonymousClass11 f23874b;

                        public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                            Bitmap bitmap = (Bitmap) obj;
                            super.mo3320a(bitmap, c1242b);
                            StickerDetailsActivity.m21433a(this.f23874b.f12360b, (double) (bitmap.getHeight() / bitmap.getWidth()));
                        }
                    });
                }
            });
        }
    }

    public void onEvent(final C2589g c2589g) {
        if (this.f24483z != null) {
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ StickerDetailsActivity f12362b;

                public final void run() {
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_delete) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10);
            b_(bundle);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
