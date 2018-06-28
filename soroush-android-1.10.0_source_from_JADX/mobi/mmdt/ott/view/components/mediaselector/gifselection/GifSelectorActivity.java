package mobi.mmdt.ott.view.components.mediaselector.gifselection;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.mediaselector.gifselection.C6109a.C3216b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4516l;

public class GifSelectorActivity extends C7576b implements C3216b {
    private int f24020m = 2;
    private int f24021n = 10;
    private int f24022o = 0;
    private C6109a f24023p;
    private String f24024q;
    private boolean f24025r;
    private String f24026s;

    public final void mo3659a(String str) {
        Intent intent = new Intent();
        intent.putExtra("KEY_GIF_PATH_RESULT", str);
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_media_gif_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (C4516l.m8232a() && !C2837a.m7169a()) {
            onBackPressed();
        }
        this.f24026s = C2535a.m6888a().m6919b();
        this.y = findViewById(R.id.shadow_line_top);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            extras = getIntent().getExtras();
            if (extras.containsKey("EXTRA_SELECT_MODE")) {
                this.f24020m = extras.getInt("EXTRA_SELECT_MODE");
            }
        }
        extras = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                extras.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_IS_ACTION_MODE_SHOWING")) {
                this.f24025r = bundle.getBoolean("KEY_IS_ACTION_MODE_SHOWING");
            }
        }
        this.f24024q = getIntent().getStringExtra("KEY_FOLDER_NAME");
        String stringExtra = getIntent().getStringExtra("KEY_FOLDER_PATH");
        extras.putInt("EXTRA_SELECT_MODE", this.f24020m);
        extras.putInt("EXTRA_MAX_PHOTO_SELECT_COUNT", this.f24021n);
        extras.putString("KEY_FOLDER_NAME", this.f24024q);
        extras.putString("KEY_FOLDER_PATH", stringExtra);
        this.f24023p = new C6109a();
        this.f24023p.setArguments(extras);
        C2475a.m6719a((Activity) this, this.f24024q);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24023p);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
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
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f24023p.f16382a.findFirstCompletelyVisibleItemPosition());
        bundle.putBoolean("KEY_IS_ACTION_MODE_SHOWING", this.f24025r);
    }
}
