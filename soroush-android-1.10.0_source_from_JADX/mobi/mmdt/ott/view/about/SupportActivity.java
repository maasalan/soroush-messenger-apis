package mobi.mmdt.ott.view.about;

import android.os.Bundle;
import android.view.MenuItem;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p402d.C7576b;

public class SupportActivity extends C7576b {
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_about);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
