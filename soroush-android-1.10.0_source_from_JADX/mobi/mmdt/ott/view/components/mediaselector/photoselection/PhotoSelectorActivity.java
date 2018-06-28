package mobi.mmdt.ott.view.components.mediaselector.photoselection;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.mediaselector.photoselection.C6110b.C3220b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public class PhotoSelectorActivity extends C7576b implements C3220b {
    private int f24027m = 2;
    private int f24028n = 10;
    private int f24029o = 0;
    private C6110b f24030p;
    private ActionMode f24031q;
    private String f24032r;
    private boolean f24033s;
    private String f24034t;

    public class C3217a implements Callback {
        final /* synthetic */ PhotoSelectorActivity f9949a;

        public C3217a(PhotoSelectorActivity photoSelectorActivity) {
            this.f9949a = photoSelectorActivity;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.action_done) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9949a.m21133h().keySet());
            this.f9949a.m21133h().clear();
            this.f9949a.m21128a(arrayList);
            return true;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
            return true;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            C6110b b = this.f9949a.f24030p;
            b.f16398c = false;
            if (b.f16396a != null) {
                b.f16396a.notifyDataSetChanged();
            }
            this.f9949a.f24033s = false;
            this.f9949a.m21133h().clear();
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle(this.f9949a.f24032r);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9949a.m21133h().size());
            stringBuilder.append("  ");
            stringBuilder.append(C4522p.m8236a(R.string.selected));
            actionMode.setSubtitle(stringBuilder.toString());
            return false;
        }
    }

    private void m21128a(ArrayList<String> arrayList) {
        Intent intent = new Intent();
        intent.putExtra("KEY_PHOTO_ARRAYLIST_OF_PATH_RESULT", arrayList);
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    private LinkedHashMap<String, Boolean> m21133h() {
        return ((MyApplication) getApplication()).f15913s;
    }

    public final void mo3660a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m21128a(arrayList);
    }

    public final void mo3643g() {
        int size = m21133h().size();
        if (size == 0 && this.f24033s) {
            this.f24031q.finish();
        } else if (!this.f24033s) {
            this.f24031q = startActionMode(new C3217a(this));
            this.f24033s = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
        }
        if (this.f24031q != null) {
            if (this.f24030p.f16398c) {
                ActionMode actionMode;
                CharSequence b;
                StringBuilder stringBuilder;
                if (this.f24034t.equals("fa")) {
                    actionMode = this.f24031q;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(size);
                    stringBuilder.append("  ");
                    stringBuilder.append(C4522p.m8236a(R.string.selected));
                    b = C2491i.m6814b(stringBuilder.toString());
                } else {
                    actionMode = this.f24031q;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(size);
                    stringBuilder.append("  ");
                    stringBuilder.append(C4522p.m8236a(R.string.selected));
                    b = stringBuilder.toString();
                }
                actionMode.setSubtitle(b);
                return;
            }
            this.f24031q.setSubtitle(null);
        }
    }

    public void onBackPressed() {
        if (this.f24033s) {
            m21133h().clear();
            this.f24031q.finish();
            return;
        }
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_media_photo_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (C4516l.m8232a() && !C2837a.m7169a()) {
            onBackPressed();
        }
        this.f24034t = C2535a.m6888a().m6919b();
        this.y = findViewById(R.id.shadow_line_top);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            extras = getIntent().getExtras();
            if (extras.containsKey("EXTRA_SELECT_MODE")) {
                this.f24027m = extras.getInt("EXTRA_SELECT_MODE");
            }
            if (extras.containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f24028n = extras.getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
        }
        extras = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                extras.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_IS_ACTION_MODE_SHOWING")) {
                this.f24033s = bundle.getBoolean("KEY_IS_ACTION_MODE_SHOWING");
            }
        }
        this.f24032r = getIntent().getStringExtra("KEY_FOLDER_NAME");
        String stringExtra = getIntent().getStringExtra("KEY_FOLDER_PATH");
        extras.putInt("EXTRA_SELECT_MODE", this.f24027m);
        extras.putInt("EXTRA_MAX_PHOTO_SELECT_COUNT", this.f24028n);
        extras.putString("KEY_FOLDER_NAME", this.f24032r);
        extras.putString("KEY_FOLDER_PATH", stringExtra);
        this.f24030p = new C6110b();
        this.f24030p.setArguments(extras);
        C2475a.m6719a((Activity) this, this.f24032r);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24030p);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        if (this.f24033s) {
            this.f24030p.m13841b();
            this.f24031q = startActionMode(new C3217a(this));
            mo3643g();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f24027m != 2) {
            getMenuInflater().inflate(R.menu.menu_photo_selector, menu);
            C2491i.m6790a(menu.findItem(R.id.action_checkable_items).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_checkable_items) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.f24030p.m13841b();
            this.f24031q = startActionMode(new C3217a(this));
            this.f24033s = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f24030p.f16397b.findFirstCompletelyVisibleItemPosition());
        bundle.putBoolean("KEY_IS_ACTION_MODE_SHOWING", this.f24033s);
    }
}
