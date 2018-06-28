package mobi.mmdt.ott.view.stickermarket;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.stickermarket.C6269a.C6987a;
import mobi.mmdt.ott.view.tools.C4522p;

public class StickerCategoryActivity extends C7576b implements C6987a {
    private C6269a f24456m;
    private ViewGroup f24457n;
    private boolean f24458o;

    class C44391 implements Runnable {
        final /* synthetic */ StickerCategoryActivity f12353a;

        C44391(StickerCategoryActivity stickerCategoryActivity) {
            this.f12353a = stickerCategoryActivity;
        }

        public final void run() {
            if (this.f12353a.f24456m != null) {
                this.f12353a.f24456m.m14641a();
            }
            this.f12353a.f24458o = false;
        }
    }

    public final void mo3687a(int i, String str, String str2, String str3) {
        Intent intent = new Intent(getApplicationContext(), StickerDetailsActivity.class);
        intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_ID", i);
        intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_NAME", str);
        intent.putExtra("StickerDetailsActivity.KEY_DOWNLOAD_COUNT", str2);
        intent.putExtra("StickerDetailsActivity.KEY_PRICE", str3);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final void mo3688a(String str, String str2) {
    }

    public final void mo3643g() {
        final Runnable c44391 = new C44391(this);
        Snackbar a = Snackbar.m8770a(this.f24457n, C4522p.m8236a(R.string.connection_error_message), -2);
        a.m8771a(new OnClickListener(this) {
            final /* synthetic */ StickerCategoryActivity f12355b;

            public final void onClick(View view) {
                c44391.run();
            }
        });
        if (!this.f24458o) {
            this.f24458o = true;
            a.m572a();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_category);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        String stringExtra = getIntent().getStringExtra("StickerCategoryActivity.KEY_CATEGORY_ID");
        String stringExtra2 = getIntent().getStringExtra("StickerCategoryActivity.KEY_CATEGORY_NAME");
        this.y = findViewById(R.id.shadow_line_top);
        C2475a.m6719a((Activity) this, stringExtra2);
        this.f24457n = (ViewGroup) findViewById(R.id.root_relativeLayout);
        this.f24456m = C6269a.m14632a(C4462b.f12387e, stringExtra);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24456m);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
