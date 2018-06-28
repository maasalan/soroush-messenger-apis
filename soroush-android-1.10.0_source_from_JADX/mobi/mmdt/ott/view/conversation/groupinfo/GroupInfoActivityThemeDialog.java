package mobi.mmdt.ott.view.conversation.groupinfo;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;

public class GroupInfoActivityThemeDialog extends GroupInfoActivity {
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
        int b2;
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
        getWindow().setAttributes(attributes);
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) findViewById(R.id.root_layout)).getLayoutParams();
        LayoutParams attributes2 = getWindow().getAttributes();
        if (getResources().getConfiguration().orientation == 1) {
            attributes2.width = C2489g.m6754a().m6755a(0.6666667f);
            b2 = C2489g.m6754a().m6756b(0.625f);
        } else {
            attributes2.width = C2489g.m6754a().m6755a(0.8f);
            b2 = C2489g.m6754a().m6756b(0.6666667f);
        }
        attributes2.height = b2;
        layoutParams.height = (int) (((float) (attributes2.height - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
        if (getResources().getConfiguration().orientation == 2) {
            attributes2 = getWindow().getAttributes();
            attributes2.width = C2489g.m6754a().m6755a(0.8f);
            attributes2.height = C2489g.m6754a().m6756b(0.6666667f);
            layoutParams.width = attributes2.width;
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
