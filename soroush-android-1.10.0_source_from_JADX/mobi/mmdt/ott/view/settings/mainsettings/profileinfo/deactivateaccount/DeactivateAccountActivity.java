package mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p332z.p333a.p334a.C2767a;
import mobi.mmdt.ott.logic.p261a.p332z.p333a.p334a.C5971b;
import mobi.mmdt.ott.logic.p261a.p332z.p333a.p335b.C6793a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount.DeactivateAccountFragment.C4438a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class DeactivateAccountActivity extends C7576b implements C4438a {
    protected RelativeLayout f24455m;

    static /* synthetic */ C7406c m21415a(DeactivateAccountActivity deactivateAccountActivity) {
        return deactivateAccountActivity;
    }

    static /* synthetic */ C7406c m21416b(DeactivateAccountActivity deactivateAccountActivity) {
        return deactivateAccountActivity;
    }

    public final void mo3643g() {
        final C1063i c6793a = new C6793a();
        C2808d.m7147a(c6793a);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ DeactivateAccountActivity f12348b;

            public final void run() {
                C4501c.m8189a().m8192a(DeactivateAccountActivity.m21415a(this.f12348b), c6793a);
            }
        });
    }

    public final void mo3686h() {
        onBackPressed();
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_deactivate_account);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.deactivate_account));
        this.f24455m = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        DeactivateAccountFragment deactivateAccountFragment = (DeactivateAccountFragment) getFragmentManager().findFragmentById(R.id.deactivate_account_fragment);
        if (!(deactivateAccountFragment == null || deactivateAccountFragment.isDetached())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.detach(deactivateAccountFragment);
            beginTransaction.commit();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(C2767a c2767a) {
        C4258b.m8066a(this);
    }

    public void onEvent(final C5971b c5971b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ DeactivateAccountActivity f12350b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(DeactivateAccountActivity.m21416b(this.f12350b), c5971b.f8890a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
