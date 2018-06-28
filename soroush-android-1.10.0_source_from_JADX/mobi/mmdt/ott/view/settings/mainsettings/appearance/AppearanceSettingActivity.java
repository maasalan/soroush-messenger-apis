package mobi.mmdt.ott.view.settings.mainsettings.appearance;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.io.IOException;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6642a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.settings.mainsettings.changeTab.ChangeTabActivity;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.ChangeBackgroundConversationActivity;
import mobi.mmdt.ott.view.settings.mainsettings.changetheme.ThemeActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p480d.C4503a;

public class AppearanceSettingActivity extends C7722a implements C3101a {
    private RadioGroup m22006a(FrameLayout frameLayout, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        View radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(1);
        for (int i = 0; i < arrayList2.size(); i++) {
            View radioButton = new RadioButton(this);
            radioButton.setText((CharSequence) arrayList2.get(i));
            radioButton.setId(i);
            radioButton.setChecked(((String) arrayList.get(i)).equals(C2535a.m6888a().at()));
            C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton);
            radioGroup.addView(radioButton, new LayoutParams(-1, -2));
        }
        frameLayout.addView(radioGroup);
        return radioGroup;
    }

    static /* synthetic */ C7406c m22008b(AppearanceSettingActivity appearanceSettingActivity) {
        return appearanceSettingActivity;
    }

    static /* synthetic */ C7406c m22009c(AppearanceSettingActivity appearanceSettingActivity) {
        return appearanceSettingActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        C0663a c0663a;
        CharSequence a;
        OnClickListener c43751;
        View inflate;
        switch (bundle.getInt("dialog_id")) {
            case 10:
                c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.messages_text_size));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_messages_text_size_selection, null);
                final NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.numberPicker);
                numberPicker.setMinValue(12);
                numberPicker.setMaxValue(24);
                numberPicker.setValue(C2535a.m6888a().m6891B());
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                a = C4522p.m8236a(R.string.set_cap);
                c43751 = new OnClickListener(this) {
                    final /* synthetic */ AppearanceSettingActivity f12243b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_FONT_SIZE3", numberPicker.getValue()).apply();
                        C2808d.m7148b(new C6642a());
                        this.f12243b.f24428m.m14602a();
                    }
                };
                break;
            case 11:
                String[] list;
                c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                c0663a.m1613b(C4522p.m8236a(R.string.select_font));
                LayoutInflater layoutInflater = getLayoutInflater();
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                try {
                    list = getAssets().list("fonts");
                } catch (IOException e) {
                    e.printStackTrace();
                    list = null;
                }
                if (list != null) {
                    for (String str : list) {
                        if (str != null && str.endsWith("ttf")) {
                            arrayList2.add(C4503a.m8194a(str));
                            arrayList.add(str);
                        }
                    }
                }
                inflate = layoutInflater.inflate(R.layout.dialog_settings_change_font, null);
                final RadioGroup a2 = m22006a((FrameLayout) inflate.findViewById(R.id.frameLayout), arrayList, arrayList2);
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                a = C4522p.m8236a(R.string.select_cap);
                c43751 = new OnClickListener(this) {
                    final /* synthetic */ AppearanceSettingActivity f12246c;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        String str = (String) arrayList.get(a2.getCheckedRadioButtonId());
                        Bundle bundle = new Bundle();
                        bundle.putString("name", str);
                        MyApplication.m12950a().m12957a("change_font", bundle);
                        C4503a.m8197b(str);
                        C4258b.m8066a(AppearanceSettingActivity.m22008b(this.f12246c));
                        C4478a.m8166d(AppearanceSettingActivity.m22009c(this.f12246c));
                    }
                };
                break;
            default:
                return null;
        }
        c0663a.m1609a(a, c43751);
        Dialog a3 = c0663a.m1612a();
        a3.show();
        a3.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a3.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a3;
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 5003) {
            C2535a.m6888a().m6955l(z);
        } else if (i == 5007) {
            C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_DEFAULT_SHOW_WIDE_BACKGROUND_AT_VIEW_HOLDER", z).apply();
        }
    }

    public final void mo3705c(int i) {
        Bundle bundle;
        switch (i) {
            case 1010:
                Intent intent = new Intent(getApplicationContext(), ChangeBackgroundConversationActivity.class);
                intent.putExtra("KEY_REQUEST_CODE", 215);
                intent.putExtra("EXTRA_SELECTOR_TITLE", C4522p.m8236a(R.string.photos));
                startActivity(intent);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                return;
            case 1014:
                startActivity(new Intent(getApplicationContext(), ThemeActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                return;
            case 1015:
                startActivity(new Intent(getApplicationContext(), ChangeTabActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                finish();
                return;
            case 8011:
                bundle = new Bundle();
                bundle.putInt("dialog_id", 11);
                b_(bundle);
                return;
            case 8012:
                bundle = new Bundle();
                bundle.putInt("dialog_id", 10);
                b_(bundle);
                return;
            default:
                return;
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.setting_appearance_title);
    }

    protected final C6260b mo3706h() {
        return new C6964a();
    }
}
