package mobi.mmdt.ott.view.settings.forceupdate;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C4767a;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.forceupdate.ForceUpdateFragment.C4373a;
import mobi.mmdt.ott.view.tools.C4522p;

public class ForceUpdateActivity extends C7576b implements C4373a {
    protected RelativeLayout f24431m;
    private ForceUpdateFragment f24432n;

    public final void mo3643g() {
        Intent intent = new Intent("android.intent.action.VIEW");
        StringBuilder stringBuilder = new StringBuilder("market://details?id=");
        stringBuilder.append(getApplicationContext().getPackageName());
        intent.setData(Uri.parse(stringBuilder.toString()));
        startActivity(intent);
        C4767a.m8920a(this);
        overridePendingTransition(0, 0);
    }

    public final void mo3681h() {
        C4258b.m8066a(this);
        System.exit(0);
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_force_update);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(false, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.force_update));
        this.f24431m = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24432n = (ForceUpdateFragment) getFragmentManager().findFragmentById(R.id.force_update_fragment);
        if (!(this.f24432n == null || this.f24432n.isDetached())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.detach(this.f24432n);
            beginTransaction.commit();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
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
}
