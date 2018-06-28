package mobi.mmdt.ott.view.settings.mainsettings.privacy;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v7.app.C6389b.C0663a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.block.BlockActivity;
import mobi.mmdt.ott.view.components.browser.C3112a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.ActiveSessionActivity;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.permission.PermissionListActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class PrivacySettingsListActivity extends C7722a implements C3101a {
    private C6978a f24803p;

    public final Dialog mo2299a(Bundle bundle) {
        C0663a c0663a;
        CharSequence a;
        OnClickListener c44171;
        Context context = this;
        View inflate;
        final RadioGroup radioGroup;
        RadioButton radioButton;
        RadioButton radioButton2;
        switch (bundle.getInt("dialog_id")) {
            case 10:
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.show_last_online_to_others));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_on_off_selection, null);
                radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
                radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
                radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton, radioButton2);
                radioButton.setText(C4522p.m8236a(R.string.on));
                radioButton2.setText(C4522p.m8236a(R.string.off));
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                a = C4522p.m8236a(R.string.select_cap);
                c44171 = new OnClickListener(context) {
                    final /* synthetic */ PrivacySettingsListActivity f12321b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        radioGroup.getCheckedRadioButtonId();
                    }
                };
                break;
            case 11:
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.send_message_seen_report));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_on_off_selection, null);
                radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
                radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
                radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton, radioButton2);
                radioButton.setText(C4522p.m8236a(R.string.on));
                radioButton2.setText(C4522p.m8236a(R.string.off));
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                a = C4522p.m8236a(R.string.select_cap);
                c44171 = new OnClickListener(context) {
                    final /* synthetic */ PrivacySettingsListActivity f12323b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        radioGroup.getCheckedRadioButtonId();
                    }
                };
                break;
            default:
                return null;
        }
        c0663a.m1609a(a, c44171);
        Dialog a2 = c0663a.m1612a();
        a2.show();
        a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a2;
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 5004) {
            C2535a.m6888a().m6973u(z);
        }
    }

    public final void mo3705c(int i) {
        if (i == 1013) {
            C3112a.m7566a((Activity) this, Uri.parse(C4522p.m8236a(R.string.privacy_policy_url)));
        } else if (i != 1018) {
            if (i == 1020) {
                startActivity(new Intent(this, ActiveSessionActivity.class));
                C4478a.m8165c((Activity) this, true);
                C4478a.m8161b((Activity) this, false);
            } else if (i == 1026) {
                startActivity(new Intent(this, PermissionListActivity.class));
                C4478a.m8165c((Activity) this, true);
                C4478a.m8161b((Activity) this, false);
            } else if (i != 2007) {
                Bundle bundle;
                switch (i) {
                    case 3001:
                        bundle = new Bundle();
                        bundle.putInt("dialog_id", 10);
                        b_(bundle);
                        return;
                    case 3002:
                        bundle = new Bundle();
                        bundle.putInt("dialog_id", 11);
                        b_(bundle);
                        return;
                    default:
                        return;
                }
            } else {
                startActivity(new Intent(getApplicationContext(), BlockActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        } else if (C2535a.m6888a().m6972t()) {
            C4478a.m8155a((Activity) this, false, false, false);
        } else {
            C4478a.m8155a((Activity) this, true, false, false);
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.privacy);
    }

    protected final C6260b mo3706h() {
        this.f24803p = new C6978a();
        return this.f24803p;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.x != null) {
            this.x.setOverflowIcon(C0343b.m671a(getResources(), R.drawable.ic_option, getTheme()));
            if (this.x.getOverflowIcon() != null) {
                C2491i.m6790a(this.x.getOverflowIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_privacy_settings, menu);
        menu.findItem(R.id.action_deactivate).setTitle(C4522p.m8236a(R.string.action_deactivate));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_deactivate) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C6978a c6978a = this.f24803p;
            c6978a.f19927b = true;
            c6978a.m14602a();
            return true;
        }
    }

    protected void onResume() {
        super.onResume();
    }
}
