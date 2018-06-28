package mobi.mmdt.ott.view.components.mediaselector;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.C0390k;
import android.support.v4.app.C4784n;
import android.support.v4.app.Fragment;
import android.support.v4.view.C0565n;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.mediaselector.C7182b.C7331b;
import mobi.mmdt.ott.view.components.mediaselector.C7183c.C3212b;
import mobi.mmdt.ott.view.components.mediaselector.C7184d.C3213b;
import mobi.mmdt.ott.view.components.mediaselector.gifselection.GifSelectorActivity;
import mobi.mmdt.ott.view.components.mediaselector.photoselection.PhotoSelectorActivity;
import mobi.mmdt.ott.view.components.mediaselector.videoselection.VideoSelectorActivity;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public class MainMediaSelectorActivity extends C7576b implements C7331b, C3212b, C3213b {
    private C7183c f24013m;
    private C7184d f24014n;
    private C7182b f24015o;
    private ViewPager f24016p;
    private int f24017q = 2;
    private int f24018r = 10;
    private String f24019s = "Gallery";

    public class C6855a extends C4784n {
        final /* synthetic */ MainMediaSelectorActivity f19555a;

        public C6855a(MainMediaSelectorActivity mainMediaSelectorActivity, C0390k c0390k) {
            this.f19555a = mainMediaSelectorActivity;
            super(c0390k);
        }

        public final Fragment mo3187a(int i) {
            switch (i) {
                case 0:
                    return this.f19555a.f24013m;
                case 1:
                    return this.f19555a.f24015o;
                case 2:
                    return this.f19555a.f24014n;
                default:
                    return this.f19555a.f24013m;
            }
        }

        public final int mo2270b() {
            return this.f19555a.f24017q == 1 ? 3 : (this.f19555a.f24017q != 2 && this.f19555a.f24017q == 3) ? 1 : 1;
        }

        public final CharSequence mo2364b(int i) {
            switch (i) {
                case 0:
                    return C4522p.m8236a(R.string.photos);
                case 1:
                    i = R.string.gifs;
                    break;
                case 2:
                    i = R.string.videos;
                    break;
                default:
                    return C4522p.m8236a(R.string.photos);
            }
            return C4522p.m8236a(i);
        }
    }

    public final void mo3656a(String str, String str2) {
        Intent intent = new Intent(this, PhotoSelectorActivity.class);
        intent.putExtra("KEY_FOLDER_NAME", str2);
        intent.putExtra("KEY_FOLDER_PATH", str);
        intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", this.f24018r);
        intent.putExtra("EXTRA_SELECT_MODE", this.f24017q);
        startActivityForResult(intent, 1818);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final void mo3657b(String str, String str2) {
        Intent intent = new Intent(this, VideoSelectorActivity.class);
        intent.putExtra("KEY_FOLDER_NAME", str2);
        intent.putExtra("KEY_FOLDER_PATH", str);
        startActivityForResult(intent, 1819);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final void mo3658c(String str, String str2) {
        Intent intent = new Intent(this, GifSelectorActivity.class);
        intent.putExtra("KEY_FOLDER_NAME", str2);
        intent.putExtra("KEY_FOLDER_PATH", str);
        startActivityForResult(intent, 1820);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            String str;
            int i3;
            Serializable stringArrayListExtra;
            switch (i) {
                case 1818:
                    stringArrayListExtra = intent.getStringArrayListExtra("KEY_PHOTO_ARRAYLIST_OF_PATH_RESULT");
                    intent = new Intent();
                    intent.putExtra("KEY_RESULT_ARRAYLIST_OF_PATH", stringArrayListExtra);
                    str = "KEY_RESULT_TYPE";
                    i3 = 1;
                    break;
                case 1819:
                    stringArrayListExtra = new ArrayList();
                    stringArrayListExtra.add(intent.getStringExtra("KEY_VIDEO_PATH_RESULT"));
                    intent = new Intent();
                    intent.putExtra("KEY_RESULT_ARRAYLIST_OF_PATH", stringArrayListExtra);
                    str = "KEY_RESULT_TYPE";
                    i3 = 2;
                    break;
                case 1820:
                    stringArrayListExtra = new ArrayList();
                    stringArrayListExtra.add(intent.getStringExtra("KEY_GIF_PATH_RESULT"));
                    intent = new Intent();
                    intent.putExtra("KEY_RESULT_ARRAYLIST_OF_PATH", stringArrayListExtra);
                    intent.putExtra("KEY_RESULT_TYPE", 3);
                    setResult(-1, intent);
                    finish();
                    overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                    return;
                default:
                    return;
            }
            intent.putExtra(str, i3);
            setResult(-1, intent);
            finish();
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main_media_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (C4516l.m8232a() && !C2837a.m7169a()) {
            onBackPressed();
        }
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            bundle = getIntent().getExtras();
            if (bundle.containsKey("EXTRA_SELECT_MODE")) {
                this.f24017q = bundle.getInt("EXTRA_SELECT_MODE");
            }
            if (bundle.containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f24018r = bundle.getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
            if (bundle.containsKey("EXTRA_SELECTOR_TITLE")) {
                this.f24019s = bundle.getString("EXTRA_SELECTOR_TITLE");
            }
        }
        C2475a.m6719a((Activity) this, this.f24019s);
        this.f24013m = new C7183c();
        this.f24015o = new C7182b();
        this.f24014n = new C7184d();
        C0565n c6855a = new C6855a(this, m19188c());
        this.y = findViewById(R.id.shadow_line_top);
        this.f24016p = (ViewPager) findViewById(R.id.pager);
        if (this.f24016p != null) {
            this.f24016p.setAdapter(c6855a);
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.f24016p);
            C2491i.m6796a((View) tabLayout, UIThemeManager.getmInstance().getPrimary_color());
            C2491i.m6792a(tabLayout, UIThemeManager.getmInstance().getTab_not_selected_gray_color(), UIThemeManager.getmInstance().getTab_selected_color());
            AssetManager assets = getAssets();
            StringBuilder stringBuilder = new StringBuilder("fonts/");
            stringBuilder.append(C2535a.m6888a().at());
            Typeface createFromAsset = Typeface.createFromAsset(assets, stringBuilder.toString());
            ViewGroup viewGroup = (ViewGroup) tabLayout.getChildAt(0);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
                int childCount2 = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setTypeface(createFromAsset, 1);
                    }
                }
            }
        }
        if ((this.f24017q == 2 || this.f24017q == 3) && tabLayout != null) {
            tabLayout.setVisibility(8);
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        ((MyApplication) getApplication()).f15913s.clear();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
