package mobi.mmdt.ott.view.vas.owghat;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import cn.iwgang.countdownview.CountdownView;
import cn.iwgang.countdownview.CountdownView.C0957a;
import cn.iwgang.countdownview.CountdownView.C50501;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2919b;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.logic.vas.pray.p378d.C2925a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2930a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2931b;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2933d;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2935e;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public class OwghatActivity extends C7576b implements C3101a {
    private ImageView f24510A;
    private ImageView f24511B;
    private ImageView f24512C;
    private ImageView f24513D;
    private ImageView f24514E;
    private ImageView f24515F;
    private TextView f24516G;
    private ImageView f24517H;
    private TextView f24518I;
    private TextView f24519J;
    private TextView f24520K;
    private CountdownView f24521L;
    private TextView f24522m;
    private TextView f24523n;
    private TextView f24524o;
    private TextView f24525p;
    private TextView f24526q;
    private TextView f24527r;
    private TextView f24528s;
    private TextView f24529t;
    private TextView f24530u;
    private TextView f24531v;
    private TextView f24532w;
    private TextView f24533z;

    class C62781 implements C0957a {
        final /* synthetic */ OwghatActivity f17135a;

        C62781(OwghatActivity owghatActivity) {
            this.f17135a = owghatActivity;
        }

        public final void mo2437a() {
            this.f17135a.m21496g();
        }
    }

    private static String m21494a(String str) {
        return C2535a.m6888a().m6919b().equalsIgnoreCase("fa") ? C2491i.m6814b(str) : str;
    }

    private void m21496g() {
        C2920c c2920c;
        Calendar instance = Calendar.getInstance();
        C2933d.m7313a();
        C2922a.m7297a();
        Map b = C2933d.m7316b(C2922a.m7303g());
        TextView textView = this.f24522m;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.MorningPray))));
        textView = this.f24523n;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.Sunrise))));
        textView = this.f24524o;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.NoonPray))));
        textView = this.f24525p;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.Sunset))));
        textView = this.f24526q;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.EveningPray))));
        textView = this.f24527r;
        C2933d.m7313a();
        textView.setText(m21494a(C2933d.m7312a((C2931b) b.get(C2920c.MidNight))));
        textView = this.f24516G;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C4522p.m8236a(R.string.pray_time_header));
        stringBuilder.append(" ");
        C2922a.m7297a();
        stringBuilder.append(C2922a.m7302f());
        textView.setText(stringBuilder.toString());
        this.f24519J.setText(C4522p.m8236a(R.string.religious_prayers));
        this.x.setTitle((CharSequence) "");
        C2933d a = C2933d.m7313a();
        C2922a.m7297a();
        C2919b g = C2922a.m7303g();
        Calendar instance2 = Calendar.getInstance();
        C2931b c2931b = new C2931b(instance2.get(11), instance2.get(12));
        if (g != null) {
            if (a.f9139a == null) {
                a.f9139a = new C2935e(C2930a.Tehran);
            }
            a.f9140b = a.f9139a.m7325a(new Date(), g);
            if (((C2931b) a.f9140b.get(C2920c.MidNight)).m7311a() <= c2931b.m7311a() || ((C2931b) a.f9140b.get(C2920c.MidNight)).m7311a() >= ((C2931b) a.f9140b.get(C2920c.MorningPray)).m7311a()) {
                if (((C2931b) a.f9140b.get(C2920c.MorningPray)).m7311a() <= c2931b.m7311a()) {
                    if (((C2931b) a.f9140b.get(C2920c.Sunrise)).m7311a() > c2931b.m7311a()) {
                        c2920c = C2920c.Sunrise;
                    } else if (((C2931b) a.f9140b.get(C2920c.NoonPray)).m7311a() > c2931b.m7311a()) {
                        c2920c = C2920c.NoonPray;
                    } else if (((C2931b) a.f9140b.get(C2920c.Sunset)).m7311a() > c2931b.m7311a()) {
                        c2920c = C2920c.Sunset;
                    } else if (((C2931b) a.f9140b.get(C2920c.EveningPray)).m7311a() > c2931b.m7311a()) {
                        c2920c = C2920c.EveningPray;
                    } else {
                        if (((C2931b) a.f9140b.get(C2920c.MidNight)).m7311a() <= c2931b.m7311a()) {
                            if (((C2931b) a.f9140b.get(C2920c.MidNight)).m7311a() < ((C2931b) a.f9140b.get(C2920c.MorningPray)).m7311a()) {
                            }
                        }
                        c2920c = C2920c.MidNight;
                    }
                }
            }
            c2920c = C2920c.MorningPray;
        } else {
            c2920c = null;
        }
        String a2 = C2925a.m7307a(c2920c);
        TextView textView2 = this.f24518I;
        Object[] objArr = new Object[2];
        objArr[0] = a2;
        C2922a.m7297a();
        objArr[1] = C2922a.m7302f();
        textView2.setText(getString(R.string.remind_pray_time_header, objArr));
        C2931b c2931b2 = (C2931b) b.get(c2920c);
        instance.set(11, c2931b2.f9133a);
        instance.set(12, c2931b2.f9134b);
        instance.set(13, 0);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(instance.getTimeInMillis());
        stringBuilder2.append(" - ");
        stringBuilder2.append(System.currentTimeMillis() - instance.getTimeInMillis());
        C2480b.m6732a(stringBuilder2.toString());
        long timeInMillis = instance.getTimeInMillis() - System.currentTimeMillis();
        long j = timeInMillis < 0 ? 86400000 + timeInMillis : timeInMillis;
        CountdownView countdownView = this.f24521L;
        if (j > 0) {
            long j2;
            countdownView.f3063c = 0;
            if (countdownView.f3062b != null) {
                countdownView.f3062b.m2417c();
                countdownView.f3062b = null;
            }
            if (countdownView.f3061a.f3104j) {
                j2 = 10;
                countdownView.m2396a(j);
            } else {
                j2 = 1000;
            }
            countdownView.f3062b = new C50501(countdownView, j, j2);
            countdownView.f3062b.m2416b();
        }
        this.f24521L.setOnCountdownEndListener(new C62781(this));
    }

    public final Dialog mo2299a(Bundle bundle) {
        return null;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_owghat);
        C2922a.m7297a();
        if (C2922a.m7303g() == null) {
            finish();
            C4478a.m8168e(this);
            return;
        }
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.x.setTitle((CharSequence) "");
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.y = findViewById(R.id.shadow_line_top);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.religious_prayers));
        C4507a.m8206a((Activity) this, findViewById(R.id.image_bg), false);
        this.f24522m = (TextView) findViewById(R.id.tv_moorning_pray);
        this.f24523n = (TextView) findViewById(R.id.tv_sunrise);
        this.f24524o = (TextView) findViewById(R.id.tv_noon_pray);
        this.f24525p = (TextView) findViewById(R.id.tv_sunset);
        this.f24526q = (TextView) findViewById(R.id.tv_evenning_pray);
        this.f24527r = (TextView) findViewById(R.id.tv_mid_night);
        this.f24528s = (TextView) findViewById(R.id.tv_moorning_pray_title);
        this.f24529t = (TextView) findViewById(R.id.tv_sunrise_title);
        this.f24530u = (TextView) findViewById(R.id.tv_noon_pray_title);
        this.f24531v = (TextView) findViewById(R.id.tv_sunset_title);
        this.f24532w = (TextView) findViewById(R.id.tv_evenning_pray_title);
        this.f24533z = (TextView) findViewById(R.id.tv_mid_night_title);
        this.f24510A = (ImageView) findViewById(R.id.tv_moorning_pray_icon);
        this.f24511B = (ImageView) findViewById(R.id.tv_sunrise_icon);
        this.f24512C = (ImageView) findViewById(R.id.tv_noon_pray_icon);
        this.f24513D = (ImageView) findViewById(R.id.tv_sunset_icon);
        this.f24514E = (ImageView) findViewById(R.id.tv_evenning_pray_icon);
        this.f24515F = (ImageView) findViewById(R.id.tv_mid_night_icon);
        this.f24516G = (TextView) findViewById(R.id.tv_owghat_title);
        this.f24517H = (ImageView) findViewById(R.id.tv_owghat_title_icon);
        this.f24521L = (CountdownView) findViewById(R.id.timerCounter);
        this.f24518I = (TextView) findViewById(R.id.tv_remind_pray_header);
        this.f24519J = (TextView) this.x.findViewById(R.id.title_toolbar_textView);
        this.f24520K = (TextView) findViewById(R.id.tv_owghat_date);
        this.f24520K.setText(C2491i.m6813b(MyApplication.m12952b(), System.currentTimeMillis(), C2535a.m6888a().m6919b()));
        m21496g();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6802a(this.f24519J, UIThemeManager.getmInstance().getSubtitle_toolbar_color());
        C2491i.m6801a(this.f24517H, UIThemeManager.getmInstance().getText_primary_color());
        m20726u();
        C2922a.m7297a();
        C2922a.m7301e();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_owghat_activity, menu);
        MenuItem findItem = menu.findItem(R.id.action_owghat_settings);
        findItem.setTitle(C4522p.m8236a(R.string.action_religious_prayers_settings));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_owghat_settings) {
            C4478a.m8168e(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        C2922a.m7297a();
        if (C2922a.m7303g() == null) {
            finish();
        } else {
            m21496g();
        }
    }
}
