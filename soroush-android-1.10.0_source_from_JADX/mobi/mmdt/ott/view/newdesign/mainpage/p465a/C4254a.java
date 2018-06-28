package mobi.mmdt.ott.view.newdesign.mainpage.p465a;

import android.content.res.ColorStateList;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public final class C4254a {
    public FloatingActionButton f12026a;

    public C4254a(View view) {
        this.f12026a = (FloatingActionButton) view.findViewById(R.id.fab);
        C0273d c0273d = (C0273d) this.f12026a.getLayoutParams();
        this.f12026a.setLayoutParams(c0273d);
        this.f12026a.setBackgroundTintList(ColorStateList.valueOf(UIThemeManager.getmInstance().getAccent_color()));
        this.f12026a.setRippleColor(UIThemeManager.getmInstance().getFab_ripple_color());
    }

    public final void m8057a() {
        this.f12026a.animate().translationY((float) (this.f12026a.getHeight() + PacketWriter.QUEUE_SIZE)).setInterpolator(new AccelerateInterpolator()).start();
    }

    public final void m8058a(int i) {
        this.f12026a.setImageResource(i);
    }

    public final void m8059a(OnClickListener onClickListener) {
        this.f12026a.setOnClickListener(onClickListener);
    }

    public final void m8060b() {
        this.f12026a.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator()).start();
    }
}
