package mobi.mmdt.ott.view.settings.mainsettings.localpasscode;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class LocalPassCodeSettingsListActivity extends C7722a implements C3101a {
    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 10) {
            return null;
        }
        final int[] iArr = new int[1];
        C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
        View inflate = getLayoutInflater().inflate(R.layout.dialog_settings_messages_text_size_selection, null);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.numberPicker);
        final String[] strArr = new String[C4400b.values().length];
        int x = C2535a.m6888a().m6979x();
        strArr[0] = C4522p.m8236a(C4400b.values()[x].f12285f);
        int i = 0;
        int i2 = x;
        while (i2 < C4400b.values().length) {
            int i3 = i + 1;
            strArr[i] = C4522p.m8236a(C4400b.values()[i2].f12285f);
            i2++;
            i = i3;
        }
        i2 = 0;
        while (i2 < x) {
            i3 = i + 1;
            strArr[i] = C4522p.m8236a(C4400b.values()[i2].f12285f);
            i2++;
            i = i3;
        }
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(strArr.length - 1);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setDescendantFocusability(393216);
        numberPicker.setOnValueChangedListener(new OnValueChangeListener(this) {
            final /* synthetic */ LocalPassCodeSettingsListActivity f12275b;

            public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
                iArr[0] = i2;
            }
        });
        c0663a.m1607a(inflate);
        c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
        c0663a.m1609a(C4522p.m8236a(R.string.set_cap), new OnClickListener(this) {
            final /* synthetic */ LocalPassCodeSettingsListActivity f12278c;

            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = 0;
                Object obj = strArr[iArr[0]];
                while (i2 < C4400b.values().length && !C4522p.m8236a(C4400b.values()[i2].f12285f).equals(obj)) {
                    i2++;
                }
                C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_AUTO_LOCK_IF_AWAY_ENUM", i2).apply();
                this.f12278c.f24428m.m14602a();
            }
        });
        Dialog a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 4004) {
            C2535a.m6888a().m6959n(z);
            this.f24428m.m14602a();
        }
    }

    public final void mo3705c(int i) {
        if (i == 1019) {
            if (!C2535a.m6888a().m6977w().isEmpty()) {
                C4478a.m8155a((Activity) this, false, true, true);
            }
        } else if (i == 8005) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10);
            b_(bundle);
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.local_pass_code);
    }

    protected final C6260b mo3706h() {
        return new C6974a();
    }

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
