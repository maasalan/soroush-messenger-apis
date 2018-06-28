package mobi.mmdt.ott.view.registeration.notauthorize;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C6713f;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.registeration.introduction.IntroductionActivity;
import mobi.mmdt.ott.view.registeration.notauthorize.NotAuthorizeFragment.C4311a;
import mobi.mmdt.ott.view.tools.C4522p;

public class NotAuthorizeActivity extends C7576b implements C4311a {
    protected RelativeLayout f24424m;
    private NotAuthorizeFragment f24425n;

    public final void mo3643g() {
        startActivity(new Intent(this, IntroductionActivity.class));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        finish();
        C2808d.m7148b(new C6713f());
    }

    public final void mo3678h() {
        C4258b.m8066a(this);
        System.exit(0);
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_not_authorize);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(false, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.not_authorize_activity));
        this.f24424m = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24425n = (NotAuthorizeFragment) getFragmentManager().findFragmentById(R.id.inactive_fragment);
        if (!(this.f24425n == null || this.f24425n.isDetached())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.detach(this.f24425n);
            beginTransaction.commit();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
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
