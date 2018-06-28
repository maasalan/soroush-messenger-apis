package mobi.mmdt.ott.view.vas.owghat.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2918a;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.logic.vas.pray.p377b.C2923b;
import mobi.mmdt.ott.logic.vas.pray.p377b.C6009a;
import mobi.mmdt.ott.logic.vas.pray.p378d.C2925a;
import mobi.mmdt.ott.logic.vas.pray.p551c.C6815a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2933d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.settings.mainsettings.C4377b;
import mobi.mmdt.ott.view.settings.p471a.C6952c;
import mobi.mmdt.ott.view.settings.p471a.C6961l;
import mobi.mmdt.ott.view.settings.p583b.C7379d;
import mobi.mmdt.ott.view.settings.p583b.C7388m;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.vas.owghat.OwghatActivity;
import mobi.mmdt.ott.view.vas.owghat.component.NumberPicker;
import mobi.mmdt.ott.view.vas.owghat.setting.p484a.C6991a;
import mobi.mmdt.ott.view.vas.owghat.setting.p600b.C7397a;
import org.json.JSONException;

public class OwghatSettingActivity extends C7576b implements C3101a, C3126i, C4377b, C4554b {
    private String[] f24534A;
    private boolean[] f24535B;
    private C6990a f24536m;
    private RecyclerView f24537n;
    private LinearLayout f24538o;
    private C4553a f24539p;
    private C4553a f24540q;
    private ArrayList<C2918a> f24541r;
    private int f24542s;
    private int f24543t;
    private int f24544u;
    private int f24545v;
    private boolean f24546w = true;
    private boolean f24547z = true;

    class C45472 implements OnMultiChoiceClickListener {
        final /* synthetic */ OwghatSettingActivity f12558a;

        C45472(OwghatSettingActivity owghatSettingActivity) {
            this.f12558a = owghatSettingActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f12558a.f24535B[i] = z;
        }
    }

    class C45483 implements OnClickListener {
        final /* synthetic */ OwghatSettingActivity f12559a;

        C45483(OwghatSettingActivity owghatSettingActivity) {
            this.f12559a = owghatSettingActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            for (boolean z : this.f12559a.f24535B) {
                stringBuilder.append(z ? "1" : "0");
            }
            C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_ENABLED_PRAY_TIME", stringBuilder.toString()).apply();
            this.f12559a.m21506g();
            C2933d a = C2933d.m7313a();
            C2922a.m7297a();
            a.m7318a(C2922a.m7303g());
        }
    }

    class C45494 implements Runnable {
        final /* synthetic */ OwghatSettingActivity f12560a;

        C45494(OwghatSettingActivity owghatSettingActivity) {
            this.f12560a = owghatSettingActivity;
        }

        public final void run() {
            this.f12560a.f24545v = this.f12560a.f24542s;
            C4501c.m8189a().m8193b();
            OwghatSettingActivity owghatSettingActivity = this.f12560a;
            C2922a.m7297a();
            owghatSettingActivity.f24541r = C2922a.m7300c();
            C2918a c2918a = (this.f12560a.f24541r == null || this.f12560a.f24541r.size() <= 0) ? null : (C2918a) this.f12560a.f24541r.get(0);
            C2922a.m7297a();
            C2922a.m7298a(c2918a);
            try {
                owghatSettingActivity = this.f12560a;
                Context context = this.f12560a;
                C2922a.m7297a();
                owghatSettingActivity.f24540q = new C4553a(context, C2922a.m7299b());
                this.f12560a.m21506g();
            } catch (JSONException e) {
                e.printStackTrace();
                this.f12560a.m21508i();
            }
        }
    }

    private class C6990a extends C6074f {
        final /* synthetic */ OwghatSettingActivity f19969a;

        public C6990a(OwghatSettingActivity owghatSettingActivity, Context context) {
            this.f19969a = owghatSettingActivity;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            super.mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1016:
                    return new C6952c(this.f19969a, this.f19969a, this.f16246b, viewGroup);
                case 1017:
                    return new C6952c(this.f19969a, this.f19969a, this.f16246b, viewGroup);
                case 5006:
                    return new C6961l(this.f19969a, this.f16246b, viewGroup, this.f19969a);
                case 11001:
                    return new C6991a(this.f19969a, this.f19969a, this.f16246b, viewGroup);
                case 11002:
                    return new C6991a(this.f19969a, this.f19969a, this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    private void m21506g() {
        C2480b.m6736b("list created");
        this.f24546w = false;
        this.f24547z = false;
        if (!(this.f24541r == null || r1.f24541r.size() <= 1 || r1.f24541r.get(1) == null)) {
            String str = ((C2918a) r1.f24541r.get(1)).f9083a;
            if (str != null) {
                r1.f24542s = Integer.parseInt(str);
            }
        }
        r1.f24542s--;
        if (r1.f24542s < 0) {
            r1.f24542s = 0;
        }
        if (C2925a.m7308a()) {
            try {
                C2922a.m7297a();
                ArrayList b = C2922a.m7299b();
                C2922a.m7297a();
                r1.f24543t = b.indexOf(C2922a.m7302f());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            r1.f24543t = -1;
        }
        boolean booleanValue = C2535a.m6888a().aj().booleanValue();
        List arrayList = new ArrayList();
        arrayList.add(new C7397a(C4522p.m8236a(R.string.select_province), r1.f24539p, r1.f24542s, 11002, 0));
        arrayList.add(new C7397a(C4522p.m8236a(R.string.select_city), r1.f24540q, r1.f24543t, 11001, 1));
        arrayList.add(new C7388m(C4522p.m8236a(R.string.notification), C4522p.m8236a(R.string.owghat_notification_description), booleanValue, 5006, 2));
        if (booleanValue) {
            Object[] objArr;
            String string;
            String a = C4522p.m8236a(R.string.select_prays_time_title);
            StringBuilder stringBuilder = new StringBuilder();
            char[] toCharArray = C2535a.m6888a().ak().toCharArray();
            if (toCharArray[C2920c.MorningPray.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.morning_prayer));
                stringBuilder.append(",");
            }
            if (toCharArray[C2920c.Sunrise.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.sunrise));
                stringBuilder.append(",");
            }
            if (toCharArray[C2920c.NoonPray.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.noon_prayer));
                stringBuilder.append(",");
            }
            if (toCharArray[C2920c.EveningPray.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.evening_prayer));
                stringBuilder.append(",");
            }
            if (toCharArray[C2920c.Sunset.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.sunset));
                stringBuilder.append(",");
            }
            if (toCharArray[C2920c.MidNight.ordinal()] == '1') {
                stringBuilder.append(C4522p.m8236a(R.string.mid_night));
                stringBuilder.append(",");
            }
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder.toString().length() > 0) {
                stringBuilder2 = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
            }
            arrayList.add(new C7379d(a, stringBuilder2, 1016, 3));
            int al = C2535a.m6888a().al();
            if (al < 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Math.abs(al));
                stringBuilder.append(" ");
                objArr = new Object[]{C4522p.m8236a(R.string.before)};
            } else if (al > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Math.abs(al));
                stringBuilder.append(" ");
                objArr = new Object[]{C4522p.m8236a(R.string.after)};
            } else {
                string = getString(R.string.pray_zero_diff);
                arrayList.add(new C7379d(C4522p.m8236a(R.string.select_prays_time_diff_title), string, 1017, 4));
            }
            stringBuilder.append(getString(R.string.pray_diff_time_string, objArr));
            string = stringBuilder.toString();
            arrayList.add(new C7379d(C4522p.m8236a(R.string.select_prays_time_diff_title), string, 1017, 4));
        }
        r1.f24536m.m13673a(arrayList);
    }

    private void m21507h() {
        C2480b.m6736b(" call get city list from local");
        if (C2925a.m7308a()) {
            C2922a.m7297a();
            this.f24541r = C2922a.m7300c();
            try {
                C2922a.m7297a();
                this.f24540q = new C4553a(this, C2922a.m7299b());
            } catch (JSONException e) {
                e.printStackTrace();
                m21508i();
            }
            m21506g();
            return;
        }
        m21508i();
    }

    private void m21508i() {
        C2480b.m6736b(" call get city list from server");
        C4501c.m8189a().m8191a(this, R.string.wait, false);
        C2808d.m7148b(new C6815a(Integer.toString(this.f24542s + 1)));
    }

    public final Dialog mo2299a(Bundle bundle) {
        Dialog a;
        Context context = this;
        switch (bundle.getInt("dialog_id")) {
            case 10001:
                C2535a.m6888a().m6919b().equalsIgnoreCase("fa");
                int al = C2535a.m6888a().al();
                new int[1][0] = al;
                C0663a c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                c0663a.f2211a.f2124f = c0663a.f2211a.f2119a.getText(R.string.select_prays_time_diff_title);
                View inflate = getLayoutInflater().inflate(R.layout.dialog_pray_number_picker, null);
                final NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.numberPicker1);
                numberPicker.setMinValue(-15);
                numberPicker.setMaxValue(15);
                numberPicker.setValue(al);
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                c0663a.m1609a(C4522p.m8236a(R.string.select_cap), new OnClickListener(context) {
                    final /* synthetic */ OwghatSettingActivity f12557b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2535a a = C2535a.m6888a();
                        a.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_PRAY_TIME_DIFF", numberPicker.getValue()).apply();
                        this.f12557b.m21506g();
                    }
                });
                a = c0663a.m1612a();
                break;
            case 10002:
                char[] toCharArray = C2535a.m6888a().ak().toCharArray();
                context.f24534A = new String[C2920c.values().length];
                context.f24535B = new boolean[C2920c.values().length];
                int i = 0;
                for (C2920c c2920c : C2920c.values()) {
                    if (c2920c == C2920c.MorningPray) {
                        context.f24534A[i] = C4522p.m8236a(R.string.morning_prayer);
                        context.f24535B[i] = toCharArray[i] == '1';
                    } else if (c2920c == C2920c.Sunrise) {
                        context.f24534A[i] = C4522p.m8236a(R.string.sunrise);
                        context.f24535B[i] = toCharArray[i] == '1';
                    } else if (c2920c == C2920c.NoonPray) {
                        context.f24534A[i] = C4522p.m8236a(R.string.noon_prayer);
                        context.f24535B[i] = toCharArray[i] == '1';
                    } else if (c2920c == C2920c.EveningPray) {
                        context.f24534A[i] = C4522p.m8236a(R.string.evening_prayer);
                        context.f24535B[i] = toCharArray[i] == '1';
                    } else if (c2920c == C2920c.Sunset) {
                        context.f24534A[i] = C4522p.m8236a(R.string.sunset);
                        context.f24535B[i] = toCharArray[i] == '1';
                    } else if (c2920c == C2920c.MidNight) {
                        context.f24534A[i] = C4522p.m8236a(R.string.mid_night);
                        context.f24535B[i] = toCharArray[i] == '1';
                    }
                    i++;
                }
                C0663a c0663a2 = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                CharSequence[] charSequenceArr = context.f24534A;
                boolean[] zArr = context.f24535B;
                OnMultiChoiceClickListener c45472 = new C45472(context);
                c0663a2.f2211a.f2137s = charSequenceArr;
                c0663a2.f2211a.f2113G = c45472;
                c0663a2.f2211a.f2109C = zArr;
                c0663a2.f2211a.f2110D = true;
                c0663a2.m1614b(C4522p.m8236a(R.string.cancel), null);
                c0663a2.m1609a(C4522p.m8236a(R.string.select_cap), new C45483(context));
                a = c0663a2.m1612a();
                break;
            default:
                return null;
        }
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public final void mo3689a(int i, int i2) {
        boolean z = true;
        if (!this.f24546w) {
            this.f24546w = true;
        } else if (!this.f24547z) {
            this.f24547z = true;
        } else if (i2 == 11002) {
            C2480b.m6736b("Spinner item selected province");
            if (i != this.f24545v) {
                this.f24545v = this.f24542s;
                this.f24542s = i;
                if (C2474a.m6718b(MyApplication.m12952b())) {
                    m21508i();
                } else {
                    Snackbar.m8770a(findViewById(16908290), C4522p.m8236a(R.string.connection_error_message), 0).m572a();
                }
                m21506g();
            }
        } else {
            if (i2 == 11001) {
                C2480b.m6736b("Spinner item selected city");
                this.f24544u = this.f24543t;
                this.f24543t = i;
                if (!(this.f24543t == this.f24544u || this.f24541r == null || this.f24541r.size() <= 0)) {
                    C2918a c2918a = (C2918a) this.f24541r.get(i);
                    C2922a.m7297a();
                    C2922a.m7298a(c2918a);
                    if (c2918a == null) {
                        z = false;
                    }
                    C2535a.m6888a().m6978w(z);
                    C2933d.m7313a();
                    C2933d.m7317b();
                    C2933d a = C2933d.m7313a();
                    C2922a.m7297a();
                    a.m7318a(C2922a.m7303g());
                    m21506g();
                }
            }
        }
    }

    public final void mo3690a(int i, boolean z) {
        if (i == 5006) {
            C2535a.m6888a().m6978w(z);
            C2933d a = C2933d.m7313a();
            C2922a.m7297a();
            a.m7318a(C2922a.m7303g());
            C2933d.m7313a();
            C2933d.m7315a(z);
            m21506g();
        }
    }

    public final void mo2234c(int i) {
        Bundle bundle;
        switch (this.f24536m.m13671a(i).f19503j) {
            case 1016:
                bundle = new Bundle();
                bundle.putInt("dialog_id", 10002);
                b_(bundle);
                return;
            case 1017:
                bundle = new Bundle();
                bundle.putInt("dialog_id", 10001);
                b_(bundle);
                return;
            default:
                return;
        }
    }

    public final void mo2235d(int i) {
    }

    public void onBackPressed() {
        C2922a.m7297a();
        if (C2922a.m7303g() != null) {
            getSystemService("activity");
            Intent intent = new Intent(this, OwghatActivity.class);
            intent.addFlags(335544320);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            finish();
            return;
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_owghat_setting);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.y = findViewById(R.id.shadow_line_top);
        this.f24538o = (LinearLayout) findViewById(R.id.root_linearLayout);
        this.f24536m = new C6990a(this, this);
        this.f24537n = (RecyclerView) findViewById(R.id.recycler_view);
        if (this.f24537n != null) {
            this.f24537n.setHasFixedSize(true);
            this.f24537n.setAdapter(this.f24536m);
            this.f24537n.setLayoutManager(new LinearLayoutManager(this));
        }
        C2922a.m7297a();
        this.f24541r = C2922a.m7300c();
        this.f24539p = new C4553a(this, C2922a.m7297a().m7306d());
        this.f24545v = -1;
        this.f24542s = 0;
        this.f24544u = -1;
        this.f24543t = 0;
        m21507h();
        try {
            C2922a.m7297a();
            this.f24540q = new C4553a(this, C2922a.m7299b());
        } catch (JSONException e) {
            e.printStackTrace();
            m21507h();
        }
        m21506g();
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.action_religious_prayers_settings));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6796a(this.f24538o, UIThemeManager.getmInstance().getRecycler_view_background_color());
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_owghat_setting_activity, menu);
        MenuItem findItem = menu.findItem(R.id.action_owghat_settings_accept);
        findItem.setTitle(getString(R.string.accept));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C6009a c6009a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ OwghatSettingActivity f12562b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (c6009a.f8890a == C2775a.JSON_EXCEPTION) {
                    this.f12562b.m21508i();
                    return;
                }
                Snackbar.m8770a(this.f12562b.findViewById(16908290), C4522p.m8236a(R.string.error_in_get_city_list), 0).m572a();
                this.f12562b.m21506g();
            }
        });
    }

    public void onEvent(C2923b c2923b) {
        runOnUiThread(new C45494(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            return true;
        } else if (itemId != R.id.action_owghat_settings_accept) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    protected void onResume() {
        super.onResume();
    }
}
