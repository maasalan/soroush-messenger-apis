package mobi.mmdt.ott.view.conversation.sharedmediaviewer;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.C6221a.C6914a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class SharedMediaViewerActivity extends C7576b implements C6914a {
    private C6221a f24346m;
    private String f24347n;
    private String f24348o;
    private String f24349p;
    private C2973m f24350q;

    public final void mo3668a(String str) {
        if (new File(Uri.parse(str).getPath()).exists()) {
            C4478a.m8148a((Activity) this, str, this.f24348o, this.f24350q, this.f24347n);
            return;
        }
        C2984c.m7457a(str, C2987i.NOT_STARTED);
        Toast.makeText(this, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo3669b(String str) {
        if (new File(Uri.parse(str).getPath()).exists()) {
            C4478a.m8158b((Activity) this, str);
            return;
        }
        C2984c.m7457a(str, C2987i.NOT_STARTED);
        Toast.makeText(this, C4522p.m8236a(R.string.file_not_exists), 0).show();
    }

    public final void mo3670c(int i) {
        String b;
        String a = C4522p.m8236a(R.string.item);
        String a2 = C4522p.m8236a(R.string.items);
        if (i > 1) {
            a = a2;
        }
        StringBuilder stringBuilder;
        if (this.f24349p.equals("fa")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(a);
            b = C2491i.m6814b(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(a);
            b = stringBuilder.toString();
        }
        C2475a.m6721b(this, b);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_shared_media_viewer);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        Bundle bundle2 = new Bundle();
        if (bundle != null && bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
            bundle2.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
        }
        this.f24349p = C2535a.m6888a().m6919b();
        this.y = findViewById(R.id.shadow_line_top);
        this.f24347n = getIntent().getStringExtra("KEY_TITLE_TEXT");
        this.f24348o = getIntent().getStringExtra("KEY_PEER_PARTY");
        this.f24350q = C2973m.values()[getIntent().getIntExtra("KEY_GROUP_TYPE", 0)];
        bundle2.putString("KEY_TITLE_TEXT", this.f24347n);
        bundle2.putString("KEY_PEER_PARTY", this.f24348o);
        this.f24346m = new C6221a();
        this.f24346m.setArguments(bundle2);
        C2475a.m6719a((Activity) this, this.f24349p.equals("fa") ? C2491i.m6814b(this.f24347n) : this.f24347n);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24346m);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m20725t();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f24346m.f16838a.findFirstCompletelyVisibleItemPosition());
    }
}
