package mobi.mmdt.ott.view.channel;

import android.os.Bundle;
import android.support.v7.app.C0662a;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;

public class ChannelInfoActivityThemeDialog extends ChannelInfoActivity {
    private int f24818A;
    private int f24819z;

    protected final void mo3698k() {
        this.v = 0.4d;
        this.w = 0.4d;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
    }

    public void onCreate(Bundle bundle) {
        int b;
        super.onCreate(bundle);
        getWindow().setFlags(32, 32);
        getWindow().setFlags(262144, 262144);
        getWindow().setSoftInputMode(3);
        LayoutParams attributes = getWindow().getAttributes();
        if (getResources().getConfiguration().orientation == 1) {
            attributes.width = C2489g.m6754a().m6755a(0.6666667f);
            b = C2489g.m6754a().m6756b(0.625f);
        } else {
            attributes.width = C2489g.m6754a().m6755a(0.8f);
            b = C2489g.m6754a().m6756b(0.6666667f);
        }
        attributes.height = b;
        this.f24819z = attributes.width;
        this.f24818A = attributes.height;
        getWindow().setAttributes(attributes);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root_layout);
        ViewGroup.LayoutParams layoutParams = null;
        if (relativeLayout != null) {
            layoutParams = relativeLayout.getLayoutParams();
        }
        if (layoutParams != null) {
            int b2;
            attributes = getWindow().getAttributes();
            if (getResources().getConfiguration().orientation == 1) {
                attributes.width = C2489g.m6754a().m6755a(0.6666667f);
                b2 = C2489g.m6754a().m6756b(0.625f);
            } else {
                attributes.width = C2489g.m6754a().m6755a(0.8f);
                b2 = C2489g.m6754a().m6756b(0.6666667f);
            }
            attributes.height = b2;
            this.f24819z = attributes.width;
            this.f24818A = attributes.height;
            layoutParams.height = (int) (((float) (this.f24818A - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                attributes = getWindow().getAttributes();
                attributes.width = C2489g.m6754a().m6755a(0.8f);
                attributes.height = C2489g.m6754a().m6756b(0.6666667f);
                this.f24819z = attributes.width;
                this.f24818A = attributes.height;
                layoutParams.width = this.f24819z;
            }
        }
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C0662a a = m19694f().mo457a();
        if (a != null) {
            a.mo482e();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (4 != motionEvent.getAction()) {
            return super.onTouchEvent(motionEvent);
        }
        finish();
        overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
        return true;
    }
}
