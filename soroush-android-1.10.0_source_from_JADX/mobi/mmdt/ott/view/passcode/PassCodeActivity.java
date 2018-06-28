package mobi.mmdt.ott.view.passcode;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C7249g;
import android.view.View;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.ChangeBackgroundConversationActivity.C4386a;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public class PassCodeActivity extends C7576b {
    private boolean f24403m;
    private C6246b f24404n;

    private boolean m21328g() {
        return (getIntent() == null || getIntent().getExtras() == null) ? false : true;
    }

    public void onBackPressed() {
        if (this.f24403m) {
            if (this.f24404n != null && this.f24404n.f16920a) {
                C2535a.m6888a().m6931d("");
                C2535a.m6888a().m6959n(false);
            }
            super.onBackPressed();
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            return;
        }
        C4258b.m8066a(this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 16) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(0);
        }
        MyApplication.m12950a().f15902Q = true;
        if (C2535a.m6888a().m6977w().isEmpty()) {
            String v = C2535a.m6888a().m6975v();
            if (!v.isEmpty()) {
                if (C2491i.m6831d(v.substring(0, 1))) {
                    v = C2491i.m6826c(v);
                }
                C2555a.m6994a(C2535a.m6888a().m6928d());
                C2555a.m6995a(v, new byte[16]);
                C2535a.m6888a().m6936e(C2555a.f8313b);
                C2535a.m6888a().m6931d("");
            }
        }
        bundle = new Bundle();
        if (m21328g()) {
            if (getIntent().getExtras().containsKey("FROM_SETTING")) {
                this.f24403m = getIntent().getExtras().getBoolean("FROM_SETTING");
                bundle.putBoolean("KEY_BUNDLE_FROM_SETTING", this.f24403m);
            }
            if (getIntent().getExtras().containsKey("KEY_ENTER_WITH_TIMER")) {
                bundle.putBoolean("KEY_BUNDLE_ENTER_FROM_TIMER", getIntent().getExtras().getBoolean("KEY_ENTER_WITH_TIMER"));
            }
            if (getIntent().getExtras().containsKey("KEY_ENTER_FROM_NOTIFICATION")) {
                bundle.putBoolean("KEY_BUNDLE_ENTER_FROM_NOTIFICATION", getIntent().getExtras().getBoolean("KEY_ENTER_FROM_NOTIFICATION"));
            }
        }
        setContentView((int) R.layout.activity_pincode);
        if (m21328g()) {
            if (getIntent().getExtras().containsKey("SET_MODE")) {
                bundle.putBoolean("KEY_BUNDLE_IS_SET_MODE", getIntent().getExtras().getBoolean("SET_MODE"));
            }
            if (getIntent().getExtras().containsKey("KEY_IS_CHANGE_MODE")) {
                bundle.putBoolean("KEY_BUNDLE_IS_UPDATE_MODE", getIntent().getExtras().getBoolean("KEY_IS_CHANGE_MODE"));
            }
            if (getIntent().getExtras().containsKey("KEY_ENTER_FROM_SCREEN_TURN_ON")) {
                bundle.putBoolean("KEY_BUNDLE_ENTER_FROM_SCREEN_TURN_ON", getIntent().getExtras().getBoolean("KEY_ENTER_FROM_SCREEN_TURN_ON"));
            }
        }
        View view = (ImageView) findViewById(R.id.bg_image);
        if (view != null) {
            C4507a.m8206a((Activity) this, view, true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        int I = C2535a.m6888a().m6897I();
        if (I == C4386a.select_color.ordinal()) {
            I = C2535a.m6888a().m6895F();
            imageView.setImageBitmap(null);
            imageView.setBackgroundColor(I);
        } else if (I == C4386a.galley_image.ordinal() || I == C4386a.web_service_image.ordinal()) {
            Object G = C2535a.m6888a().m6896G();
            if (G != null) {
                C1212c.m2873a((C7249g) this).m10950a(G).m3031a(imageView);
            }
        }
        this.f24404n = new C6246b();
        this.f24404n.setArguments(bundle);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24404n);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
    }

    protected void onDestroy() {
        super.onDestroy();
        MyApplication.m12950a().f15902Q = false;
    }
}
