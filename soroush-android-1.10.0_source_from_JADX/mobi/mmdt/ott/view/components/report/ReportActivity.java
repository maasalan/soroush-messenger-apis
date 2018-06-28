package mobi.mmdt.ott.view.components.report;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.LinearLayout;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4522p;

public class ReportActivity extends C7576b {
    private LinearLayout f24063m;
    private C6118a f24064n;

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_report);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.y = findViewById(R.id.shadow_line_top);
        this.f24063m = (LinearLayout) findViewById(R.id.root_linearLayout);
        bundle = new Bundle();
        String str = "";
        C2973m c2973m = null;
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            if (getIntent().getExtras().containsKey("KEY_PEER_PARTY")) {
                bundle.putString("KEY_BUNDLE_PEER_PARTY", getIntent().getExtras().getString("KEY_PEER_PARTY"));
            }
            if (getIntent().getExtras().containsKey("KEY_NAME_CONVERSATION")) {
                str = getIntent().getExtras().getString("KEY_NAME_CONVERSATION");
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_TYPE")) {
                c2973m = C2973m.values()[getIntent().getIntExtra("KEY_GROUP_TYPE", 0)];
                bundle.putInt("KEY_BUNDLE_GROUP_TYPE", c2973m.ordinal());
            }
        }
        if (this.f24064n == null) {
            this.f24064n = new C6118a();
            this.f24064n.setArguments(bundle);
        }
        if (!this.f24064n.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24064n);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        String str2 = "";
        if (c2973m != null) {
            int i;
            switch (c2973m) {
                case SINGLE:
                    i = R.string.cap_contact;
                    break;
                case GROUP:
                    i = R.string.cap_group;
                    break;
                case CHANNEL:
                case CHANNEL_DIRECT:
                case CHANNEL_REPLY:
                    i = R.string.cap_channel;
                    break;
                default:
                    break;
            }
            str2 = C4522p.m8236a(i);
        }
        C2475a.m6719a((Activity) this, getString(R.string.title_report_activity, new Object[]{str2, str}));
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
}
