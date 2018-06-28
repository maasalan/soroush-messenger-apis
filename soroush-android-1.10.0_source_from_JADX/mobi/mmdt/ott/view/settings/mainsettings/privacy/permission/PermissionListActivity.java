package mobi.mmdt.ott.view.settings.mainsettings.privacy.permission;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.tools.C4522p;

public class PermissionListActivity extends C7722a implements C3101a {
    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 10) {
            return null;
        }
        Dialog a;
        CharSequence charSequence = "";
        if (bundle.getInt("KEY_DIALOG_TYPE_ITEM_SELECTED") == 1) {
            charSequence = C4522p.m8236a(R.string.call_setting_item);
        }
        C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
        c0663a.m1613b(charSequence);
        View inflate = getLayoutInflater().inflate(R.layout.dialog_settings_language_selection, null);
        final RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
        RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
        RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.radioButton3);
        int accent_color = UIThemeManager.getmInstance().getAccent_color();
        r8 = new CompoundButton[3];
        int i = 0;
        r8[0] = radioButton;
        r8[1] = radioButton2;
        r8[2] = radioButton3;
        C2491i.m6782a(accent_color, r8);
        radioButton.setText(C4522p.m8236a(R.string.all_setting_item));
        radioButton2.setText(C4522p.m8236a(R.string.contacts_setting_item));
        radioButton3.setText(C4522p.m8236a(R.string.no_body_setting_item));
        String b = C2535a.m6888a().m6919b();
        int hashCode = b.hashCode();
        if (hashCode != 3121) {
            if (hashCode == 3259) {
                if (b.equals("fa")) {
                    switch (i) {
                        case 0:
                            radioButton2.setChecked(true);
                            break;
                        case 1:
                            radioButton3.setChecked(true);
                            break;
                        default:
                            radioButton.setChecked(true);
                            break;
                    }
                    c0663a.m1607a(inflate);
                    c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                    c0663a.m1609a(C4522p.m8236a(R.string.select_cap), new OnClickListener(this) {
                        final /* synthetic */ PermissionListActivity f12336b;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            radioGroup.getCheckedRadioButtonId();
                            this.f12336b.f24428m.m14602a();
                        }
                    });
                    a = c0663a.m1612a();
                    a.show();
                    a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    return a;
                }
            }
        } else if (b.equals("ar")) {
            i = 1;
            switch (i) {
                case 0:
                    radioButton2.setChecked(true);
                    break;
                case 1:
                    radioButton3.setChecked(true);
                    break;
                default:
                    radioButton.setChecked(true);
                    break;
            }
            c0663a.m1607a(inflate);
            c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
            c0663a.m1609a(C4522p.m8236a(R.string.select_cap), /* anonymous class already generated */);
            a = c0663a.m1612a();
            a.show();
            a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
            a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
            return a;
        }
        i = -1;
        switch (i) {
            case 0:
                radioButton2.setChecked(true);
                break;
            case 1:
                radioButton3.setChecked(true);
                break;
            default:
                radioButton.setChecked(true);
                break;
        }
        c0663a.m1607a(inflate);
        c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
        c0663a.m1609a(C4522p.m8236a(R.string.select_cap), /* anonymous class already generated */);
        a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public final void mo3690a(int i, boolean z) {
    }

    public final void mo3705c(int i) {
        if (i == 8008) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10);
            bundle.putInt("KEY_DIALOG_TYPE_ITEM_SELECTED", 1);
            b_(bundle);
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.permissions);
    }

    protected final C6260b mo3706h() {
        return new C6983a();
    }

    protected void onResume() {
        super.onResume();
        if (getWindow() != null && getWindow().getDecorView() != null) {
            getWindow().getDecorView().setBackgroundColor(UIThemeManager.getmInstance().getSpacer_view_color());
        }
    }
}
