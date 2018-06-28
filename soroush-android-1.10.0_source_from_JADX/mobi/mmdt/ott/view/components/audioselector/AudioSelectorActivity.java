package mobi.mmdt.ott.view.components.audioselector;

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
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.audioselector.C6059a.C3105b;
import mobi.mmdt.ott.view.components.p402d.C7576b;

public class AudioSelectorActivity extends C7576b implements C3105b {
    private int f23980m = 1;
    private C6059a f23981n;
    private int f23982o = 10;
    private boolean f23983p;
    private ActionMode f23984q;

    public class C3104a implements Callback {
        final /* synthetic */ AudioSelectorActivity f9670a;

        public C3104a(AudioSelectorActivity audioSelectorActivity) {
            this.f9670a = audioSelectorActivity;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.action_done) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9670a.m21080h().keySet());
            this.f9670a.m21080h().clear();
            this.f9670a.m21075a(arrayList);
            return true;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
            return true;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            C6059a b = this.f9670a.f23981n;
            b.f16215c = false;
            if (b.f16213a != null) {
                b.f16213a.notifyDataSetChanged();
            }
            this.f9670a.f23983p = false;
            this.f9670a.m21080h().clear();
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle(R.string.action_music);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9670a.m21080h().size());
            stringBuilder.append("/");
            stringBuilder.append(this.f9670a.f23982o);
            stringBuilder.append("  selected");
            actionMode.setSubtitle(stringBuilder.toString());
            return false;
        }
    }

    private void m21075a(ArrayList<String> arrayList) {
        Intent intent = new Intent();
        intent.putExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT", arrayList);
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    private LinkedHashMap<String, Boolean> m21080h() {
        return ((MyApplication) getApplication()).f15914t;
    }

    public final void mo3649a(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder(" >>>> filePath : ");
        stringBuilder.append(str);
        C2480b.m6742f(stringBuilder.toString());
        arrayList.add(str);
        m21075a(arrayList);
    }

    public final void mo3643g() {
        int size = m21080h().size();
        if (size == 0 && this.f23983p) {
            this.f23984q.finish();
        } else if (!this.f23983p) {
            this.f23984q = startActionMode(new C3104a(this));
            this.f23983p = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
        }
        if (this.f23984q != null) {
            if (this.f23981n.f16215c) {
                ActionMode actionMode = this.f23984q;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(size);
                stringBuilder.append("/");
                stringBuilder.append(this.f23982o);
                stringBuilder.append("  selected");
                actionMode.setSubtitle(stringBuilder.toString());
                return;
            }
            this.f23984q.setSubtitle(null);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_audio_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        setTitle(R.string.action_music);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            extras = getIntent().getExtras();
            if (extras.containsKey("EXTRA_SELECT_MODE")) {
                this.f23980m = extras.getInt("EXTRA_SELECT_MODE");
            }
            if (extras.containsKey("EXTRA_MAX_AUDIO_SELECT_COUNT")) {
                this.f23982o = extras.getInt("EXTRA_MAX_AUDIO_SELECT_COUNT");
            }
        }
        extras = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                extras.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_IS_ACTION_MODE_SHOWING")) {
                this.f23983p = bundle.getBoolean("KEY_IS_ACTION_MODE_SHOWING");
            }
        }
        extras.putInt("EXTRA_SELECT_MODE", this.f23980m);
        extras.putInt("EXTRA_MAX_AUDIO_SELECT_COUNT", this.f23982o);
        this.f23981n = new C6059a();
        this.f23981n.setArguments(extras);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f23981n);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        if (this.f23983p) {
            this.f23981n.m13642a();
            this.f23984q = startActionMode(new C3104a(this));
            mo3643g();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f23980m != 2) {
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
            this.f23981n.m13642a();
            this.f23984q = startActionMode(new C3104a(this));
            this.f23983p = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
            return true;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f23981n.f16214b.findFirstCompletelyVisibleItemPosition());
        bundle.putBoolean("KEY_IS_ACTION_MODE_SHOWING", this.f23983p);
    }
}
