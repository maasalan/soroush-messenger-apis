package mobi.mmdt.ott.view.stickermarket;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager.LayoutParams;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.ott.R;

public class StickerDetailsActivityThemeDialog extends StickerDetailsActivity {
    private static int f24804m;
    private static int f24805n;

    public static int m22068g() {
        return f24804m;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
    }

    public void onCreate(Bundle bundle) {
        C2489g a;
        super.onCreate(bundle);
        getWindow().setFlags(32, 32);
        getWindow().setFlags(262144, 262144);
        getWindow().setSoftInputMode(3);
        LayoutParams attributes = getWindow().getAttributes();
        float f = 0.6666667f;
        if (getResources().getConfiguration().orientation == 1) {
            attributes.width = C2489g.m6754a().m6755a(0.6666667f);
            a = C2489g.m6754a();
            f = 0.625f;
        } else {
            attributes.width = C2489g.m6754a().m6755a(0.8f);
            a = C2489g.m6754a();
        }
        attributes.height = a.m6756b(f);
        f24804m = attributes.width;
        f24805n = attributes.height;
        getWindow().setAttributes(attributes);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m19694f().mo457a().mo482e();
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
