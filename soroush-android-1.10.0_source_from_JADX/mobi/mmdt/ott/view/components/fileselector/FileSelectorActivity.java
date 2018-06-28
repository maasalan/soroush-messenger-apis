package mobi.mmdt.ott.view.components.fileselector;

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
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mobi.mmdt.componentsutils.p232b.C2482c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.fileselector.C6090a.C3157c;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4522p;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;

public class FileSelectorActivity extends C7576b implements C3157c {
    public static final HashMap<String, String> f23985m;
    private int f23986n = 1;
    private int f23987o = 10;
    private C6090a f23988p;
    private ActionMode f23989q;
    private String f23990r;
    private String f23991s;
    private boolean f23992t;

    public class C3153a implements Callback {
        final /* synthetic */ FileSelectorActivity f9777a;

        public C3153a(FileSelectorActivity fileSelectorActivity) {
            this.f9777a = fileSelectorActivity;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.action_done) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9777a.m21090i().keySet());
            this.f9777a.m21090i().clear();
            FileSelectorActivity.m21085a(this.f9777a, arrayList);
            return true;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
            return true;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            C6090a b = this.f9777a.f23988p;
            b.f16311c = false;
            if (b.f16309a != null) {
                b.f16309a.notifyDataSetChanged();
            }
            this.f9777a.f23992t = false;
            this.f9777a.m21090i().clear();
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle(this.f9777a.f23990r);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9777a.m21090i().size());
            stringBuilder.append("/");
            stringBuilder.append(this.f9777a.f23987o);
            stringBuilder.append("  selected");
            actionMode.setSubtitle(stringBuilder.toString());
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f23985m = hashMap;
        hashMap.put("jpg", "jpg");
        f23985m.put("jpeg", "jpeg");
        f23985m.put("png", "png");
        f23985m.put("gif", "gif");
        f23985m.put("jp2", "jp2");
        f23985m.put("jpe", "jpe");
        f23985m.put("jfif", "jfif");
        f23985m.put("avi", "avi");
        f23985m.put("mp4", "mp4");
        f23985m.put("3gp", "3gp");
        f23985m.put("flv", "flv");
        f23985m.put("mp3", "mp3");
        f23985m.put("wav", "wav");
        f23985m.put("amr", "amr");
        f23985m.put("ogg", "ogg");
        f23985m.put("vct", "vct");
        f23985m.put("pdf", "pdf");
        f23985m.put("doc", "doc");
        f23985m.put("docx", "docx");
        f23985m.put("xls", "xls");
        f23985m.put("xlsx", "xlsx");
        f23985m.put("ppt", "ppt");
        f23985m.put("pptx", "pptx");
        f23985m.put(Xml.ELEMENT, Xml.ELEMENT);
        f23985m.put("csv", "csv");
        f23985m.put("apk", "apk");
        f23985m.put("zip", "zip");
        f23985m.put("rar", "rar");
        f23985m.put("txt", "txt");
        f23985m.put("vcf", "vcf");
        f23985m.put(UIThemeManager.KEY_THEME_EXTENSION, UIThemeManager.KEY_THEME_EXTENSION);
        f23985m.put(UIThemeManager.KEY_THEME_EXTENSION_V2, UIThemeManager.KEY_THEME_EXTENSION_V2);
        f23985m.put("dll", "dll");
        f23985m.put("mov", "mov");
        f23985m.put("msi", "msi");
    }

    private void m21084a(String str, boolean z) {
        int i;
        int i2;
        Bundle bundle = new Bundle();
        this.f23991s = str;
        if (str != null) {
            this.f23990r = new File(str).getName();
            bundle.putString("KEY_FOLDER_PATH", this.f23991s);
        }
        this.f23988p = new C6090a();
        this.f23988p.setArguments(bundle);
        if (this.f23991s != null && this.f23991s.equals("/")) {
            this.f23990r = "/";
        }
        if (this.f23991s == null) {
            this.f23990r = C4522p.m8236a(R.string.select_file);
        }
        C2475a.m6719a((Activity) this, this.f23990r);
        if (this.f23989q != null) {
            this.f23989q.setTitle(this.f23990r);
        }
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (z) {
            i = R.animator.slide_out_right_anim;
            i2 = R.animator.slide_in_right_anim;
        } else {
            i = R.animator.slide_in_left_anim;
            i2 = R.animator.slide_out_left_anim;
        }
        beginTransaction.setCustomAnimations(i, i2);
        beginTransaction.replace(R.id.container_frame, this.f23988p);
        beginTransaction.commit();
    }

    static /* synthetic */ void m21085a(FileSelectorActivity fileSelectorActivity, ArrayList arrayList) {
        Intent intent = new Intent();
        intent.putExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT", arrayList);
        fileSelectorActivity.setResult(-1, intent);
        fileSelectorActivity.finish();
        fileSelectorActivity.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    private LinkedHashMap<String, Boolean> m21090i() {
        return ((MyApplication) getApplication()).f15914t;
    }

    public final void mo3650a(String str) {
        m21084a(str, false);
    }

    public final void mo3651a(String str, String str2, String str3) {
        Serializable arrayList = new ArrayList();
        Serializable arrayList2 = new ArrayList();
        Serializable arrayList3 = new ArrayList();
        arrayList.add(str);
        arrayList2.add(str2);
        arrayList3.add(str3);
        Intent intent = new Intent();
        intent.putExtra("KEY_FILE_ARRAY_LIST_OF_PATH_RESULT", arrayList);
        intent.putExtra("KEY_FILE_ARRAY_LIST_OF_FILE_NAME_RESULT", arrayList2);
        intent.putExtra("KEY_FILE_ARRAY_LIST_OF_SIZE_RESULT", arrayList3);
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public final void mo3643g() {
        int size = m21090i().size();
        if (size == 0 && this.f23992t) {
            this.f23989q.finish();
        } else if (!this.f23992t) {
            this.f23989q = startActionMode(new C3153a(this));
            this.f23992t = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
        }
        if (this.f23989q != null) {
            if (this.f23988p.f16311c) {
                ActionMode actionMode = this.f23989q;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(size);
                stringBuilder.append("/");
                stringBuilder.append(this.f23987o);
                stringBuilder.append("  selected");
                actionMode.setSubtitle(stringBuilder.toString());
                return;
            }
            this.f23989q.setSubtitle(null);
        }
    }

    public final boolean mo3652h() {
        if (this.f23991s == null) {
            super.onBackPressed();
            setResult(0);
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            return false;
        }
        Iterator it = C2482c.m6743a().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(this.f23991s)) {
                this.f23991s = null;
                m21084a(null, true);
                return true;
            }
        }
        String parent = new File(this.f23991s).getParent();
        if (parent == null) {
            return false;
        }
        m21084a(parent, true);
        return true;
    }

    public void onBackPressed() {
        if (!mo3652h()) {
            super.onBackPressed();
            setResult(0);
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
        }
    }

    protected void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_file_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            extras = getIntent().getExtras();
            if (extras.containsKey("EXTRA_SELECT_MODE")) {
                this.f23986n = extras.getInt("EXTRA_SELECT_MODE");
            }
            if (extras.containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f23987o = extras.getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
        }
        extras = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                extras.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_IS_ACTION_MODE_SHOWING")) {
                this.f23992t = bundle.getBoolean("KEY_IS_ACTION_MODE_SHOWING");
            }
            if (bundle.containsKey("KEY_FOLDER_PATH")) {
                this.f23991s = bundle.getString("KEY_FOLDER_PATH");
            }
        }
        if (this.f23991s == null) {
            this.f23990r = C4522p.m8236a(R.string.select_file);
        }
        if (this.f23991s != null) {
            this.f23990r = new File(this.f23991s).getName();
        }
        extras.putInt("EXTRA_SELECT_MODE", this.f23986n);
        extras.putInt("EXTRA_MAX_PHOTO_SELECT_COUNT", this.f23987o);
        extras.putString("KEY_FOLDER_PATH", this.f23991s);
        this.f23988p = new C6090a();
        this.f23988p.setArguments(extras);
        C2475a.m6719a((Activity) this, this.f23990r);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f23988p);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        if (this.f23992t) {
            this.f23988p.m13756b();
            this.f23989q = startActionMode(new C3153a(this));
            mo3643g();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f23986n != 2) {
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
            this.f23988p.m13756b();
            this.f23989q = startActionMode(new C3153a(this));
            this.f23992t = true;
            ((Vibrator) getApplicationContext().getSystemService("vibrator")).vibrate(50);
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f23988p.f16310b.findFirstCompletelyVisibleItemPosition());
        bundle.putBoolean("KEY_IS_ACTION_MODE_SHOWING", this.f23992t);
        bundle.putString("KEY_FOLDER_PATH", this.f23991s);
    }
}
