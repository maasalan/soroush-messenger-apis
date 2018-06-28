package mobi.mmdt.ott.view.conversation.p424b.p426b;

import android.app.Activity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;

public final class C3403b {
    public FrameLayout f10429a;
    public TextView f10430b;
    public long f10431c = 0;
    public C3400a f10432d;
    public CountDownTimer f10433e;
    public C3402a f10434f = C3402a.NOT_START;

    class C34011 extends CountDownTimer {
        final /* synthetic */ Activity f10423a;
        final /* synthetic */ C3403b f10424b;

        public C34011(C3403b c3403b, Activity activity) {
            this.f10424b = c3403b;
            this.f10423a = activity;
            super(302000, 1000);
        }

        public final void onFinish() {
        }

        public final void onTick(long j) {
            int i = (int) (j / 1000);
            int i2 = (302 - i) - 1;
            C3403b c3403b = this.f10424b;
            long j2 = (long) i2;
            c3403b.f10430b.setText(C2491i.m6774a(this.f10423a, 1000 * j2, false));
            c3403b.f10431c = j2;
            if (i == 1) {
                this.f10424b.m7848b();
            }
        }
    }

    public enum C3402a {
        NOT_START,
        RECORDING,
        FINISHED
    }

    public C3403b(View view, C3400a c3400a) {
        this.f10432d = c3400a;
        this.f10429a = (FrameLayout) view.findViewById(R.id.ptt_layout);
        this.f10429a.setAlpha(0.0f);
        C2491i.m6796a(this.f10429a, UIThemeManager.getmInstance().getRecycler_view_background_color());
        this.f10430b = (TextView) view.findViewById(R.id.record_length_textView);
        C2491i.m6784a(UIThemeManager.getmInstance().getText_secondary_color(), this.f10430b);
    }

    public final void m7847a() {
        if (this.f10433e != null) {
            this.f10433e.cancel();
        }
        this.f10432d.mo2295A();
    }

    public final void m7848b() {
        if (this.f10433e != null) {
            this.f10433e.cancel();
        }
        this.f10432d.mo2296B();
    }
}
