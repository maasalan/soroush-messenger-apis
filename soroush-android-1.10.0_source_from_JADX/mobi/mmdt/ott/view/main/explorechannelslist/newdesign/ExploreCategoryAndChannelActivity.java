package mobi.mmdt.ott.view.main.explorechannelslist.newdesign;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.explorechannelslist.C6926a;
import mobi.mmdt.ott.view.tools.C4514j;

public class ExploreCategoryAndChannelActivity extends C7576b {
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_explore_category_channel);
        bundle = getIntent() != null ? getIntent().getExtras() : null;
        int i = (bundle == null || !bundle.containsKey("KEY_CATEGORY_ID")) ? -1 : bundle.getInt("KEY_CATEGORY_ID");
        String string = (bundle == null || !bundle.containsKey("KEY_CATEGORY_NAME_ID")) ? "" : bundle.getString("KEY_CATEGORY_NAME_ID");
        String string2 = (bundle == null || !bundle.containsKey("KEY_CATEGORY_IMAGE")) ? "" : bundle.getString("KEY_CATEGORY_IMAGE");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("KEY_CATEGORY_ID", i);
        bundle2.putString("KEY_CATEGORY_NAME_ID", string);
        bundle2.putString("KEY_CATEGORY_IMAGE", string2);
        Fragment c6926a = new C6926a();
        c6926a.setArguments(bundle2);
        C4514j.m8229a(this, c6926a, "", R.id.root_frame_layout, false);
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
