package mobi.mmdt.ott.view.settings.mainsettings.messages.cachesetting;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2680g;
import mobi.mmdt.ott.logic.p261a.C6713f;
import mobi.mmdt.ott.logic.p351h.p352a.C2821a;
import mobi.mmdt.ott.logic.p351h.p352a.C2824c;
import mobi.mmdt.ott.logic.p351h.p352a.C2825d;
import mobi.mmdt.ott.logic.p351h.p352a.C2826e;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6805b;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6806c;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6807d;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6808e;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2817a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2818b;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2819c;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.C2820d;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5982a;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.p354a.p525a.C5983b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4522p;

public class CacheSettingsListActivity extends C7722a implements C3101a {
    private C6976a f24799p;
    private OnClickListener f24800q = new C44052(this);
    private OnClickListener f24801r = new C44063(this);

    class C44041 implements OnClickListener {
        final /* synthetic */ CacheSettingsListActivity f12299a;

        C44041(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12299a = cacheSettingsListActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            switch (i) {
                case 0:
                    C2821a.m7156a(C2824c.f8895a);
                    this.f12299a.f24428m.m14602a();
                    return;
                case 1:
                    C2821a.m7156a(C2824c.f8896b);
                    this.f12299a.f24428m.m14602a();
                    return;
                case 2:
                    C2821a.m7156a(C2824c.f8897c);
                    this.f12299a.f24428m.m14602a();
                    return;
                default:
                    return;
            }
        }
    }

    class C44052 implements OnClickListener {
        final /* synthetic */ CacheSettingsListActivity f12300a;

        C44052(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12300a = cacheSettingsListActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7148b(new C6806c());
        }
    }

    class C44063 implements OnClickListener {
        final /* synthetic */ CacheSettingsListActivity f12301a;

        C44063(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12301a = cacheSettingsListActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7148b(new C6713f());
        }
    }

    class C44085 implements Runnable {
        final /* synthetic */ CacheSettingsListActivity f12307a;

        C44085(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12307a = cacheSettingsListActivity;
        }

        public final void run() {
            C2808d.m7148b(new C6808e());
        }
    }

    class C44118 implements Runnable {
        final /* synthetic */ CacheSettingsListActivity f12312a;

        C44118(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12312a = cacheSettingsListActivity;
        }

        public final void run() {
        }
    }

    class C44129 implements Runnable {
        final /* synthetic */ CacheSettingsListActivity f12313a;

        C44129(CacheSettingsListActivity cacheSettingsListActivity) {
            this.f12313a = cacheSettingsListActivity;
        }

        public final void run() {
            Toast.makeText(this.f12313a, C4522p.m8236a(R.string.error_message_please_try_again_later), 0).show();
            this.f12313a.f24799p.m14602a();
        }
    }

    static /* synthetic */ C7406c m22040f(CacheSettingsListActivity cacheSettingsListActivity) {
        return cacheSettingsListActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        Activity activity = this;
        Dialog a;
        switch (bundle.getInt("dialog_id")) {
            case 10:
                C0663a c0663a = new C0663a(activity);
                c0663a.m1608a(C4522p.m8236a(R.string.keep_media));
                c0663a.m1611a(new CharSequence[]{getString(R.string.one_week), C4522p.m8236a(R.string.one_month), C4522p.m8236a(R.string.forever)}, new C44041(activity));
                a = c0663a.m1612a();
                a.show();
                a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                return a;
            case 11:
                C0663a c0663a2 = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
                c0663a2.m1608a(C4522p.m8236a(R.string.clear_cache));
                LayoutInflater layoutInflater = getLayoutInflater();
                boolean equals = C2535a.m6888a().m6919b().equals("fa");
                View inflate = layoutInflater.inflate(R.layout.dialog_settings_cache_setting_selection, null);
                CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBox1);
                TextView textView = (TextView) inflate.findViewById(R.id.checkBoxText1);
                CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBox2);
                TextView textView2 = (TextView) inflate.findViewById(R.id.checkBoxText2);
                CheckBox checkBox3 = (CheckBox) inflate.findViewById(R.id.checkBox3);
                TextView textView3 = (TextView) inflate.findViewById(R.id.checkBoxText3);
                CheckBox checkBox4 = (CheckBox) inflate.findViewById(R.id.checkBox4);
                TextView textView4 = (TextView) inflate.findViewById(R.id.checkBoxText4);
                C0663a c0663a3 = c0663a2;
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), checkBox, checkBox2, checkBox3, checkBox4);
                TextView textView5 = (TextView) inflate.findViewById(R.id.textView1);
                TextView textView6 = (TextView) inflate.findViewById(R.id.textView2);
                TextView textView7 = (TextView) inflate.findViewById(R.id.textView3);
                TextView textView8 = (TextView) inflate.findViewById(R.id.textView4);
                View view = inflate;
                int text_secondary_color = UIThemeManager.getmInstance().getText_secondary_color();
                r2 = new TextView[4];
                TextView textView9 = textView4;
                r2[1] = textView6;
                r2[2] = textView7;
                r2[3] = textView8;
                C2491i.m6784a(text_secondary_color, r2);
                checkBox.setChecked(true);
                checkBox2.setChecked(true);
                checkBox3.setChecked(true);
                checkBox4.setChecked(true);
                ArrayList b = C2821a.m7159b();
                int i = 0;
                while (i < b.size()) {
                    TextView textView10;
                    String str = ((C2825d) b.get(i)).f8899a;
                    ArrayList arrayList = b;
                    int i2 = i;
                    CharSequence b2 = C2491i.m6811b(activity, ((C2825d) b.get(i)).f8900b);
                    if (equals) {
                        b2 = C2491i.m6814b((String) b2);
                    }
                    if (str.equals(C2826e.Image.toString())) {
                        textView.setText(C4522p.m8236a(R.string.photos_clear_cache));
                        textView5.setText(b2);
                    } else if (str.equals(C2826e.Video.toString())) {
                        textView2.setText(C4522p.m8236a(R.string.videos_clear_cache));
                        textView6.setText(b2);
                    } else if (str.equals(C2826e.Voice.toString())) {
                        textView3.setText(C4522p.m8236a(R.string.voices_clear_cache));
                        textView7.setText(b2);
                    } else if (str.equals(C2826e.Other.toString())) {
                        textView10 = textView9;
                        textView10.setText(C4522p.m8236a(R.string.other_clear_cache));
                        textView8.setText(b2);
                        i = i2 + 1;
                        textView9 = textView10;
                        b = arrayList;
                    }
                    textView10 = textView9;
                    i = i2 + 1;
                    textView9 = textView10;
                    b = arrayList;
                }
                C0663a c0663a4 = c0663a3;
                c0663a4.m1607a(view);
                c0663a4.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                final CheckBox checkBox5 = checkBox;
                c0663a2 = c0663a4;
                final CheckBox checkBox6 = checkBox2;
                final CheckBox checkBox7 = checkBox4;
                checkBox4 = checkBox3;
                c0663a2.m1609a(C4522p.m8236a(R.string.clear_cache), new OnClickListener(activity) {
                    final /* synthetic */ CacheSettingsListActivity f12306e;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ArrayList arrayList = new ArrayList();
                        if (checkBox5.isChecked()) {
                            arrayList.add(C2826e.Image);
                            arrayList.add(C2826e.Thumbnail);
                            arrayList.add(C2826e.Temps);
                        }
                        if (checkBox6.isChecked()) {
                            arrayList.add(C2826e.Video);
                        }
                        if (checkBox4.isChecked()) {
                            arrayList.add(C2826e.Voice);
                        }
                        if (checkBox7.isChecked()) {
                            arrayList.add(C2826e.Other);
                        }
                        if (arrayList.size() > 0) {
                            C2808d.m7148b(new C6805b(arrayList));
                            this.f12306e.f24428m.m14602a();
                        }
                    }
                });
                a = c0663a2.m1612a();
                a.show();
                a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                return a;
            case 12:
                return C4488b.m8182a(activity, C4522p.m8236a(R.string.local_database_title_dialog), C4522p.m8236a(R.string.clear_cached_text_message), C4522p.m8236a(R.string.clear), activity.f24800q, C4522p.m8236a(R.string.cancel_cap), null);
            case 13:
                return C4488b.m8182a(activity, C4522p.m8236a(R.string.log_out_title_dialog), C4522p.m8236a(R.string.log_out_description_dialog), C4522p.m8236a(R.string.ok_cap), activity.f24801r, C4522p.m8236a(R.string.cancel_cap), null);
            default:
                return null;
        }
    }

    public final void mo3690a(int i, boolean z) {
    }

    public final void mo3705c(int i) {
        Bundle bundle;
        if (i != 2009) {
            String str;
            int i2;
            if (i != 8001) {
                switch (i) {
                    case 7001:
                        bundle = new Bundle();
                        str = "dialog_id";
                        i2 = 10;
                        break;
                    case 7002:
                        bundle = new Bundle();
                        str = "dialog_id";
                        i2 = 12;
                        break;
                    default:
                        return;
                }
            }
            bundle = new Bundle();
            str = "dialog_id";
            i2 = 11;
            bundle.putInt(str, i2);
            b_(bundle);
            return;
        }
        bundle = new Bundle();
        bundle.putInt("dialog_id", 13);
        b_(bundle);
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.cache_settings);
    }

    protected final C6260b mo3706h() {
        this.f24799p = new C6976a();
        return this.f24799p;
    }

    public void onEvent(C2680g c2680g) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CacheSettingsListActivity f12298a;

            {
                this.f12298a = r1;
            }

            public final void run() {
                C4258b.m8066a(CacheSettingsListActivity.m22040f(this.f12298a));
            }
        });
    }

    public void onEvent(C5982a c5982a) {
        runOnUiThread(new C44129(this));
    }

    public void onEvent(C5983b c5983b) {
        runOnUiThread(new C44118(this));
    }

    public void onEvent(C2817a c2817a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CacheSettingsListActivity f12297a;

            {
                this.f12297a = r1;
            }

            public final void run() {
                C2808d.m7148b(new C6807d());
            }
        });
    }

    public void onEvent(C2818b c2818b) {
        runOnUiThread(new C44085(this));
    }

    public void onEvent(C2819c c2819c) {
        final String b = C2491i.m6811b((Activity) this, c2819c.f8891a);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CacheSettingsListActivity f12309b;

            public final void run() {
                C6976a e = this.f12309b.f24799p;
                String str = b;
                if (e.f19925c != null) {
                    e.f19925c = str;
                    e.m14602a();
                }
            }
        });
    }

    public void onEvent(C2820d c2820d) {
        final String b = C2491i.m6811b((Activity) this, c2820d.f8892a);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CacheSettingsListActivity f12311b;

            public final void run() {
                C6976a e = this.f12311b.f24799p;
                String str = b;
                if (e.f19926e != null) {
                    e.f19926e = str;
                    e.m14602a();
                }
            }
        });
    }
}
