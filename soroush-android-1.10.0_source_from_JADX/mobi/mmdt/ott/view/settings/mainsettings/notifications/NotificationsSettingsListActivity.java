package mobi.mmdt.ott.view.settings.mainsettings.notifications;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p246d.p248b.C2539e;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.tools.C4522p;
import uz.shift.colorpicker.LineColorPicker;

public class NotificationsSettingsListActivity extends C7722a implements C3101a {
    private static final int[] f24802p = new int[]{-65536, -65281, -16776961, -16711681, -16711936, -657931, -256};

    static /* synthetic */ class C44153 {
        static final /* synthetic */ int[] f12318a = new int[C2539e.m6982a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.p246d.p248b.C2539e.m6982a();
            r0 = r0.length;
            r0 = new int[r0];
            f12318a = r0;
            r0 = 1;
            r1 = f12318a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8298a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f12318a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8299b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f12318a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8300c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f12318a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8301d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.mainsettings.notifications.NotificationsSettingsListActivity.3.<clinit>():void");
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        C0663a c0663a;
        CharSequence a;
        OnClickListener c44131;
        Context context = this;
        View inflate;
        switch (bundle.getInt("dialog_id")) {
            case 10:
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.led_color));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_notifications_led_color_selection, null);
                final LineColorPicker lineColorPicker = (LineColorPicker) inflate.findViewById(R.id.lineColorPicker);
                lineColorPicker.setColors(f24802p);
                lineColorPicker.setSelectedColor(C2535a.m6888a().m6899K());
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                a = C4522p.m8236a(R.string.select_cap);
                c44131 = new OnClickListener(context) {
                    final /* synthetic */ NotificationsSettingsListActivity f12315b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        lineColorPicker.getColor();
                        C2535a a = C2535a.m6888a();
                        a.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_NOTIFICATION_LIGHT_COLOR", lineColorPicker.getColor()).apply();
                        this.f12315b.f24428m.m14602a();
                    }
                };
                break;
            case 11:
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.vibrate));
                inflate = getLayoutInflater().inflate(R.layout.dialog_settings_notifications_vibrate_selection, null);
                final RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
                RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
                RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
                RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.radioButton3);
                RadioButton radioButton4 = (RadioButton) inflate.findViewById(R.id.radioButton4);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton, radioButton2, radioButton3, radioButton4);
                radioButton.setText(C4522p.m8236a(R.string.action_disable));
                radioButton2.setText(C4522p.m8236a(R.string.action_default));
                radioButton3.setText(C4522p.m8236a(R.string.action_short));
                radioButton4.setText(C4522p.m8236a(R.string.action_long));
                switch (C44153.f12318a[C2535a.m6888a().m6890A() - 1]) {
                    case 1:
                        radioButton.setChecked(true);
                        break;
                    case 3:
                        radioButton3.setChecked(true);
                        break;
                    case 4:
                        radioButton4.setChecked(true);
                        break;
                    default:
                        radioButton2.setChecked(true);
                        break;
                }
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                a = C4522p.m8236a(R.string.select_cap);
                c44131 = new OnClickListener(context) {
                    final /* synthetic */ NotificationsSettingsListActivity f12317b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2;
                        switch (radioGroup.getCheckedRadioButtonId()) {
                            case R.id.radioButton1:
                                i2 = C2539e.f8298a;
                                break;
                            case R.id.radioButton3:
                                i2 = C2539e.f8300c;
                                break;
                            case R.id.radioButton4:
                                i2 = C2539e.f8301d;
                                break;
                            default:
                                i2 = C2539e.f8299b;
                                break;
                        }
                        C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_VIBRATE_MODE", i2 - 1).apply();
                        this.f12317b.f24428m.m14602a();
                    }
                };
                break;
            default:
                return null;
        }
        c0663a.m1609a(a, c44131);
        Dialog a2 = c0663a.m1612a();
        a2.show();
        a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a2;
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 5002) {
            C2535a.m6888a().m6963p(z);
        } else if (i != 5005) {
            switch (i) {
                case 4002:
                    boolean z2 = z ^ 1;
                    C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_NOTIFICATIONS_DISABLED", z2).apply();
                    if (z2) {
                        C2873a.m7225a();
                    }
                    this.f24428m.m14602a();
                    return;
                case 4003:
                    C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SEND_MESSAGE_ALARM_ENABLE", z).apply();
                    return;
                default:
                    return;
            }
        } else {
            C2535a.m6888a().m6976v(z);
        }
    }

    public final void mo3705c(int i) {
        Bundle bundle;
        String str;
        int i2;
        if (i == 2005) {
            bundle = new Bundle();
            str = "dialog_id";
            i2 = 11;
        } else if (i == 2008) {
            Parcelable E = C2535a.m6888a().m6894E();
            Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
            intent.putExtra("android.intent.extra.ringtone.TITLE", C4522p.m8236a(R.string.select_notifications_sound));
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", E);
            startActivityForResult(intent, 5007);
            return;
        } else if (i == 6001) {
            bundle = new Bundle();
            str = "dialog_id";
            i2 = 10;
        } else {
            return;
        }
        bundle.putInt(str, i2);
        b_(bundle);
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.notifications);
    }

    protected final C6260b mo3706h() {
        return new C6977a();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 5007) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            C2535a a = C2535a.m6888a();
            String str = "";
            if (uri != null) {
                str = uri.toString();
            }
            a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_NOTIFICATION_SOUND_URI", str).apply();
            this.f24428m.m14602a();
        }
    }
}
