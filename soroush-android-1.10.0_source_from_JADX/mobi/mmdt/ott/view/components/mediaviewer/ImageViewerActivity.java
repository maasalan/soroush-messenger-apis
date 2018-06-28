package mobi.mmdt.ott.view.components.mediaviewer;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.C7249g;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import uk.co.a.a.d;
import uk.co.a.a.d.f;

public class ImageViewerActivity extends C7576b {
    boolean f24037m = false;
    private ViewGroup f24038n;
    private ImageView f24039o;
    private ImageView f24040p;
    private String f24041q;
    private String f24042r;
    private ProgressWheel f24043s;

    class C61131 implements C1247e<Drawable> {
        final /* synthetic */ ImageViewerActivity f16419a;

        class C32231 implements Runnable {
            final /* synthetic */ C61131 f9954a;

            C32231(C61131 c61131) {
                this.f9954a = c61131;
            }

            public final void run() {
                Snackbar.m8770a(this.f9954a.f16419a.f24038n, C4522p.m8236a(R.string.connection_error_message), -2).m572a();
            }
        }

        class C61122 implements f {
            final /* synthetic */ C61131 f16418a;

            C61122(C61131 c61131) {
                this.f16418a = c61131;
            }

            public final void m13851a() {
                if (this.f16418a.f16419a.x != null) {
                    if (this.f16418a.f16419a.x.isShown()) {
                        this.f16418a.f16419a.x.setVisibility(8);
                        return;
                    }
                    this.f16418a.f16419a.x.setAnimation(AnimationUtils.loadAnimation(this.f16418a.f16419a.getApplicationContext(), R.anim.anim_fade_in_activity_theme_dialog));
                    this.f16418a.f16419a.x.setVisibility(0);
                }
            }
        }

        C61131(ImageViewerActivity imageViewerActivity) {
            this.f16419a = imageViewerActivity;
        }

        public final boolean mo2229a() {
            if (ImageViewerActivity.m21137a(this.f16419a) != null) {
                this.f16419a.runOnUiThread(new C32231(this));
            }
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16419a.f24037m = true;
            d dVar = new d(this.f16419a.f24039o);
            dVar.h = new C61122(this);
            dVar.d();
            this.f16419a.f24043s.setVisibility(8);
            return false;
        }
    }

    static /* synthetic */ C7406c m21137a(ImageViewerActivity imageViewerActivity) {
        return imageViewerActivity;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_imageviewer);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2475a.m6720a(getWindow(), C0346c.m687c(this, R.color.colorTransparentToolbarBackground));
        C2475a.m6719a((Activity) this, "Photo");
        this.f24038n = (ViewGroup) findViewById(R.id.root_layout);
        this.f24039o = (ImageView) findViewById(R.id.imageView);
        this.f24040p = (ImageView) findViewById(R.id.thumbnail_imageView);
        this.f24043s = (ProgressWheel) findViewById(R.id.progress_wheel);
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.f24041q = getIntent().getExtras().getString("KEY_MEDIA_PATH");
            this.f24042r = getIntent().getExtras().getString("KEY_THUMBNAIL_IMAGE_PATH", "");
            C2475a.m6719a((Activity) this, getIntent().getExtras().getString("KEY_TITLE"));
            C1274i a = C1212c.m2873a((C7249g) this).m10950a(C4515k.m8231a(C2556b.m6998a(this.f24042r))).m3034a(new C1248f().m2955b(C1144h.f3689a));
            C1274i a2 = C1212c.m2873a((C7249g) this).m10950a(C4515k.m8231a(C2556b.m6998a(this.f24041q)));
            a2.f3987d = a;
            a = a2.m3034a(new C1248f().m2955b(C1144h.f3692d));
            a.f3986c = new C61131(this);
            a.m3031a(this.f24039o);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }
}
