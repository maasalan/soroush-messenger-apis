package mobi.mmdt.ott.view.stickermarket.stickersettings;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.cocosw.bottomsheet.C1287c.C1286a;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6651b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.stickermarket.stickersettings.C6271b.C7231a;
import mobi.mmdt.ott.view.stickermarket.stickersettings.p589b.C7394b;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4522p;

public class StickerSettingsActivity extends C7576b implements C3101a, C4467a, C7231a {
    private ViewGroup f24491m;
    private C6271b f24492n;

    public final Dialog mo2299a(final Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 10) {
            final int i2 = bundle.getInt("KEY_DIALOG_PACKAGE_ID");
            return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_delete_this_sticker), C4522p.m8236a(R.string.action_delete), new OnClickListener(this) {
                final /* synthetic */ StickerSettingsActivity f12390b;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2808d.m7148b(new C6651b(i2));
                }
            }, C4522p.m8236a(R.string.cancel_cap), null);
        } else if (i != 20) {
            return null;
        } else {
            boolean z = bundle.getBoolean("KEY_DIALOG_IS_HIDDEN");
            bundle.getString("KEY_DIALOG_TITLE_BOTTOM_SHEET", "");
            i = !z ? R.menu.context_menu_sticker_setting_list_click_visible : R.menu.context_menu_sticker_setting_list_click_invisible;
            C1286a c1286a = new C1286a(this);
            c1286a.f4034f = new OnClickListener(this) {
                final /* synthetic */ StickerSettingsActivity f12392b;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == R.id.action_delete_sticker) {
                        bundle.putInt("BOTTOM_SHEET_DO_ACTION_DELETE_STICKER_METHOD", 102);
                        this.f12392b.f24492n.m14647a(bundle);
                    } else if (i == R.id.action_visibility_sticker) {
                        bundle.putInt("BOTTOM_SHEET_DO_ACTION_DELETE_STICKER_METHOD", 101);
                        this.f12392b.f24492n.m14647a(bundle);
                    }
                }
            };
            C4506e.m8204a(this, c1286a, i);
            return c1286a.m3053a();
        }
    }

    public final void mo2432a(C7394b c7394b) {
    }

    public final void mo2433b(C7394b c7394b) {
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_settings_activity);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.action_sticker_settings));
        this.f24491m = (ViewGroup) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24492n = new C6271b();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24492n);
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
