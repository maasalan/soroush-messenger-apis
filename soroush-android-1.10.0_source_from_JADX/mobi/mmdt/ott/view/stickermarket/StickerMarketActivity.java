package mobi.mmdt.ott.view.stickermarket;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v13.app.C4760b;
import android.support.v4.view.C0565n;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.stickermarket.C6269a.C6987a;
import mobi.mmdt.ott.view.stickermarket.StickerMarketTopFragment.C4454a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class StickerMarketActivity extends C7576b implements C4454a, C6987a {
    private ViewPager f24484m;
    private ViewGroup f24485n;
    private C6269a f24486o;
    private C6269a f24487p;
    private C6269a f24488q;
    private boolean f24489r;
    private View f24490s;

    class C44511 implements Runnable {
        final /* synthetic */ StickerMarketActivity f12372a;

        C44511(StickerMarketActivity stickerMarketActivity) {
            this.f12372a = stickerMarketActivity;
        }

        public final void run() {
            if (this.f12372a.f24486o != null) {
                this.f12372a.f24486o.m14641a();
            }
            if (this.f12372a.f24487p != null) {
                this.f12372a.f24487p.m14641a();
            }
            if (this.f12372a.f24488q != null) {
                this.f12372a.f24488q.m14641a();
            }
            if (this.f12372a.f24487p != null) {
                this.f12372a.f24487p.m14641a();
            }
            this.f12372a.f24489r = false;
        }
    }

    public class C6985a extends C4760b {
        final /* synthetic */ StickerMarketActivity f19940a;

        public C6985a(StickerMarketActivity stickerMarketActivity, FragmentManager fragmentManager) {
            this.f19940a = stickerMarketActivity;
            super(fragmentManager);
        }

        public final Fragment mo3253a(int i) {
            switch (i) {
                case 0:
                    if (this.f19940a.f24486o == null) {
                        this.f19940a.f24486o = C6269a.m14632a(C4462b.f12383a, "");
                    }
                    return this.f19940a.f24486o;
                case 1:
                    if (this.f19940a.f24487p == null) {
                        this.f19940a.f24487p = C6269a.m14632a(C4462b.f12384b, "");
                    }
                    return this.f19940a.f24487p;
                default:
                    if (this.f19940a.f24486o == null) {
                        this.f19940a.f24486o = C6269a.m14632a(C4462b.f12383a, "");
                    }
                    return this.f19940a.f24486o;
            }
        }

        public final int mo2270b() {
            return 2;
        }

        public final CharSequence mo2364b(int i) {
            switch (i) {
                case 0:
                    i = R.string.market_new;
                    break;
                case 1:
                    i = R.string.market_top;
                    break;
                default:
                    return String.valueOf(i);
            }
            return C4522p.m8236a(i);
        }
    }

    public final void mo3687a(int i, String str, String str2, String str3) {
        int i2;
        boolean z = getResources().getBoolean(R.bool.xlarge);
        Intent intent = !z ? new Intent(getApplicationContext(), StickerDetailsActivity.class) : new Intent(getApplicationContext(), StickerDetailsActivityThemeDialog.class);
        intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_ID", i);
        intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_NAME", str);
        intent.putExtra("StickerDetailsActivity.KEY_DOWNLOAD_COUNT", str2);
        intent.putExtra("StickerDetailsActivity.KEY_PRICE", str3);
        if (z) {
            startActivity(intent);
            i = R.anim.anim_fade_in_activity_theme_dialog;
            i2 = R.anim.anim_fade_out_activity_theme_dialog;
        } else {
            startActivity(intent);
            i = R.anim.anim_slide_in_left;
            i2 = R.anim.anim_slide_out_left;
        }
        overridePendingTransition(i, i2);
    }

    public final void mo3688a(String str, String str2) {
        Intent intent = new Intent(getApplicationContext(), StickerCategoryActivity.class);
        intent.putExtra("StickerCategoryActivity.KEY_CATEGORY_ID", str);
        intent.putExtra("StickerCategoryActivity.KEY_CATEGORY_NAME", str2);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final void mo3643g() {
        final Runnable c44511 = new C44511(this);
        Snackbar a = Snackbar.m8770a(this.f24485n, C4522p.m8236a(R.string.connection_error_message), -2);
        a.m8771a(new OnClickListener(this) {
            final /* synthetic */ StickerMarketActivity f12374b;

            public final void onClick(View view) {
                c44511.run();
            }
        });
        if (!this.f24489r) {
            this.f24489r = true;
            a.m572a();
        }
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_sticker_market);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.sticker_market));
        C0565n c6985a = new C6985a(this, getFragmentManager());
        this.f24485n = (ViewGroup) findViewById(R.id.root_relativeLayout);
        this.f24490s = findViewById(R.id.line_below_tabLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24484m = (ViewPager) findViewById(R.id.pager);
        if (this.f24484m != null) {
            this.f24484m.setAdapter(c6985a);
            this.f24484m.setOffscreenPageLimit(5);
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.f24484m);
            C2491i.m6792a(tabLayout, UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color());
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
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        C2491i.m6796a(this.f24490s, UIThemeManager.getmInstance().getAccent_color());
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sticker_market, menu);
        MenuItem findItem = menu.findItem(R.id.action_sticker_settings);
        findItem.setTitle(C4522p.m8236a(R.string.action_sticker_settings));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_sticker_settings) {
            C4478a.m8157b(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
