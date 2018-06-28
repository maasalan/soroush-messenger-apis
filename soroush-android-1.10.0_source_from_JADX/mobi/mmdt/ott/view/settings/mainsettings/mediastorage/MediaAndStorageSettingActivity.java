package mobi.mmdt.ott.view.settings.mainsettings.mediastorage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.widget.CheckBox;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6642a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p246d.p248b.C2536b;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.settings.mainsettings.messages.cachesetting.CacheSettingsListActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class MediaAndStorageSettingActivity extends C7722a implements C3101a {

    class C44033 implements OnClickListener {
        final /* synthetic */ MediaAndStorageSettingActivity f12296a;

        C44033(MediaAndStorageSettingActivity mediaAndStorageSettingActivity) {
            this.f12296a = mediaAndStorageSettingActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        CharSequence a;
        C0663a c0663a;
        Dialog a2;
        Context context = this;
        C0663a c0663a2;
        View inflate;
        CheckBox checkBox;
        CheckBox checkBox2;
        CheckBox checkBox3;
        CheckBox checkBox4;
        boolean l;
        boolean n;
        boolean r;
        boolean q;
        final CheckBox checkBox5;
        final CheckBox checkBox6;
        final CheckBox checkBox7;
        final CheckBox checkBox8;
        OnClickListener c44011;
        switch (bundle.getInt("dialog_id")) {
            case 10:
                c0663a2 = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a2.m1608a(C4522p.m8236a(R.string.when_using_mobile_data));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_network_media_selection, null);
                checkBox = (CheckBox) inflate.findViewById(R.id.checkBox1);
                checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBox2);
                checkBox3 = (CheckBox) inflate.findViewById(R.id.checkBox3);
                checkBox4 = (CheckBox) inflate.findViewById(R.id.checkBox4);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), checkBox, checkBox2, checkBox3, checkBox4);
                checkBox.setText(C4522p.m8236a(R.string.action_photo));
                checkBox2.setText(C4522p.m8236a(R.string.action_video));
                checkBox3.setText(C4522p.m8236a(R.string.action_gif));
                checkBox4.setText(C4522p.m8236a(R.string.action_file));
                l = C2535a.m6888a().m6956l();
                n = C2535a.m6888a().m6960n();
                r = C2535a.m6888a().m6968r();
                q = C2535a.m6888a().m6966q();
                checkBox.setChecked(l);
                checkBox2.setChecked(n);
                checkBox3.setChecked(r);
                checkBox4.setChecked(q);
                c0663a2.m1607a(inflate);
                c0663a2.m1614b(C4522p.m8236a(R.string.cancel), null);
                a = C4522p.m8236a(R.string.select_cap);
                c0663a = c0663a2;
                checkBox5 = checkBox;
                checkBox6 = checkBox2;
                checkBox7 = checkBox3;
                checkBox8 = checkBox4;
                c44011 = new OnClickListener(context) {
                    final /* synthetic */ MediaAndStorageSettingActivity f12290e;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2535a.m6888a().m6937e(checkBox5.isChecked());
                        C2535a.m6888a().m6945g(checkBox6.isChecked());
                        C2535a.m6888a().m6953k(checkBox7.isChecked());
                        C2535a.m6888a().m6951j(checkBox8.isChecked());
                        this.f12290e.f24428m.m14602a();
                    }
                };
                break;
            case 11:
                c0663a2 = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a2.m1608a(C4522p.m8236a(R.string.when_using_wifi));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_network_media_selection, null);
                checkBox = (CheckBox) inflate.findViewById(R.id.checkBox1);
                checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBox2);
                checkBox3 = (CheckBox) inflate.findViewById(R.id.checkBox3);
                checkBox4 = (CheckBox) inflate.findViewById(R.id.checkBox4);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), checkBox, checkBox2, checkBox3, checkBox4);
                checkBox.setText(C4522p.m8236a(R.string.action_photo));
                checkBox2.setText(C4522p.m8236a(R.string.action_video));
                checkBox3.setText(C4522p.m8236a(R.string.action_gif));
                checkBox4.setText(C4522p.m8236a(R.string.action_file));
                l = C2535a.m6888a().m6954k();
                n = C2535a.m6888a().m6958m();
                r = C2535a.m6888a().m6964p();
                q = C2535a.m6888a().m6962o();
                checkBox.setChecked(l);
                checkBox2.setChecked(n);
                checkBox3.setChecked(r);
                checkBox4.setChecked(q);
                c0663a2.m1607a(inflate);
                c0663a2.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                a = C4522p.m8236a(R.string.select_cap);
                c0663a = c0663a2;
                checkBox5 = checkBox;
                checkBox6 = checkBox2;
                checkBox7 = checkBox3;
                checkBox8 = checkBox4;
                c44011 = new OnClickListener(context) {
                    final /* synthetic */ MediaAndStorageSettingActivity f12295e;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2535a.m6888a().m6932d(checkBox5.isChecked());
                        C2535a.m6888a().m6941f(checkBox6.isChecked());
                        C2535a.m6888a().m6949i(checkBox7.isChecked());
                        C2535a.m6888a().m6947h(checkBox8.isChecked());
                        this.f12295e.f24428m.m14602a();
                    }
                };
                break;
            case 12:
                c0663a2 = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a2.m1608a(C4522p.m8236a(R.string.when_using_roaming));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_network_media_selection, null);
                checkBox = (CheckBox) inflate.findViewById(R.id.checkBox1);
                checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBox2);
                checkBox3 = (CheckBox) inflate.findViewById(R.id.checkBox3);
                checkBox4 = (CheckBox) inflate.findViewById(R.id.checkBox4);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), checkBox, checkBox2, checkBox3, checkBox4);
                checkBox.setText(C4522p.m8236a(R.string.action_photo));
                checkBox2.setText(C4522p.m8236a(R.string.action_video));
                checkBox3.setText(C4522p.m8236a(R.string.action_gif));
                checkBox4.setText(C4522p.m8236a(R.string.action_file));
                c0663a2.m1607a(inflate);
                c0663a2.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                c0663a2.m1609a(C4522p.m8236a(R.string.select_cap), new C44033(context));
                a2 = c0663a2.m1612a();
                break;
            default:
                return null;
        }
        c0663a.m1609a(a, r8);
        a2 = c0663a.m1612a();
        a2.show();
        a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a2;
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 4001) {
            C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_DEFAULT_SAVE_TO_GALLERY", z).apply();
            C2808d.m7148b(new C6642a());
        } else if (i != 5001) {
            switch (i) {
                case 4006:
                    if (z) {
                        C2535a.m6888a().m6937e(true);
                        C2535a.m6888a().m6932d(true);
                    } else {
                        C2535a.m6888a().m6937e(false);
                        C2535a.m6888a().m6945g(false);
                        C2535a.m6888a().m6953k(false);
                        C2535a.m6888a().m6951j(false);
                        C2535a.m6888a().m6932d(false);
                        C2535a.m6888a().m6941f(false);
                        C2535a.m6888a().m6949i(false);
                        C2535a.m6888a().m6947h(false);
                    }
                    this.f24428m.m14602a();
                    return;
                case 4007:
                    C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_PALY_GIFS", z).apply();
                    return;
                default:
                    return;
            }
        } else {
            C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_FILE_SECURE_MODE", (z ? C2536b.f8280b : C2536b.f8279a) - 1).apply();
        }
    }

    public final void mo3705c(int i) {
        if (i != 1011) {
            Bundle bundle;
            String str;
            int i2;
            switch (i) {
                case 2002:
                    bundle = new Bundle();
                    str = "dialog_id";
                    i2 = 10;
                    break;
                case 2003:
                    bundle = new Bundle();
                    str = "dialog_id";
                    i2 = 11;
                    break;
                case 2004:
                    bundle = new Bundle();
                    bundle.putInt("dialog_id", 12);
                    b_(bundle);
                    return;
                default:
                    return;
            }
            bundle.putInt(str, i2);
            b_(bundle);
            return;
        }
        Intent intent = new Intent(this, CacheSettingsListActivity.class);
        if (this != null) {
            startActivity(intent);
            C4478a.m8165c((Activity) this, true);
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.setting_media_storage_title);
    }

    protected final C6260b mo3706h() {
        return new C6975a();
    }
}
