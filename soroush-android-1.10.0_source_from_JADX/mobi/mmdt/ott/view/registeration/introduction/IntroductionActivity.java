package mobi.mmdt.ott.view.registeration.introduction;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v13.app.C4760b;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0523f;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.registeration.introduction.C6248a.C4308a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.PhoneAndCountryActivity;
import mobi.mmdt.ott.view.tools.C4522p;

public class IntroductionActivity extends C7576b implements C4308a {
    private static boolean f24415u = false;
    private ViewPager f24416m;
    private LinearLayout f24417n;
    private C6248a f24418o;
    private C6248a f24419p;
    private C6248a f24420q;
    private C6248a f24421r;
    private int f24422s = 0;
    private StringBuilder f24423t = new StringBuilder();

    class C43041 implements OnClickListener {
        final /* synthetic */ IntroductionActivity f12124a;

        C43041(IntroductionActivity introductionActivity) {
            this.f12124a = introductionActivity;
        }

        public final void onClick(View view) {
            if (this.f12124a.f24416m != null) {
                IntroductionActivity.m21349b(this.f12124a);
                IntroductionActivity.m21350c(this.f12124a);
            }
        }
    }

    class C43052 implements OnClickListener {
        final /* synthetic */ IntroductionActivity f12125a;

        C43052(IntroductionActivity introductionActivity) {
            this.f12125a = introductionActivity;
        }

        public final void onClick(View view) {
            if (this.f12125a.f24416m != null) {
                this.f12125a.f24416m.m1154a(3, true);
            }
        }
    }

    class C43064 implements Runnable {
        final /* synthetic */ IntroductionActivity f12126a;

        C43064(IntroductionActivity introductionActivity) {
            this.f12126a = introductionActivity;
        }

        public final void run() {
            this.f12126a.finish();
        }
    }

    class C62473 implements C0523f {
        final /* synthetic */ IntroductionActivity f16949a;

        C62473(IntroductionActivity introductionActivity) {
            this.f16949a = introductionActivity;
        }

        public final void mo173a(int i) {
        }

        public final void mo174a(int i, float f, int i2) {
        }

        public final void mo175b(int i) {
            this.f16949a.f24422s = this.f16949a.f24422s + 1;
            this.f16949a.f24423t.append(i);
            this.f16949a.m21352d(i);
        }
    }

    private class C6945a extends C4760b {
        final /* synthetic */ IntroductionActivity f19832a;

        private C6945a(IntroductionActivity introductionActivity, FragmentManager fragmentManager) {
            this.f19832a = introductionActivity;
            super(fragmentManager);
        }

        public final Fragment mo3253a(int i) {
            switch (i) {
                case 0:
                    return this.f19832a.f24418o;
                case 1:
                    return this.f19832a.f24421r;
                case 2:
                    return this.f19832a.f24419p;
                case 3:
                    return this.f19832a.f24420q;
                default:
                    return this.f19832a.f24418o;
            }
        }

        public final int mo2270b() {
            return 4;
        }
    }

    private static C6248a m21347a(int i, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_IMAGE", i);
        bundle.putString("KEY_TITLE", str);
        bundle.putString("KEY_DESCRIPTION", str2);
        bundle.putString("KEY_FRAGMENT_TYPE", str3);
        C6248a c6248a = new C6248a();
        c6248a.setArguments(bundle);
        return c6248a;
    }

    static /* synthetic */ void m21349b(IntroductionActivity introductionActivity) {
        String stringBuilder = introductionActivity.f24423t.toString();
        int i = introductionActivity.f24422s;
        Bundle bundle = new Bundle();
        bundle.putString("steps", stringBuilder);
        bundle.putInt("steps_count", i);
        MyApplication.m12950a().m12957a("start_chat", bundle);
        if (f24415u) {
            stringBuilder = C2535a.m6888a().m6919b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("selected_language", stringBuilder);
            MyApplication.m12950a().m12957a("change_default_language", bundle2);
        }
        introductionActivity.startActivity(new Intent(introductionActivity.getApplicationContext(), PhoneAndCountryActivity.class));
    }

    static /* synthetic */ void m21350c(IntroductionActivity introductionActivity) {
        introductionActivity.finish();
        introductionActivity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    private void m21352d(int i) {
        if (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                ((ImageView) this.f24417n.getChildAt(i2)).setColorFilter(C0346c.m687c(this, i2 == i ? R.color.color_current_circle : R.color.color_not_current_circle));
                i2++;
            }
        }
    }

    public final void mo3677c(int i) {
        f24415u = true;
        String str = "en-us";
        switch (i) {
            case 1:
                str = "fa";
                break;
            case 2:
                str = "en-us";
                break;
            default:
                break;
        }
        MyApplication.m12950a().m12959b(str);
        Intent intent = getIntent();
        new Handler().postDelayed(new C43064(this), 300);
        startActivity(intent);
        switch (i) {
            case 1:
                overridePendingTransition(R.anim.anim_slide_in_up, R.anim.anim_slide_out_up);
                return;
            case 2:
                overridePendingTransition(R.anim.anim_slide_in_up, R.anim.anim_slide_out_up);
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        if (this.f24416m.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            this.f24416m.setCurrentItem(this.f24416m.getCurrentItem() - 1);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
        }
        setContentView((int) R.layout.activity_introduction);
        this.f24418o = m21347a(R.drawable.intro_soroush, C4522p.m8236a(R.string.introduction_welcome_title), C4522p.m8236a(R.string.introduction_welcome_description), "1");
        this.f24421r = m21347a(R.drawable.intro_cost, C4522p.m8236a(R.string.introduction_cost_title), C4522p.m8236a(R.string.introduction_cost_description), null);
        this.f24419p = m21347a(R.drawable.intro_channel, C4522p.m8236a(R.string.introduction_channel_title), C4522p.m8236a(R.string.introduction_channel_description), null);
        this.f24420q = m21347a(R.drawable.intro_call, C4522p.m8236a(R.string.introduction_call_title), C4522p.m8236a(R.string.introduction_call_description), null);
        TextView textView = (TextView) findViewById(R.id.enter);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.skip);
        appCompatButton.setText(C4522p.m8236a(R.string.skip_text));
        textView.setOnClickListener(new C43041(this));
        appCompatButton.setOnClickListener(new C43052(this));
        this.f24416m = (ViewPager) findViewById(R.id.pager);
        this.f24416m.setAdapter(new C6945a(getFragmentManager()));
        this.f24416m.setOffscreenPageLimit(5);
        this.f24416m.m1155a(new C62473(this));
        this.f24417n = (LinearLayout) LinearLayout.class.cast(findViewById(R.id.circles));
        int i = (int) ((BallPulseIndicator.SCALE * getResources().getDisplayMetrics().density) + 0.5f);
        for (int i2 = 0; i2 < 4; i2++) {
            View imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.ic_swipe_indicator_white_18dp);
            imageView.setLayoutParams(new LayoutParams(-2, -2));
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(i, 0, i, 0);
            this.f24417n.addView(imageView);
        }
        m21352d(0);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f24416m != null) {
            ViewPager viewPager = this.f24416m;
            if (viewPager.f1776d != null) {
                viewPager.f1776d.clear();
            }
        }
    }
}
