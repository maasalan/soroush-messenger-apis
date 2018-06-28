package mobi.mmdt.ott.view.main.soroushcharge;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.ai.p274a.p275a.C2620a;
import mobi.mmdt.ott.view.components.p402d.C7576b;

public class SoroushChargeActivity extends C7576b {

    class C42271 implements Runnable {
        final /* synthetic */ SoroushChargeActivity f11989a;

        C42271(SoroushChargeActivity soroushChargeActivity) {
            this.f11989a = soroushChargeActivity;
        }

        public final void run() {
            Toast.makeText(C7576b.m20720x(), "testmessage", 0).show();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_soroush_charge);
        m20725t();
    }

    public void onEvent(C2620a c2620a) {
        runOnUiThread(new C42271(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
