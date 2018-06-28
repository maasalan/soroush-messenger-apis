package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;

public final class C4157b {

    static class C41451 implements OnClickListener {
        final /* synthetic */ Activity f11835a;

        C41451(Activity activity) {
            this.f11835a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == R.id.action_invite) {
                Activity activity = this.f11835a;
                C4522p.m8236a(R.string.invite_msg);
                C4533r.m8255a(activity);
            } else if (i == R.id.action_new_contact) {
                C2491i.m6827c(this.f11835a);
                this.f11835a.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            } else if (i == R.id.action_sync_contact) {
                C4258b.m8065a();
                Toast.makeText(this.f11835a, C4522p.m8236a(R.string.syncing_contacts), 0).show();
            }
        }
    }
}
