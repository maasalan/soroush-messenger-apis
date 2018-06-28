package mobi.mmdt.ott.view.settings;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.settings.mainsettings.C4377b;

public abstract class C7722a extends C7576b implements C4369c, C4377b {
    protected C6260b f24428m;
    protected ViewGroup f24429n;
    protected TextView f24430o;

    public abstract void mo3705c(int i);

    public final void mo3680d(int i) {
        mo3705c(i);
    }

    public abstract String mo3643g();

    public abstract C6260b mo3706h();

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_settings_list);
        this.f24429n = (ViewGroup) findViewById(R.id.root_layout);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24430o = (TextView) findViewById(R.id.version_text);
        C2491i.m6802a(this.f24430o, UIThemeManager.getmInstance().getText_secondary_color());
        if (this.f24428m == null) {
            this.f24428m = mo3706h();
        }
        if (!this.f24428m.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24428m);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, mo3643g());
    }
}
