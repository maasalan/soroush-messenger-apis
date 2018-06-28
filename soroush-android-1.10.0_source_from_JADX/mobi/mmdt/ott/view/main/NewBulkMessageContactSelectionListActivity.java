package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.Menu;
import android.view.MenuItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.contact.p415a.C7696b;
import mobi.mmdt.ott.view.conversation.activities.C3383b;
import mobi.mmdt.ott.view.conversation.activities.ConversationActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class NewBulkMessageContactSelectionListActivity extends C7696b {
    public void onCreate(Bundle bundle) {
        if (MyApplication.m12950a().f15912r.isEmpty() && getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().containsKey("KEY_CHECKED_USERNAME_ARRAYLIST")) {
            ArrayList stringArrayList = getIntent().getExtras().getStringArrayList("KEY_CHECKED_USERNAME_ARRAYLIST");
            if (stringArrayList != null) {
                this.n = true;
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    MyApplication.m12950a().f15912r.put((String) it.next(), Boolean.valueOf(true));
                }
            }
        }
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        Serializable h = C7696b.m21195h();
        if (this.n) {
            mo3643g();
            Intent intent = new Intent();
            intent.putExtra("KEY_PEER_PARTIES_ARRAYLIST", h);
            setResult(-1, intent);
            finish();
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            return true;
        }
        if (h.size() > 0) {
            mo3643g();
            intent = new Intent(this, ConversationActivity.class);
            intent.putExtra("KEY_START_KIND", C3383b.f10382d - 1);
            intent.putExtra("KEY_PEER_PARTIES_ARRAYLIST", h);
            if (this != null) {
                startActivity(intent);
                C4478a.m8161b((Activity) this, true);
                C4478a.m8165c((Activity) this, true);
                return true;
            }
        }
        Snackbar.m8770a(this.m, C4522p.m8236a(R.string.no_contacts_selected), -1).m572a();
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.new_bulk_message));
    }
}
